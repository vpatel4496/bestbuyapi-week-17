package com.bestbuy.categories;

import com.bestbuy.model.PojoCategories;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Post extends TestBase {
    Response response;

    @Test
    public void postCategories(){
        PojoCategories pojoCategories = new PojoCategories();
        pojoCategories.setName("Sai News Event Shop");
        pojoCategories.setId("abcat0020006");
        response = given()
                .when()
                .post("/categories");
        response.then().statusCode(500);
        response.prettyPrint();
    }
}
