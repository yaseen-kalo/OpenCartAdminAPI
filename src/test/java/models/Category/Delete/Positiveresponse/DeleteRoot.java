package models.Category.Delete.Positiveresponse;

import java.util.ArrayList;

public class DeleteRoot {
    public int success;
    public ArrayList<Object> error;
    public ArrayList<Object> data;

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

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }
}
