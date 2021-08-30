package io.swagger.petstore.test.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.eo.Se;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.util.Map;

public class CreateUserStepDefinitions {

    //Service #1 Create User

    @Given("^A user send the request to create a new user in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToCreateANewUserInTheEndpoint(String url, Map<String, String> body) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(body).post();
        SerenityRest.lastResponse().then().log().all();
    }

    @Then("^Validate that the status code is (\\d+)$")
    public void validateThatTheStatusCodeIs(int statusCode) {
        SerenityRest.lastResponse().then().statusCode(statusCode);
    }

    @And("^Validate that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseContainsTheKeyMustBe(String type, String typeStatus) {
        SerenityRest.lastResponse().then().body(type, Matchers.equalTo(typeStatus));
    }

    @And("^Validate that the response  \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseMustBe(String message, String messageStatus) {
        SerenityRest.lastResponse().then().body(message, Matchers.equalTo(messageStatus));

    }


    //Service #2 Place an order for a pet


    @Given("^A user send the request to place an order for pet in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToPlaceAnOrderForPetInTheEndpoint(String url, Map<String, String> body) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(body).post();
        SerenityRest.lastResponse().then().log().all();
    }

    @Then("^Validate in the response that the status code is (\\d+)$")
    public void validateInTheResponseThatTheStatusCodeIs(int statusCode) {
        SerenityRest.lastResponse().then().statusCode(statusCode);
    }

    @Then("^Validate in the response that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateInTheResponseThatTheResponseContainsTheKeyMustBe(String status, String expectedStatus) {
        SerenityRest.lastResponse().then().body(status, Matchers.equalTo(expectedStatus));
    }

    @Then("^Validate in the response that the response  \"([^\"]*)\" must be true$")
    public void validateInTheResponseThatTheResponseMustBeTrue(String complete) {
        SerenityRest.lastResponse().then().body(complete, Matchers.equalTo(true));

    }



}
