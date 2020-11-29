package com.wooliesx.tech.pages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PagesBeans {
    @Bean
    @Scope("cucumber-glue")
    public PageObjectFactory getPageFactory() {
        return new PageObjectFactory();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
