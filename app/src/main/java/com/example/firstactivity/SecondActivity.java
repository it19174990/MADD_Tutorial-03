package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        number1 = findViewById(R.id.getNum1);
        number2 = findViewById(R.id.getNum2);

        Intent intent = getIntent();
        String num1 = intent.getStringExtra("number1");
        String num2 = intent.getStringExtra("number2");

        number1.setText(num1);
        number2.setText(num2);
    }
}