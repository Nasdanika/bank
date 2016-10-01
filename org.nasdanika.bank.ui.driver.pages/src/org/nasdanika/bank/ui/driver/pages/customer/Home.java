package org.nasdanika.bank.ui.driver.pages.customer;

import java.math.BigDecimal;
import java.util.List;

import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

@Link(
		type = "State@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.accounts-summary")
public interface Home extends Template {
	
	interface AccountSummary extends Page<WebDriver> {
		
		String getLabel();
		
		BigDecimal getBalance();
		
		AccountDetails navigateToDetails();
		
	}
		
	List<AccountSummary> getAccountSummaries();
	
}
