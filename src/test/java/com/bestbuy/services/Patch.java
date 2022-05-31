package com.bestbuy.services;

import com.bestbuy.model.PojoServices;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {

    Response response;

    @Test
    public void patchServicesId(){
        PojoServices pojoServices = new PojoServices();
        pojoServices.setName("Samsung Utility Shop");
        response = given()
                .header("Content-Type","application/json")
                .body(pojoServices)
                .when()
                .patch("/services/6");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
