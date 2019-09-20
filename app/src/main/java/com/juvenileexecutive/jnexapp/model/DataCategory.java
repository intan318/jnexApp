package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataCategory {
    public static ArrayList<CategoryModel> generateData(){
        ArrayList<CategoryModel> categoryItems = new ArrayList<>();

        categoryItems.add(new CategoryModel("JE Group"," ", R.drawable.background1));
        categoryItems.add(new CategoryModel("JEvestment"," ", R.drawable.background2));
        categoryItems.add(new CategoryModel("JExpansion"," ", R.drawable.background1));
        categoryItems.add(new CategoryModel("C.H.I.L.D"," ", R.drawable.background2));
        return categoryItems;
    }
}
