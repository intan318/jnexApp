package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.juvenileexecutive.jnexapp.activity.SignInActivity;

public class RegisterActivity extends AppCompatActivity {
    Button regisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regisButton = findViewById(R.id.btn_regis);
        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(RegisterActivity.this, SignInActivity.class));
            }
        });
    }
}
