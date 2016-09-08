package org.nasdanika.bank.tests.customer;

import org.junit.Test;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.webtest.Category;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Category("Customer")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details")
public class AccountDetailsTests extends NasdanikaBankTestBase {
	
	@Test
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/customer-home-web.png",
			after="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/customer-home-mobile.png",
			after="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.load")
	public void loadAccountDetails() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}

	@Test
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			selector="sketch/web")
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.select-statement")
	public void selectStatement() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}	
		
}
