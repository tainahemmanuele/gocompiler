package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=24;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_INT=23;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=36;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_EXPOENT=30;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=6;
    public static final int RULE_NEWLINE=16;
    public static final int RULE_BIG_U_VALUE=32;
    public static final int RULE_ESCAPED_CHAR=33;
    public static final int RULE_BYTE_VALUE=9;
    public static final int RULE_UNICODE_LETTER=18;
    public static final int RULE_UNICODE_CHAR=17;
    public static final int RULE_OCTAL_DIGIT=25;
    public static final int RULE_LETTER=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=10;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=13;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=26;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_DECIMAL_LIT=27;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_BINARY_OP=12;
    public static final int RULE_INTERPRETED_STRING_LIT=11;
    public static final int RULE_UNICODE_VALUE=8;
    public static final int RULE_LITTLE_U_VALUE=31;
    public static final int RULE_HEX_BYTE_VALUE=35;
    public static final int RULE_OCTAL_BYTE_VALUE=34;
    public static final int RULE_MUL_OP=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=37;
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=29;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=20;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_UNICODE_DIGIT=5;
    public static final int T__83=83;
    public static final int RULE_WS=38;
    public static final int RULE_ANY_OTHER=39;
    public static final int RULE_OCTAL_LIT=28;
    public static final int RULE_FLOAT_LIT=7;
    public static final int RULE_INT_LIT=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REL_OP=19;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( 'func' )
            // InternalGo.g:11:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( 'package' )
            // InternalGo.g:12:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '+' )
            // InternalGo.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( '-' )
            // InternalGo.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( '|' )
            // InternalGo.g:15:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( '^' )
            // InternalGo.g:16:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:17:7: ( '*' )
            // InternalGo.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:18:7: ( '/' )
            // InternalGo.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:19:7: ( '%' )
            // InternalGo.g:19:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:20:7: ( '<<' )
            // InternalGo.g:20:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21:7: ( '>>' )
            // InternalGo.g:21:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:22:7: ( '&' )
            // InternalGo.g:22:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( '&^' )
            // InternalGo.g:23:9: '&^'
            {
            match("&^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:24:7: ( '=' )
            // InternalGo.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( '\\u00EF' )
            // InternalGo.g:25:9: '\\u00EF'
            {
            match('\u00EF'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:26:7: ( '\\'' )
            // InternalGo.g:26:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:27:7: ( '(' )
            // InternalGo.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:28:7: ( ')' )
            // InternalGo.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( '.' )
            // InternalGo.g:29:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( '[' )
            // InternalGo.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( ']' )
            // InternalGo.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( 'struct' )
            // InternalGo.g:32:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( '{' )
            // InternalGo.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( ';' )
            // InternalGo.g:34:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( '}' )
            // InternalGo.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( ',' )
            // InternalGo.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( '...' )
            // InternalGo.g:37:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( 'interface' )
            // InternalGo.g:38:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'map' )
            // InternalGo.g:39:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'chan' )
            // InternalGo.g:40:9: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( '<-' )
            // InternalGo.g:41:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( ':' )
            // InternalGo.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( 'goto' )
            // InternalGo.g:43:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( 'return' )
            // InternalGo.g:44:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:45:7: ( 'break' )
            // InternalGo.g:45:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:46:7: ( 'continue' )
            // InternalGo.g:46:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:47:7: ( 'if' )
            // InternalGo.g:47:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:48:7: ( 'else' )
            // InternalGo.g:48:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:49:7: ( 'fallthrough' )
            // InternalGo.g:49:9: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:50:7: ( 'select' )
            // InternalGo.g:50:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:51:7: ( 'for' )
            // InternalGo.g:51:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:52:7: ( 'defer' )
            // InternalGo.g:52:9: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:53:7: ( 'const' )
            // InternalGo.g:53:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:54:7: ( 'type' )
            // InternalGo.g:54:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:55:7: ( 'var' )
            // InternalGo.g:55:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:56:7: ( '++' )
            // InternalGo.g:56:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:57:7: ( '--' )
            // InternalGo.g:57:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:58:7: ( ':=' )
            // InternalGo.g:58:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:59:7: ( 'switch' )
            // InternalGo.g:59:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:60:7: ( 'case' )
            // InternalGo.g:60:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:61:7: ( 'default' )
            // InternalGo.g:61:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:62:7: ( 'range' )
            // InternalGo.g:62:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:63:7: ( 'import' )
            // InternalGo.g:63:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:8245:23: ( '\\n' )
            // InternalGo.g:8245:25: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            // InternalGo.g:8247:28: ( '\\n' )
            // InternalGo.g:8247:30: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_UNICODE_LETTER"
    public final void mRULE_UNICODE_LETTER() throws RecognitionException {
        try {
            // InternalGo.g:8249:30: ( ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' ) )
            // InternalGo.g:8249:32: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
            {
            // InternalGo.g:8249:32: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
            int alt1=261;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt1=1;
                }
                break;
            case 'a':
                {
                alt1=2;
                }
                break;
            case '\u00AA':
                {
                alt1=3;
                }
                break;
            case '\u00B5':
                {
                alt1=4;
                }
                break;
            case '\u00BA':
                {
                alt1=5;
                }
                break;
            case '\u00C0':
                {
                alt1=6;
                }
                break;
            case '\u00D8':
                {
                alt1=7;
                }
                break;
            case '\u00F8':
                {
                alt1=8;
                }
                break;
            case '\u0222':
                {
                alt1=9;
                }
                break;
            case '\u0250':
                {
                alt1=10;
                }
                break;
            case '\u02B0':
                {
                alt1=11;
                }
                break;
            case '\u02BB':
                {
                alt1=12;
                }
                break;
            case '\u02D0':
                {
                alt1=13;
                }
                break;
            case '\u02E0':
                {
                alt1=14;
                }
                break;
            case '\u02EE':
                {
                alt1=15;
                }
                break;
            case '\u037A':
                {
                alt1=16;
                }
                break;
            case '\u0386':
                {
                alt1=17;
                }
                break;
            case '\u0388':
                {
                alt1=18;
                }
                break;
            case '\u038C':
                {
                alt1=19;
                }
                break;
            case '\u038E':
                {
                alt1=20;
                }
                break;
            case '\u03A3':
                {
                alt1=21;
                }
                break;
            case '\u03D0':
                {
                alt1=22;
                }
                break;
            case '\u03DA':
                {
                alt1=23;
                }
                break;
            case '\u0400':
                {
                alt1=24;
                }
                break;
            case '\u048C':
                {
                alt1=25;
                }
                break;
            case '\u04C7':
                {
                alt1=26;
                }
                break;
            case '\u04CB':
                {
                alt1=27;
                }
                break;
            case '\u04D0':
                {
                alt1=28;
                }
                break;
            case '\u04F8':
                {
                alt1=29;
                }
                break;
            case '\u0531':
                {
                alt1=30;
                }
                break;
            case '\u0559':
                {
                alt1=31;
                }
                break;
            case '\u0561':
                {
                alt1=32;
                }
                break;
            case '\u05D0':
                {
                alt1=33;
                }
                break;
            case '\u05F0':
                {
                alt1=34;
                }
                break;
            case '\u0621':
                {
                alt1=35;
                }
                break;
            case '\u0640':
                {
                alt1=36;
                }
                break;
            case '\u0671':
                {
                alt1=37;
                }
                break;
            case '\u06D5':
                {
                alt1=38;
                }
                break;
            case '\u06E5':
                {
                alt1=39;
                }
                break;
            case '\u06FA':
                {
                alt1=40;
                }
                break;
            case '\u0710':
                {
                alt1=41;
                }
                break;
            case '\u0712':
                {
                alt1=42;
                }
                break;
            case '\u0780':
                {
                alt1=43;
                }
                break;
            case '\u0905':
                {
                alt1=44;
                }
                break;
            case '\u093D':
                {
                alt1=45;
                }
                break;
            case '\u0950':
                {
                alt1=46;
                }
                break;
            case '\u0958':
                {
                alt1=47;
                }
                break;
            case '\u0985':
                {
                alt1=48;
                }
                break;
            case '\u098F':
                {
                alt1=49;
                }
                break;
            case '\u0993':
                {
                alt1=50;
                }
                break;
            case '\u09AA':
                {
                alt1=51;
                }
                break;
            case '\u09B2':
                {
                alt1=52;
                }
                break;
            case '\u09B6':
                {
                alt1=53;
                }
                break;
            case '\u09DC':
                {
                alt1=54;
                }
                break;
            case '\u09DF':
                {
                alt1=55;
                }
                break;
            case '\u09F0':
                {
                alt1=56;
                }
                break;
            case '\u0A05':
                {
                alt1=57;
                }
                break;
            case '\u0A0F':
                {
                alt1=58;
                }
                break;
            case '\u0A13':
                {
                alt1=59;
                }
                break;
            case '\u0A2A':
                {
                alt1=60;
                }
                break;
            case '\u0A32':
                {
                alt1=61;
                }
                break;
            case '\u0A35':
                {
                alt1=62;
                }
                break;
            case '\u0A38':
                {
                alt1=63;
                }
                break;
            case '\u0A59':
                {
                alt1=64;
                }
                break;
            case '\u0A5E':
                {
                alt1=65;
                }
                break;
            case '\u0A72':
                {
                alt1=66;
                }
                break;
            case '\u0A85':
                {
                alt1=67;
                }
                break;
            case '\u0A8D':
                {
                alt1=68;
                }
                break;
            case '\u0A8F':
                {
                alt1=69;
                }
                break;
            case '\u0A93':
                {
                alt1=70;
                }
                break;
            case '\u0AAA':
                {
                alt1=71;
                }
                break;
            case '\u0AB2':
                {
                alt1=72;
                }
                break;
            case '\u0AB5':
                {
                alt1=73;
                }
                break;
            case '\u0ABD':
                {
                alt1=74;
                }
                break;
            case '\u0AD0':
                {
                alt1=75;
                }
                break;
            case '\u0AE0':
                {
                alt1=76;
                }
                break;
            case '\u0B05':
                {
                alt1=77;
                }
                break;
            case '\u0B0F':
                {
                alt1=78;
                }
                break;
            case '\u0B13':
                {
                alt1=79;
                }
                break;
            case '\u0B2A':
                {
                alt1=80;
                }
                break;
            case '\u0B32':
                {
                alt1=81;
                }
                break;
            case '\u0B36':
                {
                alt1=82;
                }
                break;
            case '\u0B3D':
                {
                alt1=83;
                }
                break;
            case '\u0B5C':
                {
                alt1=84;
                }
                break;
            case '\u0B5F':
                {
                alt1=85;
                }
                break;
            case '\u0B85':
                {
                alt1=86;
                }
                break;
            case '\u0B8E':
                {
                alt1=87;
                }
                break;
            case '\u0B92':
                {
                alt1=88;
                }
                break;
            case '\u0B99':
                {
                alt1=89;
                }
                break;
            case '\u0B9C':
                {
                alt1=90;
                }
                break;
            case '\u0B9E':
                {
                alt1=91;
                }
                break;
            case '\u0BA3':
                {
                alt1=92;
                }
                break;
            case '\u0BA8':
                {
                alt1=93;
                }
                break;
            case '\u0BAE':
                {
                alt1=94;
                }
                break;
            case '\u0BB7':
                {
                alt1=95;
                }
                break;
            case '\u0C05':
                {
                alt1=96;
                }
                break;
            case '\u0C0E':
                {
                alt1=97;
                }
                break;
            case '\u0C12':
                {
                alt1=98;
                }
                break;
            case '\u0C2A':
                {
                alt1=99;
                }
                break;
            case '\u0C35':
                {
                alt1=100;
                }
                break;
            case '\u0C60':
                {
                alt1=101;
                }
                break;
            case '\u0C85':
                {
                alt1=102;
                }
                break;
            case '\u0C8E':
                {
                alt1=103;
                }
                break;
            case '\u0C92':
                {
                alt1=104;
                }
                break;
            case '\u0CAA':
                {
                alt1=105;
                }
                break;
            case '\u0CB5':
                {
                alt1=106;
                }
                break;
            case '\u0CDE':
                {
                alt1=107;
                }
                break;
            case '\u0CE0':
                {
                alt1=108;
                }
                break;
            case '\u0D05':
                {
                alt1=109;
                }
                break;
            case '\u0D0E':
                {
                alt1=110;
                }
                break;
            case '\u0D12':
                {
                alt1=111;
                }
                break;
            case '\u0D2A':
                {
                alt1=112;
                }
                break;
            case '\u0D60':
                {
                alt1=113;
                }
                break;
            case '\u0D85':
                {
                alt1=114;
                }
                break;
            case '\u0D9A':
                {
                alt1=115;
                }
                break;
            case '\u0DB3':
                {
                alt1=116;
                }
                break;
            case '\u0DBD':
                {
                alt1=117;
                }
                break;
            case '\u0DC0':
                {
                alt1=118;
                }
                break;
            case '\u0E01':
                {
                alt1=119;
                }
                break;
            case '\u0E32':
                {
                alt1=120;
                }
                break;
            case '\u0E40':
                {
                alt1=121;
                }
                break;
            case '\u0E81':
                {
                alt1=122;
                }
                break;
            case '\u0E84':
                {
                alt1=123;
                }
                break;
            case '\u0E87':
                {
                alt1=124;
                }
                break;
            case '\u0E8A':
                {
                alt1=125;
                }
                break;
            case '\u0E8D':
                {
                alt1=126;
                }
                break;
            case '\u0E94':
                {
                alt1=127;
                }
                break;
            case '\u0E99':
                {
                alt1=128;
                }
                break;
            case '\u0EA1':
                {
                alt1=129;
                }
                break;
            case '\u0EA5':
                {
                alt1=130;
                }
                break;
            case '\u0EA7':
                {
                alt1=131;
                }
                break;
            case '\u0EAA':
                {
                alt1=132;
                }
                break;
            case '\u0EAD':
                {
                alt1=133;
                }
                break;
            case '\u0EB2':
                {
                alt1=134;
                }
                break;
            case '\u0EBD':
                {
                alt1=135;
                }
                break;
            case '\u0EC6':
                {
                alt1=136;
                }
                break;
            case '\u0EDC':
                {
                alt1=137;
                }
                break;
            case '\u0F00':
                {
                alt1=138;
                }
                break;
            case '\u0F40':
                {
                alt1=139;
                }
                break;
            case '\u0F88':
                {
                alt1=140;
                }
                break;
            case '\u1000':
                {
                alt1=141;
                }
                break;
            case '\u1023':
                {
                alt1=142;
                }
                break;
            case '\u1029':
                {
                alt1=143;
                }
                break;
            case '\u1050':
                {
                alt1=144;
                }
                break;
            case '\u10A0':
                {
                alt1=145;
                }
                break;
            case '\u10D0':
                {
                alt1=146;
                }
                break;
            case '\u1100':
                {
                alt1=147;
                }
                break;
            case '\u115F':
                {
                alt1=148;
                }
                break;
            case '\u11A8':
                {
                alt1=149;
                }
                break;
            case '\u1200':
                {
                alt1=150;
                }
                break;
            case '\u1208':
                {
                alt1=151;
                }
                break;
            case '\u1248':
                {
                alt1=152;
                }
                break;
            case '\u124A':
                {
                alt1=153;
                }
                break;
            case '\u1250':
                {
                alt1=154;
                }
                break;
            case '\u1258':
                {
                alt1=155;
                }
                break;
            case '\u125A':
                {
                alt1=156;
                }
                break;
            case '\u1260':
                {
                alt1=157;
                }
                break;
            case '\u1288':
                {
                alt1=158;
                }
                break;
            case '\u128A':
                {
                alt1=159;
                }
                break;
            case '\u1290':
                {
                alt1=160;
                }
                break;
            case '\u12B0':
                {
                alt1=161;
                }
                break;
            case '\u12B2':
                {
                alt1=162;
                }
                break;
            case '\u12B8':
                {
                alt1=163;
                }
                break;
            case '\u12C0':
                {
                alt1=164;
                }
                break;
            case '\u12C2':
                {
                alt1=165;
                }
                break;
            case '\u12C8':
                {
                alt1=166;
                }
                break;
            case '\u12D0':
                {
                alt1=167;
                }
                break;
            case '\u12D8':
                {
                alt1=168;
                }
                break;
            case '\u12F0':
                {
                alt1=169;
                }
                break;
            case '\u1310':
                {
                alt1=170;
                }
                break;
            case '\u1312':
                {
                alt1=171;
                }
                break;
            case '\u1318':
                {
                alt1=172;
                }
                break;
            case '\u1320':
                {
                alt1=173;
                }
                break;
            case '\u1348':
                {
                alt1=174;
                }
                break;
            case '\u13A0':
                {
                alt1=175;
                }
                break;
            case '\u13B1':
                {
                alt1=176;
                }
                break;
            case '\u1401':
                {
                alt1=177;
                }
                break;
            case '\u1681':
                {
                alt1=178;
                }
                break;
            case '\u16A0':
                {
                alt1=179;
                }
                break;
            case '\u1780':
                {
                alt1=180;
                }
                break;
            case '\u1820':
                {
                alt1=181;
                }
                break;
            case '\u1880':
                {
                alt1=182;
                }
                break;
            case '\u1E00':
                {
                alt1=183;
                }
                break;
            case '\u1EA0':
                {
                alt1=184;
                }
                break;
            case '\u1EE1':
                {
                alt1=185;
                }
                break;
            case '\u1F00':
                {
                alt1=186;
                }
                break;
            case '\u1F18':
                {
                alt1=187;
                }
                break;
            case '\u1F20':
                {
                alt1=188;
                }
                break;
            case '\u1F3A':
                {
                alt1=189;
                }
                break;
            case '\u1F48':
                {
                alt1=190;
                }
                break;
            case '\u1F50':
                {
                alt1=191;
                }
                break;
            case '\u1F59':
                {
                alt1=192;
                }
                break;
            case '\u1F5B':
                {
                alt1=193;
                }
                break;
            case '\u1F5D':
                {
                alt1=194;
                }
                break;
            case '\u1F5F':
                {
                alt1=195;
                }
                break;
            case '\u1F80':
                {
                alt1=196;
                }
                break;
            case '\u1FB6':
                {
                alt1=197;
                }
                break;
            case '\u1FBE':
                {
                alt1=198;
                }
                break;
            case '\u1FC2':
                {
                alt1=199;
                }
                break;
            case '\u1FC6':
                {
                alt1=200;
                }
                break;
            case '\u1FD0':
                {
                alt1=201;
                }
                break;
            case '\u1FD6':
                {
                alt1=202;
                }
                break;
            case '\u1FE0':
                {
                alt1=203;
                }
                break;
            case '\u1FF2':
                {
                alt1=204;
                }
                break;
            case '\u1FF6':
                {
                alt1=205;
                }
                break;
            case '\u207F':
                {
                alt1=206;
                }
                break;
            case '\u2102':
                {
                alt1=207;
                }
                break;
            case '\u2107':
                {
                alt1=208;
                }
                break;
            case '\u210A':
                {
                alt1=209;
                }
                break;
            case '\u2115':
                {
                alt1=210;
                }
                break;
            case '\u2119':
                {
                alt1=211;
                }
                break;
            case '\u2124':
                {
                alt1=212;
                }
                break;
            case '\u2126':
                {
                alt1=213;
                }
                break;
            case '\u2128':
                {
                alt1=214;
                }
                break;
            case '\u212A':
                {
                alt1=215;
                }
                break;
            case '\u212F':
                {
                alt1=216;
                }
                break;
            case '\u2133':
                {
                alt1=217;
                }
                break;
            case '\u2160':
                {
                alt1=218;
                }
                break;
            case '\u3005':
                {
                alt1=219;
                }
                break;
            case '\u3021':
                {
                alt1=220;
                }
                break;
            case '\u3031':
                {
                alt1=221;
                }
                break;
            case '\u3038':
                {
                alt1=222;
                }
                break;
            case '\u3041':
                {
                alt1=223;
                }
                break;
            case '\u309D':
                {
                alt1=224;
                }
                break;
            case '\u30A1':
                {
                alt1=225;
                }
                break;
            case '\u30FC':
                {
                alt1=226;
                }
                break;
            case '\u3105':
                {
                alt1=227;
                }
                break;
            case '\u3131':
                {
                alt1=228;
                }
                break;
            case '\u31A0':
                {
                alt1=229;
                }
                break;
            case '\u3400':
                {
                alt1=230;
                }
                break;
            case '\u4DB5':
                {
                alt1=231;
                }
                break;
            case '\u4E00':
                {
                alt1=232;
                }
                break;
            case '\u9FA5':
                {
                alt1=233;
                }
                break;
            case '\uA000':
                {
                alt1=234;
                }
                break;
            case '\uAC00':
                {
                alt1=235;
                }
                break;
            case '\uD7A3':
                {
                alt1=236;
                }
                break;
            case '\uF900':
                {
                alt1=237;
                }
                break;
            case '\uFB00':
                {
                alt1=238;
                }
                break;
            case '\uFB13':
                {
                alt1=239;
                }
                break;
            case '\uFB1D':
                {
                alt1=240;
                }
                break;
            case '\uFB1F':
                {
                alt1=241;
                }
                break;
            case '\uFB2A':
                {
                alt1=242;
                }
                break;
            case '\uFB38':
                {
                alt1=243;
                }
                break;
            case '\uFB3E':
                {
                alt1=244;
                }
                break;
            case '\uFB40':
                {
                alt1=245;
                }
                break;
            case '\uFB43':
                {
                alt1=246;
                }
                break;
            case '\uFB46':
                {
                alt1=247;
                }
                break;
            case '\uFBD3':
                {
                alt1=248;
                }
                break;
            case '\uFD50':
                {
                alt1=249;
                }
                break;
            case '\uFD92':
                {
                alt1=250;
                }
                break;
            case '\uFDF0':
                {
                alt1=251;
                }
                break;
            case '\uFE70':
                {
                alt1=252;
                }
                break;
            case '\uFE74':
                {
                alt1=253;
                }
                break;
            case '\uFE76':
                {
                alt1=254;
                }
                break;
            case '\uFF21':
                {
                alt1=255;
                }
                break;
            case '\uFF41':
                {
                alt1=256;
                }
                break;
            case '\uFF66':
                {
                alt1=257;
                }
                break;
            case '\uFFC2':
                {
                alt1=258;
                }
                break;
            case '\uFFCA':
                {
                alt1=259;
                }
                break;
            case '\uFFD2':
                {
                alt1=260;
                }
                break;
            case '\uFFDA':
                {
                alt1=261;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGo.g:8249:33: 'A-Z'
                    {
                    match("A-Z"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8249:39: 'a-z'
                    {
                    match("a-z"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8249:45: '\\u00AA'
                    {
                    match('\u00AA'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8249:54: '\\u00B5'
                    {
                    match('\u00B5'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8249:63: '\\u00BA'
                    {
                    match('\u00BA'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8249:72: '\\u00C0-\\u00D6'
                    {
                    match("\u00C0-\u00D6"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:8249:88: '\\u00D8-\\u00F6'
                    {
                    match("\u00D8-\u00F6"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:8249:104: '\\u00F8-\\u021F'
                    {
                    match("\u00F8-\u021F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:8249:120: '\\u0222-\\u0233'
                    {
                    match("\u0222-\u0233"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:8249:136: '\\u0250-\\u02AD'
                    {
                    match("\u0250-\u02AD"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:8249:152: '\\u02B0-\\u02B8'
                    {
                    match("\u02B0-\u02B8"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:8249:168: '\\u02BB-\\u02C1'
                    {
                    match("\u02BB-\u02C1"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:8249:184: '\\u02D0-\\u02D1'
                    {
                    match("\u02D0-\u02D1"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:8249:200: '\\u02E0-\\u02E4'
                    {
                    match("\u02E0-\u02E4"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:8249:216: '\\u02EE'
                    {
                    match('\u02EE'); 

                    }
                    break;
                case 16 :
                    // InternalGo.g:8249:225: '\\u037A'
                    {
                    match('\u037A'); 

                    }
                    break;
                case 17 :
                    // InternalGo.g:8249:234: '\\u0386'
                    {
                    match('\u0386'); 

                    }
                    break;
                case 18 :
                    // InternalGo.g:8249:243: '\\u0388-\\u038A'
                    {
                    match("\u0388-\u038A"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:8249:259: '\\u038C'
                    {
                    match('\u038C'); 

                    }
                    break;
                case 20 :
                    // InternalGo.g:8249:268: '\\u038E-\\u03A1'
                    {
                    match("\u038E-\u03A1"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:8249:284: '\\u03A3-\\u03CE'
                    {
                    match("\u03A3-\u03CE"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:8249:300: '\\u03D0-\\u03D7'
                    {
                    match("\u03D0-\u03D7"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:8249:316: '\\u03DA-\\u03F3'
                    {
                    match("\u03DA-\u03F3"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:8249:332: '\\u0400-\\u0481'
                    {
                    match("\u0400-\u0481"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:8249:348: '\\u048C-\\u04C4'
                    {
                    match("\u048C-\u04C4"); 


                    }
                    break;
                case 26 :
                    // InternalGo.g:8249:364: '\\u04C7-\\u04C8'
                    {
                    match("\u04C7-\u04C8"); 


                    }
                    break;
                case 27 :
                    // InternalGo.g:8249:380: '\\u04CB-\\u04CC'
                    {
                    match("\u04CB-\u04CC"); 


                    }
                    break;
                case 28 :
                    // InternalGo.g:8249:396: '\\u04D0-\\u04F5'
                    {
                    match("\u04D0-\u04F5"); 


                    }
                    break;
                case 29 :
                    // InternalGo.g:8249:412: '\\u04F8-\\u04F9'
                    {
                    match("\u04F8-\u04F9"); 


                    }
                    break;
                case 30 :
                    // InternalGo.g:8249:428: '\\u0531-\\u0556'
                    {
                    match("\u0531-\u0556"); 


                    }
                    break;
                case 31 :
                    // InternalGo.g:8249:444: '\\u0559'
                    {
                    match('\u0559'); 

                    }
                    break;
                case 32 :
                    // InternalGo.g:8249:453: '\\u0561-\\u0587'
                    {
                    match("\u0561-\u0587"); 


                    }
                    break;
                case 33 :
                    // InternalGo.g:8249:469: '\\u05D0-\\u05EA'
                    {
                    match("\u05D0-\u05EA"); 


                    }
                    break;
                case 34 :
                    // InternalGo.g:8249:485: '\\u05F0-\\u05F2'
                    {
                    match("\u05F0-\u05F2"); 


                    }
                    break;
                case 35 :
                    // InternalGo.g:8249:501: '\\u0621-\\u063A'
                    {
                    match("\u0621-\u063A"); 


                    }
                    break;
                case 36 :
                    // InternalGo.g:8249:517: '\\u0640-\\u064A'
                    {
                    match("\u0640-\u064A"); 


                    }
                    break;
                case 37 :
                    // InternalGo.g:8249:533: '\\u0671-\\u06D3'
                    {
                    match("\u0671-\u06D3"); 


                    }
                    break;
                case 38 :
                    // InternalGo.g:8249:549: '\\u06D5'
                    {
                    match('\u06D5'); 

                    }
                    break;
                case 39 :
                    // InternalGo.g:8249:558: '\\u06E5-\\u06E6'
                    {
                    match("\u06E5-\u06E6"); 


                    }
                    break;
                case 40 :
                    // InternalGo.g:8249:574: '\\u06FA-\\u06FC'
                    {
                    match("\u06FA-\u06FC"); 


                    }
                    break;
                case 41 :
                    // InternalGo.g:8249:590: '\\u0710'
                    {
                    match('\u0710'); 

                    }
                    break;
                case 42 :
                    // InternalGo.g:8249:599: '\\u0712-\\u072C'
                    {
                    match("\u0712-\u072C"); 


                    }
                    break;
                case 43 :
                    // InternalGo.g:8249:615: '\\u0780-\\u07A5'
                    {
                    match("\u0780-\u07A5"); 


                    }
                    break;
                case 44 :
                    // InternalGo.g:8249:631: '\\u0905-\\u0939'
                    {
                    match("\u0905-\u0939"); 


                    }
                    break;
                case 45 :
                    // InternalGo.g:8249:647: '\\u093D'
                    {
                    match('\u093D'); 

                    }
                    break;
                case 46 :
                    // InternalGo.g:8249:656: '\\u0950'
                    {
                    match('\u0950'); 

                    }
                    break;
                case 47 :
                    // InternalGo.g:8249:665: '\\u0958-\\u0961'
                    {
                    match("\u0958-\u0961"); 


                    }
                    break;
                case 48 :
                    // InternalGo.g:8249:681: '\\u0985-\\u098C'
                    {
                    match("\u0985-\u098C"); 


                    }
                    break;
                case 49 :
                    // InternalGo.g:8249:697: '\\u098F-\\u0990'
                    {
                    match("\u098F-\u0990"); 


                    }
                    break;
                case 50 :
                    // InternalGo.g:8249:713: '\\u0993-\\u09A8'
                    {
                    match("\u0993-\u09A8"); 


                    }
                    break;
                case 51 :
                    // InternalGo.g:8249:729: '\\u09AA-\\u09B0'
                    {
                    match("\u09AA-\u09B0"); 


                    }
                    break;
                case 52 :
                    // InternalGo.g:8249:745: '\\u09B2'
                    {
                    match('\u09B2'); 

                    }
                    break;
                case 53 :
                    // InternalGo.g:8249:754: '\\u09B6-\\u09B9'
                    {
                    match("\u09B6-\u09B9"); 


                    }
                    break;
                case 54 :
                    // InternalGo.g:8249:770: '\\u09DC-\\u09DD'
                    {
                    match("\u09DC-\u09DD"); 


                    }
                    break;
                case 55 :
                    // InternalGo.g:8249:786: '\\u09DF-\\u09E1'
                    {
                    match("\u09DF-\u09E1"); 


                    }
                    break;
                case 56 :
                    // InternalGo.g:8249:802: '\\u09F0-\\u09F1'
                    {
                    match("\u09F0-\u09F1"); 


                    }
                    break;
                case 57 :
                    // InternalGo.g:8249:818: '\\u0A05-\\u0A0A'
                    {
                    match("\u0A05-\u0A0A"); 


                    }
                    break;
                case 58 :
                    // InternalGo.g:8249:834: '\\u0A0F-\\u0A10'
                    {
                    match("\u0A0F-\u0A10"); 


                    }
                    break;
                case 59 :
                    // InternalGo.g:8249:850: '\\u0A13-\\u0A28'
                    {
                    match("\u0A13-\u0A28"); 


                    }
                    break;
                case 60 :
                    // InternalGo.g:8249:866: '\\u0A2A-\\u0A30'
                    {
                    match("\u0A2A-\u0A30"); 


                    }
                    break;
                case 61 :
                    // InternalGo.g:8249:882: '\\u0A32-\\u0A33'
                    {
                    match("\u0A32-\u0A33"); 


                    }
                    break;
                case 62 :
                    // InternalGo.g:8249:898: '\\u0A35-\\u0A36'
                    {
                    match("\u0A35-\u0A36"); 


                    }
                    break;
                case 63 :
                    // InternalGo.g:8249:914: '\\u0A38-\\u0A39'
                    {
                    match("\u0A38-\u0A39"); 


                    }
                    break;
                case 64 :
                    // InternalGo.g:8249:930: '\\u0A59-\\u0A5C'
                    {
                    match("\u0A59-\u0A5C"); 


                    }
                    break;
                case 65 :
                    // InternalGo.g:8249:946: '\\u0A5E'
                    {
                    match('\u0A5E'); 

                    }
                    break;
                case 66 :
                    // InternalGo.g:8249:955: '\\u0A72-\\u0A74'
                    {
                    match("\u0A72-\u0A74"); 


                    }
                    break;
                case 67 :
                    // InternalGo.g:8249:971: '\\u0A85-\\u0A8B'
                    {
                    match("\u0A85-\u0A8B"); 


                    }
                    break;
                case 68 :
                    // InternalGo.g:8249:987: '\\u0A8D'
                    {
                    match('\u0A8D'); 

                    }
                    break;
                case 69 :
                    // InternalGo.g:8249:996: '\\u0A8F-\\u0A91'
                    {
                    match("\u0A8F-\u0A91"); 


                    }
                    break;
                case 70 :
                    // InternalGo.g:8249:1012: '\\u0A93-\\u0AA8'
                    {
                    match("\u0A93-\u0AA8"); 


                    }
                    break;
                case 71 :
                    // InternalGo.g:8249:1028: '\\u0AAA-\\u0AB0'
                    {
                    match("\u0AAA-\u0AB0"); 


                    }
                    break;
                case 72 :
                    // InternalGo.g:8249:1044: '\\u0AB2-\\u0AB3'
                    {
                    match("\u0AB2-\u0AB3"); 


                    }
                    break;
                case 73 :
                    // InternalGo.g:8249:1060: '\\u0AB5-\\u0AB9'
                    {
                    match("\u0AB5-\u0AB9"); 


                    }
                    break;
                case 74 :
                    // InternalGo.g:8249:1076: '\\u0ABD'
                    {
                    match('\u0ABD'); 

                    }
                    break;
                case 75 :
                    // InternalGo.g:8249:1085: '\\u0AD0'
                    {
                    match('\u0AD0'); 

                    }
                    break;
                case 76 :
                    // InternalGo.g:8249:1094: '\\u0AE0'
                    {
                    match('\u0AE0'); 

                    }
                    break;
                case 77 :
                    // InternalGo.g:8249:1103: '\\u0B05-\\u0B0C'
                    {
                    match("\u0B05-\u0B0C"); 


                    }
                    break;
                case 78 :
                    // InternalGo.g:8249:1119: '\\u0B0F-\\u0B10'
                    {
                    match("\u0B0F-\u0B10"); 


                    }
                    break;
                case 79 :
                    // InternalGo.g:8249:1135: '\\u0B13-\\u0B28'
                    {
                    match("\u0B13-\u0B28"); 


                    }
                    break;
                case 80 :
                    // InternalGo.g:8249:1151: '\\u0B2A-\\u0B30'
                    {
                    match("\u0B2A-\u0B30"); 


                    }
                    break;
                case 81 :
                    // InternalGo.g:8249:1167: '\\u0B32-\\u0B33'
                    {
                    match("\u0B32-\u0B33"); 


                    }
                    break;
                case 82 :
                    // InternalGo.g:8249:1183: '\\u0B36-\\u0B39'
                    {
                    match("\u0B36-\u0B39"); 


                    }
                    break;
                case 83 :
                    // InternalGo.g:8249:1199: '\\u0B3D'
                    {
                    match('\u0B3D'); 

                    }
                    break;
                case 84 :
                    // InternalGo.g:8249:1208: '\\u0B5C-\\u0B5D'
                    {
                    match("\u0B5C-\u0B5D"); 


                    }
                    break;
                case 85 :
                    // InternalGo.g:8249:1224: '\\u0B5F-\\u0B61'
                    {
                    match("\u0B5F-\u0B61"); 


                    }
                    break;
                case 86 :
                    // InternalGo.g:8249:1240: '\\u0B85-\\u0B8A'
                    {
                    match("\u0B85-\u0B8A"); 


                    }
                    break;
                case 87 :
                    // InternalGo.g:8249:1256: '\\u0B8E-\\u0B90'
                    {
                    match("\u0B8E-\u0B90"); 


                    }
                    break;
                case 88 :
                    // InternalGo.g:8249:1272: '\\u0B92-\\u0B95'
                    {
                    match("\u0B92-\u0B95"); 


                    }
                    break;
                case 89 :
                    // InternalGo.g:8249:1288: '\\u0B99-\\u0B9A'
                    {
                    match("\u0B99-\u0B9A"); 


                    }
                    break;
                case 90 :
                    // InternalGo.g:8249:1304: '\\u0B9C'
                    {
                    match('\u0B9C'); 

                    }
                    break;
                case 91 :
                    // InternalGo.g:8249:1313: '\\u0B9E-\\u0B9F'
                    {
                    match("\u0B9E-\u0B9F"); 


                    }
                    break;
                case 92 :
                    // InternalGo.g:8249:1329: '\\u0BA3-\\u0BA4'
                    {
                    match("\u0BA3-\u0BA4"); 


                    }
                    break;
                case 93 :
                    // InternalGo.g:8249:1345: '\\u0BA8-\\u0BAA'
                    {
                    match("\u0BA8-\u0BAA"); 


                    }
                    break;
                case 94 :
                    // InternalGo.g:8249:1361: '\\u0BAE-\\u0BB5'
                    {
                    match("\u0BAE-\u0BB5"); 


                    }
                    break;
                case 95 :
                    // InternalGo.g:8249:1377: '\\u0BB7-\\u0BB9'
                    {
                    match("\u0BB7-\u0BB9"); 


                    }
                    break;
                case 96 :
                    // InternalGo.g:8249:1393: '\\u0C05-\\u0C0C'
                    {
                    match("\u0C05-\u0C0C"); 


                    }
                    break;
                case 97 :
                    // InternalGo.g:8249:1409: '\\u0C0E-\\u0C10'
                    {
                    match("\u0C0E-\u0C10"); 


                    }
                    break;
                case 98 :
                    // InternalGo.g:8249:1425: '\\u0C12-\\u0C28'
                    {
                    match("\u0C12-\u0C28"); 


                    }
                    break;
                case 99 :
                    // InternalGo.g:8249:1441: '\\u0C2A-\\u0C33'
                    {
                    match("\u0C2A-\u0C33"); 


                    }
                    break;
                case 100 :
                    // InternalGo.g:8249:1457: '\\u0C35-\\u0C39'
                    {
                    match("\u0C35-\u0C39"); 


                    }
                    break;
                case 101 :
                    // InternalGo.g:8249:1473: '\\u0C60-\\u0C61'
                    {
                    match("\u0C60-\u0C61"); 


                    }
                    break;
                case 102 :
                    // InternalGo.g:8249:1489: '\\u0C85-\\u0C8C'
                    {
                    match("\u0C85-\u0C8C"); 


                    }
                    break;
                case 103 :
                    // InternalGo.g:8249:1505: '\\u0C8E-\\u0C90'
                    {
                    match("\u0C8E-\u0C90"); 


                    }
                    break;
                case 104 :
                    // InternalGo.g:8249:1521: '\\u0C92-\\u0CA8'
                    {
                    match("\u0C92-\u0CA8"); 


                    }
                    break;
                case 105 :
                    // InternalGo.g:8249:1537: '\\u0CAA-\\u0CB3'
                    {
                    match("\u0CAA-\u0CB3"); 


                    }
                    break;
                case 106 :
                    // InternalGo.g:8249:1553: '\\u0CB5-\\u0CB9'
                    {
                    match("\u0CB5-\u0CB9"); 


                    }
                    break;
                case 107 :
                    // InternalGo.g:8249:1569: '\\u0CDE'
                    {
                    match('\u0CDE'); 

                    }
                    break;
                case 108 :
                    // InternalGo.g:8249:1578: '\\u0CE0-\\u0CE1'
                    {
                    match("\u0CE0-\u0CE1"); 


                    }
                    break;
                case 109 :
                    // InternalGo.g:8249:1594: '\\u0D05-\\u0D0C'
                    {
                    match("\u0D05-\u0D0C"); 


                    }
                    break;
                case 110 :
                    // InternalGo.g:8249:1610: '\\u0D0E-\\u0D10'
                    {
                    match("\u0D0E-\u0D10"); 


                    }
                    break;
                case 111 :
                    // InternalGo.g:8249:1626: '\\u0D12-\\u0D28'
                    {
                    match("\u0D12-\u0D28"); 


                    }
                    break;
                case 112 :
                    // InternalGo.g:8249:1642: '\\u0D2A-\\u0D39'
                    {
                    match("\u0D2A-\u0D39"); 


                    }
                    break;
                case 113 :
                    // InternalGo.g:8249:1658: '\\u0D60-\\u0D61'
                    {
                    match("\u0D60-\u0D61"); 


                    }
                    break;
                case 114 :
                    // InternalGo.g:8249:1674: '\\u0D85-\\u0D96'
                    {
                    match("\u0D85-\u0D96"); 


                    }
                    break;
                case 115 :
                    // InternalGo.g:8249:1690: '\\u0D9A-\\u0DB1'
                    {
                    match("\u0D9A-\u0DB1"); 


                    }
                    break;
                case 116 :
                    // InternalGo.g:8249:1706: '\\u0DB3-\\u0DBB'
                    {
                    match("\u0DB3-\u0DBB"); 


                    }
                    break;
                case 117 :
                    // InternalGo.g:8249:1722: '\\u0DBD'
                    {
                    match('\u0DBD'); 

                    }
                    break;
                case 118 :
                    // InternalGo.g:8249:1731: '\\u0DC0-\\u0DC6'
                    {
                    match("\u0DC0-\u0DC6"); 


                    }
                    break;
                case 119 :
                    // InternalGo.g:8249:1747: '\\u0E01-\\u0E30'
                    {
                    match("\u0E01-\u0E30"); 


                    }
                    break;
                case 120 :
                    // InternalGo.g:8249:1763: '\\u0E32-\\u0E33'
                    {
                    match("\u0E32-\u0E33"); 


                    }
                    break;
                case 121 :
                    // InternalGo.g:8249:1779: '\\u0E40-\\u0E46'
                    {
                    match("\u0E40-\u0E46"); 


                    }
                    break;
                case 122 :
                    // InternalGo.g:8249:1795: '\\u0E81-\\u0E82'
                    {
                    match("\u0E81-\u0E82"); 


                    }
                    break;
                case 123 :
                    // InternalGo.g:8249:1811: '\\u0E84'
                    {
                    match('\u0E84'); 

                    }
                    break;
                case 124 :
                    // InternalGo.g:8249:1820: '\\u0E87-\\u0E88'
                    {
                    match("\u0E87-\u0E88"); 


                    }
                    break;
                case 125 :
                    // InternalGo.g:8249:1836: '\\u0E8A'
                    {
                    match('\u0E8A'); 

                    }
                    break;
                case 126 :
                    // InternalGo.g:8249:1845: '\\u0E8D'
                    {
                    match('\u0E8D'); 

                    }
                    break;
                case 127 :
                    // InternalGo.g:8249:1854: '\\u0E94-\\u0E97'
                    {
                    match("\u0E94-\u0E97"); 


                    }
                    break;
                case 128 :
                    // InternalGo.g:8249:1870: '\\u0E99-\\u0E9F'
                    {
                    match("\u0E99-\u0E9F"); 


                    }
                    break;
                case 129 :
                    // InternalGo.g:8249:1886: '\\u0EA1-\\u0EA3'
                    {
                    match("\u0EA1-\u0EA3"); 


                    }
                    break;
                case 130 :
                    // InternalGo.g:8249:1902: '\\u0EA5'
                    {
                    match('\u0EA5'); 

                    }
                    break;
                case 131 :
                    // InternalGo.g:8249:1911: '\\u0EA7'
                    {
                    match('\u0EA7'); 

                    }
                    break;
                case 132 :
                    // InternalGo.g:8249:1920: '\\u0EAA-\\u0EAB'
                    {
                    match("\u0EAA-\u0EAB"); 


                    }
                    break;
                case 133 :
                    // InternalGo.g:8249:1936: '\\u0EAD-\\u0EB0'
                    {
                    match("\u0EAD-\u0EB0"); 


                    }
                    break;
                case 134 :
                    // InternalGo.g:8249:1952: '\\u0EB2-\\u0EB3'
                    {
                    match("\u0EB2-\u0EB3"); 


                    }
                    break;
                case 135 :
                    // InternalGo.g:8249:1968: '\\u0EBD-\\u0EC4'
                    {
                    match("\u0EBD-\u0EC4"); 


                    }
                    break;
                case 136 :
                    // InternalGo.g:8249:1984: '\\u0EC6'
                    {
                    match('\u0EC6'); 

                    }
                    break;
                case 137 :
                    // InternalGo.g:8249:1993: '\\u0EDC-\\u0EDD'
                    {
                    match("\u0EDC-\u0EDD"); 


                    }
                    break;
                case 138 :
                    // InternalGo.g:8249:2009: '\\u0F00'
                    {
                    match('\u0F00'); 

                    }
                    break;
                case 139 :
                    // InternalGo.g:8249:2018: '\\u0F40-\\u0F6A'
                    {
                    match("\u0F40-\u0F6A"); 


                    }
                    break;
                case 140 :
                    // InternalGo.g:8249:2034: '\\u0F88-\\u0F8B'
                    {
                    match("\u0F88-\u0F8B"); 


                    }
                    break;
                case 141 :
                    // InternalGo.g:8249:2050: '\\u1000-\\u1021'
                    {
                    match("\u1000-\u1021"); 


                    }
                    break;
                case 142 :
                    // InternalGo.g:8249:2066: '\\u1023-\\u1027'
                    {
                    match("\u1023-\u1027"); 


                    }
                    break;
                case 143 :
                    // InternalGo.g:8249:2082: '\\u1029-\\u102A'
                    {
                    match("\u1029-\u102A"); 


                    }
                    break;
                case 144 :
                    // InternalGo.g:8249:2098: '\\u1050-\\u1055'
                    {
                    match("\u1050-\u1055"); 


                    }
                    break;
                case 145 :
                    // InternalGo.g:8249:2114: '\\u10A0-\\u10C5'
                    {
                    match("\u10A0-\u10C5"); 


                    }
                    break;
                case 146 :
                    // InternalGo.g:8249:2130: '\\u10D0-\\u10F6'
                    {
                    match("\u10D0-\u10F6"); 


                    }
                    break;
                case 147 :
                    // InternalGo.g:8249:2146: '\\u1100-\\u1159'
                    {
                    match("\u1100-\u1159"); 


                    }
                    break;
                case 148 :
                    // InternalGo.g:8249:2162: '\\u115F-\\u11A2'
                    {
                    match("\u115F-\u11A2"); 


                    }
                    break;
                case 149 :
                    // InternalGo.g:8249:2178: '\\u11A8-\\u11F9'
                    {
                    match("\u11A8-\u11F9"); 


                    }
                    break;
                case 150 :
                    // InternalGo.g:8249:2194: '\\u1200-\\u1206'
                    {
                    match("\u1200-\u1206"); 


                    }
                    break;
                case 151 :
                    // InternalGo.g:8249:2210: '\\u1208-\\u1246'
                    {
                    match("\u1208-\u1246"); 


                    }
                    break;
                case 152 :
                    // InternalGo.g:8249:2226: '\\u1248'
                    {
                    match('\u1248'); 

                    }
                    break;
                case 153 :
                    // InternalGo.g:8249:2235: '\\u124A-\\u124D'
                    {
                    match("\u124A-\u124D"); 


                    }
                    break;
                case 154 :
                    // InternalGo.g:8249:2251: '\\u1250-\\u1256'
                    {
                    match("\u1250-\u1256"); 


                    }
                    break;
                case 155 :
                    // InternalGo.g:8249:2267: '\\u1258'
                    {
                    match('\u1258'); 

                    }
                    break;
                case 156 :
                    // InternalGo.g:8249:2276: '\\u125A-\\u125D'
                    {
                    match("\u125A-\u125D"); 


                    }
                    break;
                case 157 :
                    // InternalGo.g:8249:2292: '\\u1260-\\u1286'
                    {
                    match("\u1260-\u1286"); 


                    }
                    break;
                case 158 :
                    // InternalGo.g:8249:2308: '\\u1288'
                    {
                    match('\u1288'); 

                    }
                    break;
                case 159 :
                    // InternalGo.g:8249:2317: '\\u128A-\\u128D'
                    {
                    match("\u128A-\u128D"); 


                    }
                    break;
                case 160 :
                    // InternalGo.g:8249:2333: '\\u1290-\\u12AE'
                    {
                    match("\u1290-\u12AE"); 


                    }
                    break;
                case 161 :
                    // InternalGo.g:8249:2349: '\\u12B0'
                    {
                    match('\u12B0'); 

                    }
                    break;
                case 162 :
                    // InternalGo.g:8249:2358: '\\u12B2-\\u12B5'
                    {
                    match("\u12B2-\u12B5"); 


                    }
                    break;
                case 163 :
                    // InternalGo.g:8249:2374: '\\u12B8-\\u12BE'
                    {
                    match("\u12B8-\u12BE"); 


                    }
                    break;
                case 164 :
                    // InternalGo.g:8249:2390: '\\u12C0'
                    {
                    match('\u12C0'); 

                    }
                    break;
                case 165 :
                    // InternalGo.g:8249:2399: '\\u12C2-\\u12C5'
                    {
                    match("\u12C2-\u12C5"); 


                    }
                    break;
                case 166 :
                    // InternalGo.g:8249:2415: '\\u12C8-\\u12CE'
                    {
                    match("\u12C8-\u12CE"); 


                    }
                    break;
                case 167 :
                    // InternalGo.g:8249:2431: '\\u12D0-\\u12D6'
                    {
                    match("\u12D0-\u12D6"); 


                    }
                    break;
                case 168 :
                    // InternalGo.g:8249:2447: '\\u12D8-\\u12EE'
                    {
                    match("\u12D8-\u12EE"); 


                    }
                    break;
                case 169 :
                    // InternalGo.g:8249:2463: '\\u12F0-\\u130E'
                    {
                    match("\u12F0-\u130E"); 


                    }
                    break;
                case 170 :
                    // InternalGo.g:8249:2479: '\\u1310'
                    {
                    match('\u1310'); 

                    }
                    break;
                case 171 :
                    // InternalGo.g:8249:2488: '\\u1312-\\u1315'
                    {
                    match("\u1312-\u1315"); 


                    }
                    break;
                case 172 :
                    // InternalGo.g:8249:2504: '\\u1318-\\u131E'
                    {
                    match("\u1318-\u131E"); 


                    }
                    break;
                case 173 :
                    // InternalGo.g:8249:2520: '\\u1320-\\u1346'
                    {
                    match("\u1320-\u1346"); 


                    }
                    break;
                case 174 :
                    // InternalGo.g:8249:2536: '\\u1348-\\u135A'
                    {
                    match("\u1348-\u135A"); 


                    }
                    break;
                case 175 :
                    // InternalGo.g:8249:2552: '\\u13A0-\\u13B0'
                    {
                    match("\u13A0-\u13B0"); 


                    }
                    break;
                case 176 :
                    // InternalGo.g:8249:2568: '\\u13B1-\\u13F4'
                    {
                    match("\u13B1-\u13F4"); 


                    }
                    break;
                case 177 :
                    // InternalGo.g:8249:2584: '\\u1401-\\u1676'
                    {
                    match("\u1401-\u1676"); 


                    }
                    break;
                case 178 :
                    // InternalGo.g:8249:2600: '\\u1681-\\u169A'
                    {
                    match("\u1681-\u169A"); 


                    }
                    break;
                case 179 :
                    // InternalGo.g:8249:2616: '\\u16A0-\\u16EA'
                    {
                    match("\u16A0-\u16EA"); 


                    }
                    break;
                case 180 :
                    // InternalGo.g:8249:2632: '\\u1780-\\u17B3'
                    {
                    match("\u1780-\u17B3"); 


                    }
                    break;
                case 181 :
                    // InternalGo.g:8249:2648: '\\u1820-\\u1877'
                    {
                    match("\u1820-\u1877"); 


                    }
                    break;
                case 182 :
                    // InternalGo.g:8249:2664: '\\u1880-\\u18A8'
                    {
                    match("\u1880-\u18A8"); 


                    }
                    break;
                case 183 :
                    // InternalGo.g:8249:2680: '\\u1E00-\\u1E9B'
                    {
                    match("\u1E00-\u1E9B"); 


                    }
                    break;
                case 184 :
                    // InternalGo.g:8249:2696: '\\u1EA0-\\u1EE0'
                    {
                    match("\u1EA0-\u1EE0"); 


                    }
                    break;
                case 185 :
                    // InternalGo.g:8249:2712: '\\u1EE1-\\u1EF9'
                    {
                    match("\u1EE1-\u1EF9"); 


                    }
                    break;
                case 186 :
                    // InternalGo.g:8249:2728: '\\u1F00-\\u1F15'
                    {
                    match("\u1F00-\u1F15"); 


                    }
                    break;
                case 187 :
                    // InternalGo.g:8249:2744: '\\u1F18-\\u1F1D'
                    {
                    match("\u1F18-\u1F1D"); 


                    }
                    break;
                case 188 :
                    // InternalGo.g:8249:2760: '\\u1F20-\\u1F39'
                    {
                    match("\u1F20-\u1F39"); 


                    }
                    break;
                case 189 :
                    // InternalGo.g:8249:2776: '\\u1F3A-\\u1F45'
                    {
                    match("\u1F3A-\u1F45"); 


                    }
                    break;
                case 190 :
                    // InternalGo.g:8249:2792: '\\u1F48-\\u1F4D'
                    {
                    match("\u1F48-\u1F4D"); 


                    }
                    break;
                case 191 :
                    // InternalGo.g:8249:2808: '\\u1F50-\\u1F57'
                    {
                    match("\u1F50-\u1F57"); 


                    }
                    break;
                case 192 :
                    // InternalGo.g:8249:2824: '\\u1F59'
                    {
                    match('\u1F59'); 

                    }
                    break;
                case 193 :
                    // InternalGo.g:8249:2833: '\\u1F5B'
                    {
                    match('\u1F5B'); 

                    }
                    break;
                case 194 :
                    // InternalGo.g:8249:2842: '\\u1F5D'
                    {
                    match('\u1F5D'); 

                    }
                    break;
                case 195 :
                    // InternalGo.g:8249:2851: '\\u1F5F-\\u1F7D'
                    {
                    match("\u1F5F-\u1F7D"); 


                    }
                    break;
                case 196 :
                    // InternalGo.g:8249:2867: '\\u1F80-\\u1FB4'
                    {
                    match("\u1F80-\u1FB4"); 


                    }
                    break;
                case 197 :
                    // InternalGo.g:8249:2883: '\\u1FB6-\\u1FBC'
                    {
                    match("\u1FB6-\u1FBC"); 


                    }
                    break;
                case 198 :
                    // InternalGo.g:8249:2899: '\\u1FBE'
                    {
                    match('\u1FBE'); 

                    }
                    break;
                case 199 :
                    // InternalGo.g:8249:2908: '\\u1FC2-\\u1FC4'
                    {
                    match("\u1FC2-\u1FC4"); 


                    }
                    break;
                case 200 :
                    // InternalGo.g:8249:2924: '\\u1FC6-\\u1FCC'
                    {
                    match("\u1FC6-\u1FCC"); 


                    }
                    break;
                case 201 :
                    // InternalGo.g:8249:2940: '\\u1FD0-\\u1FD3'
                    {
                    match("\u1FD0-\u1FD3"); 


                    }
                    break;
                case 202 :
                    // InternalGo.g:8249:2956: '\\u1FD6-\\u1FDB'
                    {
                    match("\u1FD6-\u1FDB"); 


                    }
                    break;
                case 203 :
                    // InternalGo.g:8249:2972: '\\u1FE0-\\u1FEC'
                    {
                    match("\u1FE0-\u1FEC"); 


                    }
                    break;
                case 204 :
                    // InternalGo.g:8249:2988: '\\u1FF2-\\u1FF4'
                    {
                    match("\u1FF2-\u1FF4"); 


                    }
                    break;
                case 205 :
                    // InternalGo.g:8249:3004: '\\u1FF6-\\u1FFC'
                    {
                    match("\u1FF6-\u1FFC"); 


                    }
                    break;
                case 206 :
                    // InternalGo.g:8249:3020: '\\u207F'
                    {
                    match('\u207F'); 

                    }
                    break;
                case 207 :
                    // InternalGo.g:8249:3029: '\\u2102'
                    {
                    match('\u2102'); 

                    }
                    break;
                case 208 :
                    // InternalGo.g:8249:3038: '\\u2107'
                    {
                    match('\u2107'); 

                    }
                    break;
                case 209 :
                    // InternalGo.g:8249:3047: '\\u210A-\\u2113'
                    {
                    match("\u210A-\u2113"); 


                    }
                    break;
                case 210 :
                    // InternalGo.g:8249:3063: '\\u2115'
                    {
                    match('\u2115'); 

                    }
                    break;
                case 211 :
                    // InternalGo.g:8249:3072: '\\u2119-\\u211D'
                    {
                    match("\u2119-\u211D"); 


                    }
                    break;
                case 212 :
                    // InternalGo.g:8249:3088: '\\u2124'
                    {
                    match('\u2124'); 

                    }
                    break;
                case 213 :
                    // InternalGo.g:8249:3097: '\\u2126'
                    {
                    match('\u2126'); 

                    }
                    break;
                case 214 :
                    // InternalGo.g:8249:3106: '\\u2128'
                    {
                    match('\u2128'); 

                    }
                    break;
                case 215 :
                    // InternalGo.g:8249:3115: '\\u212A-\\u212D'
                    {
                    match("\u212A-\u212D"); 


                    }
                    break;
                case 216 :
                    // InternalGo.g:8249:3131: '\\u212F-\\u2131'
                    {
                    match("\u212F-\u2131"); 


                    }
                    break;
                case 217 :
                    // InternalGo.g:8249:3147: '\\u2133-\\u2139'
                    {
                    match("\u2133-\u2139"); 


                    }
                    break;
                case 218 :
                    // InternalGo.g:8249:3163: '\\u2160-\\u2183'
                    {
                    match("\u2160-\u2183"); 


                    }
                    break;
                case 219 :
                    // InternalGo.g:8249:3179: '\\u3005-\\u3007'
                    {
                    match("\u3005-\u3007"); 


                    }
                    break;
                case 220 :
                    // InternalGo.g:8249:3195: '\\u3021-\\u3029'
                    {
                    match("\u3021-\u3029"); 


                    }
                    break;
                case 221 :
                    // InternalGo.g:8249:3211: '\\u3031-\\u3035'
                    {
                    match("\u3031-\u3035"); 


                    }
                    break;
                case 222 :
                    // InternalGo.g:8249:3227: '\\u3038-\\u303A'
                    {
                    match("\u3038-\u303A"); 


                    }
                    break;
                case 223 :
                    // InternalGo.g:8249:3243: '\\u3041-\\u3094'
                    {
                    match("\u3041-\u3094"); 


                    }
                    break;
                case 224 :
                    // InternalGo.g:8249:3259: '\\u309D-\\u309E'
                    {
                    match("\u309D-\u309E"); 


                    }
                    break;
                case 225 :
                    // InternalGo.g:8249:3275: '\\u30A1-\\u30FA'
                    {
                    match("\u30A1-\u30FA"); 


                    }
                    break;
                case 226 :
                    // InternalGo.g:8249:3291: '\\u30FC-\\u30FE'
                    {
                    match("\u30FC-\u30FE"); 


                    }
                    break;
                case 227 :
                    // InternalGo.g:8249:3307: '\\u3105-\\u312C'
                    {
                    match("\u3105-\u312C"); 


                    }
                    break;
                case 228 :
                    // InternalGo.g:8249:3323: '\\u3131-\\u318E'
                    {
                    match("\u3131-\u318E"); 


                    }
                    break;
                case 229 :
                    // InternalGo.g:8249:3339: '\\u31A0-\\u31B7'
                    {
                    match("\u31A0-\u31B7"); 


                    }
                    break;
                case 230 :
                    // InternalGo.g:8249:3355: '\\u3400'
                    {
                    match('\u3400'); 

                    }
                    break;
                case 231 :
                    // InternalGo.g:8249:3364: '\\u4DB5'
                    {
                    match('\u4DB5'); 

                    }
                    break;
                case 232 :
                    // InternalGo.g:8249:3373: '\\u4E00'
                    {
                    match('\u4E00'); 

                    }
                    break;
                case 233 :
                    // InternalGo.g:8249:3382: '\\u9FA5'
                    {
                    match('\u9FA5'); 

                    }
                    break;
                case 234 :
                    // InternalGo.g:8249:3391: '\\uA000-\\uA48C'
                    {
                    match("\uA000-\uA48C"); 


                    }
                    break;
                case 235 :
                    // InternalGo.g:8249:3407: '\\uAC00'
                    {
                    match('\uAC00'); 

                    }
                    break;
                case 236 :
                    // InternalGo.g:8249:3416: '\\uD7A3'
                    {
                    match('\uD7A3'); 

                    }
                    break;
                case 237 :
                    // InternalGo.g:8249:3425: '\\uF900-\\uFA2D'
                    {
                    match("\uF900-\uFA2D"); 


                    }
                    break;
                case 238 :
                    // InternalGo.g:8249:3441: '\\uFB00-\\uFB06'
                    {
                    match("\uFB00-\uFB06"); 


                    }
                    break;
                case 239 :
                    // InternalGo.g:8249:3457: '\\uFB13-\\uFB17'
                    {
                    match("\uFB13-\uFB17"); 


                    }
                    break;
                case 240 :
                    // InternalGo.g:8249:3473: '\\uFB1D'
                    {
                    match('\uFB1D'); 

                    }
                    break;
                case 241 :
                    // InternalGo.g:8249:3482: '\\uFB1F-\\uFB28'
                    {
                    match("\uFB1F-\uFB28"); 


                    }
                    break;
                case 242 :
                    // InternalGo.g:8249:3498: '\\uFB2A-\\uFB36'
                    {
                    match("\uFB2A-\uFB36"); 


                    }
                    break;
                case 243 :
                    // InternalGo.g:8249:3514: '\\uFB38-\\uFB3C'
                    {
                    match("\uFB38-\uFB3C"); 


                    }
                    break;
                case 244 :
                    // InternalGo.g:8249:3530: '\\uFB3E'
                    {
                    match('\uFB3E'); 

                    }
                    break;
                case 245 :
                    // InternalGo.g:8249:3539: '\\uFB40-\\uFB41'
                    {
                    match("\uFB40-\uFB41"); 


                    }
                    break;
                case 246 :
                    // InternalGo.g:8249:3555: '\\uFB43-\\uFB44'
                    {
                    match("\uFB43-\uFB44"); 


                    }
                    break;
                case 247 :
                    // InternalGo.g:8249:3571: '\\uFB46-\\uFBB1'
                    {
                    match("\uFB46-\uFBB1"); 


                    }
                    break;
                case 248 :
                    // InternalGo.g:8249:3587: '\\uFBD3-\\uFD3D'
                    {
                    match("\uFBD3-\uFD3D"); 


                    }
                    break;
                case 249 :
                    // InternalGo.g:8249:3603: '\\uFD50-\\uFD8F'
                    {
                    match("\uFD50-\uFD8F"); 


                    }
                    break;
                case 250 :
                    // InternalGo.g:8249:3619: '\\uFD92-\\uFDC7'
                    {
                    match("\uFD92-\uFDC7"); 


                    }
                    break;
                case 251 :
                    // InternalGo.g:8249:3635: '\\uFDF0-\\uFDFB'
                    {
                    match("\uFDF0-\uFDFB"); 


                    }
                    break;
                case 252 :
                    // InternalGo.g:8249:3651: '\\uFE70-\\uFE72'
                    {
                    match("\uFE70-\uFE72"); 


                    }
                    break;
                case 253 :
                    // InternalGo.g:8249:3667: '\\uFE74'
                    {
                    match('\uFE74'); 

                    }
                    break;
                case 254 :
                    // InternalGo.g:8249:3676: '\\uFE76-\\uFEFC'
                    {
                    match("\uFE76-\uFEFC"); 


                    }
                    break;
                case 255 :
                    // InternalGo.g:8249:3692: '\\uFF21-\\uFF3A'
                    {
                    match("\uFF21-\uFF3A"); 


                    }
                    break;
                case 256 :
                    // InternalGo.g:8249:3708: '\\uFF41-\\uFF5A'
                    {
                    match("\uFF41-\uFF5A"); 


                    }
                    break;
                case 257 :
                    // InternalGo.g:8249:3724: '\\uFF66-\\uFFBE'
                    {
                    match("\uFF66-\uFFBE"); 


                    }
                    break;
                case 258 :
                    // InternalGo.g:8249:3740: '\\uFFC2-\\uFFC7'
                    {
                    match("\uFFC2-\uFFC7"); 


                    }
                    break;
                case 259 :
                    // InternalGo.g:8249:3756: '\\uFFCA-\\uFFCF'
                    {
                    match("\uFFCA-\uFFCF"); 


                    }
                    break;
                case 260 :
                    // InternalGo.g:8249:3772: '\\uFFD2-\\uFFD7'
                    {
                    match("\uFFD2-\uFFD7"); 


                    }
                    break;
                case 261 :
                    // InternalGo.g:8249:3788: '\\uFFDA-\\uFFDC'
                    {
                    match("\uFFDA-\uFFDC"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_LETTER"

    // $ANTLR start "RULE_UNICODE_DIGIT"
    public final void mRULE_UNICODE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_UNICODE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8251:20: ( 'A-Z' )
            // InternalGo.g:8251:22: 'A-Z'
            {
            match("A-Z"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_DIGIT"

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8253:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:8253:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:8253:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:8253:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8253:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8253:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8253:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8253:53: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_OP"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            // InternalGo.g:8255:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' | ':=' ) )
            // InternalGo.g:8255:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' | ':=' )
            {
            // InternalGo.g:8255:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' | ':=' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:8255:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8255:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8255:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8255:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8255:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8255:48: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:8255:53: ':='
                    {
                    match(":="); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REL_OP"

    // $ANTLR start "RULE_ADD_OP"
    public final void mRULE_ADD_OP() throws RecognitionException {
        try {
            // InternalGo.g:8257:22: ( ( '+' | '-' | '|' | '^' | '++' | '--' ) )
            // InternalGo.g:8257:24: ( '+' | '-' | '|' | '^' | '++' | '--' )
            {
            // InternalGo.g:8257:24: ( '+' | '-' | '|' | '^' | '++' | '--' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '+':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='+') ) {
                    alt4=5;
                }
                else {
                    alt4=1;}
                }
                break;
            case '-':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='-') ) {
                    alt4=6;
                }
                else {
                    alt4=2;}
                }
                break;
            case '|':
                {
                alt4=3;
                }
                break;
            case '^':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:8257:25: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8257:29: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8257:33: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8257:37: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8257:41: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8257:46: '--'
                    {
                    match("--"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            // InternalGo.g:8259:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:8259:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:8259:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt5=1;
                }
                break;
            case '/':
                {
                alt5=2;
                }
                break;
            case '%':
                {
                alt5=3;
                }
                break;
            case '<':
                {
                alt5=4;
                }
                break;
            case '>':
                {
                alt5=5;
                }
                break;
            case '&':
                {
                int LA5_6 = input.LA(2);

                if ( (LA5_6=='^') ) {
                    alt5=7;
                }
                else {
                    alt5=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:8259:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8259:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8259:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8259:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8259:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8259:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8259:51: '&^'
                    {
                    match("&^"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_OP"

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8261:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:8261:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:8261:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt6=1;
                }
                break;
            case '-':
                {
                alt6=2;
                }
                break;
            case '!':
                {
                alt6=3;
                }
                break;
            case '^':
                {
                alt6=4;
                }
                break;
            case '*':
                {
                alt6=5;
                }
                break;
            case '&':
                {
                alt6=6;
                }
                break;
            case '<':
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGo.g:8261:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8261:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8261:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8261:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8261:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8261:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8261:42: '<-'
                    {
                    match("<-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8263:13: ( ( RULE_UNICODE_LETTER | RULE_ID ) )
            // InternalGo.g:8263:15: ( RULE_UNICODE_LETTER | RULE_ID )
            {
            // InternalGo.g:8263:15: ( RULE_UNICODE_LETTER | RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='A') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='-') ) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else if ( (LA7_0=='a') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='-') ) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else if ( (LA7_0=='\u00AA'||LA7_0=='\u00B5'||LA7_0=='\u00BA'||LA7_0=='\u00C0'||LA7_0=='\u00D8'||LA7_0=='\u00F8'||LA7_0=='\u0222'||LA7_0=='\u0250'||LA7_0=='\u02B0'||LA7_0=='\u02BB'||LA7_0=='\u02D0'||LA7_0=='\u02E0'||LA7_0=='\u02EE'||LA7_0=='\u037A'||LA7_0=='\u0386'||LA7_0=='\u0388'||LA7_0=='\u038C'||LA7_0=='\u038E'||LA7_0=='\u03A3'||LA7_0=='\u03D0'||LA7_0=='\u03DA'||LA7_0=='\u0400'||LA7_0=='\u048C'||LA7_0=='\u04C7'||LA7_0=='\u04CB'||LA7_0=='\u04D0'||LA7_0=='\u04F8'||LA7_0=='\u0531'||LA7_0=='\u0559'||LA7_0=='\u0561'||LA7_0=='\u05D0'||LA7_0=='\u05F0'||LA7_0=='\u0621'||LA7_0=='\u0640'||LA7_0=='\u0671'||LA7_0=='\u06D5'||LA7_0=='\u06E5'||LA7_0=='\u06FA'||LA7_0=='\u0710'||LA7_0=='\u0712'||LA7_0=='\u0780'||LA7_0=='\u0905'||LA7_0=='\u093D'||LA7_0=='\u0950'||LA7_0=='\u0958'||LA7_0=='\u0985'||LA7_0=='\u098F'||LA7_0=='\u0993'||LA7_0=='\u09AA'||LA7_0=='\u09B2'||LA7_0=='\u09B6'||LA7_0=='\u09DC'||LA7_0=='\u09DF'||LA7_0=='\u09F0'||LA7_0=='\u0A05'||LA7_0=='\u0A0F'||LA7_0=='\u0A13'||LA7_0=='\u0A2A'||LA7_0=='\u0A32'||LA7_0=='\u0A35'||LA7_0=='\u0A38'||LA7_0=='\u0A59'||LA7_0=='\u0A5E'||LA7_0=='\u0A72'||LA7_0=='\u0A85'||LA7_0=='\u0A8D'||LA7_0=='\u0A8F'||LA7_0=='\u0A93'||LA7_0=='\u0AAA'||LA7_0=='\u0AB2'||LA7_0=='\u0AB5'||LA7_0=='\u0ABD'||LA7_0=='\u0AD0'||LA7_0=='\u0AE0'||LA7_0=='\u0B05'||LA7_0=='\u0B0F'||LA7_0=='\u0B13'||LA7_0=='\u0B2A'||LA7_0=='\u0B32'||LA7_0=='\u0B36'||LA7_0=='\u0B3D'||LA7_0=='\u0B5C'||LA7_0=='\u0B5F'||LA7_0=='\u0B85'||LA7_0=='\u0B8E'||LA7_0=='\u0B92'||LA7_0=='\u0B99'||LA7_0=='\u0B9C'||LA7_0=='\u0B9E'||LA7_0=='\u0BA3'||LA7_0=='\u0BA8'||LA7_0=='\u0BAE'||LA7_0=='\u0BB7'||LA7_0=='\u0C05'||LA7_0=='\u0C0E'||LA7_0=='\u0C12'||LA7_0=='\u0C2A'||LA7_0=='\u0C35'||LA7_0=='\u0C60'||LA7_0=='\u0C85'||LA7_0=='\u0C8E'||LA7_0=='\u0C92'||LA7_0=='\u0CAA'||LA7_0=='\u0CB5'||LA7_0=='\u0CDE'||LA7_0=='\u0CE0'||LA7_0=='\u0D05'||LA7_0=='\u0D0E'||LA7_0=='\u0D12'||LA7_0=='\u0D2A'||LA7_0=='\u0D60'||LA7_0=='\u0D85'||LA7_0=='\u0D9A'||LA7_0=='\u0DB3'||LA7_0=='\u0DBD'||LA7_0=='\u0DC0'||LA7_0=='\u0E01'||LA7_0=='\u0E32'||LA7_0=='\u0E40'||LA7_0=='\u0E81'||LA7_0=='\u0E84'||LA7_0=='\u0E87'||LA7_0=='\u0E8A'||LA7_0=='\u0E8D'||LA7_0=='\u0E94'||LA7_0=='\u0E99'||LA7_0=='\u0EA1'||LA7_0=='\u0EA5'||LA7_0=='\u0EA7'||LA7_0=='\u0EAA'||LA7_0=='\u0EAD'||LA7_0=='\u0EB2'||LA7_0=='\u0EBD'||LA7_0=='\u0EC6'||LA7_0=='\u0EDC'||LA7_0=='\u0F00'||LA7_0=='\u0F40'||LA7_0=='\u0F88'||LA7_0=='\u1000'||LA7_0=='\u1023'||LA7_0=='\u1029'||LA7_0=='\u1050'||LA7_0=='\u10A0'||LA7_0=='\u10D0'||LA7_0=='\u1100'||LA7_0=='\u115F'||LA7_0=='\u11A8'||LA7_0=='\u1200'||LA7_0=='\u1208'||LA7_0=='\u1248'||LA7_0=='\u124A'||LA7_0=='\u1250'||LA7_0=='\u1258'||LA7_0=='\u125A'||LA7_0=='\u1260'||LA7_0=='\u1288'||LA7_0=='\u128A'||LA7_0=='\u1290'||LA7_0=='\u12B0'||LA7_0=='\u12B2'||LA7_0=='\u12B8'||LA7_0=='\u12C0'||LA7_0=='\u12C2'||LA7_0=='\u12C8'||LA7_0=='\u12D0'||LA7_0=='\u12D8'||LA7_0=='\u12F0'||LA7_0=='\u1310'||LA7_0=='\u1312'||LA7_0=='\u1318'||LA7_0=='\u1320'||LA7_0=='\u1348'||LA7_0=='\u13A0'||LA7_0=='\u13B1'||LA7_0=='\u1401'||LA7_0=='\u1681'||LA7_0=='\u16A0'||LA7_0=='\u1780'||LA7_0=='\u1820'||LA7_0=='\u1880'||LA7_0=='\u1E00'||LA7_0=='\u1EA0'||LA7_0=='\u1EE1'||LA7_0=='\u1F00'||LA7_0=='\u1F18'||LA7_0=='\u1F20'||LA7_0=='\u1F3A'||LA7_0=='\u1F48'||LA7_0=='\u1F50'||LA7_0=='\u1F59'||LA7_0=='\u1F5B'||LA7_0=='\u1F5D'||LA7_0=='\u1F5F'||LA7_0=='\u1F80'||LA7_0=='\u1FB6'||LA7_0=='\u1FBE'||LA7_0=='\u1FC2'||LA7_0=='\u1FC6'||LA7_0=='\u1FD0'||LA7_0=='\u1FD6'||LA7_0=='\u1FE0'||LA7_0=='\u1FF2'||LA7_0=='\u1FF6'||LA7_0=='\u207F'||LA7_0=='\u2102'||LA7_0=='\u2107'||LA7_0=='\u210A'||LA7_0=='\u2115'||LA7_0=='\u2119'||LA7_0=='\u2124'||LA7_0=='\u2126'||LA7_0=='\u2128'||LA7_0=='\u212A'||LA7_0=='\u212F'||LA7_0=='\u2133'||LA7_0=='\u2160'||LA7_0=='\u3005'||LA7_0=='\u3021'||LA7_0=='\u3031'||LA7_0=='\u3038'||LA7_0=='\u3041'||LA7_0=='\u309D'||LA7_0=='\u30A1'||LA7_0=='\u30FC'||LA7_0=='\u3105'||LA7_0=='\u3131'||LA7_0=='\u31A0'||LA7_0=='\u3400'||LA7_0=='\u4DB5'||LA7_0=='\u4E00'||LA7_0=='\u9FA5'||LA7_0=='\uA000'||LA7_0=='\uAC00'||LA7_0=='\uD7A3'||LA7_0=='\uF900'||LA7_0=='\uFB00'||LA7_0=='\uFB13'||LA7_0=='\uFB1D'||LA7_0=='\uFB1F'||LA7_0=='\uFB2A'||LA7_0=='\uFB38'||LA7_0=='\uFB3E'||LA7_0=='\uFB40'||LA7_0=='\uFB43'||LA7_0=='\uFB46'||LA7_0=='\uFBD3'||LA7_0=='\uFD50'||LA7_0=='\uFD92'||LA7_0=='\uFDF0'||LA7_0=='\uFE70'||LA7_0=='\uFE74'||LA7_0=='\uFE76'||LA7_0=='\uFF21'||LA7_0=='\uFF41'||LA7_0=='\uFF66'||LA7_0=='\uFFC2'||LA7_0=='\uFFCA'||LA7_0=='\uFFD2'||LA7_0=='\uFFDA') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='B' && LA7_0<='Z')||(LA7_0>='^' && LA7_0<='_')||(LA7_0>='b' && LA7_0<='z')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:8263:16: RULE_UNICODE_LETTER
                    {
                    mRULE_UNICODE_LETTER(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8263:36: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8265:29: ( RULE_INT )
            // InternalGo.g:8265:31: RULE_INT
            {
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8267:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // InternalGo.g:8267:29: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='7') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8269:25: ( ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) ) )
            // InternalGo.g:8269:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_INT_LIT"
    public final void mRULE_INT_LIT() throws RecognitionException {
        try {
            int _type = RULE_INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8271:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:8271:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:8271:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='X'||LA8_2=='x') ) {
                    alt8=3;
                }
                else {
                    alt8=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:8271:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8271:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8271:49: RULE_HEX_LIT
                    {
                    mRULE_HEX_LIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_LIT"

    // $ANTLR start "RULE_DECIMAL_LIT"
    public final void mRULE_DECIMAL_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8273:27: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:8273:29: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )*
            {
            if ( (input.LA(1)>='1' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8273:67: ( RULE_DECIMAL_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:8273:67: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LIT"

    // $ANTLR start "RULE_OCTAL_LIT"
    public final void mRULE_OCTAL_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8275:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:8275:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:8275:31: ( RULE_OCTAL_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:8275:31: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LIT"

    // $ANTLR start "RULE_HEX_LIT"
    public final void mRULE_HEX_LIT() throws RecognitionException {
        try {
            // InternalGo.g:8277:23: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:8277:25: '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_HEX_DIGIT(); 
            // InternalGo.g:8277:54: ( RULE_HEX_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:8277:54: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LIT"

    // $ANTLR start "RULE_FLOAT_LIT"
    public final void mRULE_FLOAT_LIT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8279:16: ( ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? ) )
            // InternalGo.g:8279:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            {
            // InternalGo.g:8279:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalGo.g:8279:19: RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )?
                    {
                    mRULE_DECIMAL_LIT(); 
                    match('.'); 
                    // InternalGo.g:8279:40: ( RULE_DECIMAL_LIT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>='1' && LA12_0<='9')) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:8279:40: RULE_DECIMAL_LIT
                            {
                            mRULE_DECIMAL_LIT(); 

                            }
                            break;

                    }

                    // InternalGo.g:8279:58: ( RULE_EXPOENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGo.g:8279:58: RULE_EXPOENT
                            {
                            mRULE_EXPOENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:8279:72: RULE_DECIMALS RULE_EXPOENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPOENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8279:99: '.' RULE_DECIMALS ( RULE_EXPOENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:8279:117: ( RULE_EXPOENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGo.g:8279:117: RULE_EXPOENT
                            {
                            mRULE_EXPOENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LIT"

    // $ANTLR start "RULE_DECIMALS"
    public final void mRULE_DECIMALS() throws RecognitionException {
        try {
            int _type = RULE_DECIMALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8281:15: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:8281:17: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:8281:17: ( RULE_DECIMAL_DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGo.g:8281:17: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALS"

    // $ANTLR start "RULE_EXPOENT"
    public final void mRULE_EXPOENT() throws RecognitionException {
        try {
            // InternalGo.g:8283:23: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:8283:25: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8283:35: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DECIMALS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPOENT"

    // $ANTLR start "RULE_UNICODE_VALUE"
    public final void mRULE_UNICODE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_UNICODE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8285:20: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:8285:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:8285:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case 'U':
                    {
                    alt18=3;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt18=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:8285:23: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8285:41: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8285:61: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8285:78: RULE_ESCAPED_CHAR
                    {
                    mRULE_ESCAPED_CHAR(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_VALUE"

    // $ANTLR start "RULE_BYTE_VALUE"
    public final void mRULE_BYTE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BYTE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8287:17: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:8287:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:8287:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='x') ) {
                    alt19=2;
                }
                else if ( ((LA19_1>='0' && LA19_1<='7')) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:8287:20: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8287:42: RULE_HEX_BYTE_VALUE
                    {
                    mRULE_HEX_BYTE_VALUE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE_VALUE"

    // $ANTLR start "RULE_OCTAL_BYTE_VALUE"
    public final void mRULE_OCTAL_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8289:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:8289:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
            {
            match('\\'); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_BYTE_VALUE"

    // $ANTLR start "RULE_HEX_BYTE_VALUE"
    public final void mRULE_HEX_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8291:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8291:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('x'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_BYTE_VALUE"

    // $ANTLR start "RULE_LITTLE_U_VALUE"
    public final void mRULE_LITTLE_U_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8293:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8293:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITTLE_U_VALUE"

    // $ANTLR start "RULE_BIG_U_VALUE"
    public final void mRULE_BIG_U_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:8295:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8295:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('U'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIG_U_VALUE"

    // $ANTLR start "RULE_ESCAPED_CHAR"
    public final void mRULE_ESCAPED_CHAR() throws RecognitionException {
        try {
            // InternalGo.g:8297:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:8297:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHAR"

    // $ANTLR start "RULE_RAW_STRING_LIT"
    public final void mRULE_RAW_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_RAW_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8299:21: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\'' )
            // InternalGo.g:8299:23: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\''
            {
            match('\''); 
            // InternalGo.g:8299:28: ( RULE_UNICODE_CHAR | RULE_NEWLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:
                    {
                    if ( input.LA(1)=='\n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAW_STRING_LIT"

    // $ANTLR start "RULE_INTERPRETED_STRING_LIT"
    public final void mRULE_INTERPRETED_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTERPRETED_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8301:29: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"' )
            // InternalGo.g:8301:31: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"'
            {
            match('\"'); 
            // InternalGo.g:8301:35: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\\') ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2=='\"'||LA21_2=='\''||LA21_2=='U'||LA21_2=='\\'||(LA21_2>='a' && LA21_2<='b')||LA21_2=='f'||LA21_2=='n'||LA21_2=='r'||(LA21_2>='t' && LA21_2<='v')) ) {
                    alt21=1;
                }
                else if ( ((LA21_2>='0' && LA21_2<='7')||LA21_2=='x') ) {
                    alt21=2;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:8301:36: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8301:55: RULE_BYTE_VALUE
                    {
                    mRULE_BYTE_VALUE(); 

                    }
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERPRETED_STRING_LIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalGo.g:8303:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:8303:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:8303:20: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:8303:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8303:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalGo.g:8305:19: ( ( '0' .. '9' )+ )
            // InternalGo.g:8305:21: ( '0' .. '9' )+
            {
            // InternalGo.g:8305:21: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGo.g:8305:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8307:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:8307:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:8307:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\"') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\'') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:8307:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:8307:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGo.g:8307:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8307:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8307:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:8307:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGo.g:8307:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8307:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8309:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:8309:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:8309:24: ( options {greedy=false; } : . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='*') ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1=='/') ) {
                        alt28=2;
                    }
                    else if ( ((LA28_1>='\u0000' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='\uFFFF')) ) {
                        alt28=1;
                    }


                }
                else if ( ((LA28_0>='\u0000' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:8309:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8311:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:8311:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:8311:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:8311:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalGo.g:8311:40: ( ( '\\r' )? '\\n' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:8311:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:8311:41: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalGo.g:8311:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8313:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:8313:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:8313:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8315:16: ( . )
            // InternalGo.g:8315:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGo.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | RULE_UNICODE_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_LETTER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt33=69;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // InternalGo.g:1:10: T__40
                {
                mT__40(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__41
                {
                mT__41(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__42
                {
                mT__42(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__43
                {
                mT__43(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__44
                {
                mT__44(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__45
                {
                mT__45(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__46
                {
                mT__46(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__47
                {
                mT__47(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__48
                {
                mT__48(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__49
                {
                mT__49(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__50
                {
                mT__50(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__51
                {
                mT__51(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__52
                {
                mT__52(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__53
                {
                mT__53(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__54
                {
                mT__54(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__55
                {
                mT__55(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__56
                {
                mT__56(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__57
                {
                mT__57(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__58
                {
                mT__58(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__59
                {
                mT__59(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__60
                {
                mT__60(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__61
                {
                mT__61(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__62
                {
                mT__62(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__63
                {
                mT__63(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__64
                {
                mT__64(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__65
                {
                mT__65(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__66
                {
                mT__66(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__67
                {
                mT__67(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__68
                {
                mT__68(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__69
                {
                mT__69(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__70
                {
                mT__70(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__71
                {
                mT__71(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__72
                {
                mT__72(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__73
                {
                mT__73(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__74
                {
                mT__74(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__75
                {
                mT__75(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__76
                {
                mT__76(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__77
                {
                mT__77(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__78
                {
                mT__78(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__79
                {
                mT__79(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__80
                {
                mT__80(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__81
                {
                mT__81(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__82
                {
                mT__82(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: T__83
                {
                mT__83(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:274: T__84
                {
                mT__84(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:280: T__85
                {
                mT__85(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:286: T__86
                {
                mT__86(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:292: T__87
                {
                mT__87(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:298: T__88
                {
                mT__88(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:304: T__89
                {
                mT__89(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:310: T__90
                {
                mT__90(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:316: T__91
                {
                mT__91(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:322: T__92
                {
                mT__92(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:328: RULE_UNICODE_DIGIT
                {
                mRULE_UNICODE_DIGIT(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:347: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:362: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:376: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:388: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:401: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:416: RULE_DECIMALS
                {
                mRULE_DECIMALS(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:430: RULE_UNICODE_VALUE
                {
                mRULE_UNICODE_VALUE(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:449: RULE_BYTE_VALUE
                {
                mRULE_BYTE_VALUE(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:465: RULE_RAW_STRING_LIT
                {
                mRULE_RAW_STRING_LIT(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:485: RULE_INTERPRETED_STRING_LIT
                {
                mRULE_INTERPRETED_STRING_LIT(); 

                }
                break;
            case 65 :
                // InternalGo.g:1:513: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // InternalGo.g:1:525: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 67 :
                // InternalGo.g:1:541: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // InternalGo.g:1:557: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 69 :
                // InternalGo.g:1:565: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA2_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\3\uffff\1\7\1\2\3\uffff\1\7\1\6\1\uffff\1\6\1\uffff\1\7\12\uffff\1\3\1\uffff\1\4\1\3\1\5\37\uffff\1\6\35\uffff\1\1",
            "\1\10",
            "\1\11",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "8253:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA3_eotS =
        "\3\uffff\1\7\1\11\5\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\41\2\uffff\2\75\5\uffff";
    static final String DFA3_maxS =
        "\1\76\2\uffff\2\75\5\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\4\1\3\1\6\1\5";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\30\uffff\1\5\1\uffff\1\3\1\1\1\4",
            "",
            "",
            "\1\6",
            "\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "8255:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' | ':=' )";
        }
    }
    static final String DFA15_eotS =
        "\6\uffff";
    static final String DFA15_eofS =
        "\6\uffff";
    static final String DFA15_minS =
        "\2\56\2\uffff\1\56\1\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\2\uffff\1\145\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\1";
    static final String DFA15_specialS =
        "\6\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\uffff\1\2\11\1",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "8279:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )";
        }
    }
    static final String DFA33_eotS =
        "\1\uffff\2\u0136\1\u0139\1\u013b\1\u013d\1\u013e\1\uffff\1\u0142\1\uffff\2\u013c\1\u0148\1\u0149\1\uffff\1\u014b\2\uffff\1\u0152\2\uffff\1\u0136\4\uffff\3\u0136\1\u0165\10\u0136\1\u016f\4\uffff\11\u0132\3\uffff\1\u0132\1\uffff\13\u0132\1\uffff\6\u0132\1\uffff\2\u0132\1\uffff\3\u0132\2\uffff\5\u0132\1\uffff\14\u0132\1\uffff\2\u0132\1\uffff\5\u0132\3\uffff\6\u0132\1\uffff\6\u0132\1\uffff\20\u0132\1\uffff\11\u0132\1\uffff\5\u0132\1\uffff\1\u0132\2\uffff\3\u0132\2\uffff\4\u0132\1\uffff\1\u0132\1\uffff\15\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\5\u0132\1\uffff\25\u0132\3\uffff\3\u0132\1\uffff\7\u0132\3\uffff\1\u0132\1\uffff\1\u0132\3\uffff\17\u0132\4\uffff\1\u0132\2\uffff\3\u0132\1\uffff\3\u0132\1\uffff\10\u0132\1\uffff\10\u0132\1\uffff\2\u0171\1\u0174\2\u0132\2\uffff\3\u0136\1\uffff\1\u0136\36\uffff\3\u0136\4\uffff\1\u0136\1\u0189\5\u0136\2\uffff\10\u0136\2\uffff\1\u0171\1\uffff\1\u0171\1\u0199\6\uffff\2\u0136\1\u01a2\1\u0136\7\uffff\4\u0136\1\uffff\1\u0136\1\u01a9\3\u0136\1\uffff\7\u0136\1\u01b6\10\uffff\1\u01bc\1\u0136\1\uffff\6\u0136\1\uffff\1\u01c4\2\u0136\1\u01c7\1\u01c8\3\u0136\1\u01cc\2\u0136\1\u01cf\7\uffff\7\u0136\1\uffff\1\u0136\1\u01dc\2\uffff\1\u0136\1\u01de\1\u01df\1\uffff\1\u01e0\1\u0136\5\uffff\2\u0136\1\u01e6\1\u01e7\1\u01e8\1\u0136\1\u01ea\1\u0136\1\uffff\1\u01ec\3\uffff\1\u0136\2\uffff\1\u0136\1\u01f1\3\uffff\1\u0136\1\uffff\1\u0136\1\uffff\1\u01f4\2\uffff\1\u0136\1\uffff\1\u0136\1\u01f8\2\uffff\1\u0136\1\u01fb\2\uffff\1\u0136\2\uffff\1\u01ff\2\uffff";
    static final String DFA33_eofS =
        "\u0200\uffff";
    static final String DFA33_minS =
        "\1\0\2\141\1\53\1\55\1\174\1\101\1\uffff\1\52\1\uffff\1\55\1\76\1\46\1\75\1\uffff\1\0\2\uffff\1\56\2\uffff\1\145\4\uffff\1\146\2\141\1\75\1\157\1\141\1\162\1\154\1\145\1\171\1\141\1\55\1\75\4\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\1\uffff\1\56\1\60\1\11\1\42\1\0\2\uffff\1\156\1\154\1\162\1\uffff\1\143\24\uffff\1\0\11\uffff\1\162\1\154\1\151\4\uffff\1\164\1\60\2\160\1\141\1\156\1\163\2\uffff\2\164\1\156\1\145\1\163\1\146\1\160\1\162\1\132\1\uffff\1\56\1\uffff\2\60\3\uffff\2\0\1\uffff\1\143\1\154\1\60\1\153\7\uffff\1\165\1\145\1\164\1\145\1\uffff\1\157\1\60\1\156\1\163\1\145\1\uffff\1\157\1\165\1\147\1\141\1\145\1\141\1\145\1\60\2\uffff\5\0\1\uffff\1\60\1\164\1\uffff\1\141\3\143\2\162\1\uffff\1\60\1\151\1\164\2\60\1\162\1\145\1\153\1\60\1\162\1\165\1\60\2\uffff\4\0\1\uffff\1\150\1\147\2\164\1\150\1\146\1\164\1\uffff\1\156\1\60\2\uffff\1\156\2\60\1\uffff\1\60\1\154\1\uffff\4\0\1\162\1\145\3\60\1\141\1\60\1\165\1\uffff\1\60\3\uffff\1\164\2\0\1\157\1\60\3\uffff\1\143\1\uffff\1\145\1\uffff\1\60\2\0\1\165\1\uffff\1\145\1\60\1\uffff\1\0\1\147\1\60\1\uffff\1\0\1\150\1\uffff\1\0\1\60\1\0\1\uffff";
    static final String DFA33_maxS =
        "\1\uffff\1\165\1\141\1\53\1\55\1\174\1\172\1\uffff\1\57\1\uffff\1\74\1\76\1\136\1\75\1\uffff\1\uffff\2\uffff\1\71\2\uffff\1\167\4\uffff\1\156\1\141\1\157\1\75\1\157\1\145\1\162\1\154\1\145\1\171\1\141\1\55\1\75\4\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\1\uffff\2\145\1\40\1\170\1\uffff\2\uffff\1\156\1\154\1\162\1\uffff\1\143\24\uffff\1\uffff\11\uffff\1\162\1\154\1\151\4\uffff\1\164\1\172\2\160\1\141\1\156\1\163\2\uffff\2\164\1\156\1\145\1\163\1\146\1\160\1\162\1\132\1\uffff\1\145\1\uffff\2\145\3\uffff\2\uffff\1\uffff\1\143\1\154\1\172\1\153\7\uffff\1\165\1\145\1\164\1\145\1\uffff\1\157\1\172\1\156\1\164\1\145\1\uffff\1\157\1\165\1\147\1\141\3\145\1\172\2\uffff\5\uffff\1\uffff\1\172\1\164\1\uffff\1\141\3\143\2\162\1\uffff\1\172\1\151\1\164\2\172\1\162\1\145\1\153\1\172\1\162\1\165\1\172\2\uffff\4\uffff\1\uffff\1\150\1\147\2\164\1\150\1\146\1\164\1\uffff\1\156\1\172\2\uffff\1\156\2\172\1\uffff\1\172\1\154\1\uffff\4\uffff\1\162\1\145\3\172\1\141\1\172\1\165\1\uffff\1\172\3\uffff\1\164\2\uffff\1\157\1\172\3\uffff\1\143\1\uffff\1\145\1\uffff\1\172\2\uffff\1\165\1\uffff\1\145\1\172\1\uffff\1\uffff\1\147\1\172\1\uffff\1\uffff\1\150\1\uffff\1\uffff\1\172\1\uffff\1\uffff";
    static final String DFA33_acceptS =
        "\7\uffff\1\7\1\uffff\1\11\4\uffff\1\17\1\uffff\1\21\1\22\1\uffff\1\24\1\25\1\uffff\1\27\1\30\1\31\1\32\15\uffff\4\71\11\uffff\3\71\1\uffff\1\71\13\uffff\1\71\6\uffff\1\71\2\uffff\1\71\3\uffff\2\71\5\uffff\1\71\14\uffff\1\71\2\uffff\1\71\5\uffff\3\71\6\uffff\1\71\6\uffff\1\71\20\uffff\1\71\11\uffff\1\71\5\uffff\1\71\1\uffff\2\71\3\uffff\2\71\4\uffff\1\71\1\uffff\1\71\15\uffff\1\71\2\uffff\1\71\2\uffff\1\71\2\uffff\1\71\2\uffff\1\71\5\uffff\1\71\25\uffff\3\71\3\uffff\1\71\7\uffff\3\71\1\uffff\1\71\1\uffff\3\71\17\uffff\4\71\1\uffff\2\71\3\uffff\1\71\3\uffff\1\71\10\uffff\1\71\10\uffff\1\71\5\uffff\1\104\1\105\3\uffff\1\71\1\uffff\1\56\1\3\1\57\1\4\1\67\1\5\1\6\1\7\1\102\1\103\1\10\1\11\1\12\1\37\1\13\1\15\1\14\1\16\1\17\1\20\1\uffff\1\77\1\101\1\21\1\22\1\33\1\23\1\73\1\24\1\25\3\uffff\1\27\1\30\1\31\1\32\7\uffff\1\60\1\40\11\uffff\1\70\1\uffff\1\72\2\uffff\1\75\1\104\1\76\2\uffff\1\100\4\uffff\1\56\1\57\1\12\1\37\1\13\1\15\1\77\4\uffff\1\45\5\uffff\1\60\10\uffff\1\66\1\74\5\uffff\1\100\2\uffff\1\51\6\uffff\1\35\14\uffff\1\55\1\66\4\uffff\1\1\7\uffff\1\36\2\uffff\1\62\1\41\3\uffff\1\46\2\uffff\1\54\14\uffff\1\53\1\uffff\1\64\1\43\1\52\5\uffff\1\26\1\50\1\61\1\uffff\1\65\1\uffff\1\42\4\uffff\1\2\2\uffff\1\63\3\uffff\1\44\2\uffff\1\34\3\uffff\1\47";
    static final String DFA33_specialS =
        "\1\20\16\uffff\1\21\u0120\uffff\1\27\33\uffff\1\22\52\uffff\1\32\1\31\41\uffff\1\3\1\5\1\26\1\2\1\0\31\uffff\1\6\1\11\1\4\1\1\24\uffff\1\7\1\12\1\25\1\23\16\uffff\1\10\1\13\12\uffff\1\24\1\14\5\uffff\1\15\3\uffff\1\16\2\uffff\1\17\1\uffff\1\30\1\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\u0132\1\u0131\1\u012e\2\u0132\1\u0131\22\u0132\1\u0131\1\46\1\u0130\2\u0132\1\11\1\14\1\17\1\20\1\21\1\7\1\3\1\31\1\4\1\22\1\10\1\u012d\11\u012c\1\35\1\27\1\12\1\15\1\13\2\u0132\1\45\31\u012b\1\23\1\u012f\1\24\1\6\1\u012b\1\u0132\1\47\1\40\1\34\1\42\1\41\1\1\1\36\1\u012b\1\32\3\u012b\1\33\2\u012b\1\2\1\u012b\1\37\1\25\1\43\1\u012b\1\44\4\u012b\1\26\1\5\1\30\54\u0132\1\50\12\u0132\1\51\4\u0132\1\52\5\u0132\1\53\27\u0132\1\54\26\u0132\1\16\10\u0132\1\55\u0129\u0132\1\56\55\u0132\1\57\137\u0132\1\60\12\u0132\1\61\24\u0132\1\62\17\u0132\1\63\15\u0132\1\64\u008b\u0132\1\65\13\u0132\1\66\1\u0132\1\67\3\u0132\1\70\1\u0132\1\71\24\u0132\1\72\54\u0132\1\73\11\u0132\1\74\45\u0132\1\75\u008b\u0132\1\76\72\u0132\1\77\3\u0132\1\100\4\u0132\1\101\47\u0132\1\102\70\u0132\1\103\47\u0132\1\104\7\u0132\1\105\156\u0132\1\106\37\u0132\1\107\60\u0132\1\110\36\u0132\1\111\60\u0132\1\112\143\u0132\1\113\17\u0132\1\114\24\u0132\1\115\25\u0132\1\116\1\u0132\1\117\155\u0132\1\120\u0184\u0132\1\121\67\u0132\1\122\22\u0132\1\123\7\u0132\1\124\54\u0132\1\125\11\u0132\1\126\3\u0132\1\127\26\u0132\1\130\7\u0132\1\131\3\u0132\1\132\45\u0132\1\133\2\u0132\1\134\20\u0132\1\135\24\u0132\1\136\11\u0132\1\137\3\u0132\1\140\26\u0132\1\141\7\u0132\1\142\2\u0132\1\143\2\u0132\1\144\40\u0132\1\145\4\u0132\1\146\23\u0132\1\147\22\u0132\1\150\7\u0132\1\151\1\u0132\1\152\3\u0132\1\153\26\u0132\1\154\7\u0132\1\155\2\u0132\1\156\7\u0132\1\157\22\u0132\1\160\17\u0132\1\161\44\u0132\1\162\11\u0132\1\163\3\u0132\1\164\26\u0132\1\165\7\u0132\1\166\3\u0132\1\167\6\u0132\1\170\36\u0132\1\171\2\u0132\1\172\45\u0132\1\173\10\u0132\1\174\3\u0132\1\175\6\u0132\1\176\2\u0132\1\177\1\u0132\1\u0080\4\u0132\1\u0081\4\u0132\1\u0082\5\u0132\1\u0083\10\u0132\1\u0084\115\u0132\1\u0085\10\u0132\1\u0086\3\u0132\1\u0087\27\u0132\1\u0088\12\u0132\1\u0089\52\u0132\1\u008a\44\u0132\1\u008b\10\u0132\1\u008c\3\u0132\1\u008d\27\u0132\1\u008e\12\u0132\1\u008f\50\u0132\1\u0090\1\u0132\1\u0091\44\u0132\1\u0092\10\u0132\1\u0093\3\u0132\1\u0094\27\u0132\1\u0095\65\u0132\1\u0096\44\u0132\1\u0097\24\u0132\1\u0098\30\u0132\1\u0099\11\u0132\1\u009a\2\u0132\1\u009b\100\u0132\1\u009c\60\u0132\1\u009d\15\u0132\1\u009e\100\u0132\1\u009f\2\u0132\1\u00a0\2\u0132\1\u00a1\2\u0132\1\u00a2\2\u0132\1\u00a3\6\u0132\1\u00a4\4\u0132\1\u00a5\7\u0132\1\u00a6\3\u0132\1\u00a7\1\u0132\1\u00a8\2\u0132\1\u00a9\2\u0132\1\u00aa\4\u0132\1\u00ab\12\u0132\1\u00ac\10\u0132\1\u00ad\25\u0132\1\u00ae\43\u0132\1\u00af\77\u0132\1\u00b0\107\u0132\1\u00b1\167\u0132\1\u00b2\42\u0132\1\u00b3\5\u0132\1\u00b4\46\u0132\1\u00b5\117\u0132\1\u00b6\57\u0132\1\u00b7\57\u0132\1\u00b8\136\u0132\1\u00b9\110\u0132\1\u00ba\127\u0132\1\u00bb\7\u0132\1\u00bc\77\u0132\1\u00bd\1\u0132\1\u00be\5\u0132\1\u00bf\7\u0132\1\u00c0\1\u0132\1\u00c1\5\u0132\1\u00c2\47\u0132\1\u00c3\1\u0132\1\u00c4\5\u0132\1\u00c5\37\u0132\1\u00c6\1\u0132\1\u00c7\5\u0132\1\u00c8\7\u0132\1\u00c9\1\u0132\1\u00ca\5\u0132\1\u00cb\7\u0132\1\u00cc\7\u0132\1\u00cd\27\u0132\1\u00ce\37\u0132\1\u00cf\1\u0132\1\u00d0\5\u0132\1\u00d1\7\u0132\1\u00d2\47\u0132\1\u00d3\127\u0132\1\u00d4\20\u0132\1\u00d5\117\u0132\1\u00d6\u027f\u0132\1\u00d7\36\u0132\1\u00d8\u00df\u0132\1\u00d9\u009f\u0132\1\u00da\137\u0132\1\u00db\u057f\u0132\1\u00dc\u009f\u0132\1\u00dd\100\u0132\1\u00de\36\u0132\1\u00df\27\u0132\1\u00e0\7\u0132\1\u00e1\31\u0132\1\u00e2\15\u0132\1\u00e3\7\u0132\1\u00e4\10\u0132\1\u00e5\1\u0132\1\u00e6\1\u0132\1\u00e7\1\u0132\1\u00e8\40\u0132\1\u00e9\65\u0132\1\u00ea\7\u0132\1\u00eb\3\u0132\1\u00ec\3\u0132\1\u00ed\11\u0132\1\u00ee\5\u0132\1\u00ef\11\u0132\1\u00f0\21\u0132\1\u00f1\3\u0132\1\u00f2\u0088\u0132\1\u00f3\u0082\u0132\1\u00f4\4\u0132\1\u00f5\2\u0132\1\u00f6\12\u0132\1\u00f7\3\u0132\1\u00f8\12\u0132\1\u00f9\1\u0132\1\u00fa\1\u0132\1\u00fb\1\u0132\1\u00fc\4\u0132\1\u00fd\3\u0132\1\u00fe\54\u0132\1\u00ff\u0ea4\u0132\1\u0100\33\u0132\1\u0101\17\u0132\1\u0102\6\u0132\1\u0103\10\u0132\1\u0104\133\u0132\1\u0105\3\u0132\1\u0106\132\u0132\1\u0107\10\u0132\1\u0108\53\u0132\1\u0109\156\u0132\1\u010a\u025f\u0132\1\u010b\u19b4\u0132\1\u010c\112\u0132\1\u010d\u51a4\u0132\1\u010e\132\u0132\1\u010f\u0bff\u0132\1\u0110\u2ba2\u0132\1\u0111\u215c\u0132\1\u0112\u01ff\u0132\1\u0113\22\u0132\1\u0114\11\u0132\1\u0115\1\u0132\1\u0116\12\u0132\1\u0117\15\u0132\1\u0118\5\u0132\1\u0119\1\u0132\1\u011a\2\u0132\1\u011b\2\u0132\1\u011c\u008c\u0132\1\u011d\u017c\u0132\1\u011e\101\u0132\1\u011f\135\u0132\1\u0120\177\u0132\1\u0121\3\u0132\1\u0122\1\u0132\1\u0123\u00aa\u0132\1\u0124\37\u0132\1\u0125\44\u0132\1\u0126\133\u0132\1\u0127\7\u0132\1\u0128\7\u0132\1\u0129\7\u0132\1\u012a\45\u0132",
            "\1\u0134\15\uffff\1\u0135\5\uffff\1\u0133",
            "\1\u0137",
            "\1\u0138",
            "\1\u013a",
            "\1\u013c",
            "\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\1\u0140\4\uffff\1\u0141",
            "",
            "\1\u0145\16\uffff\1\u0144",
            "\1\u0146",
            "\1\u013c\67\uffff\1\u0147",
            "\1\u013c",
            "",
            "\12\u014e\1\u014c\34\u014e\1\u014d\uffd8\u014e",
            "",
            "",
            "\1\u0151\1\uffff\12\u0153",
            "",
            "",
            "\1\u0157\16\uffff\1\u0156\2\uffff\1\u0158",
            "",
            "",
            "",
            "",
            "\1\u015e\6\uffff\1\u015f\1\u015d",
            "\1\u0160",
            "\1\u0163\6\uffff\1\u0161\6\uffff\1\u0162",
            "\1\u0164",
            "\1\u0166",
            "\1\u0168\3\uffff\1\u0167",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u013c",
            "",
            "",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "",
            "\1\u0136",
            "",
            "\1\u0136",
            "",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "",
            "",
            "",
            "\1\u0136",
            "",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "\1\u0136",
            "",
            "\1\u0153\1\uffff\12\u0170\13\uffff\1\u0153\37\uffff\1\u0153",
            "\10\u0172\2\u0173\13\uffff\1\u0153\37\uffff\1\u0153",
            "\2\u0175\2\uffff\1\u0175\22\uffff\1\u0175",
            "\1\u0174\4\uffff\1\u0174\10\uffff\10\u0176\35\uffff\1\u0174\6\uffff\1\u0174\4\uffff\2\u0174\3\uffff\1\u0174\7\uffff\1\u0174\3\uffff\1\u0174\1\uffff\3\u0174\1\uffff\1\u0176",
            "\12\u014e\1\u0177\27\u014e\1\u0179\71\u014e\1\u0178\uffa3\u014e",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\u017d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u014e\1\u014d\uffd8\u014e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "",
            "",
            "\1\u0188",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0153\1\uffff\12\u0170\13\uffff\1\u0153\37\uffff\1\u0153",
            "",
            "\10\u0172\2\u0173\13\uffff\1\u0153\37\uffff\1\u0153",
            "\12\u0173\13\uffff\1\u0153\37\uffff\1\u0153",
            "",
            "",
            "",
            "\42\u014e\1\u0179\uffdd\u014e",
            "\42\u014e\1\u019c\4\u014e\1\u019c\10\u014e\10\u019e\35\u014e\1\u019b\6\u014e\1\u019c\4\u014e\2\u019c\3\u014e\1\u019c\7\u014e\1\u019c\3\u014e\1\u019c\1\u014e\1\u019c\1\u019a\1\u019c\1\u014e\1\u019d\uff87\u014e",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01aa",
            "\1\u01ac\1\u01ab",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b4\3\uffff\1\u01b3",
            "\1\u01b5",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "\60\u014e\12\u01b8\7\u014e\6\u01b8\32\u014e\6\u01b8\uff99\u014e",
            "\60\u014e\12\u01b9\7\u014e\6\u01b9\32\u014e\6\u01b9\uff99\u014e",
            "\42\u014e\1\u0179\uffdd\u014e",
            "\60\u014e\12\u01ba\7\u014e\6\u01ba\32\u014e\6\u01ba\uff99\u014e",
            "\60\u014e\10\u01bb\uffc8\u014e",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01c5",
            "\1\u01c6",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01cd",
            "\1\u01ce",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "\60\u014e\12\u01d0\7\u014e\6\u01d0\32\u014e\6\u01d0\uff99\u014e",
            "\60\u014e\12\u01d1\7\u014e\6\u01d1\32\u014e\6\u01d1\uff99\u014e",
            "\60\u014e\12\u01d2\7\u014e\6\u01d2\32\u014e\6\u01d2\uff99\u014e",
            "\60\u014e\10\u01d3\uffc8\u014e",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\1\u01db",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "\1\u01dd",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01e1",
            "",
            "\60\u014e\12\u01e2\7\u014e\6\u01e2\32\u014e\6\u01e2\uff99\u014e",
            "\60\u014e\12\u01e3\7\u014e\6\u01e3\32\u014e\6\u01e3\uff99\u014e",
            "\42\u014e\1\u0179\uffdd\u014e",
            "\42\u014e\1\u0179\uffdd\u014e",
            "\1\u01e4",
            "\1\u01e5",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01e9",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01eb",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "",
            "\1\u01ed",
            "\60\u014e\12\u01ee\7\u014e\6\u01ee\32\u014e\6\u01ee\uff99\u014e",
            "\60\u014e\12\u01ef\7\u014e\6\u01ef\32\u014e\6\u01ef\uff99\u014e",
            "\1\u01f0",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "",
            "\1\u01f2",
            "",
            "\1\u01f3",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\42\u014e\1\u0179\uffdd\u014e",
            "\60\u014e\12\u01f5\7\u014e\6\u01f5\32\u014e\6\u01f5\uff99\u014e",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u014e\12\u01f9\7\u014e\6\u01f9\32\u014e\6\u01f9\uff99\u014e",
            "\1\u01fa",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u014e\12\u01fc\7\u014e\6\u01fc\32\u014e\6\u01fc\uff99\u014e",
            "\1\u01fd",
            "",
            "\60\u014e\12\u01fe\7\u014e\6\u01fe\32\u014e\6\u01fe\uff99\u014e",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\42\u014e\1\u0179\uffdd\u014e",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | RULE_UNICODE_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_LETTER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_414 = input.LA(1);

                        s = -1;
                        if ( ((LA33_414>='\u0000' && LA33_414<='/')||(LA33_414>='8' && LA33_414<='\uFFFF')) ) {s = 334;}

                        else if ( ((LA33_414>='0' && LA33_414<='7')) ) {s = 443;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_443 = input.LA(1);

                        s = -1;
                        if ( ((LA33_443>='0' && LA33_443<='7')) ) {s = 467;}

                        else if ( ((LA33_443>='\u0000' && LA33_443<='/')||(LA33_443>='8' && LA33_443<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_413 = input.LA(1);

                        s = -1;
                        if ( ((LA33_413>='\u0000' && LA33_413<='/')||(LA33_413>=':' && LA33_413<='@')||(LA33_413>='G' && LA33_413<='`')||(LA33_413>='g' && LA33_413<='\uFFFF')) ) {s = 334;}

                        else if ( ((LA33_413>='0' && LA33_413<='9')||(LA33_413>='A' && LA33_413<='F')||(LA33_413>='a' && LA33_413<='f')) ) {s = 442;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_410 = input.LA(1);

                        s = -1;
                        if ( ((LA33_410>='0' && LA33_410<='9')||(LA33_410>='A' && LA33_410<='F')||(LA33_410>='a' && LA33_410<='f')) ) {s = 440;}

                        else if ( ((LA33_410>='\u0000' && LA33_410<='/')||(LA33_410>=':' && LA33_410<='@')||(LA33_410>='G' && LA33_410<='`')||(LA33_410>='g' && LA33_410<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_442 = input.LA(1);

                        s = -1;
                        if ( ((LA33_442>='0' && LA33_442<='9')||(LA33_442>='A' && LA33_442<='F')||(LA33_442>='a' && LA33_442<='f')) ) {s = 466;}

                        else if ( ((LA33_442>='\u0000' && LA33_442<='/')||(LA33_442>=':' && LA33_442<='@')||(LA33_442>='G' && LA33_442<='`')||(LA33_442>='g' && LA33_442<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_411 = input.LA(1);

                        s = -1;
                        if ( ((LA33_411>='0' && LA33_411<='9')||(LA33_411>='A' && LA33_411<='F')||(LA33_411>='a' && LA33_411<='f')) ) {s = 441;}

                        else if ( ((LA33_411>='\u0000' && LA33_411<='/')||(LA33_411>=':' && LA33_411<='@')||(LA33_411>='G' && LA33_411<='`')||(LA33_411>='g' && LA33_411<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_440 = input.LA(1);

                        s = -1;
                        if ( ((LA33_440>='0' && LA33_440<='9')||(LA33_440>='A' && LA33_440<='F')||(LA33_440>='a' && LA33_440<='f')) ) {s = 464;}

                        else if ( ((LA33_440>='\u0000' && LA33_440<='/')||(LA33_440>=':' && LA33_440<='@')||(LA33_440>='G' && LA33_440<='`')||(LA33_440>='g' && LA33_440<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_464 = input.LA(1);

                        s = -1;
                        if ( ((LA33_464>='0' && LA33_464<='9')||(LA33_464>='A' && LA33_464<='F')||(LA33_464>='a' && LA33_464<='f')) ) {s = 482;}

                        else if ( ((LA33_464>='\u0000' && LA33_464<='/')||(LA33_464>=':' && LA33_464<='@')||(LA33_464>='G' && LA33_464<='`')||(LA33_464>='g' && LA33_464<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA33_482 = input.LA(1);

                        s = -1;
                        if ( ((LA33_482>='0' && LA33_482<='9')||(LA33_482>='A' && LA33_482<='F')||(LA33_482>='a' && LA33_482<='f')) ) {s = 494;}

                        else if ( ((LA33_482>='\u0000' && LA33_482<='/')||(LA33_482>=':' && LA33_482<='@')||(LA33_482>='G' && LA33_482<='`')||(LA33_482>='g' && LA33_482<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA33_441 = input.LA(1);

                        s = -1;
                        if ( ((LA33_441>='0' && LA33_441<='9')||(LA33_441>='A' && LA33_441<='F')||(LA33_441>='a' && LA33_441<='f')) ) {s = 465;}

                        else if ( ((LA33_441>='\u0000' && LA33_441<='/')||(LA33_441>=':' && LA33_441<='@')||(LA33_441>='G' && LA33_441<='`')||(LA33_441>='g' && LA33_441<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA33_465 = input.LA(1);

                        s = -1;
                        if ( ((LA33_465>='0' && LA33_465<='9')||(LA33_465>='A' && LA33_465<='F')||(LA33_465>='a' && LA33_465<='f')) ) {s = 483;}

                        else if ( ((LA33_465>='\u0000' && LA33_465<='/')||(LA33_465>=':' && LA33_465<='@')||(LA33_465>='G' && LA33_465<='`')||(LA33_465>='g' && LA33_465<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA33_483 = input.LA(1);

                        s = -1;
                        if ( ((LA33_483>='0' && LA33_483<='9')||(LA33_483>='A' && LA33_483<='F')||(LA33_483>='a' && LA33_483<='f')) ) {s = 495;}

                        else if ( ((LA33_483>='\u0000' && LA33_483<='/')||(LA33_483>=':' && LA33_483<='@')||(LA33_483>='G' && LA33_483<='`')||(LA33_483>='g' && LA33_483<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA33_495 = input.LA(1);

                        s = -1;
                        if ( ((LA33_495>='0' && LA33_495<='9')||(LA33_495>='A' && LA33_495<='F')||(LA33_495>='a' && LA33_495<='f')) ) {s = 501;}

                        else if ( ((LA33_495>='\u0000' && LA33_495<='/')||(LA33_495>=':' && LA33_495<='@')||(LA33_495>='G' && LA33_495<='`')||(LA33_495>='g' && LA33_495<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA33_501 = input.LA(1);

                        s = -1;
                        if ( ((LA33_501>='0' && LA33_501<='9')||(LA33_501>='A' && LA33_501<='F')||(LA33_501>='a' && LA33_501<='f')) ) {s = 505;}

                        else if ( ((LA33_501>='\u0000' && LA33_501<='/')||(LA33_501>=':' && LA33_501<='@')||(LA33_501>='G' && LA33_501<='`')||(LA33_501>='g' && LA33_501<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA33_505 = input.LA(1);

                        s = -1;
                        if ( ((LA33_505>='0' && LA33_505<='9')||(LA33_505>='A' && LA33_505<='F')||(LA33_505>='a' && LA33_505<='f')) ) {s = 508;}

                        else if ( ((LA33_505>='\u0000' && LA33_505<='/')||(LA33_505>=':' && LA33_505<='@')||(LA33_505>='G' && LA33_505<='`')||(LA33_505>='g' && LA33_505<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA33_508 = input.LA(1);

                        s = -1;
                        if ( ((LA33_508>='0' && LA33_508<='9')||(LA33_508>='A' && LA33_508<='F')||(LA33_508>='a' && LA33_508<='f')) ) {s = 510;}

                        else if ( ((LA33_508>='\u0000' && LA33_508<='/')||(LA33_508>=':' && LA33_508<='@')||(LA33_508>='G' && LA33_508<='`')||(LA33_508>='g' && LA33_508<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA33_0 = input.LA(1);

                        s = -1;
                        if ( (LA33_0=='f') ) {s = 1;}

                        else if ( (LA33_0=='p') ) {s = 2;}

                        else if ( (LA33_0=='+') ) {s = 3;}

                        else if ( (LA33_0=='-') ) {s = 4;}

                        else if ( (LA33_0=='|') ) {s = 5;}

                        else if ( (LA33_0=='^') ) {s = 6;}

                        else if ( (LA33_0=='*') ) {s = 7;}

                        else if ( (LA33_0=='/') ) {s = 8;}

                        else if ( (LA33_0=='%') ) {s = 9;}

                        else if ( (LA33_0=='<') ) {s = 10;}

                        else if ( (LA33_0=='>') ) {s = 11;}

                        else if ( (LA33_0=='&') ) {s = 12;}

                        else if ( (LA33_0=='=') ) {s = 13;}

                        else if ( (LA33_0=='\u00EF') ) {s = 14;}

                        else if ( (LA33_0=='\'') ) {s = 15;}

                        else if ( (LA33_0=='(') ) {s = 16;}

                        else if ( (LA33_0==')') ) {s = 17;}

                        else if ( (LA33_0=='.') ) {s = 18;}

                        else if ( (LA33_0=='[') ) {s = 19;}

                        else if ( (LA33_0==']') ) {s = 20;}

                        else if ( (LA33_0=='s') ) {s = 21;}

                        else if ( (LA33_0=='{') ) {s = 22;}

                        else if ( (LA33_0==';') ) {s = 23;}

                        else if ( (LA33_0=='}') ) {s = 24;}

                        else if ( (LA33_0==',') ) {s = 25;}

                        else if ( (LA33_0=='i') ) {s = 26;}

                        else if ( (LA33_0=='m') ) {s = 27;}

                        else if ( (LA33_0=='c') ) {s = 28;}

                        else if ( (LA33_0==':') ) {s = 29;}

                        else if ( (LA33_0=='g') ) {s = 30;}

                        else if ( (LA33_0=='r') ) {s = 31;}

                        else if ( (LA33_0=='b') ) {s = 32;}

                        else if ( (LA33_0=='e') ) {s = 33;}

                        else if ( (LA33_0=='d') ) {s = 34;}

                        else if ( (LA33_0=='t') ) {s = 35;}

                        else if ( (LA33_0=='v') ) {s = 36;}

                        else if ( (LA33_0=='A') ) {s = 37;}

                        else if ( (LA33_0=='!') ) {s = 38;}

                        else if ( (LA33_0=='a') ) {s = 39;}

                        else if ( (LA33_0=='\u00AA') ) {s = 40;}

                        else if ( (LA33_0=='\u00B5') ) {s = 41;}

                        else if ( (LA33_0=='\u00BA') ) {s = 42;}

                        else if ( (LA33_0=='\u00C0') ) {s = 43;}

                        else if ( (LA33_0=='\u00D8') ) {s = 44;}

                        else if ( (LA33_0=='\u00F8') ) {s = 45;}

                        else if ( (LA33_0=='\u0222') ) {s = 46;}

                        else if ( (LA33_0=='\u0250') ) {s = 47;}

                        else if ( (LA33_0=='\u02B0') ) {s = 48;}

                        else if ( (LA33_0=='\u02BB') ) {s = 49;}

                        else if ( (LA33_0=='\u02D0') ) {s = 50;}

                        else if ( (LA33_0=='\u02E0') ) {s = 51;}

                        else if ( (LA33_0=='\u02EE') ) {s = 52;}

                        else if ( (LA33_0=='\u037A') ) {s = 53;}

                        else if ( (LA33_0=='\u0386') ) {s = 54;}

                        else if ( (LA33_0=='\u0388') ) {s = 55;}

                        else if ( (LA33_0=='\u038C') ) {s = 56;}

                        else if ( (LA33_0=='\u038E') ) {s = 57;}

                        else if ( (LA33_0=='\u03A3') ) {s = 58;}

                        else if ( (LA33_0=='\u03D0') ) {s = 59;}

                        else if ( (LA33_0=='\u03DA') ) {s = 60;}

                        else if ( (LA33_0=='\u0400') ) {s = 61;}

                        else if ( (LA33_0=='\u048C') ) {s = 62;}

                        else if ( (LA33_0=='\u04C7') ) {s = 63;}

                        else if ( (LA33_0=='\u04CB') ) {s = 64;}

                        else if ( (LA33_0=='\u04D0') ) {s = 65;}

                        else if ( (LA33_0=='\u04F8') ) {s = 66;}

                        else if ( (LA33_0=='\u0531') ) {s = 67;}

                        else if ( (LA33_0=='\u0559') ) {s = 68;}

                        else if ( (LA33_0=='\u0561') ) {s = 69;}

                        else if ( (LA33_0=='\u05D0') ) {s = 70;}

                        else if ( (LA33_0=='\u05F0') ) {s = 71;}

                        else if ( (LA33_0=='\u0621') ) {s = 72;}

                        else if ( (LA33_0=='\u0640') ) {s = 73;}

                        else if ( (LA33_0=='\u0671') ) {s = 74;}

                        else if ( (LA33_0=='\u06D5') ) {s = 75;}

                        else if ( (LA33_0=='\u06E5') ) {s = 76;}

                        else if ( (LA33_0=='\u06FA') ) {s = 77;}

                        else if ( (LA33_0=='\u0710') ) {s = 78;}

                        else if ( (LA33_0=='\u0712') ) {s = 79;}

                        else if ( (LA33_0=='\u0780') ) {s = 80;}

                        else if ( (LA33_0=='\u0905') ) {s = 81;}

                        else if ( (LA33_0=='\u093D') ) {s = 82;}

                        else if ( (LA33_0=='\u0950') ) {s = 83;}

                        else if ( (LA33_0=='\u0958') ) {s = 84;}

                        else if ( (LA33_0=='\u0985') ) {s = 85;}

                        else if ( (LA33_0=='\u098F') ) {s = 86;}

                        else if ( (LA33_0=='\u0993') ) {s = 87;}

                        else if ( (LA33_0=='\u09AA') ) {s = 88;}

                        else if ( (LA33_0=='\u09B2') ) {s = 89;}

                        else if ( (LA33_0=='\u09B6') ) {s = 90;}

                        else if ( (LA33_0=='\u09DC') ) {s = 91;}

                        else if ( (LA33_0=='\u09DF') ) {s = 92;}

                        else if ( (LA33_0=='\u09F0') ) {s = 93;}

                        else if ( (LA33_0=='\u0A05') ) {s = 94;}

                        else if ( (LA33_0=='\u0A0F') ) {s = 95;}

                        else if ( (LA33_0=='\u0A13') ) {s = 96;}

                        else if ( (LA33_0=='\u0A2A') ) {s = 97;}

                        else if ( (LA33_0=='\u0A32') ) {s = 98;}

                        else if ( (LA33_0=='\u0A35') ) {s = 99;}

                        else if ( (LA33_0=='\u0A38') ) {s = 100;}

                        else if ( (LA33_0=='\u0A59') ) {s = 101;}

                        else if ( (LA33_0=='\u0A5E') ) {s = 102;}

                        else if ( (LA33_0=='\u0A72') ) {s = 103;}

                        else if ( (LA33_0=='\u0A85') ) {s = 104;}

                        else if ( (LA33_0=='\u0A8D') ) {s = 105;}

                        else if ( (LA33_0=='\u0A8F') ) {s = 106;}

                        else if ( (LA33_0=='\u0A93') ) {s = 107;}

                        else if ( (LA33_0=='\u0AAA') ) {s = 108;}

                        else if ( (LA33_0=='\u0AB2') ) {s = 109;}

                        else if ( (LA33_0=='\u0AB5') ) {s = 110;}

                        else if ( (LA33_0=='\u0ABD') ) {s = 111;}

                        else if ( (LA33_0=='\u0AD0') ) {s = 112;}

                        else if ( (LA33_0=='\u0AE0') ) {s = 113;}

                        else if ( (LA33_0=='\u0B05') ) {s = 114;}

                        else if ( (LA33_0=='\u0B0F') ) {s = 115;}

                        else if ( (LA33_0=='\u0B13') ) {s = 116;}

                        else if ( (LA33_0=='\u0B2A') ) {s = 117;}

                        else if ( (LA33_0=='\u0B32') ) {s = 118;}

                        else if ( (LA33_0=='\u0B36') ) {s = 119;}

                        else if ( (LA33_0=='\u0B3D') ) {s = 120;}

                        else if ( (LA33_0=='\u0B5C') ) {s = 121;}

                        else if ( (LA33_0=='\u0B5F') ) {s = 122;}

                        else if ( (LA33_0=='\u0B85') ) {s = 123;}

                        else if ( (LA33_0=='\u0B8E') ) {s = 124;}

                        else if ( (LA33_0=='\u0B92') ) {s = 125;}

                        else if ( (LA33_0=='\u0B99') ) {s = 126;}

                        else if ( (LA33_0=='\u0B9C') ) {s = 127;}

                        else if ( (LA33_0=='\u0B9E') ) {s = 128;}

                        else if ( (LA33_0=='\u0BA3') ) {s = 129;}

                        else if ( (LA33_0=='\u0BA8') ) {s = 130;}

                        else if ( (LA33_0=='\u0BAE') ) {s = 131;}

                        else if ( (LA33_0=='\u0BB7') ) {s = 132;}

                        else if ( (LA33_0=='\u0C05') ) {s = 133;}

                        else if ( (LA33_0=='\u0C0E') ) {s = 134;}

                        else if ( (LA33_0=='\u0C12') ) {s = 135;}

                        else if ( (LA33_0=='\u0C2A') ) {s = 136;}

                        else if ( (LA33_0=='\u0C35') ) {s = 137;}

                        else if ( (LA33_0=='\u0C60') ) {s = 138;}

                        else if ( (LA33_0=='\u0C85') ) {s = 139;}

                        else if ( (LA33_0=='\u0C8E') ) {s = 140;}

                        else if ( (LA33_0=='\u0C92') ) {s = 141;}

                        else if ( (LA33_0=='\u0CAA') ) {s = 142;}

                        else if ( (LA33_0=='\u0CB5') ) {s = 143;}

                        else if ( (LA33_0=='\u0CDE') ) {s = 144;}

                        else if ( (LA33_0=='\u0CE0') ) {s = 145;}

                        else if ( (LA33_0=='\u0D05') ) {s = 146;}

                        else if ( (LA33_0=='\u0D0E') ) {s = 147;}

                        else if ( (LA33_0=='\u0D12') ) {s = 148;}

                        else if ( (LA33_0=='\u0D2A') ) {s = 149;}

                        else if ( (LA33_0=='\u0D60') ) {s = 150;}

                        else if ( (LA33_0=='\u0D85') ) {s = 151;}

                        else if ( (LA33_0=='\u0D9A') ) {s = 152;}

                        else if ( (LA33_0=='\u0DB3') ) {s = 153;}

                        else if ( (LA33_0=='\u0DBD') ) {s = 154;}

                        else if ( (LA33_0=='\u0DC0') ) {s = 155;}

                        else if ( (LA33_0=='\u0E01') ) {s = 156;}

                        else if ( (LA33_0=='\u0E32') ) {s = 157;}

                        else if ( (LA33_0=='\u0E40') ) {s = 158;}

                        else if ( (LA33_0=='\u0E81') ) {s = 159;}

                        else if ( (LA33_0=='\u0E84') ) {s = 160;}

                        else if ( (LA33_0=='\u0E87') ) {s = 161;}

                        else if ( (LA33_0=='\u0E8A') ) {s = 162;}

                        else if ( (LA33_0=='\u0E8D') ) {s = 163;}

                        else if ( (LA33_0=='\u0E94') ) {s = 164;}

                        else if ( (LA33_0=='\u0E99') ) {s = 165;}

                        else if ( (LA33_0=='\u0EA1') ) {s = 166;}

                        else if ( (LA33_0=='\u0EA5') ) {s = 167;}

                        else if ( (LA33_0=='\u0EA7') ) {s = 168;}

                        else if ( (LA33_0=='\u0EAA') ) {s = 169;}

                        else if ( (LA33_0=='\u0EAD') ) {s = 170;}

                        else if ( (LA33_0=='\u0EB2') ) {s = 171;}

                        else if ( (LA33_0=='\u0EBD') ) {s = 172;}

                        else if ( (LA33_0=='\u0EC6') ) {s = 173;}

                        else if ( (LA33_0=='\u0EDC') ) {s = 174;}

                        else if ( (LA33_0=='\u0F00') ) {s = 175;}

                        else if ( (LA33_0=='\u0F40') ) {s = 176;}

                        else if ( (LA33_0=='\u0F88') ) {s = 177;}

                        else if ( (LA33_0=='\u1000') ) {s = 178;}

                        else if ( (LA33_0=='\u1023') ) {s = 179;}

                        else if ( (LA33_0=='\u1029') ) {s = 180;}

                        else if ( (LA33_0=='\u1050') ) {s = 181;}

                        else if ( (LA33_0=='\u10A0') ) {s = 182;}

                        else if ( (LA33_0=='\u10D0') ) {s = 183;}

                        else if ( (LA33_0=='\u1100') ) {s = 184;}

                        else if ( (LA33_0=='\u115F') ) {s = 185;}

                        else if ( (LA33_0=='\u11A8') ) {s = 186;}

                        else if ( (LA33_0=='\u1200') ) {s = 187;}

                        else if ( (LA33_0=='\u1208') ) {s = 188;}

                        else if ( (LA33_0=='\u1248') ) {s = 189;}

                        else if ( (LA33_0=='\u124A') ) {s = 190;}

                        else if ( (LA33_0=='\u1250') ) {s = 191;}

                        else if ( (LA33_0=='\u1258') ) {s = 192;}

                        else if ( (LA33_0=='\u125A') ) {s = 193;}

                        else if ( (LA33_0=='\u1260') ) {s = 194;}

                        else if ( (LA33_0=='\u1288') ) {s = 195;}

                        else if ( (LA33_0=='\u128A') ) {s = 196;}

                        else if ( (LA33_0=='\u1290') ) {s = 197;}

                        else if ( (LA33_0=='\u12B0') ) {s = 198;}

                        else if ( (LA33_0=='\u12B2') ) {s = 199;}

                        else if ( (LA33_0=='\u12B8') ) {s = 200;}

                        else if ( (LA33_0=='\u12C0') ) {s = 201;}

                        else if ( (LA33_0=='\u12C2') ) {s = 202;}

                        else if ( (LA33_0=='\u12C8') ) {s = 203;}

                        else if ( (LA33_0=='\u12D0') ) {s = 204;}

                        else if ( (LA33_0=='\u12D8') ) {s = 205;}

                        else if ( (LA33_0=='\u12F0') ) {s = 206;}

                        else if ( (LA33_0=='\u1310') ) {s = 207;}

                        else if ( (LA33_0=='\u1312') ) {s = 208;}

                        else if ( (LA33_0=='\u1318') ) {s = 209;}

                        else if ( (LA33_0=='\u1320') ) {s = 210;}

                        else if ( (LA33_0=='\u1348') ) {s = 211;}

                        else if ( (LA33_0=='\u13A0') ) {s = 212;}

                        else if ( (LA33_0=='\u13B1') ) {s = 213;}

                        else if ( (LA33_0=='\u1401') ) {s = 214;}

                        else if ( (LA33_0=='\u1681') ) {s = 215;}

                        else if ( (LA33_0=='\u16A0') ) {s = 216;}

                        else if ( (LA33_0=='\u1780') ) {s = 217;}

                        else if ( (LA33_0=='\u1820') ) {s = 218;}

                        else if ( (LA33_0=='\u1880') ) {s = 219;}

                        else if ( (LA33_0=='\u1E00') ) {s = 220;}

                        else if ( (LA33_0=='\u1EA0') ) {s = 221;}

                        else if ( (LA33_0=='\u1EE1') ) {s = 222;}

                        else if ( (LA33_0=='\u1F00') ) {s = 223;}

                        else if ( (LA33_0=='\u1F18') ) {s = 224;}

                        else if ( (LA33_0=='\u1F20') ) {s = 225;}

                        else if ( (LA33_0=='\u1F3A') ) {s = 226;}

                        else if ( (LA33_0=='\u1F48') ) {s = 227;}

                        else if ( (LA33_0=='\u1F50') ) {s = 228;}

                        else if ( (LA33_0=='\u1F59') ) {s = 229;}

                        else if ( (LA33_0=='\u1F5B') ) {s = 230;}

                        else if ( (LA33_0=='\u1F5D') ) {s = 231;}

                        else if ( (LA33_0=='\u1F5F') ) {s = 232;}

                        else if ( (LA33_0=='\u1F80') ) {s = 233;}

                        else if ( (LA33_0=='\u1FB6') ) {s = 234;}

                        else if ( (LA33_0=='\u1FBE') ) {s = 235;}

                        else if ( (LA33_0=='\u1FC2') ) {s = 236;}

                        else if ( (LA33_0=='\u1FC6') ) {s = 237;}

                        else if ( (LA33_0=='\u1FD0') ) {s = 238;}

                        else if ( (LA33_0=='\u1FD6') ) {s = 239;}

                        else if ( (LA33_0=='\u1FE0') ) {s = 240;}

                        else if ( (LA33_0=='\u1FF2') ) {s = 241;}

                        else if ( (LA33_0=='\u1FF6') ) {s = 242;}

                        else if ( (LA33_0=='\u207F') ) {s = 243;}

                        else if ( (LA33_0=='\u2102') ) {s = 244;}

                        else if ( (LA33_0=='\u2107') ) {s = 245;}

                        else if ( (LA33_0=='\u210A') ) {s = 246;}

                        else if ( (LA33_0=='\u2115') ) {s = 247;}

                        else if ( (LA33_0=='\u2119') ) {s = 248;}

                        else if ( (LA33_0=='\u2124') ) {s = 249;}

                        else if ( (LA33_0=='\u2126') ) {s = 250;}

                        else if ( (LA33_0=='\u2128') ) {s = 251;}

                        else if ( (LA33_0=='\u212A') ) {s = 252;}

                        else if ( (LA33_0=='\u212F') ) {s = 253;}

                        else if ( (LA33_0=='\u2133') ) {s = 254;}

                        else if ( (LA33_0=='\u2160') ) {s = 255;}

                        else if ( (LA33_0=='\u3005') ) {s = 256;}

                        else if ( (LA33_0=='\u3021') ) {s = 257;}

                        else if ( (LA33_0=='\u3031') ) {s = 258;}

                        else if ( (LA33_0=='\u3038') ) {s = 259;}

                        else if ( (LA33_0=='\u3041') ) {s = 260;}

                        else if ( (LA33_0=='\u309D') ) {s = 261;}

                        else if ( (LA33_0=='\u30A1') ) {s = 262;}

                        else if ( (LA33_0=='\u30FC') ) {s = 263;}

                        else if ( (LA33_0=='\u3105') ) {s = 264;}

                        else if ( (LA33_0=='\u3131') ) {s = 265;}

                        else if ( (LA33_0=='\u31A0') ) {s = 266;}

                        else if ( (LA33_0=='\u3400') ) {s = 267;}

                        else if ( (LA33_0=='\u4DB5') ) {s = 268;}

                        else if ( (LA33_0=='\u4E00') ) {s = 269;}

                        else if ( (LA33_0=='\u9FA5') ) {s = 270;}

                        else if ( (LA33_0=='\uA000') ) {s = 271;}

                        else if ( (LA33_0=='\uAC00') ) {s = 272;}

                        else if ( (LA33_0=='\uD7A3') ) {s = 273;}

                        else if ( (LA33_0=='\uF900') ) {s = 274;}

                        else if ( (LA33_0=='\uFB00') ) {s = 275;}

                        else if ( (LA33_0=='\uFB13') ) {s = 276;}

                        else if ( (LA33_0=='\uFB1D') ) {s = 277;}

                        else if ( (LA33_0=='\uFB1F') ) {s = 278;}

                        else if ( (LA33_0=='\uFB2A') ) {s = 279;}

                        else if ( (LA33_0=='\uFB38') ) {s = 280;}

                        else if ( (LA33_0=='\uFB3E') ) {s = 281;}

                        else if ( (LA33_0=='\uFB40') ) {s = 282;}

                        else if ( (LA33_0=='\uFB43') ) {s = 283;}

                        else if ( (LA33_0=='\uFB46') ) {s = 284;}

                        else if ( (LA33_0=='\uFBD3') ) {s = 285;}

                        else if ( (LA33_0=='\uFD50') ) {s = 286;}

                        else if ( (LA33_0=='\uFD92') ) {s = 287;}

                        else if ( (LA33_0=='\uFDF0') ) {s = 288;}

                        else if ( (LA33_0=='\uFE70') ) {s = 289;}

                        else if ( (LA33_0=='\uFE74') ) {s = 290;}

                        else if ( (LA33_0=='\uFE76') ) {s = 291;}

                        else if ( (LA33_0=='\uFF21') ) {s = 292;}

                        else if ( (LA33_0=='\uFF41') ) {s = 293;}

                        else if ( (LA33_0=='\uFF66') ) {s = 294;}

                        else if ( (LA33_0=='\uFFC2') ) {s = 295;}

                        else if ( (LA33_0=='\uFFCA') ) {s = 296;}

                        else if ( (LA33_0=='\uFFD2') ) {s = 297;}

                        else if ( (LA33_0=='\uFFDA') ) {s = 298;}

                        else if ( ((LA33_0>='B' && LA33_0<='Z')||LA33_0=='_'||LA33_0=='h'||(LA33_0>='j' && LA33_0<='l')||(LA33_0>='n' && LA33_0<='o')||LA33_0=='q'||LA33_0=='u'||(LA33_0>='w' && LA33_0<='z')) ) {s = 299;}

                        else if ( ((LA33_0>='1' && LA33_0<='9')) ) {s = 300;}

                        else if ( (LA33_0=='0') ) {s = 301;}

                        else if ( (LA33_0=='\n') ) {s = 302;}

                        else if ( (LA33_0=='\\') ) {s = 303;}

                        else if ( (LA33_0=='\"') ) {s = 304;}

                        else if ( (LA33_0=='\t'||LA33_0=='\r'||LA33_0==' ') ) {s = 305;}

                        else if ( ((LA33_0>='\u0000' && LA33_0<='\b')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\u001F')||(LA33_0>='#' && LA33_0<='$')||(LA33_0>='?' && LA33_0<='@')||LA33_0=='`'||(LA33_0>='~' && LA33_0<='\u00A9')||(LA33_0>='\u00AB' && LA33_0<='\u00B4')||(LA33_0>='\u00B6' && LA33_0<='\u00B9')||(LA33_0>='\u00BB' && LA33_0<='\u00BF')||(LA33_0>='\u00C1' && LA33_0<='\u00D7')||(LA33_0>='\u00D9' && LA33_0<='\u00EE')||(LA33_0>='\u00F0' && LA33_0<='\u00F7')||(LA33_0>='\u00F9' && LA33_0<='\u0221')||(LA33_0>='\u0223' && LA33_0<='\u024F')||(LA33_0>='\u0251' && LA33_0<='\u02AF')||(LA33_0>='\u02B1' && LA33_0<='\u02BA')||(LA33_0>='\u02BC' && LA33_0<='\u02CF')||(LA33_0>='\u02D1' && LA33_0<='\u02DF')||(LA33_0>='\u02E1' && LA33_0<='\u02ED')||(LA33_0>='\u02EF' && LA33_0<='\u0379')||(LA33_0>='\u037B' && LA33_0<='\u0385')||LA33_0=='\u0387'||(LA33_0>='\u0389' && LA33_0<='\u038B')||LA33_0=='\u038D'||(LA33_0>='\u038F' && LA33_0<='\u03A2')||(LA33_0>='\u03A4' && LA33_0<='\u03CF')||(LA33_0>='\u03D1' && LA33_0<='\u03D9')||(LA33_0>='\u03DB' && LA33_0<='\u03FF')||(LA33_0>='\u0401' && LA33_0<='\u048B')||(LA33_0>='\u048D' && LA33_0<='\u04C6')||(LA33_0>='\u04C8' && LA33_0<='\u04CA')||(LA33_0>='\u04CC' && LA33_0<='\u04CF')||(LA33_0>='\u04D1' && LA33_0<='\u04F7')||(LA33_0>='\u04F9' && LA33_0<='\u0530')||(LA33_0>='\u0532' && LA33_0<='\u0558')||(LA33_0>='\u055A' && LA33_0<='\u0560')||(LA33_0>='\u0562' && LA33_0<='\u05CF')||(LA33_0>='\u05D1' && LA33_0<='\u05EF')||(LA33_0>='\u05F1' && LA33_0<='\u0620')||(LA33_0>='\u0622' && LA33_0<='\u063F')||(LA33_0>='\u0641' && LA33_0<='\u0670')||(LA33_0>='\u0672' && LA33_0<='\u06D4')||(LA33_0>='\u06D6' && LA33_0<='\u06E4')||(LA33_0>='\u06E6' && LA33_0<='\u06F9')||(LA33_0>='\u06FB' && LA33_0<='\u070F')||LA33_0=='\u0711'||(LA33_0>='\u0713' && LA33_0<='\u077F')||(LA33_0>='\u0781' && LA33_0<='\u0904')||(LA33_0>='\u0906' && LA33_0<='\u093C')||(LA33_0>='\u093E' && LA33_0<='\u094F')||(LA33_0>='\u0951' && LA33_0<='\u0957')||(LA33_0>='\u0959' && LA33_0<='\u0984')||(LA33_0>='\u0986' && LA33_0<='\u098E')||(LA33_0>='\u0990' && LA33_0<='\u0992')||(LA33_0>='\u0994' && LA33_0<='\u09A9')||(LA33_0>='\u09AB' && LA33_0<='\u09B1')||(LA33_0>='\u09B3' && LA33_0<='\u09B5')||(LA33_0>='\u09B7' && LA33_0<='\u09DB')||(LA33_0>='\u09DD' && LA33_0<='\u09DE')||(LA33_0>='\u09E0' && LA33_0<='\u09EF')||(LA33_0>='\u09F1' && LA33_0<='\u0A04')||(LA33_0>='\u0A06' && LA33_0<='\u0A0E')||(LA33_0>='\u0A10' && LA33_0<='\u0A12')||(LA33_0>='\u0A14' && LA33_0<='\u0A29')||(LA33_0>='\u0A2B' && LA33_0<='\u0A31')||(LA33_0>='\u0A33' && LA33_0<='\u0A34')||(LA33_0>='\u0A36' && LA33_0<='\u0A37')||(LA33_0>='\u0A39' && LA33_0<='\u0A58')||(LA33_0>='\u0A5A' && LA33_0<='\u0A5D')||(LA33_0>='\u0A5F' && LA33_0<='\u0A71')||(LA33_0>='\u0A73' && LA33_0<='\u0A84')||(LA33_0>='\u0A86' && LA33_0<='\u0A8C')||LA33_0=='\u0A8E'||(LA33_0>='\u0A90' && LA33_0<='\u0A92')||(LA33_0>='\u0A94' && LA33_0<='\u0AA9')||(LA33_0>='\u0AAB' && LA33_0<='\u0AB1')||(LA33_0>='\u0AB3' && LA33_0<='\u0AB4')||(LA33_0>='\u0AB6' && LA33_0<='\u0ABC')||(LA33_0>='\u0ABE' && LA33_0<='\u0ACF')||(LA33_0>='\u0AD1' && LA33_0<='\u0ADF')||(LA33_0>='\u0AE1' && LA33_0<='\u0B04')||(LA33_0>='\u0B06' && LA33_0<='\u0B0E')||(LA33_0>='\u0B10' && LA33_0<='\u0B12')||(LA33_0>='\u0B14' && LA33_0<='\u0B29')||(LA33_0>='\u0B2B' && LA33_0<='\u0B31')||(LA33_0>='\u0B33' && LA33_0<='\u0B35')||(LA33_0>='\u0B37' && LA33_0<='\u0B3C')||(LA33_0>='\u0B3E' && LA33_0<='\u0B5B')||(LA33_0>='\u0B5D' && LA33_0<='\u0B5E')||(LA33_0>='\u0B60' && LA33_0<='\u0B84')||(LA33_0>='\u0B86' && LA33_0<='\u0B8D')||(LA33_0>='\u0B8F' && LA33_0<='\u0B91')||(LA33_0>='\u0B93' && LA33_0<='\u0B98')||(LA33_0>='\u0B9A' && LA33_0<='\u0B9B')||LA33_0=='\u0B9D'||(LA33_0>='\u0B9F' && LA33_0<='\u0BA2')||(LA33_0>='\u0BA4' && LA33_0<='\u0BA7')||(LA33_0>='\u0BA9' && LA33_0<='\u0BAD')||(LA33_0>='\u0BAF' && LA33_0<='\u0BB6')||(LA33_0>='\u0BB8' && LA33_0<='\u0C04')||(LA33_0>='\u0C06' && LA33_0<='\u0C0D')||(LA33_0>='\u0C0F' && LA33_0<='\u0C11')||(LA33_0>='\u0C13' && LA33_0<='\u0C29')||(LA33_0>='\u0C2B' && LA33_0<='\u0C34')||(LA33_0>='\u0C36' && LA33_0<='\u0C5F')||(LA33_0>='\u0C61' && LA33_0<='\u0C84')||(LA33_0>='\u0C86' && LA33_0<='\u0C8D')||(LA33_0>='\u0C8F' && LA33_0<='\u0C91')||(LA33_0>='\u0C93' && LA33_0<='\u0CA9')||(LA33_0>='\u0CAB' && LA33_0<='\u0CB4')||(LA33_0>='\u0CB6' && LA33_0<='\u0CDD')||LA33_0=='\u0CDF'||(LA33_0>='\u0CE1' && LA33_0<='\u0D04')||(LA33_0>='\u0D06' && LA33_0<='\u0D0D')||(LA33_0>='\u0D0F' && LA33_0<='\u0D11')||(LA33_0>='\u0D13' && LA33_0<='\u0D29')||(LA33_0>='\u0D2B' && LA33_0<='\u0D5F')||(LA33_0>='\u0D61' && LA33_0<='\u0D84')||(LA33_0>='\u0D86' && LA33_0<='\u0D99')||(LA33_0>='\u0D9B' && LA33_0<='\u0DB2')||(LA33_0>='\u0DB4' && LA33_0<='\u0DBC')||(LA33_0>='\u0DBE' && LA33_0<='\u0DBF')||(LA33_0>='\u0DC1' && LA33_0<='\u0E00')||(LA33_0>='\u0E02' && LA33_0<='\u0E31')||(LA33_0>='\u0E33' && LA33_0<='\u0E3F')||(LA33_0>='\u0E41' && LA33_0<='\u0E80')||(LA33_0>='\u0E82' && LA33_0<='\u0E83')||(LA33_0>='\u0E85' && LA33_0<='\u0E86')||(LA33_0>='\u0E88' && LA33_0<='\u0E89')||(LA33_0>='\u0E8B' && LA33_0<='\u0E8C')||(LA33_0>='\u0E8E' && LA33_0<='\u0E93')||(LA33_0>='\u0E95' && LA33_0<='\u0E98')||(LA33_0>='\u0E9A' && LA33_0<='\u0EA0')||(LA33_0>='\u0EA2' && LA33_0<='\u0EA4')||LA33_0=='\u0EA6'||(LA33_0>='\u0EA8' && LA33_0<='\u0EA9')||(LA33_0>='\u0EAB' && LA33_0<='\u0EAC')||(LA33_0>='\u0EAE' && LA33_0<='\u0EB1')||(LA33_0>='\u0EB3' && LA33_0<='\u0EBC')||(LA33_0>='\u0EBE' && LA33_0<='\u0EC5')||(LA33_0>='\u0EC7' && LA33_0<='\u0EDB')||(LA33_0>='\u0EDD' && LA33_0<='\u0EFF')||(LA33_0>='\u0F01' && LA33_0<='\u0F3F')||(LA33_0>='\u0F41' && LA33_0<='\u0F87')||(LA33_0>='\u0F89' && LA33_0<='\u0FFF')||(LA33_0>='\u1001' && LA33_0<='\u1022')||(LA33_0>='\u1024' && LA33_0<='\u1028')||(LA33_0>='\u102A' && LA33_0<='\u104F')||(LA33_0>='\u1051' && LA33_0<='\u109F')||(LA33_0>='\u10A1' && LA33_0<='\u10CF')||(LA33_0>='\u10D1' && LA33_0<='\u10FF')||(LA33_0>='\u1101' && LA33_0<='\u115E')||(LA33_0>='\u1160' && LA33_0<='\u11A7')||(LA33_0>='\u11A9' && LA33_0<='\u11FF')||(LA33_0>='\u1201' && LA33_0<='\u1207')||(LA33_0>='\u1209' && LA33_0<='\u1247')||LA33_0=='\u1249'||(LA33_0>='\u124B' && LA33_0<='\u124F')||(LA33_0>='\u1251' && LA33_0<='\u1257')||LA33_0=='\u1259'||(LA33_0>='\u125B' && LA33_0<='\u125F')||(LA33_0>='\u1261' && LA33_0<='\u1287')||LA33_0=='\u1289'||(LA33_0>='\u128B' && LA33_0<='\u128F')||(LA33_0>='\u1291' && LA33_0<='\u12AF')||LA33_0=='\u12B1'||(LA33_0>='\u12B3' && LA33_0<='\u12B7')||(LA33_0>='\u12B9' && LA33_0<='\u12BF')||LA33_0=='\u12C1'||(LA33_0>='\u12C3' && LA33_0<='\u12C7')||(LA33_0>='\u12C9' && LA33_0<='\u12CF')||(LA33_0>='\u12D1' && LA33_0<='\u12D7')||(LA33_0>='\u12D9' && LA33_0<='\u12EF')||(LA33_0>='\u12F1' && LA33_0<='\u130F')||LA33_0=='\u1311'||(LA33_0>='\u1313' && LA33_0<='\u1317')||(LA33_0>='\u1319' && LA33_0<='\u131F')||(LA33_0>='\u1321' && LA33_0<='\u1347')||(LA33_0>='\u1349' && LA33_0<='\u139F')||(LA33_0>='\u13A1' && LA33_0<='\u13B0')||(LA33_0>='\u13B2' && LA33_0<='\u1400')||(LA33_0>='\u1402' && LA33_0<='\u1680')||(LA33_0>='\u1682' && LA33_0<='\u169F')||(LA33_0>='\u16A1' && LA33_0<='\u177F')||(LA33_0>='\u1781' && LA33_0<='\u181F')||(LA33_0>='\u1821' && LA33_0<='\u187F')||(LA33_0>='\u1881' && LA33_0<='\u1DFF')||(LA33_0>='\u1E01' && LA33_0<='\u1E9F')||(LA33_0>='\u1EA1' && LA33_0<='\u1EE0')||(LA33_0>='\u1EE2' && LA33_0<='\u1EFF')||(LA33_0>='\u1F01' && LA33_0<='\u1F17')||(LA33_0>='\u1F19' && LA33_0<='\u1F1F')||(LA33_0>='\u1F21' && LA33_0<='\u1F39')||(LA33_0>='\u1F3B' && LA33_0<='\u1F47')||(LA33_0>='\u1F49' && LA33_0<='\u1F4F')||(LA33_0>='\u1F51' && LA33_0<='\u1F58')||LA33_0=='\u1F5A'||LA33_0=='\u1F5C'||LA33_0=='\u1F5E'||(LA33_0>='\u1F60' && LA33_0<='\u1F7F')||(LA33_0>='\u1F81' && LA33_0<='\u1FB5')||(LA33_0>='\u1FB7' && LA33_0<='\u1FBD')||(LA33_0>='\u1FBF' && LA33_0<='\u1FC1')||(LA33_0>='\u1FC3' && LA33_0<='\u1FC5')||(LA33_0>='\u1FC7' && LA33_0<='\u1FCF')||(LA33_0>='\u1FD1' && LA33_0<='\u1FD5')||(LA33_0>='\u1FD7' && LA33_0<='\u1FDF')||(LA33_0>='\u1FE1' && LA33_0<='\u1FF1')||(LA33_0>='\u1FF3' && LA33_0<='\u1FF5')||(LA33_0>='\u1FF7' && LA33_0<='\u207E')||(LA33_0>='\u2080' && LA33_0<='\u2101')||(LA33_0>='\u2103' && LA33_0<='\u2106')||(LA33_0>='\u2108' && LA33_0<='\u2109')||(LA33_0>='\u210B' && LA33_0<='\u2114')||(LA33_0>='\u2116' && LA33_0<='\u2118')||(LA33_0>='\u211A' && LA33_0<='\u2123')||LA33_0=='\u2125'||LA33_0=='\u2127'||LA33_0=='\u2129'||(LA33_0>='\u212B' && LA33_0<='\u212E')||(LA33_0>='\u2130' && LA33_0<='\u2132')||(LA33_0>='\u2134' && LA33_0<='\u215F')||(LA33_0>='\u2161' && LA33_0<='\u3004')||(LA33_0>='\u3006' && LA33_0<='\u3020')||(LA33_0>='\u3022' && LA33_0<='\u3030')||(LA33_0>='\u3032' && LA33_0<='\u3037')||(LA33_0>='\u3039' && LA33_0<='\u3040')||(LA33_0>='\u3042' && LA33_0<='\u309C')||(LA33_0>='\u309E' && LA33_0<='\u30A0')||(LA33_0>='\u30A2' && LA33_0<='\u30FB')||(LA33_0>='\u30FD' && LA33_0<='\u3104')||(LA33_0>='\u3106' && LA33_0<='\u3130')||(LA33_0>='\u3132' && LA33_0<='\u319F')||(LA33_0>='\u31A1' && LA33_0<='\u33FF')||(LA33_0>='\u3401' && LA33_0<='\u4DB4')||(LA33_0>='\u4DB6' && LA33_0<='\u4DFF')||(LA33_0>='\u4E01' && LA33_0<='\u9FA4')||(LA33_0>='\u9FA6' && LA33_0<='\u9FFF')||(LA33_0>='\uA001' && LA33_0<='\uABFF')||(LA33_0>='\uAC01' && LA33_0<='\uD7A2')||(LA33_0>='\uD7A4' && LA33_0<='\uF8FF')||(LA33_0>='\uF901' && LA33_0<='\uFAFF')||(LA33_0>='\uFB01' && LA33_0<='\uFB12')||(LA33_0>='\uFB14' && LA33_0<='\uFB1C')||LA33_0=='\uFB1E'||(LA33_0>='\uFB20' && LA33_0<='\uFB29')||(LA33_0>='\uFB2B' && LA33_0<='\uFB37')||(LA33_0>='\uFB39' && LA33_0<='\uFB3D')||LA33_0=='\uFB3F'||(LA33_0>='\uFB41' && LA33_0<='\uFB42')||(LA33_0>='\uFB44' && LA33_0<='\uFB45')||(LA33_0>='\uFB47' && LA33_0<='\uFBD2')||(LA33_0>='\uFBD4' && LA33_0<='\uFD4F')||(LA33_0>='\uFD51' && LA33_0<='\uFD91')||(LA33_0>='\uFD93' && LA33_0<='\uFDEF')||(LA33_0>='\uFDF1' && LA33_0<='\uFE6F')||(LA33_0>='\uFE71' && LA33_0<='\uFE73')||LA33_0=='\uFE75'||(LA33_0>='\uFE77' && LA33_0<='\uFF20')||(LA33_0>='\uFF22' && LA33_0<='\uFF40')||(LA33_0>='\uFF42' && LA33_0<='\uFF65')||(LA33_0>='\uFF67' && LA33_0<='\uFFC1')||(LA33_0>='\uFFC3' && LA33_0<='\uFFC9')||(LA33_0>='\uFFCB' && LA33_0<='\uFFD1')||(LA33_0>='\uFFD3' && LA33_0<='\uFFD9')||(LA33_0>='\uFFDB' && LA33_0<='\uFFFF')) ) {s = 306;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA33_15 = input.LA(1);

                        s = -1;
                        if ( (LA33_15=='\n') ) {s = 332;}

                        else if ( (LA33_15=='\'') ) {s = 333;}

                        else if ( ((LA33_15>='\u0000' && LA33_15<='\t')||(LA33_15>='\u000B' && LA33_15<='&')||(LA33_15>='(' && LA33_15<='\uFFFF')) ) {s = 334;}

                        else s = 331;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA33_332 = input.LA(1);

                        s = -1;
                        if ( (LA33_332=='\'') ) {s = 333;}

                        else if ( ((LA33_332>='\u0000' && LA33_332<='&')||(LA33_332>='(' && LA33_332<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA33_467 = input.LA(1);

                        s = -1;
                        if ( (LA33_467=='\"') ) {s = 377;}

                        else if ( ((LA33_467>='\u0000' && LA33_467<='!')||(LA33_467>='#' && LA33_467<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA33_494 = input.LA(1);

                        s = -1;
                        if ( (LA33_494=='\"') ) {s = 377;}

                        else if ( ((LA33_494>='\u0000' && LA33_494<='!')||(LA33_494>='#' && LA33_494<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA33_466 = input.LA(1);

                        s = -1;
                        if ( (LA33_466=='\"') ) {s = 377;}

                        else if ( ((LA33_466>='\u0000' && LA33_466<='!')||(LA33_466>='#' && LA33_466<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA33_412 = input.LA(1);

                        s = -1;
                        if ( (LA33_412=='\"') ) {s = 377;}

                        else if ( ((LA33_412>='\u0000' && LA33_412<='!')||(LA33_412>='#' && LA33_412<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA33_304 = input.LA(1);

                        s = -1;
                        if ( (LA33_304=='\n') ) {s = 375;}

                        else if ( (LA33_304=='\\') ) {s = 376;}

                        else if ( (LA33_304=='\"') ) {s = 377;}

                        else if ( ((LA33_304>='\u0000' && LA33_304<='\t')||(LA33_304>='\u000B' && LA33_304<='!')||(LA33_304>='#' && LA33_304<='[')||(LA33_304>=']' && LA33_304<='\uFFFF')) ) {s = 334;}

                        else s = 306;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA33_510 = input.LA(1);

                        s = -1;
                        if ( (LA33_510=='\"') ) {s = 377;}

                        else if ( ((LA33_510>='\u0000' && LA33_510<='!')||(LA33_510>='#' && LA33_510<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA33_376 = input.LA(1);

                        s = -1;
                        if ( (LA33_376=='u') ) {s = 410;}

                        else if ( (LA33_376=='U') ) {s = 411;}

                        else if ( (LA33_376=='\"'||LA33_376=='\''||LA33_376=='\\'||(LA33_376>='a' && LA33_376<='b')||LA33_376=='f'||LA33_376=='n'||LA33_376=='r'||LA33_376=='t'||LA33_376=='v') ) {s = 412;}

                        else if ( (LA33_376=='x') ) {s = 413;}

                        else if ( ((LA33_376>='0' && LA33_376<='7')) ) {s = 414;}

                        else if ( ((LA33_376>='\u0000' && LA33_376<='!')||(LA33_376>='#' && LA33_376<='&')||(LA33_376>='(' && LA33_376<='/')||(LA33_376>='8' && LA33_376<='T')||(LA33_376>='V' && LA33_376<='[')||(LA33_376>=']' && LA33_376<='`')||(LA33_376>='c' && LA33_376<='e')||(LA33_376>='g' && LA33_376<='m')||(LA33_376>='o' && LA33_376<='q')||LA33_376=='s'||LA33_376=='w'||(LA33_376>='y' && LA33_376<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA33_375 = input.LA(1);

                        s = -1;
                        if ( (LA33_375=='\"') ) {s = 377;}

                        else if ( ((LA33_375>='\u0000' && LA33_375<='!')||(LA33_375>='#' && LA33_375<='\uFFFF')) ) {s = 334;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}