package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewExpansion extends AppCompatActivity {
    WebView webviewExpansion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_expansion);
        webviewExpansion = findViewById(R.id.webViewExpansion);
        webviewExpansion.setWebViewClient(new WebViewClient());
        webviewExpansion.loadUrl("https://j-nex.com/expansion/");
    }
}
