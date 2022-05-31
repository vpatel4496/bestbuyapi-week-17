package com.bestbuy.product;

import com.bestbuy.model.Pojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {

    Response response;

    @Test
    public void pacthProductId(){
        Pojo pojo = new Pojo();
        pojo.setName("BMW");
        response = given()
                .header("Content-Type","application/json")
                .body(pojo)
                .when()
                .patch("/products/9999683");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
