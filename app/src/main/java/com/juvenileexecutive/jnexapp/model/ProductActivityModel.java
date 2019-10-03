package com.juvenileexecutive.jnexapp.model;

public class ProductActivityModel {
    String titleProduct;
    String descriptionProduct;
    int imageProduct;

    public ProductActivityModel() {
    }

    public ProductActivityModel(String titleProduct, String descriptionProduct, int imageProduct) {
        this.titleProduct = titleProduct;
        this.descriptionProduct = descriptionProduct;
        this.imageProduct = imageProduct;
    }

    public String getTitleProduct() {
        return titleProduct;
    }

    public void setTitleProduct(String titleProduct) {
        this.titleProduct = titleProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        this.imageProduct = imageProduct;
    }
}
