package org.nasdanika.bank.ui.driver.pages.impl.sketch.customer;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.nasdanika.bank.ui.driver.pages.customer.AccountDetails;
import org.nasdanika.bank.ui.driver.pages.impl.NasdanikaBankPageImpl;
import org.nasdanika.webtest.Sketch;
import org.openqa.selenium.WebDriver;

class AccountDetailsImpl extends NasdanikaBankPageImpl implements AccountDetails {

	AccountDetailsImpl(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public org.nasdanika.bank.ui.driver.pages.guest.Home logOut() {
		return new org.nasdanika.bank.ui.driver.pages.impl.sketch.guest.HomeImpl(getWebDriver());
	}

	@Override
	public org.nasdanika.bank.ui.driver.pages.customer.Home goHome() {
		return new HomeImpl(getWebDriver());
	}

	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-web.png",
			selector="sketch/web")
	@Sketch(
			after="bundle://org.nasdanika.bank.app/sketches/account-details-mobile.png",
			selector="sketch/mobile")
	@Override
	public List<Statement> getStatements() {
		return Collections.singletonList(new Statement() {

			@Override
			public String getLabel() {
				return null;
			}

			@Sketch(
					after="account-details-select-statement-web.png",
					selector="sketch/web")
			@Sketch(
					after="account-details-select-statement-mobile.png",
					selector="sketch/mobile")
			@Override
			public List<Transaction> select() {
				return Collections.singletonList(new Transaction() {

					@Override
					public Date getDate() {
						return null;
					}

					@Override
					public String getDescription() {
						return null;
					}

					@Override
					public BigDecimal getAmount() {
						return null;
					}

					@Override
					public BigDecimal getRunningBalance() {
						return null;
					}

					@Override
					public WebDriver getWebDriver() {
						return AccountDetailsImpl.this.getWebDriver();
					}

					@Override
					public List<Field> webElements() {
						return Collections.emptyList();
					}
					
				});
			}

			@Override
			public WebDriver getWebDriver() {
				return AccountDetailsImpl.this.getWebDriver();
			}

			@Override
			public List<Field> webElements() {
				return Collections.emptyList();
			}
			
		});
	}

}
