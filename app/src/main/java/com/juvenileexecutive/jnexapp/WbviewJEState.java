package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WbviewJEState extends AppCompatActivity {
    WebView webviewJEStateRealty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wbview_jestate);
        webviewJEStateRealty = findViewById(R.id.webViewJEState);
        webviewJEStateRealty.setWebViewClient(new WebViewClient());
        webviewJEStateRealty.loadUrl("https://j-nex.com/property/");

    }
}
