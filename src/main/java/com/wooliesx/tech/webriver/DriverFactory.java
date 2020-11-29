package com.wooliesx.tech.webriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.reflections.Reflections;

import org.springframework.stereotype.Component;

@Component
public class DriverFactory {
    public WebDriver getInstance(String browserName) throws ReflectiveOperationException {
        if (!System.getProperty("browser").isEmpty()) {
            browserName = System.getProperty("browser");
        }

        List<Class<? extends Driver>> drivers =
            new ArrayList<>(new Reflections(Driver.class.getPackage().getName()).getSubTypesOf(Driver.class));
        String finalBrowserName = browserName;

        return  drivers.stream()
                      .filter(d -> d.getSimpleName().toLowerCase().contains(finalBrowserName.toLowerCase()))
                      .findFirst()
                      .orElseThrow(() -> new RuntimeException("Browser not supported"))
                      .getConstructor()
                      .newInstance()
                      .getDriver();
    
        
        
    }
}


