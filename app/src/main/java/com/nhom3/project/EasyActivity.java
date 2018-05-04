package com.nhom3.project;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class EasyActivity extends AppCompatActivity {

    private Button finish;
    private ImageView nex, pre;
    private Dialog ans;
    private WebView webView;
    private int kt =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.easy_layout);
        webView = (WebView) this.findViewById(R.id.ques);
        finish = (Button) this.findViewById(R.id.submit);
        nex = (ImageView) this.findViewById(R.id.btnNext);
        pre = (ImageView) this.findViewById(R.id.btnPre);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/webview2.html");
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();
            }
        });
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextquestion();
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextquestion();
            }
        });

    }
    private void nextquestion()
    {
        if (kt==1)
        {
            webView.loadUrl("file:///android_asset/webview2.html");
            kt=0;
        }
        else
        {
            webView.loadUrl("file:///android_asset/webview4.html");
            kt=1;
        }
    }
    private void showdialog()
    {
        ans = new Dialog(EasyActivity.this);
        ans.setTitle("Answer");
        ans.setContentView(R.layout.dialog_answer4);
        ans.show();
    }
    public void doneclick()
    {
        ans.hide();
    }
}
