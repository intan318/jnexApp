package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetailJEstate;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class JEstateActivity extends AppCompatActivity {

    RecyclerView recyclerViewJestate;
    List<ItemDetailModel> itemDetailModels;
    RvItemProductAdapter itemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jestate);

        recyclerViewJestate = findViewById(R.id.rv_item_jestate);
        itemDetailModels = DataItemDetailJEstate.generateDataJEstate();
        itemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewJestate.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewJestate.setAdapter(itemProductAdapter);
    }
}
