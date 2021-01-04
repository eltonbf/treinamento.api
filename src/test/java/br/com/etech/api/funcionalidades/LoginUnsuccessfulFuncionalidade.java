package br.com.etech.api.funcionalidades;

import br.com.etech.commons.VariaveisEstaticas;

import java.util.HashMap;
import java.util.Map;

public class LoginUnsuccessfulFuncionalidade {
    Map<String, String> params = new HashMap<>();

    public void getParamsUsers(){
        params.put("email", "peter@klaven");

        VariaveisEstaticas.setRequestBody(params);
    }
}
