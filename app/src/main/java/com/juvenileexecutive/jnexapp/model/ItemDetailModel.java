package com.juvenileexecutive.jnexapp.model;

public class ItemDetailModel {

    String itemNameDetail;
    String itemDescription;
    int imgItemDetail;

    public ItemDetailModel(String itemNameDetail, String itemDescription, int imgItemDetail) {
        this.itemNameDetail = itemNameDetail;
        this.itemDescription = itemDescription;
        this.imgItemDetail = imgItemDetail;
    }

    public String getItemNameDetail() {
        return itemNameDetail;
    }

    public void setItemNameDetail(String itemNameDetail) {
        this.itemNameDetail = itemNameDetail;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getImgItemDetail() {
        return imgItemDetail;
    }

    public void setImgItemDetail(int imgItemDetail) {
        this.imgItemDetail = imgItemDetail;
    }
}
