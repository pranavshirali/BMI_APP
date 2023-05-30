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
        EditText weight, heightft, heightin;
        TextView result;

        btnCal = findViewById(R.id.buttoncal);
        weight = findViewById(R.id.editWeight);
        heightft = findViewById(R.id.editHeightFt);
        heightin = findViewById(R.id.editHeightInc);
        result = findViewById(R.id.txtResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(weight.getText().toString());
                int feet = Integer.parseInt(heightft.getText().toString());
                int inch = Integer.parseInt(heightin.getText().toString());

                int totalIn = feet*12 + inch;
                double totalCm = totalIn * 2.53;
                double totalM = totalCm / 100;

                double bmi = wt / (totalM*totalM);

                if (bmi > 25){
                    result.setText("You are overweight!!");
                } else if (bmi < 18) {
                    result.setText("Your are underweight");
                }
                else {
                    result.setText("You are healty");
                }
            }
        });

    }
}