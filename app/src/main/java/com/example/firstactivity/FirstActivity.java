package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btnOk;
    TextView number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        btnOk = findViewById(R.id.btnOK);
        number1 = findViewById(R.id.entNum1);
        number2 = findViewById(R.id.entNum2);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                Intent intent= new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("number1",num1);
                intent.putExtra("number2",num2);
                startActivity(intent);
            }
    });

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
    }

}