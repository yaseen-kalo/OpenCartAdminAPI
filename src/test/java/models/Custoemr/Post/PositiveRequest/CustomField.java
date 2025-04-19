package models.Custoemr.Post.PositiveRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomField {

    public String get_1() {
        return _1;
    }

    public void set_1(String _1) {
        this._1 = _1;
    }

    public int get_2() {
        return _2;
    }

    public void set_2(int _2) {
        this._2 = _2;
    }

    public String get_3() {
        return _3;
    }

    public void set_3(String _3) {
        this._3 = _3;
    }

    @JsonProperty("1")
    public String _1;
    @JsonProperty("2")
    public int _2;
    @JsonProperty("3")
    public String _3;
}
