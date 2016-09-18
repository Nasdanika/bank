package org.nasdanika.bank.tests.guest;

import org.junit.Test;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.webtest.Category;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;
import org.nasdanika.webtest.Title;

@Title("Log-in")
@Category("Guest")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.log-in")
public class LogInTests extends NasdanikaBankTestBase {
	
	@Test
	@Title("Successful log-in")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-web.png",
			after="bundle://org.nasdanika.bank.app/sketches/customer-home-web.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-mobile.png",
			after="bundle://org.nasdanika.bank.app/sketches/customer-home-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.log-in.successful-login")
	public void successfulLogIn() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}
		
}
