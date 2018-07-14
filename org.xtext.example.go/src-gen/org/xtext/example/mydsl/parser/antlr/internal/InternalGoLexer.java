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
    public static final int RULE_DECIMAL_DIGIT=26;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=13;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=29;
    public static final int RULE_INTERPRETED_STRING_LIT=10;
    public static final int RULE_UNICODE_VALUE=7;
    public static final int RULE_LITTLE_U_VALUE=34;
    public static final int RULE_ASSING_OP=12;
    public static final int RULE_HEX_BYTE_VALUE=38;
    public static final int RULE_OCTAL_BYTE_VALUE=37;
    public static final int RULE_MUL_OP=22;
    public static final int RULE_INT=25;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=39;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_EXPOENT=31;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=5;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_LITERAL_TYPE=11;
    public static final int RULE_NEWLINE=18;
    public static final int RULE_BIG_U_VALUE=35;
    public static final int RULE_ESCAPED_CHAR=36;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=16;
    public static final int RULE_BOOLEAN_LIT=17;
    public static final int RULE_BYTE_VALUE=8;
    public static final int RULE_SL_COMMENT=40;
    public static final int RULE_UNICODE_LETTER=20;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=19;
    public static final int RULE_HEX_LIT=33;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_MUL=24;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=23;
    public static final int RULE_OCTAL_DIGIT=27;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=41;
    public static final int RULE_ANY_OTHER=42;
    public static final int RULE_OCTAL_LIT=32;
    public static final int RULE_FLOAT_LIT=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=9;
    public static final int RULE_INT_LIT=15;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=14;
    public static final int T__45=45;
    public static final int RULE_REL_OP=21;
    public static final int RULE_HEX_DIGIT=28;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__84=84;
    public static final int RULE_DECIMAL_LIT=30;
    public static final int T__43=43;

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

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '\\u00EF' )
            // InternalGo.g:13:9: '\\u00EF'
            {
            match('\u00EF'); 

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
            // InternalGo.g:14:7: ( '\\'' )
            // InternalGo.g:14:9: '\\''
            {
            match('\''); 

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
            // InternalGo.g:15:7: ( '(' )
            // InternalGo.g:15:9: '('
            {
            match('('); 

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
            // InternalGo.g:16:7: ( ')' )
            // InternalGo.g:16:9: ')'
            {
            match(')'); 

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
            // InternalGo.g:17:7: ( '.' )
            // InternalGo.g:17:9: '.'
            {
            match('.'); 

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
            // InternalGo.g:18:7: ( '[' )
            // InternalGo.g:18:9: '['
            {
            match('['); 

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
            // InternalGo.g:19:7: ( ']' )
            // InternalGo.g:19:9: ']'
            {
            match(']'); 

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
            // InternalGo.g:20:7: ( 'struct' )
            // InternalGo.g:20:9: 'struct'
            {
            match("struct"); 


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
            // InternalGo.g:21:7: ( '{' )
            // InternalGo.g:21:9: '{'
            {
            match('{'); 

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
            // InternalGo.g:22:7: ( ';' )
            // InternalGo.g:22:9: ';'
            {
            match(';'); 

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
            // InternalGo.g:23:7: ( '}' )
            // InternalGo.g:23:9: '}'
            {
            match('}'); 

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
            // InternalGo.g:24:7: ( ',' )
            // InternalGo.g:24:9: ','
            {
            match(','); 

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
            // InternalGo.g:25:7: ( '...' )
            // InternalGo.g:25:9: '...'
            {
            match("..."); 


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
            // InternalGo.g:26:7: ( 'interface' )
            // InternalGo.g:26:9: 'interface'
            {
            match("interface"); 


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
            // InternalGo.g:27:7: ( 'map' )
            // InternalGo.g:27:9: 'map'
            {
            match("map"); 


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
            // InternalGo.g:28:7: ( 'chan' )
            // InternalGo.g:28:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:29:7: ( '<-' )
            // InternalGo.g:29:9: '<-'
            {
            match("<-"); 


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
            // InternalGo.g:30:7: ( ':' )
            // InternalGo.g:30:9: ':'
            {
            match(':'); 

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
            // InternalGo.g:31:7: ( 'goto' )
            // InternalGo.g:31:9: 'goto'
            {
            match("goto"); 


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
            // InternalGo.g:32:7: ( 'return' )
            // InternalGo.g:32:9: 'return'
            {
            match("return"); 


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
            // InternalGo.g:33:7: ( 'break' )
            // InternalGo.g:33:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:34:7: ( 'continue' )
            // InternalGo.g:34:9: 'continue'
            {
            match("continue"); 


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
            // InternalGo.g:35:7: ( 'if' )
            // InternalGo.g:35:9: 'if'
            {
            match("if"); 


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
            // InternalGo.g:36:7: ( 'else' )
            // InternalGo.g:36:9: 'else'
            {
            match("else"); 


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
            // InternalGo.g:37:7: ( 'fallthrough' )
            // InternalGo.g:37:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalGo.g:38:7: ( 'select' )
            // InternalGo.g:38:9: 'select'
            {
            match("select"); 


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
            // InternalGo.g:39:7: ( 'for' )
            // InternalGo.g:39:9: 'for'
            {
            match("for"); 


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
            // InternalGo.g:40:7: ( 'defer' )
            // InternalGo.g:40:9: 'defer'
            {
            match("defer"); 


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
            // InternalGo.g:41:7: ( 'const' )
            // InternalGo.g:41:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:42:7: ( '=' )
            // InternalGo.g:42:9: '='
            {
            match('='); 

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
            // InternalGo.g:43:7: ( 'type' )
            // InternalGo.g:43:9: 'type'
            {
            match("type"); 


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
            // InternalGo.g:44:7: ( 'var' )
            // InternalGo.g:44:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:45:7: ( '++' )
            // InternalGo.g:45:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:46:7: ( '--' )
            // InternalGo.g:46:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:47:7: ( ':=' )
            // InternalGo.g:47:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:48:7: ( 'switch' )
            // InternalGo.g:48:9: 'switch'
            {
            match("switch"); 


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
            // InternalGo.g:49:7: ( 'case' )
            // InternalGo.g:49:9: 'case'
            {
            match("case"); 


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
            // InternalGo.g:50:7: ( 'default' )
            // InternalGo.g:50:9: 'default'
            {
            match("default"); 


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
            // InternalGo.g:51:7: ( 'range' )
            // InternalGo.g:51:9: 'range'
            {
            match("range"); 


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
            // InternalGo.g:52:7: ( 'import' )
            // InternalGo.g:52:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:8219:23: ( '\\n' )
            // InternalGo.g:8219:25: '\\n'
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
            // InternalGo.g:8221:28: ( '\\n' )
            // InternalGo.g:8221:30: '\\n'
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
            int _type = RULE_UNICODE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8223:21: ( ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' ) )
            // InternalGo.g:8223:23: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
            {
            // InternalGo.g:8223:23: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
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
                    // InternalGo.g:8223:24: 'A-Z'
                    {
                    match("A-Z"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8223:30: 'a-z'
                    {
                    match("a-z"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8223:36: '\\u00AA'
                    {
                    match('\u00AA'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8223:45: '\\u00B5'
                    {
                    match('\u00B5'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8223:54: '\\u00BA'
                    {
                    match('\u00BA'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8223:63: '\\u00C0-\\u00D6'
                    {
                    match("\u00C0-\u00D6"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:8223:79: '\\u00D8-\\u00F6'
                    {
                    match("\u00D8-\u00F6"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:8223:95: '\\u00F8-\\u021F'
                    {
                    match("\u00F8-\u021F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:8223:111: '\\u0222-\\u0233'
                    {
                    match("\u0222-\u0233"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:8223:127: '\\u0250-\\u02AD'
                    {
                    match("\u0250-\u02AD"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:8223:143: '\\u02B0-\\u02B8'
                    {
                    match("\u02B0-\u02B8"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:8223:159: '\\u02BB-\\u02C1'
                    {
                    match("\u02BB-\u02C1"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:8223:175: '\\u02D0-\\u02D1'
                    {
                    match("\u02D0-\u02D1"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:8223:191: '\\u02E0-\\u02E4'
                    {
                    match("\u02E0-\u02E4"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:8223:207: '\\u02EE'
                    {
                    match('\u02EE'); 

                    }
                    break;
                case 16 :
                    // InternalGo.g:8223:216: '\\u037A'
                    {
                    match('\u037A'); 

                    }
                    break;
                case 17 :
                    // InternalGo.g:8223:225: '\\u0386'
                    {
                    match('\u0386'); 

                    }
                    break;
                case 18 :
                    // InternalGo.g:8223:234: '\\u0388-\\u038A'
                    {
                    match("\u0388-\u038A"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:8223:250: '\\u038C'
                    {
                    match('\u038C'); 

                    }
                    break;
                case 20 :
                    // InternalGo.g:8223:259: '\\u038E-\\u03A1'
                    {
                    match("\u038E-\u03A1"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:8223:275: '\\u03A3-\\u03CE'
                    {
                    match("\u03A3-\u03CE"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:8223:291: '\\u03D0-\\u03D7'
                    {
                    match("\u03D0-\u03D7"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:8223:307: '\\u03DA-\\u03F3'
                    {
                    match("\u03DA-\u03F3"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:8223:323: '\\u0400-\\u0481'
                    {
                    match("\u0400-\u0481"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:8223:339: '\\u048C-\\u04C4'
                    {
                    match("\u048C-\u04C4"); 


                    }
                    break;
                case 26 :
                    // InternalGo.g:8223:355: '\\u04C7-\\u04C8'
                    {
                    match("\u04C7-\u04C8"); 


                    }
                    break;
                case 27 :
                    // InternalGo.g:8223:371: '\\u04CB-\\u04CC'
                    {
                    match("\u04CB-\u04CC"); 


                    }
                    break;
                case 28 :
                    // InternalGo.g:8223:387: '\\u04D0-\\u04F5'
                    {
                    match("\u04D0-\u04F5"); 


                    }
                    break;
                case 29 :
                    // InternalGo.g:8223:403: '\\u04F8-\\u04F9'
                    {
                    match("\u04F8-\u04F9"); 


                    }
                    break;
                case 30 :
                    // InternalGo.g:8223:419: '\\u0531-\\u0556'
                    {
                    match("\u0531-\u0556"); 


                    }
                    break;
                case 31 :
                    // InternalGo.g:8223:435: '\\u0559'
                    {
                    match('\u0559'); 

                    }
                    break;
                case 32 :
                    // InternalGo.g:8223:444: '\\u0561-\\u0587'
                    {
                    match("\u0561-\u0587"); 


                    }
                    break;
                case 33 :
                    // InternalGo.g:8223:460: '\\u05D0-\\u05EA'
                    {
                    match("\u05D0-\u05EA"); 


                    }
                    break;
                case 34 :
                    // InternalGo.g:8223:476: '\\u05F0-\\u05F2'
                    {
                    match("\u05F0-\u05F2"); 


                    }
                    break;
                case 35 :
                    // InternalGo.g:8223:492: '\\u0621-\\u063A'
                    {
                    match("\u0621-\u063A"); 


                    }
                    break;
                case 36 :
                    // InternalGo.g:8223:508: '\\u0640-\\u064A'
                    {
                    match("\u0640-\u064A"); 


                    }
                    break;
                case 37 :
                    // InternalGo.g:8223:524: '\\u0671-\\u06D3'
                    {
                    match("\u0671-\u06D3"); 


                    }
                    break;
                case 38 :
                    // InternalGo.g:8223:540: '\\u06D5'
                    {
                    match('\u06D5'); 

                    }
                    break;
                case 39 :
                    // InternalGo.g:8223:549: '\\u06E5-\\u06E6'
                    {
                    match("\u06E5-\u06E6"); 


                    }
                    break;
                case 40 :
                    // InternalGo.g:8223:565: '\\u06FA-\\u06FC'
                    {
                    match("\u06FA-\u06FC"); 


                    }
                    break;
                case 41 :
                    // InternalGo.g:8223:581: '\\u0710'
                    {
                    match('\u0710'); 

                    }
                    break;
                case 42 :
                    // InternalGo.g:8223:590: '\\u0712-\\u072C'
                    {
                    match("\u0712-\u072C"); 


                    }
                    break;
                case 43 :
                    // InternalGo.g:8223:606: '\\u0780-\\u07A5'
                    {
                    match("\u0780-\u07A5"); 


                    }
                    break;
                case 44 :
                    // InternalGo.g:8223:622: '\\u0905-\\u0939'
                    {
                    match("\u0905-\u0939"); 


                    }
                    break;
                case 45 :
                    // InternalGo.g:8223:638: '\\u093D'
                    {
                    match('\u093D'); 

                    }
                    break;
                case 46 :
                    // InternalGo.g:8223:647: '\\u0950'
                    {
                    match('\u0950'); 

                    }
                    break;
                case 47 :
                    // InternalGo.g:8223:656: '\\u0958-\\u0961'
                    {
                    match("\u0958-\u0961"); 


                    }
                    break;
                case 48 :
                    // InternalGo.g:8223:672: '\\u0985-\\u098C'
                    {
                    match("\u0985-\u098C"); 


                    }
                    break;
                case 49 :
                    // InternalGo.g:8223:688: '\\u098F-\\u0990'
                    {
                    match("\u098F-\u0990"); 


                    }
                    break;
                case 50 :
                    // InternalGo.g:8223:704: '\\u0993-\\u09A8'
                    {
                    match("\u0993-\u09A8"); 


                    }
                    break;
                case 51 :
                    // InternalGo.g:8223:720: '\\u09AA-\\u09B0'
                    {
                    match("\u09AA-\u09B0"); 


                    }
                    break;
                case 52 :
                    // InternalGo.g:8223:736: '\\u09B2'
                    {
                    match('\u09B2'); 

                    }
                    break;
                case 53 :
                    // InternalGo.g:8223:745: '\\u09B6-\\u09B9'
                    {
                    match("\u09B6-\u09B9"); 


                    }
                    break;
                case 54 :
                    // InternalGo.g:8223:761: '\\u09DC-\\u09DD'
                    {
                    match("\u09DC-\u09DD"); 


                    }
                    break;
                case 55 :
                    // InternalGo.g:8223:777: '\\u09DF-\\u09E1'
                    {
                    match("\u09DF-\u09E1"); 


                    }
                    break;
                case 56 :
                    // InternalGo.g:8223:793: '\\u09F0-\\u09F1'
                    {
                    match("\u09F0-\u09F1"); 


                    }
                    break;
                case 57 :
                    // InternalGo.g:8223:809: '\\u0A05-\\u0A0A'
                    {
                    match("\u0A05-\u0A0A"); 


                    }
                    break;
                case 58 :
                    // InternalGo.g:8223:825: '\\u0A0F-\\u0A10'
                    {
                    match("\u0A0F-\u0A10"); 


                    }
                    break;
                case 59 :
                    // InternalGo.g:8223:841: '\\u0A13-\\u0A28'
                    {
                    match("\u0A13-\u0A28"); 


                    }
                    break;
                case 60 :
                    // InternalGo.g:8223:857: '\\u0A2A-\\u0A30'
                    {
                    match("\u0A2A-\u0A30"); 


                    }
                    break;
                case 61 :
                    // InternalGo.g:8223:873: '\\u0A32-\\u0A33'
                    {
                    match("\u0A32-\u0A33"); 


                    }
                    break;
                case 62 :
                    // InternalGo.g:8223:889: '\\u0A35-\\u0A36'
                    {
                    match("\u0A35-\u0A36"); 


                    }
                    break;
                case 63 :
                    // InternalGo.g:8223:905: '\\u0A38-\\u0A39'
                    {
                    match("\u0A38-\u0A39"); 


                    }
                    break;
                case 64 :
                    // InternalGo.g:8223:921: '\\u0A59-\\u0A5C'
                    {
                    match("\u0A59-\u0A5C"); 


                    }
                    break;
                case 65 :
                    // InternalGo.g:8223:937: '\\u0A5E'
                    {
                    match('\u0A5E'); 

                    }
                    break;
                case 66 :
                    // InternalGo.g:8223:946: '\\u0A72-\\u0A74'
                    {
                    match("\u0A72-\u0A74"); 


                    }
                    break;
                case 67 :
                    // InternalGo.g:8223:962: '\\u0A85-\\u0A8B'
                    {
                    match("\u0A85-\u0A8B"); 


                    }
                    break;
                case 68 :
                    // InternalGo.g:8223:978: '\\u0A8D'
                    {
                    match('\u0A8D'); 

                    }
                    break;
                case 69 :
                    // InternalGo.g:8223:987: '\\u0A8F-\\u0A91'
                    {
                    match("\u0A8F-\u0A91"); 


                    }
                    break;
                case 70 :
                    // InternalGo.g:8223:1003: '\\u0A93-\\u0AA8'
                    {
                    match("\u0A93-\u0AA8"); 


                    }
                    break;
                case 71 :
                    // InternalGo.g:8223:1019: '\\u0AAA-\\u0AB0'
                    {
                    match("\u0AAA-\u0AB0"); 


                    }
                    break;
                case 72 :
                    // InternalGo.g:8223:1035: '\\u0AB2-\\u0AB3'
                    {
                    match("\u0AB2-\u0AB3"); 


                    }
                    break;
                case 73 :
                    // InternalGo.g:8223:1051: '\\u0AB5-\\u0AB9'
                    {
                    match("\u0AB5-\u0AB9"); 


                    }
                    break;
                case 74 :
                    // InternalGo.g:8223:1067: '\\u0ABD'
                    {
                    match('\u0ABD'); 

                    }
                    break;
                case 75 :
                    // InternalGo.g:8223:1076: '\\u0AD0'
                    {
                    match('\u0AD0'); 

                    }
                    break;
                case 76 :
                    // InternalGo.g:8223:1085: '\\u0AE0'
                    {
                    match('\u0AE0'); 

                    }
                    break;
                case 77 :
                    // InternalGo.g:8223:1094: '\\u0B05-\\u0B0C'
                    {
                    match("\u0B05-\u0B0C"); 


                    }
                    break;
                case 78 :
                    // InternalGo.g:8223:1110: '\\u0B0F-\\u0B10'
                    {
                    match("\u0B0F-\u0B10"); 


                    }
                    break;
                case 79 :
                    // InternalGo.g:8223:1126: '\\u0B13-\\u0B28'
                    {
                    match("\u0B13-\u0B28"); 


                    }
                    break;
                case 80 :
                    // InternalGo.g:8223:1142: '\\u0B2A-\\u0B30'
                    {
                    match("\u0B2A-\u0B30"); 


                    }
                    break;
                case 81 :
                    // InternalGo.g:8223:1158: '\\u0B32-\\u0B33'
                    {
                    match("\u0B32-\u0B33"); 


                    }
                    break;
                case 82 :
                    // InternalGo.g:8223:1174: '\\u0B36-\\u0B39'
                    {
                    match("\u0B36-\u0B39"); 


                    }
                    break;
                case 83 :
                    // InternalGo.g:8223:1190: '\\u0B3D'
                    {
                    match('\u0B3D'); 

                    }
                    break;
                case 84 :
                    // InternalGo.g:8223:1199: '\\u0B5C-\\u0B5D'
                    {
                    match("\u0B5C-\u0B5D"); 


                    }
                    break;
                case 85 :
                    // InternalGo.g:8223:1215: '\\u0B5F-\\u0B61'
                    {
                    match("\u0B5F-\u0B61"); 


                    }
                    break;
                case 86 :
                    // InternalGo.g:8223:1231: '\\u0B85-\\u0B8A'
                    {
                    match("\u0B85-\u0B8A"); 


                    }
                    break;
                case 87 :
                    // InternalGo.g:8223:1247: '\\u0B8E-\\u0B90'
                    {
                    match("\u0B8E-\u0B90"); 


                    }
                    break;
                case 88 :
                    // InternalGo.g:8223:1263: '\\u0B92-\\u0B95'
                    {
                    match("\u0B92-\u0B95"); 


                    }
                    break;
                case 89 :
                    // InternalGo.g:8223:1279: '\\u0B99-\\u0B9A'
                    {
                    match("\u0B99-\u0B9A"); 


                    }
                    break;
                case 90 :
                    // InternalGo.g:8223:1295: '\\u0B9C'
                    {
                    match('\u0B9C'); 

                    }
                    break;
                case 91 :
                    // InternalGo.g:8223:1304: '\\u0B9E-\\u0B9F'
                    {
                    match("\u0B9E-\u0B9F"); 


                    }
                    break;
                case 92 :
                    // InternalGo.g:8223:1320: '\\u0BA3-\\u0BA4'
                    {
                    match("\u0BA3-\u0BA4"); 


                    }
                    break;
                case 93 :
                    // InternalGo.g:8223:1336: '\\u0BA8-\\u0BAA'
                    {
                    match("\u0BA8-\u0BAA"); 


                    }
                    break;
                case 94 :
                    // InternalGo.g:8223:1352: '\\u0BAE-\\u0BB5'
                    {
                    match("\u0BAE-\u0BB5"); 


                    }
                    break;
                case 95 :
                    // InternalGo.g:8223:1368: '\\u0BB7-\\u0BB9'
                    {
                    match("\u0BB7-\u0BB9"); 


                    }
                    break;
                case 96 :
                    // InternalGo.g:8223:1384: '\\u0C05-\\u0C0C'
                    {
                    match("\u0C05-\u0C0C"); 


                    }
                    break;
                case 97 :
                    // InternalGo.g:8223:1400: '\\u0C0E-\\u0C10'
                    {
                    match("\u0C0E-\u0C10"); 


                    }
                    break;
                case 98 :
                    // InternalGo.g:8223:1416: '\\u0C12-\\u0C28'
                    {
                    match("\u0C12-\u0C28"); 


                    }
                    break;
                case 99 :
                    // InternalGo.g:8223:1432: '\\u0C2A-\\u0C33'
                    {
                    match("\u0C2A-\u0C33"); 


                    }
                    break;
                case 100 :
                    // InternalGo.g:8223:1448: '\\u0C35-\\u0C39'
                    {
                    match("\u0C35-\u0C39"); 


                    }
                    break;
                case 101 :
                    // InternalGo.g:8223:1464: '\\u0C60-\\u0C61'
                    {
                    match("\u0C60-\u0C61"); 


                    }
                    break;
                case 102 :
                    // InternalGo.g:8223:1480: '\\u0C85-\\u0C8C'
                    {
                    match("\u0C85-\u0C8C"); 


                    }
                    break;
                case 103 :
                    // InternalGo.g:8223:1496: '\\u0C8E-\\u0C90'
                    {
                    match("\u0C8E-\u0C90"); 


                    }
                    break;
                case 104 :
                    // InternalGo.g:8223:1512: '\\u0C92-\\u0CA8'
                    {
                    match("\u0C92-\u0CA8"); 


                    }
                    break;
                case 105 :
                    // InternalGo.g:8223:1528: '\\u0CAA-\\u0CB3'
                    {
                    match("\u0CAA-\u0CB3"); 


                    }
                    break;
                case 106 :
                    // InternalGo.g:8223:1544: '\\u0CB5-\\u0CB9'
                    {
                    match("\u0CB5-\u0CB9"); 


                    }
                    break;
                case 107 :
                    // InternalGo.g:8223:1560: '\\u0CDE'
                    {
                    match('\u0CDE'); 

                    }
                    break;
                case 108 :
                    // InternalGo.g:8223:1569: '\\u0CE0-\\u0CE1'
                    {
                    match("\u0CE0-\u0CE1"); 


                    }
                    break;
                case 109 :
                    // InternalGo.g:8223:1585: '\\u0D05-\\u0D0C'
                    {
                    match("\u0D05-\u0D0C"); 


                    }
                    break;
                case 110 :
                    // InternalGo.g:8223:1601: '\\u0D0E-\\u0D10'
                    {
                    match("\u0D0E-\u0D10"); 


                    }
                    break;
                case 111 :
                    // InternalGo.g:8223:1617: '\\u0D12-\\u0D28'
                    {
                    match("\u0D12-\u0D28"); 


                    }
                    break;
                case 112 :
                    // InternalGo.g:8223:1633: '\\u0D2A-\\u0D39'
                    {
                    match("\u0D2A-\u0D39"); 


                    }
                    break;
                case 113 :
                    // InternalGo.g:8223:1649: '\\u0D60-\\u0D61'
                    {
                    match("\u0D60-\u0D61"); 


                    }
                    break;
                case 114 :
                    // InternalGo.g:8223:1665: '\\u0D85-\\u0D96'
                    {
                    match("\u0D85-\u0D96"); 


                    }
                    break;
                case 115 :
                    // InternalGo.g:8223:1681: '\\u0D9A-\\u0DB1'
                    {
                    match("\u0D9A-\u0DB1"); 


                    }
                    break;
                case 116 :
                    // InternalGo.g:8223:1697: '\\u0DB3-\\u0DBB'
                    {
                    match("\u0DB3-\u0DBB"); 


                    }
                    break;
                case 117 :
                    // InternalGo.g:8223:1713: '\\u0DBD'
                    {
                    match('\u0DBD'); 

                    }
                    break;
                case 118 :
                    // InternalGo.g:8223:1722: '\\u0DC0-\\u0DC6'
                    {
                    match("\u0DC0-\u0DC6"); 


                    }
                    break;
                case 119 :
                    // InternalGo.g:8223:1738: '\\u0E01-\\u0E30'
                    {
                    match("\u0E01-\u0E30"); 


                    }
                    break;
                case 120 :
                    // InternalGo.g:8223:1754: '\\u0E32-\\u0E33'
                    {
                    match("\u0E32-\u0E33"); 


                    }
                    break;
                case 121 :
                    // InternalGo.g:8223:1770: '\\u0E40-\\u0E46'
                    {
                    match("\u0E40-\u0E46"); 


                    }
                    break;
                case 122 :
                    // InternalGo.g:8223:1786: '\\u0E81-\\u0E82'
                    {
                    match("\u0E81-\u0E82"); 


                    }
                    break;
                case 123 :
                    // InternalGo.g:8223:1802: '\\u0E84'
                    {
                    match('\u0E84'); 

                    }
                    break;
                case 124 :
                    // InternalGo.g:8223:1811: '\\u0E87-\\u0E88'
                    {
                    match("\u0E87-\u0E88"); 


                    }
                    break;
                case 125 :
                    // InternalGo.g:8223:1827: '\\u0E8A'
                    {
                    match('\u0E8A'); 

                    }
                    break;
                case 126 :
                    // InternalGo.g:8223:1836: '\\u0E8D'
                    {
                    match('\u0E8D'); 

                    }
                    break;
                case 127 :
                    // InternalGo.g:8223:1845: '\\u0E94-\\u0E97'
                    {
                    match("\u0E94-\u0E97"); 


                    }
                    break;
                case 128 :
                    // InternalGo.g:8223:1861: '\\u0E99-\\u0E9F'
                    {
                    match("\u0E99-\u0E9F"); 


                    }
                    break;
                case 129 :
                    // InternalGo.g:8223:1877: '\\u0EA1-\\u0EA3'
                    {
                    match("\u0EA1-\u0EA3"); 


                    }
                    break;
                case 130 :
                    // InternalGo.g:8223:1893: '\\u0EA5'
                    {
                    match('\u0EA5'); 

                    }
                    break;
                case 131 :
                    // InternalGo.g:8223:1902: '\\u0EA7'
                    {
                    match('\u0EA7'); 

                    }
                    break;
                case 132 :
                    // InternalGo.g:8223:1911: '\\u0EAA-\\u0EAB'
                    {
                    match("\u0EAA-\u0EAB"); 


                    }
                    break;
                case 133 :
                    // InternalGo.g:8223:1927: '\\u0EAD-\\u0EB0'
                    {
                    match("\u0EAD-\u0EB0"); 


                    }
                    break;
                case 134 :
                    // InternalGo.g:8223:1943: '\\u0EB2-\\u0EB3'
                    {
                    match("\u0EB2-\u0EB3"); 


                    }
                    break;
                case 135 :
                    // InternalGo.g:8223:1959: '\\u0EBD-\\u0EC4'
                    {
                    match("\u0EBD-\u0EC4"); 


                    }
                    break;
                case 136 :
                    // InternalGo.g:8223:1975: '\\u0EC6'
                    {
                    match('\u0EC6'); 

                    }
                    break;
                case 137 :
                    // InternalGo.g:8223:1984: '\\u0EDC-\\u0EDD'
                    {
                    match("\u0EDC-\u0EDD"); 


                    }
                    break;
                case 138 :
                    // InternalGo.g:8223:2000: '\\u0F00'
                    {
                    match('\u0F00'); 

                    }
                    break;
                case 139 :
                    // InternalGo.g:8223:2009: '\\u0F40-\\u0F6A'
                    {
                    match("\u0F40-\u0F6A"); 


                    }
                    break;
                case 140 :
                    // InternalGo.g:8223:2025: '\\u0F88-\\u0F8B'
                    {
                    match("\u0F88-\u0F8B"); 


                    }
                    break;
                case 141 :
                    // InternalGo.g:8223:2041: '\\u1000-\\u1021'
                    {
                    match("\u1000-\u1021"); 


                    }
                    break;
                case 142 :
                    // InternalGo.g:8223:2057: '\\u1023-\\u1027'
                    {
                    match("\u1023-\u1027"); 


                    }
                    break;
                case 143 :
                    // InternalGo.g:8223:2073: '\\u1029-\\u102A'
                    {
                    match("\u1029-\u102A"); 


                    }
                    break;
                case 144 :
                    // InternalGo.g:8223:2089: '\\u1050-\\u1055'
                    {
                    match("\u1050-\u1055"); 


                    }
                    break;
                case 145 :
                    // InternalGo.g:8223:2105: '\\u10A0-\\u10C5'
                    {
                    match("\u10A0-\u10C5"); 


                    }
                    break;
                case 146 :
                    // InternalGo.g:8223:2121: '\\u10D0-\\u10F6'
                    {
                    match("\u10D0-\u10F6"); 


                    }
                    break;
                case 147 :
                    // InternalGo.g:8223:2137: '\\u1100-\\u1159'
                    {
                    match("\u1100-\u1159"); 


                    }
                    break;
                case 148 :
                    // InternalGo.g:8223:2153: '\\u115F-\\u11A2'
                    {
                    match("\u115F-\u11A2"); 


                    }
                    break;
                case 149 :
                    // InternalGo.g:8223:2169: '\\u11A8-\\u11F9'
                    {
                    match("\u11A8-\u11F9"); 


                    }
                    break;
                case 150 :
                    // InternalGo.g:8223:2185: '\\u1200-\\u1206'
                    {
                    match("\u1200-\u1206"); 


                    }
                    break;
                case 151 :
                    // InternalGo.g:8223:2201: '\\u1208-\\u1246'
                    {
                    match("\u1208-\u1246"); 


                    }
                    break;
                case 152 :
                    // InternalGo.g:8223:2217: '\\u1248'
                    {
                    match('\u1248'); 

                    }
                    break;
                case 153 :
                    // InternalGo.g:8223:2226: '\\u124A-\\u124D'
                    {
                    match("\u124A-\u124D"); 


                    }
                    break;
                case 154 :
                    // InternalGo.g:8223:2242: '\\u1250-\\u1256'
                    {
                    match("\u1250-\u1256"); 


                    }
                    break;
                case 155 :
                    // InternalGo.g:8223:2258: '\\u1258'
                    {
                    match('\u1258'); 

                    }
                    break;
                case 156 :
                    // InternalGo.g:8223:2267: '\\u125A-\\u125D'
                    {
                    match("\u125A-\u125D"); 


                    }
                    break;
                case 157 :
                    // InternalGo.g:8223:2283: '\\u1260-\\u1286'
                    {
                    match("\u1260-\u1286"); 


                    }
                    break;
                case 158 :
                    // InternalGo.g:8223:2299: '\\u1288'
                    {
                    match('\u1288'); 

                    }
                    break;
                case 159 :
                    // InternalGo.g:8223:2308: '\\u128A-\\u128D'
                    {
                    match("\u128A-\u128D"); 


                    }
                    break;
                case 160 :
                    // InternalGo.g:8223:2324: '\\u1290-\\u12AE'
                    {
                    match("\u1290-\u12AE"); 


                    }
                    break;
                case 161 :
                    // InternalGo.g:8223:2340: '\\u12B0'
                    {
                    match('\u12B0'); 

                    }
                    break;
                case 162 :
                    // InternalGo.g:8223:2349: '\\u12B2-\\u12B5'
                    {
                    match("\u12B2-\u12B5"); 


                    }
                    break;
                case 163 :
                    // InternalGo.g:8223:2365: '\\u12B8-\\u12BE'
                    {
                    match("\u12B8-\u12BE"); 


                    }
                    break;
                case 164 :
                    // InternalGo.g:8223:2381: '\\u12C0'
                    {
                    match('\u12C0'); 

                    }
                    break;
                case 165 :
                    // InternalGo.g:8223:2390: '\\u12C2-\\u12C5'
                    {
                    match("\u12C2-\u12C5"); 


                    }
                    break;
                case 166 :
                    // InternalGo.g:8223:2406: '\\u12C8-\\u12CE'
                    {
                    match("\u12C8-\u12CE"); 


                    }
                    break;
                case 167 :
                    // InternalGo.g:8223:2422: '\\u12D0-\\u12D6'
                    {
                    match("\u12D0-\u12D6"); 


                    }
                    break;
                case 168 :
                    // InternalGo.g:8223:2438: '\\u12D8-\\u12EE'
                    {
                    match("\u12D8-\u12EE"); 


                    }
                    break;
                case 169 :
                    // InternalGo.g:8223:2454: '\\u12F0-\\u130E'
                    {
                    match("\u12F0-\u130E"); 


                    }
                    break;
                case 170 :
                    // InternalGo.g:8223:2470: '\\u1310'
                    {
                    match('\u1310'); 

                    }
                    break;
                case 171 :
                    // InternalGo.g:8223:2479: '\\u1312-\\u1315'
                    {
                    match("\u1312-\u1315"); 


                    }
                    break;
                case 172 :
                    // InternalGo.g:8223:2495: '\\u1318-\\u131E'
                    {
                    match("\u1318-\u131E"); 


                    }
                    break;
                case 173 :
                    // InternalGo.g:8223:2511: '\\u1320-\\u1346'
                    {
                    match("\u1320-\u1346"); 


                    }
                    break;
                case 174 :
                    // InternalGo.g:8223:2527: '\\u1348-\\u135A'
                    {
                    match("\u1348-\u135A"); 


                    }
                    break;
                case 175 :
                    // InternalGo.g:8223:2543: '\\u13A0-\\u13B0'
                    {
                    match("\u13A0-\u13B0"); 


                    }
                    break;
                case 176 :
                    // InternalGo.g:8223:2559: '\\u13B1-\\u13F4'
                    {
                    match("\u13B1-\u13F4"); 


                    }
                    break;
                case 177 :
                    // InternalGo.g:8223:2575: '\\u1401-\\u1676'
                    {
                    match("\u1401-\u1676"); 


                    }
                    break;
                case 178 :
                    // InternalGo.g:8223:2591: '\\u1681-\\u169A'
                    {
                    match("\u1681-\u169A"); 


                    }
                    break;
                case 179 :
                    // InternalGo.g:8223:2607: '\\u16A0-\\u16EA'
                    {
                    match("\u16A0-\u16EA"); 


                    }
                    break;
                case 180 :
                    // InternalGo.g:8223:2623: '\\u1780-\\u17B3'
                    {
                    match("\u1780-\u17B3"); 


                    }
                    break;
                case 181 :
                    // InternalGo.g:8223:2639: '\\u1820-\\u1877'
                    {
                    match("\u1820-\u1877"); 


                    }
                    break;
                case 182 :
                    // InternalGo.g:8223:2655: '\\u1880-\\u18A8'
                    {
                    match("\u1880-\u18A8"); 


                    }
                    break;
                case 183 :
                    // InternalGo.g:8223:2671: '\\u1E00-\\u1E9B'
                    {
                    match("\u1E00-\u1E9B"); 


                    }
                    break;
                case 184 :
                    // InternalGo.g:8223:2687: '\\u1EA0-\\u1EE0'
                    {
                    match("\u1EA0-\u1EE0"); 


                    }
                    break;
                case 185 :
                    // InternalGo.g:8223:2703: '\\u1EE1-\\u1EF9'
                    {
                    match("\u1EE1-\u1EF9"); 


                    }
                    break;
                case 186 :
                    // InternalGo.g:8223:2719: '\\u1F00-\\u1F15'
                    {
                    match("\u1F00-\u1F15"); 


                    }
                    break;
                case 187 :
                    // InternalGo.g:8223:2735: '\\u1F18-\\u1F1D'
                    {
                    match("\u1F18-\u1F1D"); 


                    }
                    break;
                case 188 :
                    // InternalGo.g:8223:2751: '\\u1F20-\\u1F39'
                    {
                    match("\u1F20-\u1F39"); 


                    }
                    break;
                case 189 :
                    // InternalGo.g:8223:2767: '\\u1F3A-\\u1F45'
                    {
                    match("\u1F3A-\u1F45"); 


                    }
                    break;
                case 190 :
                    // InternalGo.g:8223:2783: '\\u1F48-\\u1F4D'
                    {
                    match("\u1F48-\u1F4D"); 


                    }
                    break;
                case 191 :
                    // InternalGo.g:8223:2799: '\\u1F50-\\u1F57'
                    {
                    match("\u1F50-\u1F57"); 


                    }
                    break;
                case 192 :
                    // InternalGo.g:8223:2815: '\\u1F59'
                    {
                    match('\u1F59'); 

                    }
                    break;
                case 193 :
                    // InternalGo.g:8223:2824: '\\u1F5B'
                    {
                    match('\u1F5B'); 

                    }
                    break;
                case 194 :
                    // InternalGo.g:8223:2833: '\\u1F5D'
                    {
                    match('\u1F5D'); 

                    }
                    break;
                case 195 :
                    // InternalGo.g:8223:2842: '\\u1F5F-\\u1F7D'
                    {
                    match("\u1F5F-\u1F7D"); 


                    }
                    break;
                case 196 :
                    // InternalGo.g:8223:2858: '\\u1F80-\\u1FB4'
                    {
                    match("\u1F80-\u1FB4"); 


                    }
                    break;
                case 197 :
                    // InternalGo.g:8223:2874: '\\u1FB6-\\u1FBC'
                    {
                    match("\u1FB6-\u1FBC"); 


                    }
                    break;
                case 198 :
                    // InternalGo.g:8223:2890: '\\u1FBE'
                    {
                    match('\u1FBE'); 

                    }
                    break;
                case 199 :
                    // InternalGo.g:8223:2899: '\\u1FC2-\\u1FC4'
                    {
                    match("\u1FC2-\u1FC4"); 


                    }
                    break;
                case 200 :
                    // InternalGo.g:8223:2915: '\\u1FC6-\\u1FCC'
                    {
                    match("\u1FC6-\u1FCC"); 


                    }
                    break;
                case 201 :
                    // InternalGo.g:8223:2931: '\\u1FD0-\\u1FD3'
                    {
                    match("\u1FD0-\u1FD3"); 


                    }
                    break;
                case 202 :
                    // InternalGo.g:8223:2947: '\\u1FD6-\\u1FDB'
                    {
                    match("\u1FD6-\u1FDB"); 


                    }
                    break;
                case 203 :
                    // InternalGo.g:8223:2963: '\\u1FE0-\\u1FEC'
                    {
                    match("\u1FE0-\u1FEC"); 


                    }
                    break;
                case 204 :
                    // InternalGo.g:8223:2979: '\\u1FF2-\\u1FF4'
                    {
                    match("\u1FF2-\u1FF4"); 


                    }
                    break;
                case 205 :
                    // InternalGo.g:8223:2995: '\\u1FF6-\\u1FFC'
                    {
                    match("\u1FF6-\u1FFC"); 


                    }
                    break;
                case 206 :
                    // InternalGo.g:8223:3011: '\\u207F'
                    {
                    match('\u207F'); 

                    }
                    break;
                case 207 :
                    // InternalGo.g:8223:3020: '\\u2102'
                    {
                    match('\u2102'); 

                    }
                    break;
                case 208 :
                    // InternalGo.g:8223:3029: '\\u2107'
                    {
                    match('\u2107'); 

                    }
                    break;
                case 209 :
                    // InternalGo.g:8223:3038: '\\u210A-\\u2113'
                    {
                    match("\u210A-\u2113"); 


                    }
                    break;
                case 210 :
                    // InternalGo.g:8223:3054: '\\u2115'
                    {
                    match('\u2115'); 

                    }
                    break;
                case 211 :
                    // InternalGo.g:8223:3063: '\\u2119-\\u211D'
                    {
                    match("\u2119-\u211D"); 


                    }
                    break;
                case 212 :
                    // InternalGo.g:8223:3079: '\\u2124'
                    {
                    match('\u2124'); 

                    }
                    break;
                case 213 :
                    // InternalGo.g:8223:3088: '\\u2126'
                    {
                    match('\u2126'); 

                    }
                    break;
                case 214 :
                    // InternalGo.g:8223:3097: '\\u2128'
                    {
                    match('\u2128'); 

                    }
                    break;
                case 215 :
                    // InternalGo.g:8223:3106: '\\u212A-\\u212D'
                    {
                    match("\u212A-\u212D"); 


                    }
                    break;
                case 216 :
                    // InternalGo.g:8223:3122: '\\u212F-\\u2131'
                    {
                    match("\u212F-\u2131"); 


                    }
                    break;
                case 217 :
                    // InternalGo.g:8223:3138: '\\u2133-\\u2139'
                    {
                    match("\u2133-\u2139"); 


                    }
                    break;
                case 218 :
                    // InternalGo.g:8223:3154: '\\u2160-\\u2183'
                    {
                    match("\u2160-\u2183"); 


                    }
                    break;
                case 219 :
                    // InternalGo.g:8223:3170: '\\u3005-\\u3007'
                    {
                    match("\u3005-\u3007"); 


                    }
                    break;
                case 220 :
                    // InternalGo.g:8223:3186: '\\u3021-\\u3029'
                    {
                    match("\u3021-\u3029"); 


                    }
                    break;
                case 221 :
                    // InternalGo.g:8223:3202: '\\u3031-\\u3035'
                    {
                    match("\u3031-\u3035"); 


                    }
                    break;
                case 222 :
                    // InternalGo.g:8223:3218: '\\u3038-\\u303A'
                    {
                    match("\u3038-\u303A"); 


                    }
                    break;
                case 223 :
                    // InternalGo.g:8223:3234: '\\u3041-\\u3094'
                    {
                    match("\u3041-\u3094"); 


                    }
                    break;
                case 224 :
                    // InternalGo.g:8223:3250: '\\u309D-\\u309E'
                    {
                    match("\u309D-\u309E"); 


                    }
                    break;
                case 225 :
                    // InternalGo.g:8223:3266: '\\u30A1-\\u30FA'
                    {
                    match("\u30A1-\u30FA"); 


                    }
                    break;
                case 226 :
                    // InternalGo.g:8223:3282: '\\u30FC-\\u30FE'
                    {
                    match("\u30FC-\u30FE"); 


                    }
                    break;
                case 227 :
                    // InternalGo.g:8223:3298: '\\u3105-\\u312C'
                    {
                    match("\u3105-\u312C"); 


                    }
                    break;
                case 228 :
                    // InternalGo.g:8223:3314: '\\u3131-\\u318E'
                    {
                    match("\u3131-\u318E"); 


                    }
                    break;
                case 229 :
                    // InternalGo.g:8223:3330: '\\u31A0-\\u31B7'
                    {
                    match("\u31A0-\u31B7"); 


                    }
                    break;
                case 230 :
                    // InternalGo.g:8223:3346: '\\u3400'
                    {
                    match('\u3400'); 

                    }
                    break;
                case 231 :
                    // InternalGo.g:8223:3355: '\\u4DB5'
                    {
                    match('\u4DB5'); 

                    }
                    break;
                case 232 :
                    // InternalGo.g:8223:3364: '\\u4E00'
                    {
                    match('\u4E00'); 

                    }
                    break;
                case 233 :
                    // InternalGo.g:8223:3373: '\\u9FA5'
                    {
                    match('\u9FA5'); 

                    }
                    break;
                case 234 :
                    // InternalGo.g:8223:3382: '\\uA000-\\uA48C'
                    {
                    match("\uA000-\uA48C"); 


                    }
                    break;
                case 235 :
                    // InternalGo.g:8223:3398: '\\uAC00'
                    {
                    match('\uAC00'); 

                    }
                    break;
                case 236 :
                    // InternalGo.g:8223:3407: '\\uD7A3'
                    {
                    match('\uD7A3'); 

                    }
                    break;
                case 237 :
                    // InternalGo.g:8223:3416: '\\uF900-\\uFA2D'
                    {
                    match("\uF900-\uFA2D"); 


                    }
                    break;
                case 238 :
                    // InternalGo.g:8223:3432: '\\uFB00-\\uFB06'
                    {
                    match("\uFB00-\uFB06"); 


                    }
                    break;
                case 239 :
                    // InternalGo.g:8223:3448: '\\uFB13-\\uFB17'
                    {
                    match("\uFB13-\uFB17"); 


                    }
                    break;
                case 240 :
                    // InternalGo.g:8223:3464: '\\uFB1D'
                    {
                    match('\uFB1D'); 

                    }
                    break;
                case 241 :
                    // InternalGo.g:8223:3473: '\\uFB1F-\\uFB28'
                    {
                    match("\uFB1F-\uFB28"); 


                    }
                    break;
                case 242 :
                    // InternalGo.g:8223:3489: '\\uFB2A-\\uFB36'
                    {
                    match("\uFB2A-\uFB36"); 


                    }
                    break;
                case 243 :
                    // InternalGo.g:8223:3505: '\\uFB38-\\uFB3C'
                    {
                    match("\uFB38-\uFB3C"); 


                    }
                    break;
                case 244 :
                    // InternalGo.g:8223:3521: '\\uFB3E'
                    {
                    match('\uFB3E'); 

                    }
                    break;
                case 245 :
                    // InternalGo.g:8223:3530: '\\uFB40-\\uFB41'
                    {
                    match("\uFB40-\uFB41"); 


                    }
                    break;
                case 246 :
                    // InternalGo.g:8223:3546: '\\uFB43-\\uFB44'
                    {
                    match("\uFB43-\uFB44"); 


                    }
                    break;
                case 247 :
                    // InternalGo.g:8223:3562: '\\uFB46-\\uFBB1'
                    {
                    match("\uFB46-\uFBB1"); 


                    }
                    break;
                case 248 :
                    // InternalGo.g:8223:3578: '\\uFBD3-\\uFD3D'
                    {
                    match("\uFBD3-\uFD3D"); 


                    }
                    break;
                case 249 :
                    // InternalGo.g:8223:3594: '\\uFD50-\\uFD8F'
                    {
                    match("\uFD50-\uFD8F"); 


                    }
                    break;
                case 250 :
                    // InternalGo.g:8223:3610: '\\uFD92-\\uFDC7'
                    {
                    match("\uFD92-\uFDC7"); 


                    }
                    break;
                case 251 :
                    // InternalGo.g:8223:3626: '\\uFDF0-\\uFDFB'
                    {
                    match("\uFDF0-\uFDFB"); 


                    }
                    break;
                case 252 :
                    // InternalGo.g:8223:3642: '\\uFE70-\\uFE72'
                    {
                    match("\uFE70-\uFE72"); 


                    }
                    break;
                case 253 :
                    // InternalGo.g:8223:3658: '\\uFE74'
                    {
                    match('\uFE74'); 

                    }
                    break;
                case 254 :
                    // InternalGo.g:8223:3667: '\\uFE76-\\uFEFC'
                    {
                    match("\uFE76-\uFEFC"); 


                    }
                    break;
                case 255 :
                    // InternalGo.g:8223:3683: '\\uFF21-\\uFF3A'
                    {
                    match("\uFF21-\uFF3A"); 


                    }
                    break;
                case 256 :
                    // InternalGo.g:8223:3699: '\\uFF41-\\uFF5A'
                    {
                    match("\uFF41-\uFF5A"); 


                    }
                    break;
                case 257 :
                    // InternalGo.g:8223:3715: '\\uFF66-\\uFFBE'
                    {
                    match("\uFF66-\uFFBE"); 


                    }
                    break;
                case 258 :
                    // InternalGo.g:8223:3731: '\\uFFC2-\\uFFC7'
                    {
                    match("\uFFC2-\uFFC7"); 


                    }
                    break;
                case 259 :
                    // InternalGo.g:8223:3747: '\\uFFCA-\\uFFCF'
                    {
                    match("\uFFCA-\uFFCF"); 


                    }
                    break;
                case 260 :
                    // InternalGo.g:8223:3763: '\\uFFD2-\\uFFD7'
                    {
                    match("\uFFD2-\uFFD7"); 


                    }
                    break;
                case 261 :
                    // InternalGo.g:8223:3779: '\\uFFDA-\\uFFDC'
                    {
                    match("\uFFDA-\uFFDC"); 


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
    // $ANTLR end "RULE_UNICODE_LETTER"

    // $ANTLR start "RULE_LITERAL_TYPE"
    public final void mRULE_LITERAL_TYPE() throws RecognitionException {
        try {
            int _type = RULE_LITERAL_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8225:19: ( ( 'int' | 'float' | 'bool' | 'string' ) )
            // InternalGo.g:8225:21: ( 'int' | 'float' | 'bool' | 'string' )
            {
            // InternalGo.g:8225:21: ( 'int' | 'float' | 'bool' | 'string' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt2=1;
                }
                break;
            case 'f':
                {
                alt2=2;
                }
                break;
            case 'b':
                {
                alt2=3;
                }
                break;
            case 's':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:8225:22: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8225:28: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8225:36: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:8225:43: 'string'
                    {
                    match("string"); 


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
    // $ANTLR end "RULE_LITERAL_TYPE"

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8227:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_MUL_OP | RULE_ADD_OP ) )
            // InternalGo.g:8227:18: ( '||' | '&&' | RULE_REL_OP | RULE_MUL_OP | RULE_ADD_OP )
            {
            // InternalGo.g:8227:18: ( '||' | '&&' | RULE_REL_OP | RULE_MUL_OP | RULE_ADD_OP )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:8227:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8227:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8227:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8227:41: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8227:53: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

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
            // InternalGo.g:8229:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:8229:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:8229:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt4=1;
                }
                break;
            case '!':
                {
                alt4=2;
                }
                break;
            case '<':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=3;}
                }
                break;
            case '>':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='=') ) {
                    alt4=6;
                }
                else {
                    alt4=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:8229:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8229:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8229:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8229:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8229:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8229:48: '>='
                    {
                    match(">="); 


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
            // InternalGo.g:8231:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:8231:24: ( '+' | '-' | '|' | '^' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='^'||input.LA(1)=='|' ) {
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
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            // InternalGo.g:8233:22: ( ( RULE_MUL | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:8233:24: ( RULE_MUL | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:8233:24: ( RULE_MUL | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalGo.g:8233:25: RULE_MUL
                    {
                    mRULE_MUL(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8233:34: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8233:38: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8233:42: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8233:47: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8233:52: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8233:56: '&^'
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

    // $ANTLR start "RULE_MUL"
    public final void mRULE_MUL() throws RecognitionException {
        try {
            // InternalGo.g:8235:19: ( '*' )
            // InternalGo.g:8235:21: '*'
            {
            match('*'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL"

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8237:15: ( ( '+' | '-' | '!' | '^' | RULE_MUL | '&' | '<-' ) )
            // InternalGo.g:8237:17: ( '+' | '-' | '!' | '^' | RULE_MUL | '&' | '<-' )
            {
            // InternalGo.g:8237:17: ( '+' | '-' | '!' | '^' | RULE_MUL | '&' | '<-' )
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
                    // InternalGo.g:8237:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8237:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8237:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8237:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8237:34: RULE_MUL
                    {
                    mRULE_MUL(); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8237:43: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8237:47: '<-'
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

    // $ANTLR start "RULE_ASSING_OP"
    public final void mRULE_ASSING_OP() throws RecognitionException {
        try {
            int _type = RULE_ASSING_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8239:16: ( ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' ) )
            // InternalGo.g:8239:18: ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' )
            {
            // InternalGo.g:8239:18: ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '+':
                {
                alt7=2;
                }
                break;
            case '-':
                {
                alt7=3;
                }
                break;
            case '*':
                {
                alt7=4;
                }
                break;
            case '^':
                {
                alt7=5;
                }
                break;
            case ':':
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:8239:19: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8239:23: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8239:28: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:8239:33: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8239:38: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8239:43: ':='
                    {
                    match(":="); 


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
    // $ANTLR end "RULE_ASSING_OP"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:8241:29: ( RULE_INT )
            // InternalGo.g:8241:31: RULE_INT
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
            // InternalGo.g:8243:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // InternalGo.g:8243:29: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )
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
            // InternalGo.g:8245:25: ( ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) ) )
            // InternalGo.g:8245:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )
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

    // $ANTLR start "RULE_BOOLEAN_LIT"
    public final void mRULE_BOOLEAN_LIT() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8247:18: ( ( 'true' | 'false' ) )
            // InternalGo.g:8247:20: ( 'true' | 'false' )
            {
            // InternalGo.g:8247:20: ( 'true' | 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='t') ) {
                alt8=1;
            }
            else if ( (LA8_0=='f') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:8247:21: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8247:28: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN_LIT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8249:17: ( RULE_ID )
            // InternalGo.g:8249:19: RULE_ID
            {
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_FLOAT_LIT"
    public final void mRULE_FLOAT_LIT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8251:16: ( ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? ) )
            // InternalGo.g:8251:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            {
            // InternalGo.g:8251:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalGo.g:8251:19: RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )?
                    {
                    mRULE_DECIMAL_LIT(); 
                    match('.'); 
                    // InternalGo.g:8251:40: ( RULE_DECIMAL_LIT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGo.g:8251:40: RULE_DECIMAL_LIT
                            {
                            mRULE_DECIMAL_LIT(); 

                            }
                            break;

                    }

                    // InternalGo.g:8251:58: ( RULE_EXPOENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:8251:58: RULE_EXPOENT
                            {
                            mRULE_EXPOENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:8251:72: RULE_DECIMALS RULE_EXPOENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPOENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8251:99: '.' RULE_DECIMALS ( RULE_EXPOENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:8251:117: ( RULE_EXPOENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGo.g:8251:117: RULE_EXPOENT
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

    // $ANTLR start "RULE_INT_LIT"
    public final void mRULE_INT_LIT() throws RecognitionException {
        try {
            int _type = RULE_INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8253:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:8253:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:8253:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='0') ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2=='X'||LA13_2=='x') ) {
                    alt13=3;
                }
                else {
                    alt13=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:8253:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8253:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8253:49: RULE_HEX_LIT
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
            // InternalGo.g:8255:27: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:8255:29: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )*
            {
            if ( (input.LA(1)>='1' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8255:67: ( RULE_DECIMAL_DIGIT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:8255:67: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalGo.g:8257:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:8257:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:8257:31: ( RULE_OCTAL_DIGIT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='7')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:8257:31: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalGo.g:8259:23: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:8259:25: '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+
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
            // InternalGo.g:8259:54: ( RULE_HEX_DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGo.g:8259:54: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LIT"

    // $ANTLR start "RULE_DECIMALS"
    public final void mRULE_DECIMALS() throws RecognitionException {
        try {
            int _type = RULE_DECIMALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8261:15: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:8261:17: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:8261:17: ( RULE_DECIMAL_DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGo.g:8261:17: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalGo.g:8263:23: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:8263:25: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8263:35: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
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
            // InternalGo.g:8265:20: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:8265:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:8265:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt19=2;
                    }
                    break;
                case 'U':
                    {
                    alt19=3;
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
                    alt19=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

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
                    // InternalGo.g:8265:23: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8265:41: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8265:61: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8265:78: RULE_ESCAPED_CHAR
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
            // InternalGo.g:8267:17: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:8267:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:8267:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='x') ) {
                    alt20=2;
                }
                else if ( ((LA20_1>='0' && LA20_1<='7')) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:8267:20: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8267:42: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:8269:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:8269:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:8271:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8271:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8273:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8273:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8275:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8275:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8277:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:8277:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:8279:21: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\'' )
            // InternalGo.g:8279:23: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\''
            {
            match('\''); 
            // InternalGo.g:8279:28: ( RULE_UNICODE_CHAR | RULE_NEWLINE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n') ) {
                alt21=1;
            }
            switch (alt21) {
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
            // InternalGo.g:8281:29: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"' )
            // InternalGo.g:8281:31: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"'
            {
            match('\"'); 
            // InternalGo.g:8281:35: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\\') ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2=='\"'||LA22_2=='\''||LA22_2=='U'||LA22_2=='\\'||(LA22_2>='a' && LA22_2<='b')||LA22_2=='f'||LA22_2=='n'||LA22_2=='r'||(LA22_2>='t' && LA22_2<='v')) ) {
                    alt22=1;
                }
                else if ( ((LA22_2>='0' && LA22_2<='7')||LA22_2=='x') ) {
                    alt22=2;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:8281:36: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8281:55: RULE_BYTE_VALUE
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
            // InternalGo.g:8283:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:8283:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:8283:20: ( '^' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='^') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:8283:20: '^'
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

            // InternalGo.g:8283:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }


                switch (alt24) {
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
            	    break loop24;
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
            // InternalGo.g:8285:19: ( ( '0' .. '9' )+ )
            // InternalGo.g:8285:21: ( '0' .. '9' )+
            {
            // InternalGo.g:8285:21: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGo.g:8285:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalGo.g:8287:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:8287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:8287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\"') ) {
                alt28=1;
            }
            else if ( (LA28_0=='\'') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:8287:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:8287:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGo.g:8287:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8287:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop26;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8287:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:8287:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGo.g:8287:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8287:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop27;
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
            // InternalGo.g:8289:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:8289:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:8289:24: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='*') ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1=='/') ) {
                        alt29=2;
                    }
                    else if ( ((LA29_1>='\u0000' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='\uFFFF')) ) {
                        alt29=1;
                    }


                }
                else if ( ((LA29_0>='\u0000' && LA29_0<=')')||(LA29_0>='+' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:8289:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // InternalGo.g:8291:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:8291:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:8291:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:8291:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop30;
                }
            } while (true);

            // InternalGo.g:8291:40: ( ( '\\r' )? '\\n' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:8291:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:8291:41: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGo.g:8291:41: '\\r'
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
            // InternalGo.g:8293:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:8293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:8293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                    alt33=1;
                }


                switch (alt33) {
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
            // InternalGo.g:8295:16: ( . )
            // InternalGo.g:8295:18: .
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
        // InternalGo.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_UNICODE_LETTER | RULE_LITERAL_TYPE | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_BOOLEAN_LIT | RULE_IDENTIFIER | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt34=61;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // InternalGo.g:1:10: T__43
                {
                mT__43(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__44
                {
                mT__44(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__45
                {
                mT__45(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__46
                {
                mT__46(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__47
                {
                mT__47(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__48
                {
                mT__48(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__49
                {
                mT__49(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__50
                {
                mT__50(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__51
                {
                mT__51(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__52
                {
                mT__52(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__53
                {
                mT__53(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__54
                {
                mT__54(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__55
                {
                mT__55(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__56
                {
                mT__56(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__57
                {
                mT__57(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__58
                {
                mT__58(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__59
                {
                mT__59(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__60
                {
                mT__60(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__61
                {
                mT__61(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__62
                {
                mT__62(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__63
                {
                mT__63(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__64
                {
                mT__64(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__65
                {
                mT__65(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__66
                {
                mT__66(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__67
                {
                mT__67(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__68
                {
                mT__68(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__69
                {
                mT__69(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__70
                {
                mT__70(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__71
                {
                mT__71(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__72
                {
                mT__72(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__73
                {
                mT__73(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__74
                {
                mT__74(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__75
                {
                mT__75(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__76
                {
                mT__76(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__77
                {
                mT__77(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__78
                {
                mT__78(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__79
                {
                mT__79(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__80
                {
                mT__80(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__81
                {
                mT__81(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__82
                {
                mT__82(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__83
                {
                mT__83(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__84
                {
                mT__84(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: RULE_UNICODE_LETTER
                {
                mRULE_UNICODE_LETTER(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:282: RULE_LITERAL_TYPE
                {
                mRULE_LITERAL_TYPE(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:300: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:315: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:329: RULE_ASSING_OP
                {
                mRULE_ASSING_OP(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:344: RULE_BOOLEAN_LIT
                {
                mRULE_BOOLEAN_LIT(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:361: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:377: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:392: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:405: RULE_DECIMALS
                {
                mRULE_DECIMALS(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:419: RULE_UNICODE_VALUE
                {
                mRULE_UNICODE_VALUE(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:438: RULE_BYTE_VALUE
                {
                mRULE_BYTE_VALUE(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:454: RULE_RAW_STRING_LIT
                {
                mRULE_RAW_STRING_LIT(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:474: RULE_INTERPRETED_STRING_LIT
                {
                mRULE_INTERPRETED_STRING_LIT(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:502: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:514: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:530: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:546: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:554: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA3_eotS =
        "\1\uffff\1\7\1\6\1\uffff\2\3\4\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA3_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\3\uffff\1\6\1\2\3\uffff\1\6\1\7\1\uffff\1\7\1\uffff\1\6\14\uffff\1\4\1\3\1\5\37\uffff\1\7\35\uffff\1\1",
            "\1\10",
            "\1\11",
            "",
            "\1\6",
            "\1\6",
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
            return "8227:18: ( '||' | '&&' | RULE_REL_OP | RULE_MUL_OP | RULE_ADD_OP )";
        }
    }
    static final String DFA12_eotS =
        "\6\uffff";
    static final String DFA12_eofS =
        "\6\uffff";
    static final String DFA12_minS =
        "\2\56\2\uffff\1\56\1\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\2\uffff\1\145\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\1";
    static final String DFA12_specialS =
        "\6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\1\uffff\1\2\11\1",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "8251:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\2\u0137\1\uffff\1\u013a\2\uffff\1\u0141\2\uffff\1\u0137\4\uffff\3\u0137\1\u0154\1\u0156\5\u0137\1\u015e\2\u0137\2\u0154\2\u0137\3\uffff\11\u0132\3\uffff\1\u0132\1\uffff\13\u0132\1\uffff\6\u0132\1\uffff\2\u0132\1\uffff\3\u0132\2\uffff\5\u0132\1\uffff\14\u0132\1\uffff\2\u0132\1\uffff\5\u0132\3\uffff\6\u0132\1\uffff\6\u0132\1\uffff\20\u0132\1\uffff\11\u0132\1\uffff\5\u0132\1\uffff\1\u0132\2\uffff\3\u0132\2\uffff\4\u0132\1\uffff\1\u0132\1\uffff\15\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\5\u0132\1\uffff\25\u0132\3\uffff\3\u0132\1\uffff\7\u0132\3\uffff\1\u0132\1\uffff\1\u0132\3\uffff\17\u0132\4\uffff\1\u0132\2\uffff\3\u0132\1\uffff\3\u0132\1\uffff\10\u0132\1\uffff\10\u0132\2\uffff\1\u0166\1\uffff\2\u0154\1\uffff\1\u0154\1\uffff\2\u016a\1\u016d\2\u0132\2\uffff\4\u0137\1\uffff\1\u0137\14\uffff\3\u0137\4\uffff\1\u0137\1\u017d\5\u0137\4\uffff\7\u0137\1\uffff\3\u0137\7\uffff\1\u016a\1\uffff\1\u016a\1\u018f\6\uffff\2\u0137\1\u0199\2\u0137\1\uffff\3\u0137\1\u01a1\1\uffff\1\u0137\1\u01a3\3\u0137\2\uffff\11\u0137\1\u01b2\7\uffff\1\u01b7\2\u0137\1\uffff\7\u0137\1\uffff\1\u0137\1\uffff\1\u01c2\2\u0137\1\u01c5\1\u01c6\3\u0137\1\u01a1\1\u01ca\2\u0137\1\u01cd\1\u01ce\6\uffff\1\u0137\1\u01ce\1\u01a1\7\u0137\1\uffff\1\u0137\1\u01dc\2\uffff\1\u0137\1\u01de\1\u01df\1\uffff\1\u01e0\1\u0137\6\uffff\2\u0137\1\u01e6\1\u01a1\1\u01e7\1\u01e8\1\u0137\1\u01ea\1\u0137\1\uffff\1\u01ec\3\uffff\1\u0137\2\uffff\1\u0137\1\u01f1\3\uffff\1\u0137\1\uffff\1\u0137\1\uffff\1\u01f4\2\uffff\1\u0137\1\uffff\1\u0137\1\u01f8\2\uffff\1\u0137\1\u01fb\2\uffff\1\u0137\2\uffff\1\u01ff\2\uffff";
    static final String DFA34_eofS =
        "\u0200\uffff";
    static final String DFA34_minS =
        "\1\0\2\141\1\uffff\1\0\2\uffff\1\56\2\uffff\1\145\4\uffff\1\146\2\141\1\55\1\75\1\157\1\141\1\157\1\154\1\145\1\75\1\162\1\141\1\53\3\55\3\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\2\uffff\1\75\1\uffff\1\75\1\52\1\uffff\1\75\1\uffff\1\56\1\60\1\11\1\42\1\0\2\uffff\1\156\1\154\1\162\1\157\1\uffff\1\143\3\uffff\1\0\10\uffff\1\162\1\154\1\151\4\uffff\1\164\1\60\2\160\1\141\1\156\1\163\4\uffff\2\164\1\156\1\145\1\157\1\163\1\146\1\uffff\1\160\1\165\1\162\7\uffff\1\56\1\uffff\2\60\3\uffff\2\0\1\uffff\1\143\1\154\1\60\1\141\1\153\1\uffff\1\151\1\145\1\164\1\60\1\uffff\1\157\1\60\1\156\1\163\1\145\2\uffff\1\157\1\165\1\147\1\141\1\154\1\145\1\141\2\145\1\60\1\uffff\5\0\1\uffff\1\60\1\164\1\145\1\uffff\1\164\1\141\1\143\1\156\2\143\1\162\1\uffff\1\162\1\uffff\1\60\1\151\1\164\2\60\1\162\1\145\1\153\2\60\1\162\1\165\2\60\1\uffff\4\0\1\uffff\1\150\2\60\1\147\1\164\1\147\1\164\1\150\1\146\1\164\1\uffff\1\156\1\60\2\uffff\1\156\2\60\1\uffff\1\60\1\154\2\uffff\4\0\1\162\1\145\4\60\1\141\1\60\1\165\1\uffff\1\60\3\uffff\1\164\2\0\1\157\1\60\3\uffff\1\143\1\uffff\1\145\1\uffff\1\60\2\0\1\165\1\uffff\1\145\1\60\1\uffff\1\0\1\147\1\60\1\uffff\1\0\1\150\1\uffff\1\0\1\60\1\0\1\uffff";
    static final String DFA34_maxS =
        "\1\uffff\1\165\1\141\1\uffff\1\uffff\2\uffff\1\71\2\uffff\1\167\4\uffff\1\156\1\141\1\157\1\55\1\75\1\157\1\145\1\162\1\154\1\145\1\75\1\171\1\141\2\75\2\55\3\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\2\uffff\1\75\1\uffff\1\75\1\57\1\uffff\1\172\1\uffff\2\145\1\40\1\170\1\uffff\2\uffff\1\156\1\154\1\162\1\157\1\uffff\1\143\3\uffff\1\uffff\10\uffff\1\162\1\154\1\151\4\uffff\1\164\1\172\2\160\1\141\1\156\1\163\4\uffff\2\164\1\156\1\145\1\157\1\163\1\146\1\uffff\1\160\1\165\1\162\7\uffff\1\145\1\uffff\2\145\3\uffff\2\uffff\1\uffff\1\143\1\163\1\172\1\141\1\153\1\uffff\1\165\1\145\1\164\1\172\1\uffff\1\157\1\172\1\156\1\164\1\145\2\uffff\1\157\1\165\1\147\1\141\1\154\4\145\1\172\1\uffff\5\uffff\1\uffff\1\172\1\164\1\145\1\uffff\1\164\1\141\1\143\1\156\2\143\1\162\1\uffff\1\162\1\uffff\1\172\1\151\1\164\2\172\1\162\1\145\1\153\2\172\1\162\1\165\2\172\1\uffff\4\uffff\1\uffff\1\150\2\172\1\147\1\164\1\147\1\164\1\150\1\146\1\164\1\uffff\1\156\1\172\2\uffff\1\156\2\172\1\uffff\1\172\1\154\2\uffff\4\uffff\1\162\1\145\4\172\1\141\1\172\1\165\1\uffff\1\172\3\uffff\1\164\2\uffff\1\157\1\172\3\uffff\1\143\1\uffff\1\145\1\uffff\1\172\2\uffff\1\165\1\uffff\1\145\1\172\1\uffff\1\uffff\1\147\1\172\1\uffff\1\uffff\1\150\1\uffff\1\uffff\1\172\1\uffff\1\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\13\1\14\1\15\1\16\21\uffff\3\53\11\uffff\3\53\1\uffff\1\53\13\uffff\1\53\6\uffff\1\53\2\uffff\1\53\3\uffff\2\53\5\uffff\1\53\14\uffff\1\53\2\uffff\1\53\5\uffff\3\53\6\uffff\1\53\6\uffff\1\53\20\uffff\1\53\11\uffff\1\53\5\uffff\1\53\1\uffff\2\53\3\uffff\2\53\4\uffff\1\53\1\uffff\1\53\15\uffff\1\53\2\uffff\1\53\2\uffff\1\53\2\uffff\1\53\2\uffff\1\53\5\uffff\1\53\25\uffff\3\53\3\uffff\1\53\7\uffff\3\53\1\uffff\1\53\1\uffff\3\53\17\uffff\4\53\1\uffff\2\53\3\uffff\1\53\3\uffff\1\53\10\uffff\1\53\10\uffff\2\55\1\uffff\1\55\2\uffff\1\55\1\uffff\1\61\5\uffff\1\74\1\75\4\uffff\1\61\1\uffff\1\3\1\4\1\71\1\uffff\1\67\1\5\1\6\1\17\1\7\1\62\1\10\1\11\3\uffff\1\13\1\14\1\15\1\16\7\uffff\1\23\1\55\1\45\1\24\7\uffff\1\40\3\uffff\1\43\1\57\1\44\1\53\1\56\1\72\1\73\1\uffff\1\63\2\uffff\1\65\1\74\1\66\2\uffff\1\70\5\uffff\1\67\4\uffff\1\31\5\uffff\1\23\1\45\12\uffff\1\64\5\uffff\1\70\3\uffff\1\35\7\uffff\1\54\1\uffff\1\21\16\uffff\1\42\4\uffff\1\1\12\uffff\1\22\2\uffff\1\47\1\25\3\uffff\1\32\2\uffff\1\41\1\60\15\uffff\1\37\1\uffff\1\51\1\27\1\36\5\uffff\1\12\1\34\1\46\1\uffff\1\52\1\uffff\1\26\4\uffff\1\2\2\uffff\1\50\3\uffff\1\30\2\uffff\1\20\3\uffff\1\33";
    static final String DFA34_specialS =
        "\1\7\3\uffff\1\12\u012b\uffff\1\6\13\uffff\1\4\63\uffff\1\10\1\11\36\uffff\1\31\1\32\1\5\1\30\1\13\36\uffff\1\16\1\21\1\15\1\14\30\uffff\1\17\1\22\1\2\1\0\17\uffff\1\20\1\23\12\uffff\1\1\1\24\5\uffff\1\25\3\uffff\1\26\2\uffff\1\27\1\uffff\1\3\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\11\u0132\1\u0131\1\u012e\2\u0132\1\u0131\22\u0132\1\u0131\1\u0125\1\u0130\2\u0132\1\u0129\1\u0124\1\4\1\5\1\6\1\u0127\1\34\1\16\1\35\1\7\1\u0128\1\u012d\11\u012c\1\23\1\14\1\22\1\31\1\u0126\2\u0132\1\36\31\u012b\1\10\1\u012f\1\11\1\u012a\1\u012b\1\u0132\1\37\1\26\1\21\1\30\1\27\1\1\1\24\1\u012b\1\17\3\u012b\1\20\2\u012b\1\2\1\u012b\1\25\1\12\1\32\1\u012b\1\33\4\u012b\1\13\1\u0123\1\15\54\u0132\1\40\12\u0132\1\41\4\u0132\1\42\5\u0132\1\43\27\u0132\1\44\26\u0132\1\3\10\u0132\1\45\u0129\u0132\1\46\55\u0132\1\47\137\u0132\1\50\12\u0132\1\51\24\u0132\1\52\17\u0132\1\53\15\u0132\1\54\u008b\u0132\1\55\13\u0132\1\56\1\u0132\1\57\3\u0132\1\60\1\u0132\1\61\24\u0132\1\62\54\u0132\1\63\11\u0132\1\64\45\u0132\1\65\u008b\u0132\1\66\72\u0132\1\67\3\u0132\1\70\4\u0132\1\71\47\u0132\1\72\70\u0132\1\73\47\u0132\1\74\7\u0132\1\75\156\u0132\1\76\37\u0132\1\77\60\u0132\1\100\36\u0132\1\101\60\u0132\1\102\143\u0132\1\103\17\u0132\1\104\24\u0132\1\105\25\u0132\1\106\1\u0132\1\107\155\u0132\1\110\u0184\u0132\1\111\67\u0132\1\112\22\u0132\1\113\7\u0132\1\114\54\u0132\1\115\11\u0132\1\116\3\u0132\1\117\26\u0132\1\120\7\u0132\1\121\3\u0132\1\122\45\u0132\1\123\2\u0132\1\124\20\u0132\1\125\24\u0132\1\126\11\u0132\1\127\3\u0132\1\130\26\u0132\1\131\7\u0132\1\132\2\u0132\1\133\2\u0132\1\134\40\u0132\1\135\4\u0132\1\136\23\u0132\1\137\22\u0132\1\140\7\u0132\1\141\1\u0132\1\142\3\u0132\1\143\26\u0132\1\144\7\u0132\1\145\2\u0132\1\146\7\u0132\1\147\22\u0132\1\150\17\u0132\1\151\44\u0132\1\152\11\u0132\1\153\3\u0132\1\154\26\u0132\1\155\7\u0132\1\156\3\u0132\1\157\6\u0132\1\160\36\u0132\1\161\2\u0132\1\162\45\u0132\1\163\10\u0132\1\164\3\u0132\1\165\6\u0132\1\166\2\u0132\1\167\1\u0132\1\170\4\u0132\1\171\4\u0132\1\172\5\u0132\1\173\10\u0132\1\174\115\u0132\1\175\10\u0132\1\176\3\u0132\1\177\27\u0132\1\u0080\12\u0132\1\u0081\52\u0132\1\u0082\44\u0132\1\u0083\10\u0132\1\u0084\3\u0132\1\u0085\27\u0132\1\u0086\12\u0132\1\u0087\50\u0132\1\u0088\1\u0132\1\u0089\44\u0132\1\u008a\10\u0132\1\u008b\3\u0132\1\u008c\27\u0132\1\u008d\65\u0132\1\u008e\44\u0132\1\u008f\24\u0132\1\u0090\30\u0132\1\u0091\11\u0132\1\u0092\2\u0132\1\u0093\100\u0132\1\u0094\60\u0132\1\u0095\15\u0132\1\u0096\100\u0132\1\u0097\2\u0132\1\u0098\2\u0132\1\u0099\2\u0132\1\u009a\2\u0132\1\u009b\6\u0132\1\u009c\4\u0132\1\u009d\7\u0132\1\u009e\3\u0132\1\u009f\1\u0132\1\u00a0\2\u0132\1\u00a1\2\u0132\1\u00a2\4\u0132\1\u00a3\12\u0132\1\u00a4\10\u0132\1\u00a5\25\u0132\1\u00a6\43\u0132\1\u00a7\77\u0132\1\u00a8\107\u0132\1\u00a9\167\u0132\1\u00aa\42\u0132\1\u00ab\5\u0132\1\u00ac\46\u0132\1\u00ad\117\u0132\1\u00ae\57\u0132\1\u00af\57\u0132\1\u00b0\136\u0132\1\u00b1\110\u0132\1\u00b2\127\u0132\1\u00b3\7\u0132\1\u00b4\77\u0132\1\u00b5\1\u0132\1\u00b6\5\u0132\1\u00b7\7\u0132\1\u00b8\1\u0132\1\u00b9\5\u0132\1\u00ba\47\u0132\1\u00bb\1\u0132\1\u00bc\5\u0132\1\u00bd\37\u0132\1\u00be\1\u0132\1\u00bf\5\u0132\1\u00c0\7\u0132\1\u00c1\1\u0132\1\u00c2\5\u0132\1\u00c3\7\u0132\1\u00c4\7\u0132\1\u00c5\27\u0132\1\u00c6\37\u0132\1\u00c7\1\u0132\1\u00c8\5\u0132\1\u00c9\7\u0132\1\u00ca\47\u0132\1\u00cb\127\u0132\1\u00cc\20\u0132\1\u00cd\117\u0132\1\u00ce\u027f\u0132\1\u00cf\36\u0132\1\u00d0\u00df\u0132\1\u00d1\u009f\u0132\1\u00d2\137\u0132\1\u00d3\u057f\u0132\1\u00d4\u009f\u0132\1\u00d5\100\u0132\1\u00d6\36\u0132\1\u00d7\27\u0132\1\u00d8\7\u0132\1\u00d9\31\u0132\1\u00da\15\u0132\1\u00db\7\u0132\1\u00dc\10\u0132\1\u00dd\1\u0132\1\u00de\1\u0132\1\u00df\1\u0132\1\u00e0\40\u0132\1\u00e1\65\u0132\1\u00e2\7\u0132\1\u00e3\3\u0132\1\u00e4\3\u0132\1\u00e5\11\u0132\1\u00e6\5\u0132\1\u00e7\11\u0132\1\u00e8\21\u0132\1\u00e9\3\u0132\1\u00ea\u0088\u0132\1\u00eb\u0082\u0132\1\u00ec\4\u0132\1\u00ed\2\u0132\1\u00ee\12\u0132\1\u00ef\3\u0132\1\u00f0\12\u0132\1\u00f1\1\u0132\1\u00f2\1\u0132\1\u00f3\1\u0132\1\u00f4\4\u0132\1\u00f5\3\u0132\1\u00f6\54\u0132\1\u00f7\u0ea4\u0132\1\u00f8\33\u0132\1\u00f9\17\u0132\1\u00fa\6\u0132\1\u00fb\10\u0132\1\u00fc\133\u0132\1\u00fd\3\u0132\1\u00fe\132\u0132\1\u00ff\10\u0132\1\u0100\53\u0132\1\u0101\156\u0132\1\u0102\u025f\u0132\1\u0103\u19b4\u0132\1\u0104\112\u0132\1\u0105\u51a4\u0132\1\u0106\132\u0132\1\u0107\u0bff\u0132\1\u0108\u2ba2\u0132\1\u0109\u215c\u0132\1\u010a\u01ff\u0132\1\u010b\22\u0132\1\u010c\11\u0132\1\u010d\1\u0132\1\u010e\12\u0132\1\u010f\15\u0132\1\u0110\5\u0132\1\u0111\1\u0132\1\u0112\2\u0132\1\u0113\2\u0132\1\u0114\u008c\u0132\1\u0115\u017c\u0132\1\u0116\101\u0132\1\u0117\135\u0132\1\u0118\177\u0132\1\u0119\3\u0132\1\u011a\1\u0132\1\u011b\u00aa\u0132\1\u011c\37\u0132\1\u011d\44\u0132\1\u011e\133\u0132\1\u011f\7\u0132\1\u0120\7\u0132\1\u0121\7\u0132\1\u0122\45\u0132",
            "\1\u0134\12\uffff\1\u0136\2\uffff\1\u0135\5\uffff\1\u0133",
            "\1\u0138",
            "",
            "\12\u013b\1\u013c\34\u013b\1\u013d\uffd8\u013b",
            "",
            "",
            "\1\u0140\1\uffff\12\u0142",
            "",
            "",
            "\1\u0146\16\uffff\1\u0145\2\uffff\1\u0147",
            "",
            "",
            "",
            "",
            "\1\u014d\6\uffff\1\u014e\1\u014c",
            "\1\u014f",
            "\1\u0152\6\uffff\1\u0150\6\uffff\1\u0151",
            "\1\u0153",
            "\1\u0155",
            "\1\u0157",
            "\1\u0159\3\uffff\1\u0158",
            "\1\u015b\2\uffff\1\u015a",
            "\1\u015c",
            "\1\u015d",
            "\1\u0154",
            "\1\u0160\6\uffff\1\u015f",
            "\1\u0161",
            "\1\u0162\21\uffff\1\u0163",
            "\1\u0164\17\uffff\1\u0163",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "\1\u0165",
            "",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "\1\u0165",
            "",
            "",
            "\1\u0154",
            "",
            "\1\u0163",
            "\1\u0167\4\uffff\1\u0168",
            "",
            "\1\u0163\3\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\1\u0142\1\uffff\12\u0169\13\uffff\1\u0142\37\uffff\1\u0142",
            "\10\u016b\2\u016c\13\uffff\1\u0142\37\uffff\1\u0142",
            "\2\u016e\2\uffff\1\u016e\22\uffff\1\u016e",
            "\1\u016d\4\uffff\1\u016d\10\uffff\10\u016f\35\uffff\1\u016d\6\uffff\1\u016d\4\uffff\2\u016d\3\uffff\1\u016d\7\uffff\1\u016d\3\uffff\1\u016d\1\uffff\3\u016d\1\uffff\1\u016f",
            "\12\u013b\1\u0171\27\u013b\1\u0172\71\u013b\1\u0170\uffa3\u013b",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "",
            "",
            "\47\u013b\1\u013d\uffd8\u013b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "",
            "",
            "",
            "\1\u017c",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0142\1\uffff\12\u0169\13\uffff\1\u0142\37\uffff\1\u0142",
            "",
            "\10\u016b\2\u016c\13\uffff\1\u0142\37\uffff\1\u0142",
            "\12\u016c\13\uffff\1\u0142\37\uffff\1\u0142",
            "",
            "",
            "",
            "\42\u013b\1\u0192\4\u013b\1\u0192\10\u013b\10\u0194\35\u013b\1\u0191\6\u013b\1\u0192\4\u013b\2\u0192\3\u013b\1\u0192\7\u013b\1\u0192\3\u013b\1\u0192\1\u013b\1\u0192\1\u0190\1\u0192\1\u013b\1\u0193\uff87\u013b",
            "\42\u013b\1\u0172\uffdd\u013b",
            "",
            "\1\u0196",
            "\1\u0197\6\uffff\1\u0198",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019d\13\uffff\1\u019c",
            "\1\u019e",
            "\1\u019f",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\4\u0137\1\u01a0\25\u0137",
            "",
            "\1\u01a2",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01a4",
            "\1\u01a6\1\u01a5",
            "\1\u01a7",
            "",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01af\3\uffff\1\u01ae",
            "\1\u01b0",
            "\1\u01b1",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\60\u013b\12\u01b3\7\u013b\6\u01b3\32\u013b\6\u01b3\uff99\u013b",
            "\60\u013b\12\u01b4\7\u013b\6\u01b4\32\u013b\6\u01b4\uff99\u013b",
            "\42\u013b\1\u0172\uffdd\u013b",
            "\60\u013b\12\u01b5\7\u013b\6\u01b5\32\u013b\6\u01b5\uff99\u013b",
            "\60\u013b\10\u01b6\uffc8\u013b",
            "",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01c3",
            "\1\u01c4",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01cb",
            "\1\u01cc",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\60\u013b\12\u01cf\7\u013b\6\u01cf\32\u013b\6\u01cf\uff99\u013b",
            "\60\u013b\12\u01d0\7\u013b\6\u01d0\32\u013b\6\u01d0\uff99\u013b",
            "\60\u013b\12\u01d1\7\u013b\6\u01d1\32\u013b\6\u01d1\uff99\u013b",
            "\60\u013b\10\u01d2\uffc8\u013b",
            "",
            "\1\u01d3",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\1\u01db",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "",
            "\1\u01dd",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01e1",
            "",
            "",
            "\60\u013b\12\u01e2\7\u013b\6\u01e2\32\u013b\6\u01e2\uff99\u013b",
            "\60\u013b\12\u01e3\7\u013b\6\u01e3\32\u013b\6\u01e3\uff99\u013b",
            "\42\u013b\1\u0172\uffdd\u013b",
            "\42\u013b\1\u0172\uffdd\u013b",
            "\1\u01e4",
            "\1\u01e5",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01e9",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\1\u01eb",
            "",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "",
            "",
            "\1\u01ed",
            "\60\u013b\12\u01ee\7\u013b\6\u01ee\32\u013b\6\u01ee\uff99\u013b",
            "\60\u013b\12\u01ef\7\u013b\6\u01ef\32\u013b\6\u01ef\uff99\u013b",
            "\1\u01f0",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "",
            "",
            "\1\u01f2",
            "",
            "\1\u01f3",
            "",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\42\u013b\1\u0172\uffdd\u013b",
            "\60\u013b\12\u01f5\7\u013b\6\u01f5\32\u013b\6\u01f5\uff99\u013b",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\60\u013b\12\u01f9\7\u013b\6\u01f9\32\u013b\6\u01f9\uff99\u013b",
            "\1\u01fa",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "",
            "\60\u013b\12\u01fc\7\u013b\6\u01fc\32\u013b\6\u01fc\uff99\u013b",
            "\1\u01fd",
            "",
            "\60\u013b\12\u01fe\7\u013b\6\u01fe\32\u013b\6\u01fe\uff99\u013b",
            "\12\u0137\7\uffff\32\u0137\4\uffff\1\u0137\1\uffff\32\u0137",
            "\42\u013b\1\u0172\uffdd\u013b",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_UNICODE_LETTER | RULE_LITERAL_TYPE | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_BOOLEAN_LIT | RULE_IDENTIFIER | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_466 = input.LA(1);

                        s = -1;
                        if ( (LA34_466=='\"') ) {s = 370;}

                        else if ( ((LA34_466>='\u0000' && LA34_466<='!')||(LA34_466>='#' && LA34_466<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_494 = input.LA(1);

                        s = -1;
                        if ( (LA34_494=='\"') ) {s = 370;}

                        else if ( ((LA34_494>='\u0000' && LA34_494<='!')||(LA34_494>='#' && LA34_494<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_465 = input.LA(1);

                        s = -1;
                        if ( (LA34_465=='\"') ) {s = 370;}

                        else if ( ((LA34_465>='\u0000' && LA34_465<='!')||(LA34_465>='#' && LA34_465<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_510 = input.LA(1);

                        s = -1;
                        if ( (LA34_510=='\"') ) {s = 370;}

                        else if ( ((LA34_510>='\u0000' && LA34_510<='!')||(LA34_510>='#' && LA34_510<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_316 = input.LA(1);

                        s = -1;
                        if ( (LA34_316=='\'') ) {s = 317;}

                        else if ( ((LA34_316>='\u0000' && LA34_316<='&')||(LA34_316>='(' && LA34_316<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_402 = input.LA(1);

                        s = -1;
                        if ( (LA34_402=='\"') ) {s = 370;}

                        else if ( ((LA34_402>='\u0000' && LA34_402<='!')||(LA34_402>='#' && LA34_402<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_304 = input.LA(1);

                        s = -1;
                        if ( (LA34_304=='\\') ) {s = 368;}

                        else if ( (LA34_304=='\n') ) {s = 369;}

                        else if ( (LA34_304=='\"') ) {s = 370;}

                        else if ( ((LA34_304>='\u0000' && LA34_304<='\t')||(LA34_304>='\u000B' && LA34_304<='!')||(LA34_304>='#' && LA34_304<='[')||(LA34_304>=']' && LA34_304<='\uFFFF')) ) {s = 315;}

                        else s = 306;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_0 = input.LA(1);

                        s = -1;
                        if ( (LA34_0=='f') ) {s = 1;}

                        else if ( (LA34_0=='p') ) {s = 2;}

                        else if ( (LA34_0=='\u00EF') ) {s = 3;}

                        else if ( (LA34_0=='\'') ) {s = 4;}

                        else if ( (LA34_0=='(') ) {s = 5;}

                        else if ( (LA34_0==')') ) {s = 6;}

                        else if ( (LA34_0=='.') ) {s = 7;}

                        else if ( (LA34_0=='[') ) {s = 8;}

                        else if ( (LA34_0==']') ) {s = 9;}

                        else if ( (LA34_0=='s') ) {s = 10;}

                        else if ( (LA34_0=='{') ) {s = 11;}

                        else if ( (LA34_0==';') ) {s = 12;}

                        else if ( (LA34_0=='}') ) {s = 13;}

                        else if ( (LA34_0==',') ) {s = 14;}

                        else if ( (LA34_0=='i') ) {s = 15;}

                        else if ( (LA34_0=='m') ) {s = 16;}

                        else if ( (LA34_0=='c') ) {s = 17;}

                        else if ( (LA34_0=='<') ) {s = 18;}

                        else if ( (LA34_0==':') ) {s = 19;}

                        else if ( (LA34_0=='g') ) {s = 20;}

                        else if ( (LA34_0=='r') ) {s = 21;}

                        else if ( (LA34_0=='b') ) {s = 22;}

                        else if ( (LA34_0=='e') ) {s = 23;}

                        else if ( (LA34_0=='d') ) {s = 24;}

                        else if ( (LA34_0=='=') ) {s = 25;}

                        else if ( (LA34_0=='t') ) {s = 26;}

                        else if ( (LA34_0=='v') ) {s = 27;}

                        else if ( (LA34_0=='+') ) {s = 28;}

                        else if ( (LA34_0=='-') ) {s = 29;}

                        else if ( (LA34_0=='A') ) {s = 30;}

                        else if ( (LA34_0=='a') ) {s = 31;}

                        else if ( (LA34_0=='\u00AA') ) {s = 32;}

                        else if ( (LA34_0=='\u00B5') ) {s = 33;}

                        else if ( (LA34_0=='\u00BA') ) {s = 34;}

                        else if ( (LA34_0=='\u00C0') ) {s = 35;}

                        else if ( (LA34_0=='\u00D8') ) {s = 36;}

                        else if ( (LA34_0=='\u00F8') ) {s = 37;}

                        else if ( (LA34_0=='\u0222') ) {s = 38;}

                        else if ( (LA34_0=='\u0250') ) {s = 39;}

                        else if ( (LA34_0=='\u02B0') ) {s = 40;}

                        else if ( (LA34_0=='\u02BB') ) {s = 41;}

                        else if ( (LA34_0=='\u02D0') ) {s = 42;}

                        else if ( (LA34_0=='\u02E0') ) {s = 43;}

                        else if ( (LA34_0=='\u02EE') ) {s = 44;}

                        else if ( (LA34_0=='\u037A') ) {s = 45;}

                        else if ( (LA34_0=='\u0386') ) {s = 46;}

                        else if ( (LA34_0=='\u0388') ) {s = 47;}

                        else if ( (LA34_0=='\u038C') ) {s = 48;}

                        else if ( (LA34_0=='\u038E') ) {s = 49;}

                        else if ( (LA34_0=='\u03A3') ) {s = 50;}

                        else if ( (LA34_0=='\u03D0') ) {s = 51;}

                        else if ( (LA34_0=='\u03DA') ) {s = 52;}

                        else if ( (LA34_0=='\u0400') ) {s = 53;}

                        else if ( (LA34_0=='\u048C') ) {s = 54;}

                        else if ( (LA34_0=='\u04C7') ) {s = 55;}

                        else if ( (LA34_0=='\u04CB') ) {s = 56;}

                        else if ( (LA34_0=='\u04D0') ) {s = 57;}

                        else if ( (LA34_0=='\u04F8') ) {s = 58;}

                        else if ( (LA34_0=='\u0531') ) {s = 59;}

                        else if ( (LA34_0=='\u0559') ) {s = 60;}

                        else if ( (LA34_0=='\u0561') ) {s = 61;}

                        else if ( (LA34_0=='\u05D0') ) {s = 62;}

                        else if ( (LA34_0=='\u05F0') ) {s = 63;}

                        else if ( (LA34_0=='\u0621') ) {s = 64;}

                        else if ( (LA34_0=='\u0640') ) {s = 65;}

                        else if ( (LA34_0=='\u0671') ) {s = 66;}

                        else if ( (LA34_0=='\u06D5') ) {s = 67;}

                        else if ( (LA34_0=='\u06E5') ) {s = 68;}

                        else if ( (LA34_0=='\u06FA') ) {s = 69;}

                        else if ( (LA34_0=='\u0710') ) {s = 70;}

                        else if ( (LA34_0=='\u0712') ) {s = 71;}

                        else if ( (LA34_0=='\u0780') ) {s = 72;}

                        else if ( (LA34_0=='\u0905') ) {s = 73;}

                        else if ( (LA34_0=='\u093D') ) {s = 74;}

                        else if ( (LA34_0=='\u0950') ) {s = 75;}

                        else if ( (LA34_0=='\u0958') ) {s = 76;}

                        else if ( (LA34_0=='\u0985') ) {s = 77;}

                        else if ( (LA34_0=='\u098F') ) {s = 78;}

                        else if ( (LA34_0=='\u0993') ) {s = 79;}

                        else if ( (LA34_0=='\u09AA') ) {s = 80;}

                        else if ( (LA34_0=='\u09B2') ) {s = 81;}

                        else if ( (LA34_0=='\u09B6') ) {s = 82;}

                        else if ( (LA34_0=='\u09DC') ) {s = 83;}

                        else if ( (LA34_0=='\u09DF') ) {s = 84;}

                        else if ( (LA34_0=='\u09F0') ) {s = 85;}

                        else if ( (LA34_0=='\u0A05') ) {s = 86;}

                        else if ( (LA34_0=='\u0A0F') ) {s = 87;}

                        else if ( (LA34_0=='\u0A13') ) {s = 88;}

                        else if ( (LA34_0=='\u0A2A') ) {s = 89;}

                        else if ( (LA34_0=='\u0A32') ) {s = 90;}

                        else if ( (LA34_0=='\u0A35') ) {s = 91;}

                        else if ( (LA34_0=='\u0A38') ) {s = 92;}

                        else if ( (LA34_0=='\u0A59') ) {s = 93;}

                        else if ( (LA34_0=='\u0A5E') ) {s = 94;}

                        else if ( (LA34_0=='\u0A72') ) {s = 95;}

                        else if ( (LA34_0=='\u0A85') ) {s = 96;}

                        else if ( (LA34_0=='\u0A8D') ) {s = 97;}

                        else if ( (LA34_0=='\u0A8F') ) {s = 98;}

                        else if ( (LA34_0=='\u0A93') ) {s = 99;}

                        else if ( (LA34_0=='\u0AAA') ) {s = 100;}

                        else if ( (LA34_0=='\u0AB2') ) {s = 101;}

                        else if ( (LA34_0=='\u0AB5') ) {s = 102;}

                        else if ( (LA34_0=='\u0ABD') ) {s = 103;}

                        else if ( (LA34_0=='\u0AD0') ) {s = 104;}

                        else if ( (LA34_0=='\u0AE0') ) {s = 105;}

                        else if ( (LA34_0=='\u0B05') ) {s = 106;}

                        else if ( (LA34_0=='\u0B0F') ) {s = 107;}

                        else if ( (LA34_0=='\u0B13') ) {s = 108;}

                        else if ( (LA34_0=='\u0B2A') ) {s = 109;}

                        else if ( (LA34_0=='\u0B32') ) {s = 110;}

                        else if ( (LA34_0=='\u0B36') ) {s = 111;}

                        else if ( (LA34_0=='\u0B3D') ) {s = 112;}

                        else if ( (LA34_0=='\u0B5C') ) {s = 113;}

                        else if ( (LA34_0=='\u0B5F') ) {s = 114;}

                        else if ( (LA34_0=='\u0B85') ) {s = 115;}

                        else if ( (LA34_0=='\u0B8E') ) {s = 116;}

                        else if ( (LA34_0=='\u0B92') ) {s = 117;}

                        else if ( (LA34_0=='\u0B99') ) {s = 118;}

                        else if ( (LA34_0=='\u0B9C') ) {s = 119;}

                        else if ( (LA34_0=='\u0B9E') ) {s = 120;}

                        else if ( (LA34_0=='\u0BA3') ) {s = 121;}

                        else if ( (LA34_0=='\u0BA8') ) {s = 122;}

                        else if ( (LA34_0=='\u0BAE') ) {s = 123;}

                        else if ( (LA34_0=='\u0BB7') ) {s = 124;}

                        else if ( (LA34_0=='\u0C05') ) {s = 125;}

                        else if ( (LA34_0=='\u0C0E') ) {s = 126;}

                        else if ( (LA34_0=='\u0C12') ) {s = 127;}

                        else if ( (LA34_0=='\u0C2A') ) {s = 128;}

                        else if ( (LA34_0=='\u0C35') ) {s = 129;}

                        else if ( (LA34_0=='\u0C60') ) {s = 130;}

                        else if ( (LA34_0=='\u0C85') ) {s = 131;}

                        else if ( (LA34_0=='\u0C8E') ) {s = 132;}

                        else if ( (LA34_0=='\u0C92') ) {s = 133;}

                        else if ( (LA34_0=='\u0CAA') ) {s = 134;}

                        else if ( (LA34_0=='\u0CB5') ) {s = 135;}

                        else if ( (LA34_0=='\u0CDE') ) {s = 136;}

                        else if ( (LA34_0=='\u0CE0') ) {s = 137;}

                        else if ( (LA34_0=='\u0D05') ) {s = 138;}

                        else if ( (LA34_0=='\u0D0E') ) {s = 139;}

                        else if ( (LA34_0=='\u0D12') ) {s = 140;}

                        else if ( (LA34_0=='\u0D2A') ) {s = 141;}

                        else if ( (LA34_0=='\u0D60') ) {s = 142;}

                        else if ( (LA34_0=='\u0D85') ) {s = 143;}

                        else if ( (LA34_0=='\u0D9A') ) {s = 144;}

                        else if ( (LA34_0=='\u0DB3') ) {s = 145;}

                        else if ( (LA34_0=='\u0DBD') ) {s = 146;}

                        else if ( (LA34_0=='\u0DC0') ) {s = 147;}

                        else if ( (LA34_0=='\u0E01') ) {s = 148;}

                        else if ( (LA34_0=='\u0E32') ) {s = 149;}

                        else if ( (LA34_0=='\u0E40') ) {s = 150;}

                        else if ( (LA34_0=='\u0E81') ) {s = 151;}

                        else if ( (LA34_0=='\u0E84') ) {s = 152;}

                        else if ( (LA34_0=='\u0E87') ) {s = 153;}

                        else if ( (LA34_0=='\u0E8A') ) {s = 154;}

                        else if ( (LA34_0=='\u0E8D') ) {s = 155;}

                        else if ( (LA34_0=='\u0E94') ) {s = 156;}

                        else if ( (LA34_0=='\u0E99') ) {s = 157;}

                        else if ( (LA34_0=='\u0EA1') ) {s = 158;}

                        else if ( (LA34_0=='\u0EA5') ) {s = 159;}

                        else if ( (LA34_0=='\u0EA7') ) {s = 160;}

                        else if ( (LA34_0=='\u0EAA') ) {s = 161;}

                        else if ( (LA34_0=='\u0EAD') ) {s = 162;}

                        else if ( (LA34_0=='\u0EB2') ) {s = 163;}

                        else if ( (LA34_0=='\u0EBD') ) {s = 164;}

                        else if ( (LA34_0=='\u0EC6') ) {s = 165;}

                        else if ( (LA34_0=='\u0EDC') ) {s = 166;}

                        else if ( (LA34_0=='\u0F00') ) {s = 167;}

                        else if ( (LA34_0=='\u0F40') ) {s = 168;}

                        else if ( (LA34_0=='\u0F88') ) {s = 169;}

                        else if ( (LA34_0=='\u1000') ) {s = 170;}

                        else if ( (LA34_0=='\u1023') ) {s = 171;}

                        else if ( (LA34_0=='\u1029') ) {s = 172;}

                        else if ( (LA34_0=='\u1050') ) {s = 173;}

                        else if ( (LA34_0=='\u10A0') ) {s = 174;}

                        else if ( (LA34_0=='\u10D0') ) {s = 175;}

                        else if ( (LA34_0=='\u1100') ) {s = 176;}

                        else if ( (LA34_0=='\u115F') ) {s = 177;}

                        else if ( (LA34_0=='\u11A8') ) {s = 178;}

                        else if ( (LA34_0=='\u1200') ) {s = 179;}

                        else if ( (LA34_0=='\u1208') ) {s = 180;}

                        else if ( (LA34_0=='\u1248') ) {s = 181;}

                        else if ( (LA34_0=='\u124A') ) {s = 182;}

                        else if ( (LA34_0=='\u1250') ) {s = 183;}

                        else if ( (LA34_0=='\u1258') ) {s = 184;}

                        else if ( (LA34_0=='\u125A') ) {s = 185;}

                        else if ( (LA34_0=='\u1260') ) {s = 186;}

                        else if ( (LA34_0=='\u1288') ) {s = 187;}

                        else if ( (LA34_0=='\u128A') ) {s = 188;}

                        else if ( (LA34_0=='\u1290') ) {s = 189;}

                        else if ( (LA34_0=='\u12B0') ) {s = 190;}

                        else if ( (LA34_0=='\u12B2') ) {s = 191;}

                        else if ( (LA34_0=='\u12B8') ) {s = 192;}

                        else if ( (LA34_0=='\u12C0') ) {s = 193;}

                        else if ( (LA34_0=='\u12C2') ) {s = 194;}

                        else if ( (LA34_0=='\u12C8') ) {s = 195;}

                        else if ( (LA34_0=='\u12D0') ) {s = 196;}

                        else if ( (LA34_0=='\u12D8') ) {s = 197;}

                        else if ( (LA34_0=='\u12F0') ) {s = 198;}

                        else if ( (LA34_0=='\u1310') ) {s = 199;}

                        else if ( (LA34_0=='\u1312') ) {s = 200;}

                        else if ( (LA34_0=='\u1318') ) {s = 201;}

                        else if ( (LA34_0=='\u1320') ) {s = 202;}

                        else if ( (LA34_0=='\u1348') ) {s = 203;}

                        else if ( (LA34_0=='\u13A0') ) {s = 204;}

                        else if ( (LA34_0=='\u13B1') ) {s = 205;}

                        else if ( (LA34_0=='\u1401') ) {s = 206;}

                        else if ( (LA34_0=='\u1681') ) {s = 207;}

                        else if ( (LA34_0=='\u16A0') ) {s = 208;}

                        else if ( (LA34_0=='\u1780') ) {s = 209;}

                        else if ( (LA34_0=='\u1820') ) {s = 210;}

                        else if ( (LA34_0=='\u1880') ) {s = 211;}

                        else if ( (LA34_0=='\u1E00') ) {s = 212;}

                        else if ( (LA34_0=='\u1EA0') ) {s = 213;}

                        else if ( (LA34_0=='\u1EE1') ) {s = 214;}

                        else if ( (LA34_0=='\u1F00') ) {s = 215;}

                        else if ( (LA34_0=='\u1F18') ) {s = 216;}

                        else if ( (LA34_0=='\u1F20') ) {s = 217;}

                        else if ( (LA34_0=='\u1F3A') ) {s = 218;}

                        else if ( (LA34_0=='\u1F48') ) {s = 219;}

                        else if ( (LA34_0=='\u1F50') ) {s = 220;}

                        else if ( (LA34_0=='\u1F59') ) {s = 221;}

                        else if ( (LA34_0=='\u1F5B') ) {s = 222;}

                        else if ( (LA34_0=='\u1F5D') ) {s = 223;}

                        else if ( (LA34_0=='\u1F5F') ) {s = 224;}

                        else if ( (LA34_0=='\u1F80') ) {s = 225;}

                        else if ( (LA34_0=='\u1FB6') ) {s = 226;}

                        else if ( (LA34_0=='\u1FBE') ) {s = 227;}

                        else if ( (LA34_0=='\u1FC2') ) {s = 228;}

                        else if ( (LA34_0=='\u1FC6') ) {s = 229;}

                        else if ( (LA34_0=='\u1FD0') ) {s = 230;}

                        else if ( (LA34_0=='\u1FD6') ) {s = 231;}

                        else if ( (LA34_0=='\u1FE0') ) {s = 232;}

                        else if ( (LA34_0=='\u1FF2') ) {s = 233;}

                        else if ( (LA34_0=='\u1FF6') ) {s = 234;}

                        else if ( (LA34_0=='\u207F') ) {s = 235;}

                        else if ( (LA34_0=='\u2102') ) {s = 236;}

                        else if ( (LA34_0=='\u2107') ) {s = 237;}

                        else if ( (LA34_0=='\u210A') ) {s = 238;}

                        else if ( (LA34_0=='\u2115') ) {s = 239;}

                        else if ( (LA34_0=='\u2119') ) {s = 240;}

                        else if ( (LA34_0=='\u2124') ) {s = 241;}

                        else if ( (LA34_0=='\u2126') ) {s = 242;}

                        else if ( (LA34_0=='\u2128') ) {s = 243;}

                        else if ( (LA34_0=='\u212A') ) {s = 244;}

                        else if ( (LA34_0=='\u212F') ) {s = 245;}

                        else if ( (LA34_0=='\u2133') ) {s = 246;}

                        else if ( (LA34_0=='\u2160') ) {s = 247;}

                        else if ( (LA34_0=='\u3005') ) {s = 248;}

                        else if ( (LA34_0=='\u3021') ) {s = 249;}

                        else if ( (LA34_0=='\u3031') ) {s = 250;}

                        else if ( (LA34_0=='\u3038') ) {s = 251;}

                        else if ( (LA34_0=='\u3041') ) {s = 252;}

                        else if ( (LA34_0=='\u309D') ) {s = 253;}

                        else if ( (LA34_0=='\u30A1') ) {s = 254;}

                        else if ( (LA34_0=='\u30FC') ) {s = 255;}

                        else if ( (LA34_0=='\u3105') ) {s = 256;}

                        else if ( (LA34_0=='\u3131') ) {s = 257;}

                        else if ( (LA34_0=='\u31A0') ) {s = 258;}

                        else if ( (LA34_0=='\u3400') ) {s = 259;}

                        else if ( (LA34_0=='\u4DB5') ) {s = 260;}

                        else if ( (LA34_0=='\u4E00') ) {s = 261;}

                        else if ( (LA34_0=='\u9FA5') ) {s = 262;}

                        else if ( (LA34_0=='\uA000') ) {s = 263;}

                        else if ( (LA34_0=='\uAC00') ) {s = 264;}

                        else if ( (LA34_0=='\uD7A3') ) {s = 265;}

                        else if ( (LA34_0=='\uF900') ) {s = 266;}

                        else if ( (LA34_0=='\uFB00') ) {s = 267;}

                        else if ( (LA34_0=='\uFB13') ) {s = 268;}

                        else if ( (LA34_0=='\uFB1D') ) {s = 269;}

                        else if ( (LA34_0=='\uFB1F') ) {s = 270;}

                        else if ( (LA34_0=='\uFB2A') ) {s = 271;}

                        else if ( (LA34_0=='\uFB38') ) {s = 272;}

                        else if ( (LA34_0=='\uFB3E') ) {s = 273;}

                        else if ( (LA34_0=='\uFB40') ) {s = 274;}

                        else if ( (LA34_0=='\uFB43') ) {s = 275;}

                        else if ( (LA34_0=='\uFB46') ) {s = 276;}

                        else if ( (LA34_0=='\uFBD3') ) {s = 277;}

                        else if ( (LA34_0=='\uFD50') ) {s = 278;}

                        else if ( (LA34_0=='\uFD92') ) {s = 279;}

                        else if ( (LA34_0=='\uFDF0') ) {s = 280;}

                        else if ( (LA34_0=='\uFE70') ) {s = 281;}

                        else if ( (LA34_0=='\uFE74') ) {s = 282;}

                        else if ( (LA34_0=='\uFE76') ) {s = 283;}

                        else if ( (LA34_0=='\uFF21') ) {s = 284;}

                        else if ( (LA34_0=='\uFF41') ) {s = 285;}

                        else if ( (LA34_0=='\uFF66') ) {s = 286;}

                        else if ( (LA34_0=='\uFFC2') ) {s = 287;}

                        else if ( (LA34_0=='\uFFCA') ) {s = 288;}

                        else if ( (LA34_0=='\uFFD2') ) {s = 289;}

                        else if ( (LA34_0=='\uFFDA') ) {s = 290;}

                        else if ( (LA34_0=='|') ) {s = 291;}

                        else if ( (LA34_0=='&') ) {s = 292;}

                        else if ( (LA34_0=='!') ) {s = 293;}

                        else if ( (LA34_0=='>') ) {s = 294;}

                        else if ( (LA34_0=='*') ) {s = 295;}

                        else if ( (LA34_0=='/') ) {s = 296;}

                        else if ( (LA34_0=='%') ) {s = 297;}

                        else if ( (LA34_0=='^') ) {s = 298;}

                        else if ( ((LA34_0>='B' && LA34_0<='Z')||LA34_0=='_'||LA34_0=='h'||(LA34_0>='j' && LA34_0<='l')||(LA34_0>='n' && LA34_0<='o')||LA34_0=='q'||LA34_0=='u'||(LA34_0>='w' && LA34_0<='z')) ) {s = 299;}

                        else if ( ((LA34_0>='1' && LA34_0<='9')) ) {s = 300;}

                        else if ( (LA34_0=='0') ) {s = 301;}

                        else if ( (LA34_0=='\n') ) {s = 302;}

                        else if ( (LA34_0=='\\') ) {s = 303;}

                        else if ( (LA34_0=='\"') ) {s = 304;}

                        else if ( (LA34_0=='\t'||LA34_0=='\r'||LA34_0==' ') ) {s = 305;}

                        else if ( ((LA34_0>='\u0000' && LA34_0<='\b')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\u001F')||(LA34_0>='#' && LA34_0<='$')||(LA34_0>='?' && LA34_0<='@')||LA34_0=='`'||(LA34_0>='~' && LA34_0<='\u00A9')||(LA34_0>='\u00AB' && LA34_0<='\u00B4')||(LA34_0>='\u00B6' && LA34_0<='\u00B9')||(LA34_0>='\u00BB' && LA34_0<='\u00BF')||(LA34_0>='\u00C1' && LA34_0<='\u00D7')||(LA34_0>='\u00D9' && LA34_0<='\u00EE')||(LA34_0>='\u00F0' && LA34_0<='\u00F7')||(LA34_0>='\u00F9' && LA34_0<='\u0221')||(LA34_0>='\u0223' && LA34_0<='\u024F')||(LA34_0>='\u0251' && LA34_0<='\u02AF')||(LA34_0>='\u02B1' && LA34_0<='\u02BA')||(LA34_0>='\u02BC' && LA34_0<='\u02CF')||(LA34_0>='\u02D1' && LA34_0<='\u02DF')||(LA34_0>='\u02E1' && LA34_0<='\u02ED')||(LA34_0>='\u02EF' && LA34_0<='\u0379')||(LA34_0>='\u037B' && LA34_0<='\u0385')||LA34_0=='\u0387'||(LA34_0>='\u0389' && LA34_0<='\u038B')||LA34_0=='\u038D'||(LA34_0>='\u038F' && LA34_0<='\u03A2')||(LA34_0>='\u03A4' && LA34_0<='\u03CF')||(LA34_0>='\u03D1' && LA34_0<='\u03D9')||(LA34_0>='\u03DB' && LA34_0<='\u03FF')||(LA34_0>='\u0401' && LA34_0<='\u048B')||(LA34_0>='\u048D' && LA34_0<='\u04C6')||(LA34_0>='\u04C8' && LA34_0<='\u04CA')||(LA34_0>='\u04CC' && LA34_0<='\u04CF')||(LA34_0>='\u04D1' && LA34_0<='\u04F7')||(LA34_0>='\u04F9' && LA34_0<='\u0530')||(LA34_0>='\u0532' && LA34_0<='\u0558')||(LA34_0>='\u055A' && LA34_0<='\u0560')||(LA34_0>='\u0562' && LA34_0<='\u05CF')||(LA34_0>='\u05D1' && LA34_0<='\u05EF')||(LA34_0>='\u05F1' && LA34_0<='\u0620')||(LA34_0>='\u0622' && LA34_0<='\u063F')||(LA34_0>='\u0641' && LA34_0<='\u0670')||(LA34_0>='\u0672' && LA34_0<='\u06D4')||(LA34_0>='\u06D6' && LA34_0<='\u06E4')||(LA34_0>='\u06E6' && LA34_0<='\u06F9')||(LA34_0>='\u06FB' && LA34_0<='\u070F')||LA34_0=='\u0711'||(LA34_0>='\u0713' && LA34_0<='\u077F')||(LA34_0>='\u0781' && LA34_0<='\u0904')||(LA34_0>='\u0906' && LA34_0<='\u093C')||(LA34_0>='\u093E' && LA34_0<='\u094F')||(LA34_0>='\u0951' && LA34_0<='\u0957')||(LA34_0>='\u0959' && LA34_0<='\u0984')||(LA34_0>='\u0986' && LA34_0<='\u098E')||(LA34_0>='\u0990' && LA34_0<='\u0992')||(LA34_0>='\u0994' && LA34_0<='\u09A9')||(LA34_0>='\u09AB' && LA34_0<='\u09B1')||(LA34_0>='\u09B3' && LA34_0<='\u09B5')||(LA34_0>='\u09B7' && LA34_0<='\u09DB')||(LA34_0>='\u09DD' && LA34_0<='\u09DE')||(LA34_0>='\u09E0' && LA34_0<='\u09EF')||(LA34_0>='\u09F1' && LA34_0<='\u0A04')||(LA34_0>='\u0A06' && LA34_0<='\u0A0E')||(LA34_0>='\u0A10' && LA34_0<='\u0A12')||(LA34_0>='\u0A14' && LA34_0<='\u0A29')||(LA34_0>='\u0A2B' && LA34_0<='\u0A31')||(LA34_0>='\u0A33' && LA34_0<='\u0A34')||(LA34_0>='\u0A36' && LA34_0<='\u0A37')||(LA34_0>='\u0A39' && LA34_0<='\u0A58')||(LA34_0>='\u0A5A' && LA34_0<='\u0A5D')||(LA34_0>='\u0A5F' && LA34_0<='\u0A71')||(LA34_0>='\u0A73' && LA34_0<='\u0A84')||(LA34_0>='\u0A86' && LA34_0<='\u0A8C')||LA34_0=='\u0A8E'||(LA34_0>='\u0A90' && LA34_0<='\u0A92')||(LA34_0>='\u0A94' && LA34_0<='\u0AA9')||(LA34_0>='\u0AAB' && LA34_0<='\u0AB1')||(LA34_0>='\u0AB3' && LA34_0<='\u0AB4')||(LA34_0>='\u0AB6' && LA34_0<='\u0ABC')||(LA34_0>='\u0ABE' && LA34_0<='\u0ACF')||(LA34_0>='\u0AD1' && LA34_0<='\u0ADF')||(LA34_0>='\u0AE1' && LA34_0<='\u0B04')||(LA34_0>='\u0B06' && LA34_0<='\u0B0E')||(LA34_0>='\u0B10' && LA34_0<='\u0B12')||(LA34_0>='\u0B14' && LA34_0<='\u0B29')||(LA34_0>='\u0B2B' && LA34_0<='\u0B31')||(LA34_0>='\u0B33' && LA34_0<='\u0B35')||(LA34_0>='\u0B37' && LA34_0<='\u0B3C')||(LA34_0>='\u0B3E' && LA34_0<='\u0B5B')||(LA34_0>='\u0B5D' && LA34_0<='\u0B5E')||(LA34_0>='\u0B60' && LA34_0<='\u0B84')||(LA34_0>='\u0B86' && LA34_0<='\u0B8D')||(LA34_0>='\u0B8F' && LA34_0<='\u0B91')||(LA34_0>='\u0B93' && LA34_0<='\u0B98')||(LA34_0>='\u0B9A' && LA34_0<='\u0B9B')||LA34_0=='\u0B9D'||(LA34_0>='\u0B9F' && LA34_0<='\u0BA2')||(LA34_0>='\u0BA4' && LA34_0<='\u0BA7')||(LA34_0>='\u0BA9' && LA34_0<='\u0BAD')||(LA34_0>='\u0BAF' && LA34_0<='\u0BB6')||(LA34_0>='\u0BB8' && LA34_0<='\u0C04')||(LA34_0>='\u0C06' && LA34_0<='\u0C0D')||(LA34_0>='\u0C0F' && LA34_0<='\u0C11')||(LA34_0>='\u0C13' && LA34_0<='\u0C29')||(LA34_0>='\u0C2B' && LA34_0<='\u0C34')||(LA34_0>='\u0C36' && LA34_0<='\u0C5F')||(LA34_0>='\u0C61' && LA34_0<='\u0C84')||(LA34_0>='\u0C86' && LA34_0<='\u0C8D')||(LA34_0>='\u0C8F' && LA34_0<='\u0C91')||(LA34_0>='\u0C93' && LA34_0<='\u0CA9')||(LA34_0>='\u0CAB' && LA34_0<='\u0CB4')||(LA34_0>='\u0CB6' && LA34_0<='\u0CDD')||LA34_0=='\u0CDF'||(LA34_0>='\u0CE1' && LA34_0<='\u0D04')||(LA34_0>='\u0D06' && LA34_0<='\u0D0D')||(LA34_0>='\u0D0F' && LA34_0<='\u0D11')||(LA34_0>='\u0D13' && LA34_0<='\u0D29')||(LA34_0>='\u0D2B' && LA34_0<='\u0D5F')||(LA34_0>='\u0D61' && LA34_0<='\u0D84')||(LA34_0>='\u0D86' && LA34_0<='\u0D99')||(LA34_0>='\u0D9B' && LA34_0<='\u0DB2')||(LA34_0>='\u0DB4' && LA34_0<='\u0DBC')||(LA34_0>='\u0DBE' && LA34_0<='\u0DBF')||(LA34_0>='\u0DC1' && LA34_0<='\u0E00')||(LA34_0>='\u0E02' && LA34_0<='\u0E31')||(LA34_0>='\u0E33' && LA34_0<='\u0E3F')||(LA34_0>='\u0E41' && LA34_0<='\u0E80')||(LA34_0>='\u0E82' && LA34_0<='\u0E83')||(LA34_0>='\u0E85' && LA34_0<='\u0E86')||(LA34_0>='\u0E88' && LA34_0<='\u0E89')||(LA34_0>='\u0E8B' && LA34_0<='\u0E8C')||(LA34_0>='\u0E8E' && LA34_0<='\u0E93')||(LA34_0>='\u0E95' && LA34_0<='\u0E98')||(LA34_0>='\u0E9A' && LA34_0<='\u0EA0')||(LA34_0>='\u0EA2' && LA34_0<='\u0EA4')||LA34_0=='\u0EA6'||(LA34_0>='\u0EA8' && LA34_0<='\u0EA9')||(LA34_0>='\u0EAB' && LA34_0<='\u0EAC')||(LA34_0>='\u0EAE' && LA34_0<='\u0EB1')||(LA34_0>='\u0EB3' && LA34_0<='\u0EBC')||(LA34_0>='\u0EBE' && LA34_0<='\u0EC5')||(LA34_0>='\u0EC7' && LA34_0<='\u0EDB')||(LA34_0>='\u0EDD' && LA34_0<='\u0EFF')||(LA34_0>='\u0F01' && LA34_0<='\u0F3F')||(LA34_0>='\u0F41' && LA34_0<='\u0F87')||(LA34_0>='\u0F89' && LA34_0<='\u0FFF')||(LA34_0>='\u1001' && LA34_0<='\u1022')||(LA34_0>='\u1024' && LA34_0<='\u1028')||(LA34_0>='\u102A' && LA34_0<='\u104F')||(LA34_0>='\u1051' && LA34_0<='\u109F')||(LA34_0>='\u10A1' && LA34_0<='\u10CF')||(LA34_0>='\u10D1' && LA34_0<='\u10FF')||(LA34_0>='\u1101' && LA34_0<='\u115E')||(LA34_0>='\u1160' && LA34_0<='\u11A7')||(LA34_0>='\u11A9' && LA34_0<='\u11FF')||(LA34_0>='\u1201' && LA34_0<='\u1207')||(LA34_0>='\u1209' && LA34_0<='\u1247')||LA34_0=='\u1249'||(LA34_0>='\u124B' && LA34_0<='\u124F')||(LA34_0>='\u1251' && LA34_0<='\u1257')||LA34_0=='\u1259'||(LA34_0>='\u125B' && LA34_0<='\u125F')||(LA34_0>='\u1261' && LA34_0<='\u1287')||LA34_0=='\u1289'||(LA34_0>='\u128B' && LA34_0<='\u128F')||(LA34_0>='\u1291' && LA34_0<='\u12AF')||LA34_0=='\u12B1'||(LA34_0>='\u12B3' && LA34_0<='\u12B7')||(LA34_0>='\u12B9' && LA34_0<='\u12BF')||LA34_0=='\u12C1'||(LA34_0>='\u12C3' && LA34_0<='\u12C7')||(LA34_0>='\u12C9' && LA34_0<='\u12CF')||(LA34_0>='\u12D1' && LA34_0<='\u12D7')||(LA34_0>='\u12D9' && LA34_0<='\u12EF')||(LA34_0>='\u12F1' && LA34_0<='\u130F')||LA34_0=='\u1311'||(LA34_0>='\u1313' && LA34_0<='\u1317')||(LA34_0>='\u1319' && LA34_0<='\u131F')||(LA34_0>='\u1321' && LA34_0<='\u1347')||(LA34_0>='\u1349' && LA34_0<='\u139F')||(LA34_0>='\u13A1' && LA34_0<='\u13B0')||(LA34_0>='\u13B2' && LA34_0<='\u1400')||(LA34_0>='\u1402' && LA34_0<='\u1680')||(LA34_0>='\u1682' && LA34_0<='\u169F')||(LA34_0>='\u16A1' && LA34_0<='\u177F')||(LA34_0>='\u1781' && LA34_0<='\u181F')||(LA34_0>='\u1821' && LA34_0<='\u187F')||(LA34_0>='\u1881' && LA34_0<='\u1DFF')||(LA34_0>='\u1E01' && LA34_0<='\u1E9F')||(LA34_0>='\u1EA1' && LA34_0<='\u1EE0')||(LA34_0>='\u1EE2' && LA34_0<='\u1EFF')||(LA34_0>='\u1F01' && LA34_0<='\u1F17')||(LA34_0>='\u1F19' && LA34_0<='\u1F1F')||(LA34_0>='\u1F21' && LA34_0<='\u1F39')||(LA34_0>='\u1F3B' && LA34_0<='\u1F47')||(LA34_0>='\u1F49' && LA34_0<='\u1F4F')||(LA34_0>='\u1F51' && LA34_0<='\u1F58')||LA34_0=='\u1F5A'||LA34_0=='\u1F5C'||LA34_0=='\u1F5E'||(LA34_0>='\u1F60' && LA34_0<='\u1F7F')||(LA34_0>='\u1F81' && LA34_0<='\u1FB5')||(LA34_0>='\u1FB7' && LA34_0<='\u1FBD')||(LA34_0>='\u1FBF' && LA34_0<='\u1FC1')||(LA34_0>='\u1FC3' && LA34_0<='\u1FC5')||(LA34_0>='\u1FC7' && LA34_0<='\u1FCF')||(LA34_0>='\u1FD1' && LA34_0<='\u1FD5')||(LA34_0>='\u1FD7' && LA34_0<='\u1FDF')||(LA34_0>='\u1FE1' && LA34_0<='\u1FF1')||(LA34_0>='\u1FF3' && LA34_0<='\u1FF5')||(LA34_0>='\u1FF7' && LA34_0<='\u207E')||(LA34_0>='\u2080' && LA34_0<='\u2101')||(LA34_0>='\u2103' && LA34_0<='\u2106')||(LA34_0>='\u2108' && LA34_0<='\u2109')||(LA34_0>='\u210B' && LA34_0<='\u2114')||(LA34_0>='\u2116' && LA34_0<='\u2118')||(LA34_0>='\u211A' && LA34_0<='\u2123')||LA34_0=='\u2125'||LA34_0=='\u2127'||LA34_0=='\u2129'||(LA34_0>='\u212B' && LA34_0<='\u212E')||(LA34_0>='\u2130' && LA34_0<='\u2132')||(LA34_0>='\u2134' && LA34_0<='\u215F')||(LA34_0>='\u2161' && LA34_0<='\u3004')||(LA34_0>='\u3006' && LA34_0<='\u3020')||(LA34_0>='\u3022' && LA34_0<='\u3030')||(LA34_0>='\u3032' && LA34_0<='\u3037')||(LA34_0>='\u3039' && LA34_0<='\u3040')||(LA34_0>='\u3042' && LA34_0<='\u309C')||(LA34_0>='\u309E' && LA34_0<='\u30A0')||(LA34_0>='\u30A2' && LA34_0<='\u30FB')||(LA34_0>='\u30FD' && LA34_0<='\u3104')||(LA34_0>='\u3106' && LA34_0<='\u3130')||(LA34_0>='\u3132' && LA34_0<='\u319F')||(LA34_0>='\u31A1' && LA34_0<='\u33FF')||(LA34_0>='\u3401' && LA34_0<='\u4DB4')||(LA34_0>='\u4DB6' && LA34_0<='\u4DFF')||(LA34_0>='\u4E01' && LA34_0<='\u9FA4')||(LA34_0>='\u9FA6' && LA34_0<='\u9FFF')||(LA34_0>='\uA001' && LA34_0<='\uABFF')||(LA34_0>='\uAC01' && LA34_0<='\uD7A2')||(LA34_0>='\uD7A4' && LA34_0<='\uF8FF')||(LA34_0>='\uF901' && LA34_0<='\uFAFF')||(LA34_0>='\uFB01' && LA34_0<='\uFB12')||(LA34_0>='\uFB14' && LA34_0<='\uFB1C')||LA34_0=='\uFB1E'||(LA34_0>='\uFB20' && LA34_0<='\uFB29')||(LA34_0>='\uFB2B' && LA34_0<='\uFB37')||(LA34_0>='\uFB39' && LA34_0<='\uFB3D')||LA34_0=='\uFB3F'||(LA34_0>='\uFB41' && LA34_0<='\uFB42')||(LA34_0>='\uFB44' && LA34_0<='\uFB45')||(LA34_0>='\uFB47' && LA34_0<='\uFBD2')||(LA34_0>='\uFBD4' && LA34_0<='\uFD4F')||(LA34_0>='\uFD51' && LA34_0<='\uFD91')||(LA34_0>='\uFD93' && LA34_0<='\uFDEF')||(LA34_0>='\uFDF1' && LA34_0<='\uFE6F')||(LA34_0>='\uFE71' && LA34_0<='\uFE73')||LA34_0=='\uFE75'||(LA34_0>='\uFE77' && LA34_0<='\uFF20')||(LA34_0>='\uFF22' && LA34_0<='\uFF40')||(LA34_0>='\uFF42' && LA34_0<='\uFF65')||(LA34_0>='\uFF67' && LA34_0<='\uFFC1')||(LA34_0>='\uFFC3' && LA34_0<='\uFFC9')||(LA34_0>='\uFFCB' && LA34_0<='\uFFD1')||(LA34_0>='\uFFD3' && LA34_0<='\uFFD9')||(LA34_0>='\uFFDB' && LA34_0<='\uFFFF')) ) {s = 306;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_368 = input.LA(1);

                        s = -1;
                        if ( (LA34_368=='u') ) {s = 400;}

                        else if ( (LA34_368=='U') ) {s = 401;}

                        else if ( (LA34_368=='\"'||LA34_368=='\''||LA34_368=='\\'||(LA34_368>='a' && LA34_368<='b')||LA34_368=='f'||LA34_368=='n'||LA34_368=='r'||LA34_368=='t'||LA34_368=='v') ) {s = 402;}

                        else if ( (LA34_368=='x') ) {s = 403;}

                        else if ( ((LA34_368>='0' && LA34_368<='7')) ) {s = 404;}

                        else if ( ((LA34_368>='\u0000' && LA34_368<='!')||(LA34_368>='#' && LA34_368<='&')||(LA34_368>='(' && LA34_368<='/')||(LA34_368>='8' && LA34_368<='T')||(LA34_368>='V' && LA34_368<='[')||(LA34_368>=']' && LA34_368<='`')||(LA34_368>='c' && LA34_368<='e')||(LA34_368>='g' && LA34_368<='m')||(LA34_368>='o' && LA34_368<='q')||LA34_368=='s'||LA34_368=='w'||(LA34_368>='y' && LA34_368<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_369 = input.LA(1);

                        s = -1;
                        if ( (LA34_369=='\"') ) {s = 370;}

                        else if ( ((LA34_369>='\u0000' && LA34_369<='!')||(LA34_369>='#' && LA34_369<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_4 = input.LA(1);

                        s = -1;
                        if ( ((LA34_4>='\u0000' && LA34_4<='\t')||(LA34_4>='\u000B' && LA34_4<='&')||(LA34_4>='(' && LA34_4<='\uFFFF')) ) {s = 315;}

                        else if ( (LA34_4=='\n') ) {s = 316;}

                        else if ( (LA34_4=='\'') ) {s = 317;}

                        else s = 314;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_404 = input.LA(1);

                        s = -1;
                        if ( ((LA34_404>='\u0000' && LA34_404<='/')||(LA34_404>='8' && LA34_404<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_404>='0' && LA34_404<='7')) ) {s = 438;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_438 = input.LA(1);

                        s = -1;
                        if ( ((LA34_438>='\u0000' && LA34_438<='/')||(LA34_438>='8' && LA34_438<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_438>='0' && LA34_438<='7')) ) {s = 466;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_437 = input.LA(1);

                        s = -1;
                        if ( ((LA34_437>='0' && LA34_437<='9')||(LA34_437>='A' && LA34_437<='F')||(LA34_437>='a' && LA34_437<='f')) ) {s = 465;}

                        else if ( ((LA34_437>='\u0000' && LA34_437<='/')||(LA34_437>=':' && LA34_437<='@')||(LA34_437>='G' && LA34_437<='`')||(LA34_437>='g' && LA34_437<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_435 = input.LA(1);

                        s = -1;
                        if ( ((LA34_435>='0' && LA34_435<='9')||(LA34_435>='A' && LA34_435<='F')||(LA34_435>='a' && LA34_435<='f')) ) {s = 463;}

                        else if ( ((LA34_435>='\u0000' && LA34_435<='/')||(LA34_435>=':' && LA34_435<='@')||(LA34_435>='G' && LA34_435<='`')||(LA34_435>='g' && LA34_435<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_463 = input.LA(1);

                        s = -1;
                        if ( ((LA34_463>='\u0000' && LA34_463<='/')||(LA34_463>=':' && LA34_463<='@')||(LA34_463>='G' && LA34_463<='`')||(LA34_463>='g' && LA34_463<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_463>='0' && LA34_463<='9')||(LA34_463>='A' && LA34_463<='F')||(LA34_463>='a' && LA34_463<='f')) ) {s = 482;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_482 = input.LA(1);

                        s = -1;
                        if ( ((LA34_482>='\u0000' && LA34_482<='/')||(LA34_482>=':' && LA34_482<='@')||(LA34_482>='G' && LA34_482<='`')||(LA34_482>='g' && LA34_482<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_482>='0' && LA34_482<='9')||(LA34_482>='A' && LA34_482<='F')||(LA34_482>='a' && LA34_482<='f')) ) {s = 494;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_436 = input.LA(1);

                        s = -1;
                        if ( ((LA34_436>='0' && LA34_436<='9')||(LA34_436>='A' && LA34_436<='F')||(LA34_436>='a' && LA34_436<='f')) ) {s = 464;}

                        else if ( ((LA34_436>='\u0000' && LA34_436<='/')||(LA34_436>=':' && LA34_436<='@')||(LA34_436>='G' && LA34_436<='`')||(LA34_436>='g' && LA34_436<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_464 = input.LA(1);

                        s = -1;
                        if ( ((LA34_464>='0' && LA34_464<='9')||(LA34_464>='A' && LA34_464<='F')||(LA34_464>='a' && LA34_464<='f')) ) {s = 483;}

                        else if ( ((LA34_464>='\u0000' && LA34_464<='/')||(LA34_464>=':' && LA34_464<='@')||(LA34_464>='G' && LA34_464<='`')||(LA34_464>='g' && LA34_464<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_483 = input.LA(1);

                        s = -1;
                        if ( ((LA34_483>='\u0000' && LA34_483<='/')||(LA34_483>=':' && LA34_483<='@')||(LA34_483>='G' && LA34_483<='`')||(LA34_483>='g' && LA34_483<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_483>='0' && LA34_483<='9')||(LA34_483>='A' && LA34_483<='F')||(LA34_483>='a' && LA34_483<='f')) ) {s = 495;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_495 = input.LA(1);

                        s = -1;
                        if ( ((LA34_495>='\u0000' && LA34_495<='/')||(LA34_495>=':' && LA34_495<='@')||(LA34_495>='G' && LA34_495<='`')||(LA34_495>='g' && LA34_495<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_495>='0' && LA34_495<='9')||(LA34_495>='A' && LA34_495<='F')||(LA34_495>='a' && LA34_495<='f')) ) {s = 501;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_501 = input.LA(1);

                        s = -1;
                        if ( ((LA34_501>='0' && LA34_501<='9')||(LA34_501>='A' && LA34_501<='F')||(LA34_501>='a' && LA34_501<='f')) ) {s = 505;}

                        else if ( ((LA34_501>='\u0000' && LA34_501<='/')||(LA34_501>=':' && LA34_501<='@')||(LA34_501>='G' && LA34_501<='`')||(LA34_501>='g' && LA34_501<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_505 = input.LA(1);

                        s = -1;
                        if ( ((LA34_505>='0' && LA34_505<='9')||(LA34_505>='A' && LA34_505<='F')||(LA34_505>='a' && LA34_505<='f')) ) {s = 508;}

                        else if ( ((LA34_505>='\u0000' && LA34_505<='/')||(LA34_505>=':' && LA34_505<='@')||(LA34_505>='G' && LA34_505<='`')||(LA34_505>='g' && LA34_505<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_508 = input.LA(1);

                        s = -1;
                        if ( ((LA34_508>='0' && LA34_508<='9')||(LA34_508>='A' && LA34_508<='F')||(LA34_508>='a' && LA34_508<='f')) ) {s = 510;}

                        else if ( ((LA34_508>='\u0000' && LA34_508<='/')||(LA34_508>=':' && LA34_508<='@')||(LA34_508>='G' && LA34_508<='`')||(LA34_508>='g' && LA34_508<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_403 = input.LA(1);

                        s = -1;
                        if ( ((LA34_403>='\u0000' && LA34_403<='/')||(LA34_403>=':' && LA34_403<='@')||(LA34_403>='G' && LA34_403<='`')||(LA34_403>='g' && LA34_403<='\uFFFF')) ) {s = 315;}

                        else if ( ((LA34_403>='0' && LA34_403<='9')||(LA34_403>='A' && LA34_403<='F')||(LA34_403>='a' && LA34_403<='f')) ) {s = 437;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_400 = input.LA(1);

                        s = -1;
                        if ( ((LA34_400>='0' && LA34_400<='9')||(LA34_400>='A' && LA34_400<='F')||(LA34_400>='a' && LA34_400<='f')) ) {s = 435;}

                        else if ( ((LA34_400>='\u0000' && LA34_400<='/')||(LA34_400>=':' && LA34_400<='@')||(LA34_400>='G' && LA34_400<='`')||(LA34_400>='g' && LA34_400<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_401 = input.LA(1);

                        s = -1;
                        if ( ((LA34_401>='0' && LA34_401<='9')||(LA34_401>='A' && LA34_401<='F')||(LA34_401>='a' && LA34_401<='f')) ) {s = 436;}

                        else if ( ((LA34_401>='\u0000' && LA34_401<='/')||(LA34_401>=':' && LA34_401<='@')||(LA34_401>='G' && LA34_401<='`')||(LA34_401>='g' && LA34_401<='\uFFFF')) ) {s = 315;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}