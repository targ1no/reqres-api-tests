package br.com.reqres.stepdefinitions;

import br.com.reqres.logic.UserLogic;
import br.com.reqres.models.CreateUser;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class StepsDefinitions {

    private Response response;
    private CreateUser requestBody;

    @Given("I want to list users")
    public void i_want_to_list_users() {
    }

    @When("I send a request to fetch the user list")
    public void i_send_request_to_fetch_user_list() {
        response = UserLogic.getUsers(2);
    }

    @Given("I have a name and job to create a user")
    public void i_have_a_name_and_job_to_create_a_user() {
        requestBody = new CreateUser("Bruna", "QA Engineer");
    }

    @When("I send a POST request to create the user")
    public void i_send_a_post_request_to_create_the_user() {
        response = UserLogic.createUser(requestBody);
    }

    @Then("the response status code should be {int}")
    public void response_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response should contain the name and job")
    public void the_response_should_contain_the_name_and_job() {
        response.then().body("name", equalTo(requestBody.getName()))
                .body("job", equalTo(requestBody.getJob()));
    }
}
