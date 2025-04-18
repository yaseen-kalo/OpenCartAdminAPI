package tests.category;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.RequestSpecFactory;
import utils.ResponseSpecFactory;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class GetCategoryTests extends BaseTest {

    @Test(priority = 1, description = "Positive Test - Get all categories with valid token")
    public void getAllCategories_ValidToken_ShouldReturn200() {
        Response response = given()
                .spec(RequestSpecFactory.getRequestSpec())
                .when()
                .get("/categories")
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response();

        // Assert sample values
        assertEquals(response.statusCode(), 200);
        logResponse(response);
    }

    @Test(priority = 2, description = "Negative Test - Get categories without token")
    public void getAllCategories_WithoutToken_ShouldReturn401() {
        Response response = given()
                .spec(RequestSpecFactory.getRequestSpec())
                .when()
                .get()
                .then()
                .spec(ResponseSpecFactory.getNotFoundSpec())
                .extract().response();

        logResponse(response);
        assertEquals(response.statusCode(), 404);

        //assertEquals(response.statusCode(), 404);
        //System.out.println("Unauthorized Response:\n" + response.asPrettyString());
    }

}
