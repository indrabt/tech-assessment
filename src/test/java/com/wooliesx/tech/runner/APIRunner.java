package com.wooliesx.tech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/CircuitsAPI.feature",


        plugin = { "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        },
    glue = {"com.wooliesx.tech.stepdefs.api"})
public class APIRunner {
}
