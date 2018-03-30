package com.nhom3.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class VeryDifficultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.very_difficult_layout);

        TextView textView = (TextView) findViewById(R.id.ques);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
