package com.bestbuy.product;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetProductsId extends TestBase {

    Response response;

    @Test
    public void getProductId(){
        response = given()
                .when()
                .get("/products/9999683");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
