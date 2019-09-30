package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.adapter.RvItemProduct;
import com.juvenileexecutive.jnexapp.adapter.RvSubCategoriesAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetail;
import com.juvenileexecutive.jnexapp.model.DataSubCategory;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;
import com.juvenileexecutive.jnexapp.model.SubCategoryModel;

import java.util.List;

public class JEProductionActivity extends AppCompatActivity {

    RecyclerView recyclerViewJEPro;
    List<ItemDetailModel> itemDetailModels;
    RvItemProduct itemProductAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeproduction);

        recyclerViewJEPro = findViewById(R.id.rv_item_payment);
        itemDetailModels = DataItemDetail.generateData();
        itemProductAdapter = new RvItemProduct(this,itemDetailModels);
        recyclerViewJEPro.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewJEPro.setAdapter(itemProductAdapter);


    }
}
