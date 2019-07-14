package com.kendfd.testken;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        //getSupportActionBar().setTitle("About ALC");

        WebView webView=(WebView) findViewById(R.id.web);
        webView.loadUrl("https://andela.com/alc/");

        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView View, SslErrorHandler handler, SslError error) {
                handler.proceed();

        }

        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }



}
