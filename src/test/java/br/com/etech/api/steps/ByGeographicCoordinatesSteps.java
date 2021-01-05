package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.ByGeographicCoordinatesFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class ByGeographicCoordinatesSteps {
    ByGeographicCoordinatesFuncionalidade byGeographicCoordinatesFuncionalidade = new ByGeographicCoordinatesFuncionalidade();

    @Dado("^recuperar as informações de lat \"([^\"]*)\" lon \"([^\"]*)\"$")
    public void recuperarAsInformaçõesDeLatLon(String lat, String lon) {
        this.byGeographicCoordinatesFuncionalidade.getParamsCoordinates(lat, lon);
    }

    @Quando("^realizar uma requisição GET no serviço pelas coordenadas$")
    public void realizarUmaRequisiçãoGETNoServiçoPelasCoordenadas() {
        this.byGeographicCoordinatesFuncionalidade.requisicaoCoord();
    }
}
