package org.nasdanika.bank.ui.driver.pages.impl.sketch.guest;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.bank.ui.driver.pages.impl.NasdanikaBankPageImpl;
import org.nasdanika.webtest.Sketch;
import org.openqa.selenium.WebDriver;

public class HomeImpl extends NasdanikaBankPageImpl implements org.nasdanika.bank.ui.driver.pages.guest.Home {

	public HomeImpl(WebDriver webDriver) {
		super(webDriver);
	}

	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-web.png",
			after="guest-home-web-login.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/guest-home-mobile.png",
			after="guest-home-mobile-login.png",
			selector="sketch/mobile")	
	@Override
	public void setLogin(String login) {
		// NOP		
	}

	@Sketch(
			after="guest-home-web-password.png",
			selector="sketch/web")
	@Sketch(
			after="guest-home-mobile-password.png",
			selector="sketch/mobile")	
	@Override
	public void setPassword(String password) {
		// NOP		
	}

	@Sketch(
			after="guest-home-web-clickLogInButton.png",
			selector="sketch/web")
	@Sketch(
			after="guest-home-mobile-clickLogInButton.png",
			selector="sketch/mobile")	
	@Override
	public NasdanikaBankPage clickLogInButton() {
		return new org.nasdanika.bank.ui.driver.pages.impl.sketch.customer.HomeImpl(getWebDriver());
	}

	@Override
	public String getLogInErrorMessage() {
		return null;
	}
	
}
