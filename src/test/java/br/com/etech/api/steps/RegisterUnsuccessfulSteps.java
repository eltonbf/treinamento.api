package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.RegisterUnsuccessfulFuncionalidade;
import br.com.etech.commons.VariaveisEstaticas;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class RegisterUnsuccessfulSteps {

    RegisterUnsuccessfulFuncionalidade registerUnsuccessfulFuncionalidade = new RegisterUnsuccessfulFuncionalidade();

    @Dado("^recuperar as informações de um usuario cadastrado$")
    public void recuperarAsInformaçõesDeUmUsuarioCadastrado() {
        this.registerUnsuccessfulFuncionalidade.getParamsUsers();
    }

    @Quando("^realizar a requisição POST no serviço para usuario cadastrado$")
    public void realizarARequisiçãoPOSTNoServiçoParaUsuarioCadastrado() {
        this.registerUnsuccessfulFuncionalidade.requisicaoUsers();
    }

    @Entao("^validar erro no login$")
    public void validarErroNoLogin() {
        Assert.assertNotNull(VariaveisEstaticas.getBody());
    }
}
