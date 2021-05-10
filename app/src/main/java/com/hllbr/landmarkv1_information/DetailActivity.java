package com.hllbr.landmarkv1_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView maintext,detailtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        maintext = findViewById(R.id.mainText);
        detailtext = findViewById(R.id.detailText);
        Intent intent = getIntent();
        String nameknow = intent.getStringExtra("name");
        String detail = intent.getStringExtra("detail");
        maintext.setText(nameknow);
        detailtext.setText(detail);
    }
}