/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.example.fowlerdsl.ui.internal.FowlerdslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class StatemachineUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FowlerdslActivator.getInstance().getInjector("org.eclipse.xtext.example.fowlerdsl.Statemachine");
	}

}
