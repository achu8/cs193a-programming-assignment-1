package com.example.albert.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate_click(View view) {
        EditText mealCost = (EditText) findViewById(R.id.mealCost);
        EditText tipPercentage = (EditText) findViewById(R.id.tipPercentage);
        TextView tip = (TextView) findViewById(R.id.tip);

        tip.setText(String.valueOf(
                Double.parseDouble(mealCost.getText().toString()) *
                Double.parseDouble(tipPercentage.getText().toString()) /
                100));
    }
}
