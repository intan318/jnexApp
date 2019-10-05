package com.juvenileexecutive.jnexapp.model;

public class GridProductsModel {

    String titleProductGrid;
    int imgProductGrid;

    public GridProductsModel(String titleProductGrid, int imgProductGrid) {
        this.titleProductGrid = titleProductGrid;
        this.imgProductGrid = imgProductGrid;
    }

    public String getTitleProductGrid() {
        return titleProductGrid;
    }

    public void setTitleProductGrid(String titleProductGrid) {
        this.titleProductGrid = titleProductGrid;
    }

    public int getImgProductGrid() {
        return imgProductGrid;
    }

    public void setImgProductGrid(int imgProductGrid) {
        this.imgProductGrid = imgProductGrid;
    }
}
