package com.juvenileexecutive.jnexapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvItemCart;
import com.juvenileexecutive.jnexapp.model.DataItemCart;
import com.juvenileexecutive.jnexapp.model.ItemCartModel;

import java.util.List;

public class PaymentActivity extends AppCompatActivity {

    List<ItemCartModel> itemCartModels;
    RvItemCart itemCartAdapter;
    RecyclerView recyclerViewItemCart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        recyclerViewItemCart = findViewById(R.id.rv_item_payment);
        itemCartModels = DataItemCart.generateData();
        itemCartAdapter = new RvItemCart(this, itemCartModels);
        recyclerViewItemCart.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewItemCart.setAdapter(itemCartAdapter);
    }


}
