package org.nasdanika.bank.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.bank.tests.customer.CustomerTests;
import org.nasdanika.bank.tests.guest.GuestTests;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.ResultsModel;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("Nasdanika Bank test report")
@SuiteClasses({
	GuestTests.class, 
	CustomerTests.class})
@ResultsModel(outputDir="../org.nasdanika.bank.tests.results/model")
public class NasdanikaBankTests {
	
}
