package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        ));

        Button button1 = new Button(this);
        button1.setText("Button 1");
        FrameLayout.LayoutParams layoutParams1 = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams1.gravity = Gravity.CENTER;
        button1.setLayoutParams(layoutParams1);
        frameLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("Button 2");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams2.gravity = Gravity.BOTTOM | Gravity.END;
        button2.setLayoutParams(layoutParams2);
        frameLayout.addView(button2);

    }
}