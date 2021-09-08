grammar Solidity;


options { tokenVocab=SolidityLexer; }

sourceUnit: (
	pragmaDirective
	| importDirective
	| contractDefinition
	| interfaceDefinition
	| libraryDefinition
	| functionDefinition
	| constantVariableDeclaration
	| structDefinition
	| enumDefinition
	| errorDefinition
	| importDirective
    | contractDefinition
    | enumDefinition
    | structDefinition
    | functionDefinition
    | fileLevelConstant
    | customErrorDefinition
)* EOF;



fileLevelConstant
  : typeName ConstantKeyword identifier '=' expression ';' ;

customErrorDefinition
  : 'error' identifier parameterList ';' ;

AnonymousKeyword : 'anonymous' ;
BreakKeyword : 'break' ;
ConstantKeyword : 'constant' ;
ImmutableKeyword : 'immutable' ;
ContinueKeyword : 'continue' ;
LeaveKeyword : 'leave' ;
ExternalKeyword : 'external' ;
IndexedKeyword : 'indexed' ;
InternalKeyword : 'internal' ;
PayableKeyword : 'payable' ;
PrivateKeyword : 'private' ;
PublicKeyword : 'public' ;
VirtualKeyword : 'virtual' ;
PureKeyword : 'pure' ;
TypeKeyword : 'type' ;
ViewKeyword : 'view' ;

pragmaDirective: Pragma PragmaToken+ PragmaSemicolon;

importDirective:
	Import (
		(path (As unitAlias=identifier)?)
		| (symbolAliases From path)
		| (Mul As unitAlias=identifier From path)
	) Semicolon;

importAliases: symbol=identifier (As alias=identifier)?;
/**
 * Path of a file to be imported.
 */
path: NonEmptyStringLiteral;
/**
 * List of aliases for symbols to be imported.
 */
symbolAliases: LBrace aliases+=importAliases (Comma aliases+=importAliases)* RBrace;

/**
 * Top-level definition of a contract.
 */
contractDefinition:
	Abstract? Contract name=identifier
	inheritanceSpecifierList?
	LBrace contractBodyElement* RBrace;
/**
 * Top-level definition of an interface.
 */
interfaceDefinition:
	Interface name=identifier
	inheritanceSpecifierList?
	LBrace contractBodyElement* RBrace;
/**
 * Top-level definition of a library.
 */
libraryDefinition: Library name=identifier LBrace contractBodyElement* RBrace;

//@doc:inline
inheritanceSpecifierList:
	Is inheritanceSpecifiers+=inheritanceSpecifier
	(Comma inheritanceSpecifiers+=inheritanceSpecifier)*?;
/**
 * Inheritance specifier for contracts and interfaces.
 * Can optionally supply base constructor arguments.
 */
inheritanceSpecifier: name=identifierPath arguments=callArgumentList?;

/**
 * Declarations that can be used in contracts, interfaces and libraries.
 *
 * Note that interfaces and libraries may not contain constructors, interfaces may not contain state variables
 * and libraries may not contain fallback, receive functions nor non-constant state variables.
 */
contractBodyElement:
	constructorDefinition
	| functionDefinition
	| modifierDefinition
	| fallbackFunctionDefinition
	| receiveFunctionDefinition
	| structDefinition
	| enumDefinition
	| stateVariableDeclaration
	| eventDefinition
	| errorDefinition
	| usingDirective;
//@doc:inline
namedArgument: name=identifier Colon value=expression;
/**
 * Arguments when calling a function or a similar callable object.
 * The arguments are either given as comma separated list or as map of named arguments.
 */
callArgumentList: LParen ((expression (Comma expression)*)? | LBrace (namedArgument (Comma namedArgument)*)? RBrace) RParen;
/**
 * Qualified name.
 */
identifierPath: identifier (Period identifier)*;

/**
 * Call to a modifier. If the modifier takes no arguments, the argument list can be skipped entirely
 * (including opening and closing parentheses).
 */
