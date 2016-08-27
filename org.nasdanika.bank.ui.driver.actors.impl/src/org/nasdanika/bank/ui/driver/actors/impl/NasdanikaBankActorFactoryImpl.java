package org.nasdanika.bank.ui.driver.actors.impl;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPageFactory;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.actors.Guest;
import org.nasdanika.webtest.WebTestUtil;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class NasdanikaBankActorFactoryImpl implements NasdanikaBankActorFactory {

	private NasdanikaBankPageFactory pageFactory;

	public void setPageFactory(NasdanikaBankPageFactory pageFactory) {
		this.pageFactory = WebTestUtil.proxyPageFactory(pageFactory);
	}

	@Override
	public Guest createGuest(WebDriver webDriver) {
//		return new NasdanikaBankActorImpl(this, webDriver);
		throw new UnsupportedOperationException();
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("Nasdanika Bank Actor Factory Component activated");
	}

	@Override
	public NasdanikaBankPageFactory getPageFactory() {
		return pageFactory;
	}

}
