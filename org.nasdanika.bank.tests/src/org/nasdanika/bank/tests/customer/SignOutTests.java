package org.nasdanika.bank.tests.customer;

import org.junit.Test;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.sign-out")
public class SignOutTests extends CustomerTestBase {
	
	@Test
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			after="bundle://org.nasdanika.bank.app/sketches/guest-home-web.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			after="bundle://org.nasdanika.bank.app/sketches/guest-home-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.sign-out.successful-sign-out")
	public void successfulSignOut() throws Exception {
		getCustomer().logOut();
	}
		
}
