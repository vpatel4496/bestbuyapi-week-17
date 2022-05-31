package com.bestbuy.product;

import com.bestbuy.model.Pojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Post extends TestBase {
    Response response;



    @Test
    public void  addProduct(){
        Pojo pojo = new Pojo();
        pojo.setName("Car");
        pojo.setType("Sports");
        pojo.setPrice(30000);
        pojo.setShipping(4000);
        pojo.setUpc("Used");
        pojo.setDescription("Black");
        pojo.setManufacturer("Merc");
        pojo.setModel("E Class");
        pojo.setUrl("addProduct");
        pojo.setImage("A3");
        response = given()
                .header("Content-Type","application/json")
                .body(pojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();
    }


}
