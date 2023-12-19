package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement LoginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersPageLink;


    public void clickOnComputersMenu () {
        clickOnElement(computersPageLink);
        log.info("Clicking on computer page link : " + computersPageLink.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(LoginLink);
        log.info("Click on login link : " + LoginLink.toString());
    }

    public void clickOnLogout() {
        clickOnElement(logOutLink);
        log.info("Click on logout link : " + logOutLink.toString());
    }

    public boolean isLogOutLinkAvailable() {
        log.info("Logout link display : " + logOutLink.toString());
        System.out.println("Verifying LogoutLink available or not : " + logOutLink.toString());
        return verifyThatElementIsDisplayed(logOutLink);


    }

    public boolean isLogInLinkAvaible() {
        log.info("Login link display : " + loginLink.toString());
        System.out.println("Verifying LoginLink available or not : " + loginLink.toString());
        return verifyThatElementIsDisplayed(loginLink);

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }



}


