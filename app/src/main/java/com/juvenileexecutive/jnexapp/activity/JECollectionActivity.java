package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetailJECollection;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class JECollectionActivity extends AppCompatActivity {

    RecyclerView recyclerViewJeCollection;
    private List<ItemDetailModel> itemDetailModels;
    private RvItemProductAdapter itemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jecollection);

        recyclerViewJeCollection = findViewById(R.id.rv_item_jecollection);
        itemDetailModels = DataItemDetailJECollection.generateDataJECollection();
        itemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewJeCollection.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewJeCollection.setAdapter(itemProductAdapter);
    }
}
