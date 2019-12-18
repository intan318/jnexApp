package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewVindication extends AppCompatActivity {
    WebView webviewVindication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_vindication);
        webviewVindication = findViewById(R.id.webViewVindication);
        webviewVindication.setWebViewClient(new WebViewClient());
        webviewVindication.loadUrl("https://j-nex.com/news/");

    }
}
