package org.nasdanika.bank.ui.driver.actors.impl;

import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActor;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.openqa.selenium.WebDriver;

class NasdanikaBankActorImpl implements NasdanikaBankActor {

	private NasdanikaBankActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	NasdanikaBankActorImpl(NasdanikaBankActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
	
	@Override		
	@Description("Navigates to NasdanikaBankPage")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public NasdanikaBankPage navigateToNasdanikaBankPage() {
		webDriver.get("http://localhost:8080/nasdanika-bank/router/nasdanika-bank.html");
		NasdanikaBankPage ret = factory.getPageFactory().createNasdanikaBankPage(webDriver);
		
		return ret;
	}

}
