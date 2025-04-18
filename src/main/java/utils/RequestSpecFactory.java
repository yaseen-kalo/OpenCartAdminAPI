package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecFactory {

    // Global RequestSpecification

    private static RequestSpecification requestSpec;

    public static RequestSpecification getRequestSpec() {
        if (requestSpec == null) {
            requestSpec = new RequestSpecBuilder()
                    .setBaseUri(ConfigReader.getProperty("baseurl"))
                    .addHeader("Authorization", "Bearer " + TokenManager.getToken())
                    .addHeader("Content-Type", "application/json")
                    .build();
        }
        return requestSpec;
    }

}
