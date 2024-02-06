package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView dashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        dashText=findViewById(R.id.dashText);
        Intent intent = getIntent();
        String item = intent.getStringExtra("about_dash");
            dashText.setText(item);
    }
}