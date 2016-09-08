package org.nasdanika.bank.tests.customer;

import org.junit.Test;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.webtest.Category;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Category("Customer")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.accounts-summary")
public class AccountsSummaryTests extends NasdanikaBankTestBase {
	
	@Test
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			after="bundle://org.nasdanika.bank.app/sketches/customer-home-web.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			after="bundle://org.nasdanika.bank.app/sketches/customer-home-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.accounts-summary.navigate-using-header-menu")
	public void navigateToAccountsSummaryUsingHeaderMenu() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}
	
}
