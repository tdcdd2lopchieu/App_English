package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Introduce4Activity extends AppCompatActivity {
    final public static String QUESTIONS_KEY = "questions";
    private Intent intent;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduce4_layout);

        WebView webView = (WebView) findViewById(R.id.wbviewIntro4);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce4.html");

        Button btnCon = (Button) findViewById(R.id.btnCon);

        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Introduce4Activity.this, VeryDifficultActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                intent.putExtra(QUESTIONS_KEY,bundle);
                startActivity(intent);
            }
        });


    }


}
