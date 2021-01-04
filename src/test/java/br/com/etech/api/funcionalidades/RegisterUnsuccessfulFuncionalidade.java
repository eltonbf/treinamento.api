package br.com.etech.api.funcionalidades;

import br.com.etech.commons.VariaveisEstaticas;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class RegisterUnsuccessfulFuncionalidade {

    Map<String, String> params = new HashMap<>();

    public void getParamsUsers(){
        params.put("email", "sydney@fife");

        VariaveisEstaticas.setRequestBody(params);
    }

    public void requisicaoUsers(){
        Response response =
             given()
                //.contentType("application/json; charset=utf-8")
                .contentType(ContentType.JSON)
                .body(VariaveisEstaticas.getRequestBody())
             .when()
                .post("https://reqres.in/api/register")
             .then()
                .log().all()
                .statusCode(400)
                .extract().response();
        VariaveisEstaticas.setBody(response.getBody().path("error").toString());
    }

}
