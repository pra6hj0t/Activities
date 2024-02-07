package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.activities.data.User;

import java.io.Serializable;

public class About extends AppCompatActivity {
    TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutText=findViewById(R.id.about_text);

        Intent intent = getIntent();
        String item = intent.getStringExtra("about_abt");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            User user = intent.getSerializableExtra("user", User.class);

            Log.w("Username",user.getName());
            Log.w("Email",user.getEmail());

        }else{
            Bundle extras = intent.getExtras();
            User user = (User) extras.getSerializable("user");
            Log.w("Username",user.getName());
            Log.w("Email",user.getEmail());
        }
        aboutText.setText(item);

    }
}