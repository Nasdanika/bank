package org.nasdanika.bank.ui.driver.actors;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

@Description("Nasdanika Bank Actor")
public interface NasdanikaBankActor extends Actor<WebDriver> {
	
	@Description("Navigates to NasdanikaBankPage")
	NasdanikaBankPage navigateToNasdanikaBankPage();

}
