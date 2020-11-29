package com.wooliesx.tech.webriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public interface Driver {

    Capabilities getCapabilities();
    WebDriver getDriver();
}
