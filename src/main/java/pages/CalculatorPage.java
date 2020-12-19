package pages;

import org.openqa.selenium.By;

public class CalculatorPage extends BasePage{

	private By RESULT = By.id("com.google.android.calculator:id/result_final");
	
	public String getResultFinal() {
		return getText(RESULT);
	}
}
