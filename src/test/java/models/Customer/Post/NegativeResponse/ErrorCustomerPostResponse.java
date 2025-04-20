package models.Customer.Post.NegativeResponse;

import java.util.ArrayList;

public class ErrorCustomerPostResponse {

        public int success;
        public ArrayList<String> error;
        public ArrayList<Object> data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public ArrayList<String> getError() {
        return error;
    }

    public void setError(ArrayList<String> error) {
        this.error = error;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }
}
