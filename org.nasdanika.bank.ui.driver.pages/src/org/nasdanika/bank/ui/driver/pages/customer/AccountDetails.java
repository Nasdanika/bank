package org.nasdanika.bank.ui.driver.pages.customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountDetails extends Template {
	
	interface Statement {
		
		interface Transaction {
			
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
