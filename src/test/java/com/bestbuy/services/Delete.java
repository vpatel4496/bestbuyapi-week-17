package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    Response response;

    @Test
    public void deleteServices(){
        response = given()
                .when()
                .delete("/services/9");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
