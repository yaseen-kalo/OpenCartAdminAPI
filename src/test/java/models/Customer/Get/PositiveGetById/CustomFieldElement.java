package models.Customer.Get.PositiveGetById;

public class CustomFieldElement {

    private String custom_field_id;
    private Object[] custom_field_value;
    private String name;
    private String type;
    private String value;
    private String validation;
    private String location;
    private boolean required;
    private String sort_order;

    public String getCustom_field_id() {
        return custom_field_id;
    }

    public void setCustom_field_id(String custom_field_id) {
        this.custom_field_id = custom_field_id;
    }

    public Object[] getCustom_field_value() {
        return custom_field_value;
    }

    public void setCustom_field_value(Object[] custom_field_value) {
        this.custom_field_value = custom_field_value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getSort_order() {
        return sort_order;
    }

    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }
}
