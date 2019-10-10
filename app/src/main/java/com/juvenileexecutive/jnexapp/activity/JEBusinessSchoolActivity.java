package com.juvenileexecutive.jnexapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemDetailJEProduction;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import java.util.List;

public class JEBusinessSchoolActivity extends AppCompatActivity {

    RecyclerView recyclerViewJEBusinessSchool;
    List<ItemDetailModel> itemDetailModels;
    RvItemProductAdapter itemProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jebusiness_school);

        recyclerViewJEBusinessSchool = findViewById(R.id.rv_item_jebusinessschool);
        itemDetailModels = DataItemDetailJEProduction.generateData();
        itemProductAdapter = new RvItemProductAdapter(this, itemDetailModels);
        recyclerViewJEBusinessSchool.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewJEBusinessSchool.setAdapter(itemProductAdapter);

    }
}
