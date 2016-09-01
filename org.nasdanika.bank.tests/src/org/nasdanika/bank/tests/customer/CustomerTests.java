package org.nasdanika.bank.tests.customer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;

@RunWith(NasdanikaWebTestSuite.class)
@SuiteClasses({
	AccountsSummaryTests.class, 
	AccountDetailsTests.class,
	SignOutTests.class})
public class CustomerTests {
	
}
