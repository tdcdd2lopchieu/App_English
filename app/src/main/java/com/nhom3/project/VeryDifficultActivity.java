package com.nhom3.project;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class VeryDifficultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.very_difficult_layout);
        WebView webView = (WebView) findViewById(R.id.ques);
        ImageView imgSound = (ImageView) findViewById(R.id.sound);
        ImageView btnPrev = (ImageView) findViewById(R.id.btnPre);
        ImageView btnNext = (ImageView) findViewById(R.id.btnNext);
        Button btnFinish = (Button) findViewById(R.id.submit);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/webview4.html");

        imgSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(VeryDifficultActivity.this,R.raw.audio);
                mediaPlayer.start();
            }
        });

        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final Dialog dialog = new Dialog(VeryDifficultActivity.this,R.style.Dialog);
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

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VeryDifficultActivity.this,"Next question",Toast.LENGTH_SHORT).show();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VeryDifficultActivity.this,"Previous question",Toast.LENGTH_SHORT).show();
            }
        });


        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(VeryDifficultActivity.this,R.style.Dialog);
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
                        Intent intent = new Intent(VeryDifficultActivity.this, ResultActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(intent);
                    }
                });

                dialog.show();

            }
        });
    }




}
