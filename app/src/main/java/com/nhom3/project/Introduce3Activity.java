package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Introduce3Activity extends AppCompatActivity {
    private Button btnIntro3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduce3_layout);

        WebView webView = (WebView) findViewById(R.id.wbviewIntro3);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce3.html");

        btnIntro3 = (Button) findViewById(R.id.btnIntro3);
        btnIntro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduce3Activity.this, DifficultActivity.class);
                startActivity(intent);
            }
        });
    }
}
