package models.Custoemr.Post.PositiveResponse;

import java.util.ArrayList;

public class CustomerPostResponse {

    public int success;
    public ArrayList<Object> error;
    public Data data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public ArrayList<Object> getError() {
        return error;
    }

    public void setError(ArrayList<Object> error) {
        this.error = error;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
