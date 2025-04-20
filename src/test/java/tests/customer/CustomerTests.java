package tests.customer;

import endpoints.Customer.CustomersNegativeEndpoints;
import endpoints.Customer.CustomersPositiveEndpoints;
import io.restassured.response.Response;
import models.Customer.Get.NegativeGetById.ErrorCustomerGetResponse;
import models.Customer.Get.PositiveGetById.GetCustomerByIdResponse;
import models.Customer.Post.NegativeResponse.ErrorCustomerPostResponse;
import models.Customer.Post.PositiveResponse.CustomerPostResponse;
import org.testng.annotations.Test;
import utils.ResponseSpecFactory;

import static org.testng.AssertJUnit.assertEquals;

public class CustomerTests {

    static int id;

    @Test(priority = 1, description = "Positive Test - post customer with valid token")
    public void postCustomer_With_ValidToken_ShouldReturn200() {
        Response response = CustomersPositiveEndpoints.shouldCreateCustomerSuccessfully();

        CustomerPostResponse root = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(CustomerPostResponse.class);
        assertEquals(root.success, 1);
        id = root.data.id;
    }

    @Test(priority = 2, description = "Negative Test - post customer with invalid token")
    public void postCustomer_Without_Token_ShouldReturn401() {
        Response response = CustomersNegativeEndpoints.createCustomerWithoutToken();

        ErrorCustomerPostResponse root = response
                .then()
                .spec(ResponseSpecFactory.getUnauthorizedSpec())
                .extract().response().as(ErrorCustomerPostResponse.class);

        assertEquals(root.success, 0);
    }

    @Test(priority = 3, description = "Positive Test - Get customer with valid id")
    public void getCustomer_With_ValidId_ShouldReturn200() {
        Response response = CustomersPositiveEndpoints.getCustomerById(id);

        GetCustomerByIdResponse getCustomerByIdResponse = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract()
                .response().as(GetCustomerByIdResponse.class);

        assertEquals(getCustomerByIdResponse.getSuccess(), 1);
    }

    @Test(priority = 4, description = "Negative Test - Get customer without Token")
    public void getCustomer_Without_Token_ShouldReturn401() {
        Response response = CustomersNegativeEndpoints.getCustomerByIdWithoutToken(id);

        ErrorCustomerGetResponse errorCustomerGetResponse = response
                .then()
                .spec((ResponseSpecFactory.getUnauthorizedSpec()))
                .extract().response().as(ErrorCustomerGetResponse.class);

        assertEquals(errorCustomerGetResponse.success, 0);
    }


    @Test(priority = 5, description = "Negative Test - Get customer with invalid id")
    public void getCustomer_With_InvalidId_ShouldReturn404() {
        Response response = CustomersPositiveEndpoints.getCustomerById(999999);

        ErrorCustomerGetResponse errorCustomerGetResponse = response
                .then()
                .spec(ResponseSpecFactory.getCustomerNotFoundSpec())
                .extract().response().as(ErrorCustomerGetResponse.class);

        assertEquals(errorCustomerGetResponse.success, 0);
    }
}
