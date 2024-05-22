// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Tasm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TasmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, LABEL_TO_JUMP=48, LABEL_IDENTIFIER=49, WS=50, WORD=51, 
		INT=52, DOUBLE=53, PONTO=54, LINKEBREAKER=55;
	public static final int
		RULE_start = 0, RULE_intOperators = 1, RULE_intCompare = 2, RULE_intSimpleOperators = 3, 
		RULE_intSimpleOperatorsAdd1 = 4, RULE_intSimpleOperatorsRemove1 = 5, RULE_doubleOperators = 6, 
		RULE_doubleSimpleOperators = 7, RULE_doubleSimpleOperatorsAdd1 = 8, RULE_doubleSimpleOperatorsRemove1 = 9, 
		RULE_doubleCompare = 10, RULE_stringOperators = 11, RULE_stringSimpleOperatorsAdd1 = 12, 
		RULE_stringSimpleOperatorsRemove1 = 13, RULE_stringCompare = 14, RULE_booleanOperators = 15, 
		RULE_booleanSimpleOperators = 16, RULE_booleanSimpleOperatorsAdd1 = 17, 
		RULE_booleanSimpleOperatorsRemove1 = 18, RULE_globalOperators = 19, RULE_jumpOperators = 20, 
		RULE_endOperator = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "intOperators", "intCompare", "intSimpleOperators", "intSimpleOperatorsAdd1", 
			"intSimpleOperatorsRemove1", "doubleOperators", "doubleSimpleOperators", 
			"doubleSimpleOperatorsAdd1", "doubleSimpleOperatorsRemove1", "doubleCompare", 
			"stringOperators", "stringSimpleOperatorsAdd1", "stringSimpleOperatorsRemove1", 
			"stringCompare", "booleanOperators", "booleanSimpleOperators", "booleanSimpleOperatorsAdd1", 
			"booleanSimpleOperatorsRemove1", "globalOperators", "jumpOperators", 
			"endOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ieq'", "'ineq'", "'ilt'", "'ileq'", "'iuminus'", "'iconst'", 
			"'iadd'", "'isub'", "'imult'", "'idiv'", "'imod'", "'itod'", "'itos'", 
			"'iprint'", "'duminus'", "'dconst'", "'dadd'", "'dsub'", "'dmult'", "'ddiv'", 
			"'dprint'", "'dtos'", "'deq'", "'dneq'", "'dlt'", "'dleq'", "'sconst'", 
			"'sadd'", "'sprint'", "'seq'", "'sneq'", "'not'", "'tconst'", "'fconst'", 
			"'bprint'", "'beq'", "'bneq'", "'and'", "'or'", "'btos'", "'galloc'", 
			"'gload'", "'gstore'", "'jump'", "'jumpt'", "'jumpf'", "'halt'", null, 
			null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LABEL_TO_JUMP", "LABEL_IDENTIFIER", "WS", "WORD", "INT", "DOUBLE", "PONTO", 
			"LINKEBREAKER"
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
	public String getGrammarFileName() { return "Tasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TasmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public EndOperatorContext endOperator() {
			return getRuleContext(EndOperatorContext.class,0);
		}
		public List<IntOperatorsContext> intOperators() {
			return getRuleContexts(IntOperatorsContext.class);
		}
		public IntOperatorsContext intOperators(int i) {
			return getRuleContext(IntOperatorsContext.class,i);
		}
		public List<DoubleOperatorsContext> doubleOperators() {
			return getRuleContexts(DoubleOperatorsContext.class);
		}
		public DoubleOperatorsContext doubleOperators(int i) {
			return getRuleContext(DoubleOperatorsContext.class,i);
		}
		public List<StringOperatorsContext> stringOperators() {
			return getRuleContexts(StringOperatorsContext.class);
		}
		public StringOperatorsContext stringOperators(int i) {
			return getRuleContext(StringOperatorsContext.class,i);
		}
		public List<BooleanOperatorsContext> booleanOperators() {
			return getRuleContexts(BooleanOperatorsContext.class);
		}
		public BooleanOperatorsContext booleanOperators(int i) {
			return getRuleContext(BooleanOperatorsContext.class,i);
		}
		public List<GlobalOperatorsContext> globalOperators() {
			return getRuleContexts(GlobalOperatorsContext.class);
		}
		public GlobalOperatorsContext globalOperators(int i) {
			return getRuleContext(GlobalOperatorsContext.class,i);
		}
		public List<JumpOperatorsContext> jumpOperators() {
			return getRuleContexts(JumpOperatorsContext.class);
		}
		public JumpOperatorsContext jumpOperators(int i) {
			return getRuleContext(JumpOperatorsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36732484460740606L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					intOperators();
					}
					break;
				case 2:
					{
					setState(45);
					doubleOperators();
					}
					break;
				case 3:
					{
					setState(46);
					stringOperators();
					}
					break;
				case 4:
					{
					setState(47);
					booleanOperators();
					}
					break;
				case 5:
					{
					setState(48);
					globalOperators();
					}
					break;
				case 6:
					{
					setState(49);
					jumpOperators();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			endOperator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntOperatorsContext extends ParserRuleContext {
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public IntSimpleOperatorsContext intSimpleOperators() {
			return getRuleContext(IntSimpleOperatorsContext.class,0);
		}
		public IntSimpleOperatorsAdd1Context intSimpleOperatorsAdd1() {
			return getRuleContext(IntSimpleOperatorsAdd1Context.class,0);
		}
		public IntSimpleOperatorsRemove1Context intSimpleOperatorsRemove1() {
			return getRuleContext(IntSimpleOperatorsRemove1Context.class,0);
		}
		public IntCompareContext intCompare() {
			return getRuleContext(IntCompareContext.class,0);
		}
		public IntOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterIntOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitIntOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitIntOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntOperatorsContext intOperators() throws RecognitionException {
		IntOperatorsContext _localctx = new IntOperatorsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intOperators);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(57);
					intSimpleOperators();
					}
					break;
				case 2:
					{
					setState(58);
					intSimpleOperatorsAdd1();
					}
					break;
				case 3:
					{
					setState(59);
					intSimpleOperatorsRemove1();
					}
					break;
				case 4:
					{
					setState(60);
					intCompare();
					}
					break;
				}
				setState(63);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntCompareContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public IntCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterIntCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitIntCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitIntCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntCompareContext intCompare() throws RecognitionException {
		IntCompareContext _localctx = new IntCompareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(68);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(71);
				((IntCompareContext)_localctx).operator = match(T__0);
				}
				break;
			case T__1:
				{
				setState(72);
				((IntCompareContext)_localctx).operator = match(T__1);
				}
				break;
			case T__2:
				{
				setState(73);
				((IntCompareContext)_localctx).operator = match(T__2);
				}
				break;
			case T__3:
				{
				setState(74);
				((IntCompareContext)_localctx).operator = match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntSimpleOperatorsContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public IntSimpleOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intSimpleOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterIntSimpleOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitIntSimpleOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitIntSimpleOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntSimpleOperatorsContext intSimpleOperators() throws RecognitionException {
		IntSimpleOperatorsContext _localctx = new IntSimpleOperatorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intSimpleOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(77);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(80);
			((IntSimpleOperatorsContext)_localctx).operator = match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntSimpleOperatorsAdd1Context extends ParserRuleContext {
		public Token operator;
		public Token number;
		public TerminalNode INT() { return getToken(TasmParser.INT, 0); }
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public IntSimpleOperatorsAdd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intSimpleOperatorsAdd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterIntSimpleOperatorsAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitIntSimpleOperatorsAdd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitIntSimpleOperatorsAdd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntSimpleOperatorsAdd1Context intSimpleOperatorsAdd1() throws RecognitionException {
		IntSimpleOperatorsAdd1Context _localctx = new IntSimpleOperatorsAdd1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_intSimpleOperatorsAdd1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(82);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(85);
			((IntSimpleOperatorsAdd1Context)_localctx).operator = match(T__5);
			setState(86);
			((IntSimpleOperatorsAdd1Context)_localctx).number = match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntSimpleOperatorsRemove1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public IntSimpleOperatorsRemove1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intSimpleOperatorsRemove1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterIntSimpleOperatorsRemove1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitIntSimpleOperatorsRemove1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitIntSimpleOperatorsRemove1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntSimpleOperatorsRemove1Context intSimpleOperatorsRemove1() throws RecognitionException {
		IntSimpleOperatorsRemove1Context _localctx = new IntSimpleOperatorsRemove1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_intSimpleOperatorsRemove1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(88);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(91);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__6);
				}
				break;
			case T__7:
				{
				setState(92);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__7);
				}
				break;
			case T__8:
				{
				setState(93);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__8);
				}
				break;
			case T__9:
				{
				setState(94);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__9);
				}
				break;
			case T__10:
				{
				setState(95);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__10);
				}
				break;
			case T__11:
				{
				setState(96);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__11);
				}
				break;
			case T__12:
				{
				setState(97);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__12);
				}
				break;
			case T__13:
				{
				setState(98);
				((IntSimpleOperatorsRemove1Context)_localctx).operator = match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleOperatorsContext extends ParserRuleContext {
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public DoubleSimpleOperatorsContext doubleSimpleOperators() {
			return getRuleContext(DoubleSimpleOperatorsContext.class,0);
		}
		public DoubleSimpleOperatorsAdd1Context doubleSimpleOperatorsAdd1() {
			return getRuleContext(DoubleSimpleOperatorsAdd1Context.class,0);
		}
		public DoubleSimpleOperatorsRemove1Context doubleSimpleOperatorsRemove1() {
			return getRuleContext(DoubleSimpleOperatorsRemove1Context.class,0);
		}
		public DoubleCompareContext doubleCompare() {
			return getRuleContext(DoubleCompareContext.class,0);
		}
		public DoubleOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterDoubleOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitDoubleOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitDoubleOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleOperatorsContext doubleOperators() throws RecognitionException {
		DoubleOperatorsContext _localctx = new DoubleOperatorsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doubleOperators);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(101);
					doubleSimpleOperators();
					}
					break;
				case 2:
					{
					setState(102);
					doubleSimpleOperatorsAdd1();
					}
					break;
				case 3:
					{
					setState(103);
					doubleSimpleOperatorsRemove1();
					}
					break;
				case 4:
					{
					setState(104);
					doubleCompare();
					}
					break;
				}
				setState(107);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleSimpleOperatorsContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public DoubleSimpleOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleSimpleOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterDoubleSimpleOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitDoubleSimpleOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitDoubleSimpleOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleSimpleOperatorsContext doubleSimpleOperators() throws RecognitionException {
		DoubleSimpleOperatorsContext _localctx = new DoubleSimpleOperatorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doubleSimpleOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(112);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(115);
			((DoubleSimpleOperatorsContext)_localctx).operator = match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleSimpleOperatorsAdd1Context extends ParserRuleContext {
		public Token operator;
		public Token number;
		public TerminalNode DOUBLE() { return getToken(TasmParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(TasmParser.INT, 0); }
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public DoubleSimpleOperatorsAdd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleSimpleOperatorsAdd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterDoubleSimpleOperatorsAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitDoubleSimpleOperatorsAdd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitDoubleSimpleOperatorsAdd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleSimpleOperatorsAdd1Context doubleSimpleOperatorsAdd1() throws RecognitionException {
		DoubleSimpleOperatorsAdd1Context _localctx = new DoubleSimpleOperatorsAdd1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_doubleSimpleOperatorsAdd1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(117);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(120);
			((DoubleSimpleOperatorsAdd1Context)_localctx).operator = match(T__15);
			setState(121);
			((DoubleSimpleOperatorsAdd1Context)_localctx).number = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
				((DoubleSimpleOperatorsAdd1Context)_localctx).number = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleSimpleOperatorsRemove1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public DoubleSimpleOperatorsRemove1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleSimpleOperatorsRemove1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterDoubleSimpleOperatorsRemove1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitDoubleSimpleOperatorsRemove1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitDoubleSimpleOperatorsRemove1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleSimpleOperatorsRemove1Context doubleSimpleOperatorsRemove1() throws RecognitionException {
		DoubleSimpleOperatorsRemove1Context _localctx = new DoubleSimpleOperatorsRemove1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_doubleSimpleOperatorsRemove1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(123);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(126);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__16);
				}
				break;
			case T__17:
				{
				setState(127);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__17);
				}
				break;
			case T__18:
				{
				setState(128);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__18);
				}
				break;
			case T__19:
				{
				setState(129);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__19);
				}
				break;
			case T__20:
				{
				setState(130);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__20);
				}
				break;
			case T__21:
				{
				setState(131);
				((DoubleSimpleOperatorsRemove1Context)_localctx).operator = match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleCompareContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public DoubleCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterDoubleCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitDoubleCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitDoubleCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleCompareContext doubleCompare() throws RecognitionException {
		DoubleCompareContext _localctx = new DoubleCompareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doubleCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(134);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(137);
				((DoubleCompareContext)_localctx).operator = match(T__22);
				}
				break;
			case T__23:
				{
				setState(138);
				((DoubleCompareContext)_localctx).operator = match(T__23);
				}
				break;
			case T__24:
				{
				setState(139);
				((DoubleCompareContext)_localctx).operator = match(T__24);
				}
				break;
			case T__25:
				{
				setState(140);
				((DoubleCompareContext)_localctx).operator = match(T__25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringOperatorsContext extends ParserRuleContext {
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public StringSimpleOperatorsAdd1Context stringSimpleOperatorsAdd1() {
			return getRuleContext(StringSimpleOperatorsAdd1Context.class,0);
		}
		public StringSimpleOperatorsRemove1Context stringSimpleOperatorsRemove1() {
			return getRuleContext(StringSimpleOperatorsRemove1Context.class,0);
		}
		public StringCompareContext stringCompare() {
			return getRuleContext(StringCompareContext.class,0);
		}
		public StringOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterStringOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitStringOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitStringOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOperatorsContext stringOperators() throws RecognitionException {
		StringOperatorsContext _localctx = new StringOperatorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringOperators);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(143);
					stringSimpleOperatorsAdd1();
					}
					break;
				case 2:
					{
					setState(144);
					stringSimpleOperatorsRemove1();
					}
					break;
				case 3:
					{
					setState(145);
					stringCompare();
					}
					break;
				}
				setState(148);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringSimpleOperatorsAdd1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode WORD() { return getToken(TasmParser.WORD, 0); }
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public StringSimpleOperatorsAdd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSimpleOperatorsAdd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterStringSimpleOperatorsAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitStringSimpleOperatorsAdd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitStringSimpleOperatorsAdd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringSimpleOperatorsAdd1Context stringSimpleOperatorsAdd1() throws RecognitionException {
		StringSimpleOperatorsAdd1Context _localctx = new StringSimpleOperatorsAdd1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringSimpleOperatorsAdd1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(153);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(156);
			((StringSimpleOperatorsAdd1Context)_localctx).operator = match(T__26);
			setState(157);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringSimpleOperatorsRemove1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public StringSimpleOperatorsRemove1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSimpleOperatorsRemove1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterStringSimpleOperatorsRemove1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitStringSimpleOperatorsRemove1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitStringSimpleOperatorsRemove1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringSimpleOperatorsRemove1Context stringSimpleOperatorsRemove1() throws RecognitionException {
		StringSimpleOperatorsRemove1Context _localctx = new StringSimpleOperatorsRemove1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringSimpleOperatorsRemove1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(159);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(162);
				((StringSimpleOperatorsRemove1Context)_localctx).operator = match(T__27);
				}
				break;
			case T__28:
				{
				setState(163);
				((StringSimpleOperatorsRemove1Context)_localctx).operator = match(T__28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringCompareContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public StringCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterStringCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitStringCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitStringCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringCompareContext stringCompare() throws RecognitionException {
		StringCompareContext _localctx = new StringCompareContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(166);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				{
				setState(169);
				((StringCompareContext)_localctx).operator = match(T__29);
				}
				break;
			case T__30:
				{
				setState(170);
				((StringCompareContext)_localctx).operator = match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOperatorsContext extends ParserRuleContext {
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public BooleanSimpleOperatorsContext booleanSimpleOperators() {
			return getRuleContext(BooleanSimpleOperatorsContext.class,0);
		}
		public BooleanSimpleOperatorsAdd1Context booleanSimpleOperatorsAdd1() {
			return getRuleContext(BooleanSimpleOperatorsAdd1Context.class,0);
		}
		public BooleanSimpleOperatorsRemove1Context booleanSimpleOperatorsRemove1() {
			return getRuleContext(BooleanSimpleOperatorsRemove1Context.class,0);
		}
		public BooleanOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterBooleanOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitBooleanOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitBooleanOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorsContext booleanOperators() throws RecognitionException {
		BooleanOperatorsContext _localctx = new BooleanOperatorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanOperators);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(173);
					booleanSimpleOperators();
					}
					break;
				case 2:
					{
					setState(174);
					booleanSimpleOperatorsAdd1();
					}
					break;
				case 3:
					{
					setState(175);
					booleanSimpleOperatorsRemove1();
					}
					break;
				}
				setState(178);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanSimpleOperatorsContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public BooleanSimpleOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSimpleOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterBooleanSimpleOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitBooleanSimpleOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitBooleanSimpleOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSimpleOperatorsContext booleanSimpleOperators() throws RecognitionException {
		BooleanSimpleOperatorsContext _localctx = new BooleanSimpleOperatorsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanSimpleOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(183);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(186);
			((BooleanSimpleOperatorsContext)_localctx).operator = match(T__31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanSimpleOperatorsAdd1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public BooleanSimpleOperatorsAdd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSimpleOperatorsAdd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterBooleanSimpleOperatorsAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitBooleanSimpleOperatorsAdd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitBooleanSimpleOperatorsAdd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSimpleOperatorsAdd1Context booleanSimpleOperatorsAdd1() throws RecognitionException {
		BooleanSimpleOperatorsAdd1Context _localctx = new BooleanSimpleOperatorsAdd1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanSimpleOperatorsAdd1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(188);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				{
				setState(191);
				((BooleanSimpleOperatorsAdd1Context)_localctx).operator = match(T__32);
				}
				break;
			case T__33:
				{
				setState(192);
				((BooleanSimpleOperatorsAdd1Context)_localctx).operator = match(T__33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanSimpleOperatorsRemove1Context extends ParserRuleContext {
		public Token operator;
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public BooleanSimpleOperatorsRemove1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSimpleOperatorsRemove1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterBooleanSimpleOperatorsRemove1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitBooleanSimpleOperatorsRemove1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitBooleanSimpleOperatorsRemove1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSimpleOperatorsRemove1Context booleanSimpleOperatorsRemove1() throws RecognitionException {
		BooleanSimpleOperatorsRemove1Context _localctx = new BooleanSimpleOperatorsRemove1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanSimpleOperatorsRemove1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_IDENTIFIER) {
				{
				setState(195);
				match(LABEL_IDENTIFIER);
				}
			}

			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(198);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__34);
				}
				break;
			case T__35:
				{
				setState(199);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__35);
				}
				break;
			case T__36:
				{
				setState(200);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__36);
				}
				break;
			case T__37:
				{
				setState(201);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__37);
				}
				break;
			case T__38:
				{
				setState(202);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__38);
				}
				break;
			case T__39:
				{
				setState(203);
				((BooleanSimpleOperatorsRemove1Context)_localctx).operator = match(T__39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalOperatorsContext extends ParserRuleContext {
		public Token operator;
		public Token number;
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(TasmParser.INT, 0); }
		public GlobalOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterGlobalOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitGlobalOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitGlobalOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalOperatorsContext globalOperators() throws RecognitionException {
		GlobalOperatorsContext _localctx = new GlobalOperatorsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_globalOperators);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_IDENTIFIER) {
					{
					setState(206);
					match(LABEL_IDENTIFIER);
					}
				}

				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__40:
					{
					setState(209);
					((GlobalOperatorsContext)_localctx).operator = match(T__40);
					setState(210);
					((GlobalOperatorsContext)_localctx).number = match(INT);
					}
					break;
				case T__41:
					{
					setState(211);
					((GlobalOperatorsContext)_localctx).operator = match(T__41);
					setState(212);
					((GlobalOperatorsContext)_localctx).number = match(INT);
					}
					break;
				case T__42:
					{
					setState(213);
					((GlobalOperatorsContext)_localctx).operator = match(T__42);
					setState(214);
					((GlobalOperatorsContext)_localctx).number = match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JumpOperatorsContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LINKEBREAKER() { return getToken(TasmParser.LINKEBREAKER, 0); }
		public TerminalNode LABEL_IDENTIFIER() { return getToken(TasmParser.LABEL_IDENTIFIER, 0); }
		public List<TerminalNode> LABEL_TO_JUMP() { return getTokens(TasmParser.LABEL_TO_JUMP); }
		public TerminalNode LABEL_TO_JUMP(int i) {
			return getToken(TasmParser.LABEL_TO_JUMP, i);
		}
		public List<TerminalNode> INT() { return getTokens(TasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TasmParser.INT, i);
		}
		public JumpOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterJumpOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitJumpOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitJumpOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpOperatorsContext jumpOperators() throws RecognitionException {
		JumpOperatorsContext _localctx = new JumpOperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jumpOperators);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
			case LABEL_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_IDENTIFIER) {
					{
					setState(221);
					match(LABEL_IDENTIFIER);
					}
				}

				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__43:
					{
					setState(224);
					((JumpOperatorsContext)_localctx).operator = match(T__43);
					}
					break;
				case T__44:
					{
					setState(225);
					((JumpOperatorsContext)_localctx).operator = match(T__44);
					}
					break;
				case T__45:
					{
					setState(226);
					((JumpOperatorsContext)_localctx).operator = match(T__45);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					_la = _input.LA(1);
					if ( !(_la==LABEL_TO_JUMP || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LABEL_TO_JUMP || _la==INT );
				setState(234);
				match(LINKEBREAKER);
				}
				break;
			case LINKEBREAKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(LINKEBREAKER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndOperatorContext extends ParserRuleContext {
		public Token operator;
		public EndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).enterEndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TasmListener ) ((TasmListener)listener).exitEndOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TasmVisitor ) return ((TasmVisitor<? extends T>)visitor).visitEndOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOperatorContext endOperator() throws RecognitionException {
		EndOperatorContext _localctx = new EndOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((EndOperatorContext)_localctx).operator = match(T__46);
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

	public static final String _serializedATN =
		"\u0004\u00017\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0003\u0005Z\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006o\b\u0006"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003"+
		"\bw\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t}\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0085\b\t\u0001\n\u0003\n\u0088\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0093\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0098\b\u000b\u0001\f\u0003\f\u009b\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0003\r\u00a5\b\r\u0001\u000e"+
		"\u0003\u000e\u00a8\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ac\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b1\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b6\b\u000f\u0001\u0010\u0003"+
		"\u0010\u00b9\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u00be"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c2\b\u0011\u0001\u0012"+
		"\u0003\u0012\u00c5\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00cd\b\u0012\u0001\u0013\u0003\u0013"+
		"\u00d0\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d8\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00dc\b\u0013\u0001\u0014\u0003\u0014\u00df\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00e4\b\u0014\u0001\u0014\u0004\u0014\u00e7"+
		"\b\u0014\u000b\u0014\f\u0014\u00e8\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00ed\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0002\u0001\u000045\u0002\u00000044\u011f\u00004\u0001"+
		"\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nY\u0001"+
		"\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000"+
		"\u0000\u0010v\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014"+
		"\u0087\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u009a\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c"+
		"\u00a7\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00b8"+
		"\u0001\u0000\u0000\u0000\"\u00bd\u0001\u0000\u0000\u0000$\u00c4\u0001"+
		"\u0000\u0000\u0000&\u00db\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000\u0000"+
		"\u0000*\u00ee\u0001\u0000\u0000\u0000,3\u0003\u0002\u0001\u0000-3\u0003"+
		"\f\u0006\u0000.3\u0003\u0016\u000b\u0000/3\u0003\u001e\u000f\u000003\u0003"+
		"&\u0013\u000013\u0003(\u0014\u00002,\u0001\u0000\u0000\u00002-\u0001\u0000"+
		"\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000078\u0003*\u0015\u00008\u0001\u0001\u0000"+
		"\u0000\u00009>\u0003\u0006\u0003\u0000:>\u0003\b\u0004\u0000;>\u0003\n"+
		"\u0005\u0000<>\u0003\u0004\u0002\u0000=9\u0001\u0000\u0000\u0000=:\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u00057\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"AC\u00057\u0000\u0000B=\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"C\u0003\u0001\u0000\u0000\u0000DF\u00051\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FK\u0001\u0000\u0000\u0000GL\u0005\u0001"+
		"\u0000\u0000HL\u0005\u0002\u0000\u0000IL\u0005\u0003\u0000\u0000JL\u0005"+
		"\u0004\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000"+
		"\u0000\u0000MO\u00051\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0005\u0000\u0000Q\u0007"+
		"\u0001\u0000\u0000\u0000RT\u00051\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0006\u0000"+
		"\u0000VW\u00054\u0000\u0000W\t\u0001\u0000\u0000\u0000XZ\u00051\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zc\u0001\u0000"+
		"\u0000\u0000[d\u0005\u0007\u0000\u0000\\d\u0005\b\u0000\u0000]d\u0005"+
		"\t\u0000\u0000^d\u0005\n\u0000\u0000_d\u0005\u000b\u0000\u0000`d\u0005"+
		"\f\u0000\u0000ad\u0005\r\u0000\u0000bd\u0005\u000e\u0000\u0000c[\u0001"+
		"\u0000\u0000\u0000c\\\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u000b\u0001"+
		"\u0000\u0000\u0000ej\u0003\u000e\u0007\u0000fj\u0003\u0010\b\u0000gj\u0003"+
		"\u0012\t\u0000hj\u0003\u0014\n\u0000ie\u0001\u0000\u0000\u0000if\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u00057\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mo\u00057\u0000\u0000ni\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"o\r\u0001\u0000\u0000\u0000pr\u00051\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u000f\u0000"+
		"\u0000t\u000f\u0001\u0000\u0000\u0000uw\u00051\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005"+
		"\u0010\u0000\u0000yz\u0007\u0000\u0000\u0000z\u0011\u0001\u0000\u0000"+
		"\u0000{}\u00051\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0084\u0001\u0000\u0000\u0000~\u0085\u0005\u0011\u0000\u0000\u007f"+
		"\u0085\u0005\u0012\u0000\u0000\u0080\u0085\u0005\u0013\u0000\u0000\u0081"+
		"\u0085\u0005\u0014\u0000\u0000\u0082\u0085\u0005\u0015\u0000\u0000\u0083"+
		"\u0085\u0005\u0016\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084\u007f"+
		"\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u00051\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089\u008e\u0005"+
		"\u0017\u0000\u0000\u008a\u008e\u0005\u0018\u0000\u0000\u008b\u008e\u0005"+
		"\u0019\u0000\u0000\u008c\u008e\u0005\u001a\u0000\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0015\u0001"+
		"\u0000\u0000\u0000\u008f\u0093\u0003\u0018\f\u0000\u0090\u0093\u0003\u001a"+
		"\r\u0000\u0091\u0093\u0003\u001c\u000e\u0000\u0092\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u00057\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u00057\u0000\u0000\u0097"+
		"\u0092\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0017\u0001\u0000\u0000\u0000\u0099\u009b\u00051\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001b\u0000\u0000\u009d\u009e"+
		"\u00053\u0000\u0000\u009e\u0019\u0001\u0000\u0000\u0000\u009f\u00a1\u0005"+
		"1\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a5\u0005\u001c"+
		"\u0000\u0000\u00a3\u00a5\u0005\u001d\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u001b\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u00051\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0005\u001e\u0000\u0000\u00aa\u00ac\u0005\u001f\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003 \u0010\u0000"+
		"\u00ae\u00b1\u0003\"\u0011\u0000\u00af\u00b1\u0003$\u0012\u0000\u00b0"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u00057\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u00057\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005"+
		"1\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005 \u0000"+
		"\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00be\u00051\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c1\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005!\u0000\u0000\u00c0\u00c2"+
		"\u0005\"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c5\u00051\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00cc\u0001\u0000\u0000\u0000\u00c6\u00cd\u0005#\u0000\u0000"+
		"\u00c7\u00cd\u0005$\u0000\u0000\u00c8\u00cd\u0005%\u0000\u0000\u00c9\u00cd"+
		"\u0005&\u0000\u0000\u00ca\u00cd\u0005\'\u0000\u0000\u00cb\u00cd\u0005"+
		"(\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce\u00d0\u00051\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d7\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005)\u0000\u0000\u00d2"+
		"\u00d8\u00054\u0000\u0000\u00d3\u00d4\u0005*\u0000\u0000\u00d4\u00d8\u0005"+
		"4\u0000\u0000\u00d5\u00d6\u0005+\u0000\u0000\u00d6\u00d8\u00054\u0000"+
		"\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u00057\u0000\u0000\u00da\u00dc\u00057\u0000\u0000\u00db"+
		"\u00cf\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\'\u0001\u0000\u0000\u0000\u00dd\u00df\u00051\u0000\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e4\u0005,\u0000\u0000\u00e1\u00e4\u0005"+
		"-\u0000\u0000\u00e2\u00e4\u0005.\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e7\u0007\u0001\u0000"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u00057\u0000\u0000"+
		"\u00eb\u00ed\u00057\u0000\u0000\u00ec\u00de\u0001\u0000\u0000\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed)\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005/\u0000\u0000\u00ef+\u0001\u0000\u0000\u0000\'24=BEKNSYcinqv|\u0084"+
		"\u0087\u008d\u0092\u0097\u009a\u00a0\u00a4\u00a7\u00ab\u00b0\u00b5\u00b8"+
		"\u00bd\u00c1\u00c4\u00cc\u00cf\u00d7\u00db\u00de\u00e3\u00e8\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}