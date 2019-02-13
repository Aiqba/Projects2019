package com.api1test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ApiDemoTest {

    @Test
    public void Test1() {

        given().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").
                then().statusCode(200).log().all();
    }
    @Test
    public void Test2() {

        when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").
                then().log().body();
    }
    @Test
    public void Test3(){

        when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").
                then().log().status();

    }
    @Test
    public void Test4(){
        Response response =when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22");
        response.then().assertThat().statusCode(200);

    }
}




