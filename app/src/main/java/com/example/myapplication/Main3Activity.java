package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    EditText emailAcc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        emailAcc = (EditText) findViewById(R.id.resetEmail);
    }
    public void subRes(View v) {
        String logEmail = emailAcc.getText().toString();

        if (logEmail.equals("mesmerbot@mesmer.hq")) {
            Toast.makeText(getBaseContext(), "Email sent with reset instructions!", Toast.LENGTH_LONG).show();
        } else if (logEmail.equals("")) {
            Toast.makeText(getBaseContext(), "Enter email address", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getBaseContext(), "Email entered is not registered", Toast.LENGTH_SHORT).show();
        }
    }

}
