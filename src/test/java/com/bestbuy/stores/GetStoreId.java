package com.bestbuy.stores;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetStoreId extends TestBase {

    Response response;

    @Test
    public void getStoreId(){
        response = given()
                .when()
                .get("/stores/7");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
