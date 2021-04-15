package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import pages.BasePage;

public class BaseSteps {
	
	private BasePage page = new BasePage();
	
	@Before
	public void before() {
		page.clickByText("SeuBarriga Nativo");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		screenshot(scenario.getName());
		DriverFactory.killDriver();
	}
	
	public void screenshot(String imgName) {
		File img = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(img, new File("target/screenshots/" + imgName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
