package org.nasdanika.bank.tests.guest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("Guest tests")
@SuiteClasses({
	NavigateToHomePageTests.class, 
	RegisterTests.class,
	LogInTests.class})
@Link(
		type = "User@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest")

public class GuestTests {
	
}
