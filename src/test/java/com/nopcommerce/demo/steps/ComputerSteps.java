package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer menu")
    public void iClickOnComputerMenu() {
        new HomePage().clickOnComputersMenu();
    }

    @Then("I should navigate to computer page successfully and verify the text {string}")
    public void iShouldNavigateToComputerPageSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new ComputerPage().getWelcomeText(), expectedMessage);
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should navigate to desktops page successfully and verify the text {string}")
    public void iShouldNavigateToDesktopsPageSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new DesktopPage().getWelcomeText(), expectedMessage);
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnComputerLink();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFieldDropDownOption(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String RAM) {
        new BuildYourOwnComputerPage().selectRAMFieldDropDownOption(RAM);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String OS) {
        new BuildYourOwnComputerPage().selectOS(OS);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should get product added successfully message {string}")
    public void iShouldGetProductAddedSuccessfullyMessage(String expectedMessage) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(), expectedMessage);
    }
}
