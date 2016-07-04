package org.nasdanika.bank.ui.driver.pages.impl;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.ReflectivePageBase;
import org.nasdanika.webtest.Wait;
import org.openqa.selenium.WebDriver;


@Wait(id="button-groups")
public class NasdanikaBankPageImpl extends ReflectivePageBase<WebDriver> implements NasdanikaBankPage {
		
	private NasdanikaBankPageFactoryImpl factory;
	private WebDriver webDriver;	

	public NasdanikaBankPageImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setFactory(NasdanikaBankPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
