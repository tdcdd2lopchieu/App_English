package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    private Button reviewTest;
    private Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);

        reviewTest = (Button) findViewById(R.id.reviewTest);
        home = (Button) findViewById(R.id.home);

        reviewTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ResultActivity.this,"Preview",Toast.LENGTH_SHORT).show();
            }
        });



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, LearningProcessActivity.class);
                startActivity(intent);
            }
        });


    }
}
