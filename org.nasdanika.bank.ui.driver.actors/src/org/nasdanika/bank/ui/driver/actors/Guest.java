package org.nasdanika.bank.ui.driver.actors;

import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Link;
import org.openqa.selenium.WebDriver;

@Description("Guest, a.k.a. Vistior or 'Unauthenticated principal'")
@Link(
		type = "User@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest")
public interface Guest extends Actor<WebDriver> {
		
	/**
	 * Navigates to the home page. The page can be accessed by invoking <code>getCurrentPage</code> method.
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.navigate-home")
	@Description("Navigate to the landing page")
	void navigateToHomePage();
	
	/**
	 * Logs in to the system
	 * @param userId User ID
	 * @param password Password
	 * @return Instance of the customer upon successful log-in.
	 * @throws IllegalArgumentException If login fails. <code>getCurrentPage()</code> method can be used in this case to 
	 * access to the {@link GuestHomePage} for further analysis, e.g. to read the error message.
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.log-in")
	@Description("Log in to the system")
	Customer logIn(String userId, String password);

	/**
	 * Registers a new customer
	 * @return Instance of the customer upon successful registration.
	 * @throws IllegalArgumentException If registration fails. <code>getCurrentPage()</code> method can be used in this case to 
	 * access to the current page for further analysis.
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.sign-up")
	@Description("Registers customer")
	Customer register(/* TODO - registration data */);
	
	/**
	 * Helper method to simplify testing.
	 * @param alias Customer alias. If null, then the alias is set to "Customer".
	 * @return
	 * @throws IllegalArgumentException
	 */
	@Description("Generates random but unique customer registration data and registers a customer")
	TestCustomer createTestCustomer(String alias);

}
