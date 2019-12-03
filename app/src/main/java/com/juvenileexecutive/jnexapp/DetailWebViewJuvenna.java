package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DetailWebViewJuvenna extends AppCompatActivity {
    WebView detWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_web_view_juvenna);
        detWebView = findViewById(R.id.detailWebView);
        Intent i = getIntent();
        final String deturlMember = i.getStringExtra("urlmember");
        detWebView.setWebViewClient(new WebViewClient());
         detWebView.loadUrl(deturlMember);

    }
}
