package com.hitty.ast;// Generated from .\task.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class taskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Type=37, Identifier=38, 
		Letter=39, Int=40, Char=41, WS=42, String=43;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_qualifiedName = 3, RULE_taskDeclaration = 4, RULE_taskBody = 5, RULE_localTaskDeclaration = 6, 
		RULE_localVarDeclarations = 7, RULE_localVarDeclaration = 8, RULE_localVarDeclarationSingle = 9, 
		RULE_varInitializer = 10, RULE_arrayInitializer = 11, RULE_functionDeclaration = 12, 
		RULE_functionModifier = 13, RULE_functionParameters = 14, RULE_functionCallParameters = 15, 
		RULE_functionBody = 16, RULE_blockCode = 17, RULE_blockStatement = 18, 
		RULE_statement = 19, RULE_ifStatement = 20, RULE_whileStatement = 21, 
		RULE_breakStatement = 22, RULE_continueStatement = 23, RULE_forStatement = 24, 
		RULE_forControl = 25, RULE_forInit = 26, RULE_forUpdate = 27, RULE_localVar = 28, 
		RULE_assign = 29, RULE_assignStatement = 30, RULE_returnStatement = 31, 
		RULE_invokeStatement = 32, RULE_parExpression = 33, RULE_expressionList = 34, 
		RULE_expression = 35, RULE_operator1 = 36, RULE_operator2 = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "qualifiedName", 
			"taskDeclaration", "taskBody", "localTaskDeclaration", "localVarDeclarations", 
			"localVarDeclaration", "localVarDeclarationSingle", "varInitializer", 
			"arrayInitializer", "functionDeclaration", "functionModifier", "functionParameters", 
			"functionCallParameters", "functionBody", "blockCode", "blockStatement", 
			"statement", "ifStatement", "whileStatement", "breakStatement", "continueStatement", 
			"forStatement", "forControl", "forInit", "forUpdate", "localVar", "assign", 
			"assignStatement", "returnStatement", "invokeStatement", "parExpression", 
			"expressionList", "expression", "operator1", "operator2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'.'", "'*'", "'task'", "'{'", 
			"'}'", "','", "'['", "']'", "'='", "'shared'", "'sync'", "'('", "')'", 
			"'()'", "'if'", "'else'", "'while'", "'break'", "'continue'", "'for'", 
			"'return'", "'++'", "'--'", "'+'", "'-'", "'/'", "'%'", "'<'", "'>'", 
			"'||'", "'&&'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Type", "Identifier", "Letter", "Int", "Char", "WS", "String"
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
	public String getGrammarFileName() { return "task.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public taskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(taskParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TaskDeclarationContext> taskDeclaration() {
			return getRuleContexts(TaskDeclarationContext.class);
		}
		public TaskDeclarationContext taskDeclaration(int i) {
			return getRuleContext(TaskDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(76);
				packageDeclaration();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(79);
				importDeclaration();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(85);
				taskDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			qualifiedName();
			setState(95);
			match(T__1);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__2);
			setState(98);
			qualifiedName();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(99);
				match(T__3);
				setState(100);
				match(T__4);
				}
			}

			setState(103);
			match(T__1);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(taskParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(taskParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Identifier);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(T__3);
					setState(107);
					match(Identifier);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TaskDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(taskParser.Identifier, 0); }
		public TaskBodyContext taskBody() {
			return getRuleContext(TaskBodyContext.class,0);
		}
		public TaskDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taskDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterTaskDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitTaskDeclaration(this);
		}
	}

	public final TaskDeclarationContext taskDeclaration() throws RecognitionException {
		TaskDeclarationContext _localctx = new TaskDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_taskDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__5);
			setState(114);
			match(Identifier);
			setState(115);
			taskBody();
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

	public static class TaskBodyContext extends ParserRuleContext {
		public LocalVarDeclarationsContext localVarDeclarations() {
			return getRuleContext(LocalVarDeclarationsContext.class,0);
		}
		public List<LocalTaskDeclarationContext> localTaskDeclaration() {
			return getRuleContexts(LocalTaskDeclarationContext.class);
		}
		public LocalTaskDeclarationContext localTaskDeclaration(int i) {
			return getRuleContext(LocalTaskDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public TaskBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taskBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterTaskBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitTaskBody(this);
		}
	}

	public final TaskBodyContext taskBody() throws RecognitionException {
		TaskBodyContext _localctx = new TaskBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_taskBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__6);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(118);
				localTaskDeclaration();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			localVarDeclarations();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Type) | (1L << Identifier))) != 0)) {
				{
				{
				setState(125);
				functionDeclaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__7);
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

	public static class LocalTaskDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(taskParser.Identifier, 0); }
		public LocalTaskDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTaskDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterLocalTaskDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitLocalTaskDeclaration(this);
		}
	}

	public final LocalTaskDeclarationContext localTaskDeclaration() throws RecognitionException {
		LocalTaskDeclarationContext _localctx = new LocalTaskDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_localTaskDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__5);
			setState(134);
			match(Identifier);
			setState(135);
			match(T__1);
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

	public static class LocalVarDeclarationsContext extends ParserRuleContext {
		public List<LocalVarDeclarationContext> localVarDeclaration() {
			return getRuleContexts(LocalVarDeclarationContext.class);
		}
		public LocalVarDeclarationContext localVarDeclaration(int i) {
			return getRuleContext(LocalVarDeclarationContext.class,i);
		}
		public LocalVarDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterLocalVarDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitLocalVarDeclarations(this);
		}
	}

	public final LocalVarDeclarationsContext localVarDeclarations() throws RecognitionException {
		LocalVarDeclarationsContext _localctx = new LocalVarDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVarDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					localVarDeclaration();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class LocalVarDeclarationContext extends ParserRuleContext {
		public List<LocalVarDeclarationSingleContext> localVarDeclarationSingle() {
			return getRuleContexts(LocalVarDeclarationSingleContext.class);
		}
		public LocalVarDeclarationSingleContext localVarDeclarationSingle(int i) {
			return getRuleContext(LocalVarDeclarationSingleContext.class,i);
		}
		public TerminalNode Type() { return getToken(taskParser.Type, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LocalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitLocalVarDeclaration(this);
		}
	}

	public final LocalVarDeclarationContext localVarDeclaration() throws RecognitionException {
		LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				{
				setState(143);
				match(Type);
				}
				break;
			case Identifier:
				{
				setState(144);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			localVarDeclarationSingle();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(148);
				match(T__8);
				setState(149);
				localVarDeclarationSingle();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__1);
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

	public static class LocalVarDeclarationSingleContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(taskParser.Identifier, 0); }
		public VarInitializerContext varInitializer() {
			return getRuleContext(VarInitializerContext.class,0);
		}
		public TerminalNode Int() { return getToken(taskParser.Int, 0); }
		public LocalVarDeclarationSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclarationSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterLocalVarDeclarationSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitLocalVarDeclarationSingle(this);
		}
	}

	public final LocalVarDeclarationSingleContext localVarDeclarationSingle() throws RecognitionException {
		LocalVarDeclarationSingleContext _localctx = new LocalVarDeclarationSingleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localVarDeclarationSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Identifier);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(158);
				match(T__9);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Int) {
					{
					setState(159);
					match(Int);
					}
				}

				setState(162);
				match(T__10);
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(165);
				match(T__11);
				setState(166);
				varInitializer();
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

	public static class VarInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterVarInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitVarInitializer(this);
		}
	}

	public final VarInitializerContext varInitializer() throws RecognitionException {
		VarInitializerContext _localctx = new VarInitializerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VarInitializerContext> varInitializer() {
			return getRuleContexts(VarInitializerContext.class);
		}
		public VarInitializerContext varInitializer(int i) {
			return getRuleContext(VarInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__6);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identifier) | (1L << Int) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(172);
				varInitializer();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(173);
					match(T__8);
					setState(174);
					varInitializer();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			match(T__7);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(taskParser.Identifier, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public TerminalNode Type() { return getToken(taskParser.Type, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(184);
				functionModifier();
				}
			}

			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(187);
				match(Type);
				}
				break;
			case 2:
				{
				setState(188);
				qualifiedName();
				}
				break;
			}
			setState(191);
			match(Identifier);
			setState(192);
			functionParameters();
			setState(193);
			functionBody();
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

	public static class FunctionModifierContext extends ParserRuleContext {
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionModifier(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	 
		public FunctionParametersContext() { }
		public void copyFrom(FunctionParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameters2NotExistContext extends FunctionParametersContext {
		public FunctionParameters2NotExistContext(FunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionParameters2NotExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionParameters2NotExist(this);
		}
	}
	public static class FunctionParameters2existContext extends FunctionParametersContext {
		public List<TerminalNode> Identifier() { return getTokens(taskParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(taskParser.Identifier, i);
		}
		public List<TerminalNode> Type() { return getTokens(taskParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(taskParser.Type, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public FunctionParameters2existContext(FunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionParameters2exist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionParameters2exist(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionParameters);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new FunctionParameters2existContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__14);
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(198);
					match(Type);
					}
					break;
				case Identifier:
					{
					setState(199);
					qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				match(Identifier);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(203);
					match(T__8);
					setState(206);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Type:
						{
						setState(204);
						match(Type);
						}
						break;
					case Identifier:
						{
						setState(205);
						qualifiedName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208);
					match(Identifier);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new FunctionParameters2NotExistContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__16);
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

	public static class FunctionCallParametersContext extends ParserRuleContext {
		public FunctionCallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParameters; }
	 
		public FunctionCallParametersContext() { }
		public void copyFrom(FunctionCallParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallParameters2NotExistContext extends FunctionCallParametersContext {
		public FunctionCallParameters2NotExistContext(FunctionCallParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionCallParameters2NotExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionCallParameters2NotExist(this);
		}
	}
	public static class FunctionCallParameters2existContext extends FunctionCallParametersContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallParameters2existContext(FunctionCallParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionCallParameters2exist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionCallParameters2exist(this);
		}
	}

	public final FunctionCallParametersContext functionCallParameters() throws RecognitionException {
		FunctionCallParametersContext _localctx = new FunctionCallParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCallParameters);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new FunctionCallParameters2existContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__14);
				setState(219);
				expression(0);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(220);
					match(T__8);
					setState(221);
					expression(0);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new FunctionCallParameters2NotExistContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__16);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			blockCode();
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

	public static class BlockCodeContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitBlockCode(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__6);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << Type) | (1L << Identifier) | (1L << Int) | (1L << Char) | (1L << String))) != 0)) {
				{
				{
				setState(235);
				blockStatement();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__7);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement2ifStatementContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public Statement2ifStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2ifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2ifStatement(this);
		}
	}
	public static class Statement2returnStatementContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Statement2returnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2returnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2returnStatement(this);
		}
	}
	public static class Statement2blockCodeContext extends StatementContext {
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public Statement2blockCodeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2blockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2blockCode(this);
		}
	}
	public static class Statement2breakStatementContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public Statement2breakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2breakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2breakStatement(this);
		}
	}
	public static class Statement2localTaskDeclarationContext extends StatementContext {
		public LocalVarDeclarationContext localVarDeclaration() {
			return getRuleContext(LocalVarDeclarationContext.class,0);
		}
		public Statement2localTaskDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2localTaskDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2localTaskDeclaration(this);
		}
	}
	public static class Statement2continueStatementContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public Statement2continueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2continueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2continueStatement(this);
		}
	}
	public static class Statement2whileStatementContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public Statement2whileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2whileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2whileStatement(this);
		}
	}
	public static class Statement2forStatementContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Statement2forStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2forStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2forStatement(this);
		}
	}
	public static class Statement2assignStatementContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public Statement2assignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2assignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2assignStatement(this);
		}
	}
	public static class Statement2invokeStatementContext extends StatementContext {
		public InvokeStatementContext invokeStatement() {
			return getRuleContext(InvokeStatementContext.class,0);
		}
		public Statement2invokeStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterStatement2invokeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitStatement2invokeStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Statement2blockCodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				blockCode();
				}
				break;
			case 2:
				_localctx = new Statement2localTaskDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				localVarDeclaration();
				}
				break;
			case 3:
				_localctx = new Statement2ifStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new Statement2forStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				forStatement();
				}
				break;
			case 5:
				_localctx = new Statement2assignStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				assignStatement();
				}
				break;
			case 6:
				_localctx = new Statement2whileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				whileStatement();
				}
				break;
			case 7:
				_localctx = new Statement2breakStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				breakStatement();
				}
				break;
			case 8:
				_localctx = new Statement2continueStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				continueStatement();
				}
				break;
			case 9:
				_localctx = new Statement2returnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new Statement2invokeStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				invokeStatement();
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
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__17);
			setState(258);
			parExpression();
			setState(259);
			statement();
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(260);
				match(T__18);
				setState(261);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__19);
			setState(265);
			parExpression();
			setState(266);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__20);
			setState(269);
			match(T__1);
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
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__21);
			setState(272);
			match(T__1);
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
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__22);
			setState(275);
			match(T__14);
			setState(276);
			forControl();
			setState(277);
			match(T__15);
			setState(278);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identifier) | (1L << Int) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(280);
				forInit();
				}
			}

			setState(283);
			match(T__1);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identifier) | (1L << Int) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(284);
				expression(0);
				}
			}

			setState(287);
			match(T__1);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identifier) | (1L << Int) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(288);
				forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expressionList();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expressionList();
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

	public static class LocalVarContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(taskParser.Identifier, 0); }
		public List<LocalVarContext> localVar() {
			return getRuleContexts(LocalVarContext.class);
		}
		public LocalVarContext localVar(int i) {
			return getRuleContext(LocalVarContext.class,i);
		}
		public FunctionCallParametersContext functionCallParameters() {
			return getRuleContext(FunctionCallParametersContext.class,0);
		}
		public LocalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterLocalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitLocalVar(this);
		}
	}

	public final LocalVarContext localVar() throws RecognitionException {
		LocalVarContext _localctx = new LocalVarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_localVar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(Identifier);
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(296);
				match(T__9);
				setState(297);
				localVar();
				setState(298);
				match(T__10);
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(302);
				functionCallParameters();
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(T__3);
					setState(306);
					localVar();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public LocalVarContext localVar() {
			return getRuleContext(LocalVarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			localVar();
			setState(313);
			match(T__11);
			setState(314);
			expression(0);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			assign();
			setState(317);
			match(T__1);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__23);
			setState(320);
			expression(0);
			setState(321);
			match(T__1);
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

	public static class InvokeStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallParametersContext functionCallParameters() {
			return getRuleContext(FunctionCallParametersContext.class,0);
		}
		public InvokeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterInvokeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitInvokeStatement(this);
		}
	}

	public final InvokeStatementContext invokeStatement() throws RecognitionException {
		InvokeStatementContext _localctx = new InvokeStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_invokeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			expression(0);
			setState(324);
			functionCallParameters();
			setState(325);
			match(T__1);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__14);
			setState(328);
			expression(0);
			setState(329);
			match(T__15);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			expression(0);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(332);
				match(T__8);
				setState(333);
				expression(0);
				}
				}
				setState(338);
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
	public static class Expression2CharContext extends ExpressionContext {
		public TerminalNode Char() { return getToken(taskParser.Char, 0); }
		public Expression2CharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpression2Char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpression2Char(this);
		}
	}
	public static class ExpOp2expContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Operator2Context operator2() {
			return getRuleContext(Operator2Context.class,0);
		}
		public ExpOp2expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpOp2exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpOp2exp(this);
		}
	}
	public static class Expression2localVarContext extends ExpressionContext {
		public LocalVarContext localVar() {
			return getRuleContext(LocalVarContext.class,0);
		}
		public Expression2localVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpression2localVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpression2localVar(this);
		}
	}
	public static class Expression2StringContext extends ExpressionContext {
		public TerminalNode String() { return getToken(taskParser.String, 0); }
		public Expression2StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpression2String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpression2String(this);
		}
	}
	public static class ExpOp1Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public ExpOp1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpOp1(this);
		}
	}
	public static class Op1expContext extends ExpressionContext {
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Op1expContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterOp1exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitOp1exp(this);
		}
	}
	public static class ExpressionWithParenthesesContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionWithParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpressionWithParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpressionWithParentheses(this);
		}
	}
	public static class Expression2IntContext extends ExpressionContext {
		public TerminalNode Int() { return getToken(taskParser.Int, 0); }
		public Expression2IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpression2Int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpression2Int(this);
		}
	}
	public static class ExpressionsContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpressions(this);
		}
	}
	public static class Expression2assignContext extends ExpressionContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Expression2assignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterExpression2assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitExpression2assign(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Op1expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(340);
				operator1();
				setState(341);
				expression(8);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionWithParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(T__14);
				setState(344);
				expression(0);
				setState(345);
				match(T__15);
				}
				break;
			case 3:
				{
				_localctx = new Expression2localVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				localVar();
				}
				break;
			case 4:
				{
				_localctx = new Expression2assignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				assign();
				}
				break;
			case 5:
				{
				_localctx = new Expression2CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				match(Char);
				}
				break;
			case 6:
				{
				_localctx = new Expression2IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(Int);
				}
				break;
			case 7:
				{
				_localctx = new Expression2StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(String);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOp2expContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(355);
						operator2();
						setState(356);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpOp1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(359);
						operator1();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(361);
						match(T__9);
						setState(362);
						expression(0);
						setState(363);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Operator1Context extends ParserRuleContext {
		public Operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitOperator1(this);
		}
	}

	public final Operator1Context operator1() throws RecognitionException {
		Operator1Context _localctx = new Operator1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	public static class Operator2Context extends ParserRuleContext {
		public Operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).enterOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taskListener ) ((taskListener)listener).exitOperator2(this);
		}
	}

	public final Operator2Context operator2() throws RecognitionException {
		Operator2Context _localctx = new Operator2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\7\2S\n\2"+
		"\f\2\16\2V\13\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4h\n\4\3\4\3\4\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\7\7\u0081\n\7\f"+
		"\7\16\7\u0084\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\t\u008d\n\t\f\t\16\t"+
		"\u0090\13\t\3\n\3\n\5\n\u0094\n\n\3\n\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u00a3\n\13\3\13\5\13\u00a6\n\13\3\13"+
		"\3\13\5\13\u00aa\n\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5"+
		"\13\r\5\r\u00b7\n\r\3\r\3\r\3\16\5\16\u00bc\n\16\3\16\3\16\5\16\u00c0"+
		"\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\5\20\u00cb\n\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d1\n\20\3\20\7\20\u00d4\n\20\f\20\16\20\u00d7"+
		"\13\20\3\20\3\20\5\20\u00db\n\20\3\21\3\21\3\21\3\21\7\21\u00e1\n\21\f"+
		"\21\16\21\u00e4\13\21\3\21\3\21\3\21\5\21\u00e9\n\21\3\22\3\22\3\23\3"+
		"\23\7\23\u00ef\n\23\f\23\16\23\u00f2\13\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0109\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u011c\n\33\3\33\3\33"+
		"\5\33\u0120\n\33\3\33\3\33\5\33\u0124\n\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u012f\n\36\3\36\5\36\u0132\n\36\3\36\3\36\7\36"+
		"\u0136\n\36\f\36\16\36\u0139\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u0151\n$\f$\16$\u0154\13"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0163\n%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\7%\u0170\n%\f%\16%\u0173\13%\3&\3&\3\'\3\'\3\'\2\3H("+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JL\2\5\3\2\17\20\3\2\33\34\4\2\7\7\35&\2\u0185\2O\3\2\2\2\4_\3\2\2\2\6"+
		"c\3\2\2\2\bk\3\2\2\2\ns\3\2\2\2\fw\3\2\2\2\16\u0087\3\2\2\2\20\u008e\3"+
		"\2\2\2\22\u0093\3\2\2\2\24\u009f\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2"+
		"\2\2\32\u00bb\3\2\2\2\34\u00c5\3\2\2\2\36\u00da\3\2\2\2 \u00e8\3\2\2\2"+
		"\"\u00ea\3\2\2\2$\u00ec\3\2\2\2&\u00f5\3\2\2\2(\u0101\3\2\2\2*\u0103\3"+
		"\2\2\2,\u010a\3\2\2\2.\u010e\3\2\2\2\60\u0111\3\2\2\2\62\u0114\3\2\2\2"+
		"\64\u011b\3\2\2\2\66\u0125\3\2\2\28\u0127\3\2\2\2:\u0129\3\2\2\2<\u013a"+
		"\3\2\2\2>\u013e\3\2\2\2@\u0141\3\2\2\2B\u0145\3\2\2\2D\u0149\3\2\2\2F"+
		"\u014d\3\2\2\2H\u0162\3\2\2\2J\u0174\3\2\2\2L\u0176\3\2\2\2NP\5\4\3\2"+
		"ON\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\n\6\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\2\2\3^\3\3\2\2\2_`\7\3\2\2`a\5\b"+
		"\5\2ab\7\4\2\2b\5\3\2\2\2cd\7\5\2\2dg\5\b\5\2ef\7\6\2\2fh\7\7\2\2ge\3"+
		"\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\4\2\2j\7\3\2\2\2kp\7(\2\2lm\7\6\2\2mo\7"+
		"(\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rp\3\2\2\2st\7"+
		"\b\2\2tu\7(\2\2uv\5\f\7\2v\13\3\2\2\2w{\7\t\2\2xz\5\16\b\2yx\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0082\5\20\t\2\177"+
		"\u0081\5\32\16\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\n\2\2\u0086\r\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089\7(\2\2"+
		"\u0089\u008a\7\4\2\2\u008a\17\3\2\2\2\u008b\u008d\5\22\n\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\7\'\2\2\u0092\u0094\5\b\5"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a"+
		"\5\24\13\2\u0096\u0097\7\13\2\2\u0097\u0099\5\24\13\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\4\2\2\u009e\23\3\2\2"+
		"\2\u009f\u00a5\7(\2\2\u00a0\u00a2\7\f\2\2\u00a1\u00a3\7*\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\r\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a8\7\16"+
		"\2\2\u00a8\u00aa\5\26\f\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\25\3\2\2\2\u00ab\u00ac\5H%\2\u00ac\27\3\2\2\2\u00ad\u00b6\7\t\2\2\u00ae"+
		"\u00b3\5\26\f\2\u00af\u00b0\7\13\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\n\2\2\u00b9\31\3\2\2\2\u00ba\u00bc"+
		"\5\34\17\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00c0\7\'\2\2\u00be\u00c0\5\b\5\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2"+
		"\u00c3\5\36\20\2\u00c3\u00c4\5\"\22\2\u00c4\33\3\2\2\2\u00c5\u00c6\t\2"+
		"\2\2\u00c6\35\3\2\2\2\u00c7\u00ca\7\21\2\2\u00c8\u00cb\7\'\2\2\u00c9\u00cb"+
		"\5\b\5\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00d5\7(\2\2\u00cd\u00d0\7\13\2\2\u00ce\u00d1\7\'\2\2\u00cf\u00d1\5\b"+
		"\5\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\7(\2\2\u00d3\u00cd\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\7\22\2\2\u00d9\u00db\7\23\2\2\u00da\u00c7\3\2\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\37\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00e2\5H%\2\u00de\u00df"+
		"\7\13\2\2\u00df\u00e1\5H%\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e9\7\23\2\2\u00e8"+
		"\u00dc\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00eb\5$\23\2"+
		"\u00eb#\3\2\2\2\u00ec\u00f0\7\t\2\2\u00ed\u00ef\5&\24\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\n\2\2\u00f4%\3\2\2\2"+
		"\u00f5\u00f6\5(\25\2\u00f6\'\3\2\2\2\u00f7\u0102\5$\23\2\u00f8\u0102\5"+
		"\22\n\2\u00f9\u0102\5*\26\2\u00fa\u0102\5\62\32\2\u00fb\u0102\5> \2\u00fc"+
		"\u0102\5,\27\2\u00fd\u0102\5.\30\2\u00fe\u0102\5\60\31\2\u00ff\u0102\5"+
		"@!\2\u0100\u0102\5B\"\2\u0101\u00f7\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2"+
		"\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0100\3\2\2\2\u0102)\3\2\2\2\u0103\u0104\7\24\2\2\u0104\u0105\5D#\2\u0105"+
		"\u0108\5(\25\2\u0106\u0107\7\25\2\2\u0107\u0109\5(\25\2\u0108\u0106\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109+\3\2\2\2\u010a\u010b\7\26\2\2\u010b\u010c"+
		"\5D#\2\u010c\u010d\5(\25\2\u010d-\3\2\2\2\u010e\u010f\7\27\2\2\u010f\u0110"+
		"\7\4\2\2\u0110/\3\2\2\2\u0111\u0112\7\30\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\61\3\2\2\2\u0114\u0115\7\31\2\2\u0115\u0116\7\21\2\2\u0116\u0117\5\64"+
		"\33\2\u0117\u0118\7\22\2\2\u0118\u0119\5(\25\2\u0119\63\3\2\2\2\u011a"+
		"\u011c\5\66\34\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011f\7\4\2\2\u011e\u0120\5H%\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\4\2\2\u0122\u0124\58"+
		"\35\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\65\3\2\2\2\u0125\u0126"+
		"\5F$\2\u0126\67\3\2\2\2\u0127\u0128\5F$\2\u01289\3\2\2\2\u0129\u012e\7"+
		"(\2\2\u012a\u012b\7\f\2\2\u012b\u012c\5:\36\2\u012c\u012d\7\r\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u0132\5 \21\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0137\3\2\2\2\u0133\u0134\7\6\2\2\u0134\u0136\5:\36\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		";\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5:\36\2\u013b\u013c\7\16\2\2"+
		"\u013c\u013d\5H%\2\u013d=\3\2\2\2\u013e\u013f\5<\37\2\u013f\u0140\7\4"+
		"\2\2\u0140?\3\2\2\2\u0141\u0142\7\32\2\2\u0142\u0143\5H%\2\u0143\u0144"+
		"\7\4\2\2\u0144A\3\2\2\2\u0145\u0146\5H%\2\u0146\u0147\5 \21\2\u0147\u0148"+
		"\7\4\2\2\u0148C\3\2\2\2\u0149\u014a\7\21\2\2\u014a\u014b\5H%\2\u014b\u014c"+
		"\7\22\2\2\u014cE\3\2\2\2\u014d\u0152\5H%\2\u014e\u014f\7\13\2\2\u014f"+
		"\u0151\5H%\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153G\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156"+
		"\b%\1\2\u0156\u0157\5J&\2\u0157\u0158\5H%\n\u0158\u0163\3\2\2\2\u0159"+
		"\u015a\7\21\2\2\u015a\u015b\5H%\2\u015b\u015c\7\22\2\2\u015c\u0163\3\2"+
		"\2\2\u015d\u0163\5:\36\2\u015e\u0163\5<\37\2\u015f\u0163\7+\2\2\u0160"+
		"\u0163\7*\2\2\u0161\u0163\7-\2\2\u0162\u0155\3\2\2\2\u0162\u0159\3\2\2"+
		"\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0171\3\2\2\2\u0164\u0165\f\f\2\2\u0165"+
		"\u0166\5L\'\2\u0166\u0167\5H%\r\u0167\u0170\3\2\2\2\u0168\u0169\f\13\2"+
		"\2\u0169\u0170\5J&\2\u016a\u016b\f\t\2\2\u016b\u016c\7\f\2\2\u016c\u016d"+
		"\5H%\2\u016d\u016e\7\r\2\2\u016e\u0170\3\2\2\2\u016f\u0164\3\2\2\2\u016f"+
		"\u0168\3\2\2\2\u016f\u016a\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172I\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175"+
		"\t\3\2\2\u0175K\3\2\2\2\u0176\u0177\t\4\2\2\u0177M\3\2\2\2&OTZgp{\u0082"+
		"\u008e\u0093\u009a\u00a2\u00a5\u00a9\u00b3\u00b6\u00bb\u00bf\u00ca\u00d0"+
		"\u00d5\u00da\u00e2\u00e8\u00f0\u0101\u0108\u011b\u011f\u0123\u012e\u0131"+
		"\u0137\u0152\u0162\u016f\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}