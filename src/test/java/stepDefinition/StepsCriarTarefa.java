package stepDefinition;

import java.util.Map;

import org.junit.Assert;

import actions.ActionsCriarTarefa;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class StepsCriarTarefa {
	ActionsCriarTarefa actionsCriarTarefa = new ActionsCriarTarefa();

	@Quando("crio uma nova tarefa")
	public void crio_uma_nova_tarefa(Map<String, String> map) {
		actionsCriarTarefa.preencherFormulario(map);
	}

	@Então("vejo que a tarefa foi criada")
	public void vejo_que_a_tarefa_foi_criada() {
		Assert.assertTrue(actionsCriarTarefa.validarCriacaoTarefa());
	}
	
	@Então("vejo que a tarefa não foi criada")
	public void vejo_que_a_tarefa_não_foi_criada() {
		Assert.assertTrue(actionsCriarTarefa.validarErroTarefa());

	}

}
