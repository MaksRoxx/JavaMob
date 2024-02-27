package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = findViewById(R.id.bCreate);
        EditText edName = findViewById(R.id.edName);
        EditText edAge = findViewById(R.id.edAge);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewPersonActivity.class);
            String name = edName.getText().toString();
            int age = Integer.parseInt(edAge.getText().toString());

            Person person = new Person(name, age);
            intent.putExtra("person", person);
            startActivity(intent);
        });
    }
}