// Generated from StateLabel.g4 by ANTLR 4.7.1
package edu.uiowa.chart.state.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateLabelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Entry=8, During=9, 
		Exit=10, Bind=11, On=12, After=13, Before=14, At=15, Every=16, Identifier=17, 
		IdentifierLetter=18, Number=19, Integer=20, Float=21, Digit=22, LineComment=23, 
		WhiteSpace=24, AnyCharacter=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Entry", "During", 
		"Exit", "Bind", "On", "After", "Before", "At", "Every", "Identifier", 
		"IdentifierLetter", "Number", "Integer", "Float", "Digit", "LineComment", 
		"WhiteSpace", "AnyCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "'/'", "','", "':'", "'('", "')'", null, null, null, 
		"'bind'", "'on'", "'after'", "'before'", "'at'", "'every'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Entry", "During", "Exit", 
		"Bind", "On", "After", "Before", "At", "Every", "Identifier", "IdentifierLetter", 
		"Number", "Integer", "Float", "Digit", "LineComment", "WhiteSpace", "AnyCharacter"
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


	public StateLabelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateLabel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tK\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nU\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u0080\n\22\f\22\16\22\u0083\13\22\3\23\3\23\3\24\3\24\5\24\u0089"+
		"\n\24\3\25\6\25\u008c\n\25\r\25\16\25\u008d\3\26\6\26\u0091\n\26\r\26"+
		"\16\26\u0092\3\26\3\26\7\26\u0097\n\26\f\26\16\26\u009a\13\26\3\26\3\26"+
		"\6\26\u009e\n\26\r\26\16\26\u009f\5\26\u00a2\n\26\3\27\3\27\3\30\3\30"+
		"\7\30\u00a8\n\30\f\30\16\30\u00ab\13\30\3\30\3\30\3\30\3\30\3\31\6\31"+
		"\u00b2\n\31\r\31\16\31\u00b3\3\31\3\31\3\32\3\32\3\u00a9\2\33\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\4\5\2C\\aac|\5\2\13\13\17"+
		"\17\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7"+
		"9\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21J\3\2\2\2\23"+
		"T\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31c\3\2\2\2\33f\3\2\2\2\35l\3\2\2\2"+
		"\37s\3\2\2\2!v\3\2\2\2#|\3\2\2\2%\u0084\3\2\2\2\'\u0088\3\2\2\2)\u008b"+
		"\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00b1\3\2\2\2"+
		"\63\u00b7\3\2\2\2\65\66\7\17\2\2\66\4\3\2\2\2\678\7\f\2\28\6\3\2\2\29"+
		":\7\61\2\2:\b\3\2\2\2;<\7.\2\2<\n\3\2\2\2=>\7<\2\2>\f\3\2\2\2?@\7*\2\2"+
		"@\16\3\2\2\2AB\7+\2\2B\20\3\2\2\2CD\7g\2\2DE\7p\2\2EF\7v\2\2FG\7t\2\2"+
		"GK\7{\2\2HI\7g\2\2IK\7p\2\2JC\3\2\2\2JH\3\2\2\2K\22\3\2\2\2LM\7f\2\2M"+
		"N\7w\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2QU\7i\2\2RS\7f\2\2SU\7w\2\2TL\3\2\2"+
		"\2TR\3\2\2\2U\24\3\2\2\2VW\7g\2\2WX\7z\2\2XY\7k\2\2Y]\7v\2\2Z[\7g\2\2"+
		"[]\7z\2\2\\V\3\2\2\2\\Z\3\2\2\2]\26\3\2\2\2^_\7d\2\2_`\7k\2\2`a\7p\2\2"+
		"ab\7f\2\2b\30\3\2\2\2cd\7q\2\2de\7p\2\2e\32\3\2\2\2fg\7c\2\2gh\7h\2\2"+
		"hi\7v\2\2ij\7g\2\2jk\7t\2\2k\34\3\2\2\2lm\7d\2\2mn\7g\2\2no\7h\2\2op\7"+
		"q\2\2pq\7t\2\2qr\7g\2\2r\36\3\2\2\2st\7c\2\2tu\7v\2\2u \3\2\2\2vw\7g\2"+
		"\2wx\7x\2\2xy\7g\2\2yz\7t\2\2z{\7{\2\2{\"\3\2\2\2|\u0081\5%\23\2}\u0080"+
		"\5%\23\2~\u0080\5-\27\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082$\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084\u0085\t\2\2\2\u0085&\3\2\2\2\u0086\u0089\5)\25\2\u0087\u0089"+
		"\5+\26\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089(\3\2\2\2\u008a"+
		"\u008c\5-\27\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e*\3\2\2\2\u008f\u0091\5-\27\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0098\7\60\2\2\u0095\u0097\5-\27\2\u0096\u0095\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u00a2\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\5"+
		"-\27\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0090\3\2\2\2\u00a1\u009b\3\2"+
		"\2\2\u00a2,\3\2\2\2\u00a3\u00a4\4\62;\2\u00a4.\3\2\2\2\u00a5\u00a9\7\'"+
		"\2\2\u00a6\u00a8\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\30\2\2\u00af"+
		"\60\3\2\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\b\31\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\13\2\2\2\u00b8\64\3\2\2\2\20\2"+
		"JT\\\177\u0081\u0088\u008d\u0092\u0098\u009f\u00a1\u00a9\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}