package com.wooliesx.tech.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class DataModelBeans {
    @Bean
    @Scope("cucumber-glue")
    public Address getAddress() {
        return new Address();
    }

    @Bean
    @Scope("cucumber-glue")
    public Customer getCustomer() {
        return new Customer();
    }

    @Bean
    @Scope("cucumber-glue")
    public Product getProduct() {
        return new Product();
    }

    @Bean
    @Scope("cucumber-glue")
    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<Product>();

        return productList;
    }
}


