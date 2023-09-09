package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1, e2, e3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Float d=Float.parseFloat(s);
                celcius(d);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e2.getText().toString();
                Float d=Float.parseFloat(s);
                farenheit(d);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e3.getText().toString();
                Float d=Float.parseFloat(s);
                kelvin(d);
            }
        });



    }
    public void celcius(Float i)
    {
        Float d1,d2;
        d1=i+273;
        d2=((i*9)/5)+32;
        String s1=Float.toString(d1);
        String s2=Float.toString(d2);
        e2.setText(s2+" Fahrenheit");
        e3.setText(s1+" Kelvin");


    }
    public void farenheit(Float i)
    {
        Float d1,d2;

        d2=(i-32)*5/9;
        d1=d2+273;
        String s1=Float.toString(d1);
        String s2=Float.toString(d2);
        e1.setText(s2+" Celsius");
        e3.setText(s1+" Kelvin");


    }
    public void kelvin(Float i)
    {
        Float d1,d2;
        d1=i-273;
        d2=(i-273)*9/5;
        d2=d2+32;
        String s1=Float.toString(d1);
        String s2=Float.toString(d2);
        e1.setText(s1+" Celsius");
        e2.setText(s2+" Fahrenheit");


    }
}