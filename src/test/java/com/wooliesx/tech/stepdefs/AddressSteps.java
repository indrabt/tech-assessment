package com.wooliesx.tech.stepdefs;

import com.wooliesx.tech.config.TestConfig;
import com.wooliesx.tech.pages.PageObjectFactory;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;



public class AddressSteps implements En {

    @Autowired
    PageObjectFactory pageFactory;
    @Autowired
    WebDriver driver;
    @Autowired
    TestConfig testConfig;

    public AddressSteps() {

        And("^I select my address$", () -> {
            pageFactory.getAddressPage(driver).proceedToCheckout();
        });

    }

}
