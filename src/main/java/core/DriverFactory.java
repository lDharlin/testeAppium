package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;

	private static AndroidDriver<MobileElement> initialize() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiAutomator2");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("app", "C:\\Users\\Windows 10\\Documents\\CTAppium_1_2.apk");
		//capabilities.setCapability("appPackage", "");
		//capabilities.setCapability("appActivity", "");
		
		driver= new AndroidDriver<MobileElement>(new URL("http", "127.0.0.1", 4723, "/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static AndroidDriver<MobileElement> getDriver(){
		if(driver == null)
			try {
				initialize();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		return driver;
	}

	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
