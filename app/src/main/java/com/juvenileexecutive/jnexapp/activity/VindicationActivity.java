package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetailVindication;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class VindicationActivity extends AppCompatActivity {

    RecyclerView recyclerViewVindication;
    List<ItemDetailModel> itemDetailModels;
    RvItemProductAdapter itemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vindication);

        recyclerViewVindication = findViewById(R.id.rv_item_vindication);
        itemDetailModels = DataItemDetailVindication.generateDataVindication();
        itemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewVindication.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewVindication.setAdapter(itemProductAdapter);
    }
}
