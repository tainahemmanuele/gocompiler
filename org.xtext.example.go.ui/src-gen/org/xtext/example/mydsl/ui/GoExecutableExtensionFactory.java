/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.go.ui.internal.GoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GoActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GoActivator activator = GoActivator.getInstance();
		return activator != null ? activator.getInjector(GoActivator.ORG_XTEXT_EXAMPLE_MYDSL_GO) : null;
	}

}