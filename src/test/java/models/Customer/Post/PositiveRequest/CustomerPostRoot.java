package models.Customer.Post.PositiveRequest;

import java.util.ArrayList;

public class CustomerPostRoot {

    public String firstname;
    public String lastname;
    public String email;
    public String password;
    public String confirm;
    public String telephone;
    public String fax;
    public int newsletter;
    public int status;
    public int approved;
    public int safe;
    public int customer_group_id;
    public CustomField custom_field;
    public ArrayList<Address> address;
    public Affiliate affiliate;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(int newsletter) {
        this.newsletter = newsletter;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public int getSafe() {
        return safe;
    }

    public void setSafe(int safe) {
        this.safe = safe;
    }

    public int getCustomer_group_id() {
        return customer_group_id;
    }

    public void setCustomer_group_id(int customer_group_id) {
        this.customer_group_id = customer_group_id;
    }

    public CustomField getCustom_field() {
        return custom_field;
    }

    public void setCustom_field(CustomField custom_field) {
        this.custom_field = custom_field;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }
}
