package org.nasdanika.bank.ui.driver.pages.impl;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPageFactory;
import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.openqa.selenium.WebDriver;
import org.nasdanika.webtest.WebTestUtil;
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
	
	@Override
	public NasdanikaBankPage createNasdanikaBankPage(WebDriver webDriver) {
		NasdanikaBankPageImpl ret = WebTestUtil.initElements(webDriver, NasdanikaBankPageImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

}
