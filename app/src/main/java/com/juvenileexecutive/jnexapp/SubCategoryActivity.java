package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.adapter.RvCategoriesAdapter;
import com.juvenileexecutive.jnexapp.adapter.RvSubCategoriesAdapter;
import com.juvenileexecutive.jnexapp.model.DataCategory;
import com.juvenileexecutive.jnexapp.model.DataSubCategory;
import com.juvenileexecutive.jnexapp.model.SubCategoryModel;

import java.util.List;

public class SubCategoryActivity extends AppCompatActivity {

    RecyclerView recyclerViewSubCategories;
    List<SubCategoryModel> subCategoryModels;
    RvSubCategoriesAdapter subCategoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        recyclerViewSubCategories = findViewById(R.id.rv_subcategories);
        subCategoryModels = DataSubCategory.generateDataSubCategory();
        subCategoriesAdapter = new RvSubCategoriesAdapter(this,subCategoryModels);
        recyclerViewSubCategories.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewSubCategories.setAdapter(subCategoriesAdapter);

    }
}
