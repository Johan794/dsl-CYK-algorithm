/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyFNCStandaloneSetup extends MyFNCStandaloneSetupGenerated {

	public static void doSetup() {
		new MyFNCStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}