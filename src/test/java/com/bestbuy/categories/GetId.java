package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetId extends TestBase {
    Response response;

    @Test
    public void getCategoriesId(){
        response = given()
                .when()
                .get("/categories/abcat0020009");
        response.then().statusCode(404);
        response.prettyPrint();
    }
}
