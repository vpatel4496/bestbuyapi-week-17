package com.bestbuy.stores;

import com.bestbuy.model.PojoStores;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Post extends TestBase {

    Response response;

    @Test
    public void postStores(){
        PojoStores pojoStores = new PojoStores();

        pojoStores.setName("Sai News");
        pojoStores.setType("Convenience");
        pojoStores.setAddress("33");
        pojoStores.setAddress2("Jerome Crescent");
        pojoStores.setCity("Baltimore");
        pojoStores.setState("Maryland");
        pojoStores.setZip("21201");
        pojoStores.setLat(3753);
        pojoStores.setLng(7503);
        pojoStores.setHours("06.00");
        response = given()
                .header("Content-Type","application/json")
                .body(pojoStores)
                .when()
                .post("/stores");
        response.then().statusCode(400);
        response.prettyPrint();








    }
}
