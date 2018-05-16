package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Introduce2Activity extends AppCompatActivity {
    private Button btnIntro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introdue2_layout);
        WebView webView = (WebView) findViewById(R.id.wbviewIntro2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce2.html");

        btnIntro2 = (Button) findViewById(R.id.btnIntro2);


        btnIntro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduce2Activity.this, EasyActivity.class);
                startActivity(intent);
            }
        });
    }
}
