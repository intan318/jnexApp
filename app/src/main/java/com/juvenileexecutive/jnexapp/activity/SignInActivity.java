package com.juvenileexecutive.jnexapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.juvenileexecutive.jnexapp.MainActivity;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.RegisterActivity;

public class SignInActivity extends AppCompatActivity {

    Button loginButton;
    TextView textRegis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlogin = new Intent(SignInActivity.this, MainActivity.class);

                startActivity(intentlogin);
            }
        });

        textRegis= findViewById(R.id.txt_register);
        textRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentregis = new Intent(SignInActivity.this, RegisterActivity.class);
                startActivity(intentregis);
            }
        });

    }
}
