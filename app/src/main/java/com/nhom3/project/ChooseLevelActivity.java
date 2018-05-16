package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLevelActivity extends AppCompatActivity {
    private Button veryEasy;
    private Button Easy;
    private Button Difficult;
    private Button veryDifficult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level_layout);

        veryEasy = (Button) findViewById(R.id.veryEasy);
        Easy = (Button) findViewById(R.id.Easy);
        Difficult = (Button) findViewById(R.id.Difficult);
        veryDifficult = (Button) findViewById(R.id.veryDifficult);


        veryEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLevelActivity.this, Introduce1Activity.class);
                startActivity(intent);
            }
        });

        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLevelActivity.this, Introduce2Activity.class);
                startActivity(intent);
            }
        });

        Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLevelActivity.this, Introduce3Activity.class);
                startActivity(intent);
            }
        });

        veryDifficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLevelActivity.this, Introduce4Activity.class);
                startActivity(intent);
            }
        });
    }
}
