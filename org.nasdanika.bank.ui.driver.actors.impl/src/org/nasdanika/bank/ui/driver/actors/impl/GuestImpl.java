package org.nasdanika.bank.ui.driver.actors.impl;

import org.nasdanika.bank.ui.driver.actors.Customer;
import org.nasdanika.bank.ui.driver.actors.Guest;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.actors.TestCustomer;
import org.nasdanika.bank.ui.driver.pages.customer.Home;
import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

class GuestImpl implements Guest {
	
	private NasdanikaBankActorFactory factory;
	private WebDriver webDriver;

	GuestImpl(NasdanikaBankActorFactory factory, WebDriver webDriver) {
		this.webDriver = webDriver;
		this.factory = factory;
	}
	
	private Page<WebDriver> currentPage;

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}

	@Override
	public void navigateToHomePage() {
		currentPage = factory.getPageFactory().navigateToGuestHomePage(webDriver);
	}

	@Override
	public Customer logIn(String userId, String password) {
		org.nasdanika.bank.ui.driver.pages.guest.Home guestHome = (org.nasdanika.bank.ui.driver.pages.guest.Home) currentPage;
		guestHome.setLogin(userId);
		guestHome.setPassword(password);
		// TODO - analyze resulting page - customer home or guest home with an error message if log-in failed.
		// For now assuming happy path.
		org.nasdanika.bank.ui.driver.pages.customer.Home customerHome = (Home) guestHome.clickLogInButton();
		return new CustomerImpl(factory, webDriver, customerHome);
	}

	@Override
	public Customer register() {
		throw new UnsupportedOperationException();
	}

	@Override
	public TestCustomer createTestCustomer(String alias) {
		// TODO - either use UI or communicate with the application by other means
		// to create a customer object. For now we create an anonymous instance with static data.
		return new TestCustomer() {

			@Override
			public void close() throws Exception {
				// NOP, in a real implementation - delete customer object from the application. 				
			}

			@Override
			public String getUserId() {
				return "john-doe";
			}

			@Override
			public String getPassword() {
				return "irrelevant";
			}
			
		};
	}

}
