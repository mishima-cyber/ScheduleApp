package com.example.a210407scheduleapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlanView extends AppCompatActivity {

    private String currentDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_view_content);

        Intent intent=getIntent();
        currentDate=intent.getStringExtra("date");

        TextView currentDateText=(TextView)findViewById(R.id.currentDate);
        currentDateText.setText(currentDate);

    }
}
