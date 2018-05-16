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


public class DifficultActivity extends AppCompatActivity {
    private Button btnDiff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficult_layout);
        WebView webView = (WebView) findViewById(R.id.ques);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/webview3.html");

        ImageView btnNext = (ImageView) findViewById(R.id.btnNext);
        ImageView btnPrev = (ImageView) findViewById(R.id.btnPrev);
        ImageView imgSound = (ImageView) findViewById(R.id.sound);
        btnDiff = (Button) findViewById(R.id.btnDiff);

        btnDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DifficultActivity.this,"Next",Toast.LENGTH_SHORT).show();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DifficultActivity.this,"Preview",Toast.LENGTH_SHORT).show();
            }
        });

        imgSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(DifficultActivity.this,R.raw.audio);
                mediaPlayer.start();
            }
        });


    }


}
