package com.example.javamob;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ToggleButton toggleButton = new ToggleButton(this);
        toggleButton.setTextOn("Включено");
        toggleButton.setTextOff("Выключено");

        LinearLayout layout = findViewById(R.id.layout);
        layout.addView(toggleButton);
    }
}