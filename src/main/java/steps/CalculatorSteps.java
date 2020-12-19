package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CalculatorPage;

public class CalculatorSteps {
	
	private CalculatorPage page = new CalculatorPage();

	@Quando("^somar \"([^\"]*)\" com \"([^\"]*)\"$")
	public void somarDoisNumeros(String a, String b) {
		page.clickByText(a);
		page.clickByText("+");
		page.clickByText(b);
		page.clickByText("=");
	}
	
	@Entao("^o resultado e \"([^\"]*)\"$")
	public void validoResultado(String result) {
		page.getResultFinal().equals(result);
	}
	
}
