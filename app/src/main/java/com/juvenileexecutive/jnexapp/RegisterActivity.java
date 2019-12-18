package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.juvenileexecutive.jnexapp.activity.SignInActivity;

public class RegisterActivity extends AppCompatActivity {
    Button regisButton;
    TextInputEditText edtRegisFullname;
    TextInputEditText edtRegisEmail;
    TextInputEditText edtRegisPassword;

    String txtEmailRegis, txtFullnameRegis, txtPasswordRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regisButton = findViewById(R.id.btn_regis);
        edtRegisFullname = findViewById(R.id.regis_edit_fullname);
        edtRegisEmail = findViewById(R.id.regis_edit_email);
        edtRegisPassword = findViewById(R.id.regis_edit_password);
        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateData();
            }
        });
    }

    public void validateData(){
        txtEmailRegis = edtRegisEmail.getText().toString();
        txtFullnameRegis = edtRegisFullname.getText().toString();
        txtPasswordRegis = edtRegisPassword.getText().toString();

        if(TextUtils.isEmpty(txtFullnameRegis)){
            edtRegisFullname.setError("Fullname must be filled!");
        } else if (TextUtils.isEmpty(txtEmailRegis)){
            edtRegisEmail.setError("Email must be filled!");
        }else if(TextUtils.isEmpty(txtPasswordRegis)){
            edtRegisPassword.setError("Password must be filled!");
        }else {
            startActivity(new Intent(RegisterActivity.this, SignInActivity.class));
        }
    }
}
