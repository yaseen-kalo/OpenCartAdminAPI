package models.Customer.Get.PositiveGetById;

import java.util.Map;

public class Data {

    private long store_id;
    private long customer_id;
    private long customer_group_id;
    private String firstname;
    private String lastname;
    private String telephone;
    private String email;
    private long newsletter;
    private long status;
    private String approved;
    private long safe;
    private String date_added;
    private Address[] addresses;
    private Affiliate affiliate;
    private Map<String, String> account_custom_field;
    private CustomFieldElement[] custom_fields;
    private long reward_points;
    private String transaction_total;

    public long getStore_id() {
        return store_id;
    }

    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public long getCustomer_group_id() {
        return customer_group_id;
    }

    public void setCustomer_group_id(long customer_group_id) {
        this.customer_group_id = customer_group_id;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(long newsletter) {
        this.newsletter = newsletter;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public long getSafe() {
        return safe;
    }

    public void setSafe(long safe) {
        this.safe = safe;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }

    public Map<String, String> getAccount_custom_field() {
        return account_custom_field;
    }

    public void setAccount_custom_field(Map<String, String> account_custom_field) {
        this.account_custom_field = account_custom_field;
    }

    public CustomFieldElement[] getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(CustomFieldElement[] custom_fields) {
        this.custom_fields = custom_fields;
    }

    public long getReward_points() {
        return reward_points;
    }

    public void setReward_points(long reward_points) {
        this.reward_points = reward_points;
    }

    public String getTransaction_total() {
        return transaction_total;
    }

    public void setTransaction_total(String transaction_total) {
        this.transaction_total = transaction_total;
    }
}
