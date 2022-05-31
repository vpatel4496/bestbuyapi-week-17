package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    Response response;

    @Test
    public void deleteCategoriesId(){
        response = given()
                .when()
                .delete("/categories/abcat0020004");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
/*
"id": "abcat0020004",
        "name": "Unique Gifts",
        "createdAt": "2016-11-17T17:57:04.285Z",
        "updatedAt": "2016-11-17T17:57:04.285Z",
        "subCategories": [

*/
