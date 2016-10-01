package org.nasdanika.bank.ui.driver.pages.customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

@Link(
		type = "State@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.accounts-summary")
public interface AccountDetails extends Template {
	
	interface Statement extends Page<WebDriver> {
		
		interface Transaction extends Page<WebDriver> {
			
			Date getDate();
			String getDescription();
			BigDecimal getAmount();
			BigDecimal getRunningBalance();
			
		}
		
		String getLabel();
		
		List<Transaction> select();
		
	}
	
	List<Statement> getStatements();

}
