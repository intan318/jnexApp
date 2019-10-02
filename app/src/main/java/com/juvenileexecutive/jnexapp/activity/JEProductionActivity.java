package com.juvenileexecutive.jnexapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProduct;
import com.juvenileexecutive.jnexapp.model.DataItemDetail;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

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
        itemProductAdapter = new RvItemProduct(this, itemDetailModels);
        recyclerViewJEPro.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewJEPro.setAdapter(itemProductAdapter);


    }
}
