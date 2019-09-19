package test.java.pages;

import com.sun.org.apache.xpath.internal.objects.XObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import main.java.RestUtil;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPageApi {

    private static Response res = null; //Response object
    private static JsonPath jp = null; //JsonPath object
    static Response response;
    public static String correctUsername = "testuser";
    public static String correctPasword = "testpass";
    public static String wwrongUsername = "wrong";
    public static String wrongPassword = "wrong";
    public static String succesResponse = "**Successful Login**";
    public static String failedResponse = "**Failed Login**";


    public static void setup (){
        //Test Setup
        RestUtil.setBaseURI("http://php.thedemosite.co.uk/"); //Setup Base URI
        RestUtil.setBasePath("/login.php"); //Setup Base Path
        //RestUtil.setContentType(ContentType.JSON); //Setup Content Type
    }

    public static void login(String usernname, String password) {
        response = RestAssured.given()
                .params("username",usernname)
                . params("password",password)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/x-www-form-urlencoded")
                .header("cache-control", "")
                .when()
                .post("/login.php HTTP/1.1")
                .thenReturn();
    }
       public static void control(String turnresponce) {
        assertThat(response.getBody().print(), containsString(turnresponce));
    }

    public void afterTest (){
        RestUtil.resetBaseURI();
        RestUtil.resetBasePath();
    }

}
