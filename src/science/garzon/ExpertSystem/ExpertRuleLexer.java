// Generated from D:/文档/我在FDU/ExpertSystem/src\ExpertRule.g4 by ANTLR 4.6
package science.garzon.ExpertSystem;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpertRuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INPUT=10, OUTPUT=11, IF=12, IS=13, OF=14, FROM=15, TO=16, THEN=17, AND=18, 
		OR=19, VAR=20, COMMENT=21, NUMBER=22, STRING=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"INPUT", "OUTPUT", "IF", "IS", "OF", "FROM", "TO", "THEN", "AND", "OR", 
		"VAR", "COMMENT", "NUMBER", "STRING", "WS"
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


	public ExpertRuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpertRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\5\rp\n\r\3\16\3\16"+
		"\3\16\3\16\5\16v\n\16\3\17\3\17\3\17\3\17\5\17|\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\3\21\5\21\u008c"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0096\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u009e\n\23\3\24\3\24\3\24\3\24\5\24\u00a4\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ac\n\25\3\26\3\26\3\26\3\26"+
		"\7\26\u00b2\n\26\f\26\16\26\u00b5\13\26\3\26\3\26\3\27\5\27\u00ba\n\27"+
		"\3\27\6\27\u00bd\n\27\r\27\16\27\u00be\3\27\3\27\7\27\u00c3\n\27\f\27"+
		"\16\27\u00c6\13\27\5\27\u00c8\n\27\3\30\3\30\7\30\u00cc\n\30\f\30\16\30"+
		"\u00cf\13\30\3\30\3\30\3\30\7\30\u00d4\n\30\f\30\16\30\u00d7\13\30\3\30"+
		"\5\30\u00da\n\30\3\31\6\31\u00dd\n\31\r\31\16\31\u00de\3\31\3\31\4\u00cd"+
		"\u00d5\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\4\2\f\f\17"+
		"\17\4\2--//\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\u00f5\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3"+
		"\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t>\3\2\2\2\13E\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25[\3\2\2\2\27i\3\2\2\2\31o\3\2"+
		"\2\2\33u\3\2\2\2\35{\3\2\2\2\37\u0085\3\2\2\2!\u008b\3\2\2\2#\u0095\3"+
		"\2\2\2%\u009d\3\2\2\2\'\u00a3\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00b9"+
		"\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65"+
		"\66\7+\2\2\66\6\3\2\2\2\678\7p\2\289\7w\2\29:\7o\2\2:;\7d\2\2;<\7g\2\2"+
		"<=\7t\2\2=\b\3\2\2\2>?\7u\2\2?@\7v\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7"+
		"i\2\2D\n\3\2\2\2EF\7?\2\2F\f\3\2\2\2GH\7>\2\2H\16\3\2\2\2IJ\7>\2\2JK\7"+
		"?\2\2K\20\3\2\2\2LM\7@\2\2M\22\3\2\2\2NO\7@\2\2OP\7?\2\2P\24\3\2\2\2Q"+
		"R\7K\2\2RS\7P\2\2ST\7R\2\2TU\7W\2\2U\\\7V\2\2VW\7k\2\2WX\7p\2\2XY\7r\2"+
		"\2YZ\7w\2\2Z\\\7v\2\2[Q\3\2\2\2[V\3\2\2\2\\\26\3\2\2\2]^\7Q\2\2^_\7W\2"+
		"\2_`\7V\2\2`a\7R\2\2ab\7W\2\2bj\7V\2\2cd\7q\2\2de\7w\2\2ef\7v\2\2fg\7"+
		"r\2\2gh\7w\2\2hj\7v\2\2i]\3\2\2\2ic\3\2\2\2j\30\3\2\2\2kl\7K\2\2lp\7H"+
		"\2\2mn\7k\2\2np\7h\2\2ok\3\2\2\2om\3\2\2\2p\32\3\2\2\2qr\7K\2\2rv\7U\2"+
		"\2st\7k\2\2tv\7u\2\2uq\3\2\2\2us\3\2\2\2v\34\3\2\2\2wx\7Q\2\2x|\7H\2\2"+
		"yz\7q\2\2z|\7h\2\2{w\3\2\2\2{y\3\2\2\2|\36\3\2\2\2}~\7H\2\2~\177\7T\2"+
		"\2\177\u0080\7Q\2\2\u0080\u0086\7O\2\2\u0081\u0082\7h\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7q\2\2\u0084\u0086\7o\2\2\u0085}\3\2\2\2\u0085\u0081"+
		"\3\2\2\2\u0086 \3\2\2\2\u0087\u0088\7V\2\2\u0088\u008c\7Q\2\2\u0089\u008a"+
		"\7v\2\2\u008a\u008c\7q\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\7V\2\2\u008e\u008f\7J\2\2\u008f\u0090\7G\2\2\u0090"+
		"\u0096\7P\2\2\u0091\u0092\7v\2\2\u0092\u0093\7j\2\2\u0093\u0094\7g\2\2"+
		"\u0094\u0096\7p\2\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096$\3\2"+
		"\2\2\u0097\u0098\7C\2\2\u0098\u0099\7P\2\2\u0099\u009e\7F\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7p\2\2\u009c\u009e\7f\2\2\u009d\u0097\3\2\2\2\u009d"+
		"\u009a\3\2\2\2\u009e&\3\2\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a4\7T\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a4\7t\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4(\3\2\2\2\u00a5\u00a6\7X\2\2\u00a6\u00a7\7C\2\2\u00a7\u00ac\7"+
		"T\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ac\7t\2\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\26\2\2\u00b7,\3\2\2\2"+
		"\u00b8\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c4\t\5"+
		"\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8.\3\2\2\2\u00c9\u00cd"+
		"\7$\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00da\7$\2\2\u00d1\u00d5\7)\2\2\u00d2\u00d4\13\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7)\2\2\u00d9"+
		"\u00c9\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da\60\3\2\2\2\u00db\u00dd\t\6\2"+
		"\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\31\2\2\u00e1\62\3\2\2\2\27"+
		"\2[iou{\u0085\u008b\u0095\u009d\u00a3\u00ab\u00b3\u00b9\u00be\u00c4\u00c7"+
		"\u00cd\u00d5\u00d9\u00de\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}