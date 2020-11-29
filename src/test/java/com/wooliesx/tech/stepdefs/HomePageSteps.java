package com.wooliesx.tech.stepdefs;



import com.wooliesx.tech.datamodel.Product;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;


import com.wooliesx.tech.config.TestConfig;
import com.wooliesx.tech.pages.PageObjectFactory;


import io.cucumber.java8.En;


public class HomePageSteps implements En {
    @Autowired
    PageObjectFactory pageFactory;
    @Autowired
    WebDriver   driver;
    @Autowired
    TestConfig  testConfig;

    @Autowired
    List<Product> productList;


    public HomePageSteps() {
        Given("I navigate to the ecommerce website",
            () -> {
                pageFactory.getHomePage(driver).navigateToEcommerce(testConfig.getURL());
            });
        Given("^I have added  two items to my shopping bag$", () -> {
              pageFactory.getHomePage(driver).addRandomProductsToCart(productList);

        });
        
        When("^I proceed to the check out$", () -> {
            pageFactory.getHomePage(driver).proceedToCheckout();
            assertTrue( pageFactory.getSummaryPage(driver).verifyTotalProductPrice(productList));
            pageFactory.getSummaryPage(driver).proceedToCheckout();
        });


    }
}



