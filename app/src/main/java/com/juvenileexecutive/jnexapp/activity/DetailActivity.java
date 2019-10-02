package com.juvenileexecutive.jnexapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;

public class DetailActivity extends AppCompatActivity {

    TextView detailNamaItem;
    TextView detailDescItem;
    ImageView detailImgItem;
    Button detailButtonRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initData();

        Intent i = getIntent();
        final String detNamaItem = i.getStringExtra("namaitem");
        final String detDescItem = i.getStringExtra("descitem");
        final String detImgItem = i.getStringExtra("imgitem");

        detailNamaItem.setText(detNamaItem);
        detailDescItem.setText(detDescItem);
        Glide.with(this)
                .load(detImgItem)
                .into(detailImgItem);

        detailButtonRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DetailActivity.this, PaymentActivity.class);
                i.putExtra("namaitem", detNamaItem);
                i.putExtra("descitem", detDescItem);
                i.putExtra("imgitem", detImgItem);
                startActivity(i);
            }
        });

    }

    private void initData() {
        detailNamaItem = findViewById(R.id.txtNamaItemDetail);
        detailDescItem = findViewById(R.id.txtDescItemDetail);
        detailImgItem = findViewById(R.id.imgItemDetail);
        detailButtonRequest = findViewById(R.id.btnItemRequest);
    }
}
