package com.juvenileexecutive.jnexapp.model;

public class FeaturedProductModel {
    String titleFeatured;
    String priceFeatured;
    int imgFeatured;

    public FeaturedProductModel() {
    }

    public FeaturedProductModel(String titleFeatured, String priceFeatured, int imgFeatured) {
        this.titleFeatured = titleFeatured;
        this.priceFeatured = priceFeatured;
        this.imgFeatured = imgFeatured;
    }

    public String getTitleFeatured() {
        return titleFeatured;
    }

    public void setTitleFeatured(String titleFeatured) {
        this.titleFeatured = titleFeatured;
    }

    public String getPriceFeatured() {
        return priceFeatured;
    }

    public void setPriceFeatured(String priceFeatured) {
        this.priceFeatured = priceFeatured;
    }

    public int getImgFeatured() {
        return imgFeatured;
    }

    public void setImgFeatured(int imgFeatured) {
        this.imgFeatured = imgFeatured;
    }
}
