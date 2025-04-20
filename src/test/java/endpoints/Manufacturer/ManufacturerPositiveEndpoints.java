package endpoints.Manufacturer;

import io.restassured.response.Response;
import utils.RequestSpecFactory;

import data.payloads.ManufacturerPayload.*;

import static io.restassured.RestAssured.given;

public class ManufacturerPositiveEndpoints {

    public static Response shouldCreateManufacturerSuccessfully() {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .body(ManufacturerCreateRequest.ValidManufacturerRequestPayload())
                .post("/manufacturer");
    }


    public static Response shouldGetManufacturerSuccessfully(String name) {
        return given()
                .spec(RequestSpecFactory.getRequestSpec())
                .get("/manufacturer/" + name);
    }
}
