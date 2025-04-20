package models.Customer.Post.PositiveRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    public String firstname;
    public String lastname;
    public String company;
    public String city;
    public String address_1;
    public int country_id;
    public String postcode;
    public int zone_id;
    public String address_2;
    public int address_id;
    @JsonProperty("default")
    public int mydefault;
    public CustomField custom_field;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getZone_id() {
        return zone_id;
    }

    public void setZone_id(int zone_id) {
        this.zone_id = zone_id;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getMydefault() {
        return mydefault;
    }

    public void setMydefault(int mydefault) {
        this.mydefault = mydefault;
    }

    public CustomField getCustom_field() {
        return custom_field;
    }

    public void setCustom_field(CustomField custom_field) {
        this.custom_field = custom_field;
    }
}
