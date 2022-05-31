package com.bestbuy.extract;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Extract {


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

    //1. Extract the limit (10)
    @Test
    public void extractTheLimit() {
        int limit = response.extract().path("limit");
        System.out.println("The value of limit is : " + limit);
    }

    //2. Extract the total (1562)
    @Test
    public void extractTheTotalData () {
            int total = response.extract().path("total");
            System.out.println("Total data is : " + total);
    }

    //3. Extract the name of 5th store
    @Test
    public void extractTheNameOfFifthStore(){
        String name = response.extract().path("data[4].name");
        System.out.println("Name of the store: " + name);
    }

    //4. Extract the names of all the store
    @Test
    public void extractNameOfAllTheStore(){
        List<String> name = response.extract().path("data.findAll{it}.name");
        System.out.println("All store name: " + name);
    }

    //5. Extract the storeId of all the store
    @Test
    public void extractAllStoreId(){
        List<String> id = response.extract().path("data.findAll{it}.id");
        System.out.println("All store id: " + id);
    }

    //6. Print the size of the data list
    @Test
    public void printTheSizeOfData(){
        int size = response.extract().path("data.findAll{it}.size");
        System.out.println("The size of data " + size);
    }

    //7. Get all the value of the store where store name = St Cloud
    @Test
    public  void getTheValue(){
        List<String>  value = response.extract().path("data.findAll{it.name=='St Cloud'}");
        System.out.println("Value of store name: " + value);
    }

   //8. Get the address of the store where store name = Rochester
    @Test
    public void getAddressOfTheStore(){
        List<String> address = response.extract().path("data.findAll{it.name=='Rochester'}");
        System.out.println("Address of the Store: " + address);
    }

    //9. Get all the services of 8th store
    @Test
    public void getAllTheServices(){
        List<String> services = response.extract().path("data.findAll{it.name=='Oakdale'}");
        System.out.println("Services of the store: " + services);
    }

    //10. Get storeservices of the store where service name = Windows Store
    @Test
    public void getStoreServicesOf(){
        List<String> services = response.extract().path("data.findAll{it.name=='Windows Store'}");
        System.out.println("Get services: " + services);
    }

    //11. Get all the storeId of all the store
    @Test
    public void  getAllStoreId(){
        List<Integer> id = response.extract().path("data.findAll{it}.id");
        System.out.println("Get Id : " + id);
    }

    //12. Get id of all the store
    @Test
    public void getIDOfAllStore(){
        List<Integer> id = response.extract().path("data.findAll{it}.id");
        System.out.println(" Id of all store : " + id);
    }

    //13. Find the store names Where state = ND
    @Test
    public void findStateNameOfStore(){
       List <String> store = response.extract().path("data.findAll{it}.name");
        System.out.println(" Store is : " + store);
    }

    //14. Find the Total number of services for the store where store name = Rochester
    @Test
    public void findTotalNumberOfServices(){
        List<String> services = response.extract().path("data.findAll{it.name=='Rochester'}");
        System.out.println("Number of Services " + services);
    }

    //15. Find the createdAt for all services whose name = “Windows Store”
    @Test
    public void findCreatedAllServices(){
        String  created = response.extract().path("data.find{it.name='Windows Store'}.createdAt");
        System.out.println("Created for all services" + created);
    }

    //16. Find the name of all services Where store name = “Fargo”
    @Test
    public void findTheNameOfServices(){
        List<String> name = response.extract().path("data.find{it.name='Fargo'}.services");
        System.out.println("Find the services " + name);
    }

    //17. Find the zip of all the store
    @Test
    public void findTheZip(){
        List<String> zip = response.extract().path("data.findAll{it}.zip");
        System.out.println("Find zip " + zip);
    }

    //18. Find the zip of store name = Roseville
    @Test
    public void findZipOfStore(){
       List <String> zip = response.extract().path("data.findAll{it.name=='West Des Moines'}.zip");
        System.out.println("Find zip " + zip);
    }

    //19. Find the storeservices details of the service name = Magnolia Home Theater
    @Test
    public void findStoreServicesOfStore(){
        List<String> services = response.extract().path("data.findAll{it.name='Magnolia Home Theater'}.storeservices");
        System.out.println("Find store services" + services);
    }

    //20. Find the lat of all the stores
    @Test
    public void findLatOfAllStore(){
        List<Integer> lat = response.extract().path("data.findAll{it}.lat");
        System.out.println("Find Lat: " + lat);
    }









}


