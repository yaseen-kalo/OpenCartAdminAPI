package tests.manufacturer;

import data.payloads.ManufacturerPayload.ManufacturerCreateRequest;
import endpoints.Manufacturer.ManufacturerPositiveEndpoints;

import io.restassured.response.Response;
import models.Manufacturer.Post.PositiveResponse;
import org.testng.annotations.Test;
import utils.ResponseSpecFactory;

public class ManufacturerTests {

    String name;

    @Test(priority = 1, description = "Positive Test - post manufacturer with valid token")
    public void postManufactuer_With_ValidToken_ShouldReturn200() {

        Response response = ManufacturerPositiveEndpoints.shouldCreateManufacturerSuccessfully();

        PositiveResponse positiveResponse = response.then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(PositiveResponse.class);

        name = ManufacturerCreateRequest.name;
    }


    @Test(priority = 1, description = "Positive Test - post manufacturer with valid token")
    public void getManufactuer_With_ValidToken_And_Valid_Name_ShouldReturn200() {

        Response response = ManufacturerPositiveEndpoints.shouldGetManufacturerSuccessfully(name);

        PositiveResponse positiveResponse = response.then()
                .spec(ResponseSpecFactory.getSuccessSpec())
                .extract().response().as(PositiveResponse.class);

        System.out.println(ManufacturerCreateRequest.name);
    }
}
