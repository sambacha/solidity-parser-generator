// Generated from /Users/sbacha/g5/SolidityParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ReservedKeywords=1, Pragma=2, Abstract=3, Anonymous=4, Address=5, As=6, 
		Assembly=7, Bool=8, Break=9, Bytes=10, Calldata=11, Catch=12, Constant=13, 
		Constructor=14, Continue=15, Contract=16, Delete=17, Do=18, Else=19, Emit=20, 
		Enum=21, Error=22, Revert=23, Event=24, External=25, Fallback=26, False=27, 
		Fixed=28, From=29, FixedBytes=30, For=31, Function=32, Hex=33, If=34, 
		Immutable=35, Import=36, Indexed=37, Interface=38, Internal=39, Is=40, 
		Library=41, Mapping=42, Memory=43, Modifier=44, New=45, NumberUnit=46, 
		Override=47, Payable=48, Private=49, Public=50, Pure=51, Receive=52, Return=53, 
		Returns=54, SignedIntegerType=55, Storage=56, String=57, Struct=58, True=59, 
		Try=60, Type=61, Ufixed=62, Unchecked=63, UnsignedIntegerType=64, Using=65, 
		View=66, Virtual=67, While=68, LParen=69, RParen=70, LBrack=71, RBrack=72, 
		LBrace=73, RBrace=74, Colon=75, Semicolon=76, Period=77, Conditional=78, 
		DoubleArrow=79, RightArrow=80, Assign=81, AssignBitOr=82, AssignBitXor=83, 
		AssignBitAnd=84, AssignShl=85, AssignSar=86, AssignShr=87, AssignAdd=88, 
		AssignSub=89, AssignMul=90, AssignDiv=91, AssignMod=92, Comma=93, Or=94, 
		And=95, BitOr=96, BitXor=97, BitAnd=98, Shl=99, Sar=100, Shr=101, Add=102, 
		Sub=103, Mul=104, Div=105, Mod=106, Exp=107, Equal=108, NotEqual=109, 
		LessThan=110, GreaterThan=111, LessThanOrEqual=112, GreaterThanOrEqual=113, 
		Not=114, BitNot=115, Inc=116, Dec=117, DoubleQuote=118, SingleQuote=119, 
		NonEmptyStringLiteral=120, EmptyStringLiteral=121, UnicodeStringLiteral=122, 
		HexString=123, HexNumber=124, DecimalNumber=125, Identifier=126, WS=127, 
		COMMENT=128, LINE_COMMENT=129, AssemblyDialect=130, AssemblyLBrace=131, 
		AssemblyBlockWS=132, AssemblyBlockCOMMENT=133, AssemblyBlockLINE_COMMENT=134, 
		YulBreak=135, YulCase=136, YulContinue=137, YulDefault=138, YulFalse=139, 
		YulFor=140, YulFunction=141, YulIf=142, YulLeave=143, YulLet=144, YulSwitch=145, 
		YulTrue=146, YulHex=147, YulEVMBuiltin=148, YulLBrace=149, YulRBrace=150, 
		YulLParen=151, YulRParen=152, YulAssign=153, YulPeriod=154, YulComma=155, 
		YulArrow=156, YulIdentifier=157, YulHexNumber=158, YulDecimalNumber=159, 
		YulStringLiteral=160, YulHexStringLiteral=161, YulWS=162, YulCOMMENT=163, 
		YulLINE_COMMENT=164, PragmaToken=165, PragmaSemicolon=166, PragmaWS=167, 
		PragmaCOMMENT=168, PragmaLINE_COMMENT=169;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_importDirective = 2, 
		RULE_importAliases = 3, RULE_path = 4, RULE_symbolAliases = 5, RULE_contractDefinition = 6, 
		RULE_interfaceDefinition = 7, RULE_libraryDefinition = 8, RULE_inheritanceSpecifierList = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractBodyElement = 11, RULE_namedArgument = 12, 
		RULE_callArgumentList = 13, RULE_identifierPath = 14, RULE_modifierInvocation = 15, 
		RULE_visibility = 16, RULE_parameterList = 17, RULE_parameterDeclaration = 18, 
		RULE_constructorDefinition = 19, RULE_stateMutability = 20, RULE_overrideSpecifier = 21, 
		RULE_functionDefinition = 22, RULE_modifierDefinition = 23, RULE_fallbackFunctionDefinition = 24, 
		RULE_receiveFunctionDefinition = 25, RULE_structDefinition = 26, RULE_structMember = 27, 
		RULE_enumDefinition = 28, RULE_stateVariableDeclaration = 29, RULE_constantVariableDeclaration = 30, 
		RULE_eventParameter = 31, RULE_eventDefinition = 32, RULE_errorParameter = 33, 
		RULE_errorDefinition = 34, RULE_usingDirective = 35, RULE_typeName = 36, 
		RULE_elementaryTypeName = 37, RULE_functionTypeName = 38, RULE_variableDeclaration = 39, 
		RULE_dataLocation = 40, RULE_expression = 41, RULE_assignOp = 42, RULE_tupleExpression = 43, 
		RULE_inlineArrayExpression = 44, RULE_identifier = 45, RULE_literal = 46, 
		RULE_booleanLiteral = 47, RULE_stringLiteral = 48, RULE_hexStringLiteral = 49, 
		RULE_unicodeStringLiteral = 50, RULE_numberLiteral = 51, RULE_block = 52, 
		RULE_uncheckedBlock = 53, RULE_statement = 54, RULE_simpleStatement = 55, 
		RULE_ifStatement = 56, RULE_forStatement = 57, RULE_whileStatement = 58, 
		RULE_doWhileStatement = 59, RULE_continueStatement = 60, RULE_breakStatement = 61, 
		RULE_tryStatement = 62, RULE_catchClause = 63, RULE_returnStatement = 64, 
		RULE_emitStatement = 65, RULE_revertStatement = 66, RULE_assemblyStatement = 67, 
		RULE_variableDeclarationList = 68, RULE_variableDeclarationTuple = 69, 
		RULE_variableDeclarationStatement = 70, RULE_expressionStatement = 71, 
		RULE_mappingType = 72, RULE_mappingKeyType = 73, RULE_yulStatement = 74, 
		RULE_yulBlock = 75, RULE_yulVariableDeclaration = 76, RULE_yulAssignment = 77, 
		RULE_yulIfStatement = 78, RULE_yulForStatement = 79, RULE_yulSwitchCase = 80, 
		RULE_yulSwitchStatement = 81, RULE_yulFunctionDefinition = 82, RULE_yulPath = 83, 
		RULE_yulFunctionCall = 84, RULE_yulBoolean = 85, RULE_yulLiteral = 86, 
		RULE_yulExpression = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "importDirective", "importAliases", 
			"path", "symbolAliases", "contractDefinition", "interfaceDefinition", 
			"libraryDefinition", "inheritanceSpecifierList", "inheritanceSpecifier", 
			"contractBodyElement", "namedArgument", "callArgumentList", "identifierPath", 
			"modifierInvocation", "visibility", "parameterList", "parameterDeclaration", 
			"constructorDefinition", "stateMutability", "overrideSpecifier", "functionDefinition", 
			"modifierDefinition", "fallbackFunctionDefinition", "receiveFunctionDefinition", 
			"structDefinition", "structMember", "enumDefinition", "stateVariableDeclaration", 
			"constantVariableDeclaration", "eventParameter", "eventDefinition", "errorParameter", 
			"errorDefinition", "usingDirective", "typeName", "elementaryTypeName", 
			"functionTypeName", "variableDeclaration", "dataLocation", "expression", 
			"assignOp", "tupleExpression", "inlineArrayExpression", "identifier", 
			"literal", "booleanLiteral", "stringLiteral", "hexStringLiteral", "unicodeStringLiteral", 
			"numberLiteral", "block", "uncheckedBlock", "statement", "simpleStatement", 
			"ifStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "tryStatement", "catchClause", 
			"returnStatement", "emitStatement", "revertStatement", "assemblyStatement", 
			"variableDeclarationList", "variableDeclarationTuple", "variableDeclarationStatement", 
			"expressionStatement", "mappingType", "mappingKeyType", "yulStatement", 
			"yulBlock", "yulVariableDeclaration", "yulAssignment", "yulIfStatement", 
			"yulForStatement", "yulSwitchCase", "yulSwitchStatement", "yulFunctionDefinition", 
			"yulPath", "yulFunctionCall", "yulBoolean", "yulLiteral", "yulExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pragma'", "'abstract'", "'anonymous'", "'address'", "'as'", 
			"'assembly'", "'bool'", null, "'bytes'", "'calldata'", "'catch'", "'constant'", 
			"'constructor'", null, "'contract'", "'delete'", "'do'", "'else'", "'emit'", 
			"'enum'", "'error'", "'revert'", "'event'", "'external'", "'fallback'", 
			null, null, "'from'", null, null, null, null, null, "'immutable'", "'import'", 
			"'indexed'", "'interface'", "'internal'", "'is'", "'library'", "'mapping'", 
			"'memory'", "'modifier'", "'new'", null, "'override'", "'payable'", "'private'", 
			"'public'", "'pure'", "'receive'", "'return'", "'returns'", null, "'storage'", 
			"'string'", "'struct'", null, "'try'", "'type'", null, "'unchecked'", 
			null, "'using'", "'view'", "'virtual'", "'while'", null, null, "'['", 
			"']'", null, null, "':'", null, null, "'?'", "'=>'", null, "'='", "'|='", 
			"'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", null, "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'!'", "'~'", "'++'", "'--'", "'\"'", "'''", null, null, 
			null, null, null, null, null, null, null, null, "'\"evmasm\"'", null, 
			null, null, null, null, "'case'", null, "'default'", null, null, null, 
			null, "'leave'", "'let'", "'switch'", null, null, null, null, null, null, 
			null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ReservedKeywords", "Pragma", "Abstract", "Anonymous", "Address", 
			"As", "Assembly", "Bool", "Break", "Bytes", "Calldata", "Catch", "Constant", 
			"Constructor", "Continue", "Contract", "Delete", "Do", "Else", "Emit", 
			"Enum", "Error", "Revert", "Event", "External", "Fallback", "False", 
			"Fixed", "From", "FixedBytes", "For", "Function", "Hex", "If", "Immutable", 
			"Import", "Indexed", "Interface", "Internal", "Is", "Library", "Mapping", 
			"Memory", "Modifier", "New", "NumberUnit", "Override", "Payable", "Private", 
			"Public", "Pure", "Receive", "Return", "Returns", "SignedIntegerType", 
			"Storage", "String", "Struct", "True", "Try", "Type", "Ufixed", "Unchecked", 
			"UnsignedIntegerType", "Using", "View", "Virtual", "While", "LParen", 
			"RParen", "LBrack", "RBrack", "LBrace", "RBrace", "Colon", "Semicolon", 
			"Period", "Conditional", "DoubleArrow", "RightArrow", "Assign", "AssignBitOr", 
			"AssignBitXor", "AssignBitAnd", "AssignShl", "AssignSar", "AssignShr", 
			"AssignAdd", "AssignSub", "AssignMul", "AssignDiv", "AssignMod", "Comma", 
			"Or", "And", "BitOr", "BitXor", "BitAnd", "Shl", "Sar", "Shr", "Add", 
			"Sub", "Mul", "Div", "Mod", "Exp", "Equal", "NotEqual", "LessThan", "GreaterThan", 
			"LessThanOrEqual", "GreaterThanOrEqual", "Not", "BitNot", "Inc", "Dec", 
			"DoubleQuote", "SingleQuote", "NonEmptyStringLiteral", "EmptyStringLiteral", 
			"UnicodeStringLiteral", "HexString", "HexNumber", "DecimalNumber", "Identifier", 
			"WS", "COMMENT", "LINE_COMMENT", "AssemblyDialect", "AssemblyLBrace", 
			"AssemblyBlockWS", "AssemblyBlockCOMMENT", "AssemblyBlockLINE_COMMENT", 
			"YulBreak", "YulCase", "YulContinue", "YulDefault", "YulFalse", "YulFor", 
			"YulFunction", "YulIf", "YulLeave", "YulLet", "YulSwitch", "YulTrue", 
			"YulHex", "YulEVMBuiltin", "YulLBrace", "YulRBrace", "YulLParen", "YulRParen", 
			"YulAssign", "YulPeriod", "YulComma", "YulArrow", "YulIdentifier", "YulHexNumber", 
			"YulDecimalNumber", "YulStringLiteral", "YulHexStringLiteral", "YulWS", 
			"YulCOMMENT", "YulLINE_COMMENT", "PragmaToken", "PragmaSemicolon", "PragmaWS", 
			"PragmaCOMMENT", "PragmaLINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SolidityParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<LibraryDefinitionContext> libraryDefinition() {
			return getRuleContexts(LibraryDefinitionContext.class);
		}
		public LibraryDefinitionContext libraryDefinition(int i) {
			return getRuleContext(LibraryDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<ErrorDefinitionContext> errorDefinition() {
			return getRuleContexts(ErrorDefinitionContext.class);
		}
		public ErrorDefinitionContext errorDefinition(int i) {
			return getRuleContext(ErrorDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(176);
						pragmaDirective();
						}
						break;
					case 2:
						{
						setState(177);
						importDirective();
						}
						break;
					case 3:
						{
						setState(178);
						contractDefinition();
						}
						break;
					case 4:
						{
						setState(179);
						interfaceDefinition();
						}
						break;
					case 5:
						{
						setState(180);
						libraryDefinition();
						}
						break;
					case 6:
						{
						setState(181);
						functionDefinition();
						}
						break;
					case 7:
						{
						setState(182);
						constantVariableDeclaration();
						}
						break;
					case 8:
						{
						setState(183);
						structDefinition();
						}
						break;
					case 9:
						{
						setState(184);
						enumDefinition();
						}
						break;
					case 10:
						{
						setState(185);
						errorDefinition();
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(191);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public TerminalNode Pragma() { return getToken(SolidityParser.Pragma, 0); }
		public TerminalNode PragmaSemicolon() { return getToken(SolidityParser.PragmaSemicolon, 0); }
		public List<TerminalNode> PragmaToken() { return getTokens(SolidityParser.PragmaToken); }
		public TerminalNode PragmaToken(int i) {
			return getToken(SolidityParser.PragmaToken, i);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(Pragma);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(PragmaToken);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PragmaToken );
			setState(199);
			match(PragmaSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public IdentifierContext unitAlias;
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SymbolAliasesContext symbolAliases() {
			return getRuleContext(SymbolAliasesContext.class,0);
		}
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Import);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
				{
				{
				setState(202);
				path();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(203);
					match(As);
					setState(204);
					((ImportDirectiveContext)_localctx).unitAlias = identifier();
					}
				}

				}
				}
				break;
			case LBrace:
				{
				{
				setState(207);
				symbolAliases();
				setState(208);
				match(From);
				setState(209);
				path();
				}
				}
				break;
			case Mul:
				{
				{
				setState(211);
				match(Mul);
				setState(212);
				match(As);
				setState(213);
				((ImportDirectiveContext)_localctx).unitAlias = identifier();
				setState(214);
				match(From);
				setState(215);
				path();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasesContext extends ParserRuleContext {
		public IdentifierContext symbol;
		public IdentifierContext alias;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public ImportAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliases; }
	}

	public final ImportAliasesContext importAliases() throws RecognitionException {
		ImportAliasesContext _localctx = new ImportAliasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((ImportAliasesContext)_localctx).symbol = identifier();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(222);
				match(As);
				setState(223);
				((ImportAliasesContext)_localctx).alias = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode NonEmptyStringLiteral() { return getToken(SolidityParser.NonEmptyStringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(NonEmptyStringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolAliasesContext extends ParserRuleContext {
		public ImportAliasesContext importAliases;
		public List<ImportAliasesContext> aliases = new ArrayList<ImportAliasesContext>();
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ImportAliasesContext> importAliases() {
			return getRuleContexts(ImportAliasesContext.class);
		}
		public ImportAliasesContext importAliases(int i) {
			return getRuleContext(ImportAliasesContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public SymbolAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolAliases; }
	}

	public final SymbolAliasesContext symbolAliases() throws RecognitionException {
		SymbolAliasesContext _localctx = new SymbolAliasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbolAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LBrace);
			setState(229);
			((SymbolAliasesContext)_localctx).importAliases = importAliases();
			((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(230);
				match(Comma);
				setState(231);
				((SymbolAliasesContext)_localctx).importAliases = importAliases();
				((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Abstract() { return getToken(SolidityParser.Abstract, 0); }
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(239);
				match(Abstract);
				}
			}

			setState(242);
			match(Contract);
			setState(243);
			((ContractDefinitionContext)_localctx).name = identifier();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(244);
				inheritanceSpecifierList();
				}
			}

			setState(247);
			match(LBrace);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					contractBodyElement();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(254);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Interface() { return getToken(SolidityParser.Interface, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Interface);
			setState(257);
			((InterfaceDefinitionContext)_localctx).name = identifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(258);
				inheritanceSpecifierList();
				}
			}

			setState(261);
			match(LBrace);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					contractBodyElement();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(268);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Library() { return getToken(SolidityParser.Library, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_libraryDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Library);
			setState(271);
			((LibraryDefinitionContext)_localctx).name = identifier();
			setState(272);
			match(LBrace);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					contractBodyElement();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(279);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierListContext extends ParserRuleContext {
		public InheritanceSpecifierContext inheritanceSpecifier;
		public List<InheritanceSpecifierContext> inheritanceSpecifiers = new ArrayList<InheritanceSpecifierContext>();
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InheritanceSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifierList; }
	}

	public final InheritanceSpecifierListContext inheritanceSpecifierList() throws RecognitionException {
		InheritanceSpecifierListContext _localctx = new InheritanceSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inheritanceSpecifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Is);
			setState(282);
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(283);
					match(Comma);
					setState(284);
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext name;
		public CallArgumentListContext arguments;
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			((InheritanceSpecifierContext)_localctx).name = identifierPath();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LParen) {
				{
				setState(291);
				((InheritanceSpecifierContext)_localctx).arguments = callArgumentList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractBodyElementContext extends ParserRuleContext {
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FallbackFunctionDefinitionContext fallbackFunctionDefinition() {
			return getRuleContext(FallbackFunctionDefinitionContext.class,0);
		}
		public ReceiveFunctionDefinitionContext receiveFunctionDefinition() {
			return getRuleContext(ReceiveFunctionDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public ErrorDefinitionContext errorDefinition() {
			return getRuleContext(ErrorDefinitionContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public ContractBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBodyElement; }
	}

	public final ContractBodyElementContext contractBodyElement() throws RecognitionException {
		ContractBodyElementContext _localctx = new ContractBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractBodyElement);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				constructorDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				modifierDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				fallbackFunctionDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				receiveFunctionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				structDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				stateVariableDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				eventDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				errorDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(304);
				usingDirective();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((NamedArgumentContext)_localctx).name = identifier();
			setState(308);
			match(Colon);
			setState(309);
			((NamedArgumentContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentListContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LParen);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(312);
					expression(0);
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(313);
						match(Comma);
						setState(314);
						expression(0);
						}
						}
						setState(319);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(322);
				match(LBrace);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
					{
					setState(323);
					namedArgument();
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(324);
						match(Comma);
						setState(325);
						namedArgument();
						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(333);
				match(RBrace);
				}
				break;
			}
			setState(336);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Period() { return getTokens(SolidityParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(SolidityParser.Period, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			identifier();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(Period);
					setState(340);
					identifier();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifierInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			identifierPath();
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(347);
				callArgumentList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode Internal() { return getToken(SolidityParser.Internal, 0); }
		public TerminalNode External() { return getToken(SolidityParser.External, 0); }
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << External) | (1L << Internal) | (1L << Private) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> parameters = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(353);
				match(Comma);
				setState(354);
				((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((ParameterDeclarationContext)_localctx).type = typeName(0);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(361);
				((ParameterDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(364);
				((ParameterDeclarationContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public boolean payableSet = false;
		public boolean visibilitySet = false;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Constructor() { return getToken(SolidityParser.Constructor, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Constructor);
			setState(368);
			match(LParen);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(369);
				((ConstructorDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(372);
			match(RParen);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(373);
						modifierInvocation();
						}
						break;
					case 2:
						{
						setState(374);
						if (!(!_localctx.payableSet)) throw new FailedPredicateException(this, "!$payableSet");
						setState(375);
						match(Payable);
						((ConstructorDefinitionContext)_localctx).payableSet =  true;
						}
						break;
					case 3:
						{
						setState(377);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(378);
						match(Internal);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(380);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(381);
						match(Public);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(388);
			((ConstructorDefinitionContext)_localctx).body = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode Pure() { return getToken(SolidityParser.Pure, 0); }
		public TerminalNode View() { return getToken(SolidityParser.View, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Payable - 48)) | (1L << (Pure - 48)) | (1L << (View - 48)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath;
		public List<IdentifierPathContext> overrides = new ArrayList<IdentifierPathContext>();
		public TerminalNode Override() { return getToken(SolidityParser.Override, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(Override);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(393);
				match(LParen);
				setState(394);
				((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
				((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(395);
					match(Comma);
					setState(396);
					((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
					((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(RParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(Function);
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case Revert:
			case From:
			case Identifier:
				{
				setState(407);
				identifier();
				}
				break;
			case Fallback:
				{
				setState(408);
				match(Fallback);
				}
				break;
			case Receive:
				{
				setState(409);
				match(Receive);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			match(LParen);
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(413);
				((FunctionDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(416);
			match(RParen);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(417);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(418);
						visibility();
						((FunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(421);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(422);
						stateMutability();
						((FunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(425);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(426);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(427);
						match(Virtual);
						((FunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(429);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(430);
						overrideSpecifier();
						((FunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(438);
				match(Returns);
				setState(439);
				match(LParen);
				setState(440);
				((FunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(441);
				match(RParen);
				}
			}

			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(445);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(446);
				((FunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public IdentifierContext name;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Modifier() { return getToken(SolidityParser.Modifier, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(Modifier);
			setState(450);
			((ModifierDefinitionContext)_localctx).name = identifier();
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(451);
				match(LParen);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(452);
					((ModifierDefinitionContext)_localctx).arguments = parameterList();
					}
					break;
				}
				setState(455);
				match(RParen);
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(458);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(459);
						match(Virtual);
						((ModifierDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 2:
						{
						setState(461);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(462);
						overrideSpecifier();
						((ModifierDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(470);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(471);
				((ModifierDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallbackFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public boolean hasParameters = false;
		public Token kind;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FallbackFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallbackFunctionDefinition; }
	}

	public final FallbackFunctionDefinitionContext fallbackFunctionDefinition() throws RecognitionException {
		FallbackFunctionDefinitionContext _localctx = new FallbackFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fallbackFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			((FallbackFunctionDefinitionContext)_localctx).kind = match(Fallback);
			setState(475);
			match(LParen);
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(476);
				parameterList();
				 ((FallbackFunctionDefinitionContext)_localctx).hasParameters =  true; 
				}
				break;
			}
			setState(481);
			match(RParen);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(482);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(483);
						match(External);
						((FallbackFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(485);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(486);
						stateMutability();
						((FallbackFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(489);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(490);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(491);
						match(Virtual);
						((FallbackFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(493);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(494);
						overrideSpecifier();
						((FallbackFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(502);
				if (!(_localctx.hasParameters)) throw new FailedPredicateException(this, "$hasParameters");
				setState(503);
				match(Returns);
				setState(504);
				match(LParen);
				setState(505);
				((FallbackFunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(506);
				match(RParen);
				}
				break;
			case 2:
				{
				setState(508);
				if (!(!_localctx.hasParameters)) throw new FailedPredicateException(this, "!$hasParameters");
				}
				break;
			}
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(511);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(512);
				((FallbackFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiveFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public Token kind;
		public BlockContext body;
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReceiveFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveFunctionDefinition; }
	}

	public final ReceiveFunctionDefinitionContext receiveFunctionDefinition() throws RecognitionException {
		ReceiveFunctionDefinitionContext _localctx = new ReceiveFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_receiveFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			((ReceiveFunctionDefinitionContext)_localctx).kind = match(Receive);
			setState(516);
			match(LParen);
			setState(517);
			match(RParen);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(518);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(519);
						match(External);
						((ReceiveFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(521);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(522);
						match(Payable);
						((ReceiveFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(524);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(525);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(526);
						match(Virtual);
						((ReceiveFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(528);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(529);
						overrideSpecifier();
						((ReceiveFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(537);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(538);
				((ReceiveFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public StructMemberContext members;
		public TerminalNode Struct() { return getToken(SolidityParser.Struct, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(Struct);
			setState(542);
			((StructDefinitionContext)_localctx).name = identifier();
			setState(543);
			match(LBrace);
			setState(545); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(544);
					((StructDefinitionContext)_localctx).members = structMember();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(547); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(549);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructMemberContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_structMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			((StructMemberContext)_localctx).type = typeName(0);
			setState(552);
			((StructMemberContext)_localctx).name = identifier();
			setState(553);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> enumValues = new ArrayList<IdentifierContext>();
		public TerminalNode Enum() { return getToken(SolidityParser.Enum, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(Enum);
			setState(556);
			((EnumDefinitionContext)_localctx).name = identifier();
			setState(557);
			match(LBrace);
			setState(558);
			((EnumDefinitionContext)_localctx).identifier = identifier();
			((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(559);
				match(Comma);
				setState(560);
				((EnumDefinitionContext)_localctx).identifier = identifier();
				((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public boolean constantnessSet = false;
		public boolean visibilitySet = false;
		public boolean overrideSpecifierSet = false;
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public List<TerminalNode> Private() { return getTokens(SolidityParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SolidityParser.Private, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Constant() { return getTokens(SolidityParser.Constant); }
		public TerminalNode Constant(int i) {
			return getToken(SolidityParser.Constant, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public List<TerminalNode> Immutable() { return getTokens(SolidityParser.Immutable); }
		public TerminalNode Immutable(int i) {
			return getToken(SolidityParser.Immutable, i);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stateVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			((StateVariableDeclarationContext)_localctx).type = typeName(0);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(588);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(569);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(570);
						match(Public);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(572);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(573);
						match(Private);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 3:
						{
						setState(575);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(576);
						match(Internal);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(578);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(579);
						match(Constant);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					case 5:
						{
						setState(581);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(582);
						overrideSpecifier();
						((StateVariableDeclarationContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					case 6:
						{
						setState(585);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(586);
						match(Immutable);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(593);
			((StateVariableDeclarationContext)_localctx).name = identifier();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(594);
				match(Assign);
				setState(595);
				((StateVariableDeclarationContext)_localctx).initialValue = expression(0);
				}
			}

			setState(598);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Constant() { return getToken(SolidityParser.Constant, 0); }
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			((ConstantVariableDeclarationContext)_localctx).type = typeName(0);
			setState(601);
			match(Constant);
			setState(602);
			((ConstantVariableDeclarationContext)_localctx).name = identifier();
			setState(603);
			match(Assign);
			setState(604);
			((ConstantVariableDeclarationContext)_localctx).initialValue = expression(0);
			setState(605);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((EventParameterContext)_localctx).type = typeName(0);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Indexed) {
				{
				setState(608);
				match(Indexed);
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(611);
				((EventParameterContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public EventParameterContext eventParameter;
		public List<EventParameterContext> parameters = new ArrayList<EventParameterContext>();
		public TerminalNode Event() { return getToken(SolidityParser.Event, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Anonymous() { return getToken(SolidityParser.Anonymous, 0); }
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(Event);
			setState(615);
			((EventDefinitionContext)_localctx).name = identifier();
			setState(616);
			match(LParen);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(617);
				((EventDefinitionContext)_localctx).eventParameter = eventParameter();
				((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(618);
					match(Comma);
					setState(619);
					((EventDefinitionContext)_localctx).eventParameter = eventParameter();
					((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(627);
			match(RParen);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Anonymous) {
				{
				setState(628);
				match(Anonymous);
				}
			}

			setState(631);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorParameter; }
	}

	public final ErrorParameterContext errorParameter() throws RecognitionException {
		ErrorParameterContext _localctx = new ErrorParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_errorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			((ErrorParameterContext)_localctx).type = typeName(0);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(634);
				((ErrorParameterContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public ErrorParameterContext errorParameter;
		public List<ErrorParameterContext> parameters = new ArrayList<ErrorParameterContext>();
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ErrorParameterContext> errorParameter() {
			return getRuleContexts(ErrorParameterContext.class);
		}
		public ErrorParameterContext errorParameter(int i) {
			return getRuleContext(ErrorParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefinition; }
	}

	public final ErrorDefinitionContext errorDefinition() throws RecognitionException {
		ErrorDefinitionContext _localctx = new ErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(Error);
			setState(638);
			((ErrorDefinitionContext)_localctx).name = identifier();
			setState(639);
			match(LParen);
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(640);
				((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
				((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(641);
					match(Comma);
					setState(642);
					((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
					((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(650);
			match(RParen);
			setState(651);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(SolidityParser.Using, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_usingDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(Using);
			setState(654);
			identifierPath();
			setState(655);
			match(For);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(656);
				match(Mul);
				}
				break;
			case 2:
				{
				setState(657);
				typeName(0);
				}
				break;
			}
			setState(660);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingTypeContext mappingType() {
			return getRuleContext(MappingTypeContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(663);
				elementaryTypeName(true);
				}
				break;
			case 2:
				{
				setState(664);
				functionTypeName();
				}
				break;
			case 3:
				{
				setState(665);
				mappingType();
				}
				break;
			case 4:
				{
				setState(666);
				identifierPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(669);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(670);
					match(LBrack);
					setState(672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(671);
						expression(0);
						}
						break;
					}
					setState(674);
					match(RBrack);
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public boolean allowAddressPayable;
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public TerminalNode Bool() { return getToken(SolidityParser.Bool, 0); }
		public TerminalNode String() { return getToken(SolidityParser.String, 0); }
		public TerminalNode Bytes() { return getToken(SolidityParser.Bytes, 0); }
		public TerminalNode SignedIntegerType() { return getToken(SolidityParser.SignedIntegerType, 0); }
		public TerminalNode UnsignedIntegerType() { return getToken(SolidityParser.UnsignedIntegerType, 0); }
		public TerminalNode FixedBytes() { return getToken(SolidityParser.FixedBytes, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState, boolean allowAddressPayable) {
			super(parent, invokingState);
			this.allowAddressPayable = allowAddressPayable;
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName(boolean allowAddressPayable) throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState(), allowAddressPayable);
		enterRule(_localctx, 74, RULE_elementaryTypeName);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(Address);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				if (!(_localctx.allowAddressPayable)) throw new FailedPredicateException(this, "$allowAddressPayable");
				setState(682);
				match(Address);
				setState(683);
				match(Payable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(Bool);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(686);
				match(Bytes);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(687);
				match(SignedIntegerType);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(688);
				match(UnsignedIntegerType);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(689);
				match(FixedBytes);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(690);
				match(Fixed);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(691);
				match(Ufixed);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(Function);
			setState(695);
			match(LParen);
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(696);
				((FunctionTypeNameContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(699);
			match(RParen);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(700);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(701);
						visibility();
						((FunctionTypeNameContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(704);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(705);
						stateMutability();
						((FunctionTypeNameContext)_localctx).mutabilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(713);
				match(Returns);
				setState(714);
				match(LParen);
				setState(715);
				((FunctionTypeNameContext)_localctx).returnParameters = parameterList();
				setState(716);
				match(RParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			((VariableDeclarationContext)_localctx).type = typeName(0);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(721);
				((VariableDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(724);
			((VariableDeclarationContext)_localctx).name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataLocationContext extends ParserRuleContext {
		public TerminalNode Memory() { return getToken(SolidityParser.Memory, 0); }
		public TerminalNode Storage() { return getToken(SolidityParser.Storage, 0); }
		public TerminalNode Calldata() { return getToken(SolidityParser.Calldata, 0); }
		public DataLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLocation; }
	}

	public final DataLocationContext dataLocation() throws RecognitionException {
		DataLocationContext _localctx = new DataLocationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dataLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPrefixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public TerminalNode Not() { return getToken(SolidityParser.Not, 0); }
		public TerminalNode BitNot() { return getToken(SolidityParser.BitNot, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public UnaryPrefixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrderComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(SolidityParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(SolidityParser.GreaterThan, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(SolidityParser.LessThanOrEqual, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(SolidityParser.GreaterThanOrEqual, 0); }
		public OrderComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Conditional() { return getToken(SolidityParser.Conditional, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public ConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PayableConversionContext extends ExpressionContext {
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public PayableConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnarySuffixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public UnarySuffixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ShiftOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Shl() { return getToken(SolidityParser.Shl, 0); }
		public TerminalNode Sar() { return getToken(SolidityParser.Sar, 0); }
		public TerminalNode Shr() { return getToken(SolidityParser.Shr, 0); }
		public ShiftOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(SolidityParser.BitAnd, 0); }
		public BitAndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexRangeAccessContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexRangeAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexAccessContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(SolidityParser.Add, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public AddSubOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(SolidityParser.BitOr, 0); }
		public BitOrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Exp() { return getToken(SolidityParser.Exp, 0); }
		public ExpOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(SolidityParser.And, 0); }
		public AndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InlineArrayContext extends ExpressionContext {
		public InlineArrayExpressionContext inlineArrayExpression() {
			return getRuleContext(InlineArrayExpressionContext.class,0);
		}
		public InlineArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(SolidityParser.Or, 0); }
		public OrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Period() { return getToken(SolidityParser.Period, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public MemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivModOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode Div() { return getToken(SolidityParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SolidityParser.Mod, 0); }
		public MulDivModOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallOptionsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public FunctionCallOptionsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXorOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitXor() { return getToken(SolidityParser.BitXor, 0); }
		public BitXorOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TupleContext extends ExpressionContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(SolidityParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SolidityParser.NotEqual, 0); }
		public EqualityComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MetaTypeContext extends ExpressionContext {
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MetaTypeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				_localctx = new PayableConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(729);
				match(Payable);
				setState(730);
				callArgumentList();
				}
				break;
			case 2:
				{
				_localctx = new MetaTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(731);
				match(Type);
				setState(732);
				match(LParen);
				setState(733);
				typeName(0);
				setState(734);
				match(RParen);
				}
				break;
			case 3:
				{
				_localctx = new UnaryPrefixOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736);
				_la = _input.LA(1);
				if ( !(_la==Delete || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Sub - 103)) | (1L << (Not - 103)) | (1L << (BitNot - 103)) | (1L << (Inc - 103)) | (1L << (Dec - 103)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(737);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(738);
				match(New);
				setState(739);
				typeName(0);
				}
				break;
			case 5:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(740);
				tupleExpression();
				}
				break;
			case 6:
				{
				_localctx = new InlineArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(741);
				inlineArrayExpression();
				}
				break;
			case 7:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(742);
					identifier();
					}
					break;
				case 2:
					{
					setState(743);
					literal();
					}
					break;
				case 3:
					{
					setState(744);
					elementaryTypeName(false);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(831);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(749);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(750);
						match(Exp);
						setState(751);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(753);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Mul - 104)) | (1L << (Div - 104)) | (1L << (Mod - 104)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(754);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(755);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(756);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(757);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ShiftOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(759);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (Shl - 99)) | (1L << (Sar - 99)) | (1L << (Shr - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(760);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BitAndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(761);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(762);
						match(BitAnd);
						setState(763);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BitXorOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(764);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(765);
						match(BitXor);
						setState(766);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BitOrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(768);
						match(BitOr);
						setState(769);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new OrderComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(771);
						_la = _input.LA(1);
						if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (LessThan - 110)) | (1L << (GreaterThan - 110)) | (1L << (LessThanOrEqual - 110)) | (1L << (GreaterThanOrEqual - 110)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(772);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EqualityComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(774);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(775);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new AndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(777);
						match(And);
						setState(778);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new OrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(780);
						match(Or);
						setState(781);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(782);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(783);
						match(Conditional);
						setState(784);
						expression(0);
						setState(785);
						match(Colon);
						setState(786);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(789);
						assignOp();
						setState(790);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(792);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(793);
						match(LBrack);
						setState(795);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(794);
							((IndexAccessContext)_localctx).index = expression(0);
							}
							break;
						}
						setState(797);
						match(RBrack);
						}
						break;
					case 15:
						{
						_localctx = new IndexRangeAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(798);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(799);
						match(LBrack);
						setState(801);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(800);
							((IndexRangeAccessContext)_localctx).start = expression(0);
							}
							break;
						}
						setState(803);
						match(Colon);
						setState(805);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(804);
							((IndexRangeAccessContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(807);
						match(RBrack);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(808);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(809);
						match(Period);
						setState(812);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Error:
						case Revert:
						case From:
						case Identifier:
							{
							setState(810);
							identifier();
							}
							break;
						case Address:
							{
							setState(811);
							match(Address);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new FunctionCallOptionsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(814);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(815);
						match(LBrace);
						setState(824);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
							{
							setState(816);
							namedArgument();
							setState(821);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(817);
								match(Comma);
								setState(818);
								namedArgument();
								}
								}
								setState(823);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(826);
						match(RBrace);
						}
						break;
					case 18:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(827);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(828);
						callArgumentList();
						}
						break;
					case 19:
						{
						_localctx = new UnarySuffixOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(829);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(830);
						_la = _input.LA(1);
						if ( !(_la==Inc || _la==Dec) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode AssignBitOr() { return getToken(SolidityParser.AssignBitOr, 0); }
		public TerminalNode AssignBitXor() { return getToken(SolidityParser.AssignBitXor, 0); }
		public TerminalNode AssignBitAnd() { return getToken(SolidityParser.AssignBitAnd, 0); }
		public TerminalNode AssignShl() { return getToken(SolidityParser.AssignShl, 0); }
		public TerminalNode AssignSar() { return getToken(SolidityParser.AssignSar, 0); }
		public TerminalNode AssignShr() { return getToken(SolidityParser.AssignShr, 0); }
		public TerminalNode AssignAdd() { return getToken(SolidityParser.AssignAdd, 0); }
		public TerminalNode AssignSub() { return getToken(SolidityParser.AssignSub, 0); }
		public TerminalNode AssignMul() { return getToken(SolidityParser.AssignMul, 0); }
		public TerminalNode AssignDiv() { return getToken(SolidityParser.AssignDiv, 0); }
		public TerminalNode AssignMod() { return getToken(SolidityParser.AssignMod, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Assign - 81)) | (1L << (AssignBitOr - 81)) | (1L << (AssignBitXor - 81)) | (1L << (AssignBitAnd - 81)) | (1L << (AssignShl - 81)) | (1L << (AssignSar - 81)) | (1L << (AssignShr - 81)) | (1L << (AssignAdd - 81)) | (1L << (AssignSub - 81)) | (1L << (AssignMul - 81)) | (1L << (AssignDiv - 81)) | (1L << (AssignMod - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(LParen);
			{
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(839);
				expression(0);
				}
				break;
			}
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(842);
				match(Comma);
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(843);
					expression(0);
					}
					break;
				}
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(851);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InlineArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineArrayExpression; }
	}

	public final InlineArrayExpressionContext inlineArrayExpression() throws RecognitionException {
		InlineArrayExpressionContext _localctx = new InlineArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inlineArrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(LBrack);
			{
			setState(854);
			expression(0);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(855);
				match(Comma);
				setState(856);
				expression(0);
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(862);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public HexStringLiteralContext hexStringLiteral() {
			return getRuleContext(HexStringLiteralContext.class,0);
		}
		public UnicodeStringLiteralContext unicodeStringLiteral() {
			return getRuleContext(UnicodeStringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
			case EmptyStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				stringLiteral();
				}
				break;
			case HexNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				numberLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				booleanLiteral();
				}
				break;
			case HexString:
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				hexStringLiteral();
				}
				break;
			case UnicodeStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				unicodeStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(SolidityParser.True, 0); }
		public TerminalNode False() { return getToken(SolidityParser.False, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NonEmptyStringLiteral() { return getTokens(SolidityParser.NonEmptyStringLiteral); }
		public TerminalNode NonEmptyStringLiteral(int i) {
			return getToken(SolidityParser.NonEmptyStringLiteral, i);
		}
		public List<TerminalNode> EmptyStringLiteral() { return getTokens(SolidityParser.EmptyStringLiteral); }
		public TerminalNode EmptyStringLiteral(int i) {
			return getToken(SolidityParser.EmptyStringLiteral, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(876); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(875);
					_la = _input.LA(1);
					if ( !(_la==NonEmptyStringLiteral || _la==EmptyStringLiteral) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(878); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexString() { return getTokens(SolidityParser.HexString); }
		public TerminalNode HexString(int i) {
			return getToken(SolidityParser.HexString, i);
		}
		public HexStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexStringLiteral; }
	}

	public final HexStringLiteralContext hexStringLiteral() throws RecognitionException {
		HexStringLiteralContext _localctx = new HexStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_hexStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(881); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(880);
					match(HexString);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(883); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnicodeStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> UnicodeStringLiteral() { return getTokens(SolidityParser.UnicodeStringLiteral); }
		public TerminalNode UnicodeStringLiteral(int i) {
			return getToken(SolidityParser.UnicodeStringLiteral, i);
		}
		public UnicodeStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeStringLiteral; }
	}

	public final UnicodeStringLiteralContext unicodeStringLiteral() throws RecognitionException {
		UnicodeStringLiteralContext _localctx = new UnicodeStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unicodeStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					match(UnicodeStringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(888); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_la = _input.LA(1);
			if ( !(_la==HexNumber || _la==DecimalNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(891);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(LBrace);
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(897);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(895);
						statement();
						}
						break;
					case 2:
						{
						setState(896);
						uncheckedBlock();
						}
						break;
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(902);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UncheckedBlockContext extends ParserRuleContext {
		public TerminalNode Unchecked() { return getToken(SolidityParser.Unchecked, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(Unchecked);
			setState(905);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public AssemblyStatementContext assemblyStatement() {
			return getRuleContext(AssemblyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_statement);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				simpleStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(911);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(912);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(913);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(914);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(915);
				tryStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(916);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(917);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(918);
				revertStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(919);
				assemblyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_simpleStatement);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(If);
			setState(927);
			match(LParen);
			setState(928);
			expression(0);
			setState(929);
			match(RParen);
			setState(930);
			statement();
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(931);
				match(Else);
				setState(932);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SolidityParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SolidityParser.Semicolon, i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(For);
			setState(936);
			match(LParen);
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(937);
				simpleStatement();
				}
				break;
			case 2:
				{
				setState(938);
				match(Semicolon);
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(941);
				expressionStatement();
				}
				break;
			case 2:
				{
				setState(942);
				match(Semicolon);
				}
				break;
			}
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(945);
				expression(0);
				}
				break;
			}
			setState(948);
			match(RParen);
			setState(949);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(While);
			setState(952);
			match(LParen);
			setState(953);
			expression(0);
			setState(954);
			match(RParen);
			setState(955);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(Do);
			setState(958);
			statement();
			setState(959);
			match(While);
			setState(960);
			match(LParen);
			setState(961);
			expression(0);
			setState(962);
			match(RParen);
			setState(963);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(Continue);
			setState(966);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(Break);
			setState(969);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public ParameterListContext returnParameters;
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(Try);
			setState(972);
			expression(0);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(973);
				match(Returns);
				setState(974);
				match(LParen);
				setState(975);
				((TryStatementContext)_localctx).returnParameters = parameterList();
				setState(976);
				match(RParen);
				}
			}

			setState(980);
			block();
			setState(982); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(981);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(984); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext arguments;
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(Catch);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==LParen || _la==Identifier) {
				{
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
					{
					setState(987);
					identifier();
					}
				}

				setState(990);
				match(LParen);
				{
				setState(991);
				((CatchClauseContext)_localctx).arguments = parameterList();
				}
				setState(992);
				match(RParen);
				}
			}

			setState(996);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(Return);
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(999);
				expression(0);
				}
				break;
			}
			setState(1002);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public TerminalNode Emit() { return getToken(SolidityParser.Emit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(Emit);
			setState(1005);
			expression(0);
			setState(1006);
			callArgumentList();
			setState(1007);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevertStatementContext extends ParserRuleContext {
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(Revert);
			setState(1010);
			expression(0);
			setState(1011);
			callArgumentList();
			setState(1012);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStatementContext extends ParserRuleContext {
		public TerminalNode Assembly() { return getToken(SolidityParser.Assembly, 0); }
		public TerminalNode AssemblyLBrace() { return getToken(SolidityParser.AssemblyLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public TerminalNode AssemblyDialect() { return getToken(SolidityParser.AssemblyDialect, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public AssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStatement; }
	}

	public final AssemblyStatementContext assemblyStatement() throws RecognitionException {
		AssemblyStatementContext _localctx = new AssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(Assembly);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyDialect) {
				{
				setState(1015);
				match(AssemblyDialect);
				}
			}

			setState(1018);
			match(AssemblyLBrace);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (YulBreak - 135)) | (1L << (YulContinue - 135)) | (1L << (YulFor - 135)) | (1L << (YulFunction - 135)) | (1L << (YulIf - 135)) | (1L << (YulLeave - 135)) | (1L << (YulLet - 135)) | (1L << (YulSwitch - 135)) | (1L << (YulEVMBuiltin - 135)) | (1L << (YulLBrace - 135)) | (1L << (YulIdentifier - 135)))) != 0)) {
				{
				{
				setState(1019);
				yulStatement();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			match(YulRBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1028);
				match(Comma);
				setState(1029);
				((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
				((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationTupleContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationTuple; }
	}

	public final VariableDeclarationTupleContext variableDeclarationTuple() throws RecognitionException {
		VariableDeclarationTupleContext _localctx = new VariableDeclarationTupleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclarationTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(LParen);
			{
			setState(1039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036);
					match(Comma);
					}
					} 
				}
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(1042);
			((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
			}
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1044);
				match(Comma);
				setState(1046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1045);
					((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
					((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
					}
					break;
				}
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1053);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationTupleContext variableDeclarationTuple() {
			return getRuleContext(VariableDeclarationTupleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				{
				setState(1055);
				variableDeclaration();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1056);
					match(Assign);
					setState(1057);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1060);
				variableDeclarationTuple();
				setState(1061);
				match(Assign);
				setState(1062);
				expression(0);
				}
				}
				break;
			}
			setState(1066);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			expression(0);
			setState(1069);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingTypeContext extends ParserRuleContext {
		public MappingKeyTypeContext key;
		public TypeNameContext value;
		public TerminalNode Mapping() { return getToken(SolidityParser.Mapping, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode DoubleArrow() { return getToken(SolidityParser.DoubleArrow, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MappingKeyTypeContext mappingKeyType() {
			return getRuleContext(MappingKeyTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_mappingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(Mapping);
			setState(1072);
			match(LParen);
			setState(1073);
			((MappingTypeContext)_localctx).key = mappingKeyType();
			setState(1074);
			match(DoubleArrow);
			setState(1075);
			((MappingTypeContext)_localctx).value = typeName(0);
			setState(1076);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingKeyTypeContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public MappingKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyType; }
	}

	public final MappingKeyTypeContext mappingKeyType() throws RecognitionException {
		MappingKeyTypeContext _localctx = new MappingKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_mappingKeyType);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				elementaryTypeName(false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				identifierPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulStatementContext extends ParserRuleContext {
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulVariableDeclarationContext yulVariableDeclaration() {
			return getRuleContext(YulVariableDeclarationContext.class,0);
		}
		public YulAssignmentContext yulAssignment() {
			return getRuleContext(YulAssignmentContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulIfStatementContext yulIfStatement() {
			return getRuleContext(YulIfStatementContext.class,0);
		}
		public YulForStatementContext yulForStatement() {
			return getRuleContext(YulForStatementContext.class,0);
		}
		public YulSwitchStatementContext yulSwitchStatement() {
			return getRuleContext(YulSwitchStatementContext.class,0);
		}
		public TerminalNode YulLeave() { return getToken(SolidityParser.YulLeave, 0); }
		public TerminalNode YulBreak() { return getToken(SolidityParser.YulBreak, 0); }
		public TerminalNode YulContinue() { return getToken(SolidityParser.YulContinue, 0); }
		public YulFunctionDefinitionContext yulFunctionDefinition() {
			return getRuleContext(YulFunctionDefinitionContext.class,0);
		}
		public YulStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulStatement; }
	}

	public final YulStatementContext yulStatement() throws RecognitionException {
		YulStatementContext _localctx = new YulStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_yulStatement);
		try {
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				yulBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				yulVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				yulAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1085);
				yulFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1086);
				yulIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1087);
				yulForStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1088);
				yulSwitchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1089);
				match(YulLeave);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1090);
				match(YulBreak);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1091);
				match(YulContinue);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1092);
				yulFunctionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulBlockContext extends ParserRuleContext {
		public TerminalNode YulLBrace() { return getToken(SolidityParser.YulLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public YulBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBlock; }
	}

	public final YulBlockContext yulBlock() throws RecognitionException {
		YulBlockContext _localctx = new YulBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_yulBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(YulLBrace);
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (YulBreak - 135)) | (1L << (YulContinue - 135)) | (1L << (YulFor - 135)) | (1L << (YulFunction - 135)) | (1L << (YulIf - 135)) | (1L << (YulLeave - 135)) | (1L << (YulLet - 135)) | (1L << (YulSwitch - 135)) | (1L << (YulEVMBuiltin - 135)) | (1L << (YulLBrace - 135)) | (1L << (YulIdentifier - 135)))) != 0)) {
				{
				{
				setState(1096);
				yulStatement();
				}
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1102);
			match(YulRBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulVariableDeclarationContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> variables = new ArrayList<Token>();
		public TerminalNode YulLet() { return getToken(SolidityParser.YulLet, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulVariableDeclaration; }
	}

	public final YulVariableDeclarationContext yulVariableDeclaration() throws RecognitionException {
		YulVariableDeclarationContext _localctx = new YulVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_yulVariableDeclaration);
		int _la;
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1104);
				match(YulLet);
				setState(1105);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1106);
					match(YulAssign);
					setState(1107);
					yulExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1110);
				match(YulLet);
				setState(1111);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1112);
					match(YulComma);
					setState(1113);
					((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1119);
					match(YulAssign);
					setState(1120);
					yulFunctionCall();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulAssignmentContext extends ParserRuleContext {
		public List<YulPathContext> yulPath() {
			return getRuleContexts(YulPathContext.class);
		}
		public YulPathContext yulPath(int i) {
			return getRuleContext(YulPathContext.class,i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulAssignment; }
	}

	public final YulAssignmentContext yulAssignment() throws RecognitionException {
		YulAssignmentContext _localctx = new YulAssignmentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_yulAssignment);
		int _la;
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				yulPath();
				setState(1126);
				match(YulAssign);
				setState(1127);
				yulExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1129);
				yulPath();
				setState(1132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1130);
					match(YulComma);
					setState(1131);
					yulPath();
					}
					}
					setState(1134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulComma );
				}
				setState(1136);
				match(YulAssign);
				setState(1137);
				yulFunctionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulIfStatementContext extends ParserRuleContext {
		public YulExpressionContext cond;
		public YulBlockContext body;
		public TerminalNode YulIf() { return getToken(SolidityParser.YulIf, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulIfStatement; }
	}

	public final YulIfStatementContext yulIfStatement() throws RecognitionException {
		YulIfStatementContext _localctx = new YulIfStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_yulIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(YulIf);
			setState(1142);
			((YulIfStatementContext)_localctx).cond = yulExpression();
			setState(1143);
			((YulIfStatementContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulForStatementContext extends ParserRuleContext {
		public YulBlockContext init;
		public YulExpressionContext cond;
		public YulBlockContext post;
		public YulBlockContext body;
		public TerminalNode YulFor() { return getToken(SolidityParser.YulFor, 0); }
		public List<YulBlockContext> yulBlock() {
			return getRuleContexts(YulBlockContext.class);
		}
		public YulBlockContext yulBlock(int i) {
			return getRuleContext(YulBlockContext.class,i);
		}
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulForStatement; }
	}

	public final YulForStatementContext yulForStatement() throws RecognitionException {
		YulForStatementContext _localctx = new YulForStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yulForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(YulFor);
			setState(1146);
			((YulForStatementContext)_localctx).init = yulBlock();
			setState(1147);
			((YulForStatementContext)_localctx).cond = yulExpression();
			setState(1148);
			((YulForStatementContext)_localctx).post = yulBlock();
			setState(1149);
			((YulForStatementContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulSwitchCaseContext extends ParserRuleContext {
		public TerminalNode YulCase() { return getToken(SolidityParser.YulCase, 0); }
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchCase; }
	}

	public final YulSwitchCaseContext yulSwitchCase() throws RecognitionException {
		YulSwitchCaseContext _localctx = new YulSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_yulSwitchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(YulCase);
			setState(1152);
			yulLiteral();
			setState(1153);
			yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulSwitchStatementContext extends ParserRuleContext {
		public TerminalNode YulSwitch() { return getToken(SolidityParser.YulSwitch, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public TerminalNode YulDefault() { return getToken(SolidityParser.YulDefault, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public List<YulSwitchCaseContext> yulSwitchCase() {
			return getRuleContexts(YulSwitchCaseContext.class);
		}
		public YulSwitchCaseContext yulSwitchCase(int i) {
			return getRuleContext(YulSwitchCaseContext.class,i);
		}
		public YulSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchStatement; }
	}

	public final YulSwitchStatementContext yulSwitchStatement() throws RecognitionException {
		YulSwitchStatementContext _localctx = new YulSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_yulSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(YulSwitch);
			setState(1156);
			yulExpression();
			setState(1168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulCase:
				{
				{
				setState(1158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1157);
					yulSwitchCase();
					}
					}
					setState(1160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulCase );
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulDefault) {
					{
					setState(1162);
					match(YulDefault);
					setState(1163);
					yulBlock();
					}
				}

				}
				}
				break;
			case YulDefault:
				{
				{
				setState(1166);
				match(YulDefault);
				setState(1167);
				yulBlock();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulFunctionDefinitionContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> arguments = new ArrayList<Token>();
		public List<Token> returnParameters = new ArrayList<Token>();
		public YulBlockContext body;
		public TerminalNode YulFunction() { return getToken(SolidityParser.YulFunction, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public TerminalNode YulArrow() { return getToken(SolidityParser.YulArrow, 0); }
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionDefinition; }
	}

	public final YulFunctionDefinitionContext yulFunctionDefinition() throws RecognitionException {
		YulFunctionDefinitionContext _localctx = new YulFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_yulFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(YulFunction);
			setState(1171);
			match(YulIdentifier);
			setState(1172);
			match(YulLParen);
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulIdentifier) {
				{
				setState(1173);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1174);
					match(YulComma);
					setState(1175);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1183);
			match(YulRParen);
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulArrow) {
				{
				setState(1184);
				match(YulArrow);
				setState(1185);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1186);
					match(YulComma);
					setState(1187);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1195);
			((YulFunctionDefinitionContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulPathContext extends ParserRuleContext {
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public List<TerminalNode> YulPeriod() { return getTokens(SolidityParser.YulPeriod); }
		public TerminalNode YulPeriod(int i) {
			return getToken(SolidityParser.YulPeriod, i);
		}
		public YulPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulPath; }
	}

	public final YulPathContext yulPath() throws RecognitionException {
		YulPathContext _localctx = new YulPathContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_yulPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(YulIdentifier);
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YulPeriod) {
				{
				{
				setState(1198);
				match(YulPeriod);
				setState(1199);
				match(YulIdentifier);
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulFunctionCallContext extends ParserRuleContext {
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public TerminalNode YulIdentifier() { return getToken(SolidityParser.YulIdentifier, 0); }
		public TerminalNode YulEVMBuiltin() { return getToken(SolidityParser.YulEVMBuiltin, 0); }
		public List<YulExpressionContext> yulExpression() {
			return getRuleContexts(YulExpressionContext.class);
		}
		public YulExpressionContext yulExpression(int i) {
			return getRuleContext(YulExpressionContext.class,i);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionCall; }
	}

	public final YulFunctionCallContext yulFunctionCall() throws RecognitionException {
		YulFunctionCallContext _localctx = new YulFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_yulFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_la = _input.LA(1);
			if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1206);
			match(YulLParen);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (YulFalse - 139)) | (1L << (YulTrue - 139)) | (1L << (YulEVMBuiltin - 139)) | (1L << (YulIdentifier - 139)) | (1L << (YulHexNumber - 139)) | (1L << (YulDecimalNumber - 139)) | (1L << (YulStringLiteral - 139)) | (1L << (YulHexStringLiteral - 139)))) != 0)) {
				{
				setState(1207);
				yulExpression();
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1208);
					match(YulComma);
					setState(1209);
					yulExpression();
					}
					}
					setState(1214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1217);
			match(YulRParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulBooleanContext extends ParserRuleContext {
		public TerminalNode YulTrue() { return getToken(SolidityParser.YulTrue, 0); }
		public TerminalNode YulFalse() { return getToken(SolidityParser.YulFalse, 0); }
		public YulBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBoolean; }
	}

	public final YulBooleanContext yulBoolean() throws RecognitionException {
		YulBooleanContext _localctx = new YulBooleanContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yulBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			_la = _input.LA(1);
			if ( !(_la==YulFalse || _la==YulTrue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulLiteralContext extends ParserRuleContext {
		public TerminalNode YulDecimalNumber() { return getToken(SolidityParser.YulDecimalNumber, 0); }
		public TerminalNode YulStringLiteral() { return getToken(SolidityParser.YulStringLiteral, 0); }
		public TerminalNode YulHexNumber() { return getToken(SolidityParser.YulHexNumber, 0); }
		public YulBooleanContext yulBoolean() {
			return getRuleContext(YulBooleanContext.class,0);
		}
		public TerminalNode YulHexStringLiteral() { return getToken(SolidityParser.YulHexStringLiteral, 0); }
		public YulLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulLiteral; }
	}

	public final YulLiteralContext yulLiteral() throws RecognitionException {
		YulLiteralContext _localctx = new YulLiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yulLiteral);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulDecimalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(YulDecimalNumber);
				}
				break;
			case YulStringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				match(YulStringLiteral);
				}
				break;
			case YulHexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				match(YulHexNumber);
				}
				break;
			case YulFalse:
			case YulTrue:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224);
				yulBoolean();
				}
				break;
			case YulHexStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1225);
				match(YulHexStringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulExpressionContext extends ParserRuleContext {
		public YulPathContext yulPath() {
			return getRuleContext(YulPathContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulExpression; }
	}

	public final YulExpressionContext yulExpression() throws RecognitionException {
		YulExpressionContext _localctx = new YulExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_yulExpression);
		try {
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				yulPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				yulFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230);
				yulLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return constructorDefinition_sempred((ConstructorDefinitionContext)_localctx, predIndex);
		case 22:
			return functionDefinition_sempred((FunctionDefinitionContext)_localctx, predIndex);
		case 23:
			return modifierDefinition_sempred((ModifierDefinitionContext)_localctx, predIndex);
		case 24:
			return fallbackFunctionDefinition_sempred((FallbackFunctionDefinitionContext)_localctx, predIndex);
		case 25:
			return receiveFunctionDefinition_sempred((ReceiveFunctionDefinitionContext)_localctx, predIndex);
		case 29:
			return stateVariableDeclaration_sempred((StateVariableDeclarationContext)_localctx, predIndex);
		case 36:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 37:
			return elementaryTypeName_sempred((ElementaryTypeNameContext)_localctx, predIndex);
		case 38:
			return functionTypeName_sempred((FunctionTypeNameContext)_localctx, predIndex);
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constructorDefinition_sempred(ConstructorDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.payableSet;
		case 1:
			return !_localctx.visibilitySet;
		case 2:
			return !_localctx.visibilitySet;
		}
		return true;
	}
	private boolean functionDefinition_sempred(FunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_localctx.visibilitySet;
		case 4:
			return !_localctx.mutabilitySet;
		case 5:
			return !_localctx.virtualSet;
		case 6:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean modifierDefinition_sempred(ModifierDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_localctx.virtualSet;
		case 8:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean fallbackFunctionDefinition_sempred(FallbackFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_localctx.visibilitySet;
		case 10:
			return !_localctx.mutabilitySet;
		case 11:
			return !_localctx.virtualSet;
		case 12:
			return !_localctx.overrideSpecifierSet;
		case 13:
			return _localctx.hasParameters;
		case 14:
			return !_localctx.hasParameters;
		}
		return true;
	}
	private boolean receiveFunctionDefinition_sempred(ReceiveFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return !_localctx.visibilitySet;
		case 16:
			return !_localctx.mutabilitySet;
		case 17:
			return !_localctx.virtualSet;
		case 18:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean stateVariableDeclaration_sempred(StateVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !_localctx.visibilitySet;
		case 20:
			return !_localctx.visibilitySet;
		case 21:
			return !_localctx.visibilitySet;
		case 22:
			return !_localctx.constantnessSet;
		case 23:
			return !_localctx.overrideSpecifierSet;
		case 24:
			return !_localctx.constantnessSet;
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementaryTypeName_sempred(ElementaryTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return _localctx.allowAddressPayable;
		}
		return true;
	}
	private boolean functionTypeName_sempred(FunctionTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return !_localctx.visibilitySet;
		case 28:
			return !_localctx.mutabilitySet;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 17);
		case 30:
			return precpred(_ctx, 16);
		case 31:
			return precpred(_ctx, 15);
		case 32:
			return precpred(_ctx, 14);
		case 33:
			return precpred(_ctx, 13);
		case 34:
			return precpred(_ctx, 12);
		case 35:
			return precpred(_ctx, 11);
		case 36:
			return precpred(_ctx, 10);
		case 37:
			return precpred(_ctx, 9);
		case 38:
			return precpred(_ctx, 8);
		case 39:
			return precpred(_ctx, 7);
		case 40:
			return precpred(_ctx, 6);
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 26);
		case 43:
			return precpred(_ctx, 25);
		case 44:
			return precpred(_ctx, 24);
		case 45:
			return precpred(_ctx, 23);
		case 46:
			return precpred(_ctx, 22);
		case 47:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u04d4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\u00bd\n\2\f\2\16\2\u00c0\13\2\3\2\3\2\3\3\3\3\6\3\u00c6\n\3\r\3\16"+
		"\3\u00c7\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00d0\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u00e3\n\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\7\7\u00eb\n\7\f\7\16\7\u00ee\13\7\3\7\3\7\3\b\5\b\u00f3"+
		"\n\b\3\b\3\b\3\b\5\b\u00f8\n\b\3\b\3\b\7\b\u00fc\n\b\f\b\16\b\u00ff\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u0106\n\t\3\t\3\t\7\t\u010a\n\t\f\t\16\t\u010d"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0115\n\n\f\n\16\n\u0118\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13\u0120\n\13\f\13\16\13\u0123\13\13\3\f\3\f"+
		"\5\f\u0127\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0134\n"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u013e\n\17\f\17\16\17"+
		"\u0141\13\17\5\17\u0143\n\17\3\17\3\17\3\17\3\17\7\17\u0149\n\17\f\17"+
		"\16\17\u014c\13\17\5\17\u014e\n\17\3\17\5\17\u0151\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u0158\n\20\f\20\16\20\u015b\13\20\3\21\3\21\5\21\u015f"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u0166\n\23\f\23\16\23\u0169\13\23"+
		"\3\24\3\24\5\24\u016d\n\24\3\24\5\24\u0170\n\24\3\25\3\25\3\25\5\25\u0175"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0182"+
		"\n\25\f\25\16\25\u0185\13\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0190\n\27\f\27\16\27\u0193\13\27\3\27\3\27\5\27\u0197\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u019d\n\30\3\30\3\30\5\30\u01a1\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u01b4\n\30\f\30\16\30\u01b7\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01be\n\30\3\30\3\30\5\30\u01c2\n\30\3\31\3\31\3\31\3\31\5\31\u01c8"+
		"\n\31\3\31\5\31\u01cb\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01d4"+
		"\n\31\f\31\16\31\u01d7\13\31\3\31\3\31\5\31\u01db\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u01e2\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01f4\n\32\f\32\16\32\u01f7\13"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0200\n\32\3\32\3\32\5\32"+
		"\u0204\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0217\n\33\f\33\16\33\u021a\13\33\3\33"+
		"\3\33\5\33\u021e\n\33\3\34\3\34\3\34\3\34\6\34\u0224\n\34\r\34\16\34\u0225"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0234"+
		"\n\36\f\36\16\36\u0237\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7"+
		"\37\u024f\n\37\f\37\16\37\u0252\13\37\3\37\3\37\3\37\5\37\u0257\n\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\5!\u0264\n!\3!\5!\u0267\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\7\"\u026f\n\"\f\"\16\"\u0272\13\"\5\"\u0274\n\"\3\"\3"+
		"\"\5\"\u0278\n\"\3\"\3\"\3#\3#\5#\u027e\n#\3$\3$\3$\3$\3$\3$\7$\u0286"+
		"\n$\f$\16$\u0289\13$\5$\u028b\n$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0295\n%\3"+
		"%\3%\3&\3&\3&\3&\3&\5&\u029e\n&\3&\3&\3&\5&\u02a3\n&\3&\7&\u02a6\n&\f"+
		"&\16&\u02a9\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02b7"+
		"\n\'\3(\3(\3(\5(\u02bc\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u02c7\n(\f(\16"+
		"(\u02ca\13(\3(\3(\3(\3(\3(\5(\u02d1\n(\3)\3)\5)\u02d5\n)\3)\3)\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02ec\n+\5+\u02ee"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u031e\n+\3+\3+\3+\3+\5+\u0324\n+\3+\3+\5+\u0328\n+\3+\3+\3+\3+"+
		"\3+\5+\u032f\n+\3+\3+\3+\3+\3+\7+\u0336\n+\f+\16+\u0339\13+\5+\u033b\n"+
		"+\3+\3+\3+\3+\3+\7+\u0342\n+\f+\16+\u0345\13+\3,\3,\3-\3-\5-\u034b\n-"+
		"\3-\3-\5-\u034f\n-\7-\u0351\n-\f-\16-\u0354\13-\3-\3-\3.\3.\3.\3.\7.\u035c"+
		"\n.\f.\16.\u035f\13.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u036a\n"+
		"\60\3\61\3\61\3\62\6\62\u036f\n\62\r\62\16\62\u0370\3\63\6\63\u0374\n"+
		"\63\r\63\16\63\u0375\3\64\6\64\u0379\n\64\r\64\16\64\u037a\3\65\3\65\5"+
		"\65\u037f\n\65\3\66\3\66\3\66\7\66\u0384\n\66\f\66\16\66\u0387\13\66\3"+
		"\66\3\66\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u039b"+
		"\n8\39\39\59\u039f\n9\3:\3:\3:\3:\3:\3:\3:\5:\u03a8\n:\3;\3;\3;\3;\5;"+
		"\u03ae\n;\3;\3;\5;\u03b2\n;\3;\5;\u03b5\n;\3;\3;\3;\3<\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u03d5"+
		"\n@\3@\3@\6@\u03d9\n@\r@\16@\u03da\3A\3A\5A\u03df\nA\3A\3A\3A\3A\5A\u03e5"+
		"\nA\3A\3A\3B\3B\5B\u03eb\nB\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E"+
		"\5E\u03fb\nE\3E\3E\7E\u03ff\nE\fE\16E\u0402\13E\3E\3E\3F\3F\3F\7F\u0409"+
		"\nF\fF\16F\u040c\13F\3G\3G\7G\u0410\nG\fG\16G\u0413\13G\3G\3G\3G\3G\5"+
		"G\u0419\nG\7G\u041b\nG\fG\16G\u041e\13G\3G\3G\3H\3H\3H\5H\u0425\nH\3H"+
		"\3H\3H\3H\5H\u042b\nH\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\5K\u043b"+
		"\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0448\nL\3M\3M\7M\u044c\nM\fM"+
		"\16M\u044f\13M\3M\3M\3N\3N\3N\3N\5N\u0457\nN\3N\3N\3N\3N\7N\u045d\nN\f"+
		"N\16N\u0460\13N\3N\3N\5N\u0464\nN\5N\u0466\nN\3O\3O\3O\3O\3O\3O\3O\6O"+
		"\u046f\nO\rO\16O\u0470\3O\3O\3O\5O\u0476\nO\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3R\3R\3R\3R\3S\3S\3S\6S\u0489\nS\rS\16S\u048a\3S\3S\5S\u048f\nS\3"+
		"S\3S\5S\u0493\nS\3T\3T\3T\3T\3T\3T\7T\u049b\nT\fT\16T\u049e\13T\5T\u04a0"+
		"\nT\3T\3T\3T\3T\3T\7T\u04a7\nT\fT\16T\u04aa\13T\5T\u04ac\nT\3T\3T\3U\3"+
		"U\3U\7U\u04b3\nU\fU\16U\u04b6\13U\3V\3V\3V\3V\3V\7V\u04bd\nV\fV\16V\u04c0"+
		"\13V\5V\u04c2\nV\3V\3V\3W\3W\3X\3X\3X\3X\3X\5X\u04cd\nX\3Y\3Y\3Y\5Y\u04d2"+
		"\nY\3Y\3\u0121\4JTZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\23\5\2\33\33"+
		"))\63\64\5\2\62\62\65\65DD\5\2\r\r--::\5\2\23\23iitw\3\2jl\3\2hi\3\2e"+
		"g\3\2ps\3\2no\3\2vw\3\2S^\5\2\30\31\37\37\u0080\u0080\4\2\35\35==\3\2"+
		"z{\3\2~\177\4\2\u0096\u0096\u009f\u009f\4\2\u008d\u008d\u0094\u0094\2"+
		"\u055f\2\u00be\3\2\2\2\4\u00c3\3\2\2\2\6\u00cb\3\2\2\2\b\u00df\3\2\2\2"+
		"\n\u00e4\3\2\2\2\f\u00e6\3\2\2\2\16\u00f2\3\2\2\2\20\u0102\3\2\2\2\22"+
		"\u0110\3\2\2\2\24\u011b\3\2\2\2\26\u0124\3\2\2\2\30\u0133\3\2\2\2\32\u0135"+
		"\3\2\2\2\34\u0139\3\2\2\2\36\u0154\3\2\2\2 \u015c\3\2\2\2\"\u0160\3\2"+
		"\2\2$\u0162\3\2\2\2&\u016a\3\2\2\2(\u0171\3\2\2\2*\u0188\3\2\2\2,\u018a"+
		"\3\2\2\2.\u0198\3\2\2\2\60\u01c3\3\2\2\2\62\u01dc\3\2\2\2\64\u0205\3\2"+
		"\2\2\66\u021f\3\2\2\28\u0229\3\2\2\2:\u022d\3\2\2\2<\u023a\3\2\2\2>\u025a"+
		"\3\2\2\2@\u0261\3\2\2\2B\u0268\3\2\2\2D\u027b\3\2\2\2F\u027f\3\2\2\2H"+
		"\u028f\3\2\2\2J\u029d\3\2\2\2L\u02b6\3\2\2\2N\u02b8\3\2\2\2P\u02d2\3\2"+
		"\2\2R\u02d8\3\2\2\2T\u02ed\3\2\2\2V\u0346\3\2\2\2X\u0348\3\2\2\2Z\u0357"+
		"\3\2\2\2\\\u0362\3\2\2\2^\u0369\3\2\2\2`\u036b\3\2\2\2b\u036e\3\2\2\2"+
		"d\u0373\3\2\2\2f\u0378\3\2\2\2h\u037c\3\2\2\2j\u0380\3\2\2\2l\u038a\3"+
		"\2\2\2n\u039a\3\2\2\2p\u039e\3\2\2\2r\u03a0\3\2\2\2t\u03a9\3\2\2\2v\u03b9"+
		"\3\2\2\2x\u03bf\3\2\2\2z\u03c7\3\2\2\2|\u03ca\3\2\2\2~\u03cd\3\2\2\2\u0080"+
		"\u03dc\3\2\2\2\u0082\u03e8\3\2\2\2\u0084\u03ee\3\2\2\2\u0086\u03f3\3\2"+
		"\2\2\u0088\u03f8\3\2\2\2\u008a\u0405\3\2\2\2\u008c\u040d\3\2\2\2\u008e"+
		"\u042a\3\2\2\2\u0090\u042e\3\2\2\2\u0092\u0431\3\2\2\2\u0094\u043a\3\2"+
		"\2\2\u0096\u0447\3\2\2\2\u0098\u0449\3\2\2\2\u009a\u0465\3\2\2\2\u009c"+
		"\u0475\3\2\2\2\u009e\u0477\3\2\2\2\u00a0\u047b\3\2\2\2\u00a2\u0481\3\2"+
		"\2\2\u00a4\u0485\3\2\2\2\u00a6\u0494\3\2\2\2\u00a8\u04af\3\2\2\2\u00aa"+
		"\u04b7\3\2\2\2\u00ac\u04c5\3\2\2\2\u00ae\u04cc\3\2\2\2\u00b0\u04d1\3\2"+
		"\2\2\u00b2\u00bd\5\4\3\2\u00b3\u00bd\5\6\4\2\u00b4\u00bd\5\16\b\2\u00b5"+
		"\u00bd\5\20\t\2\u00b6\u00bd\5\22\n\2\u00b7\u00bd\5.\30\2\u00b8\u00bd\5"+
		"> \2\u00b9\u00bd\5\66\34\2\u00ba\u00bd\5:\36\2\u00bb\u00bd\5F$\2\u00bc"+
		"\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5\3\2"+
		"\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\2\2\3\u00c2\3\3\2\2\2\u00c3\u00c5\7\4\2\2"+
		"\u00c4\u00c6\7\u00a7\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\u00a8"+
		"\2\2\u00ca\5\3\2\2\2\u00cb\u00db\7&\2\2\u00cc\u00cf\5\n\6\2\u00cd\u00ce"+
		"\7\b\2\2\u00ce\u00d0\5\\/\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00dc\3\2\2\2\u00d1\u00d2\5\f\7\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\5"+
		"\n\6\2\u00d4\u00dc\3\2\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7\b\2\2\u00d7"+
		"\u00d8\5\\/\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\5\n\6\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00cc\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7N\2\2\u00de\7\3\2\2\2\u00df\u00e2\5\\/\2\u00e0"+
		"\u00e1\7\b\2\2\u00e1\u00e3\5\\/\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\t\3\2\2\2\u00e4\u00e5\7z\2\2\u00e5\13\3\2\2\2\u00e6\u00e7\7"+
		"K\2\2\u00e7\u00ec\5\b\5\2\u00e8\u00e9\7_\2\2\u00e9\u00eb\5\b\5\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7L\2\2\u00f0"+
		"\r\3\2\2\2\u00f1\u00f3\7\5\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\22\2\2\u00f5\u00f7\5\\/\2\u00f6\u00f8"+
		"\5\24\13\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fd\7K\2\2\u00fa\u00fc\5\30\r\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7L\2\2\u0101\17\3\2\2\2\u0102\u0103\7(\2\2"+
		"\u0103\u0105\5\\/\2\u0104\u0106\5\24\13\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010b\7K\2\2\u0108\u010a\5\30\r\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7L\2\2\u010f"+
		"\21\3\2\2\2\u0110\u0111\7+\2\2\u0111\u0112\5\\/\2\u0112\u0116\7K\2\2\u0113"+
		"\u0115\5\30\r\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7L\2\2\u011a\23\3\2\2\2\u011b\u011c\7*\2\2\u011c\u0121\5\26\f\2"+
		"\u011d\u011e\7_\2\2\u011e\u0120\5\26\f\2\u011f\u011d\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\25\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0126\5\36\20\2\u0125\u0127\5\34\17\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\27\3\2\2\2\u0128\u0134\5(\25\2\u0129"+
		"\u0134\5.\30\2\u012a\u0134\5\60\31\2\u012b\u0134\5\62\32\2\u012c\u0134"+
		"\5\64\33\2\u012d\u0134\5\66\34\2\u012e\u0134\5:\36\2\u012f\u0134\5<\37"+
		"\2\u0130\u0134\5B\"\2\u0131\u0134\5F$\2\u0132\u0134\5H%\2\u0133\u0128"+
		"\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2"+
		"\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\31\3\2\2\2\u0135\u0136\5\\/\2\u0136\u0137\7M\2\2\u0137\u0138\5T+\2\u0138"+
		"\33\3\2\2\2\u0139\u0150\7G\2\2\u013a\u013f\5T+\2\u013b\u013c\7_\2\2\u013c"+
		"\u013e\5T+\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u013a"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0151\3\2\2\2\u0144\u014d\7K\2\2\u0145"+
		"\u014a\5\32\16\2\u0146\u0147\7_\2\2\u0147\u0149\5\32\16\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7L\2\2\u0150\u0142\3\2\2\2\u0150"+
		"\u0144\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7H\2\2\u0153\35\3\2\2\2"+
		"\u0154\u0159\5\\/\2\u0155\u0156\7O\2\2\u0156\u0158\5\\/\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\37\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\5\36\20\2\u015d\u015f\5\34"+
		"\17\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f!\3\2\2\2\u0160\u0161"+
		"\t\2\2\2\u0161#\3\2\2\2\u0162\u0167\5&\24\2\u0163\u0164\7_\2\2\u0164\u0166"+
		"\5&\24\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168%\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\5J&\2\u016b"+
		"\u016d\5R*\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2"+
		"\2\u016e\u0170\5\\/\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\'"+
		"\3\2\2\2\u0171\u0172\7\20\2\2\u0172\u0174\7G\2\2\u0173\u0175\5$\23\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0183\7H"+
		"\2\2\u0177\u0182\5 \21\2\u0178\u0179\6\25\2\3\u0179\u017a\7\62\2\2\u017a"+
		"\u0182\b\25\1\2\u017b\u017c\6\25\3\3\u017c\u017d\7)\2\2\u017d\u0182\b"+
		"\25\1\2\u017e\u017f\6\25\4\3\u017f\u0180\7\64\2\2\u0180\u0182\b\25\1\2"+
		"\u0181\u0177\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017e"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5j\66\2\u0187)\3\2\2\2"+
		"\u0188\u0189\t\3\2\2\u0189+\3\2\2\2\u018a\u0196\7\61\2\2\u018b\u018c\7"+
		"G\2\2\u018c\u0191\5\36\20\2\u018d\u018e\7_\2\2\u018e\u0190\5\36\20\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7H\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u0197\3\2\2\2\u0197-\3\2\2\2"+
		"\u0198\u019c\7\"\2\2\u0199\u019d\5\\/\2\u019a\u019d\7\34\2\2\u019b\u019d"+
		"\7\66\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2"+
		"\u019d\u019e\3\2\2\2\u019e\u01a0\7G\2\2\u019f\u01a1\5$\23\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01b5\7H\2\2\u01a3"+
		"\u01a4\6\30\5\3\u01a4\u01a5\5\"\22\2\u01a5\u01a6\b\30\1\2\u01a6\u01b4"+
		"\3\2\2\2\u01a7\u01a8\6\30\6\3\u01a8\u01a9\5*\26\2\u01a9\u01aa\b\30\1\2"+
		"\u01aa\u01b4\3\2\2\2\u01ab\u01b4\5 \21\2\u01ac\u01ad\6\30\7\3\u01ad\u01ae"+
		"\7E\2\2\u01ae\u01b4\b\30\1\2\u01af\u01b0\6\30\b\3\u01b0\u01b1\5,\27\2"+
		"\u01b1\u01b2\b\30\1\2\u01b2\u01b4\3\2\2\2\u01b3\u01a3\3\2\2\2\u01b3\u01a7"+
		"\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bd\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\78\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb"+
		"\5$\23\2\u01bb\u01bc\7H\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c2\7N\2\2\u01c0\u01c2\5j\66"+
		"\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2/\3\2\2\2\u01c3\u01c4"+
		"\7.\2\2\u01c4\u01ca\5\\/\2\u01c5\u01c7\7G\2\2\u01c6\u01c8\5$\23\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7H"+
		"\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d5\3\2\2\2\u01cc"+
		"\u01cd\6\31\t\3\u01cd\u01ce\7E\2\2\u01ce\u01d4\b\31\1\2\u01cf\u01d0\6"+
		"\31\n\3\u01d0\u01d1\5,\27\2\u01d1\u01d2\b\31\1\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01cc\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01db\7N\2\2\u01d9\u01db\5j\66\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db\61\3\2\2\2\u01dc\u01dd\7\34\2\2\u01dd\u01e1\7G\2\2\u01de\u01df"+
		"\5$\23\2\u01df\u01e0\b\32\1\2\u01e0\u01e2\3\2\2\2\u01e1\u01de\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01f5\7H\2\2\u01e4\u01e5"+
		"\6\32\13\3\u01e5\u01e6\7\33\2\2\u01e6\u01f4\b\32\1\2\u01e7\u01e8\6\32"+
		"\f\3\u01e8\u01e9\5*\26\2\u01e9\u01ea\b\32\1\2\u01ea\u01f4\3\2\2\2\u01eb"+
		"\u01f4\5 \21\2\u01ec\u01ed\6\32\r\3\u01ed\u01ee\7E\2\2\u01ee\u01f4\b\32"+
		"\1\2\u01ef\u01f0\6\32\16\3\u01f0\u01f1\5,\27\2\u01f1\u01f2\b\32\1\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01e4\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3\u01eb\3\2"+
		"\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01ff\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01f9\6\32\17\3\u01f9\u01fa\78\2\2\u01fa\u01fb\7G\2\2\u01fb"+
		"\u01fc\5$\23\2\u01fc\u01fd\7H\2\2\u01fd\u0200\3\2\2\2\u01fe\u0200\6\32"+
		"\20\3\u01ff\u01f8\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u0204\7N\2\2\u0202\u0204\5j\66\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2"+
		"\2\2\u0204\63\3\2\2\2\u0205\u0206\7\66\2\2\u0206\u0207\7G\2\2\u0207\u0218"+
		"\7H\2\2\u0208\u0209\6\33\21\3\u0209\u020a\7\33\2\2\u020a\u0217\b\33\1"+
		"\2\u020b\u020c\6\33\22\3\u020c\u020d\7\62\2\2\u020d\u0217\b\33\1\2\u020e"+
		"\u0217\5 \21\2\u020f\u0210\6\33\23\3\u0210\u0211\7E\2\2\u0211\u0217\b"+
		"\33\1\2\u0212\u0213\6\33\24\3\u0213\u0214\5,\27\2\u0214\u0215\b\33\1\2"+
		"\u0215\u0217\3\2\2\2\u0216\u0208\3\2\2\2\u0216\u020b\3\2\2\2\u0216\u020e"+
		"\3\2\2\2\u0216\u020f\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u021e\7N\2\2\u021c\u021e\5j\66\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021c\3\2\2\2\u021e\65\3\2\2\2\u021f\u0220\7<\2\2\u0220\u0221\5\\/\2"+
		"\u0221\u0223\7K\2\2\u0222\u0224\58\35\2\u0223\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\7L\2\2\u0228\67\3\2\2\2\u0229\u022a\5J&\2\u022a\u022b\5\\/\2\u022b"+
		"\u022c\7N\2\2\u022c9\3\2\2\2\u022d\u022e\7\27\2\2\u022e\u022f\5\\/\2\u022f"+
		"\u0230\7K\2\2\u0230\u0235\5\\/\2\u0231\u0232\7_\2\2\u0232\u0234\5\\/\2"+
		"\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\7L\2\2\u0239"+
		";\3\2\2\2\u023a\u0250\5J&\2\u023b\u023c\6\37\25\3\u023c\u023d\7\64\2\2"+
		"\u023d\u024f\b\37\1\2\u023e\u023f\6\37\26\3\u023f\u0240\7\63\2\2\u0240"+
		"\u024f\b\37\1\2\u0241\u0242\6\37\27\3\u0242\u0243\7)\2\2\u0243\u024f\b"+
		"\37\1\2\u0244\u0245\6\37\30\3\u0245\u0246\7\17\2\2\u0246\u024f\b\37\1"+
		"\2\u0247\u0248\6\37\31\3\u0248\u0249\5,\27\2\u0249\u024a\b\37\1\2\u024a"+
		"\u024f\3\2\2\2\u024b\u024c\6\37\32\3\u024c\u024d\7%\2\2\u024d\u024f\b"+
		"\37\1\2\u024e\u023b\3\2\2\2\u024e\u023e\3\2\2\2\u024e\u0241\3\2\2\2\u024e"+
		"\u0244\3\2\2\2\u024e\u0247\3\2\2\2\u024e\u024b\3\2\2\2\u024f\u0252\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0256\5\\/\2\u0254\u0255\7S\2\2\u0255\u0257\5T+\2"+
		"\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259"+
		"\7N\2\2\u0259=\3\2\2\2\u025a\u025b\5J&\2\u025b\u025c\7\17\2\2\u025c\u025d"+
		"\5\\/\2\u025d\u025e\7S\2\2\u025e\u025f\5T+\2\u025f\u0260\7N\2\2\u0260"+
		"?\3\2\2\2\u0261\u0263\5J&\2\u0262\u0264\7\'\2\2\u0263\u0262\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267\5\\/\2\u0266\u0265\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267A\3\2\2\2\u0268\u0269\7\32\2\2\u0269\u026a"+
		"\5\\/\2\u026a\u0273\7G\2\2\u026b\u0270\5@!\2\u026c\u026d\7_\2\2\u026d"+
		"\u026f\5@!\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u026b"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\7H\2\2\u0276"+
		"\u0278\7\6\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027a\7N\2\2\u027aC\3\2\2\2\u027b\u027d\5J&\2\u027c\u027e\5"+
		"\\/\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027eE\3\2\2\2\u027f\u0280"+
		"\7\30\2\2\u0280\u0281\5\\/\2\u0281\u028a\7G\2\2\u0282\u0287\5D#\2\u0283"+
		"\u0284\7_\2\2\u0284\u0286\5D#\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2"+
		"\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\7H\2\2\u028d\u028e\7N\2\2\u028eG\3\2\2\2\u028f\u0290\7C\2\2\u0290"+
		"\u0291\5\36\20\2\u0291\u0294\7!\2\2\u0292\u0295\7j\2\2\u0293\u0295\5J"+
		"&\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\7N\2\2\u0297I\3\2\2\2\u0298\u0299\b&\1\2\u0299\u029e\5L\'\2\u029a"+
		"\u029e\5N(\2\u029b\u029e\5\u0092J\2\u029c\u029e\5\36\20\2\u029d\u0298"+
		"\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e"+
		"\u02a7\3\2\2\2\u029f\u02a0\f\3\2\2\u02a0\u02a2\7I\2\2\u02a1\u02a3\5T+"+
		"\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6"+
		"\7J\2\2\u02a5\u029f\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8K\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02b7\7\7\2\2"+
		"\u02ab\u02ac\6\'\34\3\u02ac\u02ad\7\7\2\2\u02ad\u02b7\7\62\2\2\u02ae\u02b7"+
		"\7\n\2\2\u02af\u02b7\7;\2\2\u02b0\u02b7\7\f\2\2\u02b1\u02b7\79\2\2\u02b2"+
		"\u02b7\7B\2\2\u02b3\u02b7\7 \2\2\u02b4\u02b7\7\36\2\2\u02b5\u02b7\7@\2"+
		"\2\u02b6\u02aa\3\2\2\2\u02b6\u02ab\3\2\2\2\u02b6\u02ae\3\2\2\2\u02b6\u02af"+
		"\3\2\2\2\u02b6\u02b0\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6"+
		"\u02b3\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7M\3\2\2\2"+
		"\u02b8\u02b9\7\"\2\2\u02b9\u02bb\7G\2\2\u02ba\u02bc\5$\23\2\u02bb\u02ba"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c8\7H\2\2\u02be"+
		"\u02bf\6(\35\3\u02bf\u02c0\5\"\22\2\u02c0\u02c1\b(\1\2\u02c1\u02c7\3\2"+
		"\2\2\u02c2\u02c3\6(\36\3\u02c3\u02c4\5*\26\2\u02c4\u02c5\b(\1\2\u02c5"+
		"\u02c7\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02c2\3\2\2\2\u02c7\u02ca\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d0\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02cb\u02cc\78\2\2\u02cc\u02cd\7G\2\2\u02cd\u02ce\5$\23"+
		"\2\u02ce\u02cf\7H\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1O\3\2\2\2\u02d2\u02d4\5J&\2\u02d3\u02d5\5R*\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\5\\/\2\u02d7"+
		"Q\3\2\2\2\u02d8\u02d9\t\4\2\2\u02d9S\3\2\2\2\u02da\u02db\b+\1\2\u02db"+
		"\u02dc\7\62\2\2\u02dc\u02ee\5\34\17\2\u02dd\u02de\7?\2\2\u02de\u02df\7"+
		"G\2\2\u02df\u02e0\5J&\2\u02e0\u02e1\7H\2\2\u02e1\u02ee\3\2\2\2\u02e2\u02e3"+
		"\t\5\2\2\u02e3\u02ee\5T+\25\u02e4\u02e5\7/\2\2\u02e5\u02ee\5J&\2\u02e6"+
		"\u02ee\5X-\2\u02e7\u02ee\5Z.\2\u02e8\u02ec\5\\/\2\u02e9\u02ec\5^\60\2"+
		"\u02ea\u02ec\5L\'\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea"+
		"\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02da\3\2\2\2\u02ed\u02dd\3\2\2\2\u02ed"+
		"\u02e2\3\2\2\2\u02ed\u02e4\3\2\2\2\u02ed\u02e6\3\2\2\2\u02ed\u02e7\3\2"+
		"\2\2\u02ed\u02eb\3\2\2\2\u02ee\u0343\3\2\2\2\u02ef\u02f0\f\23\2\2\u02f0"+
		"\u02f1\7m\2\2\u02f1\u0342\5T+\23\u02f2\u02f3\f\22\2\2\u02f3\u02f4\t\6"+
		"\2\2\u02f4\u0342\5T+\23\u02f5\u02f6\f\21\2\2\u02f6\u02f7\t\7\2\2\u02f7"+
		"\u0342\5T+\22\u02f8\u02f9\f\20\2\2\u02f9\u02fa\t\b\2\2\u02fa\u0342\5T"+
		"+\21\u02fb\u02fc\f\17\2\2\u02fc\u02fd\7d\2\2\u02fd\u0342\5T+\20\u02fe"+
		"\u02ff\f\16\2\2\u02ff\u0300\7c\2\2\u0300\u0342\5T+\17\u0301\u0302\f\r"+
		"\2\2\u0302\u0303\7b\2\2\u0303\u0342\5T+\16\u0304\u0305\f\f\2\2\u0305\u0306"+
		"\t\t\2\2\u0306\u0342\5T+\r\u0307\u0308\f\13\2\2\u0308\u0309\t\n\2\2\u0309"+
		"\u0342\5T+\f\u030a\u030b\f\n\2\2\u030b\u030c\7a\2\2\u030c\u0342\5T+\13"+
		"\u030d\u030e\f\t\2\2\u030e\u030f\7`\2\2\u030f\u0342\5T+\n\u0310\u0311"+
		"\f\b\2\2\u0311\u0312\7P\2\2\u0312\u0313\5T+\2\u0313\u0314\7M\2\2\u0314"+
		"\u0315\5T+\b\u0315\u0342\3\2\2\2\u0316\u0317\f\7\2\2\u0317\u0318\5V,\2"+
		"\u0318\u0319\5T+\7\u0319\u0342\3\2\2\2\u031a\u031b\f\34\2\2\u031b\u031d"+
		"\7I\2\2\u031c\u031e\5T+\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0342\7J\2\2\u0320\u0321\f\33\2\2\u0321\u0323\7I"+
		"\2\2\u0322\u0324\5T+\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325\u0327\7M\2\2\u0326\u0328\5T+\2\u0327\u0326\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0342\7J\2\2\u032a\u032b\f\32"+
		"\2\2\u032b\u032e\7O\2\2\u032c\u032f\5\\/\2\u032d\u032f\7\7\2\2\u032e\u032c"+
		"\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u0342\3\2\2\2\u0330\u0331\f\31\2\2"+
		"\u0331\u033a\7K\2\2\u0332\u0337\5\32\16\2\u0333\u0334\7_\2\2\u0334\u0336"+
		"\5\32\16\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2"+
		"\u0337\u0338\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u0332"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u0342\7L\2\2\u033d"+
		"\u033e\f\30\2\2\u033e\u0342\5\34\17\2\u033f\u0340\f\24\2\2\u0340\u0342"+
		"\t\13\2\2\u0341\u02ef\3\2\2\2\u0341\u02f2\3\2\2\2\u0341\u02f5\3\2\2\2"+
		"\u0341\u02f8\3\2\2\2\u0341\u02fb\3\2\2\2\u0341\u02fe\3\2\2\2\u0341\u0301"+
		"\3\2\2\2\u0341\u0304\3\2\2\2\u0341\u0307\3\2\2\2\u0341\u030a\3\2\2\2\u0341"+
		"\u030d\3\2\2\2\u0341\u0310\3\2\2\2\u0341\u0316\3\2\2\2\u0341\u031a\3\2"+
		"\2\2\u0341\u0320\3\2\2\2\u0341\u032a\3\2\2\2\u0341\u0330\3\2\2\2\u0341"+
		"\u033d\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344U\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347"+
		"\t\f\2\2\u0347W\3\2\2\2\u0348\u034a\7G\2\2\u0349\u034b\5T+\2\u034a\u0349"+
		"\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0352\3\2\2\2\u034c\u034e\7_\2\2\u034d"+
		"\u034f\5T+\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2"+
		"\2\u0350\u034c\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\7H\2\2\u0356"+
		"Y\3\2\2\2\u0357\u0358\7I\2\2\u0358\u035d\5T+\2\u0359\u035a\7_\2\2\u035a"+
		"\u035c\5T+\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2"+
		"\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361"+
		"\7J\2\2\u0361[\3\2\2\2\u0362\u0363\t\r\2\2\u0363]\3\2\2\2\u0364\u036a"+
		"\5b\62\2\u0365\u036a\5h\65\2\u0366\u036a\5`\61\2\u0367\u036a\5d\63\2\u0368"+
		"\u036a\5f\64\2\u0369\u0364\3\2\2\2\u0369\u0365\3\2\2\2\u0369\u0366\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036a_\3\2\2\2\u036b\u036c"+
		"\t\16\2\2\u036ca\3\2\2\2\u036d\u036f\t\17\2\2\u036e\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371c\3\2\2\2"+
		"\u0372\u0374\7}\2\2\u0373\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0373"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376e\3\2\2\2\u0377\u0379\7|\2\2\u0378\u0377"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"g\3\2\2\2\u037c\u037e\t\20\2\2\u037d\u037f\7\60\2\2\u037e\u037d\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037fi\3\2\2\2\u0380\u0385\7K\2\2\u0381\u0384\5"+
		"n8\2\u0382\u0384\5l\67\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384"+
		"\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2"+
		"\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7L\2\2\u0389k\3\2\2\2\u038a\u038b"+
		"\7A\2\2\u038b\u038c\5j\66\2\u038cm\3\2\2\2\u038d\u039b\5j\66\2\u038e\u039b"+
		"\5p9\2\u038f\u039b\5r:\2\u0390\u039b\5t;\2\u0391\u039b\5v<\2\u0392\u039b"+
		"\5x=\2\u0393\u039b\5z>\2\u0394\u039b\5|?\2\u0395\u039b\5~@\2\u0396\u039b"+
		"\5\u0082B\2\u0397\u039b\5\u0084C\2\u0398\u039b\5\u0086D\2\u0399\u039b"+
		"\5\u0088E\2\u039a\u038d\3\2\2\2\u039a\u038e\3\2\2\2\u039a\u038f\3\2\2"+
		"\2\u039a\u0390\3\2\2\2\u039a\u0391\3\2\2\2\u039a\u0392\3\2\2\2\u039a\u0393"+
		"\3\2\2\2\u039a\u0394\3\2\2\2\u039a\u0395\3\2\2\2\u039a\u0396\3\2\2\2\u039a"+
		"\u0397\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039bo\3\2\2\2"+
		"\u039c\u039f\5\u008eH\2\u039d\u039f\5\u0090I\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039fq\3\2\2\2\u03a0\u03a1\7$\2\2\u03a1\u03a2\7G\2\2\u03a2"+
		"\u03a3\5T+\2\u03a3\u03a4\7H\2\2\u03a4\u03a7\5n8\2\u03a5\u03a6\7\25\2\2"+
		"\u03a6\u03a8\5n8\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8s\3\2"+
		"\2\2\u03a9\u03aa\7!\2\2\u03aa\u03ad\7G\2\2\u03ab\u03ae\5p9\2\u03ac\u03ae"+
		"\7N\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af"+
		"\u03b2\5\u0090I\2\u03b0\u03b2\7N\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3"+
		"\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b5\5T+\2\u03b4\u03b3\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\7H\2\2\u03b7\u03b8\5n8"+
		"\2\u03b8u\3\2\2\2\u03b9\u03ba\7F\2\2\u03ba\u03bb\7G\2\2\u03bb\u03bc\5"+
		"T+\2\u03bc\u03bd\7H\2\2\u03bd\u03be\5n8\2\u03bew\3\2\2\2\u03bf\u03c0\7"+
		"\24\2\2\u03c0\u03c1\5n8\2\u03c1\u03c2\7F\2\2\u03c2\u03c3\7G\2\2\u03c3"+
		"\u03c4\5T+\2\u03c4\u03c5\7H\2\2\u03c5\u03c6\7N\2\2\u03c6y\3\2\2\2\u03c7"+
		"\u03c8\7\21\2\2\u03c8\u03c9\7N\2\2\u03c9{\3\2\2\2\u03ca\u03cb\7\13\2\2"+
		"\u03cb\u03cc\7N\2\2\u03cc}\3\2\2\2\u03cd\u03ce\7>\2\2\u03ce\u03d4\5T+"+
		"\2\u03cf\u03d0\78\2\2\u03d0\u03d1\7G\2\2\u03d1\u03d2\5$\23\2\u03d2\u03d3"+
		"\7H\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03cf\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d6\3\2\2\2\u03d6\u03d8\5j\66\2\u03d7\u03d9\5\u0080A\2\u03d8\u03d7"+
		"\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\177\3\2\2\2\u03dc\u03e4\7\16\2\2\u03dd\u03df\5\\/\2\u03de\u03dd\3\2\2"+
		"\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\7G\2\2\u03e1\u03e2"+
		"\5$\23\2\u03e2\u03e3\7H\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03de\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\5j\66\2\u03e7\u0081\3\2"+
		"\2\2\u03e8\u03ea\7\67\2\2\u03e9\u03eb\5T+\2\u03ea\u03e9\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\7N\2\2\u03ed\u0083\3\2"+
		"\2\2\u03ee\u03ef\7\26\2\2\u03ef\u03f0\5T+\2\u03f0\u03f1\5\34\17\2\u03f1"+
		"\u03f2\7N\2\2\u03f2\u0085\3\2\2\2\u03f3\u03f4\7\31\2\2\u03f4\u03f5\5T"+
		"+\2\u03f5\u03f6\5\34\17\2\u03f6\u03f7\7N\2\2\u03f7\u0087\3\2\2\2\u03f8"+
		"\u03fa\7\t\2\2\u03f9\u03fb\7\u0084\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0400\7\u0085\2\2\u03fd\u03ff\5\u0096"+
		"L\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\7\u0098"+
		"\2\2\u0404\u0089\3\2\2\2\u0405\u040a\5P)\2\u0406\u0407\7_\2\2\u0407\u0409"+
		"\5P)\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u008b\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u0411\7G"+
		"\2\2\u040e\u0410\7_\2\2\u040f\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411"+
		"\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0411\3\2"+
		"\2\2\u0414\u0415\5P)\2\u0415\u041c\3\2\2\2\u0416\u0418\7_\2\2\u0417\u0419"+
		"\5P)\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a"+
		"\u0416\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2"+
		"\2\2\u041d\u041f\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0420\7H\2\2\u0420"+
		"\u008d\3\2\2\2\u0421\u0424\5P)\2\u0422\u0423\7S\2\2\u0423\u0425\5T+\2"+
		"\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u042b\3\2\2\2\u0426\u0427"+
		"\5\u008cG\2\u0427\u0428\7S\2\2\u0428\u0429\5T+\2\u0429\u042b\3\2\2\2\u042a"+
		"\u0421\3\2\2\2\u042a\u0426\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7N"+
		"\2\2\u042d\u008f\3\2\2\2\u042e\u042f\5T+\2\u042f\u0430\7N\2\2\u0430\u0091"+
		"\3\2\2\2\u0431\u0432\7,\2\2\u0432\u0433\7G\2\2\u0433\u0434\5\u0094K\2"+
		"\u0434\u0435\7Q\2\2\u0435\u0436\5J&\2\u0436\u0437\7H\2\2\u0437\u0093\3"+
		"\2\2\2\u0438\u043b\5L\'\2\u0439\u043b\5\36\20\2\u043a\u0438\3\2\2\2\u043a"+
		"\u0439\3\2\2\2\u043b\u0095\3\2\2\2\u043c\u0448\5\u0098M\2\u043d\u0448"+
		"\5\u009aN\2\u043e\u0448\5\u009cO\2\u043f\u0448\5\u00aaV\2\u0440\u0448"+
		"\5\u009eP\2\u0441\u0448\5\u00a0Q\2\u0442\u0448\5\u00a4S\2\u0443\u0448"+
		"\7\u0091\2\2\u0444\u0448\7\u0089\2\2\u0445\u0448\7\u008b\2\2\u0446\u0448"+
		"\5\u00a6T\2\u0447\u043c\3\2\2\2\u0447\u043d\3\2\2\2\u0447\u043e\3\2\2"+
		"\2\u0447\u043f\3\2\2\2\u0447\u0440\3\2\2\2\u0447\u0441\3\2\2\2\u0447\u0442"+
		"\3\2\2\2\u0447\u0443\3\2\2\2\u0447\u0444\3\2\2\2\u0447\u0445\3\2\2\2\u0447"+
		"\u0446\3\2\2\2\u0448\u0097\3\2\2\2\u0449\u044d\7\u0097\2\2\u044a\u044c"+
		"\5\u0096L\2\u044b\u044a\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2"+
		"\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451"+
		"\7\u0098\2\2\u0451\u0099\3\2\2\2\u0452\u0453\7\u0092\2\2\u0453\u0456\7"+
		"\u009f\2\2\u0454\u0455\7\u009b\2\2\u0455\u0457\5\u00b0Y\2\u0456\u0454"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0466\3\2\2\2\u0458\u0459\7\u0092\2"+
		"\2\u0459\u045e\7\u009f\2\2\u045a\u045b\7\u009d\2\2\u045b\u045d\7\u009f"+
		"\2\2\u045c\u045a\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e"+
		"\u045f\3\2\2\2\u045f\u0463\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7\u009b"+
		"\2\2\u0462\u0464\5\u00aaV\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0466\3\2\2\2\u0465\u0452\3\2\2\2\u0465\u0458\3\2\2\2\u0466\u009b\3\2"+
		"\2\2\u0467\u0468\5\u00a8U\2\u0468\u0469\7\u009b\2\2\u0469\u046a\5\u00b0"+
		"Y\2\u046a\u0476\3\2\2\2\u046b\u046e\5\u00a8U\2\u046c\u046d\7\u009d\2\2"+
		"\u046d\u046f\5\u00a8U\2\u046e\u046c\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7\u009b"+
		"\2\2\u0473\u0474\5\u00aaV\2\u0474\u0476\3\2\2\2\u0475\u0467\3\2\2\2\u0475"+
		"\u046b\3\2\2\2\u0476\u009d\3\2\2\2\u0477\u0478\7\u0090\2\2\u0478\u0479"+
		"\5\u00b0Y\2\u0479\u047a\5\u0098M\2\u047a\u009f\3\2\2\2\u047b\u047c\7\u008e"+
		"\2\2\u047c\u047d\5\u0098M\2\u047d\u047e\5\u00b0Y\2\u047e\u047f\5\u0098"+
		"M\2\u047f\u0480\5\u0098M\2\u0480\u00a1\3\2\2\2\u0481\u0482\7\u008a\2\2"+
		"\u0482\u0483\5\u00aeX\2\u0483\u0484\5\u0098M\2\u0484\u00a3\3\2\2\2\u0485"+
		"\u0486\7\u0093\2\2\u0486\u0492\5\u00b0Y\2\u0487\u0489\5\u00a2R\2\u0488"+
		"\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048e\3\2\2\2\u048c\u048d\7\u008c\2\2\u048d\u048f\5\u0098M"+
		"\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0493\3\2\2\2\u0490\u0491"+
		"\7\u008c\2\2\u0491\u0493\5\u0098M\2\u0492\u0488\3\2\2\2\u0492\u0490\3"+
		"\2\2\2\u0493\u00a5\3\2\2\2\u0494\u0495\7\u008f\2\2\u0495\u0496\7\u009f"+
		"\2\2\u0496\u049f\7\u0099\2\2\u0497\u049c\7\u009f\2\2\u0498\u0499\7\u009d"+
		"\2\2\u0499\u049b\7\u009f\2\2\u049a\u0498\3\2\2\2\u049b\u049e\3\2\2\2\u049c"+
		"\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a0\3\2\2\2\u049e\u049c\3\2"+
		"\2\2\u049f\u0497\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04ab\7\u009a\2\2\u04a2\u04a3\7\u009e\2\2\u04a3\u04a8\7\u009f\2\2\u04a4"+
		"\u04a5\7\u009d\2\2\u04a5\u04a7\7\u009f\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04aa"+
		"\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa"+
		"\u04a8\3\2\2\2\u04ab\u04a2\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04ae\5\u0098M\2\u04ae\u00a7\3\2\2\2\u04af\u04b4\7\u009f\2"+
		"\2\u04b0\u04b1\7\u009c\2\2\u04b1\u04b3\7\u009f\2\2\u04b2\u04b0\3\2\2\2"+
		"\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u00a9"+
		"\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b8\t\21\2\2\u04b8\u04c1\7\u0099"+
		"\2\2\u04b9\u04be\5\u00b0Y\2\u04ba\u04bb\7\u009d\2\2\u04bb\u04bd\5\u00b0"+
		"Y\2\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04b9\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\7\u009a\2\2\u04c4"+
		"\u00ab\3\2\2\2\u04c5\u04c6\t\22\2\2\u04c6\u00ad\3\2\2\2\u04c7\u04cd\7"+
		"\u00a1\2\2\u04c8\u04cd\7\u00a2\2\2\u04c9\u04cd\7\u00a0\2\2\u04ca\u04cd"+
		"\5\u00acW\2\u04cb\u04cd\7\u00a3\2\2\u04cc\u04c7\3\2\2\2\u04cc\u04c8\3"+
		"\2\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd"+
		"\u00af\3\2\2\2\u04ce\u04d2\5\u00a8U\2\u04cf\u04d2\5\u00aaV\2\u04d0\u04d2"+
		"\5\u00aeX\2\u04d1\u04ce\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2"+
		"\2\u04d2\u00b1\3\2\2\2\u0088\u00bc\u00be\u00c7\u00cf\u00db\u00e2\u00ec"+
		"\u00f2\u00f7\u00fd\u0105\u010b\u0116\u0121\u0126\u0133\u013f\u0142\u014a"+
		"\u014d\u0150\u0159\u015e\u0167\u016c\u016f\u0174\u0181\u0183\u0191\u0196"+
		"\u019c\u01a0\u01b3\u01b5\u01bd\u01c1\u01c7\u01ca\u01d3\u01d5\u01da\u01e1"+
		"\u01f3\u01f5\u01ff\u0203\u0216\u0218\u021d\u0225\u0235\u024e\u0250\u0256"+
		"\u0263\u0266\u0270\u0273\u0277\u027d\u0287\u028a\u0294\u029d\u02a2\u02a7"+
		"\u02b6\u02bb\u02c6\u02c8\u02d0\u02d4\u02eb\u02ed\u031d\u0323\u0327\u032e"+
		"\u0337\u033a\u0341\u0343\u034a\u034e\u0352\u035d\u0369\u0370\u0375\u037a"+
		"\u037e\u0383\u0385\u039a\u039e\u03a7\u03ad\u03b1\u03b4\u03d4\u03da\u03de"+
		"\u03e4\u03ea\u03fa\u0400\u040a\u0411\u0418\u041c\u0424\u042a\u043a\u0447"+
		"\u044d\u0456\u045e\u0463\u0465\u0470\u0475\u048a\u048e\u0492\u049c\u049f"+
		"\u04a8\u04ab\u04b4\u04be\u04c1\u04cc\u04d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}