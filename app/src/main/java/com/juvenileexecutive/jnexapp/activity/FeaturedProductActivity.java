package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvFeaturedProduct;
import com.juvenileexecutive.jnexapp.adapter.RvSubCategoriesAdapter;
import com.juvenileexecutive.jnexapp.home.adapter.RvProductsAdapter;
import com.juvenileexecutive.jnexapp.home.data.DataProducts;
import com.juvenileexecutive.jnexapp.model.DataFeaturedProduct;
import com.juvenileexecutive.jnexapp.model.DataSubCategory;
import com.juvenileexecutive.jnexapp.model.FeaturedProductModel;
import com.juvenileexecutive.jnexapp.model.SubCategoryModel;

import java.util.List;

public class FeaturedProductActivity extends AppCompatActivity {

   List<FeaturedProductModel> featuredProduct;
   RvFeaturedProduct adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured_product);

        //featured product
        LinearLayoutManager layoutManagerProducts = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewFeaturedProducts = findViewById(R.id.rv_featured_products);
        featuredProduct= DataFeaturedProduct.generateDataProduct();
        recyclerViewFeaturedProducts.setLayoutManager(layoutManagerProducts);
        adapter= new RvFeaturedProduct(this,featuredProduct);
        recyclerViewFeaturedProducts.setAdapter(adapter);


        //onsale product
        LinearLayoutManager layoutManagerOnsaleProduct = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewOnsaleProducts = findViewById(R.id.rv_onsale_product);
        featuredProduct= DataFeaturedProduct.generateDataProduct();
        recyclerViewOnsaleProducts.setLayoutManager(layoutManagerOnsaleProduct);
        adapter= new RvFeaturedProduct(this,featuredProduct);
        recyclerViewOnsaleProducts.setAdapter(adapter);

    }
}
