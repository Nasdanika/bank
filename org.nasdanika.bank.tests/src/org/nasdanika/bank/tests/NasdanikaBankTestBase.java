package org.nasdanika.bank.tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.nasdanika.bank.ui.driver.actors.NasdanikaBankActorFactory;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.NasdanikaParameterizedWebTestRunner;
import org.nasdanika.webtest.WebTest;
import org.nasdanika.webtest.WebTestUtil;
import org.openqa.selenium.WebDriver;

/**
 * Base class for tests. It handles driver creation and release.
 * @author Pavel Vlasov
 *
 */
@RunWith(NasdanikaParameterizedWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class NasdanikaBankTestBase implements WebTest<WebDriver> {
	
	public enum DriverType {
		sketch
//		firefox, 
//		chrome, 
//		ie, 
//		phantomjs 
	} 
	
	public enum ClientType {
		web,
		mobile
	}
		
	@Parameters(name="{index}: {0}")
	public static Collection<Object[]> registrationData() {
		List<Object[]> ret = new ArrayList<>();
		for (DriverType driverType: DriverType.values()) {
			for (ClientType clientType: ClientType.values())
			ret.add(new Object[] { driverType, clientType });
		}
		return ret;
	}
	
	@Parameter(0)
	public DriverType driverType;
	
	@Parameter(1)
	public ClientType clientType;	
	
	@Override
	public WebDriver getWebDriver() {
		return driver;
	}
		
	private WebDriver driver;
		
	@ActorFactory
	public NasdanikaBankActorFactory actorFactory;	

	@Before
	public void setUp() throws Exception {
		switch (driverType) {
		case sketch:
			driver = WebTestUtil.createSketchWebDriver(driverType.name()+"/"+clientType.name());
			break;
//		case firefox:
//	        driver = new FirefoxDriver();
//	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//			break;
//		case phantomjs:
//	        driver = new PhantomJSDriver();
//	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//			break;
		default:
			fail("Unsupported driver type: ");		
		}
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
