package com.example.javamob;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText editTextSingleLine;
    private EditText editTextMultiLine;
    private Button button;
    private Button showToastButton;
    private Button snackbarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSingleLine = findViewById(R.id.editTextSingleLine);
        editTextMultiLine = findViewById(R.id.editTextMultiLine);
        showToastButton = findViewById(R.id.showToastButton);
        snackbarButton = findViewById(R.id.snackbarButton);
        button = findViewById(R.id.button);
        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        CheckBox checkbox2 = findViewById(R.id.checkbox2);

        button.setOnClickListener(v -> {
            String textFromFirstEditText = editTextSingleLine.getText().toString();
            editTextMultiLine.setText(textFromFirstEditText);
        });

        showToastButton.setOnClickListener(v -> showToast());

        snackbarButton.setOnClickListener(v -> showSnackbar(v));

        checkbox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "Checkbox 1 выбран", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Checkbox 1 не выбран", Toast.LENGTH_SHORT).show();
            }
        });

        checkbox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "Checkbox 2 выбран", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Checkbox 2 не выбран", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showToast() {
        Toast toast = Toast.makeText(getApplicationContext(), "Привет, мир!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

    private void showSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, "Это Snackbar!", Snackbar.LENGTH_LONG);

        snackbar.setAction("Отмена", v -> {
            snackbar.setBackgroundTint(getResources().getColor(R.color.black));
            snackbar.setTextColor(getResources().getColor(android.R.color.white));
            snackbar.setActionTextColor(getResources().getColor(android.R.color.white));
        });

        snackbar.show();
    }
}