package com.wooliesx.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BasePage {
	
    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement termsAndConditions;
    @FindBy(xpath = "//form[@id='form']//button[@name='processCarrier']/span")
    private WebElement proceedToCheckout;

    public ShippingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void acceptTermsAndCondition() {
        termsAndConditions.click();
    }

    public void proceedToCheckout() {
        proceedToCheckout.click();
    }
}



