package data.payloads.CustomerPayload;

import net.datafaker.Faker;

public class CustomerCreateRequest {

    public static String ValidCustomerRequestPayload() {
        Faker fake = new Faker();
        String password = fake.internet().password();

        return "{\n" +
                "  \"firstname\": \"" + fake.name().firstName() + "\",\n" +
                "  \"lastname\": \"" + fake.name().lastName() + "\",\n" +
                "  \"email\": \"" + fake.internet().emailAddress() + "\",\n" +
                "  \"password\": \"" + password + "\",\n" +
                "  \"confirm\": \"" + password + "\",\n" +
                "  \"telephone\": \"" + fake.phoneNumber().cellPhone() + "\",\n" +
                "  \"fax\": \"" + fake.phoneNumber().cellPhone() + "\",\n" +
                "  \"newsletter\": 1,\n" +
                "  \"status\": 1,\n" +
                "  \"approved\": 1,\n" +
                "  \"safe\": 1,\n" +
                "  \"customer_group_id\": 1,\n" +
                "  \"custom_field\": {\n" +
                "    \"1\": \"" + fake.date() + "\",\n" +
                "    \"2\": " + fake.number().numberBetween(1, 5) + "\n" +
                "  },\n" +
                "  \"address\": [\n" +
                "    {\n" +
                "      \"firstname\": \"" + fake.name().firstName() + "\",\n" +
                "      \"lastname\": \"" + fake.name().lastName() + "\",\n" +
                "      \"company\": \"" + fake.company().name() + "\",\n" +
                "      \"city\": \"" + fake.address().city() + "\",\n" +
                "      \"address_1\": \"" + fake.address().streetAddress() + "\",\n" +
                "      \"country_id\": " + fake.number().numberBetween(1, 250) + ",\n" +
                "      \"postcode\": \"" + fake.address().zipCode() + "\",\n" +
                "      \"zone_id\": " + fake.number().numberBetween(1, 2000) + ",\n" +
                "      \"address_2\": \"" + fake.address().secondaryAddress() + "\",\n" +
                "      \"address_id\": " + fake.number().numberBetween(1, 100) + ",\n" +
                "      \"default\": 1,\n" +
                "      \"custom_field\": {\n" +
                "        \"3\": \"" + fake.internet().url() + "\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"affiliate\": {\n" +
                "    \"company\": \"" + fake.company().name() + "\",\n" +
                "    \"website\": \"" + fake.internet().url() + "\",\n" +
                "    \"tracking\": \"" + fake.bothify("Track###??") + "\",\n" +
                "    \"commission\": " + fake.number().numberBetween(1, 10) + ",\n" +
                "    \"tax\": \"" + fake.number().digits(8) + "\",\n" +
                "    \"cheque\": \"" + fake.name().fullName() + "\",\n" +
                "    \"paypal\": \"" + fake.internet().emailAddress() + "\",\n" +
                "    \"bank_name\": \"" + fake.company().name() + " Bank\",\n" +
                "    \"bank_branch_number\": \"" + fake.number().digits(9) + "\",\n" +
                "    \"bank_swift_code\": \"" + fake.bothify("SWIFT####") + "\",\n" +
                "    \"bank_account_name\": \"" + fake.name().fullName() + "\",\n" +
                "    \"bank_account_number\": \"" + fake.number().digits(10) + "\",\n" +
                "    \"status\": 1,\n" +
                "    \"payment\": \"paypal\",\n" +
                "    \"custom_field\": {\n" +
                "      \"1\": \"" + fake.lorem().word() + "\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
}
