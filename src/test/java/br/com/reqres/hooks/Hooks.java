package br.com.reqres.hooks;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

    @Before
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }
}
