package utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.containsString;

public class ResponseSpecFactory {

    // Reuse for positive testCases (e.g., 200, content-type)

    private static ResponseSpecification successResponseSpec;
    private static ResponseSpecification unauthorizedSpec;
    private static ResponseSpecification notFoundSpec;
    private static ResponseSpecification notFoundSpecCustomer;
    private static ResponseSpecification badRequestSpec;

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
                    .expectBody("error[0]", containsString("Unauthorized")) // adjust if needed
                    .build();
        }
        return unauthorizedSpec;
    }

    // ✅ 404 Not Found
    public static ResponseSpecification getNotFoundSpec() {
        if (notFoundSpec == null) {
            notFoundSpec = new ResponseSpecBuilder()
                    .expectStatusCode(404)
                    .expectContentType("text/html; charset=UTF-8")
                    .build();
        }
        return notFoundSpec;
    }

    public static ResponseSpecification getCustomerNotFoundSpec() {
        if (notFoundSpecCustomer == null) {
            notFoundSpecCustomer = new ResponseSpecBuilder()
                    .expectStatusCode(404)
                    .expectContentType("application/json")
                    .expectBody("error[0]", containsString("Customer not found"))
                    .build();
        }
        return notFoundSpecCustomer;
    }

    public static ResponseSpecification getBadRequestSpec() {
        if (badRequestSpec == null) {
            badRequestSpec = new ResponseSpecBuilder()
                    .expectStatusCode(400)
                    .expectContentType("application/json")
                    .expectBody("error[0]", containsString("Invalid request body, please validate the json object")) // adjust if needed
                    .build();
        }
        return badRequestSpec;
    }
}
