package com.juvenileexecutive.jnexapp.model;

public class SubCategoryModel {
    String titleSubCategory;
    String descriptionSubCategory;
    int imageSubCategory;
    int imageProductsSubCateory1;
    int imageProductsSubCateory2;

    public SubCategoryModel() {
    }

    public SubCategoryModel(String titleSubCategory, String descriptionSubCategory, int imageSubCategory, int imageProductsSubCateory1, int imageProductsSubCateory2) {
        this.titleSubCategory = titleSubCategory;
        this.descriptionSubCategory = descriptionSubCategory;
        this.imageSubCategory = imageSubCategory;
        this.imageProductsSubCateory1 = imageProductsSubCateory1;
        this.imageProductsSubCateory2 = imageProductsSubCateory2;
    }

    public String getTitleSubCategory() {
        return titleSubCategory;
    }

    public void setTitleSubCategory(String titleSubCategory) {
        this.titleSubCategory = titleSubCategory;
    }

    public String getDescriptionSubCategory() {
        return descriptionSubCategory;
    }

    public void setDescriptionSubCategory(String descriptionSubCategory) {
        this.descriptionSubCategory = descriptionSubCategory;
    }

    public int getImageSubCategory() {
        return imageSubCategory;
    }

    public void setImageSubCategory(int imageSubCategory) {
        this.imageSubCategory = imageSubCategory;
    }

    public int getImageProductsSubCateory1() {
        return imageProductsSubCateory1;
    }

    public void setImageProductsSubCateory1(int imageProductsSubCateory1) {
        this.imageProductsSubCateory1 = imageProductsSubCateory1;
    }

    public int getImageProductsSubCateory2() {
        return imageProductsSubCateory2;
    }

    public void setImageProductsSubCateory2(int imageProductsSubCateory2) {
        this.imageProductsSubCateory2 = imageProductsSubCateory2;
    }
}
