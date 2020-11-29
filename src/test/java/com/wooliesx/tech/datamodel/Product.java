package com.wooliesx.tech.datamodel;

import org.springframework.stereotype.Component;



@Component
public class Product {
    private String productName;
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double priceofItem) {
        this.price = priceofItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

