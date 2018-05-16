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




    }
}
