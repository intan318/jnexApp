package com.juvenileexecutive.jnexapp.model;

public class TechnolojeModel {
    String productNameTechnoloje;
    String productDescriptionTechnoloje;
    int imageProductTechnoloje;

    public TechnolojeModel() {
    }

    public TechnolojeModel(String productNameTechnoloje, String productDescriptionTechnoloje, int imageProductTechnoloje) {
        this.productNameTechnoloje = productNameTechnoloje;
        this.productDescriptionTechnoloje = productDescriptionTechnoloje;
        this.imageProductTechnoloje = imageProductTechnoloje;
    }

    public String getProductNameTechnoloje() {
        return productNameTechnoloje;
    }

    public void setProductNameTechnoloje(String productNameTechnoloje) {
        this.productNameTechnoloje = productNameTechnoloje;
    }

    public String getProductDescriptionTechnoloje() {
        return productDescriptionTechnoloje;
    }

    public void setProductDescriptionTechnoloje(String productDescriptionTechnoloje) {
        this.productDescriptionTechnoloje = productDescriptionTechnoloje;
    }

    public int getImageProductTechnoloje() {
        return imageProductTechnoloje;
    }

    public void setImageProductTechnoloje(int imageProductTechnoloje) {
        this.imageProductTechnoloje = imageProductTechnoloje;
    }
}
