package com.example.administrator.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    boolean step = false;
    TextView tx;
    TextView tx1;
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
    int x = 0;
    int y = 0;
    String z;
    String k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tx = (TextView) findViewById(R.id.textView2);
        tx1 = (TextView) findViewById(R.id.textView);
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
        tx1.setText("");

    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        String exp = tx.getText().toString();
        String exp1 = tx1.getText().toString();

        int result;
        if (!step && (b.getText().equals("0")
                || b.getText().equals("1")
                || b.getText().equals("2")
                || b.getText().equals("3")
                || b.getText().equals("4")
                || b.getText().equals("5")
                || b.getText().equals("6")
                || b.getText().equals("7")
                || b.getText().equals("8")
                || b.getText().equals("9")
                || b.getText().equals(".")
        )) {
            tx.append(b.getText());
            x = Integer.parseInt(tx.getText().toString());
            return;
        }

        if (b.getText().equals("*")
                || b.getText().equals("/")
                || b.getText().equals("+")
                || b.getText().equals("-")
                ) {
            if (exp.equals("")) {
                return;
            }
            tx1.setText(b.getText());
            step = true;
            return;
        }

        if (step) {
            tx.setText("");
            step = false;
            tx.setText(b.getText());
            return;
        } else{if ((b.getText().equals("0")
                || b.getText().equals("1")
                || b.getText().equals("2")
                || b.getText().equals("3")
                || b.getText().equals("4")
                || b.getText().equals("5")
                || b.getText().equals("6")
                || b.getText().equals("7")
                || b.getText().equals("8")
                || b.getText().equals("9")
                || b.getText().equals(".")))
            tx.append(b.getText());
            k = tx.getText().toString();
            if(k.equals("")){
                return;
            }
            y = Integer.parseInt(k.toString());
        }

        if (b.getText().equals("C")) {
            if (exp.equals("")) {
                return;
            }
            tx.setText("");
            tx1.setText("");
        }

        else if (b.getText().equals("delete")) {
            if (exp.equals("")) {
                return;
            }
            tx.setText(exp.substring(0, exp.length() - 1));
        } else if (b.getText().equals("=")) {
            if (exp.equals("")) {
                return;
            }

            if (tx1.getText().equals("+")) {
                tx.setText(String.valueOf(x + y));
            } else if (tx1.getText().equals("-")) {
                tx.setText(String.valueOf(x - y));
            }
            else if (tx1.getText().equals("*")) {
                tx.setText(String.valueOf(x * y));
            }
            else if (tx1.getText().equals("/")) {
                tx.setText(String.valueOf(x / y));
            }

        }
    }
}


