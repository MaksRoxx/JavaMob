package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText(R.string.hello_practice_java);
//        textView.setTextSize(26);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_PARENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        // установка корня лейаута
//        setContentView(constraintLayout);

        EditText editText = findViewById(R.id.editTextText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView4);

        textView.setMaxWidth(1000);

        button.setOnClickListener(v -> {
            String inputText = editText.getText().toString();
            textView.setText("You entered: " + inputText);
        });
    }
}