package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationConfirmationMessage;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequiredMessage;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequiredMessage;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequiredMessage;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordRequiredMessage;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordRequiredMessage;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleGenderRadioButton;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropDownInDateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropDownInDateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropDownInDateOfBirth;

    /******************************** All Elements' Action Methods on Register page *************************************/

    public String getWelcomeText() {
        log.info("Getting welcome message : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void sendDataToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Sending text to firstname field : " + firstNameField.toString());
    }

    public void sendDataToLastNameField(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Sending text to lastname field : " + lastNameField.toString());
    }

    public void sendDataToEmailField(String email) {
        sendTextToElement(emailField, email);
        log.info("Sending text to email field : " + emailField.toString());
    }

    public void sendDataToPasswordField(String password) {
        sendTextToElement(passwordField, password);
        log.info("Sending text to password field : " + passwordField.toString());
    }

    public void sendDataToConfirmPasswordField(String cPassword) {
        sendTextToElement(confirmPasswordField, cPassword);
        log.info("Sending text to confirm password field : " + confirmPasswordField.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on register button : " + registerButton.toString());
    }

    public String getDataFromConfirmationMessage() {
        log.info("Getting text from confirmation message : " + registrationConfirmationMessage.toString());
        return getTextFromElement(registrationConfirmationMessage);
    }

    public String getFirstNameRequiredMessage() {
        log.info("Getting error message for firstname field : " + firstNameRequiredMessage.toString());
        return getTextFromElement(firstNameRequiredMessage);
    }

    public String getLastNameRequiredMessage() {
        log.info("Getting error message for lastname field : " + lastNameRequiredMessage.toString());
        return getTextFromElement(lastNameRequiredMessage);
    }

    public String getEmailRequiredMessage() {
        log.info("Getting error message for email field : " + emailRequiredMessage.toString());
        return getTextFromElement(emailRequiredMessage);
    }

    public String getPasswordRequiredMessage() {
        log.info("Getting error message for password field : " + passwordRequiredMessage.toString());
        return getTextFromElement(passwordRequiredMessage);
    }

    public String getConfirmPasswordRequiredMessage() {
        log.info("Getting error message for conform password field : " + confirmPasswordRequiredMessage.toString());
        return getTextFromElement(confirmPasswordRequiredMessage);
    }

    public void clickOnFemaleGenderRadioButton() {
        clickOnElement(femaleGenderRadioButton);
        log.info("Clicking on male radio button : " + femaleGenderRadioButton.toString());
    }

    public void selectDate(String date) {
        selectByVisibleTextFromDropDown(dayDropDownInDateOfBirth, date);
        log.info("Selecting day for DOB : " + dayDropDownInDateOfBirth.toString());
    }

    public void selectMonth(String month) {
        selectByVisibleTextFromDropDown(monthDropDownInDateOfBirth, month);
        log.info("Selecting month for DOB : " + monthDropDownInDateOfBirth.toString());
    }

    public void selectYear(String year) {
        selectByVisibleTextFromDropDown(yearDropDownInDateOfBirth, year);
        log.info("Selecting year for DOB : " + yearDropDownInDateOfBirth.toString());
    }
}




