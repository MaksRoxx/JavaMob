package com.example.javamob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.MATCH_PARENT
        ));

        TableRow row = new TableRow(this);

        Button button1 = new Button(this);
        button1.setText("Button 1");
        TableRow.LayoutParams layoutParams1 = new TableRow.LayoutParams();
        button1.setLayoutParams(layoutParams1);
        row.addView(button1);

        Button button2 = new Button(this);
        button2.setText("Button 2");
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams();
        button2.setLayoutParams(layoutParams2);
        row.addView(button2);

        tableLayout.addView(row);

    }
}