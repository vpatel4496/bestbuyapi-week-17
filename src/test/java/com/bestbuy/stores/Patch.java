package com.bestbuy.stores;

import com.bestbuy.model.PojoStores;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch extends TestBase {
    Response response;

    @Test
    public void patchStoresId(){
        PojoStores pojoStores = new PojoStores();
        pojoStores.setName("Sai News");
        response = given()
                .header("Content-Type","application/json")
                .body(pojoStores)
                .patch("/stores/7");
        response.then().statusCode(200);
        response.prettyPrint();


    }

}
