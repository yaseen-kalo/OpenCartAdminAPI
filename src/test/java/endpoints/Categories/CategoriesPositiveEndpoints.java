package endpoints.Categories;

import data.payloads.CategoryPayload.CategoryCreateRequest;
import io.restassured.response.Response;
import utils.RequestSpecFactory;

import static io.restassured.RestAssured.given;

public class CategoriesPositiveEndpoints {


    public static Response shouldGetAllCategories() {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .when()
                .get("/categories");
    }

    public static Response shouldCreateCategorySuccessfully() {

        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body(CategoryCreateRequest.ValidCategoryRequestPayload())
                .when()
                .post("/categories");
    }

    public static Response shouldDeleteCategorySuccessfully(int id) {

        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body("{\n" +
                        "  \"categories\": [\n" +
                        "    \""+id+"\"\n" +
                        "  ]\n" +
                        "}")
                .when()
                .delete("/categories");
    }
}
