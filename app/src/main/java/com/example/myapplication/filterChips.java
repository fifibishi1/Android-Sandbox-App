package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;

public class filterChips extends AppCompatActivity {
    Chip chip;
    MaterialButton addTag, selectButton;
    ChipGroup chipGroup;
    TextInputEditText textInputEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_chips);

        addTag = (MaterialButton) findViewById(R.id.addTag);
        selectButton = (MaterialButton) findViewById(R.id.showSelected);
        chipGroup = (ChipGroup) findViewById(R.id.groupChip);
        textInputEditText = (TextInputEditText) findViewById(R.id.textInput);

        addTag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String[] tags = textInputEditText.getText().toString().split(" ");
                LayoutInflater inflater = LayoutInflater.from(filterChips.this);
                for(String text : tags) {
                    Chip chip = (Chip) inflater.inflate(R.layout.chip_items, null, false);
                    chip.setText(text);
                    chip.setOnCloseIconClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            chipGroup.removeView(v);
                        }
                    });
                    chipGroup.addView(chip);
                }
            }
        });

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("");
                for(int i = 0; i < chipGroup.getChildCount(); i++) {
                    Chip chip = (Chip) chipGroup.getChildAt(i);
                    if (chip.isChecked()) {
                        if (i < chipGroup.getChildCount() - 1) {
                            result.append(chip.getText()).append(",");
                        } else {
                            result.append(chip.getText());
                        }
                    }
                }
                Toast.makeText(filterChips.this, "" + result.toString(), Toast.LENGTH_SHORT).show();
            }
        });


//        chip = (Chip) findViewById(R.id.chipButt);
//        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                Toast.makeText(filterChips.this, "Checked change to "+isChecked, Toast.LENGTH_SHORT).show();
//            }
//        });
//        chip.setOnCloseIconClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(filterChips.this, "Close icon clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}