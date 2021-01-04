package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.LoginUnsuccessfulFuncionalidade;
import cucumber.api.java.pt.Dado;

public class LoginUnsuccessfulStep {

    LoginUnsuccessfulFuncionalidade loginUnsuccessfulFuncionalidade = new LoginUnsuccessfulFuncionalidade();

    @Dado("^recuperar informações de um usuario não cadastrado$")
    public void recuperarInformaçõesDeUmUsuarioNãoCadastrado() {
        this.loginUnsuccessfulFuncionalidade.getParamsUsers();
    }
}
