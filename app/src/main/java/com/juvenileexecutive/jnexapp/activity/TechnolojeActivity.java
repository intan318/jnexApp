package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetailTechnoloje;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class TechnolojeActivity extends AppCompatActivity {

    RecyclerView recyclerViewTechno;
    private List<ItemDetailModel> itemDetailModels;
    private RvItemProductAdapter itemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technoloje);

        recyclerViewTechno = findViewById(R.id.rv_item_technoloje);
        itemDetailModels = DataItemDetailTechnoloje.generateDataTechnoloje();
        itemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewTechno.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewTechno.setAdapter(itemProductAdapter);
    }
}