modifierInvocation: identifierPath callArgumentList?;
/**
 * Visibility for functions and function types.
 */
visibility: Internal | External | Private | Public;
/**
 * A list of parameters, such as function arguments or return values.
 */
parameterList: parameters+=parameterDeclaration (Comma parameters+=parameterDeclaration)*;
//@doc:inline
parameterDeclaration: type=typeName location=dataLocation? name=identifier?;
/**
 * Definition of a constructor.
 * Must always supply an implementation.
 * Note that specifying internal or public visibility is deprecated.
 */
constructorDefinition
locals[boolean payableSet = false, boolean visibilitySet = false]
:
	Constructor LParen (arguments=parameterList)? RParen
	(
		modifierInvocation
		| {!$payableSet}? Payable {$payableSet = true;}
		| {!$visibilitySet}? Internal {$visibilitySet = true;}
		| {!$visibilitySet}? Public {$visibilitySet = true;}
	)*
	body=block;

/**
 * State mutability for function types.
 * The default mutability 'non-payable' is assumed if no mutability is specified.
 */
stateMutability: Pure | View | Payable;
/**
 * An override specifier used for functions, modifiers or state variables.
 * In cases where there are ambiguous declarations in several base contracts being overridden,
 * a complete list of base contracts has to be given.
 */
overrideSpecifier: Override (LParen overrides+=identifierPath (Comma overrides+=identifierPath)* RParen)?;
/**
 * The definition of contract, library and interface functions.
 * Depending on the context in which the function is defined, further restrictions may apply,
 * e.g. functions in interfaces have to be unimplemented, i.e. may not contain a body block.
 */
functionDefinition
locals[
	boolean visibilitySet = false,
	boolean mutabilitySet = false,
	boolean virtualSet = false,
	boolean overrideSpecifierSet = false
]
:
	Function (identifier | Fallback | Receive)
	LParen (arguments=parameterList)? RParen
	(
		{!$visibilitySet}? visibility {$visibilitySet = true;}
		| {!$mutabilitySet}? stateMutability {$mutabilitySet = true;}
		| modifierInvocation
		| {!$virtualSet}? Virtual {$virtualSet = true;}
		| {!$overrideSpecifierSet}? overrideSpecifier {$overrideSpecifierSet = true;}
	 )*
	(Returns LParen returnParameters=parameterList RParen)?
	(Semicolon | body=block);
/**
 * The definition of a modifier.
 * Note that within the body block of a modifier, the underscore cannot be used as identifier,
 * but is used as placeholder statement for the body of a function to which the modifier is applied.
 */
modifierDefinition
locals[
	boolean virtualSet = false,
	boolean overrideSpecifierSet = false
]
:
	Modifier name=identifier
	(LParen (arguments=parameterList)? RParen)?
	(
		{!$virtualSet}? Virtual {$virtualSet = true;}
		| {!$overrideSpecifierSet}? overrideSpecifier {$overrideSpecifierSet = true;}
	)*
	(Semicolon | body=block);

/**
 * Definition of the special fallback function.
 */
fallbackFunctionDefinition
locals[
	boolean visibilitySet = false,
	boolean mutabilitySet = false,
	boolean virtualSet = false,
	boolean overrideSpecifierSet = false,
	boolean hasParameters = false
]
:
	kind=Fallback LParen (parameterList { $hasParameters = true; } )? RParen
	(
		{!$visibilitySet}? External {$visibilitySet = true;}
		| {!$mutabilitySet}? stateMutability {$mutabilitySet = true;}
		| modifierInvocation
		| {!$virtualSet}? Virtual {$virtualSet = true;}
		| {!$overrideSpecifierSet}? overrideSpecifier {$overrideSpecifierSet = true;}
	)*
	( {$hasParameters}? Returns LParen returnParameters=parameterList RParen | {!$hasParameters}? )
	(Semicolon | body=block);

/**
 * Definition of the special receive function.
 */
