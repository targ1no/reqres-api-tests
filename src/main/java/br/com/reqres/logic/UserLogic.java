package br.com.reqres.logic;

import io.restassured.response.Response;
import br.com.reqres.models.CreateUser;

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

    public static Response createUser(CreateUser user) {
        return given()
                .log().all()
                .header("x-api-key", "reqres-free-v1")
                .body(user)
                .when()
                .post("/users")
                .then()
                .log().all()
                .extract().response();
    }
}
