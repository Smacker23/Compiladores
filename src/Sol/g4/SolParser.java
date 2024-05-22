// Generated from C:/Users/alexd/OneDrive/Ambiente de Trabalho/Compiladores/projeto_parte4/Sol.g4 by ANTLR 4.13.1
package Sol.g4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RETURN=2, VAR=3, IF=4, ELSE=5, THEN=6, EQUAL=7, COMMA=8, BREAK=9, 
		WHILE=10, DO=11, FOR=12, TO=13, BEGIN=14, END=15, MOD=16, LPARENT=17, 
		RPARENT=18, PRINT=19, SEMICON=20, MULT=21, DIVISAO=22, ADD=23, MENOS=24, 
		INT=25, DOUBLE=26, STRING=27, BOOL=28, WS=29, RELACIONAL=30, IDUALDADE=31, 
		ELOGICO=32, OULOGICO=33, NOT=34, VARNAME=35, SL_COMMENT=36, ML_COMMENT=37;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_function = 2, RULE_line = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "function", "line", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'return'", null, "'if'", "'else'", "'then'", "'='", 
			"','", "'break'", "'while'", "'do'", "'for'", "'to'", "'begin'", "'end'", 
			"'%'", "'('", "')'", "'print'", "';'", "'*'", "'/'", "'+'", "'-'", null, 
			null, null, null, null, null, null, "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "RETURN", "VAR", "IF", "ELSE", "THEN", "EQUAL", "COMMA", 
			"BREAK", "WHILE", "DO", "FOR", "TO", "BEGIN", "END", "MOD", "LPARENT", 
			"RPARENT", "PRINT", "SEMICON", "MULT", "DIVISAO", "ADD", "MENOS", "INT", 
			"DOUBLE", "STRING", "BOOL", "WS", "RELACIONAL", "IDUALDADE", "ELOGICO", 
			"OULOGICO", "NOT", "VARNAME", "SL_COMMENT", "ML_COMMENT"
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
	public String getGrammarFileName() { return "Sol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitStart(this);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34361333278L) != 0)) {
				{
				{
				setState(10);
				block();
				}
				}
				setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(16);
				line();
				}
				break;
			case 2:
				{
				setState(17);
				function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token functionType;
		public List<TerminalNode> VARNAME() { return getTokens(SolParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(SolParser.VARNAME, i);
		}
		public TerminalNode LPARENT() { return getToken(SolParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SolParser.RPARENT, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(SolParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SolParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SolParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((FunctionContext)_localctx).functionType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==VAR) ) {
				((FunctionContext)_localctx).functionType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(21);
			match(VARNAME);
			setState(22);
			match(LPARENT);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(23);
				match(VAR);
				setState(24);
				match(VARNAME);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(25);
					match(COMMA);
					setState(26);
					match(VAR);
					setState(27);
					match(VARNAME);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(35);
			match(RPARENT);
			setState(36);
			line();
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
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CasePrintContext extends LineContext {
		public TerminalNode PRINT() { return getToken(SolParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICON() { return getToken(SolParser.SEMICON, 0); }
		public CasePrintContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCasePrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCasePrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCasePrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseForContext extends LineContext {
		public TerminalNode FOR() { return getToken(SolParser.FOR, 0); }
		public TerminalNode VARNAME() { return getToken(SolParser.VARNAME, 0); }
		public TerminalNode EQUAL() { return getToken(SolParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(SolParser.TO, 0); }
		public TerminalNode DO() { return getToken(SolParser.DO, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public CaseForContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseReturnContext extends LineContext {
		public TerminalNode RETURN() { return getToken(SolParser.RETURN, 0); }
		public TerminalNode SEMICON() { return getToken(SolParser.SEMICON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseReturnContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseBreakContext extends LineContext {
		public TerminalNode BREAK() { return getToken(SolParser.BREAK, 0); }
		public TerminalNode SEMICON() { return getToken(SolParser.SEMICON, 0); }
		public CaseBreakContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends LineContext {
		public TerminalNode BEGIN() { return getToken(SolParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SolParser.END, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CaseBlockContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhileContext extends LineContext {
		public TerminalNode WHILE() { return getToken(SolParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(SolParser.DO, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public CaseWhileContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseIfContext extends LineContext {
		public TerminalNode IF() { return getToken(SolParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SolParser.THEN, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SolParser.ELSE, 0); }
		public CaseIfContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseEmptyContext extends LineContext {
		public TerminalNode SEMICON() { return getToken(SolParser.SEMICON, 0); }
		public CaseEmptyContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseVariableContext extends LineContext {
		public TerminalNode SEMICON() { return getToken(SolParser.SEMICON, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(SolParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(SolParser.VARNAME, i);
		}
		public TerminalNode VAR() { return getToken(SolParser.VAR, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(SolParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SolParser.EQUAL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SolParser.COMMA, i);
		}
		public CaseVariableContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCaseVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCaseVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCaseVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new CaseWhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(WHILE);
				setState(39);
				expr(0);
				setState(40);
				match(DO);
				{
				setState(41);
				line();
				}
				}
				break;
			case FOR:
				_localctx = new CaseForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(FOR);
				setState(44);
				match(VARNAME);
				setState(45);
				match(EQUAL);
				setState(46);
				expr(0);
				setState(47);
				match(TO);
				setState(48);
				expr(0);
				setState(49);
				match(DO);
				{
				setState(50);
				line();
				}
				}
				break;
			case IF:
				_localctx = new CaseIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(IF);
				setState(53);
				expr(0);
				setState(54);
				match(THEN);
				setState(55);
				line();
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(56);
					match(ELSE);
					setState(57);
					line();
					}
					break;
				}
				}
				break;
			case PRINT:
				_localctx = new CasePrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(PRINT);
				setState(61);
				expr(0);
				setState(62);
				match(SEMICON);
				}
				break;
			case VAR:
			case VARNAME:
				_localctx = new CaseVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(64);
					match(VAR);
					}
				}

				setState(67);
				match(VARNAME);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(68);
					match(EQUAL);
					setState(69);
					expr(0);
					}
				}

				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					match(VARNAME);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(74);
						match(EQUAL);
						setState(75);
						expr(0);
						}
					}

					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(83);
				match(SEMICON);
				}
				break;
			case BREAK:
				_localctx = new CaseBreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(BREAK);
				setState(85);
				match(SEMICON);
				}
				break;
			case SEMICON:
				_localctx = new CaseEmptyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(SEMICON);
				}
				break;
			case BEGIN:
				_localctx = new CaseBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(BEGIN);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					line();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34361333276L) != 0) );
				setState(93);
				match(END);
				}
				break;
			case RETURN:
				_localctx = new CaseReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(RETURN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52059832320L) != 0)) {
					{
					setState(96);
					expr(0);
					}
				}

				setState(99);
				match(SEMICON);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModExpressionContext extends ExprContext {
		public Token operador;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(SolParser.MULT, 0); }
		public TerminalNode DIVISAO() { return getToken(SolParser.DIVISAO, 0); }
		public TerminalNode MOD() { return getToken(SolParser.MOD, 0); }
		public MultDivModExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterMultDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitMultDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitMultDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(SolParser.VARNAME, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(SolParser.VARNAME, 0); }
		public TerminalNode LPARENT() { return getToken(SolParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SolParser.RPARENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SolParser.COMMA, i);
		}
		public FuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReelExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELACIONAL() { return getToken(SolParser.RELACIONAL, 0); }
		public ReelExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterReelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitReelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitReelExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExprContext {
		public Token operador;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SolParser.NOT, 0); }
		public TerminalNode MENOS() { return getToken(SolParser.MENOS, 0); }
		public UnaryExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(SolParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OULOGICO() { return getToken(SolParser.OULOGICO, 0); }
		public OrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(SolParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(SolParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesExpressionContext extends ExprContext {
		public TerminalNode LPARENT() { return getToken(SolParser.LPARENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SolParser.RPARENT, 0); }
		public ParenthesesExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExprContext {
		public Token operador;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SolParser.ADD, 0); }
		public TerminalNode MENOS() { return getToken(SolParser.MENOS, 0); }
		public AddSubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdualExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDUALDADE() { return getToken(SolParser.IDUALDADE, 0); }
		public IdualExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterIdualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitIdualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitIdualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELOGICO() { return getToken(SolParser.ELOGICO, 0); }
		public AndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(SolParser.BOOL, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(LPARENT);
				setState(104);
				expr(0);
				setState(105);
				match(RPARENT);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((UnaryExpressionContext)_localctx).operador = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MENOS || _la==NOT) ) {
					((UnaryExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(VARNAME);
				setState(114);
				match(LPARENT);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52059832320L) != 0)) {
					{
					setState(115);
					expr(0);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(116);
						match(COMMA);
						setState(117);
						expr(0);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(125);
				match(RPARENT);
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(VARNAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(130);
						((MultDivModExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6356992L) != 0)) ) {
							((MultDivModExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(133);
						((AddSubExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MENOS) ) {
							((AddSubExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ReelExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(136);
						match(RELACIONAL);
						setState(137);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new IdualExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						match(IDUALDADE);
						setState(140);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(142);
						match(ELOGICO);
						setState(143);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(145);
						match(OULOGICO);
						setState(146);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u001d\b\u0002\n\u0002\f\u0002 \t\u0002\u0003\u0002\"\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0005"+
		"\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003Z\b\u0003\u000b"+
		"\u0003\f\u0003[\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003b\b\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004w\b\u0004\n\u0004\f\u0004z\t\u0004"+
		"\u0003\u0004|\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0080\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0094\b\u0004\n\u0004\f\u0004\u0097\t\u0004\u0001\u0004\u0000"+
		"\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0004\u0002\u0000\u0001"+
		"\u0001\u0003\u0003\u0002\u0000\u0018\u0018\"\"\u0002\u0000\u0010\u0010"+
		"\u0015\u0016\u0001\u0000\u0017\u0018\u00b5\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000"+
		"\u0006d\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\f\u0003"+
		"\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000"+
		"\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000"+
		"\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u0010\u0013\u0003\u0006\u0003\u0000\u0011\u0013\u0003\u0004\u0002\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0007\u0000\u0000\u0000"+
		"\u0015\u0016\u0005#\u0000\u0000\u0016!\u0005\u0011\u0000\u0000\u0017\u0018"+
		"\u0005\u0003\u0000\u0000\u0018\u001e\u0005#\u0000\u0000\u0019\u001a\u0005"+
		"\b\u0000\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001d\u0005#"+
		"\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!\u0017\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0012\u0000\u0000$%\u0003\u0006\u0003\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&\'\u0005\n\u0000\u0000\'(\u0003\b\u0004\u0000"+
		"()\u0005\u000b\u0000\u0000)*\u0003\u0006\u0003\u0000*e\u0001\u0000\u0000"+
		"\u0000+,\u0005\f\u0000\u0000,-\u0005#\u0000\u0000-.\u0005\u0007\u0000"+
		"\u0000./\u0003\b\u0004\u0000/0\u0005\r\u0000\u000001\u0003\b\u0004\u0000"+
		"12\u0005\u000b\u0000\u000023\u0003\u0006\u0003\u00003e\u0001\u0000\u0000"+
		"\u000045\u0005\u0004\u0000\u000056\u0003\b\u0004\u000067\u0005\u0006\u0000"+
		"\u00007:\u0003\u0006\u0003\u000089\u0005\u0005\u0000\u00009;\u0003\u0006"+
		"\u0003\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;e\u0001"+
		"\u0000\u0000\u0000<=\u0005\u0013\u0000\u0000=>\u0003\b\u0004\u0000>?\u0005"+
		"\u0014\u0000\u0000?e\u0001\u0000\u0000\u0000@B\u0005\u0003\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CF\u0005#\u0000\u0000DE\u0005\u0007\u0000\u0000EG\u0003\b\u0004"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GP\u0001\u0000"+
		"\u0000\u0000HI\u0005\b\u0000\u0000IL\u0005#\u0000\u0000JK\u0005\u0007"+
		"\u0000\u0000KM\u0003\b\u0004\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000Se\u0005\u0014\u0000"+
		"\u0000TU\u0005\t\u0000\u0000Ue\u0005\u0014\u0000\u0000Ve\u0005\u0014\u0000"+
		"\u0000WY\u0005\u000e\u0000\u0000XZ\u0003\u0006\u0003\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u000f\u0000\u0000"+
		"^e\u0001\u0000\u0000\u0000_a\u0005\u0002\u0000\u0000`b\u0003\b\u0004\u0000"+
		"a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ce\u0005\u0014\u0000\u0000d&\u0001\u0000\u0000\u0000d+\u0001\u0000"+
		"\u0000\u0000d4\u0001\u0000\u0000\u0000d<\u0001\u0000\u0000\u0000dA\u0001"+
		"\u0000\u0000\u0000dT\u0001\u0000\u0000\u0000dV\u0001\u0000\u0000\u0000"+
		"dW\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000e\u0007\u0001\u0000"+
		"\u0000\u0000fg\u0006\u0004\uffff\uffff\u0000gh\u0005\u0011\u0000\u0000"+
		"hi\u0003\b\u0004\u0000ij\u0005\u0012\u0000\u0000j\u0080\u0001\u0000\u0000"+
		"\u0000kl\u0007\u0001\u0000\u0000l\u0080\u0003\b\u0004\rm\u0080\u0005\u001b"+
		"\u0000\u0000n\u0080\u0005\u0019\u0000\u0000o\u0080\u0005\u001a\u0000\u0000"+
		"p\u0080\u0005\u001c\u0000\u0000qr\u0005#\u0000\u0000r{\u0005\u0011\u0000"+
		"\u0000sx\u0003\b\u0004\u0000tu\u0005\b\u0000\u0000uw\u0003\b\u0004\u0000"+
		"vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{s\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0080\u0005\u0012\u0000\u0000~\u0080\u0005#\u0000"+
		"\u0000\u007ff\u0001\u0000\u0000\u0000\u007fk\u0001\u0000\u0000\u0000\u007f"+
		"m\u0001\u0000\u0000\u0000\u007fn\u0001\u0000\u0000\u0000\u007fo\u0001"+
		"\u0000\u0000\u0000\u007fp\u0001\u0000\u0000\u0000\u007fq\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0095\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\n\f\u0000\u0000\u0082\u0083\u0007\u0002\u0000\u0000\u0083"+
		"\u0094\u0003\b\u0004\r\u0084\u0085\n\u000b\u0000\u0000\u0085\u0086\u0007"+
		"\u0003\u0000\u0000\u0086\u0094\u0003\b\u0004\f\u0087\u0088\n\n\u0000\u0000"+
		"\u0088\u0089\u0005\u001e\u0000\u0000\u0089\u0094\u0003\b\u0004\u000b\u008a"+
		"\u008b\n\t\u0000\u0000\u008b\u008c\u0005\u001f\u0000\u0000\u008c\u0094"+
		"\u0003\b\u0004\n\u008d\u008e\n\b\u0000\u0000\u008e\u008f\u0005 \u0000"+
		"\u0000\u008f\u0094\u0003\b\u0004\t\u0090\u0091\n\u0007\u0000\u0000\u0091"+
		"\u0092\u0005!\u0000\u0000\u0092\u0094\u0003\b\u0004\b\u0093\u0081\u0001"+
		"\u0000\u0000\u0000\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0087\u0001"+
		"\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0011\r\u0012\u001e!:AFLP[adx{\u007f\u0093\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}