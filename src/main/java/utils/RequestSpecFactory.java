package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecFactory {

    // Global RequestSpecification

    private static RequestSpecification requestSpec;

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

}
