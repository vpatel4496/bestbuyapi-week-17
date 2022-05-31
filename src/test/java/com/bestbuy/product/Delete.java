package com.bestbuy.product;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    Response response;

    @Test
    public void deleteId(){
        response = given()
                .when()
                .delete("/products/9999683");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
