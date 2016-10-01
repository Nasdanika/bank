package org.nasdanika.bank.ui.driver.actors.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.nasdanika.bank.ui.driver.actors.Customer;
import org.nasdanika.bank.ui.driver.actors.Guest;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.pages.customer.AccountDetails;
import org.nasdanika.bank.ui.driver.pages.customer.Home;
import org.nasdanika.bank.ui.driver.pages.customer.Home.AccountSummary;
import org.nasdanika.bank.ui.driver.pages.customer.Template;
import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

class CustomerImpl implements Customer {

	private NasdanikaBankActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	CustomerImpl(NasdanikaBankActorFactory factory, WebDriver webDriver, org.nasdanika.bank.ui.driver.pages.customer.Home homePage) {
		this.factory = factory;
		this.webDriver = webDriver;
		currentPage = homePage;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
			
	private class AccountImpl implements Account {
		
		private AccountSummary summary;
		private AccountDetails details;

		AccountImpl(AccountSummary summary) {
			this.summary = summary;
		}

		@Override
		public Page<WebDriver> getCurrentPage() {
			return currentPage;
		}

		@Override
		public List<Statement> getStatements() {
			// TODO - analyze if the current details page is the page for this particular account
			// If yes - use data from it, if no - navigate to the customer home and then 
			// Navigate to the details.
			// For now we don't check account number on the details page.
			if (currentPage instanceof Home) {
				details = summary.navigateToDetails();
			}
			
			return details.getStatements().stream().map(s -> new StatementImpl(s)).collect(Collectors.toList());
		}
		
	}
	
	private class StatementImpl implements Statement {
		
		private org.nasdanika.bank.ui.driver.pages.customer.AccountDetails.Statement statement;

		StatementImpl(org.nasdanika.bank.ui.driver.pages.customer.AccountDetails.Statement statement) {
			this.statement = statement;
		}

		@Override
		public Page<WebDriver> getCurrentPage() {
			return currentPage;
		}

		@Override
		public List<Transaction> getTransactions() {
			return statement.select().stream().map(tr -> new TransactionImpl(tr)).collect(Collectors.toList());
		}
		
	}
	
	private class TransactionImpl implements Transaction {
		
		
		private org.nasdanika.bank.ui.driver.pages.customer.AccountDetails.Statement.Transaction transaction;

		public TransactionImpl(org.nasdanika.bank.ui.driver.pages.customer.AccountDetails.Statement.Transaction transaction) {
			this.transaction = transaction;
		}

		@Override
		public Page<WebDriver> getCurrentPage() {
			return CustomerImpl.this.getCurrentPage();
		}
		
	}

	@Override
	public List<Account> getAccounts() {
		return ((Home) currentPage).getAccountSummaries().stream().map(s -> new AccountImpl(s)).collect(Collectors.toList());
	}

	@Override
	public Guest logOut() {
		((Template) currentPage).logOut();
		return new GuestImpl(factory, webDriver);
	}

}
