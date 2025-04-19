package data.payloads.CategoryPayload;

import net.datafaker.Faker;

public class CategoryCreateRequest {

    Faker fake;
    public static String ValidCategoryRequestPayload() {
        Faker fake = new Faker();
        return "{\n" +
                "  \"category_description\": [\n" +
                "    {\n" +
                "      \"name\": \"Demo category\",\n" +
                "      \"description\": \"Description of the category\",\n" +
                "      \"language_id\": 1,\n" +
                "      \"meta_description\": \"Meta description of the category\",\n" +
                "      \"meta_keyword\": \"demo, demo2\",\n" +
                "      \"meta_title\": \"meta-title\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"image\": \"\",\n" +
                "  \"sort_order\": 0,\n" +
                "  \"category_store\": [\n" +
                "    0\n" +
                "  ],\n" +
                "  \"parent_id\": 0,\n" +
                "  \"status\": 1,\n" +
                "  \"category_filter\": [\n" +
                "    0\n" +
                "  ],\n" +
                "  \"column\": 1,\n" +
                "  \"top\": 0,\n" +
                "  \"category_seo_url\": [\n" +
                "    {\n" +
                "      \"keyword\": \""+fake.internet().domainName()+"\",\n" +
                "      \"language_id\": 1,\n" +
                "      \"store_id\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
