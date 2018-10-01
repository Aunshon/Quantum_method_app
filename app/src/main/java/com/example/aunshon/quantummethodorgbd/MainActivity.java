package com.example.aunshon.quantummethodorgbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webViewvariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewvariable=findViewById(R.id.webview);
        WebSettings webSettings=webViewvariable.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webViewvariable.loadUrl("https://quantummethod.org.bd");

        //to open all other pages in the app that contains the website
        //by tuching any button or any where
        webViewvariable.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(webViewvariable.canGoBack()){
            webViewvariable.goBack();
        }
        else {
            super.onBackPressed();
        }

    }
}
