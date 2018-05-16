package com.nhom3.project;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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
        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final Dialog dialog = new Dialog(EasyActivity.this,R.style.Dialog);
                dialog.setTitle(getResources().getString(R.string.dialog_name));
                dialog.setContentView(R.layout.dialog_answer_layout);

                Button btnDone = (Button) dialog.findViewById(R.id.btnDone);
                btnDone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
                });
                    dialog.show();
                return false;
                }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(EasyActivity.this,R.style.Dialog);
                dialog.setTitle(getResources().getString(R.string.dialog_confirm));
                dialog.setContentView(R.layout.dialog_confirm_layout);

                Button btnYes = (Button) dialog.findViewById(R.id.btnYes);
                Button btnNo = (Button) dialog.findViewById(R.id.btnNo);

                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(EasyActivity.this, ResultActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(intent);
                    }
                });

                dialog.show();

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
            webView.loadUrl("file:///android_asset/webview1.html");
            kt=0;
        }
        else
        {
            webView.loadUrl("file:///android_asset/webview2.html");
            kt=1;
        }
    }

    private void showdialog()
    {
        ans = new Dialog(EasyActivity.this);
        ans.setTitle("Answer");
        ans.setContentView(R.layout.dialog_answer_layout);
        ans.show();
    }
    public void doneclick()
    {
        ans.hide();
    }

}
