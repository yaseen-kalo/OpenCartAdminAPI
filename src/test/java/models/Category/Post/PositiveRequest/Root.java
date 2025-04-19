package models.Category.Post.PositiveRequest;

import java.util.ArrayList;

public class Root {

    public ArrayList<CategoryDescription> category_description;
    public String image;
    public int sort_order;
    public ArrayList<Integer> category_store;
    public int parent_id;
    public int status;
    public ArrayList<Integer> category_filter;
    public int column;
    public int top;
    public ArrayList<CategorySeoUrl> category_seo_url;

    public ArrayList<CategoryDescription> getCategory_description() {
        return category_description;
    }

    public void setCategory_description(ArrayList<CategoryDescription> category_description) {
        this.category_description = category_description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public ArrayList<Integer> getCategory_store() {
        return category_store;
    }

    public void setCategory_store(ArrayList<Integer> category_store) {
        this.category_store = category_store;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Integer> getCategory_filter() {
        return category_filter;
    }

    public void setCategory_filter(ArrayList<Integer> category_filter) {
        this.category_filter = category_filter;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public ArrayList<CategorySeoUrl> getCategory_seo_url() {
        return category_seo_url;
    }

    public void setCategory_seo_url(ArrayList<CategorySeoUrl> category_seo_url) {
        this.category_seo_url = category_seo_url;
    }
}
