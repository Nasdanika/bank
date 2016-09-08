package org.nasdanika.bank.tests.guest;

import org.junit.Test;
import org.nasdanika.bank.tests.NasdanikaBankTestBase;
import org.nasdanika.webtest.Category;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Pending;
import org.nasdanika.webtest.Title;

@Title("Register (Sign-up)")
@Category("Guest")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.sign-up")
public class RegisterTests extends NasdanikaBankTestBase {
	
	@Test
	@Pending
	@Description("Tests successful registration")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.sign-up.successful-registration")
	public void successfulRegistration() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}
		
}
