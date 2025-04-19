package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecFactory {

    // Global RequestSpecification

    private static RequestSpecification requestSpec;
    private static RequestSpecification requestSpecWithoutToken;

    public static RequestSpecification getRequestSpec() {
        ConfigReader configReader = new ConfigReader();
        if (requestSpec == null) {
            requestSpec = new RequestSpecBuilder()
                    .setBaseUri(configReader.getProperty("baseurl"))
                    .addHeader("Authorization", TokenManager.getToken())
                    .addHeader("Content-Type", "application/json")
                    .build();
        }
        return requestSpec;
    }

    public static RequestSpecification getRequestSpecWithoutToken() {
        ConfigReader configReader = new ConfigReader();
        if (requestSpecWithoutToken == null) {
            requestSpecWithoutToken = new RequestSpecBuilder()
                    .setBaseUri(configReader.getProperty("baseurl"))
                    .addHeader("Content-Type", "application/json")
                    .build();
        }
        return requestSpecWithoutToken;
    }

}
