package com.juvenileexecutive.jnexapp.home.model;

public class ProductsModel {
    String productTitle;
    String productDescription;
    int productImage;

    public ProductsModel() {
    }


    public ProductsModel(String productTitle, String productDescription, int productImage) {
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
