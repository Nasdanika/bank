package org.nasdanika.bank.ui.driver.pages.guest;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Link(
		type = "State@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.home-page")
public interface Home extends Template {
	
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-web.png",
			after="guest-home-web-login.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-mobile.png",
			after="guest-home-mobile-login.png",
			selector="sketch/mobile")	
	void setLogin(String login);
	
	@Sketch(
			after="guest-home-web-password.png",
			selector="sketch/web")
	@Sketch(
			after="guest-home-mobile-password.png",
			selector="sketch/mobile")	
	void setPassword(String password);
	
	@Sketch(
			after="guest-home-web-clickLogInButton.png",
			selector="sketch/web")
	@Sketch(
			after="guest-home-mobile-clickLogInButton.png",
			selector="sketch/mobile")	
	NasdanikaBankPage clickLogInButton();
	
	String getLogInErrorMessage();

}
