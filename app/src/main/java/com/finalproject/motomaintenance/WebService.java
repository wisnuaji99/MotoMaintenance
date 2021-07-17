package com.finalproject.motomaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebService extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_service);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com");
    }

    @Override
    public void onBackPressed() {
        {
            if(webView.canGoBack())
            {
                webView.goBack();
            }
            else
            {
                super.onBackPressed();
            }
        }
    }
}