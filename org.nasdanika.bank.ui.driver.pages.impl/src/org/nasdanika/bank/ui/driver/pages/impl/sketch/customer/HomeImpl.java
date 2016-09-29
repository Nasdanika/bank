package org.nasdanika.bank.ui.driver.pages.impl.sketch.customer;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.nasdanika.bank.ui.driver.pages.customer.AccountDetails;
import org.nasdanika.bank.ui.driver.pages.customer.Home;
import org.nasdanika.bank.ui.driver.pages.impl.NasdanikaBankPageImpl;
import org.openqa.selenium.WebDriver;

public class HomeImpl extends NasdanikaBankPageImpl implements Home {

	public HomeImpl(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public org.nasdanika.bank.ui.driver.pages.guest.Home logOut() {
		return new org.nasdanika.bank.ui.driver.pages.impl.sketch.guest.HomeImpl(getWebDriver());
	}

	@Override
	public Home goHome() {
		return new HomeImpl(getWebDriver());
	}

	@Override
	public List<AccountSummary> getAccountSummaries() {		
		return Collections.singletonList(new AccountSummary() {
			
			@Override
			public AccountDetails navigateToDetails() {
				return new AccountDetailsImpl(getWebDriver());
			}
			
			@Override
			public String getLabel() {
				return null;
			}
			
			@Override
			public BigDecimal getBalance() {
				return null;
			}
			
		});
	}

}
