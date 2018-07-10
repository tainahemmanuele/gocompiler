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
    public static final int RULE_DECIMAL_DIGIT=23;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=12;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=26;
    public static final int RULE_INTERPRETED_STRING_LIT=10;
    public static final int RULE_UNICODE_VALUE=7;
    public static final int RULE_LITTLE_U_VALUE=31;
    public static final int RULE_ASSING_OP=11;
    public static final int RULE_HEX_BYTE_VALUE=35;
    public static final int RULE_OCTAL_BYTE_VALUE=34;
    public static final int RULE_MUL_OP=21;
    public static final int RULE_INT=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=36;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_EXPOENT=28;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=5;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=16;
    public static final int RULE_BIG_U_VALUE=32;
    public static final int RULE_ESCAPED_CHAR=33;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=15;
    public static final int RULE_BYTE_VALUE=8;
    public static final int RULE_SL_COMMENT=37;
    public static final int RULE_UNICODE_LETTER=18;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=17;
    public static final int RULE_HEX_LIT=30;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=20;
    public static final int RULE_OCTAL_DIGIT=24;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_WS=38;
    public static final int RULE_ANY_OTHER=39;
    public static final int RULE_OCTAL_LIT=29;
    public static final int RULE_FLOAT_LIT=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_RAW_STRING_LIT=9;
    public static final int RULE_INT_LIT=14;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=13;
    public static final int T__45=45;
    public static final int RULE_REL_OP=19;
    public static final int RULE_HEX_DIGIT=25;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_DECIMAL_LIT=27;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
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
    // $ANTLR end "T__82"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:8138:23: ( '\\n' )
            // InternalGo.g:8138:25: '\\n'
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
            // InternalGo.g:8140:28: ( '\\n' )
            // InternalGo.g:8140:30: '\\n'
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
            // InternalGo.g:8142:21: ( ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' ) )
            // InternalGo.g:8142:23: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
            {
            // InternalGo.g:8142:23: ( 'A-Z' | 'a-z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0-\\u00D6' | '\\u00D8-\\u00F6' | '\\u00F8-\\u021F' | '\\u0222-\\u0233' | '\\u0250-\\u02AD' | '\\u02B0-\\u02B8' | '\\u02BB-\\u02C1' | '\\u02D0-\\u02D1' | '\\u02E0-\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388-\\u038A' | '\\u038C' | '\\u038E-\\u03A1' | '\\u03A3-\\u03CE' | '\\u03D0-\\u03D7' | '\\u03DA-\\u03F3' | '\\u0400-\\u0481' | '\\u048C-\\u04C4' | '\\u04C7-\\u04C8' | '\\u04CB-\\u04CC' | '\\u04D0-\\u04F5' | '\\u04F8-\\u04F9' | '\\u0531-\\u0556' | '\\u0559' | '\\u0561-\\u0587' | '\\u05D0-\\u05EA' | '\\u05F0-\\u05F2' | '\\u0621-\\u063A' | '\\u0640-\\u064A' | '\\u0671-\\u06D3' | '\\u06D5' | '\\u06E5-\\u06E6' | '\\u06FA-\\u06FC' | '\\u0710' | '\\u0712-\\u072C' | '\\u0780-\\u07A5' | '\\u0905-\\u0939' | '\\u093D' | '\\u0950' | '\\u0958-\\u0961' | '\\u0985-\\u098C' | '\\u098F-\\u0990' | '\\u0993-\\u09A8' | '\\u09AA-\\u09B0' | '\\u09B2' | '\\u09B6-\\u09B9' | '\\u09DC-\\u09DD' | '\\u09DF-\\u09E1' | '\\u09F0-\\u09F1' | '\\u0A05-\\u0A0A' | '\\u0A0F-\\u0A10' | '\\u0A13-\\u0A28' | '\\u0A2A-\\u0A30' | '\\u0A32-\\u0A33' | '\\u0A35-\\u0A36' | '\\u0A38-\\u0A39' | '\\u0A59-\\u0A5C' | '\\u0A5E' | '\\u0A72-\\u0A74' | '\\u0A85-\\u0A8B' | '\\u0A8D' | '\\u0A8F-\\u0A91' | '\\u0A93-\\u0AA8' | '\\u0AAA-\\u0AB0' | '\\u0AB2-\\u0AB3' | '\\u0AB5-\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0B05-\\u0B0C' | '\\u0B0F-\\u0B10' | '\\u0B13-\\u0B28' | '\\u0B2A-\\u0B30' | '\\u0B32-\\u0B33' | '\\u0B36-\\u0B39' | '\\u0B3D' | '\\u0B5C-\\u0B5D' | '\\u0B5F-\\u0B61' | '\\u0B85-\\u0B8A' | '\\u0B8E-\\u0B90' | '\\u0B92-\\u0B95' | '\\u0B99-\\u0B9A' | '\\u0B9C' | '\\u0B9E-\\u0B9F' | '\\u0BA3-\\u0BA4' | '\\u0BA8-\\u0BAA' | '\\u0BAE-\\u0BB5' | '\\u0BB7-\\u0BB9' | '\\u0C05-\\u0C0C' | '\\u0C0E-\\u0C10' | '\\u0C12-\\u0C28' | '\\u0C2A-\\u0C33' | '\\u0C35-\\u0C39' | '\\u0C60-\\u0C61' | '\\u0C85-\\u0C8C' | '\\u0C8E-\\u0C90' | '\\u0C92-\\u0CA8' | '\\u0CAA-\\u0CB3' | '\\u0CB5-\\u0CB9' | '\\u0CDE' | '\\u0CE0-\\u0CE1' | '\\u0D05-\\u0D0C' | '\\u0D0E-\\u0D10' | '\\u0D12-\\u0D28' | '\\u0D2A-\\u0D39' | '\\u0D60-\\u0D61' | '\\u0D85-\\u0D96' | '\\u0D9A-\\u0DB1' | '\\u0DB3-\\u0DBB' | '\\u0DBD' | '\\u0DC0-\\u0DC6' | '\\u0E01-\\u0E30' | '\\u0E32-\\u0E33' | '\\u0E40-\\u0E46' | '\\u0E81-\\u0E82' | '\\u0E84' | '\\u0E87-\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94-\\u0E97' | '\\u0E99-\\u0E9F' | '\\u0EA1-\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA-\\u0EAB' | '\\u0EAD-\\u0EB0' | '\\u0EB2-\\u0EB3' | '\\u0EBD-\\u0EC4' | '\\u0EC6' | '\\u0EDC-\\u0EDD' | '\\u0F00' | '\\u0F40-\\u0F6A' | '\\u0F88-\\u0F8B' | '\\u1000-\\u1021' | '\\u1023-\\u1027' | '\\u1029-\\u102A' | '\\u1050-\\u1055' | '\\u10A0-\\u10C5' | '\\u10D0-\\u10F6' | '\\u1100-\\u1159' | '\\u115F-\\u11A2' | '\\u11A8-\\u11F9' | '\\u1200-\\u1206' | '\\u1208-\\u1246' | '\\u1248' | '\\u124A-\\u124D' | '\\u1250-\\u1256' | '\\u1258' | '\\u125A-\\u125D' | '\\u1260-\\u1286' | '\\u1288' | '\\u128A-\\u128D' | '\\u1290-\\u12AE' | '\\u12B0' | '\\u12B2-\\u12B5' | '\\u12B8-\\u12BE' | '\\u12C0' | '\\u12C2-\\u12C5' | '\\u12C8-\\u12CE' | '\\u12D0-\\u12D6' | '\\u12D8-\\u12EE' | '\\u12F0-\\u130E' | '\\u1310' | '\\u1312-\\u1315' | '\\u1318-\\u131E' | '\\u1320-\\u1346' | '\\u1348-\\u135A' | '\\u13A0-\\u13B0' | '\\u13B1-\\u13F4' | '\\u1401-\\u1676' | '\\u1681-\\u169A' | '\\u16A0-\\u16EA' | '\\u1780-\\u17B3' | '\\u1820-\\u1877' | '\\u1880-\\u18A8' | '\\u1E00-\\u1E9B' | '\\u1EA0-\\u1EE0' | '\\u1EE1-\\u1EF9' | '\\u1F00-\\u1F15' | '\\u1F18-\\u1F1D' | '\\u1F20-\\u1F39' | '\\u1F3A-\\u1F45' | '\\u1F48-\\u1F4D' | '\\u1F50-\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F-\\u1F7D' | '\\u1F80-\\u1FB4' | '\\u1FB6-\\u1FBC' | '\\u1FBE' | '\\u1FC2-\\u1FC4' | '\\u1FC6-\\u1FCC' | '\\u1FD0-\\u1FD3' | '\\u1FD6-\\u1FDB' | '\\u1FE0-\\u1FEC' | '\\u1FF2-\\u1FF4' | '\\u1FF6-\\u1FFC' | '\\u207F' | '\\u2102' | '\\u2107' | '\\u210A-\\u2113' | '\\u2115' | '\\u2119-\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A-\\u212D' | '\\u212F-\\u2131' | '\\u2133-\\u2139' | '\\u2160-\\u2183' | '\\u3005-\\u3007' | '\\u3021-\\u3029' | '\\u3031-\\u3035' | '\\u3038-\\u303A' | '\\u3041-\\u3094' | '\\u309D-\\u309E' | '\\u30A1-\\u30FA' | '\\u30FC-\\u30FE' | '\\u3105-\\u312C' | '\\u3131-\\u318E' | '\\u31A0-\\u31B7' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FA5' | '\\uA000-\\uA48C' | '\\uAC00' | '\\uD7A3' | '\\uF900-\\uFA2D' | '\\uFB00-\\uFB06' | '\\uFB13-\\uFB17' | '\\uFB1D' | '\\uFB1F-\\uFB28' | '\\uFB2A-\\uFB36' | '\\uFB38-\\uFB3C' | '\\uFB3E' | '\\uFB40-\\uFB41' | '\\uFB43-\\uFB44' | '\\uFB46-\\uFBB1' | '\\uFBD3-\\uFD3D' | '\\uFD50-\\uFD8F' | '\\uFD92-\\uFDC7' | '\\uFDF0-\\uFDFB' | '\\uFE70-\\uFE72' | '\\uFE74' | '\\uFE76-\\uFEFC' | '\\uFF21-\\uFF3A' | '\\uFF41-\\uFF5A' | '\\uFF66-\\uFFBE' | '\\uFFC2-\\uFFC7' | '\\uFFCA-\\uFFCF' | '\\uFFD2-\\uFFD7' | '\\uFFDA-\\uFFDC' )
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
                    // InternalGo.g:8142:24: 'A-Z'
                    {
                    match("A-Z"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8142:30: 'a-z'
                    {
                    match("a-z"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8142:36: '\\u00AA'
                    {
                    match('\u00AA'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8142:45: '\\u00B5'
                    {
                    match('\u00B5'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8142:54: '\\u00BA'
                    {
                    match('\u00BA'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8142:63: '\\u00C0-\\u00D6'
                    {
                    match("\u00C0-\u00D6"); 


                    }
                    break;
                case 7 :
                    // InternalGo.g:8142:79: '\\u00D8-\\u00F6'
                    {
                    match("\u00D8-\u00F6"); 


                    }
                    break;
                case 8 :
                    // InternalGo.g:8142:95: '\\u00F8-\\u021F'
                    {
                    match("\u00F8-\u021F"); 


                    }
                    break;
                case 9 :
                    // InternalGo.g:8142:111: '\\u0222-\\u0233'
                    {
                    match("\u0222-\u0233"); 


                    }
                    break;
                case 10 :
                    // InternalGo.g:8142:127: '\\u0250-\\u02AD'
                    {
                    match("\u0250-\u02AD"); 


                    }
                    break;
                case 11 :
                    // InternalGo.g:8142:143: '\\u02B0-\\u02B8'
                    {
                    match("\u02B0-\u02B8"); 


                    }
                    break;
                case 12 :
                    // InternalGo.g:8142:159: '\\u02BB-\\u02C1'
                    {
                    match("\u02BB-\u02C1"); 


                    }
                    break;
                case 13 :
                    // InternalGo.g:8142:175: '\\u02D0-\\u02D1'
                    {
                    match("\u02D0-\u02D1"); 


                    }
                    break;
                case 14 :
                    // InternalGo.g:8142:191: '\\u02E0-\\u02E4'
                    {
                    match("\u02E0-\u02E4"); 


                    }
                    break;
                case 15 :
                    // InternalGo.g:8142:207: '\\u02EE'
                    {
                    match('\u02EE'); 

                    }
                    break;
                case 16 :
                    // InternalGo.g:8142:216: '\\u037A'
                    {
                    match('\u037A'); 

                    }
                    break;
                case 17 :
                    // InternalGo.g:8142:225: '\\u0386'
                    {
                    match('\u0386'); 

                    }
                    break;
                case 18 :
                    // InternalGo.g:8142:234: '\\u0388-\\u038A'
                    {
                    match("\u0388-\u038A"); 


                    }
                    break;
                case 19 :
                    // InternalGo.g:8142:250: '\\u038C'
                    {
                    match('\u038C'); 

                    }
                    break;
                case 20 :
                    // InternalGo.g:8142:259: '\\u038E-\\u03A1'
                    {
                    match("\u038E-\u03A1"); 


                    }
                    break;
                case 21 :
                    // InternalGo.g:8142:275: '\\u03A3-\\u03CE'
                    {
                    match("\u03A3-\u03CE"); 


                    }
                    break;
                case 22 :
                    // InternalGo.g:8142:291: '\\u03D0-\\u03D7'
                    {
                    match("\u03D0-\u03D7"); 


                    }
                    break;
                case 23 :
                    // InternalGo.g:8142:307: '\\u03DA-\\u03F3'
                    {
                    match("\u03DA-\u03F3"); 


                    }
                    break;
                case 24 :
                    // InternalGo.g:8142:323: '\\u0400-\\u0481'
                    {
                    match("\u0400-\u0481"); 


                    }
                    break;
                case 25 :
                    // InternalGo.g:8142:339: '\\u048C-\\u04C4'
                    {
                    match("\u048C-\u04C4"); 


                    }
                    break;
                case 26 :
                    // InternalGo.g:8142:355: '\\u04C7-\\u04C8'
                    {
                    match("\u04C7-\u04C8"); 


                    }
                    break;
                case 27 :
                    // InternalGo.g:8142:371: '\\u04CB-\\u04CC'
                    {
                    match("\u04CB-\u04CC"); 


                    }
                    break;
                case 28 :
                    // InternalGo.g:8142:387: '\\u04D0-\\u04F5'
                    {
                    match("\u04D0-\u04F5"); 


                    }
                    break;
                case 29 :
                    // InternalGo.g:8142:403: '\\u04F8-\\u04F9'
                    {
                    match("\u04F8-\u04F9"); 


                    }
                    break;
                case 30 :
                    // InternalGo.g:8142:419: '\\u0531-\\u0556'
                    {
                    match("\u0531-\u0556"); 


                    }
                    break;
                case 31 :
                    // InternalGo.g:8142:435: '\\u0559'
                    {
                    match('\u0559'); 

                    }
                    break;
                case 32 :
                    // InternalGo.g:8142:444: '\\u0561-\\u0587'
                    {
                    match("\u0561-\u0587"); 


                    }
                    break;
                case 33 :
                    // InternalGo.g:8142:460: '\\u05D0-\\u05EA'
                    {
                    match("\u05D0-\u05EA"); 


                    }
                    break;
                case 34 :
                    // InternalGo.g:8142:476: '\\u05F0-\\u05F2'
                    {
                    match("\u05F0-\u05F2"); 


                    }
                    break;
                case 35 :
                    // InternalGo.g:8142:492: '\\u0621-\\u063A'
                    {
                    match("\u0621-\u063A"); 


                    }
                    break;
                case 36 :
                    // InternalGo.g:8142:508: '\\u0640-\\u064A'
                    {
                    match("\u0640-\u064A"); 


                    }
                    break;
                case 37 :
                    // InternalGo.g:8142:524: '\\u0671-\\u06D3'
                    {
                    match("\u0671-\u06D3"); 


                    }
                    break;
                case 38 :
                    // InternalGo.g:8142:540: '\\u06D5'
                    {
                    match('\u06D5'); 

                    }
                    break;
                case 39 :
                    // InternalGo.g:8142:549: '\\u06E5-\\u06E6'
                    {
                    match("\u06E5-\u06E6"); 


                    }
                    break;
                case 40 :
                    // InternalGo.g:8142:565: '\\u06FA-\\u06FC'
                    {
                    match("\u06FA-\u06FC"); 


                    }
                    break;
                case 41 :
                    // InternalGo.g:8142:581: '\\u0710'
                    {
                    match('\u0710'); 

                    }
                    break;
                case 42 :
                    // InternalGo.g:8142:590: '\\u0712-\\u072C'
                    {
                    match("\u0712-\u072C"); 


                    }
                    break;
                case 43 :
                    // InternalGo.g:8142:606: '\\u0780-\\u07A5'
                    {
                    match("\u0780-\u07A5"); 


                    }
                    break;
                case 44 :
                    // InternalGo.g:8142:622: '\\u0905-\\u0939'
                    {
                    match("\u0905-\u0939"); 


                    }
                    break;
                case 45 :
                    // InternalGo.g:8142:638: '\\u093D'
                    {
                    match('\u093D'); 

                    }
                    break;
                case 46 :
                    // InternalGo.g:8142:647: '\\u0950'
                    {
                    match('\u0950'); 

                    }
                    break;
                case 47 :
                    // InternalGo.g:8142:656: '\\u0958-\\u0961'
                    {
                    match("\u0958-\u0961"); 


                    }
                    break;
                case 48 :
                    // InternalGo.g:8142:672: '\\u0985-\\u098C'
                    {
                    match("\u0985-\u098C"); 


                    }
                    break;
                case 49 :
                    // InternalGo.g:8142:688: '\\u098F-\\u0990'
                    {
                    match("\u098F-\u0990"); 


                    }
                    break;
                case 50 :
                    // InternalGo.g:8142:704: '\\u0993-\\u09A8'
                    {
                    match("\u0993-\u09A8"); 


                    }
                    break;
                case 51 :
                    // InternalGo.g:8142:720: '\\u09AA-\\u09B0'
                    {
                    match("\u09AA-\u09B0"); 


                    }
                    break;
                case 52 :
                    // InternalGo.g:8142:736: '\\u09B2'
                    {
                    match('\u09B2'); 

                    }
                    break;
                case 53 :
                    // InternalGo.g:8142:745: '\\u09B6-\\u09B9'
                    {
                    match("\u09B6-\u09B9"); 


                    }
                    break;
                case 54 :
                    // InternalGo.g:8142:761: '\\u09DC-\\u09DD'
                    {
                    match("\u09DC-\u09DD"); 


                    }
                    break;
                case 55 :
                    // InternalGo.g:8142:777: '\\u09DF-\\u09E1'
                    {
                    match("\u09DF-\u09E1"); 


                    }
                    break;
                case 56 :
                    // InternalGo.g:8142:793: '\\u09F0-\\u09F1'
                    {
                    match("\u09F0-\u09F1"); 


                    }
                    break;
                case 57 :
                    // InternalGo.g:8142:809: '\\u0A05-\\u0A0A'
                    {
                    match("\u0A05-\u0A0A"); 


                    }
                    break;
                case 58 :
                    // InternalGo.g:8142:825: '\\u0A0F-\\u0A10'
                    {
                    match("\u0A0F-\u0A10"); 


                    }
                    break;
                case 59 :
                    // InternalGo.g:8142:841: '\\u0A13-\\u0A28'
                    {
                    match("\u0A13-\u0A28"); 


                    }
                    break;
                case 60 :
                    // InternalGo.g:8142:857: '\\u0A2A-\\u0A30'
                    {
                    match("\u0A2A-\u0A30"); 


                    }
                    break;
                case 61 :
                    // InternalGo.g:8142:873: '\\u0A32-\\u0A33'
                    {
                    match("\u0A32-\u0A33"); 


                    }
                    break;
                case 62 :
                    // InternalGo.g:8142:889: '\\u0A35-\\u0A36'
                    {
                    match("\u0A35-\u0A36"); 


                    }
                    break;
                case 63 :
                    // InternalGo.g:8142:905: '\\u0A38-\\u0A39'
                    {
                    match("\u0A38-\u0A39"); 


                    }
                    break;
                case 64 :
                    // InternalGo.g:8142:921: '\\u0A59-\\u0A5C'
                    {
                    match("\u0A59-\u0A5C"); 


                    }
                    break;
                case 65 :
                    // InternalGo.g:8142:937: '\\u0A5E'
                    {
                    match('\u0A5E'); 

                    }
                    break;
                case 66 :
                    // InternalGo.g:8142:946: '\\u0A72-\\u0A74'
                    {
                    match("\u0A72-\u0A74"); 


                    }
                    break;
                case 67 :
                    // InternalGo.g:8142:962: '\\u0A85-\\u0A8B'
                    {
                    match("\u0A85-\u0A8B"); 


                    }
                    break;
                case 68 :
                    // InternalGo.g:8142:978: '\\u0A8D'
                    {
                    match('\u0A8D'); 

                    }
                    break;
                case 69 :
                    // InternalGo.g:8142:987: '\\u0A8F-\\u0A91'
                    {
                    match("\u0A8F-\u0A91"); 


                    }
                    break;
                case 70 :
                    // InternalGo.g:8142:1003: '\\u0A93-\\u0AA8'
                    {
                    match("\u0A93-\u0AA8"); 


                    }
                    break;
                case 71 :
                    // InternalGo.g:8142:1019: '\\u0AAA-\\u0AB0'
                    {
                    match("\u0AAA-\u0AB0"); 


                    }
                    break;
                case 72 :
                    // InternalGo.g:8142:1035: '\\u0AB2-\\u0AB3'
                    {
                    match("\u0AB2-\u0AB3"); 


                    }
                    break;
                case 73 :
                    // InternalGo.g:8142:1051: '\\u0AB5-\\u0AB9'
                    {
                    match("\u0AB5-\u0AB9"); 


                    }
                    break;
                case 74 :
                    // InternalGo.g:8142:1067: '\\u0ABD'
                    {
                    match('\u0ABD'); 

                    }
                    break;
                case 75 :
                    // InternalGo.g:8142:1076: '\\u0AD0'
                    {
                    match('\u0AD0'); 

                    }
                    break;
                case 76 :
                    // InternalGo.g:8142:1085: '\\u0AE0'
                    {
                    match('\u0AE0'); 

                    }
                    break;
                case 77 :
                    // InternalGo.g:8142:1094: '\\u0B05-\\u0B0C'
                    {
                    match("\u0B05-\u0B0C"); 


                    }
                    break;
                case 78 :
                    // InternalGo.g:8142:1110: '\\u0B0F-\\u0B10'
                    {
                    match("\u0B0F-\u0B10"); 


                    }
                    break;
                case 79 :
                    // InternalGo.g:8142:1126: '\\u0B13-\\u0B28'
                    {
                    match("\u0B13-\u0B28"); 


                    }
                    break;
                case 80 :
                    // InternalGo.g:8142:1142: '\\u0B2A-\\u0B30'
                    {
                    match("\u0B2A-\u0B30"); 


                    }
                    break;
                case 81 :
                    // InternalGo.g:8142:1158: '\\u0B32-\\u0B33'
                    {
                    match("\u0B32-\u0B33"); 


                    }
                    break;
                case 82 :
                    // InternalGo.g:8142:1174: '\\u0B36-\\u0B39'
                    {
                    match("\u0B36-\u0B39"); 


                    }
                    break;
                case 83 :
                    // InternalGo.g:8142:1190: '\\u0B3D'
                    {
                    match('\u0B3D'); 

                    }
                    break;
                case 84 :
                    // InternalGo.g:8142:1199: '\\u0B5C-\\u0B5D'
                    {
                    match("\u0B5C-\u0B5D"); 


                    }
                    break;
                case 85 :
                    // InternalGo.g:8142:1215: '\\u0B5F-\\u0B61'
                    {
                    match("\u0B5F-\u0B61"); 


                    }
                    break;
                case 86 :
                    // InternalGo.g:8142:1231: '\\u0B85-\\u0B8A'
                    {
                    match("\u0B85-\u0B8A"); 


                    }
                    break;
                case 87 :
                    // InternalGo.g:8142:1247: '\\u0B8E-\\u0B90'
                    {
                    match("\u0B8E-\u0B90"); 


                    }
                    break;
                case 88 :
                    // InternalGo.g:8142:1263: '\\u0B92-\\u0B95'
                    {
                    match("\u0B92-\u0B95"); 


                    }
                    break;
                case 89 :
                    // InternalGo.g:8142:1279: '\\u0B99-\\u0B9A'
                    {
                    match("\u0B99-\u0B9A"); 


                    }
                    break;
                case 90 :
                    // InternalGo.g:8142:1295: '\\u0B9C'
                    {
                    match('\u0B9C'); 

                    }
                    break;
                case 91 :
                    // InternalGo.g:8142:1304: '\\u0B9E-\\u0B9F'
                    {
                    match("\u0B9E-\u0B9F"); 


                    }
                    break;
                case 92 :
                    // InternalGo.g:8142:1320: '\\u0BA3-\\u0BA4'
                    {
                    match("\u0BA3-\u0BA4"); 


                    }
                    break;
                case 93 :
                    // InternalGo.g:8142:1336: '\\u0BA8-\\u0BAA'
                    {
                    match("\u0BA8-\u0BAA"); 


                    }
                    break;
                case 94 :
                    // InternalGo.g:8142:1352: '\\u0BAE-\\u0BB5'
                    {
                    match("\u0BAE-\u0BB5"); 


                    }
                    break;
                case 95 :
                    // InternalGo.g:8142:1368: '\\u0BB7-\\u0BB9'
                    {
                    match("\u0BB7-\u0BB9"); 


                    }
                    break;
                case 96 :
                    // InternalGo.g:8142:1384: '\\u0C05-\\u0C0C'
                    {
                    match("\u0C05-\u0C0C"); 


                    }
                    break;
                case 97 :
                    // InternalGo.g:8142:1400: '\\u0C0E-\\u0C10'
                    {
                    match("\u0C0E-\u0C10"); 


                    }
                    break;
                case 98 :
                    // InternalGo.g:8142:1416: '\\u0C12-\\u0C28'
                    {
                    match("\u0C12-\u0C28"); 


                    }
                    break;
                case 99 :
                    // InternalGo.g:8142:1432: '\\u0C2A-\\u0C33'
                    {
                    match("\u0C2A-\u0C33"); 


                    }
                    break;
                case 100 :
                    // InternalGo.g:8142:1448: '\\u0C35-\\u0C39'
                    {
                    match("\u0C35-\u0C39"); 


                    }
                    break;
                case 101 :
                    // InternalGo.g:8142:1464: '\\u0C60-\\u0C61'
                    {
                    match("\u0C60-\u0C61"); 


                    }
                    break;
                case 102 :
                    // InternalGo.g:8142:1480: '\\u0C85-\\u0C8C'
                    {
                    match("\u0C85-\u0C8C"); 


                    }
                    break;
                case 103 :
                    // InternalGo.g:8142:1496: '\\u0C8E-\\u0C90'
                    {
                    match("\u0C8E-\u0C90"); 


                    }
                    break;
                case 104 :
                    // InternalGo.g:8142:1512: '\\u0C92-\\u0CA8'
                    {
                    match("\u0C92-\u0CA8"); 


                    }
                    break;
                case 105 :
                    // InternalGo.g:8142:1528: '\\u0CAA-\\u0CB3'
                    {
                    match("\u0CAA-\u0CB3"); 


                    }
                    break;
                case 106 :
                    // InternalGo.g:8142:1544: '\\u0CB5-\\u0CB9'
                    {
                    match("\u0CB5-\u0CB9"); 


                    }
                    break;
                case 107 :
                    // InternalGo.g:8142:1560: '\\u0CDE'
                    {
                    match('\u0CDE'); 

                    }
                    break;
                case 108 :
                    // InternalGo.g:8142:1569: '\\u0CE0-\\u0CE1'
                    {
                    match("\u0CE0-\u0CE1"); 


                    }
                    break;
                case 109 :
                    // InternalGo.g:8142:1585: '\\u0D05-\\u0D0C'
                    {
                    match("\u0D05-\u0D0C"); 


                    }
                    break;
                case 110 :
                    // InternalGo.g:8142:1601: '\\u0D0E-\\u0D10'
                    {
                    match("\u0D0E-\u0D10"); 


                    }
                    break;
                case 111 :
                    // InternalGo.g:8142:1617: '\\u0D12-\\u0D28'
                    {
                    match("\u0D12-\u0D28"); 


                    }
                    break;
                case 112 :
                    // InternalGo.g:8142:1633: '\\u0D2A-\\u0D39'
                    {
                    match("\u0D2A-\u0D39"); 


                    }
                    break;
                case 113 :
                    // InternalGo.g:8142:1649: '\\u0D60-\\u0D61'
                    {
                    match("\u0D60-\u0D61"); 


                    }
                    break;
                case 114 :
                    // InternalGo.g:8142:1665: '\\u0D85-\\u0D96'
                    {
                    match("\u0D85-\u0D96"); 


                    }
                    break;
                case 115 :
                    // InternalGo.g:8142:1681: '\\u0D9A-\\u0DB1'
                    {
                    match("\u0D9A-\u0DB1"); 


                    }
                    break;
                case 116 :
                    // InternalGo.g:8142:1697: '\\u0DB3-\\u0DBB'
                    {
                    match("\u0DB3-\u0DBB"); 


                    }
                    break;
                case 117 :
                    // InternalGo.g:8142:1713: '\\u0DBD'
                    {
                    match('\u0DBD'); 

                    }
                    break;
                case 118 :
                    // InternalGo.g:8142:1722: '\\u0DC0-\\u0DC6'
                    {
                    match("\u0DC0-\u0DC6"); 


                    }
                    break;
                case 119 :
                    // InternalGo.g:8142:1738: '\\u0E01-\\u0E30'
                    {
                    match("\u0E01-\u0E30"); 


                    }
                    break;
                case 120 :
                    // InternalGo.g:8142:1754: '\\u0E32-\\u0E33'
                    {
                    match("\u0E32-\u0E33"); 


                    }
                    break;
                case 121 :
                    // InternalGo.g:8142:1770: '\\u0E40-\\u0E46'
                    {
                    match("\u0E40-\u0E46"); 


                    }
                    break;
                case 122 :
                    // InternalGo.g:8142:1786: '\\u0E81-\\u0E82'
                    {
                    match("\u0E81-\u0E82"); 


                    }
                    break;
                case 123 :
                    // InternalGo.g:8142:1802: '\\u0E84'
                    {
                    match('\u0E84'); 

                    }
                    break;
                case 124 :
                    // InternalGo.g:8142:1811: '\\u0E87-\\u0E88'
                    {
                    match("\u0E87-\u0E88"); 


                    }
                    break;
                case 125 :
                    // InternalGo.g:8142:1827: '\\u0E8A'
                    {
                    match('\u0E8A'); 

                    }
                    break;
                case 126 :
                    // InternalGo.g:8142:1836: '\\u0E8D'
                    {
                    match('\u0E8D'); 

                    }
                    break;
                case 127 :
                    // InternalGo.g:8142:1845: '\\u0E94-\\u0E97'
                    {
                    match("\u0E94-\u0E97"); 


                    }
                    break;
                case 128 :
                    // InternalGo.g:8142:1861: '\\u0E99-\\u0E9F'
                    {
                    match("\u0E99-\u0E9F"); 


                    }
                    break;
                case 129 :
                    // InternalGo.g:8142:1877: '\\u0EA1-\\u0EA3'
                    {
                    match("\u0EA1-\u0EA3"); 


                    }
                    break;
                case 130 :
                    // InternalGo.g:8142:1893: '\\u0EA5'
                    {
                    match('\u0EA5'); 

                    }
                    break;
                case 131 :
                    // InternalGo.g:8142:1902: '\\u0EA7'
                    {
                    match('\u0EA7'); 

                    }
                    break;
                case 132 :
                    // InternalGo.g:8142:1911: '\\u0EAA-\\u0EAB'
                    {
                    match("\u0EAA-\u0EAB"); 


                    }
                    break;
                case 133 :
                    // InternalGo.g:8142:1927: '\\u0EAD-\\u0EB0'
                    {
                    match("\u0EAD-\u0EB0"); 


                    }
                    break;
                case 134 :
                    // InternalGo.g:8142:1943: '\\u0EB2-\\u0EB3'
                    {
                    match("\u0EB2-\u0EB3"); 


                    }
                    break;
                case 135 :
                    // InternalGo.g:8142:1959: '\\u0EBD-\\u0EC4'
                    {
                    match("\u0EBD-\u0EC4"); 


                    }
                    break;
                case 136 :
                    // InternalGo.g:8142:1975: '\\u0EC6'
                    {
                    match('\u0EC6'); 

                    }
                    break;
                case 137 :
                    // InternalGo.g:8142:1984: '\\u0EDC-\\u0EDD'
                    {
                    match("\u0EDC-\u0EDD"); 


                    }
                    break;
                case 138 :
                    // InternalGo.g:8142:2000: '\\u0F00'
                    {
                    match('\u0F00'); 

                    }
                    break;
                case 139 :
                    // InternalGo.g:8142:2009: '\\u0F40-\\u0F6A'
                    {
                    match("\u0F40-\u0F6A"); 


                    }
                    break;
                case 140 :
                    // InternalGo.g:8142:2025: '\\u0F88-\\u0F8B'
                    {
                    match("\u0F88-\u0F8B"); 


                    }
                    break;
                case 141 :
                    // InternalGo.g:8142:2041: '\\u1000-\\u1021'
                    {
                    match("\u1000-\u1021"); 


                    }
                    break;
                case 142 :
                    // InternalGo.g:8142:2057: '\\u1023-\\u1027'
                    {
                    match("\u1023-\u1027"); 


                    }
                    break;
                case 143 :
                    // InternalGo.g:8142:2073: '\\u1029-\\u102A'
                    {
                    match("\u1029-\u102A"); 


                    }
                    break;
                case 144 :
                    // InternalGo.g:8142:2089: '\\u1050-\\u1055'
                    {
                    match("\u1050-\u1055"); 


                    }
                    break;
                case 145 :
                    // InternalGo.g:8142:2105: '\\u10A0-\\u10C5'
                    {
                    match("\u10A0-\u10C5"); 


                    }
                    break;
                case 146 :
                    // InternalGo.g:8142:2121: '\\u10D0-\\u10F6'
                    {
                    match("\u10D0-\u10F6"); 


                    }
                    break;
                case 147 :
                    // InternalGo.g:8142:2137: '\\u1100-\\u1159'
                    {
                    match("\u1100-\u1159"); 


                    }
                    break;
                case 148 :
                    // InternalGo.g:8142:2153: '\\u115F-\\u11A2'
                    {
                    match("\u115F-\u11A2"); 


                    }
                    break;
                case 149 :
                    // InternalGo.g:8142:2169: '\\u11A8-\\u11F9'
                    {
                    match("\u11A8-\u11F9"); 


                    }
                    break;
                case 150 :
                    // InternalGo.g:8142:2185: '\\u1200-\\u1206'
                    {
                    match("\u1200-\u1206"); 


                    }
                    break;
                case 151 :
                    // InternalGo.g:8142:2201: '\\u1208-\\u1246'
                    {
                    match("\u1208-\u1246"); 


                    }
                    break;
                case 152 :
                    // InternalGo.g:8142:2217: '\\u1248'
                    {
                    match('\u1248'); 

                    }
                    break;
                case 153 :
                    // InternalGo.g:8142:2226: '\\u124A-\\u124D'
                    {
                    match("\u124A-\u124D"); 


                    }
                    break;
                case 154 :
                    // InternalGo.g:8142:2242: '\\u1250-\\u1256'
                    {
                    match("\u1250-\u1256"); 


                    }
                    break;
                case 155 :
                    // InternalGo.g:8142:2258: '\\u1258'
                    {
                    match('\u1258'); 

                    }
                    break;
                case 156 :
                    // InternalGo.g:8142:2267: '\\u125A-\\u125D'
                    {
                    match("\u125A-\u125D"); 


                    }
                    break;
                case 157 :
                    // InternalGo.g:8142:2283: '\\u1260-\\u1286'
                    {
                    match("\u1260-\u1286"); 


                    }
                    break;
                case 158 :
                    // InternalGo.g:8142:2299: '\\u1288'
                    {
                    match('\u1288'); 

                    }
                    break;
                case 159 :
                    // InternalGo.g:8142:2308: '\\u128A-\\u128D'
                    {
                    match("\u128A-\u128D"); 


                    }
                    break;
                case 160 :
                    // InternalGo.g:8142:2324: '\\u1290-\\u12AE'
                    {
                    match("\u1290-\u12AE"); 


                    }
                    break;
                case 161 :
                    // InternalGo.g:8142:2340: '\\u12B0'
                    {
                    match('\u12B0'); 

                    }
                    break;
                case 162 :
                    // InternalGo.g:8142:2349: '\\u12B2-\\u12B5'
                    {
                    match("\u12B2-\u12B5"); 


                    }
                    break;
                case 163 :
                    // InternalGo.g:8142:2365: '\\u12B8-\\u12BE'
                    {
                    match("\u12B8-\u12BE"); 


                    }
                    break;
                case 164 :
                    // InternalGo.g:8142:2381: '\\u12C0'
                    {
                    match('\u12C0'); 

                    }
                    break;
                case 165 :
                    // InternalGo.g:8142:2390: '\\u12C2-\\u12C5'
                    {
                    match("\u12C2-\u12C5"); 


                    }
                    break;
                case 166 :
                    // InternalGo.g:8142:2406: '\\u12C8-\\u12CE'
                    {
                    match("\u12C8-\u12CE"); 


                    }
                    break;
                case 167 :
                    // InternalGo.g:8142:2422: '\\u12D0-\\u12D6'
                    {
                    match("\u12D0-\u12D6"); 


                    }
                    break;
                case 168 :
                    // InternalGo.g:8142:2438: '\\u12D8-\\u12EE'
                    {
                    match("\u12D8-\u12EE"); 


                    }
                    break;
                case 169 :
                    // InternalGo.g:8142:2454: '\\u12F0-\\u130E'
                    {
                    match("\u12F0-\u130E"); 


                    }
                    break;
                case 170 :
                    // InternalGo.g:8142:2470: '\\u1310'
                    {
                    match('\u1310'); 

                    }
                    break;
                case 171 :
                    // InternalGo.g:8142:2479: '\\u1312-\\u1315'
                    {
                    match("\u1312-\u1315"); 


                    }
                    break;
                case 172 :
                    // InternalGo.g:8142:2495: '\\u1318-\\u131E'
                    {
                    match("\u1318-\u131E"); 


                    }
                    break;
                case 173 :
                    // InternalGo.g:8142:2511: '\\u1320-\\u1346'
                    {
                    match("\u1320-\u1346"); 


                    }
                    break;
                case 174 :
                    // InternalGo.g:8142:2527: '\\u1348-\\u135A'
                    {
                    match("\u1348-\u135A"); 


                    }
                    break;
                case 175 :
                    // InternalGo.g:8142:2543: '\\u13A0-\\u13B0'
                    {
                    match("\u13A0-\u13B0"); 


                    }
                    break;
                case 176 :
                    // InternalGo.g:8142:2559: '\\u13B1-\\u13F4'
                    {
                    match("\u13B1-\u13F4"); 


                    }
                    break;
                case 177 :
                    // InternalGo.g:8142:2575: '\\u1401-\\u1676'
                    {
                    match("\u1401-\u1676"); 


                    }
                    break;
                case 178 :
                    // InternalGo.g:8142:2591: '\\u1681-\\u169A'
                    {
                    match("\u1681-\u169A"); 


                    }
                    break;
                case 179 :
                    // InternalGo.g:8142:2607: '\\u16A0-\\u16EA'
                    {
                    match("\u16A0-\u16EA"); 


                    }
                    break;
                case 180 :
                    // InternalGo.g:8142:2623: '\\u1780-\\u17B3'
                    {
                    match("\u1780-\u17B3"); 


                    }
                    break;
                case 181 :
                    // InternalGo.g:8142:2639: '\\u1820-\\u1877'
                    {
                    match("\u1820-\u1877"); 


                    }
                    break;
                case 182 :
                    // InternalGo.g:8142:2655: '\\u1880-\\u18A8'
                    {
                    match("\u1880-\u18A8"); 


                    }
                    break;
                case 183 :
                    // InternalGo.g:8142:2671: '\\u1E00-\\u1E9B'
                    {
                    match("\u1E00-\u1E9B"); 


                    }
                    break;
                case 184 :
                    // InternalGo.g:8142:2687: '\\u1EA0-\\u1EE0'
                    {
                    match("\u1EA0-\u1EE0"); 


                    }
                    break;
                case 185 :
                    // InternalGo.g:8142:2703: '\\u1EE1-\\u1EF9'
                    {
                    match("\u1EE1-\u1EF9"); 


                    }
                    break;
                case 186 :
                    // InternalGo.g:8142:2719: '\\u1F00-\\u1F15'
                    {
                    match("\u1F00-\u1F15"); 


                    }
                    break;
                case 187 :
                    // InternalGo.g:8142:2735: '\\u1F18-\\u1F1D'
                    {
                    match("\u1F18-\u1F1D"); 


                    }
                    break;
                case 188 :
                    // InternalGo.g:8142:2751: '\\u1F20-\\u1F39'
                    {
                    match("\u1F20-\u1F39"); 


                    }
                    break;
                case 189 :
                    // InternalGo.g:8142:2767: '\\u1F3A-\\u1F45'
                    {
                    match("\u1F3A-\u1F45"); 


                    }
                    break;
                case 190 :
                    // InternalGo.g:8142:2783: '\\u1F48-\\u1F4D'
                    {
                    match("\u1F48-\u1F4D"); 


                    }
                    break;
                case 191 :
                    // InternalGo.g:8142:2799: '\\u1F50-\\u1F57'
                    {
                    match("\u1F50-\u1F57"); 


                    }
                    break;
                case 192 :
                    // InternalGo.g:8142:2815: '\\u1F59'
                    {
                    match('\u1F59'); 

                    }
                    break;
                case 193 :
                    // InternalGo.g:8142:2824: '\\u1F5B'
                    {
                    match('\u1F5B'); 

                    }
                    break;
                case 194 :
                    // InternalGo.g:8142:2833: '\\u1F5D'
                    {
                    match('\u1F5D'); 

                    }
                    break;
                case 195 :
                    // InternalGo.g:8142:2842: '\\u1F5F-\\u1F7D'
                    {
                    match("\u1F5F-\u1F7D"); 


                    }
                    break;
                case 196 :
                    // InternalGo.g:8142:2858: '\\u1F80-\\u1FB4'
                    {
                    match("\u1F80-\u1FB4"); 


                    }
                    break;
                case 197 :
                    // InternalGo.g:8142:2874: '\\u1FB6-\\u1FBC'
                    {
                    match("\u1FB6-\u1FBC"); 


                    }
                    break;
                case 198 :
                    // InternalGo.g:8142:2890: '\\u1FBE'
                    {
                    match('\u1FBE'); 

                    }
                    break;
                case 199 :
                    // InternalGo.g:8142:2899: '\\u1FC2-\\u1FC4'
                    {
                    match("\u1FC2-\u1FC4"); 


                    }
                    break;
                case 200 :
                    // InternalGo.g:8142:2915: '\\u1FC6-\\u1FCC'
                    {
                    match("\u1FC6-\u1FCC"); 


                    }
                    break;
                case 201 :
                    // InternalGo.g:8142:2931: '\\u1FD0-\\u1FD3'
                    {
                    match("\u1FD0-\u1FD3"); 


                    }
                    break;
                case 202 :
                    // InternalGo.g:8142:2947: '\\u1FD6-\\u1FDB'
                    {
                    match("\u1FD6-\u1FDB"); 


                    }
                    break;
                case 203 :
                    // InternalGo.g:8142:2963: '\\u1FE0-\\u1FEC'
                    {
                    match("\u1FE0-\u1FEC"); 


                    }
                    break;
                case 204 :
                    // InternalGo.g:8142:2979: '\\u1FF2-\\u1FF4'
                    {
                    match("\u1FF2-\u1FF4"); 


                    }
                    break;
                case 205 :
                    // InternalGo.g:8142:2995: '\\u1FF6-\\u1FFC'
                    {
                    match("\u1FF6-\u1FFC"); 


                    }
                    break;
                case 206 :
                    // InternalGo.g:8142:3011: '\\u207F'
                    {
                    match('\u207F'); 

                    }
                    break;
                case 207 :
                    // InternalGo.g:8142:3020: '\\u2102'
                    {
                    match('\u2102'); 

                    }
                    break;
                case 208 :
                    // InternalGo.g:8142:3029: '\\u2107'
                    {
                    match('\u2107'); 

                    }
                    break;
                case 209 :
                    // InternalGo.g:8142:3038: '\\u210A-\\u2113'
                    {
                    match("\u210A-\u2113"); 


                    }
                    break;
                case 210 :
                    // InternalGo.g:8142:3054: '\\u2115'
                    {
                    match('\u2115'); 

                    }
                    break;
                case 211 :
                    // InternalGo.g:8142:3063: '\\u2119-\\u211D'
                    {
                    match("\u2119-\u211D"); 


                    }
                    break;
                case 212 :
                    // InternalGo.g:8142:3079: '\\u2124'
                    {
                    match('\u2124'); 

                    }
                    break;
                case 213 :
                    // InternalGo.g:8142:3088: '\\u2126'
                    {
                    match('\u2126'); 

                    }
                    break;
                case 214 :
                    // InternalGo.g:8142:3097: '\\u2128'
                    {
                    match('\u2128'); 

                    }
                    break;
                case 215 :
                    // InternalGo.g:8142:3106: '\\u212A-\\u212D'
                    {
                    match("\u212A-\u212D"); 


                    }
                    break;
                case 216 :
                    // InternalGo.g:8142:3122: '\\u212F-\\u2131'
                    {
                    match("\u212F-\u2131"); 


                    }
                    break;
                case 217 :
                    // InternalGo.g:8142:3138: '\\u2133-\\u2139'
                    {
                    match("\u2133-\u2139"); 


                    }
                    break;
                case 218 :
                    // InternalGo.g:8142:3154: '\\u2160-\\u2183'
                    {
                    match("\u2160-\u2183"); 


                    }
                    break;
                case 219 :
                    // InternalGo.g:8142:3170: '\\u3005-\\u3007'
                    {
                    match("\u3005-\u3007"); 


                    }
                    break;
                case 220 :
                    // InternalGo.g:8142:3186: '\\u3021-\\u3029'
                    {
                    match("\u3021-\u3029"); 


                    }
                    break;
                case 221 :
                    // InternalGo.g:8142:3202: '\\u3031-\\u3035'
                    {
                    match("\u3031-\u3035"); 


                    }
                    break;
                case 222 :
                    // InternalGo.g:8142:3218: '\\u3038-\\u303A'
                    {
                    match("\u3038-\u303A"); 


                    }
                    break;
                case 223 :
                    // InternalGo.g:8142:3234: '\\u3041-\\u3094'
                    {
                    match("\u3041-\u3094"); 


                    }
                    break;
                case 224 :
                    // InternalGo.g:8142:3250: '\\u309D-\\u309E'
                    {
                    match("\u309D-\u309E"); 


                    }
                    break;
                case 225 :
                    // InternalGo.g:8142:3266: '\\u30A1-\\u30FA'
                    {
                    match("\u30A1-\u30FA"); 


                    }
                    break;
                case 226 :
                    // InternalGo.g:8142:3282: '\\u30FC-\\u30FE'
                    {
                    match("\u30FC-\u30FE"); 


                    }
                    break;
                case 227 :
                    // InternalGo.g:8142:3298: '\\u3105-\\u312C'
                    {
                    match("\u3105-\u312C"); 


                    }
                    break;
                case 228 :
                    // InternalGo.g:8142:3314: '\\u3131-\\u318E'
                    {
                    match("\u3131-\u318E"); 


                    }
                    break;
                case 229 :
                    // InternalGo.g:8142:3330: '\\u31A0-\\u31B7'
                    {
                    match("\u31A0-\u31B7"); 


                    }
                    break;
                case 230 :
                    // InternalGo.g:8142:3346: '\\u3400'
                    {
                    match('\u3400'); 

                    }
                    break;
                case 231 :
                    // InternalGo.g:8142:3355: '\\u4DB5'
                    {
                    match('\u4DB5'); 

                    }
                    break;
                case 232 :
                    // InternalGo.g:8142:3364: '\\u4E00'
                    {
                    match('\u4E00'); 

                    }
                    break;
                case 233 :
                    // InternalGo.g:8142:3373: '\\u9FA5'
                    {
                    match('\u9FA5'); 

                    }
                    break;
                case 234 :
                    // InternalGo.g:8142:3382: '\\uA000-\\uA48C'
                    {
                    match("\uA000-\uA48C"); 


                    }
                    break;
                case 235 :
                    // InternalGo.g:8142:3398: '\\uAC00'
                    {
                    match('\uAC00'); 

                    }
                    break;
                case 236 :
                    // InternalGo.g:8142:3407: '\\uD7A3'
                    {
                    match('\uD7A3'); 

                    }
                    break;
                case 237 :
                    // InternalGo.g:8142:3416: '\\uF900-\\uFA2D'
                    {
                    match("\uF900-\uFA2D"); 


                    }
                    break;
                case 238 :
                    // InternalGo.g:8142:3432: '\\uFB00-\\uFB06'
                    {
                    match("\uFB00-\uFB06"); 


                    }
                    break;
                case 239 :
                    // InternalGo.g:8142:3448: '\\uFB13-\\uFB17'
                    {
                    match("\uFB13-\uFB17"); 


                    }
                    break;
                case 240 :
                    // InternalGo.g:8142:3464: '\\uFB1D'
                    {
                    match('\uFB1D'); 

                    }
                    break;
                case 241 :
                    // InternalGo.g:8142:3473: '\\uFB1F-\\uFB28'
                    {
                    match("\uFB1F-\uFB28"); 


                    }
                    break;
                case 242 :
                    // InternalGo.g:8142:3489: '\\uFB2A-\\uFB36'
                    {
                    match("\uFB2A-\uFB36"); 


                    }
                    break;
                case 243 :
                    // InternalGo.g:8142:3505: '\\uFB38-\\uFB3C'
                    {
                    match("\uFB38-\uFB3C"); 


                    }
                    break;
                case 244 :
                    // InternalGo.g:8142:3521: '\\uFB3E'
                    {
                    match('\uFB3E'); 

                    }
                    break;
                case 245 :
                    // InternalGo.g:8142:3530: '\\uFB40-\\uFB41'
                    {
                    match("\uFB40-\uFB41"); 


                    }
                    break;
                case 246 :
                    // InternalGo.g:8142:3546: '\\uFB43-\\uFB44'
                    {
                    match("\uFB43-\uFB44"); 


                    }
                    break;
                case 247 :
                    // InternalGo.g:8142:3562: '\\uFB46-\\uFBB1'
                    {
                    match("\uFB46-\uFBB1"); 


                    }
                    break;
                case 248 :
                    // InternalGo.g:8142:3578: '\\uFBD3-\\uFD3D'
                    {
                    match("\uFBD3-\uFD3D"); 


                    }
                    break;
                case 249 :
                    // InternalGo.g:8142:3594: '\\uFD50-\\uFD8F'
                    {
                    match("\uFD50-\uFD8F"); 


                    }
                    break;
                case 250 :
                    // InternalGo.g:8142:3610: '\\uFD92-\\uFDC7'
                    {
                    match("\uFD92-\uFDC7"); 


                    }
                    break;
                case 251 :
                    // InternalGo.g:8142:3626: '\\uFDF0-\\uFDFB'
                    {
                    match("\uFDF0-\uFDFB"); 


                    }
                    break;
                case 252 :
                    // InternalGo.g:8142:3642: '\\uFE70-\\uFE72'
                    {
                    match("\uFE70-\uFE72"); 


                    }
                    break;
                case 253 :
                    // InternalGo.g:8142:3658: '\\uFE74'
                    {
                    match('\uFE74'); 

                    }
                    break;
                case 254 :
                    // InternalGo.g:8142:3667: '\\uFE76-\\uFEFC'
                    {
                    match("\uFE76-\uFEFC"); 


                    }
                    break;
                case 255 :
                    // InternalGo.g:8142:3683: '\\uFF21-\\uFF3A'
                    {
                    match("\uFF21-\uFF3A"); 


                    }
                    break;
                case 256 :
                    // InternalGo.g:8142:3699: '\\uFF41-\\uFF5A'
                    {
                    match("\uFF41-\uFF5A"); 


                    }
                    break;
                case 257 :
                    // InternalGo.g:8142:3715: '\\uFF66-\\uFFBE'
                    {
                    match("\uFF66-\uFFBE"); 


                    }
                    break;
                case 258 :
                    // InternalGo.g:8142:3731: '\\uFFC2-\\uFFC7'
                    {
                    match("\uFFC2-\uFFC7"); 


                    }
                    break;
                case 259 :
                    // InternalGo.g:8142:3747: '\\uFFCA-\\uFFCF'
                    {
                    match("\uFFCA-\uFFCF"); 


                    }
                    break;
                case 260 :
                    // InternalGo.g:8142:3763: '\\uFFD2-\\uFFD7'
                    {
                    match("\uFFD2-\uFFD7"); 


                    }
                    break;
                case 261 :
                    // InternalGo.g:8142:3779: '\\uFFDA-\\uFFDC'
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

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8144:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalGo.g:8144:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalGo.g:8144:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:8144:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8144:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8144:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8144:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8144:53: RULE_MUL_OP
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
            // InternalGo.g:8146:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalGo.g:8146:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalGo.g:8146:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '!':
                {
                alt3=2;
                }
                break;
            case '<':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=3;}
                }
                break;
            case '>':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='=') ) {
                    alt3=6;
                }
                else {
                    alt3=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:8146:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:8146:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8146:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8146:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8146:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8146:48: '>='
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
            // InternalGo.g:8148:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalGo.g:8148:24: ( '+' | '-' | '|' | '^' )
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
            // InternalGo.g:8150:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalGo.g:8150:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalGo.g:8150:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt4=1;
                }
                break;
            case '/':
                {
                alt4=2;
                }
                break;
            case '%':
                {
                alt4=3;
                }
                break;
            case '<':
                {
                alt4=4;
                }
                break;
            case '>':
                {
                alt4=5;
                }
                break;
            case '&':
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6=='^') ) {
                    alt4=7;
                }
                else {
                    alt4=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGo.g:8150:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8150:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8150:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8150:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8150:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8150:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8150:51: '&^'
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
            // InternalGo.g:8152:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalGo.g:8152:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalGo.g:8152:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt5=1;
                }
                break;
            case '-':
                {
                alt5=2;
                }
                break;
            case '!':
                {
                alt5=3;
                }
                break;
            case '^':
                {
                alt5=4;
                }
                break;
            case '*':
                {
                alt5=5;
                }
                break;
            case '&':
                {
                alt5=6;
                }
                break;
            case '<':
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:8152:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8152:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8152:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8152:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalGo.g:8152:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalGo.g:8152:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalGo.g:8152:42: '<-'
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
            // InternalGo.g:8154:16: ( ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' ) )
            // InternalGo.g:8154:18: ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' )
            {
            // InternalGo.g:8154:18: ( '=' | '+=' | '-=' | '*=' | '^=' | ':=' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt6=1;
                }
                break;
            case '+':
                {
                alt6=2;
                }
                break;
            case '-':
                {
                alt6=3;
                }
                break;
            case '*':
                {
                alt6=4;
                }
                break;
            case '^':
                {
                alt6=5;
                }
                break;
            case ':':
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGo.g:8154:19: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8154:23: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:8154:28: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 4 :
                    // InternalGo.g:8154:33: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 5 :
                    // InternalGo.g:8154:38: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 6 :
                    // InternalGo.g:8154:43: ':='
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
            // InternalGo.g:8156:29: ( RULE_INT )
            // InternalGo.g:8156:31: RULE_INT
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
            // InternalGo.g:8158:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // InternalGo.g:8158:29: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' )
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
            // InternalGo.g:8160:25: ( ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) ) )
            // InternalGo.g:8160:27: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )
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

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8162:17: ( RULE_ID )
            // InternalGo.g:8162:19: RULE_ID
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
            // InternalGo.g:8164:16: ( ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? ) )
            // InternalGo.g:8164:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            {
            // InternalGo.g:8164:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGo.g:8164:19: RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )?
                    {
                    mRULE_DECIMAL_LIT(); 
                    match('.'); 
                    // InternalGo.g:8164:40: ( RULE_DECIMAL_LIT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGo.g:8164:40: RULE_DECIMAL_LIT
                            {
                            mRULE_DECIMAL_LIT(); 

                            }
                            break;

                    }

                    // InternalGo.g:8164:58: ( RULE_EXPOENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalGo.g:8164:58: RULE_EXPOENT
                            {
                            mRULE_EXPOENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:8164:72: RULE_DECIMALS RULE_EXPOENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPOENT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8164:99: '.' RULE_DECIMALS ( RULE_EXPOENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalGo.g:8164:117: ( RULE_EXPOENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGo.g:8164:117: RULE_EXPOENT
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
            // InternalGo.g:8166:14: ( ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT ) )
            // InternalGo.g:8166:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            {
            // InternalGo.g:8166:16: ( RULE_DECIMAL_LIT | RULE_OCTAL_LIT | RULE_HEX_LIT )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='1' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='0') ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2=='X'||LA11_2=='x') ) {
                    alt11=3;
                }
                else {
                    alt11=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:8166:17: RULE_DECIMAL_LIT
                    {
                    mRULE_DECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8166:34: RULE_OCTAL_LIT
                    {
                    mRULE_OCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8166:49: RULE_HEX_LIT
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
            // InternalGo.g:8168:27: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )* )
            // InternalGo.g:8168:29: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( RULE_DECIMAL_DIGIT )*
            {
            if ( (input.LA(1)>='1' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8168:67: ( RULE_DECIMAL_DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:8168:67: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalGo.g:8170:25: ( '0' ( RULE_OCTAL_DIGIT )* )
            // InternalGo.g:8170:27: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // InternalGo.g:8170:31: ( RULE_OCTAL_DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='7')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:8170:31: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalGo.g:8172:23: ( '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+ )
            // InternalGo.g:8172:25: '0' ( 'x' | 'X' ) RULE_HEX_DIGIT ( RULE_HEX_DIGIT )+
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
            // InternalGo.g:8172:54: ( RULE_HEX_DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:8172:54: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalGo.g:8174:15: ( ( RULE_DECIMAL_DIGIT )+ )
            // InternalGo.g:8174:17: ( RULE_DECIMAL_DIGIT )+
            {
            // InternalGo.g:8174:17: ( RULE_DECIMAL_DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:8174:17: RULE_DECIMAL_DIGIT
            	    {
            	    mRULE_DECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalGo.g:8176:23: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalGo.g:8176:25: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:8176:35: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
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
            // InternalGo.g:8178:20: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalGo.g:8178:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalGo.g:8178:22: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt17=2;
                    }
                    break;
                case 'U':
                    {
                    alt17=3;
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
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:8178:23: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8178:41: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalGo.g:8178:61: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:8178:78: RULE_ESCAPED_CHAR
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
            // InternalGo.g:8180:17: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalGo.g:8180:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalGo.g:8180:19: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='x') ) {
                    alt18=2;
                }
                else if ( ((LA18_1>='0' && LA18_1<='7')) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

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
                    // InternalGo.g:8180:20: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8180:42: RULE_HEX_BYTE_VALUE
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
            // InternalGo.g:8182:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalGo.g:8182:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalGo.g:8184:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8184:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8186:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8186:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8188:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalGo.g:8188:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalGo.g:8190:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalGo.g:8190:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalGo.g:8192:21: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\'' )
            // InternalGo.g:8192:23: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )? '\\''
            {
            match('\''); 
            // InternalGo.g:8192:28: ( RULE_UNICODE_CHAR | RULE_NEWLINE )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n') ) {
                alt19=1;
            }
            switch (alt19) {
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
            // InternalGo.g:8194:29: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"' )
            // InternalGo.g:8194:31: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )? '\"'
            {
            match('\"'); 
            // InternalGo.g:8194:35: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\\') ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2=='\"'||LA20_2=='\''||LA20_2=='U'||LA20_2=='\\'||(LA20_2>='a' && LA20_2<='b')||LA20_2=='f'||LA20_2=='n'||LA20_2=='r'||(LA20_2>='t' && LA20_2<='v')) ) {
                    alt20=1;
                }
                else if ( ((LA20_2>='0' && LA20_2<='7')||LA20_2=='x') ) {
                    alt20=2;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:8194:36: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8194:55: RULE_BYTE_VALUE
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
            // InternalGo.g:8196:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:8196:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:8196:20: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:8196:20: '^'
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

            // InternalGo.g:8196:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
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
            	    break loop22;
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
            // InternalGo.g:8198:19: ( ( '0' .. '9' )+ )
            // InternalGo.g:8198:21: ( '0' .. '9' )+
            {
            // InternalGo.g:8198:21: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGo.g:8198:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // InternalGo.g:8200:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:8200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:8200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:8200:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:8200:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGo.g:8200:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8200:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8200:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:8200:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGo.g:8200:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8200:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop25;
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
            // InternalGo.g:8202:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:8202:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:8202:24: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:8202:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // InternalGo.g:8204:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:8204:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:8204:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:8204:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop28;
                }
            } while (true);

            // InternalGo.g:8204:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:8204:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:8204:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalGo.g:8204:41: '\\r'
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
            // InternalGo.g:8206:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:8206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:8206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
            // InternalGo.g:8208:16: ( . )
            // InternalGo.g:8208:18: .
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
        // InternalGo.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_UNICODE_LETTER | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_IDENTIFIER | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=60;
        alt32 = dfa32.predict(input);
        switch (alt32) {
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
                // InternalGo.g:1:268: RULE_UNICODE_LETTER
                {
                mRULE_UNICODE_LETTER(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:288: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:303: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:317: RULE_ASSING_OP
                {
                mRULE_ASSING_OP(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:332: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:348: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:363: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:376: RULE_DECIMALS
                {
                mRULE_DECIMALS(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:390: RULE_UNICODE_VALUE
                {
                mRULE_UNICODE_VALUE(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:409: RULE_BYTE_VALUE
                {
                mRULE_BYTE_VALUE(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:425: RULE_RAW_STRING_LIT
                {
                mRULE_RAW_STRING_LIT(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:445: RULE_INTERPRETED_STRING_LIT
                {
                mRULE_INTERPRETED_STRING_LIT(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:473: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:485: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:501: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:517: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:525: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA32 dfa32 = new DFA32(this);
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
            return "8144:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\2\56\2\uffff\1\56\1\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\2\uffff\1\145\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\1";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\uffff\1\2\11\1",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "",
            "\1\5\1\uffff\12\4\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "8164:18: ( RULE_DECIMAL_LIT '.' ( RULE_DECIMAL_LIT )? ( RULE_EXPOENT )? | RULE_DECIMALS RULE_EXPOENT | '.' RULE_DECIMALS ( RULE_EXPOENT )? )";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\2\u0136\1\uffff\1\u0139\2\uffff\1\u0140\2\uffff\1\u0136\4\uffff\1\u014c\3\u0136\1\u0155\1\u0157\5\u0136\1\u015e\2\u0136\2\u0155\2\u0136\3\uffff\11\u0132\3\uffff\1\u0132\1\uffff\13\u0132\1\uffff\6\u0132\1\uffff\2\u0132\1\uffff\3\u0132\2\uffff\5\u0132\1\uffff\14\u0132\1\uffff\2\u0132\1\uffff\5\u0132\3\uffff\6\u0132\1\uffff\6\u0132\1\uffff\20\u0132\1\uffff\11\u0132\1\uffff\5\u0132\1\uffff\1\u0132\2\uffff\3\u0132\2\uffff\4\u0132\1\uffff\1\u0132\1\uffff\15\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\2\u0132\1\uffff\5\u0132\1\uffff\25\u0132\3\uffff\3\u0132\1\uffff\7\u0132\3\uffff\1\u0132\1\uffff\1\u0132\3\uffff\17\u0132\4\uffff\1\u0132\2\uffff\3\u0132\1\uffff\3\u0132\1\uffff\10\u0132\1\uffff\10\u0132\2\uffff\1\u0164\1\uffff\2\u0155\2\uffff\2\u0168\1\u016b\2\u0132\2\uffff\3\u0136\1\uffff\1\u0136\14\uffff\3\u0136\6\uffff\1\u0136\1\u017a\5\u0136\4\uffff\6\u0136\1\uffff\2\u0136\6\uffff\1\u0168\1\uffff\1\u0168\1\u018a\6\uffff\2\u0136\1\u0193\1\u0136\1\uffff\4\u0136\1\uffff\1\u0136\1\u019a\3\u0136\2\uffff\7\u0136\1\u01a7\7\uffff\1\u01ac\1\u0136\1\uffff\6\u0136\1\uffff\1\u01b4\2\u0136\1\u01b7\1\u01b8\3\u0136\1\u01bc\2\u0136\1\u01bf\6\uffff\7\u0136\1\uffff\1\u0136\1\u01cc\2\uffff\1\u0136\1\u01ce\1\u01cf\1\uffff\1\u01d0\1\u0136\5\uffff\2\u0136\1\u01d6\1\u01d7\1\u01d8\1\u0136\1\u01da\1\u0136\1\uffff\1\u01dc\3\uffff\1\u0136\2\uffff\1\u0136\1\u01e1\3\uffff\1\u0136\1\uffff\1\u0136\1\uffff\1\u01e4\2\uffff\1\u0136\1\uffff\1\u0136\1\u01e8\2\uffff\1\u0136\1\u01eb\2\uffff\1\u0136\2\uffff\1\u01ef\2\uffff";
    static final String DFA32_eofS =
        "\u01f0\uffff";
    static final String DFA32_minS =
        "\1\0\2\141\1\uffff\1\0\2\uffff\1\56\2\uffff\1\145\4\uffff\1\75\1\146\2\141\1\55\1\75\1\157\1\141\1\162\1\154\1\145\1\75\1\171\1\141\1\53\3\55\3\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\2\uffff\1\75\1\uffff\1\75\1\52\2\uffff\1\56\1\60\1\11\1\42\1\0\2\uffff\1\156\1\154\1\162\1\uffff\1\143\3\uffff\1\0\10\uffff\1\162\1\154\1\151\6\uffff\1\164\1\60\2\160\1\141\1\156\1\163\4\uffff\2\164\1\156\1\145\1\163\1\146\1\uffff\1\160\1\162\6\uffff\1\56\1\uffff\2\60\3\uffff\2\0\1\uffff\1\143\1\154\1\60\1\153\1\uffff\1\165\1\145\1\164\1\145\1\uffff\1\157\1\60\1\156\1\163\1\145\2\uffff\1\157\1\165\1\147\1\141\1\145\1\141\1\145\1\60\1\uffff\5\0\1\uffff\1\60\1\164\1\uffff\1\141\3\143\2\162\1\uffff\1\60\1\151\1\164\2\60\1\162\1\145\1\153\1\60\1\162\1\165\1\60\1\uffff\4\0\1\uffff\1\150\1\147\2\164\1\150\1\146\1\164\1\uffff\1\156\1\60\2\uffff\1\156\2\60\1\uffff\1\60\1\154\1\uffff\4\0\1\162\1\145\3\60\1\141\1\60\1\165\1\uffff\1\60\3\uffff\1\164\2\0\1\157\1\60\3\uffff\1\143\1\uffff\1\145\1\uffff\1\60\2\0\1\165\1\uffff\1\145\1\60\1\uffff\1\0\1\147\1\60\1\uffff\1\0\1\150\1\uffff\1\0\1\60\1\0\1\uffff";
    static final String DFA32_maxS =
        "\1\uffff\1\165\1\141\1\uffff\1\uffff\2\uffff\1\71\2\uffff\1\167\4\uffff\1\75\1\156\1\141\1\157\1\55\1\75\1\157\1\145\1\162\1\154\1\145\1\75\1\171\1\141\2\75\2\55\3\uffff\11\55\3\uffff\1\55\1\uffff\13\55\1\uffff\6\55\1\uffff\2\55\1\uffff\3\55\2\uffff\5\55\1\uffff\14\55\1\uffff\2\55\1\uffff\5\55\3\uffff\6\55\1\uffff\6\55\1\uffff\20\55\1\uffff\11\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\2\uffff\4\55\1\uffff\1\55\1\uffff\15\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\1\uffff\5\55\1\uffff\25\55\3\uffff\3\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\3\uffff\17\55\4\uffff\1\55\2\uffff\3\55\1\uffff\3\55\1\uffff\10\55\1\uffff\10\55\2\uffff\1\75\1\uffff\1\172\1\57\2\uffff\2\145\1\40\1\170\1\uffff\2\uffff\1\156\1\154\1\162\1\uffff\1\143\3\uffff\1\uffff\10\uffff\1\162\1\154\1\151\6\uffff\1\164\1\172\2\160\1\141\1\156\1\163\4\uffff\2\164\1\156\1\145\1\163\1\146\1\uffff\1\160\1\162\6\uffff\1\145\1\uffff\2\145\3\uffff\2\uffff\1\uffff\1\143\1\154\1\172\1\153\1\uffff\1\165\1\145\1\164\1\145\1\uffff\1\157\1\172\1\156\1\164\1\145\2\uffff\1\157\1\165\1\147\1\141\3\145\1\172\1\uffff\5\uffff\1\uffff\1\172\1\164\1\uffff\1\141\3\143\2\162\1\uffff\1\172\1\151\1\164\2\172\1\162\1\145\1\153\1\172\1\162\1\165\1\172\1\uffff\4\uffff\1\uffff\1\150\1\147\2\164\1\150\1\146\1\164\1\uffff\1\156\1\172\2\uffff\1\156\2\172\1\uffff\1\172\1\154\1\uffff\4\uffff\1\162\1\145\3\172\1\141\1\172\1\165\1\uffff\1\172\3\uffff\1\164\2\uffff\1\157\1\172\3\uffff\1\143\1\uffff\1\145\1\uffff\1\172\2\uffff\1\165\1\uffff\1\145\1\172\1\uffff\1\uffff\1\147\1\172\1\uffff\1\uffff\1\150\1\uffff\1\uffff\1\172\1\uffff\1\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\13\1\14\1\15\1\16\22\uffff\3\54\11\uffff\3\54\1\uffff\1\54\13\uffff\1\54\6\uffff\1\54\2\uffff\1\54\3\uffff\2\54\5\uffff\1\54\14\uffff\1\54\2\uffff\1\54\5\uffff\3\54\6\uffff\1\54\6\uffff\1\54\20\uffff\1\54\11\uffff\1\54\5\uffff\1\54\1\uffff\2\54\3\uffff\2\54\4\uffff\1\54\1\uffff\1\54\15\uffff\1\54\2\uffff\1\54\2\uffff\1\54\2\uffff\1\54\2\uffff\1\54\5\uffff\1\54\25\uffff\3\54\3\uffff\1\54\7\uffff\3\54\1\uffff\1\54\1\uffff\3\54\17\uffff\4\54\1\uffff\2\54\3\uffff\1\54\3\uffff\1\54\10\uffff\1\54\10\uffff\2\55\1\uffff\1\55\2\uffff\1\55\1\60\5\uffff\1\73\1\74\3\uffff\1\60\1\uffff\1\3\1\4\1\70\1\uffff\1\66\1\5\1\6\1\20\1\7\1\61\1\10\1\11\3\uffff\1\13\1\14\1\15\1\16\1\57\1\17\7\uffff\1\24\1\55\1\46\1\25\6\uffff\1\41\2\uffff\1\44\1\45\1\54\1\56\1\71\1\72\1\uffff\1\62\2\uffff\1\64\1\73\1\65\2\uffff\1\67\4\uffff\1\66\4\uffff\1\32\5\uffff\1\24\1\46\10\uffff\1\63\5\uffff\1\67\2\uffff\1\36\6\uffff\1\22\14\uffff\1\43\4\uffff\1\1\7\uffff\1\23\2\uffff\1\50\1\26\3\uffff\1\33\2\uffff\1\42\14\uffff\1\40\1\uffff\1\52\1\30\1\37\5\uffff\1\12\1\35\1\47\1\uffff\1\53\1\uffff\1\27\4\uffff\1\2\2\uffff\1\51\3\uffff\1\31\2\uffff\1\21\3\uffff\1\34";
    static final String DFA32_specialS =
        "\1\23\3\uffff\1\32\u012b\uffff\1\4\12\uffff\1\31\62\uffff\1\1\1\0\33\uffff\1\21\1\22\1\30\1\20\1\2\30\uffff\1\6\1\11\1\5\1\3\24\uffff\1\7\1\12\1\26\1\24\16\uffff\1\10\1\13\12\uffff\1\25\1\14\5\uffff\1\15\3\uffff\1\16\2\uffff\1\17\1\uffff\1\27\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\u0132\1\u0131\1\u012e\2\u0132\1\u0131\22\u0132\1\u0131\1\u0126\1\u0130\2\u0132\1\u012a\1\u0125\1\4\1\5\1\6\1\17\1\35\1\16\1\36\1\7\1\u0129\1\u012d\11\u012c\1\24\1\14\1\23\1\32\1\u0127\2\u0132\1\37\31\u012b\1\10\1\u012f\1\11\1\u0128\1\u012b\1\u0132\1\40\1\27\1\22\1\31\1\30\1\1\1\25\1\u012b\1\20\3\u012b\1\21\2\u012b\1\2\1\u012b\1\26\1\12\1\33\1\u012b\1\34\4\u012b\1\13\1\u0124\1\15\54\u0132\1\41\12\u0132\1\42\4\u0132\1\43\5\u0132\1\44\27\u0132\1\45\26\u0132\1\3\10\u0132\1\46\u0129\u0132\1\47\55\u0132\1\50\137\u0132\1\51\12\u0132\1\52\24\u0132\1\53\17\u0132\1\54\15\u0132\1\55\u008b\u0132\1\56\13\u0132\1\57\1\u0132\1\60\3\u0132\1\61\1\u0132\1\62\24\u0132\1\63\54\u0132\1\64\11\u0132\1\65\45\u0132\1\66\u008b\u0132\1\67\72\u0132\1\70\3\u0132\1\71\4\u0132\1\72\47\u0132\1\73\70\u0132\1\74\47\u0132\1\75\7\u0132\1\76\156\u0132\1\77\37\u0132\1\100\60\u0132\1\101\36\u0132\1\102\60\u0132\1\103\143\u0132\1\104\17\u0132\1\105\24\u0132\1\106\25\u0132\1\107\1\u0132\1\110\155\u0132\1\111\u0184\u0132\1\112\67\u0132\1\113\22\u0132\1\114\7\u0132\1\115\54\u0132\1\116\11\u0132\1\117\3\u0132\1\120\26\u0132\1\121\7\u0132\1\122\3\u0132\1\123\45\u0132\1\124\2\u0132\1\125\20\u0132\1\126\24\u0132\1\127\11\u0132\1\130\3\u0132\1\131\26\u0132\1\132\7\u0132\1\133\2\u0132\1\134\2\u0132\1\135\40\u0132\1\136\4\u0132\1\137\23\u0132\1\140\22\u0132\1\141\7\u0132\1\142\1\u0132\1\143\3\u0132\1\144\26\u0132\1\145\7\u0132\1\146\2\u0132\1\147\7\u0132\1\150\22\u0132\1\151\17\u0132\1\152\44\u0132\1\153\11\u0132\1\154\3\u0132\1\155\26\u0132\1\156\7\u0132\1\157\3\u0132\1\160\6\u0132\1\161\36\u0132\1\162\2\u0132\1\163\45\u0132\1\164\10\u0132\1\165\3\u0132\1\166\6\u0132\1\167\2\u0132\1\170\1\u0132\1\171\4\u0132\1\172\4\u0132\1\173\5\u0132\1\174\10\u0132\1\175\115\u0132\1\176\10\u0132\1\177\3\u0132\1\u0080\27\u0132\1\u0081\12\u0132\1\u0082\52\u0132\1\u0083\44\u0132\1\u0084\10\u0132\1\u0085\3\u0132\1\u0086\27\u0132\1\u0087\12\u0132\1\u0088\50\u0132\1\u0089\1\u0132\1\u008a\44\u0132\1\u008b\10\u0132\1\u008c\3\u0132\1\u008d\27\u0132\1\u008e\65\u0132\1\u008f\44\u0132\1\u0090\24\u0132\1\u0091\30\u0132\1\u0092\11\u0132\1\u0093\2\u0132\1\u0094\100\u0132\1\u0095\60\u0132\1\u0096\15\u0132\1\u0097\100\u0132\1\u0098\2\u0132\1\u0099\2\u0132\1\u009a\2\u0132\1\u009b\2\u0132\1\u009c\6\u0132\1\u009d\4\u0132\1\u009e\7\u0132\1\u009f\3\u0132\1\u00a0\1\u0132\1\u00a1\2\u0132\1\u00a2\2\u0132\1\u00a3\4\u0132\1\u00a4\12\u0132\1\u00a5\10\u0132\1\u00a6\25\u0132\1\u00a7\43\u0132\1\u00a8\77\u0132\1\u00a9\107\u0132\1\u00aa\167\u0132\1\u00ab\42\u0132\1\u00ac\5\u0132\1\u00ad\46\u0132\1\u00ae\117\u0132\1\u00af\57\u0132\1\u00b0\57\u0132\1\u00b1\136\u0132\1\u00b2\110\u0132\1\u00b3\127\u0132\1\u00b4\7\u0132\1\u00b5\77\u0132\1\u00b6\1\u0132\1\u00b7\5\u0132\1\u00b8\7\u0132\1\u00b9\1\u0132\1\u00ba\5\u0132\1\u00bb\47\u0132\1\u00bc\1\u0132\1\u00bd\5\u0132\1\u00be\37\u0132\1\u00bf\1\u0132\1\u00c0\5\u0132\1\u00c1\7\u0132\1\u00c2\1\u0132\1\u00c3\5\u0132\1\u00c4\7\u0132\1\u00c5\7\u0132\1\u00c6\27\u0132\1\u00c7\37\u0132\1\u00c8\1\u0132\1\u00c9\5\u0132\1\u00ca\7\u0132\1\u00cb\47\u0132\1\u00cc\127\u0132\1\u00cd\20\u0132\1\u00ce\117\u0132\1\u00cf\u027f\u0132\1\u00d0\36\u0132\1\u00d1\u00df\u0132\1\u00d2\u009f\u0132\1\u00d3\137\u0132\1\u00d4\u057f\u0132\1\u00d5\u009f\u0132\1\u00d6\100\u0132\1\u00d7\36\u0132\1\u00d8\27\u0132\1\u00d9\7\u0132\1\u00da\31\u0132\1\u00db\15\u0132\1\u00dc\7\u0132\1\u00dd\10\u0132\1\u00de\1\u0132\1\u00df\1\u0132\1\u00e0\1\u0132\1\u00e1\40\u0132\1\u00e2\65\u0132\1\u00e3\7\u0132\1\u00e4\3\u0132\1\u00e5\3\u0132\1\u00e6\11\u0132\1\u00e7\5\u0132\1\u00e8\11\u0132\1\u00e9\21\u0132\1\u00ea\3\u0132\1\u00eb\u0088\u0132\1\u00ec\u0082\u0132\1\u00ed\4\u0132\1\u00ee\2\u0132\1\u00ef\12\u0132\1\u00f0\3\u0132\1\u00f1\12\u0132\1\u00f2\1\u0132\1\u00f3\1\u0132\1\u00f4\1\u0132\1\u00f5\4\u0132\1\u00f6\3\u0132\1\u00f7\54\u0132\1\u00f8\u0ea4\u0132\1\u00f9\33\u0132\1\u00fa\17\u0132\1\u00fb\6\u0132\1\u00fc\10\u0132\1\u00fd\133\u0132\1\u00fe\3\u0132\1\u00ff\132\u0132\1\u0100\10\u0132\1\u0101\53\u0132\1\u0102\156\u0132\1\u0103\u025f\u0132\1\u0104\u19b4\u0132\1\u0105\112\u0132\1\u0106\u51a4\u0132\1\u0107\132\u0132\1\u0108\u0bff\u0132\1\u0109\u2ba2\u0132\1\u010a\u215c\u0132\1\u010b\u01ff\u0132\1\u010c\22\u0132\1\u010d\11\u0132\1\u010e\1\u0132\1\u010f\12\u0132\1\u0110\15\u0132\1\u0111\5\u0132\1\u0112\1\u0132\1\u0113\2\u0132\1\u0114\2\u0132\1\u0115\u008c\u0132\1\u0116\u017c\u0132\1\u0117\101\u0132\1\u0118\135\u0132\1\u0119\177\u0132\1\u011a\3\u0132\1\u011b\1\u0132\1\u011c\u00aa\u0132\1\u011d\37\u0132\1\u011e\44\u0132\1\u011f\133\u0132\1\u0120\7\u0132\1\u0121\7\u0132\1\u0122\7\u0132\1\u0123\45\u0132",
            "\1\u0134\15\uffff\1\u0135\5\uffff\1\u0133",
            "\1\u0137",
            "",
            "\12\u013a\1\u013b\34\u013a\1\u013c\uffd8\u013a",
            "",
            "",
            "\1\u013f\1\uffff\12\u0141",
            "",
            "",
            "\1\u0145\16\uffff\1\u0144\2\uffff\1\u0146",
            "",
            "",
            "",
            "",
            "\1\u014b",
            "\1\u014e\6\uffff\1\u014f\1\u014d",
            "\1\u0150",
            "\1\u0153\6\uffff\1\u0151\6\uffff\1\u0152",
            "\1\u0154",
            "\1\u0156",
            "\1\u0158",
            "\1\u015a\3\uffff\1\u0159",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u0155",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161\21\uffff\1\u014b",
            "\1\u0162\17\uffff\1\u014b",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "",
            "\1\u0163",
            "",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "",
            "",
            "\1\u0163",
            "",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "\1\u0163",
            "",
            "",
            "\1\u0155",
            "",
            "\1\u014b\3\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u0165\4\uffff\1\u0166",
            "",
            "",
            "\1\u0141\1\uffff\12\u0167\13\uffff\1\u0141\37\uffff\1\u0141",
            "\10\u0169\2\u016a\13\uffff\1\u0141\37\uffff\1\u0141",
            "\2\u016c\2\uffff\1\u016c\22\uffff\1\u016c",
            "\1\u016b\4\uffff\1\u016b\10\uffff\10\u016d\35\uffff\1\u016b\6\uffff\1\u016b\4\uffff\2\u016b\3\uffff\1\u016b\7\uffff\1\u016b\3\uffff\1\u016b\1\uffff\3\u016b\1\uffff\1\u016d",
            "\12\u013a\1\u016e\27\u013a\1\u0170\71\u013a\1\u016f\uffa3\u013a",
            "",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "",
            "",
            "",
            "\47\u013a\1\u013c\uffd8\u013a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0179",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "",
            "",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0141\1\uffff\12\u0167\13\uffff\1\u0141\37\uffff\1\u0141",
            "",
            "\10\u0169\2\u016a\13\uffff\1\u0141\37\uffff\1\u0141",
            "\12\u016a\13\uffff\1\u0141\37\uffff\1\u0141",
            "",
            "",
            "",
            "\42\u013a\1\u0170\uffdd\u013a",
            "\42\u013a\1\u018d\4\u013a\1\u018d\10\u013a\10\u018f\35\u013a\1\u018c\6\u013a\1\u018d\4\u013a\2\u018d\3\u013a\1\u018d\7\u013a\1\u018d\3\u013a\1\u018d\1\u013a\1\u018d\1\u018b\1\u018d\1\u013a\1\u018e\uff87\u013a",
            "",
            "\1\u0191",
            "\1\u0192",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u019b",
            "\1\u019d\1\u019c",
            "\1\u019e",
            "",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a5\3\uffff\1\u01a4",
            "\1\u01a6",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u013a\12\u01a8\7\u013a\6\u01a8\32\u013a\6\u01a8\uff99\u013a",
            "\60\u013a\12\u01a9\7\u013a\6\u01a9\32\u013a\6\u01a9\uff99\u013a",
            "\42\u013a\1\u0170\uffdd\u013a",
            "\60\u013a\12\u01aa\7\u013a\6\u01aa\32\u013a\6\u01aa\uff99\u013a",
            "\60\u013a\10\u01ab\uffc8\u013a",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01b5",
            "\1\u01b6",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01bd",
            "\1\u01be",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u013a\12\u01c0\7\u013a\6\u01c0\32\u013a\6\u01c0\uff99\u013a",
            "\60\u013a\12\u01c1\7\u013a\6\u01c1\32\u013a\6\u01c1\uff99\u013a",
            "\60\u013a\12\u01c2\7\u013a\6\u01c2\32\u013a\6\u01c2\uff99\u013a",
            "\60\u013a\10\u01c3\uffc8\u013a",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "\1\u01cd",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01d1",
            "",
            "\60\u013a\12\u01d2\7\u013a\6\u01d2\32\u013a\6\u01d2\uff99\u013a",
            "\60\u013a\12\u01d3\7\u013a\6\u01d3\32\u013a\6\u01d3\uff99\u013a",
            "\42\u013a\1\u0170\uffdd\u013a",
            "\42\u013a\1\u0170\uffdd\u013a",
            "\1\u01d4",
            "\1\u01d5",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01d9",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\1\u01db",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "",
            "\1\u01dd",
            "\60\u013a\12\u01de\7\u013a\6\u01de\32\u013a\6\u01de\uff99\u013a",
            "\60\u013a\12\u01df\7\u013a\6\u01df\32\u013a\6\u01df\uff99\u013a",
            "\1\u01e0",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "",
            "",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\42\u013a\1\u0170\uffdd\u013a",
            "\60\u013a\12\u01e5\7\u013a\6\u01e5\32\u013a\6\u01e5\uff99\u013a",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u013a\12\u01e9\7\u013a\6\u01e9\32\u013a\6\u01e9\uff99\u013a",
            "\1\u01ea",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "",
            "\60\u013a\12\u01ec\7\u013a\6\u01ec\32\u013a\6\u01ec\uff99\u013a",
            "\1\u01ed",
            "",
            "\60\u013a\12\u01ee\7\u013a\6\u01ee\32\u013a\6\u01ee\uff99\u013a",
            "\12\u0136\7\uffff\32\u0136\4\uffff\1\u0136\1\uffff\32\u0136",
            "\42\u013a\1\u0170\uffdd\u013a",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_UNICODE_LETTER | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSING_OP | RULE_IDENTIFIER | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_DECIMALS | RULE_UNICODE_VALUE | RULE_BYTE_VALUE | RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_367 = input.LA(1);

                        s = -1;
                        if ( (LA32_367=='u') ) {s = 395;}

                        else if ( (LA32_367=='U') ) {s = 396;}

                        else if ( (LA32_367=='\"'||LA32_367=='\''||LA32_367=='\\'||(LA32_367>='a' && LA32_367<='b')||LA32_367=='f'||LA32_367=='n'||LA32_367=='r'||LA32_367=='t'||LA32_367=='v') ) {s = 397;}

                        else if ( (LA32_367=='x') ) {s = 398;}

                        else if ( ((LA32_367>='0' && LA32_367<='7')) ) {s = 399;}

                        else if ( ((LA32_367>='\u0000' && LA32_367<='!')||(LA32_367>='#' && LA32_367<='&')||(LA32_367>='(' && LA32_367<='/')||(LA32_367>='8' && LA32_367<='T')||(LA32_367>='V' && LA32_367<='[')||(LA32_367>=']' && LA32_367<='`')||(LA32_367>='c' && LA32_367<='e')||(LA32_367>='g' && LA32_367<='m')||(LA32_367>='o' && LA32_367<='q')||LA32_367=='s'||LA32_367=='w'||(LA32_367>='y' && LA32_367<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_366 = input.LA(1);

                        s = -1;
                        if ( (LA32_366=='\"') ) {s = 368;}

                        else if ( ((LA32_366>='\u0000' && LA32_366<='!')||(LA32_366>='#' && LA32_366<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_399 = input.LA(1);

                        s = -1;
                        if ( ((LA32_399>='\u0000' && LA32_399<='/')||(LA32_399>='8' && LA32_399<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_399>='0' && LA32_399<='7')) ) {s = 427;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_427 = input.LA(1);

                        s = -1;
                        if ( ((LA32_427>='\u0000' && LA32_427<='/')||(LA32_427>='8' && LA32_427<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_427>='0' && LA32_427<='7')) ) {s = 451;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_304 = input.LA(1);

                        s = -1;
                        if ( (LA32_304=='\n') ) {s = 366;}

                        else if ( (LA32_304=='\\') ) {s = 367;}

                        else if ( (LA32_304=='\"') ) {s = 368;}

                        else if ( ((LA32_304>='\u0000' && LA32_304<='\t')||(LA32_304>='\u000B' && LA32_304<='!')||(LA32_304>='#' && LA32_304<='[')||(LA32_304>=']' && LA32_304<='\uFFFF')) ) {s = 314;}

                        else s = 306;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_426 = input.LA(1);

                        s = -1;
                        if ( ((LA32_426>='0' && LA32_426<='9')||(LA32_426>='A' && LA32_426<='F')||(LA32_426>='a' && LA32_426<='f')) ) {s = 450;}

                        else if ( ((LA32_426>='\u0000' && LA32_426<='/')||(LA32_426>=':' && LA32_426<='@')||(LA32_426>='G' && LA32_426<='`')||(LA32_426>='g' && LA32_426<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_424 = input.LA(1);

                        s = -1;
                        if ( ((LA32_424>='\u0000' && LA32_424<='/')||(LA32_424>=':' && LA32_424<='@')||(LA32_424>='G' && LA32_424<='`')||(LA32_424>='g' && LA32_424<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_424>='0' && LA32_424<='9')||(LA32_424>='A' && LA32_424<='F')||(LA32_424>='a' && LA32_424<='f')) ) {s = 448;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_448 = input.LA(1);

                        s = -1;
                        if ( ((LA32_448>='\u0000' && LA32_448<='/')||(LA32_448>=':' && LA32_448<='@')||(LA32_448>='G' && LA32_448<='`')||(LA32_448>='g' && LA32_448<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_448>='0' && LA32_448<='9')||(LA32_448>='A' && LA32_448<='F')||(LA32_448>='a' && LA32_448<='f')) ) {s = 466;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_466 = input.LA(1);

                        s = -1;
                        if ( ((LA32_466>='\u0000' && LA32_466<='/')||(LA32_466>=':' && LA32_466<='@')||(LA32_466>='G' && LA32_466<='`')||(LA32_466>='g' && LA32_466<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_466>='0' && LA32_466<='9')||(LA32_466>='A' && LA32_466<='F')||(LA32_466>='a' && LA32_466<='f')) ) {s = 478;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_425 = input.LA(1);

                        s = -1;
                        if ( ((LA32_425>='0' && LA32_425<='9')||(LA32_425>='A' && LA32_425<='F')||(LA32_425>='a' && LA32_425<='f')) ) {s = 449;}

                        else if ( ((LA32_425>='\u0000' && LA32_425<='/')||(LA32_425>=':' && LA32_425<='@')||(LA32_425>='G' && LA32_425<='`')||(LA32_425>='g' && LA32_425<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_449 = input.LA(1);

                        s = -1;
                        if ( ((LA32_449>='\u0000' && LA32_449<='/')||(LA32_449>=':' && LA32_449<='@')||(LA32_449>='G' && LA32_449<='`')||(LA32_449>='g' && LA32_449<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_449>='0' && LA32_449<='9')||(LA32_449>='A' && LA32_449<='F')||(LA32_449>='a' && LA32_449<='f')) ) {s = 467;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_467 = input.LA(1);

                        s = -1;
                        if ( ((LA32_467>='\u0000' && LA32_467<='/')||(LA32_467>=':' && LA32_467<='@')||(LA32_467>='G' && LA32_467<='`')||(LA32_467>='g' && LA32_467<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_467>='0' && LA32_467<='9')||(LA32_467>='A' && LA32_467<='F')||(LA32_467>='a' && LA32_467<='f')) ) {s = 479;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_479 = input.LA(1);

                        s = -1;
                        if ( ((LA32_479>='\u0000' && LA32_479<='/')||(LA32_479>=':' && LA32_479<='@')||(LA32_479>='G' && LA32_479<='`')||(LA32_479>='g' && LA32_479<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_479>='0' && LA32_479<='9')||(LA32_479>='A' && LA32_479<='F')||(LA32_479>='a' && LA32_479<='f')) ) {s = 485;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_485 = input.LA(1);

                        s = -1;
                        if ( ((LA32_485>='0' && LA32_485<='9')||(LA32_485>='A' && LA32_485<='F')||(LA32_485>='a' && LA32_485<='f')) ) {s = 489;}

                        else if ( ((LA32_485>='\u0000' && LA32_485<='/')||(LA32_485>=':' && LA32_485<='@')||(LA32_485>='G' && LA32_485<='`')||(LA32_485>='g' && LA32_485<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_489 = input.LA(1);

                        s = -1;
                        if ( ((LA32_489>='0' && LA32_489<='9')||(LA32_489>='A' && LA32_489<='F')||(LA32_489>='a' && LA32_489<='f')) ) {s = 492;}

                        else if ( ((LA32_489>='\u0000' && LA32_489<='/')||(LA32_489>=':' && LA32_489<='@')||(LA32_489>='G' && LA32_489<='`')||(LA32_489>='g' && LA32_489<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_492 = input.LA(1);

                        s = -1;
                        if ( ((LA32_492>='0' && LA32_492<='9')||(LA32_492>='A' && LA32_492<='F')||(LA32_492>='a' && LA32_492<='f')) ) {s = 494;}

                        else if ( ((LA32_492>='\u0000' && LA32_492<='/')||(LA32_492>=':' && LA32_492<='@')||(LA32_492>='G' && LA32_492<='`')||(LA32_492>='g' && LA32_492<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_398 = input.LA(1);

                        s = -1;
                        if ( ((LA32_398>='\u0000' && LA32_398<='/')||(LA32_398>=':' && LA32_398<='@')||(LA32_398>='G' && LA32_398<='`')||(LA32_398>='g' && LA32_398<='\uFFFF')) ) {s = 314;}

                        else if ( ((LA32_398>='0' && LA32_398<='9')||(LA32_398>='A' && LA32_398<='F')||(LA32_398>='a' && LA32_398<='f')) ) {s = 426;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_395 = input.LA(1);

                        s = -1;
                        if ( ((LA32_395>='0' && LA32_395<='9')||(LA32_395>='A' && LA32_395<='F')||(LA32_395>='a' && LA32_395<='f')) ) {s = 424;}

                        else if ( ((LA32_395>='\u0000' && LA32_395<='/')||(LA32_395>=':' && LA32_395<='@')||(LA32_395>='G' && LA32_395<='`')||(LA32_395>='g' && LA32_395<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_396 = input.LA(1);

                        s = -1;
                        if ( ((LA32_396>='0' && LA32_396<='9')||(LA32_396>='A' && LA32_396<='F')||(LA32_396>='a' && LA32_396<='f')) ) {s = 425;}

                        else if ( ((LA32_396>='\u0000' && LA32_396<='/')||(LA32_396>=':' && LA32_396<='@')||(LA32_396>='G' && LA32_396<='`')||(LA32_396>='g' && LA32_396<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='f') ) {s = 1;}

                        else if ( (LA32_0=='p') ) {s = 2;}

                        else if ( (LA32_0=='\u00EF') ) {s = 3;}

                        else if ( (LA32_0=='\'') ) {s = 4;}

                        else if ( (LA32_0=='(') ) {s = 5;}

                        else if ( (LA32_0==')') ) {s = 6;}

                        else if ( (LA32_0=='.') ) {s = 7;}

                        else if ( (LA32_0=='[') ) {s = 8;}

                        else if ( (LA32_0==']') ) {s = 9;}

                        else if ( (LA32_0=='s') ) {s = 10;}

                        else if ( (LA32_0=='{') ) {s = 11;}

                        else if ( (LA32_0==';') ) {s = 12;}

                        else if ( (LA32_0=='}') ) {s = 13;}

                        else if ( (LA32_0==',') ) {s = 14;}

                        else if ( (LA32_0=='*') ) {s = 15;}

                        else if ( (LA32_0=='i') ) {s = 16;}

                        else if ( (LA32_0=='m') ) {s = 17;}

                        else if ( (LA32_0=='c') ) {s = 18;}

                        else if ( (LA32_0=='<') ) {s = 19;}

                        else if ( (LA32_0==':') ) {s = 20;}

                        else if ( (LA32_0=='g') ) {s = 21;}

                        else if ( (LA32_0=='r') ) {s = 22;}

                        else if ( (LA32_0=='b') ) {s = 23;}

                        else if ( (LA32_0=='e') ) {s = 24;}

                        else if ( (LA32_0=='d') ) {s = 25;}

                        else if ( (LA32_0=='=') ) {s = 26;}

                        else if ( (LA32_0=='t') ) {s = 27;}

                        else if ( (LA32_0=='v') ) {s = 28;}

                        else if ( (LA32_0=='+') ) {s = 29;}

                        else if ( (LA32_0=='-') ) {s = 30;}

                        else if ( (LA32_0=='A') ) {s = 31;}

                        else if ( (LA32_0=='a') ) {s = 32;}

                        else if ( (LA32_0=='\u00AA') ) {s = 33;}

                        else if ( (LA32_0=='\u00B5') ) {s = 34;}

                        else if ( (LA32_0=='\u00BA') ) {s = 35;}

                        else if ( (LA32_0=='\u00C0') ) {s = 36;}

                        else if ( (LA32_0=='\u00D8') ) {s = 37;}

                        else if ( (LA32_0=='\u00F8') ) {s = 38;}

                        else if ( (LA32_0=='\u0222') ) {s = 39;}

                        else if ( (LA32_0=='\u0250') ) {s = 40;}

                        else if ( (LA32_0=='\u02B0') ) {s = 41;}

                        else if ( (LA32_0=='\u02BB') ) {s = 42;}

                        else if ( (LA32_0=='\u02D0') ) {s = 43;}

                        else if ( (LA32_0=='\u02E0') ) {s = 44;}

                        else if ( (LA32_0=='\u02EE') ) {s = 45;}

                        else if ( (LA32_0=='\u037A') ) {s = 46;}

                        else if ( (LA32_0=='\u0386') ) {s = 47;}

                        else if ( (LA32_0=='\u0388') ) {s = 48;}

                        else if ( (LA32_0=='\u038C') ) {s = 49;}

                        else if ( (LA32_0=='\u038E') ) {s = 50;}

                        else if ( (LA32_0=='\u03A3') ) {s = 51;}

                        else if ( (LA32_0=='\u03D0') ) {s = 52;}

                        else if ( (LA32_0=='\u03DA') ) {s = 53;}

                        else if ( (LA32_0=='\u0400') ) {s = 54;}

                        else if ( (LA32_0=='\u048C') ) {s = 55;}

                        else if ( (LA32_0=='\u04C7') ) {s = 56;}

                        else if ( (LA32_0=='\u04CB') ) {s = 57;}

                        else if ( (LA32_0=='\u04D0') ) {s = 58;}

                        else if ( (LA32_0=='\u04F8') ) {s = 59;}

                        else if ( (LA32_0=='\u0531') ) {s = 60;}

                        else if ( (LA32_0=='\u0559') ) {s = 61;}

                        else if ( (LA32_0=='\u0561') ) {s = 62;}

                        else if ( (LA32_0=='\u05D0') ) {s = 63;}

                        else if ( (LA32_0=='\u05F0') ) {s = 64;}

                        else if ( (LA32_0=='\u0621') ) {s = 65;}

                        else if ( (LA32_0=='\u0640') ) {s = 66;}

                        else if ( (LA32_0=='\u0671') ) {s = 67;}

                        else if ( (LA32_0=='\u06D5') ) {s = 68;}

                        else if ( (LA32_0=='\u06E5') ) {s = 69;}

                        else if ( (LA32_0=='\u06FA') ) {s = 70;}

                        else if ( (LA32_0=='\u0710') ) {s = 71;}

                        else if ( (LA32_0=='\u0712') ) {s = 72;}

                        else if ( (LA32_0=='\u0780') ) {s = 73;}

                        else if ( (LA32_0=='\u0905') ) {s = 74;}

                        else if ( (LA32_0=='\u093D') ) {s = 75;}

                        else if ( (LA32_0=='\u0950') ) {s = 76;}

                        else if ( (LA32_0=='\u0958') ) {s = 77;}

                        else if ( (LA32_0=='\u0985') ) {s = 78;}

                        else if ( (LA32_0=='\u098F') ) {s = 79;}

                        else if ( (LA32_0=='\u0993') ) {s = 80;}

                        else if ( (LA32_0=='\u09AA') ) {s = 81;}

                        else if ( (LA32_0=='\u09B2') ) {s = 82;}

                        else if ( (LA32_0=='\u09B6') ) {s = 83;}

                        else if ( (LA32_0=='\u09DC') ) {s = 84;}

                        else if ( (LA32_0=='\u09DF') ) {s = 85;}

                        else if ( (LA32_0=='\u09F0') ) {s = 86;}

                        else if ( (LA32_0=='\u0A05') ) {s = 87;}

                        else if ( (LA32_0=='\u0A0F') ) {s = 88;}

                        else if ( (LA32_0=='\u0A13') ) {s = 89;}

                        else if ( (LA32_0=='\u0A2A') ) {s = 90;}

                        else if ( (LA32_0=='\u0A32') ) {s = 91;}

                        else if ( (LA32_0=='\u0A35') ) {s = 92;}

                        else if ( (LA32_0=='\u0A38') ) {s = 93;}

                        else if ( (LA32_0=='\u0A59') ) {s = 94;}

                        else if ( (LA32_0=='\u0A5E') ) {s = 95;}

                        else if ( (LA32_0=='\u0A72') ) {s = 96;}

                        else if ( (LA32_0=='\u0A85') ) {s = 97;}

                        else if ( (LA32_0=='\u0A8D') ) {s = 98;}

                        else if ( (LA32_0=='\u0A8F') ) {s = 99;}

                        else if ( (LA32_0=='\u0A93') ) {s = 100;}

                        else if ( (LA32_0=='\u0AAA') ) {s = 101;}

                        else if ( (LA32_0=='\u0AB2') ) {s = 102;}

                        else if ( (LA32_0=='\u0AB5') ) {s = 103;}

                        else if ( (LA32_0=='\u0ABD') ) {s = 104;}

                        else if ( (LA32_0=='\u0AD0') ) {s = 105;}

                        else if ( (LA32_0=='\u0AE0') ) {s = 106;}

                        else if ( (LA32_0=='\u0B05') ) {s = 107;}

                        else if ( (LA32_0=='\u0B0F') ) {s = 108;}

                        else if ( (LA32_0=='\u0B13') ) {s = 109;}

                        else if ( (LA32_0=='\u0B2A') ) {s = 110;}

                        else if ( (LA32_0=='\u0B32') ) {s = 111;}

                        else if ( (LA32_0=='\u0B36') ) {s = 112;}

                        else if ( (LA32_0=='\u0B3D') ) {s = 113;}

                        else if ( (LA32_0=='\u0B5C') ) {s = 114;}

                        else if ( (LA32_0=='\u0B5F') ) {s = 115;}

                        else if ( (LA32_0=='\u0B85') ) {s = 116;}

                        else if ( (LA32_0=='\u0B8E') ) {s = 117;}

                        else if ( (LA32_0=='\u0B92') ) {s = 118;}

                        else if ( (LA32_0=='\u0B99') ) {s = 119;}

                        else if ( (LA32_0=='\u0B9C') ) {s = 120;}

                        else if ( (LA32_0=='\u0B9E') ) {s = 121;}

                        else if ( (LA32_0=='\u0BA3') ) {s = 122;}

                        else if ( (LA32_0=='\u0BA8') ) {s = 123;}

                        else if ( (LA32_0=='\u0BAE') ) {s = 124;}

                        else if ( (LA32_0=='\u0BB7') ) {s = 125;}

                        else if ( (LA32_0=='\u0C05') ) {s = 126;}

                        else if ( (LA32_0=='\u0C0E') ) {s = 127;}

                        else if ( (LA32_0=='\u0C12') ) {s = 128;}

                        else if ( (LA32_0=='\u0C2A') ) {s = 129;}

                        else if ( (LA32_0=='\u0C35') ) {s = 130;}

                        else if ( (LA32_0=='\u0C60') ) {s = 131;}

                        else if ( (LA32_0=='\u0C85') ) {s = 132;}

                        else if ( (LA32_0=='\u0C8E') ) {s = 133;}

                        else if ( (LA32_0=='\u0C92') ) {s = 134;}

                        else if ( (LA32_0=='\u0CAA') ) {s = 135;}

                        else if ( (LA32_0=='\u0CB5') ) {s = 136;}

                        else if ( (LA32_0=='\u0CDE') ) {s = 137;}

                        else if ( (LA32_0=='\u0CE0') ) {s = 138;}

                        else if ( (LA32_0=='\u0D05') ) {s = 139;}

                        else if ( (LA32_0=='\u0D0E') ) {s = 140;}

                        else if ( (LA32_0=='\u0D12') ) {s = 141;}

                        else if ( (LA32_0=='\u0D2A') ) {s = 142;}

                        else if ( (LA32_0=='\u0D60') ) {s = 143;}

                        else if ( (LA32_0=='\u0D85') ) {s = 144;}

                        else if ( (LA32_0=='\u0D9A') ) {s = 145;}

                        else if ( (LA32_0=='\u0DB3') ) {s = 146;}

                        else if ( (LA32_0=='\u0DBD') ) {s = 147;}

                        else if ( (LA32_0=='\u0DC0') ) {s = 148;}

                        else if ( (LA32_0=='\u0E01') ) {s = 149;}

                        else if ( (LA32_0=='\u0E32') ) {s = 150;}

                        else if ( (LA32_0=='\u0E40') ) {s = 151;}

                        else if ( (LA32_0=='\u0E81') ) {s = 152;}

                        else if ( (LA32_0=='\u0E84') ) {s = 153;}

                        else if ( (LA32_0=='\u0E87') ) {s = 154;}

                        else if ( (LA32_0=='\u0E8A') ) {s = 155;}

                        else if ( (LA32_0=='\u0E8D') ) {s = 156;}

                        else if ( (LA32_0=='\u0E94') ) {s = 157;}

                        else if ( (LA32_0=='\u0E99') ) {s = 158;}

                        else if ( (LA32_0=='\u0EA1') ) {s = 159;}

                        else if ( (LA32_0=='\u0EA5') ) {s = 160;}

                        else if ( (LA32_0=='\u0EA7') ) {s = 161;}

                        else if ( (LA32_0=='\u0EAA') ) {s = 162;}

                        else if ( (LA32_0=='\u0EAD') ) {s = 163;}

                        else if ( (LA32_0=='\u0EB2') ) {s = 164;}

                        else if ( (LA32_0=='\u0EBD') ) {s = 165;}

                        else if ( (LA32_0=='\u0EC6') ) {s = 166;}

                        else if ( (LA32_0=='\u0EDC') ) {s = 167;}

                        else if ( (LA32_0=='\u0F00') ) {s = 168;}

                        else if ( (LA32_0=='\u0F40') ) {s = 169;}

                        else if ( (LA32_0=='\u0F88') ) {s = 170;}

                        else if ( (LA32_0=='\u1000') ) {s = 171;}

                        else if ( (LA32_0=='\u1023') ) {s = 172;}

                        else if ( (LA32_0=='\u1029') ) {s = 173;}

                        else if ( (LA32_0=='\u1050') ) {s = 174;}

                        else if ( (LA32_0=='\u10A0') ) {s = 175;}

                        else if ( (LA32_0=='\u10D0') ) {s = 176;}

                        else if ( (LA32_0=='\u1100') ) {s = 177;}

                        else if ( (LA32_0=='\u115F') ) {s = 178;}

                        else if ( (LA32_0=='\u11A8') ) {s = 179;}

                        else if ( (LA32_0=='\u1200') ) {s = 180;}

                        else if ( (LA32_0=='\u1208') ) {s = 181;}

                        else if ( (LA32_0=='\u1248') ) {s = 182;}

                        else if ( (LA32_0=='\u124A') ) {s = 183;}

                        else if ( (LA32_0=='\u1250') ) {s = 184;}

                        else if ( (LA32_0=='\u1258') ) {s = 185;}

                        else if ( (LA32_0=='\u125A') ) {s = 186;}

                        else if ( (LA32_0=='\u1260') ) {s = 187;}

                        else if ( (LA32_0=='\u1288') ) {s = 188;}

                        else if ( (LA32_0=='\u128A') ) {s = 189;}

                        else if ( (LA32_0=='\u1290') ) {s = 190;}

                        else if ( (LA32_0=='\u12B0') ) {s = 191;}

                        else if ( (LA32_0=='\u12B2') ) {s = 192;}

                        else if ( (LA32_0=='\u12B8') ) {s = 193;}

                        else if ( (LA32_0=='\u12C0') ) {s = 194;}

                        else if ( (LA32_0=='\u12C2') ) {s = 195;}

                        else if ( (LA32_0=='\u12C8') ) {s = 196;}

                        else if ( (LA32_0=='\u12D0') ) {s = 197;}

                        else if ( (LA32_0=='\u12D8') ) {s = 198;}

                        else if ( (LA32_0=='\u12F0') ) {s = 199;}

                        else if ( (LA32_0=='\u1310') ) {s = 200;}

                        else if ( (LA32_0=='\u1312') ) {s = 201;}

                        else if ( (LA32_0=='\u1318') ) {s = 202;}

                        else if ( (LA32_0=='\u1320') ) {s = 203;}

                        else if ( (LA32_0=='\u1348') ) {s = 204;}

                        else if ( (LA32_0=='\u13A0') ) {s = 205;}

                        else if ( (LA32_0=='\u13B1') ) {s = 206;}

                        else if ( (LA32_0=='\u1401') ) {s = 207;}

                        else if ( (LA32_0=='\u1681') ) {s = 208;}

                        else if ( (LA32_0=='\u16A0') ) {s = 209;}

                        else if ( (LA32_0=='\u1780') ) {s = 210;}

                        else if ( (LA32_0=='\u1820') ) {s = 211;}

                        else if ( (LA32_0=='\u1880') ) {s = 212;}

                        else if ( (LA32_0=='\u1E00') ) {s = 213;}

                        else if ( (LA32_0=='\u1EA0') ) {s = 214;}

                        else if ( (LA32_0=='\u1EE1') ) {s = 215;}

                        else if ( (LA32_0=='\u1F00') ) {s = 216;}

                        else if ( (LA32_0=='\u1F18') ) {s = 217;}

                        else if ( (LA32_0=='\u1F20') ) {s = 218;}

                        else if ( (LA32_0=='\u1F3A') ) {s = 219;}

                        else if ( (LA32_0=='\u1F48') ) {s = 220;}

                        else if ( (LA32_0=='\u1F50') ) {s = 221;}

                        else if ( (LA32_0=='\u1F59') ) {s = 222;}

                        else if ( (LA32_0=='\u1F5B') ) {s = 223;}

                        else if ( (LA32_0=='\u1F5D') ) {s = 224;}

                        else if ( (LA32_0=='\u1F5F') ) {s = 225;}

                        else if ( (LA32_0=='\u1F80') ) {s = 226;}

                        else if ( (LA32_0=='\u1FB6') ) {s = 227;}

                        else if ( (LA32_0=='\u1FBE') ) {s = 228;}

                        else if ( (LA32_0=='\u1FC2') ) {s = 229;}

                        else if ( (LA32_0=='\u1FC6') ) {s = 230;}

                        else if ( (LA32_0=='\u1FD0') ) {s = 231;}

                        else if ( (LA32_0=='\u1FD6') ) {s = 232;}

                        else if ( (LA32_0=='\u1FE0') ) {s = 233;}

                        else if ( (LA32_0=='\u1FF2') ) {s = 234;}

                        else if ( (LA32_0=='\u1FF6') ) {s = 235;}

                        else if ( (LA32_0=='\u207F') ) {s = 236;}

                        else if ( (LA32_0=='\u2102') ) {s = 237;}

                        else if ( (LA32_0=='\u2107') ) {s = 238;}

                        else if ( (LA32_0=='\u210A') ) {s = 239;}

                        else if ( (LA32_0=='\u2115') ) {s = 240;}

                        else if ( (LA32_0=='\u2119') ) {s = 241;}

                        else if ( (LA32_0=='\u2124') ) {s = 242;}

                        else if ( (LA32_0=='\u2126') ) {s = 243;}

                        else if ( (LA32_0=='\u2128') ) {s = 244;}

                        else if ( (LA32_0=='\u212A') ) {s = 245;}

                        else if ( (LA32_0=='\u212F') ) {s = 246;}

                        else if ( (LA32_0=='\u2133') ) {s = 247;}

                        else if ( (LA32_0=='\u2160') ) {s = 248;}

                        else if ( (LA32_0=='\u3005') ) {s = 249;}

                        else if ( (LA32_0=='\u3021') ) {s = 250;}

                        else if ( (LA32_0=='\u3031') ) {s = 251;}

                        else if ( (LA32_0=='\u3038') ) {s = 252;}

                        else if ( (LA32_0=='\u3041') ) {s = 253;}

                        else if ( (LA32_0=='\u309D') ) {s = 254;}

                        else if ( (LA32_0=='\u30A1') ) {s = 255;}

                        else if ( (LA32_0=='\u30FC') ) {s = 256;}

                        else if ( (LA32_0=='\u3105') ) {s = 257;}

                        else if ( (LA32_0=='\u3131') ) {s = 258;}

                        else if ( (LA32_0=='\u31A0') ) {s = 259;}

                        else if ( (LA32_0=='\u3400') ) {s = 260;}

                        else if ( (LA32_0=='\u4DB5') ) {s = 261;}

                        else if ( (LA32_0=='\u4E00') ) {s = 262;}

                        else if ( (LA32_0=='\u9FA5') ) {s = 263;}

                        else if ( (LA32_0=='\uA000') ) {s = 264;}

                        else if ( (LA32_0=='\uAC00') ) {s = 265;}

                        else if ( (LA32_0=='\uD7A3') ) {s = 266;}

                        else if ( (LA32_0=='\uF900') ) {s = 267;}

                        else if ( (LA32_0=='\uFB00') ) {s = 268;}

                        else if ( (LA32_0=='\uFB13') ) {s = 269;}

                        else if ( (LA32_0=='\uFB1D') ) {s = 270;}

                        else if ( (LA32_0=='\uFB1F') ) {s = 271;}

                        else if ( (LA32_0=='\uFB2A') ) {s = 272;}

                        else if ( (LA32_0=='\uFB38') ) {s = 273;}

                        else if ( (LA32_0=='\uFB3E') ) {s = 274;}

                        else if ( (LA32_0=='\uFB40') ) {s = 275;}

                        else if ( (LA32_0=='\uFB43') ) {s = 276;}

                        else if ( (LA32_0=='\uFB46') ) {s = 277;}

                        else if ( (LA32_0=='\uFBD3') ) {s = 278;}

                        else if ( (LA32_0=='\uFD50') ) {s = 279;}

                        else if ( (LA32_0=='\uFD92') ) {s = 280;}

                        else if ( (LA32_0=='\uFDF0') ) {s = 281;}

                        else if ( (LA32_0=='\uFE70') ) {s = 282;}

                        else if ( (LA32_0=='\uFE74') ) {s = 283;}

                        else if ( (LA32_0=='\uFE76') ) {s = 284;}

                        else if ( (LA32_0=='\uFF21') ) {s = 285;}

                        else if ( (LA32_0=='\uFF41') ) {s = 286;}

                        else if ( (LA32_0=='\uFF66') ) {s = 287;}

                        else if ( (LA32_0=='\uFFC2') ) {s = 288;}

                        else if ( (LA32_0=='\uFFCA') ) {s = 289;}

                        else if ( (LA32_0=='\uFFD2') ) {s = 290;}

                        else if ( (LA32_0=='\uFFDA') ) {s = 291;}

                        else if ( (LA32_0=='|') ) {s = 292;}

                        else if ( (LA32_0=='&') ) {s = 293;}

                        else if ( (LA32_0=='!') ) {s = 294;}

                        else if ( (LA32_0=='>') ) {s = 295;}

                        else if ( (LA32_0=='^') ) {s = 296;}

                        else if ( (LA32_0=='/') ) {s = 297;}

                        else if ( (LA32_0=='%') ) {s = 298;}

                        else if ( ((LA32_0>='B' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='l')||(LA32_0>='n' && LA32_0<='o')||LA32_0=='q'||LA32_0=='u'||(LA32_0>='w' && LA32_0<='z')) ) {s = 299;}

                        else if ( ((LA32_0>='1' && LA32_0<='9')) ) {s = 300;}

                        else if ( (LA32_0=='0') ) {s = 301;}

                        else if ( (LA32_0=='\n') ) {s = 302;}

                        else if ( (LA32_0=='\\') ) {s = 303;}

                        else if ( (LA32_0=='\"') ) {s = 304;}

                        else if ( (LA32_0=='\t'||LA32_0=='\r'||LA32_0==' ') ) {s = 305;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||(LA32_0>='#' && LA32_0<='$')||(LA32_0>='?' && LA32_0<='@')||LA32_0=='`'||(LA32_0>='~' && LA32_0<='\u00A9')||(LA32_0>='\u00AB' && LA32_0<='\u00B4')||(LA32_0>='\u00B6' && LA32_0<='\u00B9')||(LA32_0>='\u00BB' && LA32_0<='\u00BF')||(LA32_0>='\u00C1' && LA32_0<='\u00D7')||(LA32_0>='\u00D9' && LA32_0<='\u00EE')||(LA32_0>='\u00F0' && LA32_0<='\u00F7')||(LA32_0>='\u00F9' && LA32_0<='\u0221')||(LA32_0>='\u0223' && LA32_0<='\u024F')||(LA32_0>='\u0251' && LA32_0<='\u02AF')||(LA32_0>='\u02B1' && LA32_0<='\u02BA')||(LA32_0>='\u02BC' && LA32_0<='\u02CF')||(LA32_0>='\u02D1' && LA32_0<='\u02DF')||(LA32_0>='\u02E1' && LA32_0<='\u02ED')||(LA32_0>='\u02EF' && LA32_0<='\u0379')||(LA32_0>='\u037B' && LA32_0<='\u0385')||LA32_0=='\u0387'||(LA32_0>='\u0389' && LA32_0<='\u038B')||LA32_0=='\u038D'||(LA32_0>='\u038F' && LA32_0<='\u03A2')||(LA32_0>='\u03A4' && LA32_0<='\u03CF')||(LA32_0>='\u03D1' && LA32_0<='\u03D9')||(LA32_0>='\u03DB' && LA32_0<='\u03FF')||(LA32_0>='\u0401' && LA32_0<='\u048B')||(LA32_0>='\u048D' && LA32_0<='\u04C6')||(LA32_0>='\u04C8' && LA32_0<='\u04CA')||(LA32_0>='\u04CC' && LA32_0<='\u04CF')||(LA32_0>='\u04D1' && LA32_0<='\u04F7')||(LA32_0>='\u04F9' && LA32_0<='\u0530')||(LA32_0>='\u0532' && LA32_0<='\u0558')||(LA32_0>='\u055A' && LA32_0<='\u0560')||(LA32_0>='\u0562' && LA32_0<='\u05CF')||(LA32_0>='\u05D1' && LA32_0<='\u05EF')||(LA32_0>='\u05F1' && LA32_0<='\u0620')||(LA32_0>='\u0622' && LA32_0<='\u063F')||(LA32_0>='\u0641' && LA32_0<='\u0670')||(LA32_0>='\u0672' && LA32_0<='\u06D4')||(LA32_0>='\u06D6' && LA32_0<='\u06E4')||(LA32_0>='\u06E6' && LA32_0<='\u06F9')||(LA32_0>='\u06FB' && LA32_0<='\u070F')||LA32_0=='\u0711'||(LA32_0>='\u0713' && LA32_0<='\u077F')||(LA32_0>='\u0781' && LA32_0<='\u0904')||(LA32_0>='\u0906' && LA32_0<='\u093C')||(LA32_0>='\u093E' && LA32_0<='\u094F')||(LA32_0>='\u0951' && LA32_0<='\u0957')||(LA32_0>='\u0959' && LA32_0<='\u0984')||(LA32_0>='\u0986' && LA32_0<='\u098E')||(LA32_0>='\u0990' && LA32_0<='\u0992')||(LA32_0>='\u0994' && LA32_0<='\u09A9')||(LA32_0>='\u09AB' && LA32_0<='\u09B1')||(LA32_0>='\u09B3' && LA32_0<='\u09B5')||(LA32_0>='\u09B7' && LA32_0<='\u09DB')||(LA32_0>='\u09DD' && LA32_0<='\u09DE')||(LA32_0>='\u09E0' && LA32_0<='\u09EF')||(LA32_0>='\u09F1' && LA32_0<='\u0A04')||(LA32_0>='\u0A06' && LA32_0<='\u0A0E')||(LA32_0>='\u0A10' && LA32_0<='\u0A12')||(LA32_0>='\u0A14' && LA32_0<='\u0A29')||(LA32_0>='\u0A2B' && LA32_0<='\u0A31')||(LA32_0>='\u0A33' && LA32_0<='\u0A34')||(LA32_0>='\u0A36' && LA32_0<='\u0A37')||(LA32_0>='\u0A39' && LA32_0<='\u0A58')||(LA32_0>='\u0A5A' && LA32_0<='\u0A5D')||(LA32_0>='\u0A5F' && LA32_0<='\u0A71')||(LA32_0>='\u0A73' && LA32_0<='\u0A84')||(LA32_0>='\u0A86' && LA32_0<='\u0A8C')||LA32_0=='\u0A8E'||(LA32_0>='\u0A90' && LA32_0<='\u0A92')||(LA32_0>='\u0A94' && LA32_0<='\u0AA9')||(LA32_0>='\u0AAB' && LA32_0<='\u0AB1')||(LA32_0>='\u0AB3' && LA32_0<='\u0AB4')||(LA32_0>='\u0AB6' && LA32_0<='\u0ABC')||(LA32_0>='\u0ABE' && LA32_0<='\u0ACF')||(LA32_0>='\u0AD1' && LA32_0<='\u0ADF')||(LA32_0>='\u0AE1' && LA32_0<='\u0B04')||(LA32_0>='\u0B06' && LA32_0<='\u0B0E')||(LA32_0>='\u0B10' && LA32_0<='\u0B12')||(LA32_0>='\u0B14' && LA32_0<='\u0B29')||(LA32_0>='\u0B2B' && LA32_0<='\u0B31')||(LA32_0>='\u0B33' && LA32_0<='\u0B35')||(LA32_0>='\u0B37' && LA32_0<='\u0B3C')||(LA32_0>='\u0B3E' && LA32_0<='\u0B5B')||(LA32_0>='\u0B5D' && LA32_0<='\u0B5E')||(LA32_0>='\u0B60' && LA32_0<='\u0B84')||(LA32_0>='\u0B86' && LA32_0<='\u0B8D')||(LA32_0>='\u0B8F' && LA32_0<='\u0B91')||(LA32_0>='\u0B93' && LA32_0<='\u0B98')||(LA32_0>='\u0B9A' && LA32_0<='\u0B9B')||LA32_0=='\u0B9D'||(LA32_0>='\u0B9F' && LA32_0<='\u0BA2')||(LA32_0>='\u0BA4' && LA32_0<='\u0BA7')||(LA32_0>='\u0BA9' && LA32_0<='\u0BAD')||(LA32_0>='\u0BAF' && LA32_0<='\u0BB6')||(LA32_0>='\u0BB8' && LA32_0<='\u0C04')||(LA32_0>='\u0C06' && LA32_0<='\u0C0D')||(LA32_0>='\u0C0F' && LA32_0<='\u0C11')||(LA32_0>='\u0C13' && LA32_0<='\u0C29')||(LA32_0>='\u0C2B' && LA32_0<='\u0C34')||(LA32_0>='\u0C36' && LA32_0<='\u0C5F')||(LA32_0>='\u0C61' && LA32_0<='\u0C84')||(LA32_0>='\u0C86' && LA32_0<='\u0C8D')||(LA32_0>='\u0C8F' && LA32_0<='\u0C91')||(LA32_0>='\u0C93' && LA32_0<='\u0CA9')||(LA32_0>='\u0CAB' && LA32_0<='\u0CB4')||(LA32_0>='\u0CB6' && LA32_0<='\u0CDD')||LA32_0=='\u0CDF'||(LA32_0>='\u0CE1' && LA32_0<='\u0D04')||(LA32_0>='\u0D06' && LA32_0<='\u0D0D')||(LA32_0>='\u0D0F' && LA32_0<='\u0D11')||(LA32_0>='\u0D13' && LA32_0<='\u0D29')||(LA32_0>='\u0D2B' && LA32_0<='\u0D5F')||(LA32_0>='\u0D61' && LA32_0<='\u0D84')||(LA32_0>='\u0D86' && LA32_0<='\u0D99')||(LA32_0>='\u0D9B' && LA32_0<='\u0DB2')||(LA32_0>='\u0DB4' && LA32_0<='\u0DBC')||(LA32_0>='\u0DBE' && LA32_0<='\u0DBF')||(LA32_0>='\u0DC1' && LA32_0<='\u0E00')||(LA32_0>='\u0E02' && LA32_0<='\u0E31')||(LA32_0>='\u0E33' && LA32_0<='\u0E3F')||(LA32_0>='\u0E41' && LA32_0<='\u0E80')||(LA32_0>='\u0E82' && LA32_0<='\u0E83')||(LA32_0>='\u0E85' && LA32_0<='\u0E86')||(LA32_0>='\u0E88' && LA32_0<='\u0E89')||(LA32_0>='\u0E8B' && LA32_0<='\u0E8C')||(LA32_0>='\u0E8E' && LA32_0<='\u0E93')||(LA32_0>='\u0E95' && LA32_0<='\u0E98')||(LA32_0>='\u0E9A' && LA32_0<='\u0EA0')||(LA32_0>='\u0EA2' && LA32_0<='\u0EA4')||LA32_0=='\u0EA6'||(LA32_0>='\u0EA8' && LA32_0<='\u0EA9')||(LA32_0>='\u0EAB' && LA32_0<='\u0EAC')||(LA32_0>='\u0EAE' && LA32_0<='\u0EB1')||(LA32_0>='\u0EB3' && LA32_0<='\u0EBC')||(LA32_0>='\u0EBE' && LA32_0<='\u0EC5')||(LA32_0>='\u0EC7' && LA32_0<='\u0EDB')||(LA32_0>='\u0EDD' && LA32_0<='\u0EFF')||(LA32_0>='\u0F01' && LA32_0<='\u0F3F')||(LA32_0>='\u0F41' && LA32_0<='\u0F87')||(LA32_0>='\u0F89' && LA32_0<='\u0FFF')||(LA32_0>='\u1001' && LA32_0<='\u1022')||(LA32_0>='\u1024' && LA32_0<='\u1028')||(LA32_0>='\u102A' && LA32_0<='\u104F')||(LA32_0>='\u1051' && LA32_0<='\u109F')||(LA32_0>='\u10A1' && LA32_0<='\u10CF')||(LA32_0>='\u10D1' && LA32_0<='\u10FF')||(LA32_0>='\u1101' && LA32_0<='\u115E')||(LA32_0>='\u1160' && LA32_0<='\u11A7')||(LA32_0>='\u11A9' && LA32_0<='\u11FF')||(LA32_0>='\u1201' && LA32_0<='\u1207')||(LA32_0>='\u1209' && LA32_0<='\u1247')||LA32_0=='\u1249'||(LA32_0>='\u124B' && LA32_0<='\u124F')||(LA32_0>='\u1251' && LA32_0<='\u1257')||LA32_0=='\u1259'||(LA32_0>='\u125B' && LA32_0<='\u125F')||(LA32_0>='\u1261' && LA32_0<='\u1287')||LA32_0=='\u1289'||(LA32_0>='\u128B' && LA32_0<='\u128F')||(LA32_0>='\u1291' && LA32_0<='\u12AF')||LA32_0=='\u12B1'||(LA32_0>='\u12B3' && LA32_0<='\u12B7')||(LA32_0>='\u12B9' && LA32_0<='\u12BF')||LA32_0=='\u12C1'||(LA32_0>='\u12C3' && LA32_0<='\u12C7')||(LA32_0>='\u12C9' && LA32_0<='\u12CF')||(LA32_0>='\u12D1' && LA32_0<='\u12D7')||(LA32_0>='\u12D9' && LA32_0<='\u12EF')||(LA32_0>='\u12F1' && LA32_0<='\u130F')||LA32_0=='\u1311'||(LA32_0>='\u1313' && LA32_0<='\u1317')||(LA32_0>='\u1319' && LA32_0<='\u131F')||(LA32_0>='\u1321' && LA32_0<='\u1347')||(LA32_0>='\u1349' && LA32_0<='\u139F')||(LA32_0>='\u13A1' && LA32_0<='\u13B0')||(LA32_0>='\u13B2' && LA32_0<='\u1400')||(LA32_0>='\u1402' && LA32_0<='\u1680')||(LA32_0>='\u1682' && LA32_0<='\u169F')||(LA32_0>='\u16A1' && LA32_0<='\u177F')||(LA32_0>='\u1781' && LA32_0<='\u181F')||(LA32_0>='\u1821' && LA32_0<='\u187F')||(LA32_0>='\u1881' && LA32_0<='\u1DFF')||(LA32_0>='\u1E01' && LA32_0<='\u1E9F')||(LA32_0>='\u1EA1' && LA32_0<='\u1EE0')||(LA32_0>='\u1EE2' && LA32_0<='\u1EFF')||(LA32_0>='\u1F01' && LA32_0<='\u1F17')||(LA32_0>='\u1F19' && LA32_0<='\u1F1F')||(LA32_0>='\u1F21' && LA32_0<='\u1F39')||(LA32_0>='\u1F3B' && LA32_0<='\u1F47')||(LA32_0>='\u1F49' && LA32_0<='\u1F4F')||(LA32_0>='\u1F51' && LA32_0<='\u1F58')||LA32_0=='\u1F5A'||LA32_0=='\u1F5C'||LA32_0=='\u1F5E'||(LA32_0>='\u1F60' && LA32_0<='\u1F7F')||(LA32_0>='\u1F81' && LA32_0<='\u1FB5')||(LA32_0>='\u1FB7' && LA32_0<='\u1FBD')||(LA32_0>='\u1FBF' && LA32_0<='\u1FC1')||(LA32_0>='\u1FC3' && LA32_0<='\u1FC5')||(LA32_0>='\u1FC7' && LA32_0<='\u1FCF')||(LA32_0>='\u1FD1' && LA32_0<='\u1FD5')||(LA32_0>='\u1FD7' && LA32_0<='\u1FDF')||(LA32_0>='\u1FE1' && LA32_0<='\u1FF1')||(LA32_0>='\u1FF3' && LA32_0<='\u1FF5')||(LA32_0>='\u1FF7' && LA32_0<='\u207E')||(LA32_0>='\u2080' && LA32_0<='\u2101')||(LA32_0>='\u2103' && LA32_0<='\u2106')||(LA32_0>='\u2108' && LA32_0<='\u2109')||(LA32_0>='\u210B' && LA32_0<='\u2114')||(LA32_0>='\u2116' && LA32_0<='\u2118')||(LA32_0>='\u211A' && LA32_0<='\u2123')||LA32_0=='\u2125'||LA32_0=='\u2127'||LA32_0=='\u2129'||(LA32_0>='\u212B' && LA32_0<='\u212E')||(LA32_0>='\u2130' && LA32_0<='\u2132')||(LA32_0>='\u2134' && LA32_0<='\u215F')||(LA32_0>='\u2161' && LA32_0<='\u3004')||(LA32_0>='\u3006' && LA32_0<='\u3020')||(LA32_0>='\u3022' && LA32_0<='\u3030')||(LA32_0>='\u3032' && LA32_0<='\u3037')||(LA32_0>='\u3039' && LA32_0<='\u3040')||(LA32_0>='\u3042' && LA32_0<='\u309C')||(LA32_0>='\u309E' && LA32_0<='\u30A0')||(LA32_0>='\u30A2' && LA32_0<='\u30FB')||(LA32_0>='\u30FD' && LA32_0<='\u3104')||(LA32_0>='\u3106' && LA32_0<='\u3130')||(LA32_0>='\u3132' && LA32_0<='\u319F')||(LA32_0>='\u31A1' && LA32_0<='\u33FF')||(LA32_0>='\u3401' && LA32_0<='\u4DB4')||(LA32_0>='\u4DB6' && LA32_0<='\u4DFF')||(LA32_0>='\u4E01' && LA32_0<='\u9FA4')||(LA32_0>='\u9FA6' && LA32_0<='\u9FFF')||(LA32_0>='\uA001' && LA32_0<='\uABFF')||(LA32_0>='\uAC01' && LA32_0<='\uD7A2')||(LA32_0>='\uD7A4' && LA32_0<='\uF8FF')||(LA32_0>='\uF901' && LA32_0<='\uFAFF')||(LA32_0>='\uFB01' && LA32_0<='\uFB12')||(LA32_0>='\uFB14' && LA32_0<='\uFB1C')||LA32_0=='\uFB1E'||(LA32_0>='\uFB20' && LA32_0<='\uFB29')||(LA32_0>='\uFB2B' && LA32_0<='\uFB37')||(LA32_0>='\uFB39' && LA32_0<='\uFB3D')||LA32_0=='\uFB3F'||(LA32_0>='\uFB41' && LA32_0<='\uFB42')||(LA32_0>='\uFB44' && LA32_0<='\uFB45')||(LA32_0>='\uFB47' && LA32_0<='\uFBD2')||(LA32_0>='\uFBD4' && LA32_0<='\uFD4F')||(LA32_0>='\uFD51' && LA32_0<='\uFD91')||(LA32_0>='\uFD93' && LA32_0<='\uFDEF')||(LA32_0>='\uFDF1' && LA32_0<='\uFE6F')||(LA32_0>='\uFE71' && LA32_0<='\uFE73')||LA32_0=='\uFE75'||(LA32_0>='\uFE77' && LA32_0<='\uFF20')||(LA32_0>='\uFF22' && LA32_0<='\uFF40')||(LA32_0>='\uFF42' && LA32_0<='\uFF65')||(LA32_0>='\uFF67' && LA32_0<='\uFFC1')||(LA32_0>='\uFFC3' && LA32_0<='\uFFC9')||(LA32_0>='\uFFCB' && LA32_0<='\uFFD1')||(LA32_0>='\uFFD3' && LA32_0<='\uFFD9')||(LA32_0>='\uFFDB' && LA32_0<='\uFFFF')) ) {s = 306;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_451 = input.LA(1);

                        s = -1;
                        if ( (LA32_451=='\"') ) {s = 368;}

                        else if ( ((LA32_451>='\u0000' && LA32_451<='!')||(LA32_451>='#' && LA32_451<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_478 = input.LA(1);

                        s = -1;
                        if ( (LA32_478=='\"') ) {s = 368;}

                        else if ( ((LA32_478>='\u0000' && LA32_478<='!')||(LA32_478>='#' && LA32_478<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_450 = input.LA(1);

                        s = -1;
                        if ( (LA32_450=='\"') ) {s = 368;}

                        else if ( ((LA32_450>='\u0000' && LA32_450<='!')||(LA32_450>='#' && LA32_450<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_494 = input.LA(1);

                        s = -1;
                        if ( (LA32_494=='\"') ) {s = 368;}

                        else if ( ((LA32_494>='\u0000' && LA32_494<='!')||(LA32_494>='#' && LA32_494<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_397 = input.LA(1);

                        s = -1;
                        if ( (LA32_397=='\"') ) {s = 368;}

                        else if ( ((LA32_397>='\u0000' && LA32_397<='!')||(LA32_397>='#' && LA32_397<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_315 = input.LA(1);

                        s = -1;
                        if ( (LA32_315=='\'') ) {s = 316;}

                        else if ( ((LA32_315>='\u0000' && LA32_315<='&')||(LA32_315>='(' && LA32_315<='\uFFFF')) ) {s = 314;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_4 = input.LA(1);

                        s = -1;
                        if ( ((LA32_4>='\u0000' && LA32_4<='\t')||(LA32_4>='\u000B' && LA32_4<='&')||(LA32_4>='(' && LA32_4<='\uFFFF')) ) {s = 314;}

                        else if ( (LA32_4=='\n') ) {s = 315;}

                        else if ( (LA32_4=='\'') ) {s = 316;}

                        else s = 313;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}