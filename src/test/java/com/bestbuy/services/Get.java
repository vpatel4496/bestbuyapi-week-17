package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get extends TestBase {
    Response response;
    @Test
    public void getServices(){
        response = given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
