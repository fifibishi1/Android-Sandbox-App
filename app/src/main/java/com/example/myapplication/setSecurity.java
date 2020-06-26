package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class setSecurity extends AppCompatActivity {
    EditText q1, q2, q3;
    Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_security);

        q1 = (EditText) findViewById(R.id.question1);
        q2 = (EditText) findViewById(R.id.question2);
        q3 = (EditText) findViewById(R.id.question3);
        verify = (Button) findViewById(R.id.verify);
    }

    public void verifyAns(View v) {
        String logQ1 = q1.getText().toString();
        String logQ2 = q2.getText().toString();
        String logQ3 = q3.getText().toString();
        List<User> users = dbActivity.myAppDatabase.myDao().getUsers();

        for(User usr : users) {
            int id = usr.getId();
            String name = usr.getName();
            String email = usr.getEmail();
            if (id == Integer.parseInt(logQ1) && logQ2.equals(name) && logQ3.equals(email)) {
                Intent intent = new Intent(setSecurity.this, passSuccess.class);
                startActivity(intent);
            } else if (logQ1.equals("") || logQ2.equals("") || logQ3.equals("")) {
                Toast.makeText(getBaseContext(), "Enter answers", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getBaseContext(), "One or more answers are wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
//1234, Atx, vegas