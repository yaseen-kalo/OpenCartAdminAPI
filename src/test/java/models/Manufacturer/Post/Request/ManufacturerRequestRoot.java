package models.Manufacturer.Post.Request;

import java.util.ArrayList;

public class ManufacturerRequestRoot {

    public String name;
    public String image;
    public int sort_order;
    public ArrayList<Integer> manufacturer_store;
    public ArrayList<ManufacturerSeoUrl> manufacturer_seo_url;
}
