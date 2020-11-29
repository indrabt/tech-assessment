package com.wooliesx.tech.stepdefs;

import com.wooliesx.tech.config.TestConfig;
import com.wooliesx.tech.pages.PageObjectFactory;

import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentSteps implements En {

    @Autowired
    PageObjectFactory pageFactory;
    @Autowired
    WebDriver driver;
    @Autowired
    TestConfig testConfig;



    public PaymentSteps(){
        And("^I select a payment method$", () -> {
            pageFactory.getPaymentPage(driver).selectPaymentType();

        });
        And("^I I confirm the order$", () -> {
            pageFactory.getPaymentPage(driver).confirmOrder();
        });
    }

}
