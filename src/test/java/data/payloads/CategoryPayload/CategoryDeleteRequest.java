package data.payloads.CategoryPayload;

import net.datafaker.Faker;

public class CategoryDeleteRequest {
    Faker fake;
    public static String ValidCategoryRequestPayload(int id) {
        Faker fake = new Faker();
        return "{\n" +
                "  \"categories\": [\n" +
                "    \""+id+"\"\n" +
                "  ]\n" +
                "}";
    }
}
