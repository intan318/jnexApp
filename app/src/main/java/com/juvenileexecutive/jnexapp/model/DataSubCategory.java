package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataSubCategory {

    public static ArrayList<SubCategoryModel> generateDataSubCategory(){
        ArrayList<SubCategoryModel> subCategoryModels= new ArrayList<>();

        subCategoryModels.add(new SubCategoryModel("JE Production"," ", R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        subCategoryModels.add(new SubCategoryModel("JE Collection"," ", R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        return subCategoryModels;
    }
}
