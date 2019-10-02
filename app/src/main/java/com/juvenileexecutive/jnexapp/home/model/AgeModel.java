package com.juvenileexecutive.jnexapp.home.model;

public class AgeModel {
    String titleAge;
    int imageAge;

    public AgeModel() {
    }

    public AgeModel(String titleAge, int imageAge) {
        this.titleAge = titleAge;
        this.imageAge = imageAge;
    }

    public String getTitleAge() {
        return titleAge;
    }

    public void setTitleAge(String titleAge) {
        this.titleAge = titleAge;
    }

    public int getImageAge() {
        return imageAge;
    }

    public void setImageAge(int imageAge) {
        this.imageAge = imageAge;
    }
}
