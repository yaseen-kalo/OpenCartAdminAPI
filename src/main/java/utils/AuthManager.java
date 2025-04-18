package utils;

import POJO.User.LoginRequest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthManager {

    public static void loginUser() {

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(ConfigReader.getProperty("username"));
        loginRequest.setPassword(ConfigReader.getProperty("password"));
        Response response = given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body(loginRequest)
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("✅ Login successful.");
    }
}
