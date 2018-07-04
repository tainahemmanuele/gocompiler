import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        DebugInternalGoLexer lex = new DebugInternalGoLexer(new ANTLRFileStream("C:\\Users\\Tainah\\Desktop\\gocompiler\\org.xtext.example.go\\src-gen\\org\\xtext\\example\\mydsl\\parser\\antlr\\internal\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        DebugInternalGoParser g = new DebugInternalGoParser(tokens, 49100, null);
        try {
            g.ruleForStmt();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}