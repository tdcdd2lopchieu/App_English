package com.nhom3.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearningProcessActivity extends AppCompatActivity {
    private Button btnLearnPRC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_process_layout);


        btnLearnPRC = (Button) findViewById(R.id.btnLearnPRC);
        btnLearnPRC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearningProcessActivity.this, ChooseTestActivity.class);
                startActivity(intent);
            }
        });

    }
}
