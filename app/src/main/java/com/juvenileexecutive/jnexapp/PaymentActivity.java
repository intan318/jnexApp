package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juvenileexecutive.jnexapp.adapter.RvItemCartAdapter;
import com.juvenileexecutive.jnexapp.model.DataItemCart;
import com.juvenileexecutive.jnexapp.model.ItemCartModel;

import java.util.List;

public class PaymentActivity extends AppCompatActivity {

    List<ItemCartModel> itemCartModels;
    RvItemCartAdapter itemCartAdapter;
    RecyclerView recyclerViewItemCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        recyclerViewItemCart = findViewById(R.id.rv_item_payment);
        itemCartModels = DataItemCart.generateData();
        itemCartAdapter = new RvItemCartAdapter(this, itemCartModels);
        recyclerViewItemCart.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewItemCart.setAdapter(itemCartAdapter);
    }
}
