package org.nasdanika.bank.tests;

import java.awt.GraphicsEnvironment;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActor;
import org.nasdanika.bank.ui.driver.pages.NasdanikaBankPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaWebTestRunner;
import org.nasdanika.webtest.Pending;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.WebTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

@RunWith(NasdanikaWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Description("Tests of Nasdanika Bank")
public class NasdanikaBankTest implements WebTest<WebDriver> {
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
	@Description("Test 1")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void testOne() throws Exception {
		NasdanikaBankActor actor = actorFactory.createNasdanikaBankActor(getWebDriver());
		NasdanikaBankPage page = actor.navigateToNasdanikaBankPage();
		Assert.assertNotNull(page); // TODO - implement assertions
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
