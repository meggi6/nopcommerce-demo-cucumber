package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully and verify the text {string}")
    public void iShouldNavigateToRegisterPageSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getWelcomeText(),expectedMessage);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should get error message for first name required {string}")
    public void iShouldGetErrorMessageForFirstNameRequired(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequiredMessage(), expectedMessage);
    }

    @And("I should get error message for last name required {string}")
    public void iShouldGetErrorMessageForLastNameRequired(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getLastNameRequiredMessage(), expectedMessage);
    }

    @And("I should get error message for email required {string}")
    public void iShouldGetErrorMessageForEmailRequired(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getEmailRequiredMessage(), expectedMessage);
    }

    @And("I should get error message for password required {string}")
    public void iShouldGetErrorMessageForPasswordRequired(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getPasswordRequiredMessage(), expectedMessage);
    }

    @And("I should get error message for confirm password required {string}")
    public void iShouldGetErrorMessageForConfirmPasswordRequired(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordRequiredMessage(), expectedMessage);
    }

    @And("I click on radio button against female")
    public void iClickOnRadioButtonAgainstFemale() {
        new RegisterPage().clickOnFemaleGenderRadioButton();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().sendDataToFirstNameField(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().sendDataToLastNameField(lastName);
    }

    @And("I select day for DOB {string}")
    public void iSelectDayForDOB(String day) {
        new RegisterPage().selectDate(day);
    }

    @And("I select month for DOB {string}")
    public void iSelectMonthForDOB(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year for DOB {string}")
    public void iSelectYearForDOB(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter email for registration")
    public void iEnterEmailForRegistration() {
        Random random = new Random();
        new RegisterPage().sendDataToEmailField("abc" + random.nextInt() + "@gmail.com");
    }

    @And("I enter password for registration {string}")
    public void iEnterPasswordForRegistration(String password) {
        new RegisterPage().sendDataToPasswordField(password);
    }

    @And("I enter confirm password for registration {string}")
    public void iEnterConfirmPasswordForRegistration(String confirmPassword) {
        new RegisterPage().sendDataToConfirmPasswordField(confirmPassword);
    }

    @And("I click on register for registration")
    public void iClickOnRegisterForRegistration() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should get registration completion message {string}")
    public void iShouldGetRegistrationCompletionMessage(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getDataFromConfirmationMessage(), expectedMessage);
    }
}
