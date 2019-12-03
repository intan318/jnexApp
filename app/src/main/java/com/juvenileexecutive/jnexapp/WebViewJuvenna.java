package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewJuvenna extends AppCompatActivity {
    WebView webViewJuvenna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_juvenna);
        webViewJuvenna = findViewById(R.id.webViewJuvenna);
        webViewJuvenna.setWebViewClient(new WebViewClient());
        webViewJuvenna.loadUrl("http://j-nex.com/solutions/");

    }
}
