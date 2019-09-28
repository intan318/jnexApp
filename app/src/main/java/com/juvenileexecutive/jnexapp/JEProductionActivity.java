package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetail;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class JEProductionActivity extends AppCompatActivity {

    List<ItemDetailModel> itemDetailModels;
    RecyclerView recyclerViewJepro;
    RvItemProductAdapter rvItemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeproduction);

        recyclerViewJepro = findViewById(R.id.rv_item_jeproduction);
        itemDetailModels = DataItemDetail.generateData();
        rvItemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewJepro.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewJepro.setAdapter(rvItemProductAdapter);

    }
}
