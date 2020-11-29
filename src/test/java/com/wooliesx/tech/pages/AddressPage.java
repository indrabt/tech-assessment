package com.wooliesx.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BasePage {
    @FindBy(xpath = "//*[@name='processAddress']")
    private WebElement proceedToCheckOut;

    public AddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout() {
        proceedToCheckOut.click();
    }
}



