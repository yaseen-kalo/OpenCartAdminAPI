package tests.customer;

import endpoints.Categories.CategoriesPositiveEndpoints;
import endpoints.Customer.CustomersPositiveEndpoints;
import io.restassured.response.Response;
import models.Category.Get.PositiveResponse.Root;
import models.Custoemr.Post.PositiveRequest.CustomerPostRoot;
import models.Custoemr.Post.PositiveResponse.CustomerPostResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ResponseSpecFactory;

import static org.testng.AssertJUnit.assertEquals;

public class CustomerTests {

    @Test(priority = 1, description = "Positive Test - post customer with valid token")
    public void postCustomer_With_ValidToken_ShouldReturn200() {
        Response response = CustomersPositiveEndpoints.shouldCreateCustomerSuccessfully();

        CustomerPostResponse root = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(CustomerPostResponse.class);
        assertEquals(root.success, 1);
    }
}
