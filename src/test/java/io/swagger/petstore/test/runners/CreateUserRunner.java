package io.swagger.petstore.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\io.swagger.petstore.features\\CreateUser.feature",
glue = "io.swagger.petstore.test.stepdefinitions",
snippets = SnippetType.CAMELCASE)

public class CreateUserRunner {
}
