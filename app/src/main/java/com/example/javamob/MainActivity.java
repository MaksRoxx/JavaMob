package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String welcomeMessage = getString(R.string.welcome_message);

        String username = "John";
        String hiMessage = getString(R.string.welcome_user, username);

        // Использование Plurals
        int messageCount = 5;
        String message = getResources().getQuantityString(R.plurals.number_of_messages, messageCount, messageCount);

        // Получение массива строк из ресурсов
        String[] planets = getResources().getStringArray(R.array.planets_array);

        // Получение значения размера из ресурсов
        float textSize = getResources().getDimension(R.dimen.text_size);

        // Получение цвета из ресурсов
        int backgroundColor = getColor(R.color.app_background);


        ImageView imageView = findViewById(R.id.imageView);
        String filename = "img.png";
        try(InputStream inputStream = getApplicationContext().getAssets().open(filename)){
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}