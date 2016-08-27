package org.nasdanika.bank.ui.driver.actors;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPageFactory;
import org.openqa.selenium.WebDriver;

public interface NasdanikaBankActorFactory {
	
	NasdanikaBankPageFactory getPageFactory();
	
	Guest createGuest(WebDriver webDriver);

}
