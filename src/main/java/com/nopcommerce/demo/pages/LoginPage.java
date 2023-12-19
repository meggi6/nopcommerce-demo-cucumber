package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginUnsuccessfulMessage;

    public String getWelcomeText() {
        log.info("Getting welcome text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email : " + emailField.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + passwordField.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public String getLoginUnsuccessfulMessage() {
        log.info("Getting login unsuccessful message : " + loginUnsuccessfulMessage.toString());
        return getTextFromElement(loginUnsuccessfulMessage);
    }


}
