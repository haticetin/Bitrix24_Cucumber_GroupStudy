package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LoginStepDefs {

    Pages pages = new Pages();

    @When("the user logged in as a {string}")
    public void theUserLoggedInAsA(String userType) {
        pages.loginPage().loginAs(userType);
    }

    @And("the user navigate to {string} page and verify on the {string} page")
    public void theUserNavigateToPageAndVerifyOnThePage(String module, String pageTitle) {
        pages.tasksPage().navigateToModule(module);
        Assert.assertEquals("Page title is true, we are on true page!",pages.tasksPage().pageTitle.getText(), pageTitle);
    }


}
