package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_person);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvAge = findViewById(R.id.tvAge);

        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");

        tvName.setText(person.getName());
        tvAge.setText(String.valueOf(person.getAge()));
    }
}