receiveFunctionDefinition
locals[
	boolean visibilitySet = false,
	boolean mutabilitySet = false,
	boolean virtualSet = false,
	boolean overrideSpecifierSet = false
]
:
	kind=Receive LParen RParen
	(
		{!$visibilitySet}? External {$visibilitySet = true;}
		| {!$mutabilitySet}? Payable {$mutabilitySet = true;}
		| modifierInvocation
		| {!$virtualSet}? Virtual {$virtualSet = true;}
		| {!$overrideSpecifierSet}? overrideSpecifier {$overrideSpecifierSet = true;}
	 )*
	(Semicolon | body=block);

/**
 * Definition of a struct. Can occur at top-level within a source unit or within a contract, library or interface.
 */
structDefinition: Struct name=identifier LBrace members=structMember+ RBrace;
/**
 * The declaration of a named struct member.
 */
structMember: type=typeName name=identifier Semicolon;
/**
 * Definition of an enum. Can occur at top-level within a source unit or within a contract, library or interface.
 */
enumDefinition:	Enum name=identifier LBrace enumValues+=identifier (Comma enumValues+=identifier)* RBrace;

/**
 * The declaration of a state variable.
 */
stateVariableDeclaration
locals [boolean constantnessSet = false, boolean visibilitySet = false, boolean overrideSpecifierSet = false]
:
	type=typeName
	(
		{!$visibilitySet}? Public {$visibilitySet = true;}
		| {!$visibilitySet}? Private {$visibilitySet = true;}
		| {!$visibilitySet}? Internal {$visibilitySet = true;}
		| {!$constantnessSet}? Constant {$constantnessSet = true;}
		| {!$overrideSpecifierSet}? overrideSpecifier {$overrideSpecifierSet = true;}
		| {!$constantnessSet}? Immutable {$constantnessSet = true;}
	)*
	name=identifier
	(Assign initialValue=expression)?
	Semicolon;

/**
 * The declaration of a constant variable.
 */
constantVariableDeclaration
:
	type=typeName
	Constant
	name=identifier
	Assign initialValue=expression
	Semicolon;

/**
 * Parameter of an event.
 */
eventParameter: type=typeName Indexed? name=identifier?;
/**
 * Definition of an event. Can occur in contracts, libraries or interfaces.
 */
eventDefinition:
	Event name=identifier
	LParen (parameters+=eventParameter (Comma parameters+=eventParameter)*)? RParen
	Anonymous?
	Semicolon;

/**
 * Parameter of an error.
 */
errorParameter: type=typeName name=identifier?;
/**
 * Definition of an error.
 */
errorDefinition:
	Error name=identifier
	LParen (parameters+=errorParameter (Comma parameters+=errorParameter)*)? RParen
	Semicolon;

/**
 * Using directive to bind library functions to types.
 * Can occur within contracts and libraries.
 */
usingDirective: Using identifierPath For (Mul | typeName) Semicolon;
/**
 * A type name can be an elementary type, a function type, a mapping type, a user-defined type
 * (e.g. a contract or struct) or an array type.
 */
typeName: elementaryTypeName[true] | functionTypeName | mappingType | identifierPath | typeName LBrack expression? RBrack;
elementaryTypeName[boolean allowAddressPayable]: Address | {$allowAddressPayable}? Address Payable | Bool | String | Bytes | SignedIntegerType | UnsignedIntegerType | FixedBytes | Fixed | Ufixed;
functionTypeName
locals [boolean visibilitySet = false, boolean mutabilitySet = false]
:
	Function LParen (arguments=parameterList)? RParen
	(
		{!$visibilitySet}? visibility {$visibilitySet = true;}
		| {!$mutabilitySet}? stateMutability {$mutabilitySet = true;}
	)*
	(Returns LParen returnParameters=parameterList RParen)?;

/**
 * The declaration of a single variable.
 */
variableDeclaration: type=typeName location=dataLocation? name=identifier;
dataLocation: Memory | Storage | Calldata;

