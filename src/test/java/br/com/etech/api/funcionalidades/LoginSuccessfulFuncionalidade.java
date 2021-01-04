package br.com.etech.api.funcionalidades;

import br.com.etech.commons.VariaveisEstaticas;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class LoginSuccessfulFuncionalidade {
    Map<String, String> params = new HashMap<>();

    public void getParamsUsers(){
        params.put("email", "eve.holt@reqres.in");
        params.put("password", "cityslicka");

        VariaveisEstaticas.setRequestBody(params);
    }

    public void requisicaoUsers(){
        Response response =
             given()
                .contentType("application/json; charset=utf-8")
                .body(VariaveisEstaticas.getRequestBody())
             .when()
                .post("https://reqres.in/api/login")
             .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        VariaveisEstaticas.setBody(response.getBody().path("token").toString());
    }
}
