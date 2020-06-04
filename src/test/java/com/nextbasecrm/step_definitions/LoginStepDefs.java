package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enter the {string} information")
    public void the_user_enter_the_information(String userType) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
       LoginPage loginPage = new LoginPage();

    }


    @When("smoke it")
    public void smoke_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
