/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl;

import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;
import org.xtext.example.mydsl.AbstractGoRuntimeModule;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class GoRuntimeModule extends AbstractGoRuntimeModule {
	
	
	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
	    return GoSyntaxError.class;
	}
}
