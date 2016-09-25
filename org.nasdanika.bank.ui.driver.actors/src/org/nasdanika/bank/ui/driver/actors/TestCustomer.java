package org.nasdanika.bank.ui.driver.actors;

/**
 * Helper class to simplify testing. Tests customers are created with
 * random but unique registration data. 
 * @author Pavel Vlasov
 *
 */
public interface TestCustomer extends AutoCloseable {
	
	/**
	 * @return User ID
	 */
	String getUserId();

	/**
	 * @return Password
	 */
	String getPassword();
	

}
