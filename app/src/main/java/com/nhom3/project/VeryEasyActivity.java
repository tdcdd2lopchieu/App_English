package com.nhom3.project;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class VeryEasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.very_easy_layout);

        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        WebView webView = (WebView) findViewById(R.id.ques);
        RadioButton radA = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton radB = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radC = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radD = (RadioButton) findViewById(R.id.radioButton4);
        ImageView btnNex = (ImageView) findViewById(R.id.btnNex);
        ImageView btnPre = (ImageView) findViewById(R.id.btnPre);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/webview4.html");


        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VeryEasyActivity.this,"Preview",Toast.LENGTH_SHORT).show();
            }
        });

        btnNex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VeryEasyActivity.this, Introduce2Activity.class);
                startActivity(intent);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(VeryEasyActivity.this,R.style.Dialog);
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
                        Intent intent = new Intent(VeryEasyActivity.this, ResultActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(intent);
                    }
                });

                dialog.show();
            }
        });



    }
}
