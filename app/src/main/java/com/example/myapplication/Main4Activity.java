package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {
    EditText username, password;
    Button loginButton;
    CheckBox rememberMe;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login);
        rememberMe = findViewById(R.id.checkBox);
        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember", "");
        if (checkbox.equals("true")) {
            Intent intent = new Intent(Main4Activity.this, Main2Activity.class);// redirect/persist to logout
            startActivity(intent);
        } else if(checkbox.equals(false)) {
            Toast.makeText(this, "Please Sign In.", Toast.LENGTH_SHORT).show();
        }

        rememberMe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "true");
                    editor.apply();
                    Toast.makeText(Main4Activity.this, "User information remembered", Toast.LENGTH_SHORT).show();
                } else if (!buttonView.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "false");
                    editor.apply();
                    Toast.makeText(Main4Activity.this, "User information not remembered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void changePage(View v) {
        String logUser = username.getText().toString();
        String logPass = password.getText().toString();

        if (logUser.equals("mesmerbot@mesmer.hq") && logPass.equals("bot1234")) {
            Intent intent = new Intent(Main4Activity.this, Main2Activity.class);
            startActivity(intent);
        } else if (logUser.equals("") || logPass.equals("")) {
            Toast.makeText(getBaseContext(), "Enter Username and Password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getBaseContext(), "Wrong Username and Password entered", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetAcc(View v) {
            Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
            startActivity(intent);
        }
    }
