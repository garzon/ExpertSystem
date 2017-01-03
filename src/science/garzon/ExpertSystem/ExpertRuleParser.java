// Generated from D:/文档/我在FDU/ExpertSystem/src\ExpertRule.g4 by ANTLR 4.6
package science.garzon.ExpertSystem;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpertRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INPUT=10, OUTPUT=11, IF=12, IS=13, OF=14, FROM=15, TO=16, THEN=17, AND=18, 
		OR=19, VAR=20, COMMENT=21, NUMBER=22, STRING=23, WS=24;
	public static final int
		RULE_goal = 0, RULE_input = 1, RULE_var = 2, RULE_output = 3, RULE_ifStatement = 4, 
		RULE_varName = 5, RULE_number = 6, RULE_varDeclare = 7, RULE_val = 8, 
		RULE_assignOp = 9, RULE_assignExp = 10, RULE_op = 11, RULE_exp = 12;
	public static final String[] ruleNames = {
		"goal", "input", "var", "output", "ifStatement", "varName", "number", 
		"varDeclare", "val", "assignOp", "assignExp", "op", "exp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'number'", "'string'", "'='", "'<'", "'<='", "'>'", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INPUT", "OUTPUT", 
		"IF", "IS", "OF", "FROM", "TO", "THEN", "AND", "OR", "VAR", "COMMENT", 
		"NUMBER", "STRING", "WS"
	};
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
	public String getGrammarFileName() { return "ExpertRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpertRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			input();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(27);
				var();
				}
			}

			setState(30);
			output();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(31);
				ifStatement();
				}
				}
				setState(36);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ExpertRuleParser.INPUT, 0); }
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(INPUT);
			setState(38);
			match(T__0);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				varDeclare();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(44);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExpertRuleParser.VAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExpertRuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExpertRuleParser.STRING, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VAR);
			setState(47);
			match(T__0);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(STRING);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(53);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ExpertRuleParser.OUTPUT, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExpertRuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExpertRuleParser.STRING, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(OUTPUT);
			setState(56);
			match(T__0);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(STRING);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(62);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExpertRuleParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ExpertRuleParser.THEN, 0); }
		public List<AssignExpContext> assignExp() {
			return getRuleContexts(AssignExpContext.class);
		}
		public AssignExpContext assignExp(int i) {
			return getRuleContext(AssignExpContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			exp(0);
			setState(66);
			match(THEN);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				assignExp();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExpertRuleParser.STRING, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ExpertRuleParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUMBER);
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

	public static class VarDeclareContext extends ParserRuleContext {
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
	 
		public VarDeclareContext() { }
		public void copyFrom(VarDeclareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrDeclareContext extends VarDeclareContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(ExpertRuleParser.IS, 0); }
		public TerminalNode OF() { return getToken(ExpertRuleParser.OF, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExpertRuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExpertRuleParser.STRING, i);
		}
		public StrDeclareContext(VarDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterStrDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitStrDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitStrDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumDeclareContext extends VarDeclareContext {
		public NumberContext left;
		public NumberContext right;
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(ExpertRuleParser.IS, 0); }
		public TerminalNode FROM() { return getToken(ExpertRuleParser.FROM, 0); }
		public TerminalNode TO() { return getToken(ExpertRuleParser.TO, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public NumDeclareContext(VarDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterNumDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitNumDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitNumDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclare);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NumDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				varName();
				setState(77);
				match(IS);
				setState(78);
				match(T__2);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(79);
					match(FROM);
					setState(80);
					((NumDeclareContext)_localctx).left = number();
					}
				}

				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(83);
					match(TO);
					setState(84);
					((NumDeclareContext)_localctx).right = number();
					}
				}

				}
				break;
			case 2:
				_localctx = new StrDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				varName();
				setState(88);
				match(IS);
				setState(89);
				match(T__3);
				setState(90);
				match(OF);
				setState(91);
				match(T__0);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					match(STRING);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(97);
				match(T__1);
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

	public static class ValContext extends ParserRuleContext {
		public NumberContext num;
		public Token str;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExpertRuleParser.STRING, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_val);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((ValContext)_localctx).num = number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((ValContext)_localctx).str = match(STRING);
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(ExpertRuleParser.IS, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitAssignOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==IS) ) {
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

	public static class AssignExpContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AssignExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpContext assignExp() throws RecognitionException {
		AssignExpContext _localctx = new AssignExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			varName();
			setState(108);
			assignOp();
			setState(109);
			val();
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

	public static class OpContext extends ParserRuleContext {
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				assignOp();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__8);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpContext extends ExpContext {
		public ExpContext l;
		public ExpContext r;
		public TerminalNode AND() { return getToken(ExpertRuleParser.AND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpContext {
		public ExpContext l;
		public ExpContext r;
		public TerminalNode OR() { return getToken(ExpertRuleParser.OR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExpContext extends ExpContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public OpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).enterOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpertRuleListener ) ((ExpertRuleListener)listener).exitOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpertRuleVisitor ) return ((ExpertRuleVisitor<? extends T>)visitor).visitOpExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OpExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(119);
			varName();
			setState(120);
			op();
			setState(121);
			val();
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new OrExpContext(new ExpContext(_parentctx, _parentState));
						((OrExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(124);
						match(OR);
						setState(125);
						((OrExpContext)_localctx).r = exp(3);
						}
						break;
					case 2:
						{
						_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
						((AndExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(126);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(127);
						match(AND);
						setState(128);
						((AndExpContext)_localctx).r = exp(2);
						}
						break;
					}
					} 
				}
				setState(133);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\3\4\3\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\4\3\4\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\6\6G\n\6\r\6\16\6H\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"T\n\t\3\t\3\t\5\tX\n\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t`\n\t\r\t\16\ta\3\t"+
		"\3\t\5\tf\n\t\3\n\3\n\5\nj\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\rw\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0084\n\16\f\16\16\16\u0087\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\3\4\2\7\7\17\17\u008c\2\34\3\2\2\2\4\'\3\2\2\2\6"+
		"\60\3\2\2\2\b9\3\2\2\2\nB\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20e\3\2\2\2\22"+
		"i\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30v\3\2\2\2\32x\3\2\2\2\34\36\5\4\3"+
		"\2\35\37\5\6\4\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 $\5\b\5\2!#\5"+
		"\n\6\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2"+
		"\'(\7\f\2\2(*\7\3\2\2)+\5\20\t\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-.\3\2\2\2./\7\4\2\2/\5\3\2\2\2\60\61\7\26\2\2\61\63\7\3\2\2\62\64\7"+
		"\31\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\3\2\2\2\678\7\4\2\28\7\3\2\2\29:\7\r\2\2:<\7\3\2\2;=\7\31\2\2<;\3\2\2"+
		"\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\4\2\2A\t\3\2\2\2BC\7\16"+
		"\2\2CD\5\32\16\2DF\7\23\2\2EG\5\26\f\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2H"+
		"I\3\2\2\2I\13\3\2\2\2JK\7\31\2\2K\r\3\2\2\2LM\7\30\2\2M\17\3\2\2\2NO\5"+
		"\f\7\2OP\7\17\2\2PS\7\5\2\2QR\7\21\2\2RT\5\16\b\2SQ\3\2\2\2ST\3\2\2\2"+
		"TW\3\2\2\2UV\7\22\2\2VX\5\16\b\2WU\3\2\2\2WX\3\2\2\2Xf\3\2\2\2YZ\5\f\7"+
		"\2Z[\7\17\2\2[\\\7\6\2\2\\]\7\20\2\2]_\7\3\2\2^`\7\31\2\2_^\3\2\2\2`a"+
		"\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\4\2\2df\3\2\2\2eN\3\2\2\2e"+
		"Y\3\2\2\2f\21\3\2\2\2gj\5\16\b\2hj\7\31\2\2ig\3\2\2\2ih\3\2\2\2j\23\3"+
		"\2\2\2kl\t\2\2\2l\25\3\2\2\2mn\5\f\7\2no\5\24\13\2op\5\22\n\2p\27\3\2"+
		"\2\2qw\5\24\13\2rw\7\b\2\2sw\7\t\2\2tw\7\n\2\2uw\7\13\2\2vq\3\2\2\2vr"+
		"\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\31\3\2\2\2xy\b\16\1\2yz\5\f\7"+
		"\2z{\5\30\r\2{|\5\22\n\2|\u0085\3\2\2\2}~\f\4\2\2~\177\7\25\2\2\177\u0084"+
		"\5\32\16\5\u0080\u0081\f\3\2\2\u0081\u0082\7\24\2\2\u0082\u0084\5\32\16"+
		"\4\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\33\3\2\2\2\u0087\u0085\3\2\2\2\20\36"+
		"$,\65>HSWaeiv\u0083\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}