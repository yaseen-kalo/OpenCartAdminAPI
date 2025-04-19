package endpoints.Categories;

import io.restassured.response.Response;
import utils.RequestSpecFactory;
import utils.ResponseSpecFactory;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class CategoriesNegativeEndpoints {

    public static Response getAllCategoriesWithWrongEndPoint() {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .when()
                .get();
    }

    public static Response getAllCategoriesWithoutToken() {
        return given()
                .spec(RequestSpecFactory.getRequestSpecWithoutToken())
                .when()
                .get("/categories");
    }

    public static Response shouldNotCreateCategorySuccessfullyWithoutBody() {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body("")
                .when()
                .post("/categories");
    }

}
