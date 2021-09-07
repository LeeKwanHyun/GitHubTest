package com.bidamcat.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv);

        getSupportActionBar().setTitle("GitHub TEST");
        
        int a= 10;
        getSupportActionBar().setSubtitle("sub title : ");

        tv.setText("sample text");
    }
}
