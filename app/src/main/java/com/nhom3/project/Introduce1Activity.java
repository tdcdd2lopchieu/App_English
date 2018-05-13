package com.example.tonan.didong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Introduce1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introdue1_layout);
        WebView webView = (WebView) findViewById(R.id.wbviewIntro2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce1.html");
    }
}
