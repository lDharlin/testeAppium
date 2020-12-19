package steps;

import org.junit.After;

import core.DriverFactory;

public class BaseSteps {
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

}
