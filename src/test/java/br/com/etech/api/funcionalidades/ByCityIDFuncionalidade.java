package br.com.etech.api.funcionalidades;

import br.com.etech.commons.PropertiesManager;
import br.com.etech.commons.VariaveisEstaticas;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class ByCityIDFuncionalidade {

    public void getParamsByID(String id){
        Map<String, String> params = new HashMap<>();
        params.put("id", id);
        params.put("appid", PropertiesManager.getPropertiesValue("TOKEN"));

        VariaveisEstaticas.setParams(params);
    }

    public void requisicaoByID(){
        Response response =
                given()
                    .pathParams(VariaveisEstaticas.getParams())
                .when()
                    .get("https://api.openweathermap.org/data/2.5/weather?id={id}&appid={appid}")
                .then()
                    .log().all()
                    .statusCode(200)
                    .extract().response();

        VariaveisEstaticas.setBody(response.getBody().path("name").toString());

    }

}