/**
 * Complex expression.
 * Can be an index access, an index range access, a member access, a function call (with optional function call options),
 * a type conversion, an unary or binary expression, a comparison or assignment, a ternary expression,
 * a new-expression (i.e. a contract creation or the allocation of a dynamic memory array),
 * a tuple, an inline array or a primary expression (i.e. an identifier, literal or type name).
 */
expression:
	expression LBrack index=expression? RBrack # IndexAccess
	| expression LBrack start=expression? Colon end=expression? RBrack # IndexRangeAccess
	| expression Period (identifier | Address) # MemberAccess
	| expression LBrace (namedArgument (Comma namedArgument)*)? RBrace # FunctionCallOptions
	| expression callArgumentList # FunctionCall
	| Payable callArgumentList # PayableConversion
	| Type LParen typeName RParen # MetaType
	| (Inc | Dec | Not | BitNot | Delete | Sub) expression # UnaryPrefixOperation
	| expression (Inc | Dec) # UnarySuffixOperation
	|<assoc=right> expression Exp expression # ExpOperation
	| expression (Mul | Div | Mod) expression # MulDivModOperation
	| expression (Add | Sub) expression # AddSubOperation
	| expression (Shl | Sar | Shr) expression # ShiftOperation
	| expression BitAnd expression # BitAndOperation
	| expression BitXor expression # BitXorOperation
	| expression BitOr expression # BitOrOperation
	| expression (LessThan | GreaterThan | LessThanOrEqual | GreaterThanOrEqual) expression # OrderComparison
	| expression (Equal | NotEqual) expression # EqualityComparison
	| expression And expression # AndOperation
	| expression Or expression # OrOperation
	|<assoc=right> expression Conditional expression Colon expression # Conditional
	|<assoc=right> expression assignOp expression # Assignment
	| New typeName # NewExpression
	| tupleExpression # Tuple
	| inlineArrayExpression # InlineArray
 	| (
		identifier
		| literal
		| elementaryTypeName[false]
	  ) # PrimaryExpression
;

//@doc:inline
assignOp: Assign | AssignBitOr | AssignBitXor | AssignBitAnd | AssignShl | AssignSar | AssignShr | AssignAdd | AssignSub | AssignMul | AssignDiv | AssignMod;
tupleExpression: LParen (expression? ( Comma expression?)* ) RParen;
/**
 * An inline array expression denotes a statically sized array of the common type of the contained expressions.
 */
inlineArrayExpression: LBrack (expression ( Comma expression)* ) RBrack;

/**
 * Besides regular non-keyword Identifiers, some keywords like 'from' and 'error' can also be used as identifiers.
 */
identifier: Identifier | From | Error | Revert;

literal: stringLiteral | numberLiteral | booleanLiteral | hexStringLiteral | unicodeStringLiteral;
booleanLiteral: True | False;
/**
 * A full string literal consists of either one or several consecutive quoted strings.
 */
stringLiteral: (NonEmptyStringLiteral | EmptyStringLiteral)+;
/**
 * A full hex string literal that consists of either one or several consecutive hex strings.
 */
hexStringLiteral: HexString+;
/**
 * A full unicode string literal that consists of either one or several consecutive unicode strings.
 */
unicodeStringLiteral: UnicodeStringLiteral+;

/**
 * Number literals can be decimal or hexadecimal numbers with an optional unit.
 */
numberLiteral: (DecimalNumber | HexNumber) NumberUnit?;
/**
 * A curly-braced block of statements. Opens its own scope.
 */
block:
	LBrace ( statement | uncheckedBlock )* RBrace;

uncheckedBlock: Unchecked block;

statement:
	block
	| simpleStatement
	| ifStatement
	| forStatement
	| whileStatement
	| doWhileStatement
	| continueStatement
	| breakStatement
	| tryStatement
	| returnStatement
	| emitStatement
	| revertStatement
	| assemblyStatement
;

//@doc:inline
simpleStatement: variableDeclarationStatement | expressionStatement;
/**
 * If statement with optional else part.
 */
