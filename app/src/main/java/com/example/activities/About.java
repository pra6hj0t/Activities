package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.activities.data.User;

public class About extends AppCompatActivity {
    TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutText=findViewById(R.id.about_text);

        Intent intent = getIntent();
        String item = intent.getStringExtra("about_abt");
        intent.getSerializableExtra("user", User.class);
        aboutText.setText(item);

    }
}