package org.nasdanika.bank.tests.guest;

import org.junit.Test;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.webtest.Category;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.Sketch;
import org.nasdanika.webtest.Title;

@Title("Navigate to home (landing) page")
@Category("Guest")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.navigate-home")
public class NavigateToHomePageTests extends NasdanikaBankTestBase {
	
	@Test
	@Description("Successfully navigates to the home page")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/guest-home-web.png",
			selector="sketch/web")
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/guest-home-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.navigate-home.successful-navigation")
	public void successfulNavigation() throws Exception {
		actorFactory.createGuest(getWebDriver()).navigateToHomePage();
	}	
	
}
