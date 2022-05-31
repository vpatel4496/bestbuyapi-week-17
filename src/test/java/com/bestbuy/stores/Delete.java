package com.bestbuy.stores;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    Response response;

    @Test
    public void deleteStores(){
        response = given()
                .when()
                .delete("/stores/6");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
