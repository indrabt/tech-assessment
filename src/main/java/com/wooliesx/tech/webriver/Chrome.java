package com.wooliesx.tech.webriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements Driver {
    @Override
    public ChromeOptions getCapabilities() {
        return new ChromeOptions();
    }

    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver(getCapabilities());
    }
}

