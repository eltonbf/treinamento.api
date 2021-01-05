package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.ByCityIDFuncionalidade;
import br.com.etech.commons.VariaveisEstaticas;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class ByCityIDSteps {

    ByCityIDFuncionalidade byCityIDFuncionalidade = new ByCityIDFuncionalidade();

    @Dado("^recuperar as informações de ID \"([^\"]*)\" da cidade$")
    public void recuperarAsInformaçõesDeIDDaCidade(String id) {
        this.byCityIDFuncionalidade.getParamsByID(id);
    }

    @Quando("^realizar uma requisição GET no serviço pelo ID$")
    public void realizarUmaRequisiçãoGETNoServiçoPeloID() {

        this.byCityIDFuncionalidade.requisicaoByID();
    }



    @Entao("^valido a cidade \"([^\"]*)\" no retorno do serviço$")
    public void validoACidadeNoRetornoDoServiço(String name){
        Assert.assertEquals(name, VariaveisEstaticas.getBody());
    }

}