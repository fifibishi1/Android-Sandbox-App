package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class creditCardForm extends AppCompatActivity {
Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_form);

        CardForm cardForm = (CardForm) findViewById(R.id.cardform);
        TextView txtDes = (TextView) findViewById(R.id.payment_amount);
        Button pay = (Button) findViewById(R.id.btn_pay);
        txtDes.setText("$1999");
        pay.setText(String.format("Pay %s", txtDes.getText()));

        cardForm.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(creditCardForm.this,"Payment received!",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
