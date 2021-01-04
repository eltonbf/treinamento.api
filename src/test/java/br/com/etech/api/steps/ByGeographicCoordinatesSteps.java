package br.com.etech.api.steps;

import br.com.etech.api.funcionalidades.ByGeographicCoordinatesFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;

public class ByGeographicCoordinatesSteps {
    ByGeographicCoordinatesFuncionalidade byGeographicCoordinatesFuncionalidade = new ByGeographicCoordinatesFuncionalidade();

    @Dado("^recuperar as informações de lat \"([^\"]*)\" lon \"([^\"]*)\"$")
    public void recuperarAsInformaçõesDeLatLon(String arg0, String arg1) {

    }
}
