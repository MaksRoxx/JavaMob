package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFirst = findViewById(R.id.bFirst);
        Button buttonSecond = findViewById(R.id.bSecond);
        Button buttonSird = findViewById(R.id.bSird);

        Intent intent1 = new Intent(this, SecondActivity.class);

        Intent intent2 = new Intent(this, ThirdActivity.class);
        intent2.putExtra("key", "value");

        Intent intent3 = new Intent(this, AnonActivity.class);

        buttonFirst.setOnClickListener(v -> startActivity(intent1));
        buttonSecond.setOnClickListener(v -> startActivity(intent2));
        buttonSird.setOnClickListener(v -> startActivity(intent3));
    }
}