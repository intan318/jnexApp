package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView detailNamaItem;
    TextView detailDescItem;
    ImageView detailImgItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initData();

        Intent i = getIntent();
        String detNamaItem = i.getStringExtra("namaitem");
        String detDescItem = i.getStringExtra("descitem");
        String detImgItem = i.getStringExtra("imgitem");

        detailNamaItem.setText(detNamaItem);
        detailDescItem.setText(detDescItem);
        Glide.with(this)
                .load(detImgItem)
                .into(detailImgItem);

    }

    private void initData() {
        detailNamaItem = findViewById(R.id.txtNamaItemDetail);
        detailDescItem = findViewById(R.id.txtDescItemDetail);
        detailImgItem = findViewById(R.id.imgItemDetail);
    }
}
