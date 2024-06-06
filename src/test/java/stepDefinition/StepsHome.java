package stepDefinition;

import actions.ActionsHome;
import io.cucumber.java.pt.Dado;

public class StepsHome {
	ActionsHome actionsHome = new ActionsHome();

	@Dado("esteja na tela de criação de tarefa")
	public void esteja_na_tela_de_criação_de_tarefa() {
		actionsHome.acessarCriarTarefa();
	}
}
