package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class scrollText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_text);
        TextView titleTop = (TextView) findViewById(R.id.titleTop);
        TextView scrollText = (TextView) findViewById(R.id.scrollText);

        titleTop.setText("Random Title Text");

        StringBuilder stringBuilder = new StringBuilder();

        String randMessage = "Random message to test scrollable feature on app. ";
        stringBuilder.append("        ");
        for (int i = 0; i < 30; i++) {
            stringBuilder.append(randMessage);
        }
            stringBuilder.append("\n");
        stringBuilder.append("        ");
        for (int i = 0; i < 30; i++) {
            stringBuilder.append(randMessage);
        }
        scrollText.setText(stringBuilder.toString());
    }
}