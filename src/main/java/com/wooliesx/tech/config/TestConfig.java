package com.wooliesx.tech.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config.properties"})
public interface TestConfig  extends Config {

    @Key("Browser")
    @DefaultValue("Chrome")
    String browser();

    @Key("EmailID")
    @DefaultValue("testemail2256@gmail.com")
    String getEmailID();
    
    @Key("Password")
    @DefaultValue("testemail")
    String getDefaultPassword();
    
    @Key("URL")
    @DefaultValue("http://automationpractice.com/index.php")
    String getURL();

    @Key("APIURL")
    @DefaultValue("http://ergast.com/api/f1")
    String getAPIURL();
}
