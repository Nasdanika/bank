package org.nasdanika.bank.tests.customer;

import org.junit.After;
import org.junit.Before;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.bank.ui.driver.actors.Customer;
import org.nasdanika.bank.ui.driver.actors.Guest;
import org.nasdanika.bank.ui.driver.actors.TestCustomer;
import org.nasdanika.webtest.Category;

@Category("Customer")
public class CustomerTestBase extends NasdanikaBankTestBase {
	
	private TestCustomer testCustomer;
	
	private Customer customer;
	
	protected Customer getCustomer() {
		return customer;
	}
	
	protected TestCustomer getTestCustomer() {
		return testCustomer;
	}
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		Guest guest = actorFactory.createGuest(getWebDriver());
		testCustomer = guest.createTestCustomer("John Doe");
		customer = guest.logIn(testCustomer.getUserId(), testCustomer.getPassword());
	}
	
	@After
	public void tearDown() throws Exception {
		testCustomer.close();
		quitDriver();
	}
			
}
