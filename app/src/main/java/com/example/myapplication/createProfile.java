package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class createProfile extends AppCompatActivity implements View.OnClickListener{
Button createButton;
EditText name,email,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createprofile);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        createButton = (Button) findViewById(R.id.registerButton);
        createButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registerButton:
                Intent intent = new Intent(createProfile.this, dialog.class);
                startActivity(intent);
            break;
        }
    }
}
