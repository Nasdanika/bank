package org.nasdanika.bank.ui.driver.pages;

import org.nasdanika.bank.ui.driver.pages.guest.Home;
import org.openqa.selenium.WebDriver;

public interface NasdanikaBankPageFactory {
	
	/**
	 * Navigates to the guest home page and creates a page instance.
	 * @param webDriver
	 * @return
	 */
	Home navigateToGuestHomePage(WebDriver webDriver);

	/**
	 * Creates a page instance.
	 * @param webDriver
	 * @return
	 */
	Home createGuestHomePage(WebDriver webDriver);
	
}
