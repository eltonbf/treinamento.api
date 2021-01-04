package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.LoginSuccessfulFuncionalidade;
import br.com.etech.commons.VariaveisEstaticas;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class LoginSuccessfulSteps {

    LoginSuccessfulFuncionalidade loginSuccessfulFuncionalidade = new LoginSuccessfulFuncionalidade();

    @Dado("^recuperar informações de um usuario cadastrado$")
    public void recuperarInformaçõesDeUmUsuarioCadastrado() {
        this.loginSuccessfulFuncionalidade.getParamsUsers();
    }

    @Quando("^realizar requisição POST para usuario cadastrado$")
    public void realizarRequisiçãoPOSTParaUsuarioCadastrado() {
        this.loginSuccessfulFuncionalidade.requisicaoUsers();
    }

    @Entao("^validar login com sucesso$")
    public void validarLoginComSucesso() {
        Assert.assertNotNull(VariaveisEstaticas.getBody());
    }
}
