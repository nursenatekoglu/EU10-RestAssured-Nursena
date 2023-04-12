package com.cydeo.day2;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class HrGetRequests {

    //BeforeAll is a annotation equals to @BeforeClass in testNg, we use with static method name

    @BeforeAll
    public static void init() {

        //save baseurl inside this variable so that we dont need to type each http method.

        RestAssured.baseURI = "http://52.91.189.215:1000/ords/hr";


    }


}

