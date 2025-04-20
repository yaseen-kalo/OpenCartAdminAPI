package models.Customer.Get.PositiveGetById;

public class GetCustomerByIdResponse {

    private long success;
    private Object[] error;
    private Data data;

    public long getSuccess() { return success; }
    public void setSuccess(long value) { this.success = value; }

    public Object[] getError() { return error; }
    public void setError(Object[] value) { this.error = value; }

    public Data getData() { return data; }
    public void setData(Data value) { this.data = value; }
}
