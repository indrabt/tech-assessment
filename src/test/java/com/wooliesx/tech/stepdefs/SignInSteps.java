package com.wooliesx.tech.stepdefs;



import com.wooliesx.tech.datamodel.Address;
import com.wooliesx.tech.datamodel.Customer;



import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;


import com.wooliesx.tech.config.TestConfig;
import com.wooliesx.tech.pages.PageObjectFactory;


import io.cucumber.java8.En;



public class SignInSteps implements En {
	
    @Autowired
    PageObjectFactory pageFactory;
    
    @Autowired
    WebDriver   driver;
    
    @Autowired
    TestConfig  testConfig;

    @Autowired
    Customer customer;

    @Autowired
    Address address;


    public SignInSteps() {
        And("^I sign in the into the website$", () -> {
            pageFactory.getSignInPage(driver).enterUserCredential(testConfig.getEmailID(),testConfig.getDefaultPassword());

        });
        And("^I create my account$", () -> {

            pageFactory.getSignInPage(driver).createNewUserAccount(customer,address);
        });


    }
}



