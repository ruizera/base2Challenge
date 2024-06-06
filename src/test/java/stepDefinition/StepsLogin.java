package stepDefinition;

import actions.ActionsLogin;
import io.cucumber.java.pt.Dado;

public class StepsLogin {
	ActionsLogin actionsLogin = new ActionsLogin();
	
	@Dado("que eu esteja logado no sistema")
	public void que_eu_esteja_na_página_inicial() throws InterruptedException {
		actionsLogin.LogarAplicacao();
	}
}
