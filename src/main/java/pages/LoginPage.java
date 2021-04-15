package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

	private By INPUT_NOME = By.xpath("//android.widget.EditText[1]");
	private By INPUT_SENHA = By.xpath("//android.widget.EditText[2]");
	
	public void insertEmail(String name) {
		write(INPUT_NOME, name);
	}
	
	public void insertPassword(String pass) {
		write(INPUT_SENHA, pass);
	}
	
	public void clickEnter() {
		clickByText("ENTRAR");
	}
	
	public boolean loginSuccess() {
		
		return true;
	}
}
