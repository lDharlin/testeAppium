package steps;

import org.junit.Assert;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;


public class LoginSteps {
	
	private LoginPage page = new LoginPage();

	@Quando("^inserir email \"([^\"]*)\"$")
	public void insertEmail(String name) {
		page.insertEmail(name);
	}
	
	@Quando("^inserir senha \"([^\"]*)\"$")
	public void insertPassword(String pass) {
		page.insertPassword(pass);
	}

	@Quando("^clicar no botao ENTRAR$")
	public void clickBtnENter() {
		page.clickEnter();
	}
	
	@Entao("^login efetuado com sucesso$")
	public void loginSuccess() {
		Assert.assertTrue(page.loginSuccess());
	}
}
