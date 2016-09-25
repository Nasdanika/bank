package org.nasdanika.bank.tests.customer;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.nasdanika.bank.ui.driver.actors.Customer.Account;
import org.nasdanika.bank.ui.driver.actors.Customer.Statement;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.Sketch;

@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details")
public class AccountDetailsTests extends CustomerTestBase {
	
	@Test
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/customer-home-web.png",
			after="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			selector="sketch/web")
	@Sketch(
			before="bundle://org.nasdanika.bank.app/sketches/customer-home-mobile.png",
			after="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.load")
	public void loadAccountDetails() throws Exception {
		List<Account> accounts = getCustomer().getAccounts();
		Random random = new Random();
		Account account = accounts.get(random.nextInt(accounts.size()));
		List<Statement> statements = account.getStatements();
	}

	@Test
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			selector="sketch/web")
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			selector="sketch/mobile")
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.select-statement")
	public void selectStatement() throws Exception {		
//		// Demo of unsupported parameter value.
//		if (getWebDriver() instanceof SketchWebDriver && "sketch/web".equals(((SketchWebDriver) getWebDriver()).getSelector())) {
//			WebTestUtil.ignore();
//		}
		
		List<Account> accounts = getCustomer().getAccounts();
		Random random = new Random();
		Account account = accounts.get(random.nextInt(accounts.size()));
		List<Statement> statements = account.getStatements();
		Statement statement = statements.get(statements.size()-1);
		statement.getTransactions();
	}	
		
}
