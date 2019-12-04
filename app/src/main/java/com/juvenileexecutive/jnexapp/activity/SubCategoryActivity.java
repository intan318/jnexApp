package com.juvenileexecutive.jnexapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvSubCategoriesAdapter;
import com.juvenileexecutive.jnexapp.model.DataSubCategory;
import com.juvenileexecutive.jnexapp.model.SubCategoryModel;

import java.util.List;

public class SubCategoryActivity extends AppCompatActivity {

    RecyclerView recyclerViewSubCategories;
    List<SubCategoryModel> subCategoryModels;
    RvSubCategoriesAdapter subCategoriesAdapter;

    CardView cvCategoryJepro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

//        recyclerViewSubCategories = findViewById(R.id.rv_subcategories);
//        subCategoryModels = DataSubCategory.generateDataSubCategory();
//        subCategoriesAdapter = new RvSubCategoriesAdapter(this, subCategoryModels);
//        recyclerViewSubCategories.setLayoutManager(new LinearLayoutManager(this));
//        recyclerViewSubCategories.setAdapter(subCategoriesAdapter);

        cvCategoryJepro= findViewById(R.id.cv_category_jepro);
        cvCategoryJepro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubCategoryActivity.this, JEProductionActivity.class);
                startActivity(intent);
            }
        });

    }
}
