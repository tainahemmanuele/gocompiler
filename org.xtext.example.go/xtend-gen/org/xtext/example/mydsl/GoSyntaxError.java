package org.xtext.example.mydsl;

import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;

public class GoSyntaxError implements ISyntaxErrorMessageProvider {
	


	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		
		if(context.getDefaultMessage().contains("mismatched input")) {
			return new SyntaxErrorMessage("Lexical error: " + context.getDefaultMessage(), null);
		} else {
			return new SyntaxErrorMessage("Syntax error: " + context.getDefaultMessage(), null);
		}
		
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IValueConverterErrorContext context) {
		return new SyntaxErrorMessage("Syntax error: " + context.getDefaultMessage(), null);
	}

}
