package com.wooliesx.tech.datamodel;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import lombok.Data;

@Component
@Data
public class Address {
    private String firstName;
    private String lastName;
    private String company;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    private String mobilePhone;
    private String homePhone;

    public Address() {
        Faker faker = new Faker();

        firstName     = faker.name().firstName();
        lastName      = faker.name().lastName();
        company       = faker.company().name();
        streetAddress = "Newyork city, New York 10001";
        city          = "Newyork city";
        state         = "New York";
        zipcode       = "10001";
        country       = "United States";
        mobilePhone   = faker.phoneNumber().cellPhone();
        homePhone     = faker.phoneNumber().phoneNumber();
    }

    public String getCity() {
        return city;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipcode() {
        return zipcode;
    }
}



