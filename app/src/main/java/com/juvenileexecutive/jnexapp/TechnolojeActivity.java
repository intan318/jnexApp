package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.adapter.RvItemProductAdapter;
import com.juvenileexecutive.jnexapp.adapter.RvProductTechnoloje;
import com.juvenileexecutive.jnexapp.model.DataItemDetail;
import com.juvenileexecutive.jnexapp.model.DataProductsTechnoloje;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;
import com.juvenileexecutive.jnexapp.model.TechnolojeModel;

import java.util.List;

public class TechnolojeActivity extends AppCompatActivity {

    List<TechnolojeModel> itemProductTechnoloJ;
    RecyclerView recyclerViewTechnoloJE;
    RvProductTechnoloje rvProductTechnoloje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technoloje);
        recyclerViewTechnoloJE = findViewById(R.id.rv_item_technoloje);
        itemProductTechnoloJ = DataProductsTechnoloje.generateDataTechnoloje();
        rvProductTechnoloje = new RvProductTechnoloje(this, itemProductTechnoloJ);
        recyclerViewTechnoloJE.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewTechnoloJE.setAdapter(rvProductTechnoloje);
    }
}