ifStatement: If LParen expression RParen statement (Else statement)?;
/**
 * For statement with optional init, condition and post-loop part.
 */
forStatement: For LParen (simpleStatement | Semicolon) (expressionStatement | Semicolon) expression? RParen statement;
whileStatement: While LParen expression RParen statement;
doWhileStatement: Do statement While LParen expression RParen Semicolon;
/**
 * A continue statement. Only allowed inside for, while or do-while loops.
 */
continueStatement: Continue Semicolon;
/**
 * A break statement. Only allowed inside for, while or do-while loops.
 */
breakStatement: Break Semicolon;
/**
 * A try statement. The contained expression needs to be an external function call or a contract creation.
 */
tryStatement: Try expression (Returns LParen returnParameters=parameterList RParen)? block catchClause+;
/**
 * The catch clause of a try statement.
 */
catchClause: Catch (identifier? LParen (arguments=parameterList) RParen)? block;

returnStatement: Return expression? Semicolon;
/**
 * An emit statement. The contained expression needs to refer to an event.
 */
emitStatement: Emit expression callArgumentList Semicolon;
/**
 * A revert statement. The contained expression needs to refer to an error.
 */
revertStatement: Revert expression callArgumentList Semicolon;
/**
 * An inline assembly block.
 * The contents of an inline assembly block use a separate scanner/lexer, i.e. the set of keywords and
 * allowed identifiers is different inside an inline assembly block.
 */
assemblyStatement: Assembly AssemblyDialect? AssemblyLBrace;

//@doc:inline
variableDeclarationList: variableDeclarations+=variableDeclaration (Comma variableDeclarations+=variableDeclaration)*;
/**
 * A tuple of variable names to be used in variable declarations.
 * May contain empty fields.
 */
variableDeclarationTuple:
	LParen
		(Comma* variableDeclarations+=variableDeclaration)
		(Comma (variableDeclarations+=variableDeclaration)?)*
	RParen;
/**
 * A variable declaration statement.
 * A single variable may be declared without initial value, whereas a tuple of variables can only be
 * declared with initial value.
 */
variableDeclarationStatement: ((variableDeclaration (Assign expression)?) | (variableDeclarationTuple Assign expression)) Semicolon;
expressionStatement: expression Semicolon;

mappingType: Mapping LParen key=mappingKeyType DoubleArrow value=typeName RParen;
/**
 * Only elementary types or user defined types are viable as mapping keys.
 */
mappingKeyType: elementaryTypeName[false] | identifierPath;




ReservedKeywords:
	'after' | 'alias' | 'apply' | 'auto' | 'byte' | 'case' | 'copyof' | 'default' | 'define' | 'final'
	| 'implements' | 'in' | 'inline' | 'let' | 'macro' | 'match' | 'mutable' | 'null' | 'of'
	| 'partial' | 'promise' | 'reference' | 'relocatable' | 'sealed' | 'sizeof' | 'static'
	| 'supports' | 'switch' | 'typedef' | 'typeof' | 'var';

Pragma: 'pragma' -> pushMode(PragmaMode);
Abstract: 'abstract';
Anonymous: 'anonymous';
Address: 'address';
As: 'as';
Assembly: 'assembly' -> pushMode(AssemblyBlockMode);
Bool: 'bool';
Break: 'break';
Bytes: 'bytes';
Calldata: 'calldata';
Catch: 'catch';
Constant: 'constant';
Constructor: 'constructor';
Continue: 'continue';
Contract: 'contract';
Delete: 'delete';
Do: 'do';
Else: 'else';
Emit: 'emit';
Enum: 'enum';
Error: 'error'; // not a real keyword
Revert: 'revert'; // not a real keyword
Event: 'event';
External: 'external';
Fallback: 'fallback';
False: 'false';
Fixed: 'fixed' | ('fixed' [1-9][0-9]* 'x' [1-9][0-9]*);
From: 'from'; // not a real keyword
/**
 * Bytes types of fixed length.
 */
