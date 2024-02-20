package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.example.javamob.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String COUNT_KEY = "countKey";
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadCount();
        binding.button.setOnClickListener(t -> {
            count++;
            saveCount();
            loadCount();
        });
    }

    private void saveCount() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(COUNT_KEY, count);
        editor.apply();
    }

    private void loadCount() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        count = sharedPreferences.getInt(COUNT_KEY, 0);
        binding.textView.setText("Count: " + count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("KKK", "destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("KKK", "restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("KKK", "stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("KKK", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("KKK", "resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("KKK", "start");
    }
}