package com.bestbuy.categories;

import com.bestbuy.model.PojoCategories;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {
    Response response;

    @Test
    public void  patchCategoriesId(){
        PojoCategories pojoCategories = new PojoCategories();
        pojoCategories.setName("Sai News Greetings");
        response = given()
                .header("Content-Type","application/json")
                .body(pojoCategories)
                .when()
                .patch("/categories/abcat0102000");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
/*
id": "abcat0101001",
        "name": "All Flat-Panel TVs",*/
