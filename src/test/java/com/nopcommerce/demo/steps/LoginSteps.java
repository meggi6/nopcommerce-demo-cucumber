package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully and verify the message {string}")
    public void iShouldNavigateToLoginPageSuccessfullyAndVerifyTheMessage(String expectedText) {
        Assert.assertEquals(new LoginPage().getWelcomeText(), expectedText, "welcome text message not display");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String expectedMessage) {
        Assert.assertTrue(new LoginPage().getLoginUnsuccessfulMessage().contains(expectedMessage), "Login Unsuccessful Message Not Displayed");
    }

    @Then("I should login successfully and verify the logout link")
    public void iShouldLoginSuccessfullyAndVerifyTheLogoutLink() {
        Assert.assertTrue(new HomePage().isLogOutLinkAvailable(), "LogOut link is not available");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogout();
    }

    @Then("I should logout successfully and verify the login link")
    public void iShouldLogoutSuccessfullyAndVerifyTheLoginLink() {
        Assert.assertTrue(new HomePage().isLogInLinkAvaible(), "Login link is not available");
    }


}
