package com.bestbuy.assertion;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Assert {

//6. Check hash map values ‘createdAt’ inside storeservices map where store name = Roseville


    static ValidatableResponse response;

    @BeforeClass
    public  static  void inIt(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        response = given()
                .when()
                .get("/stores")
                .then().statusCode(200);
    }
    //1. Verify the if the total is equal to 1562
    @Test
    public void findTotalNumberOfStore(){
        int total = response.extract().path("total");
        System.out.println("The total no of store is: " + total);
        org.junit.Assert.assertEquals("Total is: ",1562,total);
    }

    //2. Verify the if the stores of limit is equal to 10
    @Test
   public void storeLimitIsEqualTo(){
        int limit = response.extract().path("limit");
        System.out.println("The store limit is: " + limit);
        org.junit.Assert.assertEquals("Store limit: ",10,limit);
    }

   //3. Check the single ‘Name’ in the Array list (Sai News)
    @Test
    public void checkTheSingleNameTo(){
        String nameInList = response.extract().path("data.find{it.name == 'Sai News'}.name");
        System.out.println("Sai News: " + nameInList);
        org.junit.Assert.assertEquals("Name","Sai News",nameInList);
    }

    //4. Check the multiple ‘Names’ in the ArrayList (Sai News, Burnsville, Maplewood)
    @Test
    public void checkTheMultipleNameAre() {
        //List<String> multipleNameInList = response.extract().path("data[1,2,3].name");
        List<String> names = response.extract().path("data[2,3,4].name");
        System.out.println(names);
        List<String> expected = new ArrayList<>();
        expected.add("Burnsville");
        expected.add("Maplewood");
        expected.add("Northtown");
        org.junit.Assert.assertEquals("Northtown, Burnsville, Maplewood not found",expected,names);
    }
    //5. Verify the storied=8 inside storeservices of the third store of second services
    @Test
    public void verifyTheStoreId(){
        int id = response.extract().path("data[2].services[3].storeservices.storeId");
        System.out.println("Verify the store id: " + id);
        org.junit.Assert.assertEquals("id is not found",8,id);
    }

    //7. Verify the state = MN of forth store
    @Test
    public void verifyStateInitials(){
        String state = response.extract().path("data[4].state");
        System.out.println("Verify the store state " + state);
        org.junit.Assert.assertEquals("state is not found",state,"MN");
    }

    //8. Verify the store name = Rochester of 9th store
    @Test
    public void verifyStoreName(){
        String storename = response.extract().path("data[7].name");
        System.out.println("Verify the store state " + storename);
        org.junit.Assert.assertEquals("store name not found","Rochester",storename);

    }
    //9. Verify the storeId = 11 for the 6th store
    @Test
    public void verifyStoreId(){
        int storeId = response.extract().path("data[6].services[6].id");
        System.out.println("Verify the store id " + storeId );
        org.junit.Assert.assertEquals("store id not found",11,storeId);

    }
    //10. Verify the serviceId = 4 for the 7th  store of forth service
    @Test
    public void verifyServiceId(){
        int serviceId = response.extract().path("data[7].services[3].id");
        System.out.println("Verify ServiceId " + serviceId);
        org.junit.Assert.assertEquals("serviceId not found",4,serviceId);

    }

}






