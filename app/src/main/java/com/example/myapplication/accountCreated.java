package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class accountCreated extends AppCompatActivity implements View.OnClickListener {
    Button securityButt;
    Button dbTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);
        Toast.makeText(accountCreated.this, "Security answers saved", Toast.LENGTH_SHORT).show();
        securityButt = (Button) findViewById(R.id.securityButt);
        securityButt.setOnClickListener(this);

        dbTest = (Button) findViewById(R.id.dbTest);
        dbTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.securityButt:
                Intent intent = new Intent(accountCreated.this, setSecurity.class);
                startActivity(intent);
                break;

            case R.id.dbTest:
                Intent intent2 = new Intent(accountCreated.this, dbActivity.class);
                startActivity(intent2);
                break;
        }
    }

}