package com.wooliesx.tech.datamodel;

import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;


@Component
public class Customer {
    private String   title;
    private String   firstName;
    private String   lastName;
    private String   email;
    private Calendar dob;
    private String   password;

    public Customer() {
        Faker faker = new Faker();

        firstName     = faker.name().firstName();
        lastName      = faker.name().lastName();
        email         = firstName + "@abz.org";
        this.password = "FakePassword";
        dob           = Calendar.getInstance();
        dob.set(1990, 1, 8);
        title = faker.name().title();
    }

    public Calendar getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getTitle() {
        return title;
    }
}


