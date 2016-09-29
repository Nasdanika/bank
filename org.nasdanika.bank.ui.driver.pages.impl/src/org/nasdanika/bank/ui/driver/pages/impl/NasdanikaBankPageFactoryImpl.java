package org.nasdanika.bank.ui.driver.pages.impl;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPageFactory;
import org.nasdanika.bank.ui.driver.pages.guest.Home;
import org.nasdanika.webtest.SketchWebDriver;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class NasdanikaBankPageFactoryImpl implements NasdanikaBankPageFactory {

	private String baseURL;
	
	public void activate(ComponentContext context) {
		baseURL = (String) context.getProperties().get("base-url");
		System.out.println("Page factory component activated with base URL '"+baseURL+"'");
	}
	
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

	@Override
	public Home navigateToGuestHomePage(WebDriver webDriver) {
		if (!(webDriver instanceof SketchWebDriver)) {
			webDriver.get(getBaseURL());			
		} 

		return createGuestHomePage(webDriver);
	}

	@Override
	public Home createGuestHomePage(WebDriver webDriver) {
		if (webDriver instanceof SketchWebDriver) {
			return new org.nasdanika.bank.ui.driver.pages.impl.sketch.guest.HomeImpl(webDriver);
		}
		
		throw new UnsupportedOperationException();
	}

}
