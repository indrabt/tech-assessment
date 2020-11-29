package com.wooliesx.tech.stepdefs.api;

import static org.junit.Assert.assertEquals;

import io.cucumber.java8.En;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class CircuitsAPISteps implements En {
    public static RequestSpecification      Request;
    public static ResponseOptions<Response> response;
    Integer                                 totalNumberRace;
    Integer                                 totalnumberOfCircuits;
    Integer                                 year;

    public CircuitsAPISteps() {
        RequestSpecBuilder builder = new RequestSpecBuilder();

        builder.setBaseUri("http://ergast.com/api/f1");
        builder.setContentType(ContentType.JSON);

        RequestSpecification requestSpec = builder.build();

        Request = RestAssured.given().spec(requestSpec);
        Given("I want to know the number of Formula One races in {int}",
            (Integer year) -> {
                this.year = year;
                response  = Get("/" + year.toString() + ".json");

                JSONParser parse           = new JSONParser();
                JSONObject jobj            = (JSONObject) parse.parse(response.getBody().asString());
                JSONObject childJsonObject = (JSONObject) jobj.get("MRData");

                System.out.println(childJsonObject.get("total"));
                totalNumberRace = Integer.parseInt(childJsonObject.get("total").toString());
            });
        
        When("I retrieve the circuit list for that season",
            () -> {
                response = Get("/" + year + "/circuits.json");
            });
        
        Then("there should be {int} circuits in the list returned",
            (Integer expectedTotalNumberofCircuits) -> {
                JSONParser parse           = new JSONParser();
                JSONObject jobj            = (JSONObject) parse.parse(response.getBody().asString());
                JSONObject childJsonObject = (JSONObject) jobj.get("MRData");

                totalnumberOfCircuits = Integer.parseInt(childJsonObject.get("total").toString());
                assertEquals(totalnumberOfCircuits, expectedTotalNumberofCircuits);
            });
    }

    public static ResponseOptions<Response> Get(String url) {
        return Request.get(url);
    }
}

