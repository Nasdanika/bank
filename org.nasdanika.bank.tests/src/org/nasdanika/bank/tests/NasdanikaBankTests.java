package org.nasdanika.bank.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.ResultsModel;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("Nasdanika Bank test report")
@SuiteClasses({NasdanikaBankTest.class, NasdanikaBankRouteTest.class})
@ResultsModel(outputDir="../org.nasdanika.bank.tests.results/model")
public class NasdanikaBankTests {
	
}
