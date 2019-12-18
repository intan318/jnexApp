package com.juvenileexecutive.jnexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewJECollection extends AppCompatActivity {
    WebView webviewCollection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_jecollection);
        webviewCollection=findViewById(R.id.webViewJECollection);
        webviewCollection.setWebViewClient(new WebViewClient());
        webviewCollection.loadUrl("https://www.emmacloth.com/");
    }
}