FixedBytes:
	'bytes1' | 'bytes2' | 'bytes3' | 'bytes4' | 'bytes5' | 'bytes6' | 'bytes7' | 'bytes8' |
	'bytes9' | 'bytes10' | 'bytes11' | 'bytes12' | 'bytes13' | 'bytes14' | 'bytes15' | 'bytes16' |
	'bytes17' | 'bytes18' | 'bytes19' | 'bytes20' | 'bytes21' | 'bytes22' | 'bytes23' | 'bytes24' |
	'bytes25' | 'bytes26' | 'bytes27' | 'bytes28' | 'bytes29' | 'bytes30' | 'bytes31' | 'bytes32';
For: 'for';
Function: 'function';
Hex: 'hex';
If: 'if';
Immutable: 'immutable';
Import: 'import';
Indexed: 'indexed';
Interface: 'interface';
Internal: 'internal';
Is: 'is';
Library: 'library';
Mapping: 'mapping';
Memory: 'memory';
Modifier: 'modifier';
New: 'new';
/**
 * Unit denomination for numbers.
 */
NumberUnit: 'wei' | 'gwei' | 'ether' | 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'years';
Override: 'override';
Payable: 'payable';
Private: 'private';
Public: 'public';
Pure: 'pure';
Receive: 'receive';
Return: 'return';
Returns: 'returns';
/**
 * Sized signed integer types.
 * int is an alias of int256.
 */
SignedIntegerType:
	'int' | 'int8' | 'int16' | 'int24' | 'int32' | 'int40' | 'int48' | 'int56' | 'int64' |
	'int72' | 'int80' | 'int88' | 'int96' | 'int104' | 'int112' | 'int120' | 'int128' |
	'int136' | 'int144' | 'int152' | 'int160' | 'int168' | 'int176' | 'int184' | 'int192' |
	'int200' | 'int208' | 'int216' | 'int224' | 'int232' | 'int240' | 'int248' | 'int256';
Storage: 'storage';
String: 'string';
Struct: 'struct';
True: 'true';
Try: 'try';
Type: 'type';
Ufixed: 'ufixed' | ('ufixed' [1-9][0-9]+ 'x' [1-9][0-9]+);
Unchecked: 'unchecked';
/**
 * Sized unsigned integer types.
 * uint is an alias of uint256.
 */
UnsignedIntegerType:
	'uint' | 'uint8' | 'uint16' | 'uint24' | 'uint32' | 'uint40' | 'uint48' | 'uint56' | 'uint64' |
	'uint72' | 'uint80' | 'uint88' | 'uint96' | 'uint104' | 'uint112' | 'uint120' | 'uint128' |
	'uint136' | 'uint144' | 'uint152' | 'uint160' | 'uint168' | 'uint176' | 'uint184' | 'uint192' |
	'uint200' | 'uint208' | 'uint216' | 'uint224' | 'uint232' | 'uint240' | 'uint248' | 'uint256';
Using: 'using';
View: 'view';
Virtual: 'virtual';
While: 'while';

LParen: '(';
RParen: ')';
LBrack: '[';
RBrack: ']';
LBrace: '{';
RBrace: '}';
Colon: ':';
Semicolon: ';';
Period: '.';
Conditional: '?';
DoubleArrow: '=>';
RightArrow: '->';

Assign: '=';
AssignBitOr: '|=';
AssignBitXor: '^=';
AssignBitAnd: '&=';
AssignShl: '<<=';
AssignSar: '>>=';
AssignShr: '>>>=';
AssignAdd: '+=';
AssignSub: '-=';
AssignMul: '*=';
AssignDiv: '/=';
AssignMod: '%=';

Comma: ',';
Or: '||';
And: '&&';
BitOr: '|';
BitXor: '^';
BitAnd: '&';
Shl: '<<';
Sar: '>>';
Shr: '>>>';
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';
Mod: '%';
Exp: '**';

