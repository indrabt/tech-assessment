package com.wooliesx.tech.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
    tags="@smoke",
    plugin = { "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
   		},
    glue = {"com.wooliesx.tech.stepdefs"})
public class UITestRunner {
}
