// Generated from /Users/atieharmin/Desktop/term 6/Compiler/Project/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JepetoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINT=2, FUNC=3, RETURN=4, IF=5, ELSE=6, VOID=7, SIZE=8, TRUE=9, 
		FALSE=10, ARROW=11, GREATER_THAN=12, LESS_THAN=13, NOT_EQUAL=14, EQUAL=15, 
		MULT=16, DIVIDE=17, PLUS=18, MINUS=19, AND=20, OR=21, NOT=22, ASSIGN=23, 
		LPAR=24, RPAR=25, LBRACK=26, RBRACK=27, LBRACE=28, RBRACE=29, COMMA=30, 
		COLON=31, APPEND=32, SEMICOLLON=33, INT_VALUE=34, IDENTIFIER=35, STRING_VALUE=36, 
		COMMENT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "PRINT", "FUNC", "RETURN", "IF", "ELSE", "VOID", "SIZE", "TRUE", 
			"FALSE", "ARROW", "GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", 
			"MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "COLON", "APPEND", 
			"SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'print'", "'func'", "'return'", "'if'", "'else'", "'void'", 
			"'.size'", "'true'", "'false'", "'->'", "'>'", "'<'", "'not'", "'is'", 
			"'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'~'", "'='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "':'", "'::'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINT", "FUNC", "RETURN", "IF", "ELSE", "VOID", "SIZE", 
			"TRUE", "FALSE", "ARROW", "GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", 
			"MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "COLON", "APPEND", 
			"SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
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


	public JepetoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jepeto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\7#\u00be\n#\f#\16#\u00c1\13#\5#\u00c3"+
		"\n#\3$\3$\7$\u00c7\n$\f$\16$\u00ca\13$\3%\3%\7%\u00ce\n%\f%\16%\u00d1"+
		"\13%\3%\3%\3&\3&\7&\u00d7\n&\f&\16&\u00da\13&\3&\3&\3\'\3\'\3\'\3\'\2"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00e5\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\3O\3\2\2\2\5T\3\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2"+
		"\ri\3\2\2\2\17n\3\2\2\2\21s\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0084\3"+
		"\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008f\3\2"+
		"\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u009a"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2"+
		"\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00af"+
		"\3\2\2\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00b5\3\2\2\2C\u00b8\3\2\2\2E"+
		"\u00c2\3\2\2\2G\u00c4\3\2\2\2I\u00cb\3\2\2\2K\u00d4\3\2\2\2M\u00dd\3\2"+
		"\2\2OP\7o\2\2PQ\7c\2\2QR\7k\2\2RS\7p\2\2S\4\3\2\2\2TU\7r\2\2UV\7t\2\2"+
		"VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\6\3\2\2\2Z[\7h\2\2[\\\7w\2\2\\]\7p\2\2]^"+
		"\7e\2\2^\b\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7v\2\2bc\7w\2\2cd\7t\2\2de\7p\2"+
		"\2e\n\3\2\2\2fg\7k\2\2gh\7h\2\2h\f\3\2\2\2ij\7g\2\2jk\7n\2\2kl\7u\2\2"+
		"lm\7g\2\2m\16\3\2\2\2no\7x\2\2op\7q\2\2pq\7k\2\2qr\7f\2\2r\20\3\2\2\2"+
		"st\7\60\2\2tu\7u\2\2uv\7k\2\2vw\7|\2\2wx\7g\2\2x\22\3\2\2\2yz\7v\2\2z"+
		"{\7t\2\2{|\7w\2\2|}\7g\2\2}\24\3\2\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\26\3\2\2\2\u0084"+
		"\u0085\7/\2\2\u0085\u0086\7@\2\2\u0086\30\3\2\2\2\u0087\u0088\7@\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7>\2\2\u008a\34\3\2\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7v\2\2\u008e\36\3\2\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7u\2\2\u0091 \3\2\2\2\u0092\u0093\7,\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\7\61\2\2\u0095$\3\2\2\2\u0096\u0097\7-\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7/\2\2\u0099(\3\2\2\2\u009a\u009b\7c\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7f\2\2\u009d*\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0"+
		",\3\2\2\2\u00a1\u00a2\7\u0080\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"\60\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8"+
		"\64\3\2\2\2\u00a9\u00aa\7]\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac"+
		"8\3\2\2\2\u00ad\u00ae\7}\2\2\u00ae:\3\2\2\2\u00af\u00b0\7\177\2\2\u00b0"+
		"<\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4@"+
		"\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\7<\2\2\u00b7B\3\2\2\2\u00b8\u00b9"+
		"\7=\2\2\u00b9D\3\2\2\2\u00ba\u00c3\7\62\2\2\u00bb\u00bf\t\2\2\2\u00bc"+
		"\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3F\3\2\2\2\u00c4\u00c8\t\4\2\2"+
		"\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9H\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cf\7$\2\2\u00cc\u00ce\n\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3J\3\2\2\2\u00d4\u00d8\7%\2\2\u00d5"+
		"\u00d7\n\7\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\b&\2\2\u00dcL\3\2\2\2\u00dd\u00de\t\b\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\b\'\2\2\u00e0N\3\2\2\2\b\2\u00bf\u00c2\u00c8\u00cf\u00d8\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}