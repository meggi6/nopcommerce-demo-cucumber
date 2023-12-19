package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']//h1")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> hDDRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> oSRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")
    List<WebElement> softwareCheckBoxes;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class= 'content']")
    WebElement productAddeMessage;


    public String getProductNameText() {
        String message = getTextFromElement(productNameText);
        log.info("Getting product name text : " + productNameText.toString());
         return message;
    }

    public void selectProcessorFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(processor, option);
        log.info("Selecting processor of build your own computer : " + processor.toString());

    }

    public void selectRAMFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(ram, option);
        log.info("Selecting RAM of build your own computer : " + ram.toString());
         }

    public void selectHDD(String hDdGB) {
        for (WebElement hdd : hDDRadios) {
            if (hdd.getText().equals(hDdGB)) {
                clickOnElement(hdd);
                 break;
            }
            log.info("Selecting HDDRadios of build your own computer : " + hdd.toString());

        }
    }

    public void selectOS(String oSName) {
        for (WebElement os : oSRadios) {
            if (os.getText().equals(oSName)) {
                clickOnElement(os);
                 break;
            }
            log.info("Selecting oSRadios of build your own computer : " + os.toString());
        }
    }

    public void selectSoftware(String softwareName) {
        for (WebElement software : softwareCheckBoxes) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                 break;
            }
            log.info("Selecting software of build your own computer : " + software.toString());
        }
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
        log.info("Clicking on add to cart button : " + addToCartBtn.toString());
          }

    public String getProductAddedMessage() {
        log.info("Getting Add to cart success message : " + productAddeMessage.toString());
        return getTextFromElement(productAddeMessage);
    }
}
