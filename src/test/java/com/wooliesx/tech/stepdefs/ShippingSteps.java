package com.wooliesx.tech.stepdefs;

import com.wooliesx.tech.config.TestConfig;
import com.wooliesx.tech.pages.PageObjectFactory;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class ShippingSteps implements En {

    @Autowired
    PageObjectFactory pageFactory;
    @Autowired
    WebDriver driver;
    @Autowired
    TestConfig testConfig;

    public ShippingSteps(){
        And("^I select Terms and condition$", () -> {
            pageFactory.getShippingPage(driver).acceptTermsAndCondition();
            pageFactory.getShippingPage(driver).proceedToCheckout();

        });

    }

}
