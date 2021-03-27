package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView4;
    double liters;
    double gallons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumber);
        textView4 = findViewById(R.id.textView4);

    }
    public void onButtonClick(View v) {
        liters = Double.parseDouble(editText.getText().toString());
        gallons = liters*0.264172;
        textView4.setText(String.valueOf(gallons));
    }


}