Equal: '==';
NotEqual: '!=';
LessThan: '<';
GreaterThan: '>';
LessThanOrEqual: '<=';
GreaterThanOrEqual: '>=';
Not: '!';
BitNot: '~';
Inc: '++';
Dec: '--';
//@doc:inline
DoubleQuote: '"';
//@doc:inline
SingleQuote: '\'';

/**
 * A non-empty quoted string literal restricted to printable characters.
 */
NonEmptyStringLiteral: '"' DoubleQuotedStringCharacter+ '"' | '\'' SingleQuotedStringCharacter+ '\'';
/**
 * An empty string literal
 */
EmptyStringLiteral: '"' '"' | '\'' '\'';

// Note that this will also be used for Yul string literals.
//@doc:inline
fragment DoubleQuotedStringCharacter: DoubleQuotedPrintable | EscapeSequence;
// Note that this will also be used for Yul string literals.
//@doc:inline
fragment SingleQuotedStringCharacter: SingleQuotedPrintable | EscapeSequence;
/**
 * Any printable character except single quote or back slash.
 */
fragment SingleQuotedPrintable: [\u0020-\u0026\u0028-\u005B\u005D-\u007E];
/**
 * Any printable character except double quote or back slash.
 */
fragment DoubleQuotedPrintable: [\u0020-\u0021\u0023-\u005B\u005D-\u007E];
/**
  * Escape sequence.
  * Apart from common single character escape sequences, line breaks can be escaped
  * as well as four hex digit unicode escapes \\uXXXX and two digit hex escape sequences \\xXX are allowed.
  */
