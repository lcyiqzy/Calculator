package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
    TextView tx;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button point;
    Button equal;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button delete;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tx =(TextView) findViewById(R.id.textView2);
        num1 = (Button) findViewById(R.id.button);
        num2 = (Button) findViewById(R.id.button2);
        num3 = (Button) findViewById(R.id.button3);
        num4 = (Button) findViewById(R.id.button4);
        num5 = (Button) findViewById(R.id.button5);
        num6 = (Button) findViewById(R.id.button6);
        num7 = (Button) findViewById(R.id.button7);
        num8 = (Button) findViewById(R.id.button8);
        num9 = (Button) findViewById(R.id.button9);
        num0 = (Button) findViewById(R.id.button10);

        point = (Button) findViewById(R.id.button11);
        equal = (Button) findViewById(R.id.button12);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        delete = (Button) findViewById(R.id.delete);
        reset = (Button) findViewById(R.id.reset);


        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        point.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        delete.setOnClickListener(this);
        reset.setOnClickListener(this);
        tx.setText("");
    }
    @Override
    public void onClick (View v){
       Button b =(Button)v;

       if(b.getText().equals("0")
              ||b.getText().equals("1")
              ||b.getText().equals("2")
              ||b.getText().equals("3")
              ||b.getText().equals("4")
              ||b.getText().equals("5")
              ||b.getText().equals("6")
              ||b.getText().equals("7")
              ||b.getText().equals("8")
              ||b.getText().equals("9")
              ||b.getText().equals(".")){
           tx.append(b.getText());
        }
        String value = tx.getText().toString();
        int number = Integer.valueOf(value);



       if(b.getText().equals("C")){
           tx.setText("");
       }

        }
    }


