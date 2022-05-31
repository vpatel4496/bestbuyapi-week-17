package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetId extends TestBase {
    Response response;

    @Test
    public  void getServicesId(){
        response = given()
                .when()
                .get("/services/6");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
