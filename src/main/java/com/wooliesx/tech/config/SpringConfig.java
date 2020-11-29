package com.wooliesx.tech.config;

import org.aeonbits.owner.ConfigFactory;

import org.openqa.selenium.WebDriver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.wooliesx.tech.webriver.DriverFactory;

@Configuration
public class SpringConfig {
    @Bean
    @Scope("cucumber-glue")
    public TestConfig getTestConfig() {
        return ConfigFactory.create(TestConfig.class);
    }

    @Bean(destroyMethod = "quit")
    @Scope("cucumber-glue")
    public WebDriver getWebDriver() throws ReflectiveOperationException {
        return new DriverFactory().getInstance(getTestConfig().browser());
    }
}
