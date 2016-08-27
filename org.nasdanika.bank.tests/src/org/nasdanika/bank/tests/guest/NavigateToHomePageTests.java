package org.nasdanika.bank.tests.guest;

import java.awt.GraphicsEnvironment;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.nasdanika.bank.ui.driver.actors.Guest;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Link;
import org.nasdanika.webtest.NasdanikaWebTestRunner;
import org.nasdanika.webtest.Pending;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.Title;
import org.nasdanika.webtest.WebTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

@RunWith(NasdanikaWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Title("Navigate to home (landing) page")
@Link(
		type = "Story@urn:org.nasdanika.story", 
		value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.navigate-home")
public class NavigateToHomePageTests implements WebTest<WebDriver> {
	private WebDriver driver;
	
	@Override
	public WebDriver getWebDriver() {
		return driver;
	}
		
	@ActorFactory
	public NasdanikaBankActorFactory actorFactory;

	@Before
	public void setUp() throws Exception {
        driver = GraphicsEnvironment.isHeadless() ? new PhantomJSDriver() : new FirefoxDriver(); // new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	}
	
	@Test
	@Pending
	@Description("Successfully navigates to the home page")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	@Link(
			type = "Scenario@urn:org.nasdanika.story", 
			value = "org.nasdanika.bank.app/Bank.nasdanika_story#guest.navigate-home.successful-navigation")
	public void successfulNavigation() throws Exception {
//		Guest actor = actorFactory.createGuest(getWebDriver());
//		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
//		Assert.assertNotNull(page); // TODO - implement assertions
	}
	
	@After
	public void quitDriver() throws Exception {
		if (driver!=null) {
	        driver.quit();
	        driver = null;
		}
	}

	@Override
	public long getScreenshotDelay() {
		return 0;
	}
	
}
