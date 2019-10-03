package com.juvenileexecutive.jnexapp.category.data;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.category.model.CategoryModel;

import java.util.ArrayList;

public class DataCategory {
    public static ArrayList<CategoryModel> generateData() {
        ArrayList<CategoryModel> categoryItems = new ArrayList<>();

        categoryItems.add(new CategoryModel("JE Group", " ", R.drawable.category_onestop));
        categoryItems.add(new CategoryModel("JEvestment", " ", R.drawable.category_businessexp));
        categoryItems.add(new CategoryModel("JExpansion", " ", R.drawable.category_investment));
        categoryItems.add(new CategoryModel("C.H.I.L.D", " ", R.drawable.category_child));
        return categoryItems;
    }
}
