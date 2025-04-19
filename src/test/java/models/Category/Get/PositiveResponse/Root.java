package models.Category.Get.PositiveResponse;

import java.util.ArrayList;

public class Root{
    public int success;
    public ArrayList<Object> error;
    public ArrayList<Data> data;

    public ArrayList<Object> getError() {
        return error;
    }

    public void setError(ArrayList<Object> error) {
        this.error = error;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}
