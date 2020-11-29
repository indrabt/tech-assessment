package com.wooliesx.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {
    @FindBy(css = "#total_product")
    private WebElement totalProductPrice;
    @FindBy(css = "#total_shipping")
    private WebElement totalShippingPrice;
    @FindBy(css = "#total_price")
    private WebElement totalPrice;
    @FindBy(css = "a[title='Pay by bank wire'] > span")
    private WebElement payByBank;
    @FindBy(xpath = "//*[@id='cart_navigation']/button/span[text()='I confirm my order']")
    private WebElement confirmOrder;

    public PaymentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void confirmOrder() {
        confirmOrder.click();
    }

    public PaymentPage selectPaymentType() {
        payByBank.click();

        return this;
    }
}


