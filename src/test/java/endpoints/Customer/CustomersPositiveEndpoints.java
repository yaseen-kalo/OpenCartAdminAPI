package endpoints.Customer;

import io.restassured.response.Response;
import utils.RequestSpecFactory;
import data.payloads.CustomerPayload.*;

import static io.restassured.RestAssured.given;

public class CustomersPositiveEndpoints {

    public static Response shouldCreateCustomerSuccessfully() {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body(CustomerCreateRequest.ValidCustomerRequestPayload())
                .when()
                .post("/customers");
    }
}
