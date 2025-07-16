package br.com.reqres.logic;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserLogic {

    public static Response getUsers(int page) {
        return given()
                .log().all()
                .queryParam("page", page)
                .when()
                .get("/users")
                .then()
                .log().all()
                .extract().response();
    }
}
