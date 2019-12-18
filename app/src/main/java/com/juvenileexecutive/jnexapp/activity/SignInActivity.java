package com.juvenileexecutive.jnexapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.juvenileexecutive.jnexapp.MainActivity;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.RegisterActivity;

public class SignInActivity extends AppCompatActivity {

    Button loginButton;
    TextView textRegis;
    TextInputEditText edtLoginEmail, edtLoginPassword;
    String txtEmailLogin, txtPasswordLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        loginButton = findViewById(R.id.login_button);
        edtLoginEmail = findViewById(R.id.login_edit_email);
        edtLoginPassword = findViewById(R.id.login_edit_password);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               validateDataLogin();
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

    public void validateDataLogin(){
        txtEmailLogin = edtLoginEmail.getText().toString();
        txtPasswordLogin = edtLoginPassword.getText().toString();

        if(TextUtils.isEmpty(txtEmailLogin)){
            edtLoginEmail.setError("Email must be filled!");
        } else if (TextUtils.isEmpty(txtPasswordLogin)){
            edtLoginPassword.setError("Password must be filled!");
        }else {
            Intent intentlogin = new Intent(SignInActivity.this, MainActivity.class);
            startActivity(intentlogin);
        }
    }
}
