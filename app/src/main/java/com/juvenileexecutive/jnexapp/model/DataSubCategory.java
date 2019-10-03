package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataSubCategory {

    public static ArrayList<SubCategoryModel> generateDataSubCategory() {
        ArrayList<SubCategoryModel> subCategoryModels = new ArrayList<>();

        subCategoryModels.add(new SubCategoryModel("JE Production", " ", R.drawable.jepro, R.drawable.je_business_scholl, R.drawable.jecollection));
        subCategoryModels.add(new SubCategoryModel("JE Collection", " ", R.drawable.technoloje, R.drawable.jestate_reality, R.drawable.vindication_1));
        return subCategoryModels;
    }
}
