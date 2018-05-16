<<<<<<< HEAD
package com.nhom3.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Introduce2Activity extends AppCompatActivity {

=======
package com.example.tonan.didong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Introduce2Activity extends AppCompatActivity {
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introdue2_layout);
        WebView webView = (WebView) findViewById(R.id.wbviewIntro2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introduce2.html");
    }
}
