package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button signup_btn,login_btn,dashboard_btn,about_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findingViews();

        signup_btn.setOnClickListener(view->{
            Intent intent = new Intent(this, Signup.class);
            startActivity(intent);
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
        dashboard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });

        
    }

    private void findingViews() {
        signup_btn=findViewById(R.id.signup_btn);
        login_btn=findViewById(R.id.login_btn);
        dashboard_btn=findViewById(R.id.dashboard_btn);
        about_btn=findViewById(R.id.about_btn);
    }
}