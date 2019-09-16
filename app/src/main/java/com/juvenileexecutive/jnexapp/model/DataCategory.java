package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataCategory {
    public static ArrayList<CategoryModel> generateData(){
        ArrayList<CategoryModel> categoryItems = new ArrayList<>();

        categoryItems.add(new CategoryModel("JE Production"," ", R.drawable.jeproduction));
        categoryItems.add(new CategoryModel("JE Collection"," ", R.drawable.jecollection));
        categoryItems.add(new CategoryModel("TechnoloJE"," ", R.drawable.technoloje));
        categoryItems.add(new CategoryModel("JE State"," ", R.drawable.jestatesmall));
        categoryItems.add(new CategoryModel("School of Business", "",R.drawable.schoolofbusiness));
        categoryItems.add(new CategoryModel("Vindication"," ", R.drawable.vindication));


        return categoryItems;
    }
}
