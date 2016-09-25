package org.nasdanika.bank.ui.driver.pages.customer;

import java.math.BigDecimal;
import java.util.List;

public interface Home extends Template {
	
	interface AccountSummary {
		
		String getLabel();
		
		BigDecimal getBalance();
		
		AccountDetails navigateToDetails();
		
	}
		
	List<AccountSummary> getAccountSummaries();
	
}
