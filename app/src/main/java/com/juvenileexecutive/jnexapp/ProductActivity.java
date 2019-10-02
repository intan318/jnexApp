package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProduct;
import com.juvenileexecutive.jnexapp.adapter.RvProductsActivityAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetail;
import com.juvenileexecutive.jnexapp.model.DataProductActivity;
import com.juvenileexecutive.jnexapp.model.ProductActivityModel;

import java.util.List;

public class ProductActivity extends AppCompatActivity {

    RecyclerView rvProducts;
    List<ProductActivityModel> productActivityModelList;
    RvProductsActivityAdapter itemProductAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        rvProducts = findViewById(R.id.rv_product_item_activity);
        productActivityModelList = DataProductActivity.generateDataProduct();
        itemProductAdapter = new RvProductsActivityAdapter(this, productActivityModelList);
        rvProducts.setLayoutManager(new GridLayoutManager(this,3));
        rvProducts.setAdapter(itemProductAdapter);
    }
}
