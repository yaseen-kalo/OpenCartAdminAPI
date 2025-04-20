package tests.category;

import base.BaseTest;
import endpoints.Categories.CategoriesPositiveEndpoints;
import endpoints.Categories.CategoriesNegativeEndpoints;

import io.restassured.response.Response;
import models.Category.Delete.Positiveresponse.DeleteRoot;
import models.Category.Get.PositiveResponse.Root;
import models.Category.Post.NegativeResponse.ErrorRoot;
import models.Category.Post.PositiveResponse.CategoryResponseRoot;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ResponseSpecFactory;



import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class CategoryTests extends BaseTest {

    int id;

    @Test(priority = 1, description = "Positive Test - Get all categories with valid token")
    public void getAllCategories_ValidToken_ShouldReturn200() {
        Response response = CategoriesPositiveEndpoints.shouldGetAllCategories();

        Root root = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(Root.class);
        Assert.assertEquals(root.success, 1);
    }

    @Test(priority = 2, description = "Negative Test - Get categories with Wrong endpoint")
    public void getAllCategories_With_wrong_endpoint_ShouldReturn404() {

        Response response = CategoriesNegativeEndpoints.getAllCategoriesWithWrongEndPoint();

        response
                .then()
                .spec(ResponseSpecFactory.getNotFoundSpec())
                .extract().response();

        assertEquals(response.statusCode(), 404);
    }

    @Test(priority = 3, description = "Negative Test - Get categories without token")
    public void getAllCategories_WithoutToken_ShouldReturn401() {

        Response response = CategoriesNegativeEndpoints.getAllCategoriesWithoutToken();
        Root root = response
                .then()
                .spec(ResponseSpecFactory.getUnauthorizedSpec())
                .extract().response().as(Root.class);


        Assert.assertEquals(root.success, 0);
        assertEquals("Unauthorized", root.getError().get(0));

    }

    @Test(priority = 4, description = "Positive Test - Create categories with valid Body")
    public void createCategory_ValidBody_ShouldReturn200() {

        Response response = CategoriesPositiveEndpoints.shouldCreateCategorySuccessfully();

        CategoryResponseRoot root = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(CategoryResponseRoot.class);

        id = root.data.id;
        assertEquals(root.success, 1);
    }

    @Test(priority = 5, description = "Negative Test - Create categories without Body")
    public void createCategory_WithoutBody_ShouldReturn400() {

        Response response = CategoriesNegativeEndpoints.shouldNotCreateCategorySuccessfullyWithoutBody();

        ErrorRoot root = response
                .then()
                .spec(ResponseSpecFactory.getBadRequestSpec())
                .extract().response().as(ErrorRoot.class);
        assertEquals(root.success, 0);
    }

    @Test(priority = 6, description = "Positive Test - Delete category with valid Body")
    public void deleteCategory_WithValidBody_ShouldReturn200() {
        Response response = CategoriesPositiveEndpoints.shouldDeleteCategorySuccessfully(id);

        DeleteRoot root = response
                .then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(DeleteRoot.class);

        assertEquals(root.success, 1);
    }

    @Test(priority = 6, description = "Positive Test - Delete category with valid Body")
    public void deleteCategory_WithoutToken_ShouldReturn401() {
        Response response = CategoriesNegativeEndpoints.shouldReturnUnauthorizeWhenTokenIsMissing(id);

        DeleteRoot root = response
                .then()
                .spec(ResponseSpecFactory.getUnauthorizedSpec())
                .extract().response().as(DeleteRoot.class);
    }
}
