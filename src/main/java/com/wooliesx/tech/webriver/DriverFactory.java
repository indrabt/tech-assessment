package com.wooliesx.tech.webriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.reflections.Reflections;

import org.springframework.stereotype.Component;

@Component
public class DriverFactory {
    public WebDriver getInstance(String browserName) throws ReflectiveOperationException {


        List<Class<? extends Driver>> drivers =
            new ArrayList<>(new Reflections(Driver.class.getPackage().getName()).getSubTypesOf(Driver.class));

        return  drivers.stream()
                      .filter(d -> d.getSimpleName().toLowerCase().contains(browserName.toLowerCase()))
                      .findFirst()
                      .orElseThrow(() -> new RuntimeException("Browser not supported"))
                      .getConstructor()
                      .newInstance()
                      .getDriver();
    
        
        
    }
}


