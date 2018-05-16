package com.nhom3.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Introduce1Activity extends AppCompatActivity {
    final public static String QUESTIONS_KEY = "questions";
    private Intent intent;
    private Bundle bundle;
    private Button btnIntro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introdue1_layout);
        WebView webView = (WebView) findViewById(R.id.wbviewIntro1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce1.html");

        btnIntro1 = (Button) findViewById(R.id.btnIntro1);


        btnIntro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduce1Activity.this, VeryEasyActivity.class);
                startActivity(intent);
            }
        });

    }
}
