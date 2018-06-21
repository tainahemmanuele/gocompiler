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
    public static final int RULE_BINARY_OP=16;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=32;
    public static final int RULE_INTERPRETED_STRING_LIT=14;
    public static final int RULE_UNICODE_VALUE=11;
    public static final int RULE_LITTLE_U_VALUE=27;
    public static final int RULE_ASSING_OP=15;
    public static final int RULE_HEX_BYTE_VALUE=31;
    public static final int RULE_OCTAL_BYTE_VALUE=30;
    public static final int RULE_MUL_OP=23;
    public static final int RULE_INT=33;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=35;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_EXPOENT=10;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=9;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=18;
    public static final int RULE_BIG_U_VALUE=28;
    public static final int RULE_ESCAPED_CHAR=29;
    public static final int RULE_STRING=34;
    public static final int RULE_BYTE_VALUE=12;
    public static final int RULE_SL_COMMENT=36;
    public static final int T__39=39;
    public static final int RULE_UNICODE_LETTER=20;
    public static final int T__77=77;
    public static final int RULE_HEX_LIT=8;
    public static final int RULE_UNICODE_CHAR=19;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=22;
    public static final int RULE_OCTAL_DIGIT=25;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_UNICODE_DIGIT=5;
    public static final int RULE_WS=37;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_OCTAL_LIT=7;
    public static final int RULE_LETTER=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=13;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=17;
    public static final int T__45=45;
    public static final int RULE_REL_OP=21;
    public static final int RULE_HEX_DIGIT=26;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_DECIMAL_LIT=6;
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

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( ';' )
            // InternalGo.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( 'func' )
            // InternalGo.g:12:9: 'func'
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
            // InternalGo.g:13:7: ( 'package' )
            // InternalGo.g:13:9: 'package'
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
            // InternalGo.g:14:7: ( '.' )
            // InternalGo.g:14:9: '.'
            {
            match('.'); 

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
            // InternalGo.g:15:7: ( 'i' )
            // InternalGo.g:15:9: 'i'
            {
            match('i'); 

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
            // InternalGo.g:16:7: ( '\\'' )
            // InternalGo.g:16:9: '\\''
            {
            match('\''); 

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
            // InternalGo.g:17:7: ( '(' )
            // InternalGo.g:17:9: '('
            {
            match('('); 

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
            // InternalGo.g:18:7: ( ')' )
            // InternalGo.g:18:9: ')'
            {
            match(')'); 

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
            // InternalGo.g:19:7: ( '[' )
            // InternalGo.g:19:9: '['
            {
            match('['); 

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
            // InternalGo.g:20:7: ( ']' )
            // InternalGo.g:20:9: ']'
            {
            match(']'); 

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
            // InternalGo.g:21:7: ( 'struct' )
            // InternalGo.g:21:9: 'struct'
            {
            match("struct"); 


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
            // InternalGo.g:22:7: ( '{' )
            // InternalGo.g:22:9: '{'
            {
            match('{'); 

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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( '*' )
            // InternalGo.g:25:9: '*'
            {
            match('*'); 

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
            // InternalGo.g:26:7: ( '...' )
            // InternalGo.g:26:9: '...'
            {
            match("..."); 


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
            // InternalGo.g:27:7: ( 'interface' )
            // InternalGo.g:27:9: 'interface'
            {
            match("interface"); 


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
            // InternalGo.g:28:7: ( 'map' )
            // InternalGo.g:28:9: 'map'
            {
            match("map"); 


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
            // InternalGo.g:29:7: ( 'chan' )
            // InternalGo.g:29:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:30:7: ( '<-' )
            // InternalGo.g:30:9: '<-'
            {
            match("<-"); 


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
            // InternalGo.g:31:7: ( ':' )
            // InternalGo.g:31:9: ':'
            {
            match(':'); 

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
            // InternalGo.g:32:7: ( 'goto' )
            // InternalGo.g:32:9: 'goto'
            {
            match("goto"); 


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
            // InternalGo.g:33:7: ( 'return' )
            // InternalGo.g:33:9: 'return'
            {
            match("return"); 


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
            // InternalGo.g:34:7: ( 'break' )
            // InternalGo.g:34:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:35:7: ( 'continue' )
            // InternalGo.g:35:9: 'continue'
            {
            match("continue"); 


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
            // InternalGo.g:36:7: ( 'if' )
            // InternalGo.g:36:9: 'if'
            {
            match("if"); 


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
            // InternalGo.g:37:7: ( 'else' )
            // InternalGo.g:37:9: 'else'
            {
            match("else"); 


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
            // InternalGo.g:38:7: ( 'fallthrough' )
            // InternalGo.g:38:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalGo.g:39:7: ( 'select' )
            // InternalGo.g:39:9: 'select'
            {
            match("select"); 


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
            // InternalGo.g:40:7: ( 'for' )
            // InternalGo.g:40:9: 'for'
            {
            match("for"); 


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
            // InternalGo.g:41:7: ( 'defer' )
            // InternalGo.g:41:9: 'defer'
            {
            match("defer"); 


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
            // InternalGo.g:42:7: ( 'const' )
            // InternalGo.g:42:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:43:7: ( '=' )
            // InternalGo.g:43:9: '='
            {
            match('='); 

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
            // InternalGo.g:44:7: ( 'type' )
            // InternalGo.g:44:9: 'type'
            {
            match("type"); 


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
            // InternalGo.g:45:7: ( 'var' )
            // InternalGo.g:45:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:46:7: ( '++' )
            // InternalGo.g:46:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:47:7: ( '--' )
            // InternalGo.g:47:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:48:7: ( ':=' )
            // InternalGo.g:48:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:49:7: ( 'switch' )
            // InternalGo.g:49:9: 'switch'
            {
            match("switch"); 


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
            // InternalGo.g:50:7: ( 'case' )
            // InternalGo.g:50:9: 'case'
            {
            match("case"); 


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
            // InternalGo.g:51:7: ( 'default' )
            // InternalGo.g:51:9: 'default'
            {
            match("default"); 


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
            // InternalGo.g:52:7: ( 'range' )
            // InternalGo.g:52:9: 'range'
            {
            match("range"); 


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
            // InternalGo.g:53:7: ( 'import' )
            // InternalGo.g:53:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:7543:23: ( '\\n' )
            // InternalGo.g:7543:25: '\\n'
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
            // InternalGo.g:7545:28: ( '\\n' )
            // InternalGo.g:7545:30: '\\n'
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
            // InternalGo.g:7547:30: ( 'A-Z' )
            // InternalGo.g:7547:32: 'A-Z'
            {
            match("A-Z"); 


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
            // InternalGo.g:7549:20: ( 'A-Z' )
            // InternalGo.g:7549:22: 'A-Z'
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
            // InternalGo.g:7551:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:7551:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:7551:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGo.g:7551:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:7551:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:7551:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7551:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:7551:53: RULE_MUL_OP
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
            // InternalGo.g:7553:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:7553:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:7553:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '!':
                {
                alt2=2;
                }
                break;
            case '<':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=3;}
                }
                break;
            case '>':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:7553:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:7553:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:7553:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7553:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:7553:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:7553:48: '>='
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
            // InternalGo.g:7555:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:7555:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:7557:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:7557:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:7557:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt3=1;
                }
                break;
            case '/':
                {
                alt3=2;
                }
                break;
            case '%':
                {
                alt3=3;
                }
                break;
            case '<':
                {
                alt3=4;
                }
                break;
            case '>':
                {
                alt3=5;
                }
                break;
            case '&':
                {
                int LA3_6 = input.LA(2);

                if ( (LA3_6=='^') ) {
                    alt3=7;
                }
                else {
                    alt3=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:7557:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7557:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7557:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7557:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:7557:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:7557:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:7557:51: '&^'
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
            // InternalGo.g:7559:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:7559:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:7559:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt4=1;
                }
                break;
            case '-':
                {
                alt4=2;
                }
                break;
            case '!':
                {
                alt4=3;
                }
                break;
            case '^':
                {
                alt4=4;
                }
                break;
            case '*':
                {
                alt4=5;
                }
                break;
            case '&':
                {
                alt4=6;
                }
                break;
            case '<':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:7559:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7559:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7559:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7559:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:7559:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:7559:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:7559:42: '<-'
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
            // InternalGo.g:7561:16: ( ( RULE_ADD_OP | RULE_MUL_OP )? '=' )
            // InternalGo.g:7561:18: ( RULE_ADD_OP | RULE_MUL_OP )? '='
            {
            // InternalGo.g:7561:18: ( RULE_ADD_OP | RULE_MUL_OP )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-'||LA5_0=='^'||LA5_0=='|') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='%' && LA5_0<='&')||LA5_0=='*'||LA5_0=='/'||LA5_0=='<'||LA5_0=='>') ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:7561:19: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7561:31: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;

            }

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSING_OP"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7563:13: ( ( RULE_UNICODE_LETTER | '_' | EOF ) )
            // InternalGo.g:7563:15: ( RULE_UNICODE_LETTER | '_' | EOF )
            {
            // InternalGo.g:7563:15: ( RULE_UNICODE_LETTER | '_' | EOF )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt6=1;
                }
                break;
            case '_':
                {
                alt6=2;
                }
                break;
            default:
                alt6=3;}

            switch (alt6) {
                case 1 :
                    // InternalGo.g:7563:16: RULE_UNICODE_LETTER
                    {
                    mRULE_UNICODE_LETTER(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7563:36: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7563:40: EOF
                    {
                    match(EOF); 

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
            // InternalGo.g:7565:29: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+ )
            // InternalGo.g:7565:31: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            {
            // InternalGo.g:7565:31: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalGo.g:7567:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // InternalGo.g:7567:29: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )
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
            // InternalGo.g:7569:25: ( ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) ) )
            // InternalGo.g:7569:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )
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

    // $ANTLR start "RULE_DECIMAL_LIT"
    public final void mRULE_DECIMAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7571:18: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) RULE_DECIMAL_DIGIT )
            // InternalGo.g:7571:20: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) RULE_DECIMAL_DIGIT
            {
            if ( (input.LA(1)>='1' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_DECIMAL_DIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LIT"

    // $ANTLR start "RULE_OCTAL_LIT"
    public final void mRULE_OCTAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7573:16: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:7573:18: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:7573:22: ( RULE_OCTAL_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:7573:22: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LIT"

    // $ANTLR start "RULE_HEX_LIT"
    public final void mRULE_HEX_LIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7575:14: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:7575:16: '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+
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
            // InternalGo.g:7575:45: ( RULE_HEX_DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:7575:45: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalGo.g:7577:15: ( RULE_DECIMAL_DIGIT ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:7577:17: RULE_DECIMAL_DIGIT ( RULE_DECIMAL_DIGIT )+
            {
            mRULE_DECIMAL_DIGIT(); 
            // InternalGo.g:7577:36: ( RULE_DECIMAL_DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:7577:36: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            int _type = RULE_EXPOENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7579:14: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:7579:16: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:7579:26: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
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

            state.type = _type;
            state.channel = _channel;
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
            // InternalGo.g:7581:20: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:7581:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:7581:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt12=2;
                    }
                    break;
                case 'U':
                    {
                    alt12=3;
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
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:7581:23: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7581:41: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:7581:61: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:7581:78: RULE_ESCAPED_CHAR
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
            // InternalGo.g:7583:17: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:7583:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:7583:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='x') ) {
                    alt13=2;
                }
                else if ( ((LA13_1>='0' && LA13_1<='7')) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:7583:20: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7583:42: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:7585:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:7585:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:7587:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7587:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7589:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7589:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7591:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:7591:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:7593:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:7593:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:7595:21: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalGo.g:7595:23: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalGo.g:7595:28: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n') ) {
                    alt14=1;
                }


                switch (alt14) {
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

            	default :
            	    break loop14;
                }
            } while (true);

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
            // InternalGo.g:7597:29: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalGo.g:7597:31: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalGo.g:7597:35: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\n') ) {
                    alt15=1;
                }
                else if ( (LA15_0=='\\') ) {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3=='\"'||LA15_3=='\''||LA15_3=='U'||LA15_3=='\\'||(LA15_3>='a' && LA15_3<='b')||LA15_3=='f'||LA15_3=='n'||LA15_3=='r'||(LA15_3>='t' && LA15_3<='v')) ) {
                        alt15=1;
                    }
                    else if ( ((LA15_3>='0' && LA15_3<='7')||LA15_3=='x') ) {
                        alt15=2;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:7597:36: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:7597:55: RULE_BYTE_VALUE
            	    {
            	    mRULE_BYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7599:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:7599:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:7599:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:7599:11: '^'
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

            // InternalGo.g:7599:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7601:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:7601:12: ( '0' .. '9' )+
            {
            // InternalGo.g:7601:12: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:7601:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalGo.g:7603:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:7603:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:7603:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:7603:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:7603:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGo.g:7603:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7603:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop19;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7603:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:7603:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGo.g:7603:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7603:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop20;
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
            // InternalGo.g:7605:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:7605:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:7605:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:7605:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalGo.g:7607:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:7607:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:7607:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:7607:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop23;
                }
            } while (true);

            // InternalGo.g:7607:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:7607:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:7607:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGo.g:7607:41: '\\r'
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
            // InternalGo.g:7609:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:7609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:7609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalGo.g:7611:16: ( . )
            // InternalGo.g:7611:18: .
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
        // InternalGo.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_UNICODE_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_LETTER | RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT | RULE_DECIMALS | RULE_EXPOENT | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=64;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalGo.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:268: RULE_UNICODE_DIGIT
                {
                mRULE_UNICODE_DIGIT(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:287: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:302: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:316: RULE_ASSING_OP
                {
                mRULE_ASSING_OP(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:331: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:343: RULE_DECIMAL_LIT
                {
                mRULE_DECIMAL_LIT(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:360: RULE_OCTAL_LIT
                {
                mRULE_OCTAL_LIT(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:375: RULE_HEX_LIT
                {
                mRULE_HEX_LIT(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:388: RULE_DECIMALS
                {
                mRULE_DECIMALS(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:402: RULE_EXPOENT
                {
                mRULE_EXPOENT(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:415: RULE_UNICODE_VALUE
                {
                mRULE_UNICODE_VALUE(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:434: RULE_BYTE_VALUE
                {
                mRULE_BYTE_VALUE(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:450: RULE_RAW_STRING_LIT
                {
                mRULE_RAW_STRING_LIT(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:470: RULE_INTERPRETED_STRING_LIT
                {
                mRULE_INTERPRETED_STRING_LIT(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:498: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:506: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:515: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:527: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalGo.g:1:543: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalGo.g:1:559: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalGo.g:1:567: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA1_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA1_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\3\uffff\1\7\1\2\3\uffff\1\7\1\6\1\uffff\1\6\1\uffff\1\7\14\uffff\1\4\1\3\1\5\37\uffff\1\6\35\uffff\1\1",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "7551:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA27_eotS =
        "\1\47\1\uffff\2\65\1\70\1\74\1\75\4\uffff\1\65\3\uffff\1\113\2\65\1\122\1\125\5\65\1\136\2\65\2\122\1\65\2\122\1\145\4\122\1\47\1\uffff\1\151\1\154\1\65\1\157\2\60\4\uffff\3\65\1\uffff\1\65\2\uffff\1\65\1\172\1\65\11\uffff\3\65\5\uffff\4\65\2\uffff\1\122\2\uffff\6\65\1\uffff\1\65\1\uffff\2\65\3\uffff\1\122\1\uffff\1\122\3\uffff\1\u008f\2\uffff\1\154\1\u0090\6\uffff\2\65\1\u0099\2\65\1\uffff\1\65\1\uffff\3\65\1\u00a0\3\65\1\uffff\5\65\1\134\2\65\1\u00ad\11\uffff\1\u00b3\1\65\1\uffff\6\65\1\uffff\1\u00bb\2\65\1\u00be\1\u00bf\3\65\1\u00c3\2\65\1\u00c6\7\uffff\7\65\1\uffff\1\65\1\u00d3\2\uffff\1\65\1\u00d5\1\u00d6\1\uffff\1\u00d7\1\65\5\uffff\3\65\1\u00de\1\u00df\1\u00e0\1\u00e1\1\65\1\uffff\1\u00e3\3\uffff\1\65\2\uffff\1\65\1\u00e8\1\65\4\uffff\1\65\1\uffff\1\u00eb\2\uffff\1\65\1\uffff\1\65\1\u00ef\2\uffff\1\65\1\u00f2\2\uffff\1\65\2\uffff\1\u00f6\2\uffff";
    static final String DFA27_eofS =
        "\u00f7\uffff";
    static final String DFA27_minS =
        "\1\0\1\uffff\2\141\1\56\1\60\1\0\4\uffff\1\145\3\uffff\1\75\2\141\1\55\1\75\1\157\1\141\1\162\1\53\1\145\1\75\1\171\1\141\1\53\2\55\3\75\1\76\1\75\1\52\1\75\1\60\1\uffff\2\60\1\53\1\11\1\42\1\0\4\uffff\1\156\1\154\1\162\1\uffff\1\143\2\uffff\1\164\1\60\1\160\3\uffff\1\0\5\uffff\1\162\1\154\1\151\5\uffff\1\160\1\141\1\156\1\163\2\uffff\1\75\2\uffff\2\164\1\156\1\145\1\163\1\60\1\uffff\1\146\1\uffff\1\160\1\162\2\uffff\1\132\1\75\1\uffff\1\75\3\uffff\1\60\2\uffff\2\60\3\uffff\2\0\1\uffff\1\143\1\154\1\60\1\153\1\145\1\uffff\1\157\1\uffff\1\165\1\145\1\164\1\60\1\156\1\163\1\145\1\uffff\1\157\1\165\1\147\1\141\1\145\1\60\1\141\1\145\1\60\3\uffff\5\0\1\uffff\1\60\1\164\1\uffff\1\141\2\162\3\143\1\uffff\1\60\1\151\1\164\2\60\1\162\1\145\1\153\1\60\1\162\1\165\1\60\2\uffff\4\0\1\uffff\1\150\1\147\1\146\3\164\1\150\1\uffff\1\156\1\60\2\uffff\1\156\2\60\1\uffff\1\60\1\154\1\uffff\4\0\1\162\1\145\1\141\4\60\1\165\1\uffff\1\60\3\uffff\1\164\2\0\1\157\1\60\1\143\4\uffff\1\145\1\uffff\1\60\2\0\1\165\1\uffff\1\145\1\60\1\uffff\1\0\1\147\1\60\1\uffff\1\0\1\150\1\uffff\1\0\1\60\1\0\1\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\uffff\1\165\1\141\1\56\1\172\1\uffff\4\uffff\1\167\3\uffff\1\75\1\141\1\157\1\74\1\75\1\157\1\145\1\162\1\154\1\145\1\75\1\171\1\141\2\75\1\55\1\75\1\136\1\75\1\76\1\172\2\75\1\172\1\uffff\1\71\1\170\1\71\1\40\1\170\1\uffff\4\uffff\1\156\1\154\1\162\1\uffff\1\143\2\uffff\1\164\1\172\1\160\3\uffff\1\uffff\5\uffff\1\162\1\154\1\151\5\uffff\1\160\1\141\1\156\1\163\2\uffff\1\75\2\uffff\2\164\1\156\1\145\1\163\1\71\1\uffff\1\146\1\uffff\1\160\1\162\2\uffff\1\132\1\75\1\uffff\1\75\3\uffff\1\71\2\uffff\2\71\3\uffff\2\uffff\1\uffff\1\143\1\154\1\172\1\153\1\145\1\uffff\1\157\1\uffff\1\165\1\145\1\164\1\172\1\156\1\164\1\145\1\uffff\1\157\1\165\1\147\1\141\1\145\1\172\2\145\1\172\3\uffff\5\uffff\1\uffff\1\172\1\164\1\uffff\1\141\2\162\3\143\1\uffff\1\172\1\151\1\164\2\172\1\162\1\145\1\153\1\172\1\162\1\165\1\172\2\uffff\4\uffff\1\uffff\1\150\1\147\1\146\3\164\1\150\1\uffff\1\156\1\172\2\uffff\1\156\2\172\1\uffff\1\172\1\154\1\uffff\4\uffff\1\162\1\145\1\141\4\172\1\165\1\uffff\1\172\3\uffff\1\164\2\uffff\1\157\1\172\1\143\4\uffff\1\145\1\uffff\1\172\2\uffff\1\165\1\uffff\1\145\1\172\1\uffff\1\uffff\1\147\1\172\1\uffff\1\uffff\1\150\1\uffff\1\uffff\1\172\1\uffff\1\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\5\uffff\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15\1\16\30\uffff\1\60\6\uffff\1\72\1\77\1\100\1\1\3\uffff\1\72\1\uffff\1\20\1\4\3\uffff\1\5\1\6\1\74\1\uffff\1\70\1\7\1\10\1\11\1\12\3\uffff\1\14\1\15\1\16\1\17\1\57\4\uffff\1\24\1\55\1\uffff\1\46\1\25\6\uffff\1\65\1\uffff\1\41\2\uffff\1\44\1\45\2\uffff\1\56\1\uffff\1\75\1\76\1\73\1\uffff\1\63\1\62\2\uffff\1\66\1\77\1\67\2\uffff\1\71\5\uffff\1\32\1\uffff\1\70\7\uffff\1\24\11\uffff\1\54\1\61\1\64\5\uffff\1\71\2\uffff\1\36\6\uffff\1\22\14\uffff\1\43\1\54\4\uffff\1\2\7\uffff\1\23\2\uffff\1\50\1\26\3\uffff\1\33\2\uffff\1\42\14\uffff\1\40\1\uffff\1\52\1\30\1\37\6\uffff\1\53\1\13\1\35\1\47\1\uffff\1\27\4\uffff\1\3\2\uffff\1\51\3\uffff\1\31\2\uffff\1\21\3\uffff\1\34";
    static final String DFA27_specialS =
        "\1\0\5\uffff\1\27\46\uffff\1\23\21\uffff\1\24\62\uffff\1\31\1\11\35\uffff\1\26\1\30\1\32\1\25\1\1\31\uffff\1\4\1\7\1\3\1\2\24\uffff\1\5\1\10\1\21\1\17\16\uffff\1\6\1\12\12\uffff\1\20\1\13\5\uffff\1\14\3\uffff\1\15\2\uffff\1\16\1\uffff\1\22\1\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\60\1\57\1\53\2\60\1\57\22\60\1\57\1\41\1\55\2\60\1\45\1\40\1\6\1\7\1\10\1\17\1\34\1\16\1\35\1\4\1\44\1\51\11\50\1\23\1\1\1\22\1\31\1\42\2\60\1\36\3\56\1\52\25\56\1\11\1\54\1\12\1\43\1\46\1\60\1\56\1\26\1\21\1\30\1\27\1\2\1\24\1\56\1\5\3\56\1\20\2\56\1\3\1\56\1\25\1\13\1\32\1\56\1\33\4\56\1\14\1\37\1\15\uff82\60",
            "",
            "\1\63\15\uffff\1\64\5\uffff\1\62",
            "\1\66",
            "\1\67",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\72\6\65\1\73\1\71\14\65",
            "\12\76\1\77\34\76\1\100\uffd8\76",
            "",
            "",
            "",
            "",
            "\1\106\16\uffff\1\105\2\uffff\1\107",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\120\6\uffff\1\116\6\uffff\1\117",
            "\1\121\16\uffff\1\123",
            "\1\124",
            "\1\126",
            "\1\130\3\uffff\1\127",
            "\1\131",
            "\1\134\1\uffff\1\134\2\uffff\12\133\62\uffff\1\132",
            "\1\135",
            "\1\122",
            "\1\137",
            "\1\140",
            "\1\141\21\uffff\1\114",
            "\1\142\17\uffff\1\114",
            "\1\143",
            "\1\114",
            "\1\114\40\uffff\1\144",
            "\1\122",
            "\1\146",
            "\1\114\3\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\147\4\uffff\1\150\15\uffff\1\114",
            "\1\114",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\152",
            "\10\155\2\156\36\uffff\1\153\37\uffff\1\153",
            "\1\134\1\uffff\1\134\2\uffff\12\133",
            "\2\160\2\uffff\1\160\22\uffff\1\160",
            "\1\157\4\uffff\1\157\10\uffff\10\161\35\uffff\1\157\6\uffff\1\157\4\uffff\2\157\3\uffff\1\157\7\uffff\1\157\3\uffff\1\157\1\uffff\3\157\1\uffff\1\161",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "",
            "",
            "\1\171",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\173",
            "",
            "",
            "",
            "\12\76\1\77\34\76\1\100\uffd8\76",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "\1\114",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\u008a",
            "",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\u008e",
            "\1\114",
            "",
            "\1\114",
            "",
            "",
            "",
            "\12\152",
            "",
            "",
            "\10\155\2\156",
            "\12\156",
            "",
            "",
            "",
            "\42\76\1\u0093\4\76\1\u0093\10\76\10\u0095\35\76\1\u0092\6\76\1\u0093\4\76\2\u0093\3\76\1\u0093\7\76\1\u0093\3\76\1\u0093\1\76\1\u0093\1\u0091\1\u0093\1\76\1\u0094\uff87\76",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "",
            "\1\u0097",
            "\1\u0098",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a1",
            "\1\u00a3\1\u00a2",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\u008a\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ab\3\uffff\1\u00aa",
            "\1\u00ac",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\60\76\12\u00af\7\76\6\u00af\32\76\6\u00af\uff99\76",
            "\60\76\12\u00b0\7\76\6\u00b0\32\76\6\u00b0\uff99\76",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "\60\76\12\u00b1\7\76\6\u00b1\32\76\6\u00b1\uff99\76",
            "\60\76\10\u00b2\uffc8\76",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00bc",
            "\1\u00bd",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c4",
            "\1\u00c5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\60\76\12\u00c7\7\76\6\u00c7\32\76\6\u00c7\uff99\76",
            "\60\76\12\u00c8\7\76\6\u00c8\32\76\6\u00c8\uff99\76",
            "\60\76\12\u00c9\7\76\6\u00c9\32\76\6\u00c9\uff99\76",
            "\60\76\10\u00ca\uffc8\76",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u00d4",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d8",
            "",
            "\60\76\12\u00d9\7\76\6\u00d9\32\76\6\u00d9\uff99\76",
            "\60\76\12\u00da\7\76\6\u00da\32\76\6\u00da\uff99\76",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00e2",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\1\u00e4",
            "\60\76\12\u00e5\7\76\6\u00e5\32\76\6\u00e5\uff99\76",
            "\60\76\12\u00e6\7\76\6\u00e6\32\76\6\u00e6\uff99\76",
            "\1\u00e7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00e9",
            "",
            "",
            "",
            "",
            "\1\u00ea",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            "\60\76\12\u00ec\7\76\6\u00ec\32\76\6\u00ec\uff99\76",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\60\76\12\u00f0\7\76\6\u00f0\32\76\6\u00f0\uff99\76",
            "\1\u00f1",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\60\76\12\u00f3\7\76\6\u00f3\32\76\6\u00f3\uff99\76",
            "\1\u00f4",
            "",
            "\60\76\12\u00f5\7\76\6\u00f5\32\76\6\u00f5\uff99\76",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\76\1\163\27\76\1\164\71\76\1\162\uffa3\76",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_UNICODE_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_LETTER | RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT | RULE_DECIMALS | RULE_EXPOENT | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0==';') ) {s = 1;}

                        else if ( (LA27_0=='f') ) {s = 2;}

                        else if ( (LA27_0=='p') ) {s = 3;}

                        else if ( (LA27_0=='.') ) {s = 4;}

                        else if ( (LA27_0=='i') ) {s = 5;}

                        else if ( (LA27_0=='\'') ) {s = 6;}

                        else if ( (LA27_0=='(') ) {s = 7;}

                        else if ( (LA27_0==')') ) {s = 8;}

                        else if ( (LA27_0=='[') ) {s = 9;}

                        else if ( (LA27_0==']') ) {s = 10;}

                        else if ( (LA27_0=='s') ) {s = 11;}

                        else if ( (LA27_0=='{') ) {s = 12;}

                        else if ( (LA27_0=='}') ) {s = 13;}

                        else if ( (LA27_0==',') ) {s = 14;}

                        else if ( (LA27_0=='*') ) {s = 15;}

                        else if ( (LA27_0=='m') ) {s = 16;}

                        else if ( (LA27_0=='c') ) {s = 17;}

                        else if ( (LA27_0=='<') ) {s = 18;}

                        else if ( (LA27_0==':') ) {s = 19;}

                        else if ( (LA27_0=='g') ) {s = 20;}

                        else if ( (LA27_0=='r') ) {s = 21;}

                        else if ( (LA27_0=='b') ) {s = 22;}

                        else if ( (LA27_0=='e') ) {s = 23;}

                        else if ( (LA27_0=='d') ) {s = 24;}

                        else if ( (LA27_0=='=') ) {s = 25;}

                        else if ( (LA27_0=='t') ) {s = 26;}

                        else if ( (LA27_0=='v') ) {s = 27;}

                        else if ( (LA27_0=='+') ) {s = 28;}

                        else if ( (LA27_0=='-') ) {s = 29;}

                        else if ( (LA27_0=='A') ) {s = 30;}

                        else if ( (LA27_0=='|') ) {s = 31;}

                        else if ( (LA27_0=='&') ) {s = 32;}

                        else if ( (LA27_0=='!') ) {s = 33;}

                        else if ( (LA27_0=='>') ) {s = 34;}

                        else if ( (LA27_0=='^') ) {s = 35;}

                        else if ( (LA27_0=='/') ) {s = 36;}

                        else if ( (LA27_0=='%') ) {s = 37;}

                        else if ( (LA27_0=='_') ) {s = 38;}

                        else if ( ((LA27_0>='1' && LA27_0<='9')) ) {s = 40;}

                        else if ( (LA27_0=='0') ) {s = 41;}

                        else if ( (LA27_0=='E') ) {s = 42;}

                        else if ( (LA27_0=='\n') ) {s = 43;}

                        else if ( (LA27_0=='\\') ) {s = 44;}

                        else if ( (LA27_0=='\"') ) {s = 45;}

                        else if ( ((LA27_0>='B' && LA27_0<='D')||(LA27_0>='F' && LA27_0<='Z')||LA27_0=='a'||LA27_0=='h'||(LA27_0>='j' && LA27_0<='l')||(LA27_0>='n' && LA27_0<='o')||LA27_0=='q'||LA27_0=='u'||(LA27_0>='w' && LA27_0<='z')) ) {s = 46;}

                        else if ( (LA27_0=='\t'||LA27_0=='\r'||LA27_0==' ') ) {s = 47;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||(LA27_0>='#' && LA27_0<='$')||(LA27_0>='?' && LA27_0<='@')||LA27_0=='`'||(LA27_0>='~' && LA27_0<='\uFFFF')) ) {s = 48;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_149 = input.LA(1);

                        s = -1;
                        if ( ((LA27_149>='\u0000' && LA27_149<='/')||(LA27_149>='8' && LA27_149<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_149>='0' && LA27_149<='7')) ) {s = 178;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_178 = input.LA(1);

                        s = -1;
                        if ( ((LA27_178>='\u0000' && LA27_178<='/')||(LA27_178>='8' && LA27_178<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_178>='0' && LA27_178<='7')) ) {s = 202;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_177 = input.LA(1);

                        s = -1;
                        if ( ((LA27_177>='\u0000' && LA27_177<='/')||(LA27_177>=':' && LA27_177<='@')||(LA27_177>='G' && LA27_177<='`')||(LA27_177>='g' && LA27_177<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_177>='0' && LA27_177<='9')||(LA27_177>='A' && LA27_177<='F')||(LA27_177>='a' && LA27_177<='f')) ) {s = 201;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_175 = input.LA(1);

                        s = -1;
                        if ( ((LA27_175>='\u0000' && LA27_175<='/')||(LA27_175>=':' && LA27_175<='@')||(LA27_175>='G' && LA27_175<='`')||(LA27_175>='g' && LA27_175<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_175>='0' && LA27_175<='9')||(LA27_175>='A' && LA27_175<='F')||(LA27_175>='a' && LA27_175<='f')) ) {s = 199;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_199 = input.LA(1);

                        s = -1;
                        if ( ((LA27_199>='\u0000' && LA27_199<='/')||(LA27_199>=':' && LA27_199<='@')||(LA27_199>='G' && LA27_199<='`')||(LA27_199>='g' && LA27_199<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_199>='0' && LA27_199<='9')||(LA27_199>='A' && LA27_199<='F')||(LA27_199>='a' && LA27_199<='f')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_217 = input.LA(1);

                        s = -1;
                        if ( ((LA27_217>='\u0000' && LA27_217<='/')||(LA27_217>=':' && LA27_217<='@')||(LA27_217>='G' && LA27_217<='`')||(LA27_217>='g' && LA27_217<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_217>='0' && LA27_217<='9')||(LA27_217>='A' && LA27_217<='F')||(LA27_217>='a' && LA27_217<='f')) ) {s = 229;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_176 = input.LA(1);

                        s = -1;
                        if ( ((LA27_176>='\u0000' && LA27_176<='/')||(LA27_176>=':' && LA27_176<='@')||(LA27_176>='G' && LA27_176<='`')||(LA27_176>='g' && LA27_176<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_176>='0' && LA27_176<='9')||(LA27_176>='A' && LA27_176<='F')||(LA27_176>='a' && LA27_176<='f')) ) {s = 200;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_200 = input.LA(1);

                        s = -1;
                        if ( ((LA27_200>='\u0000' && LA27_200<='/')||(LA27_200>=':' && LA27_200<='@')||(LA27_200>='G' && LA27_200<='`')||(LA27_200>='g' && LA27_200<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_200>='0' && LA27_200<='9')||(LA27_200>='A' && LA27_200<='F')||(LA27_200>='a' && LA27_200<='f')) ) {s = 218;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_115 = input.LA(1);

                        s = -1;
                        if ( (LA27_115=='\"') ) {s = 116;}

                        else if ( (LA27_115=='\\') ) {s = 114;}

                        else if ( (LA27_115=='\n') ) {s = 115;}

                        else if ( ((LA27_115>='\u0000' && LA27_115<='\t')||(LA27_115>='\u000B' && LA27_115<='!')||(LA27_115>='#' && LA27_115<='[')||(LA27_115>=']' && LA27_115<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_218 = input.LA(1);

                        s = -1;
                        if ( ((LA27_218>='\u0000' && LA27_218<='/')||(LA27_218>=':' && LA27_218<='@')||(LA27_218>='G' && LA27_218<='`')||(LA27_218>='g' && LA27_218<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_218>='0' && LA27_218<='9')||(LA27_218>='A' && LA27_218<='F')||(LA27_218>='a' && LA27_218<='f')) ) {s = 230;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_230 = input.LA(1);

                        s = -1;
                        if ( ((LA27_230>='0' && LA27_230<='9')||(LA27_230>='A' && LA27_230<='F')||(LA27_230>='a' && LA27_230<='f')) ) {s = 236;}

                        else if ( ((LA27_230>='\u0000' && LA27_230<='/')||(LA27_230>=':' && LA27_230<='@')||(LA27_230>='G' && LA27_230<='`')||(LA27_230>='g' && LA27_230<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_236 = input.LA(1);

                        s = -1;
                        if ( ((LA27_236>='\u0000' && LA27_236<='/')||(LA27_236>=':' && LA27_236<='@')||(LA27_236>='G' && LA27_236<='`')||(LA27_236>='g' && LA27_236<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_236>='0' && LA27_236<='9')||(LA27_236>='A' && LA27_236<='F')||(LA27_236>='a' && LA27_236<='f')) ) {s = 240;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_240 = input.LA(1);

                        s = -1;
                        if ( ((LA27_240>='\u0000' && LA27_240<='/')||(LA27_240>=':' && LA27_240<='@')||(LA27_240>='G' && LA27_240<='`')||(LA27_240>='g' && LA27_240<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_240>='0' && LA27_240<='9')||(LA27_240>='A' && LA27_240<='F')||(LA27_240>='a' && LA27_240<='f')) ) {s = 243;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_243 = input.LA(1);

                        s = -1;
                        if ( ((LA27_243>='\u0000' && LA27_243<='/')||(LA27_243>=':' && LA27_243<='@')||(LA27_243>='G' && LA27_243<='`')||(LA27_243>='g' && LA27_243<='\uFFFF')) ) {s = 62;}

                        else if ( ((LA27_243>='0' && LA27_243<='9')||(LA27_243>='A' && LA27_243<='F')||(LA27_243>='a' && LA27_243<='f')) ) {s = 245;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_202 = input.LA(1);

                        s = -1;
                        if ( (LA27_202=='\"') ) {s = 116;}

                        else if ( (LA27_202=='\n') ) {s = 115;}

                        else if ( (LA27_202=='\\') ) {s = 114;}

                        else if ( ((LA27_202>='\u0000' && LA27_202<='\t')||(LA27_202>='\u000B' && LA27_202<='!')||(LA27_202>='#' && LA27_202<='[')||(LA27_202>=']' && LA27_202<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_229 = input.LA(1);

                        s = -1;
                        if ( (LA27_229=='\"') ) {s = 116;}

                        else if ( (LA27_229=='\\') ) {s = 114;}

                        else if ( (LA27_229=='\n') ) {s = 115;}

                        else if ( ((LA27_229>='\u0000' && LA27_229<='\t')||(LA27_229>='\u000B' && LA27_229<='!')||(LA27_229>='#' && LA27_229<='[')||(LA27_229>=']' && LA27_229<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_201 = input.LA(1);

                        s = -1;
                        if ( (LA27_201=='\"') ) {s = 116;}

                        else if ( (LA27_201=='\\') ) {s = 114;}

                        else if ( (LA27_201=='\n') ) {s = 115;}

                        else if ( ((LA27_201>='\u0000' && LA27_201<='\t')||(LA27_201>='\u000B' && LA27_201<='!')||(LA27_201>='#' && LA27_201<='[')||(LA27_201>=']' && LA27_201<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_245 = input.LA(1);

                        s = -1;
                        if ( (LA27_245=='\"') ) {s = 116;}

                        else if ( (LA27_245=='\\') ) {s = 114;}

                        else if ( (LA27_245=='\n') ) {s = 115;}

                        else if ( ((LA27_245>='\u0000' && LA27_245<='\t')||(LA27_245>='\u000B' && LA27_245<='!')||(LA27_245>='#' && LA27_245<='[')||(LA27_245>=']' && LA27_245<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_45 = input.LA(1);

                        s = -1;
                        if ( (LA27_45=='\\') ) {s = 114;}

                        else if ( (LA27_45=='\n') ) {s = 115;}

                        else if ( (LA27_45=='\"') ) {s = 116;}

                        else if ( ((LA27_45>='\u0000' && LA27_45<='\t')||(LA27_45>='\u000B' && LA27_45<='!')||(LA27_45>='#' && LA27_45<='[')||(LA27_45>=']' && LA27_45<='\uFFFF')) ) {s = 62;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_63 = input.LA(1);

                        s = -1;
                        if ( (LA27_63=='\'') ) {s = 64;}

                        else if ( ((LA27_63>='\u0000' && LA27_63<='\t')||(LA27_63>='\u000B' && LA27_63<='&')||(LA27_63>='(' && LA27_63<='\uFFFF')) ) {s = 62;}

                        else if ( (LA27_63=='\n') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_148 = input.LA(1);

                        s = -1;
                        if ( ((LA27_148>='0' && LA27_148<='9')||(LA27_148>='A' && LA27_148<='F')||(LA27_148>='a' && LA27_148<='f')) ) {s = 177;}

                        else if ( ((LA27_148>='\u0000' && LA27_148<='/')||(LA27_148>=':' && LA27_148<='@')||(LA27_148>='G' && LA27_148<='`')||(LA27_148>='g' && LA27_148<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_145 = input.LA(1);

                        s = -1;
                        if ( ((LA27_145>='0' && LA27_145<='9')||(LA27_145>='A' && LA27_145<='F')||(LA27_145>='a' && LA27_145<='f')) ) {s = 175;}

                        else if ( ((LA27_145>='\u0000' && LA27_145<='/')||(LA27_145>=':' && LA27_145<='@')||(LA27_145>='G' && LA27_145<='`')||(LA27_145>='g' && LA27_145<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA27_6 = input.LA(1);

                        s = -1;
                        if ( ((LA27_6>='\u0000' && LA27_6<='\t')||(LA27_6>='\u000B' && LA27_6<='&')||(LA27_6>='(' && LA27_6<='\uFFFF')) ) {s = 62;}

                        else if ( (LA27_6=='\n') ) {s = 63;}

                        else if ( (LA27_6=='\'') ) {s = 64;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA27_146 = input.LA(1);

                        s = -1;
                        if ( ((LA27_146>='0' && LA27_146<='9')||(LA27_146>='A' && LA27_146<='F')||(LA27_146>='a' && LA27_146<='f')) ) {s = 176;}

                        else if ( ((LA27_146>='\u0000' && LA27_146<='/')||(LA27_146>=':' && LA27_146<='@')||(LA27_146>='G' && LA27_146<='`')||(LA27_146>='g' && LA27_146<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_114 = input.LA(1);

                        s = -1;
                        if ( (LA27_114=='u') ) {s = 145;}

                        else if ( (LA27_114=='U') ) {s = 146;}

                        else if ( (LA27_114=='\"'||LA27_114=='\''||LA27_114=='\\'||(LA27_114>='a' && LA27_114<='b')||LA27_114=='f'||LA27_114=='n'||LA27_114=='r'||LA27_114=='t'||LA27_114=='v') ) {s = 147;}

                        else if ( (LA27_114=='x') ) {s = 148;}

                        else if ( ((LA27_114>='0' && LA27_114<='7')) ) {s = 149;}

                        else if ( ((LA27_114>='\u0000' && LA27_114<='!')||(LA27_114>='#' && LA27_114<='&')||(LA27_114>='(' && LA27_114<='/')||(LA27_114>='8' && LA27_114<='T')||(LA27_114>='V' && LA27_114<='[')||(LA27_114>=']' && LA27_114<='`')||(LA27_114>='c' && LA27_114<='e')||(LA27_114>='g' && LA27_114<='m')||(LA27_114>='o' && LA27_114<='q')||LA27_114=='s'||LA27_114=='w'||(LA27_114>='y' && LA27_114<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_147 = input.LA(1);

                        s = -1;
                        if ( (LA27_147=='\"') ) {s = 116;}

                        else if ( (LA27_147=='\\') ) {s = 114;}

                        else if ( (LA27_147=='\n') ) {s = 115;}

                        else if ( ((LA27_147>='\u0000' && LA27_147<='\t')||(LA27_147>='\u000B' && LA27_147<='!')||(LA27_147>='#' && LA27_147<='[')||(LA27_147>=']' && LA27_147<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}