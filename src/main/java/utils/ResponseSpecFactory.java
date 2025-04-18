package utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.containsString;

public class ResponseSpecFactory {

    // Reuse for positive testCases (e.g., 200, content-type)

    private static ResponseSpecification successResponseSpec;
    private static ResponseSpecification unauthorizedSpec;
    private static ResponseSpecification notFoundSpec;

    // ✅ 200 OK
    public static ResponseSpecification getSuccessSpec() {
        if (successResponseSpec == null) {
            successResponseSpec = new ResponseSpecBuilder()
                    .expectStatusCode(200)
                    .expectContentType("application/json")
                    .build();
        }
        return successResponseSpec;
    }

    // ✅ 401 Unauthorized
    public static ResponseSpecification getUnauthorizedSpec() {
        if (unauthorizedSpec == null) {
            unauthorizedSpec = new ResponseSpecBuilder()
                    .expectStatusCode(401)
                    .expectContentType("application/json")
                    .expectBody("error", containsString("Unauthorized")) // adjust if needed
                    .build();
        }
        return unauthorizedSpec;
    }

    // ✅ 404 Not Found
    public static ResponseSpecification getNotFoundSpec() {
        if (notFoundSpec == null) {
            notFoundSpec = new ResponseSpecBuilder()
                    .expectStatusCode(404)
                    .expectContentType("application/json")
                    .build();
        }
        return notFoundSpec;
    }
}
