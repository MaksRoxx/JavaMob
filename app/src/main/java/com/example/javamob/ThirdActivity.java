package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv = findViewById(R.id.tv);
        String data = getIntent().getStringExtra("key");
        tv.setText(data);
    }
}