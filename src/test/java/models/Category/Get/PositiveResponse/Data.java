package models.Category.Get.PositiveResponse;

import java.util.ArrayList;

public class Data{

    public int category_id;
    public String name;
    public String description;
    public int sort_order;
    public String meta_title;
    public String meta_description;
    public String meta_keyword;
    public int language_id;
    public String status;
    public int parent_id;
    public int column;
    public String top;
    public ArrayList<String> category_store;
    public ArrayList<CategorySeoUrl> category_seo_url;
    public ArrayList<Object> category_layout;
    public ArrayList<Object> category_filter;
    public String image;
    public String original_image;
    public ArrayList<Object> categories;

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public String getMeta_title() {
        return meta_title;
    }

    public void setMeta_title(String meta_title) {
        this.meta_title = meta_title;
    }

    public String getMeta_description() {
        return meta_description;
    }

    public void setMeta_description(String meta_description) {
        this.meta_description = meta_description;
    }

    public String getMeta_keyword() {
        return meta_keyword;
    }

    public void setMeta_keyword(String meta_keyword) {
        this.meta_keyword = meta_keyword;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public ArrayList<String> getCategory_store() {
        return category_store;
    }

    public void setCategory_store(ArrayList<String> category_store) {
        this.category_store = category_store;
    }

    public ArrayList<CategorySeoUrl> getCategory_seo_url() {
        return category_seo_url;
    }

    public void setCategory_seo_url(ArrayList<CategorySeoUrl> category_seo_url) {
        this.category_seo_url = category_seo_url;
    }

    public ArrayList<Object> getCategory_layout() {
        return category_layout;
    }

    public void setCategory_layout(ArrayList<Object> category_layout) {
        this.category_layout = category_layout;
    }

    public ArrayList<Object> getCategory_filter() {
        return category_filter;
    }

    public void setCategory_filter(ArrayList<Object> category_filter) {
        this.category_filter = category_filter;
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

    public ArrayList<Object> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Object> categories) {
        this.categories = categories;
    }
}
