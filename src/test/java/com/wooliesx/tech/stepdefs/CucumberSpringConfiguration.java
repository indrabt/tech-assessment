package com.wooliesx.tech.stepdefs;




import com.wooliesx.tech.config.SpringConfig;
import com.wooliesx.tech.datamodel.DataModelBeans;
import com.wooliesx.tech.pages.PagesBeans;

import io.cucumber.java.en.Given;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;



@ContextConfiguration(classes = {SpringConfig.class,PagesBeans.class, DataModelBeans.class})
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
@ComponentScan({"com.wooliesx.tech"})
public class CucumberSpringConfiguration {

    @Given("^Necessary for triggering Spring context boot$")
    public void bootSpringContext() throws Exception {
        System.out.println("");
    }
}

