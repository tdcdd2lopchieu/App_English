<<<<<<< HEAD
package com.nhom3.project;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
=======
package com.example.tonan.didong;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
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
<<<<<<< HEAD
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
=======
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();
            }
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
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

                dialog.show();

=======
                showdialog();
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
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
<<<<<<< HEAD
            webView.loadUrl("file:///android_asset/webview2.html");
=======
            webView.loadUrl("file:///android_asset/webview1.html");
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
            kt=0;
        }
        else
        {
<<<<<<< HEAD
            webView.loadUrl("file:///android_asset/webview4.html");
            kt=1;
        }
    }

=======
            webView.loadUrl("file:///android_asset/webview2.html");
            kt=1;
        }
    }
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
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
<<<<<<< HEAD

=======
>>>>>>> 51b60b843f4f4290a4b1ffd6834cf1d522bfc208
}