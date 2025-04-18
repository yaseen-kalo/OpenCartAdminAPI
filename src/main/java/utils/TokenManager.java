package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.ObjectInputFilter;

import static io.restassured.RestAssured.given;

public class TokenManager extends ConfigReader {

    //Generates + stores bearer token

    public static String token;

    public static String getToken() {
        if (token == null) {
            token = generateToken();
        }
        return token;
    }


    public static String generateToken() {
        RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseurl"))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Basic " + ConfigReader.getProperty("authorization"))
                .build();

        Response response = given()
                .spec(reqSpec)
                .when()
                    .post("/oauth2/token/client_credentials")
                .then()
                    .assertThat().statusCode(200)
                    .extract().response();

        return response.jsonPath().getString("access_token");
    }
}
