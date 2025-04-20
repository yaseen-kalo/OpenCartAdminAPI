package data.payloads.ManufacturerPayload;

import models.Manufacturer.Post.Request.ManufacturerRequestRoot;
import models.Manufacturer.Post.Request.ManufacturerSeoUrl;
import net.datafaker.Faker;
import models.Manufacturer.Post.*;

public class ManufacturerCreateRequest {

    public static String name;

    public static String ValidManufacturerRequestPayload() {

        Faker fake = new Faker();
        name = fake.name().firstName();


        return "{\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"image\": \"\",\n" +
                "  \"sort_order\": 0,\n" +
                "  \"manufacturer_store\": [\n" +
                "    0\n" +
                "  ],\n" +
                "  \"manufacturer_seo_url\": [\n" +
                "    {\n" +
                "      \"keyword\": \""+fake.commerce().productName()+"\",\n" +
                "      \"language_id\": 1,\n" +
                "      \"store_id\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    public String getName() {
        return name;
    }
}
