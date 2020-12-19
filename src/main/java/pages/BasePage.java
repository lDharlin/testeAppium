package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickByText(String text) {
		click(By.xpath("//*[@text='"+text+"']"));
	}
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void selectCombo(By by, String option) {
		click(by);
		clickByText(option);
	}
	
	public void write(By by, String text) {
		getDriver().findElement(by).sendKeys("text");
	}

}
