package com.bestbuy.services;

import com.bestbuy.model.PojoServices;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

public class Post extends TestBase {

    Response response;

    @Test
    public void postServices(){
        PojoServices pojoServices = new PojoServices();
        pojoServices.setName("Samsung Utility Shop");
        pojoServices.setMessage("Genuine Accessories Available");
        pojoServices.setCode(11);
        pojoServices.setClassname("A1");

    }

}
