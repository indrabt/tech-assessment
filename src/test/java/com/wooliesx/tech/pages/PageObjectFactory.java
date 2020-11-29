package com.wooliesx.tech.pages;

import org.openqa.selenium.WebDriver;

import org.springframework.stereotype.Component;

@Component
public class PageObjectFactory {
    public AddressPage getAddressPage(WebDriver driver) {
        return new AddressPage(driver);
    }

    public HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }

    public PaymentPage getPaymentPage(WebDriver driver) {
        return new PaymentPage(driver);
    }

    public ShippingPage getShippingPage(WebDriver driver) {
        return new ShippingPage(driver);
    }

    public SignInPage getSignInPage(WebDriver driver) {
        return new SignInPage(driver);
    }

    public SummaryPage getSummaryPage(WebDriver driver) {
        return new SummaryPage(driver);
    }
}


