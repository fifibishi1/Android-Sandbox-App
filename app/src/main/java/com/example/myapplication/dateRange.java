package com.example.myapplication;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class dateRange extends AppCompatActivity {
    private TextView selectDate;
    private DatePickerDialog.OnDateSetListener dSetList;
    private static final String TAG = "dateRange";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_range);
        selectDate = (TextView) findViewById(R.id.selected_date);

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(dateRange.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth, dSetList, year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        dSetList = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                Log.d(TAG, "OnDataSet: mm/dd/yyyy: " + month + "/" + dayOfMonth + "/" + year);

                String todaysDate = month + "/" + dayOfMonth + "/" + year;
                selectDate.setText(todaysDate);
            }
        };
    }
}
