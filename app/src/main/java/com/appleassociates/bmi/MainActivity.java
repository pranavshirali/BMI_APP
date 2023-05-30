package com.appleassociates.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCal;
        EditText weight, heightft;
        TextView result;

        btnCal = findViewById(R.id.buttoncal);
        weight = findViewById(R.id.editWeight);
        heightft = findViewById(R.id.editHeightFt);
        result = findViewById(R.id.txtResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int wt = (int) Double.parseDouble(weight.getText().toString());
                int feet = (int) Double.parseDouble(heightft.getText().toString());
                double totalM = feet * 0.305;

                double bmi = wt / (totalM*totalM);

                if (bmi > 25){
                    result.setText(R.string.overweight);
                } else if (bmi < 18.5) {
                    result.setText(R.string.underweight);
                }
                else {
                    result.setText(R.string.healthy);
                }
            }
        });

    }
}