fragment EscapeSequence:
	'\\' (
		['"\\nrt\n\r]
		| 'u' HexCharacter HexCharacter HexCharacter HexCharacter
		| 'x' HexCharacter HexCharacter
	);
/**
 * A single quoted string literal allowing arbitrary unicode characters.
 */
UnicodeStringLiteral:
	'unicode"' DoubleQuotedUnicodeStringCharacter* '"'
	| 'unicode\'' SingleQuotedUnicodeStringCharacter* '\'';
//@doc:inline
fragment DoubleQuotedUnicodeStringCharacter: ~["\r\n\\] | EscapeSequence;
//@doc:inline
fragment SingleQuotedUnicodeStringCharacter: ~['\r\n\\] | EscapeSequence;

// Note that this will also be used for Yul hex string literals.
/**
 * Hex strings need to consist of an even number of hex digits that may be grouped using underscores.
 */
HexString: 'hex' (('"' EvenHexDigits? '"') | ('\'' EvenHexDigits? '\''));
/**
 * Hex numbers consist of a prefix and an arbitrary number of hex digits that may be delimited by underscores.
 */
HexNumber: '0' 'x' HexDigits;
//@doc:inline
fragment HexDigits: HexCharacter ('_'? HexCharacter)*;
//@doc:inline
fragment EvenHexDigits: HexCharacter HexCharacter ('_'? HexCharacter HexCharacter)*;
//@doc:inline
fragment HexCharacter: [0-9A-Fa-f];

/**
 * A decimal number literal consists of decimal digits that may be delimited by underscores and
 * an optional positive or negative exponent.
 * If the digits contain a decimal point, the literal has fixed point type.
 */
DecimalNumber: (DecimalDigits | (DecimalDigits? '.' DecimalDigits)) ([eE] '-'? DecimalDigits)?;
//@doc:inline
fragment DecimalDigits: [0-9] ('_'? [0-9])* ;


/**
 * An identifier in solidity has to start with a letter, a dollar-sign or an underscore and
 * may additionally contain numbers after the first symbol.
 */
Identifier: IdentifierStart IdentifierPart*;
//@doc:inline
fragment IdentifierStart: [a-zA-Z$_];
//@doc:inline
fragment IdentifierPart: [a-zA-Z0-9$_];

WS: [ \t\r\n\u000C]+ -> skip ;
COMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);

mode AssemblyBlockMode;

//@doc:inline
AssemblyDialect: '"evmasm"';
AssemblyLBrace: '{' -> popMode, pushMode(YulMode);

AssemblyBlockWS: [ \t\r\n\u000C]+ -> skip ;
AssemblyBlockCOMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;
AssemblyBlockLINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;

mode YulMode;

YulBreak: 'break';
YulCase: 'case';
YulContinue: 'continue';
YulDefault: 'default';
YulFalse: 'false';
YulFor: 'for';
YulFunction: 'function';
YulIf: 'if';
YulLeave: 'leave';
YulLet: 'let';
YulSwitch: 'switch';
YulTrue: 'true';
YulHex: 'hex';

/**
 * Builtin functions in the EVM Yul dialect.
 */
YulEVMBuiltin:
	'stop' | 'add' | 'sub' | 'mul' | 'div' | 'sdiv' | 'mod' | 'smod' | 'exp' | 'not'
	| 'lt' | 'gt' | 'slt' | 'sgt' | 'eq' | 'iszero' | 'and' | 'or' | 'xor' | 'byte'
	| 'shl' | 'shr' | 'sar' | 'addmod' | 'mulmod' | 'signextend' | 'keccak256'
	| 'pop' | 'mload' | 'mstore' | 'mstore8' | 'sload' | 'sstore' | 'msize' | 'gas'
	| 'address' | 'balance' | 'selfbalance' | 'caller' | 'callvalue' | 'calldataload'
	| 'calldatasize' | 'calldatacopy' | 'extcodesize' | 'extcodecopy' | 'returndatasize'
	| 'returndatacopy' | 'extcodehash' | 'create' | 'create2' | 'call' | 'callcode'
	| 'delegatecall' | 'staticcall' | 'return' | 'revert' | 'selfdestruct' | 'invalid'
	| 'log0' | 'log1' | 'log2' | 'log3' | 'log4' | 'chainid' | 'origin' | 'gasprice'
	| 'blockhash' | 'coinbase' | 'timestamp' | 'number' | 'difficulty' | 'gaslimit'
	| 'basefee';

YulLBrace: '{' -> pushMode(YulMode);
YulRBrace: '}' -> popMode;
YulLParen: '(';
YulRParen: ')';
YulAssign: ':=';
YulPeriod: '.';
YulComma: ',';
YulArrow: '->';

/**
 * Yul identifiers consist of letters, dollar signs, underscores and numbers, but may not start with a number.
 * In inline assembly there cannot be dots in user-defined identifiers. Instead see yulPath for expressions
 * consisting of identifiers with dots.
 */
YulIdentifier: YulIdentifierStart YulIdentifierPart*;
//@doc:inline
fragment YulIdentifierStart: [a-zA-Z$_];
//@doc:inline
fragment YulIdentifierPart: [a-zA-Z0-9$_];
/**
 * Hex literals in Yul consist of a prefix and one or more hexadecimal digits.
 */
YulHexNumber: '0' 'x' [0-9a-fA-F]+;
/**
 * Decimal literals in Yul may be zero or any sequence of decimal digits without leading zeroes.
 */
YulDecimalNumber: '0' | ([1-9] [0-9]*);
/**
 * String literals in Yul consist of one or more double-quoted or single-quoted strings
 * that may contain escape sequences and printable characters except unescaped line breaks or
 * unescaped double-quotes or single-quotes, respectively.
 */
YulStringLiteral:
	'"' DoubleQuotedStringCharacter* '"'
	| '\'' SingleQuotedStringCharacter* '\'';
//@doc:inline
YulHexStringLiteral: HexString;

YulWS: [ \t\r\n\u000C]+ -> skip ;
YulCOMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;
YulLINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;

mode PragmaMode;

/**
 * Pragma token. Can contain any kind of symbol except a semicolon.
 * Note that currently the solidity parser only allows a subset of this.
 */
//@doc:name pragma-token
//@doc:no-diagram
PragmaToken: ~[;]+;
PragmaSemicolon: ';' -> popMode;

PragmaWS: [ \t\r\n\u000C]+ -> skip ;
PragmaCOMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;
PragmaLINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;
