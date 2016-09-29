package org.nasdanika.bank.ui.driver.pages.impl.sketch.guest;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.bank.ui.driver.pages.impl.NasdanikaBankPageImpl;
import org.openqa.selenium.WebDriver;

public class HomeImpl extends NasdanikaBankPageImpl implements org.nasdanika.bank.ui.driver.pages.guest.Home {

	public HomeImpl(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public void setLogin(String login) {
		// NOP		
	}

	@Override
	public void setPassword(String password) {
		// NOP		
	}

	@Override
	public NasdanikaBankPage clickLogInButton() {
		return new org.nasdanika.bank.ui.driver.pages.impl.sketch.customer.HomeImpl(getWebDriver());
	}

	@Override
	public String getLogInErrorMessage() {
		return null;
	}
	
}
