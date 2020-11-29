package com.wooliesx.tech.webriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox implements Driver {
    @Override
    public FirefoxOptions getCapabilities() {
        return new FirefoxOptions();
    }

    @Override
    public WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();

        return new FirefoxDriver(getCapabilities());
    }
}


