package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.RegisterSuccessfulFuncionalidade;
import br.com.etech.commons.VariaveisEstaticas;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.RestAssured;
import org.junit.Assert;

public class RegisterSuccessfulSteps {

    RegisterSuccessfulFuncionalidade registerSuccessfulFuncionalidade = new RegisterSuccessfulFuncionalidade();

    @Dado("^recuperar os parametros de um usuario cadastrado$")
    public void recuperarOsParametrosDeUmUsuarioCadastrado() {
        registerSuccessfulFuncionalidade.getParamsUsers();
    }

    @Quando("^realizar a requisição POST no serviço para usuario ja cadastrado$")
    public void realizarARequisiçãoPOSTNoServiçoParaUsuarioJaCadastrado() {
        registerSuccessfulFuncionalidade.requisicaoUsers();
    }

    @Entao("^validar que o usuario esta cadastrado com sucesso$")
    public void validarQueOUsuarioEstaCadastradoComSucesso() {
        Assert.assertNotNull(VariaveisEstaticas.getBody());
    }
}
