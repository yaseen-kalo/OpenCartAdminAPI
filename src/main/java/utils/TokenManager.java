package utils;

import POJO.Token.TokenResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.ObjectInputFilter;

import static io.restassured.RestAssured.given;

public class TokenManager {

    //Generates + stores bearer token

    public static String token;

    public static String getToken() {
        if (token == null) {
            token = generateToken();
        }
        return token;
    }


    public static String generateToken() {
        ConfigReader configReader = new ConfigReader();
        RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri(configReader.getProperty("baseurl"))
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", configReader.getProperty("authorization"))
                .addHeader("Content-Type", "")
                .build();

        TokenResponse tokenResponse = given()
                .spec(reqSpec)
                .when()
                .post("/oauth2/token/client_credentials")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(TokenResponse.class);

        token = tokenResponse.data.access_token;
        System.out.println("Bearer Token: " + token);

        return "Bearer " + token;
    }
}
