package org.nasdanika.bank.ui.driver.pages.guest;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Link(
		type = "State@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.home-page")
public interface Home extends Template {
	
	void setLogin(String login);
	
	void setPassword(String password);
	
	NasdanikaBankPage clickLogInButton();
	
	String getLogInErrorMessage();

}
