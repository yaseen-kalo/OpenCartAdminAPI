package utils;

import POJO.User.LoginRequest;
import POJO.User.LoginResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthManager {

    public static void loginUser() {

        ConfigReader configReader = new ConfigReader();

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(configReader.getProperty("username"));
        loginRequest.setPassword(configReader.getProperty("password"));

        Response response = given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body(loginRequest)
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .extract().response();

        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println("Login Response:\n" + response.asPrettyString());

        System.out.println("✅ Login successful.");
    }
}
