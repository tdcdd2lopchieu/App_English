package com.nhom3.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChooseTestActivity extends AppCompatActivity{
    private Button btnChooseTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_test_layout);

        btnChooseTest = (Button) findViewById(R.id.btnChooseTest);
        btnChooseTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseTestActivity.this, ChooseLevelActivity.class);
                startActivity(intent);
            }
        });
    }
}
