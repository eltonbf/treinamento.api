package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.ZipCodeFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class ZipCodeSteps {

    ZipCodeFuncionalidade zipCodeFuncionalidade = new ZipCodeFuncionalidade();

    @Dado("^recuperar as infomações de zipcode \"([^\"]*)\" da cidade$")
    public void recuperarAsInfomaçõesDeZipcodeDaCidade(String zipcode) {
        this.zipCodeFuncionalidade.getParamsZipcode(zipcode);
    }

    @Quando("^realizar uma requisição GET no serviço pelo ZipCode$")
    public void realizarUmaRequisiçãoGETNoServiçoPeloZipCode() {
        this.zipCodeFuncionalidade.requisicaoZipCode();
    }
}
