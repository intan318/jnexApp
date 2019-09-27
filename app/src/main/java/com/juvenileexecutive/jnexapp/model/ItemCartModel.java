package com.juvenileexecutive.jnexapp.model;

public class ItemCartModel {
    String itemName;
    int imgItem;

    public ItemCartModel(String itemName, int imgItem) {
        this.itemName = itemName;
        this.imgItem = imgItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}
