package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewJessica extends AppCompatActivity {
WebView webViewJess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_jessica);
        webViewJess = findViewById(R.id.webView);
        webViewJess.setWebViewClient(new WebViewClient());
        webViewJess.loadUrl("https://j-nex.com/jessica/");

    }
}
