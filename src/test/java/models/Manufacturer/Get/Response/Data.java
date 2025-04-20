package models.Manufacturer.Get.Response;

import java.util.ArrayList;

public class Data {

    public int manufacturer_id;
    public String name;
    public int sort_order;
    public ArrayList<ManufacturerSeoUrl> manufacturer_seo_urls;
    public String image;
    public String original_image;

    public int getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(int manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public ArrayList<ManufacturerSeoUrl> getManufacturer_seo_urls() {
        return manufacturer_seo_urls;
    }

    public void setManufacturer_seo_urls(ArrayList<ManufacturerSeoUrl> manufacturer_seo_urls) {
        this.manufacturer_seo_urls = manufacturer_seo_urls;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOriginal_image() {
        return original_image;
    }

    public void setOriginal_image(String original_image) {
        this.original_image = original_image;
    }
}
