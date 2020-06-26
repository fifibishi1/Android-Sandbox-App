package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hanks.passcodeview.PasscodeView;

public class passcode extends AppCompatActivity {
PasscodeView passcodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);
        passcodeView = findViewById(R.id.passcodeView);
        passcodeView.setPasscodeLength(4).setLocalPasscode("1234").setListener(new PasscodeView.PasscodeViewListener() {
            @Override
            public void onFail() {
                Toast.makeText(passcode.this, "Passcode is incorrect", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(String number) {
                Intent intent = new Intent(passcode.this, passSuccess.class);
                startActivity(intent);
            }
        });

    }
}