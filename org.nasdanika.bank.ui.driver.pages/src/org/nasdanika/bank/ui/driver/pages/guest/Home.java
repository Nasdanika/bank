package org.nasdanika.bank.ui.driver.pages.guest;

import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;

public interface Home extends Template {
	
	void setLogin(String login);
	
	void setPassword(String password);
	
	NasdanikaBankPage clickLogInButton();
	
	String getLogInErrorMessage();

}
