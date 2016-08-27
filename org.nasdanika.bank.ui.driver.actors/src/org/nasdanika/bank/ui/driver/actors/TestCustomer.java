package org.nasdanika.bank.ui.driver.actors;

import org.nasdanika.webtest.Aliased;

/**
 * Helper class to simplify testing. Tests customers are created with
 * random but unique registration data. 
 * @author Pavel Vlasov
 *
 */
public interface TestCustomer extends Customer, Aliased {
	
	/*
	 * Maybe a better way is to have an interface RegistrationInfo and a method getRegistrationInfo(). 
	 */
	
	/**
	 * @return User ID
	 */
	String getUserId();

	/**
	 * @return Password
	 */
	String getPassword();
	
	/**
	 * Removes test customer record.
	 */
	void dispose();

}
