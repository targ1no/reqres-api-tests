package br.com.reqres.stepdefinitions;

import br.com.reqres.logic.UserLogic;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ListUsersSteps {

    Response response;

    @Given("I want to list users")
    public void i_want_to_list_users() {

    }

    @When("I send a request to fetch the user list")
    public void i_send_request_to_fetch_user_list() {
        response = UserLogic.getUsers(2);
    }

    @Then("the response status code should be {int}")
    public void response_status_code_should_be(Integer statusCode) {
        assertEquals((Integer) response.statusCode(), statusCode);
    }
}
