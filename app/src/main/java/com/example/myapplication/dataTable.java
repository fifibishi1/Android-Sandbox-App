package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;

public class dataTable extends AppCompatActivity {

    public boolean tableFlg = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_table);
    }

    public void collapseTable(View view) {
        TableLayout table = findViewById(R.id.table);
        Button expandTbl = findViewById(R.id.expandTab);

        table.setColumnCollapsed(1, tableFlg);
        table.setColumnCollapsed(2, tableFlg);

        if (tableFlg) {
            tableFlg = false;
            expandTbl.setText("Explore Full Data Table");
        } else {
            tableFlg = true;
            expandTbl.setText("Hide Full Data Table");
        }
    }

}