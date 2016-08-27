package org.nasdanika.bank.ui.driver.actors;

import java.util.List;

import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Delegate;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Link;
import org.openqa.selenium.WebDriver;

@Description("Logged-in customer, authenticated principal")
@Link(
		type = "User@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer")

public interface Customer extends Actor<WebDriver> {
	
	/**
	 * A delegate actor for working with the account data.
	 * @author Pavel Vlasov
	 *
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.load")
	@Description("Load account details")
	interface Account extends Actor<WebDriver>, Delegate {
						
		List<Statement> getStatements();
		
		/* TODO - account attributes - balance, next statement closing date, ...
		 *  Maybe a hierarchy of accounts 
		 *  - base,
		 *  - checking - just extends the base, or deposit account interface with checking and savings as sub-interfaces - move to own package and classes in this case.  
		 *  - credit 
		 *    - credit line - total/available, 
		 *    - cash credit line - total/available, 
		 *    - last payment, 
		 *    - last payment date
		 */
		
	}
	
	/**
	 * A delegate actor for working with the statement data.
	 * @author Pavel Vlasov
	 *
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-details.select-statement")
	@Description("Select account statement")
	interface Statement extends Actor<WebDriver>, Delegate {
		
		List<Transaction> getTransactions();
		
	} 
	
	/**
	 * A delegate actor for working with the transaction data.
	 * @author Pavel Vlasov
	 *
	 */
	interface Transaction extends Actor<WebDriver>, Delegate {
		
		
		
	} 
	
	/**
	 * Retrieves a list of customer accounts.
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.account-summary")
	@Description("Retrieve a list of customer accounts")
	List<Account> getAccounts();
	
	/**
	 * Logs out.
	 * @return A guest instance upon successful log-out.
	 * @throws IllegalStateException If log-out fails. 
	 */
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#customer.sign-out")
	@Description("Log out from the system")
	Guest logOut();


}
