package endpoints.Customer;

import io.restassured.response.Response;
import utils.RequestSpecFactory;
import data.payloads.CustomerPayload.*;

import static io.restassured.RestAssured.given;

public class CustomersNegativeEndpoints {

    public static Response createCustomerWithoutToken() {
        return given()
                .spec(RequestSpecFactory.getRequestSpecWithoutToken())
                .when()
                .post("/customers");
    }

    public static Response getCustomerByIdWithoutToken(int id) {
        return given()
                .spec(RequestSpecFactory.getRequestSpecWithoutToken())
                .when()
                .post("/customers/" + id);

    }

}
