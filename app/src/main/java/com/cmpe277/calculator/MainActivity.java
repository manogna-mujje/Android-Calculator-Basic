package com.cmpe277.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView result;
    private  TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etNum1);
        num2 = (EditText)findViewById(R.id.etNum2);
        add = (Button)findViewById(R.id.btnAdd);
        subtract = (Button)findViewById(R.id.btnSubtract);
        multiply = (Button)findViewById(R.id.btnMultiply);
        divide = (Button)findViewById(R.id.btnDivide);
        result = (TextView)findViewById(R.id.tvResult);
        msg = (TextView)findViewById(R.id.tvError);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    msg.setText("Please enter both numbers before symbols!");
                } else {
                    msg.setText("");
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int sum = number1 + number2;
                    result.setText(String.valueOf(sum));
                }

            }
        });



        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    msg.setText("Please enter both numbers before symbols!");
                } else {
                    msg.setText("");
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int diff = number1 - number2;
                    result.setText(String.valueOf(diff));
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    msg.setText("Please enter both numbers before symbols!");
                } else {
                    msg.setText("");
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int product = number1 * number2;
                    result.setText(String.valueOf(product));
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    msg.setText("Please enter both numbers before symbols!");
                } else {
                    msg.setText("");
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    if(number2 == 0) {
                        msg.setText("Denominator can not be zero!");
                    } else {
                        int sol = number1 / number2;
                        result.setText(String.valueOf(sol));
                    }
                }
            }
        });

    }
}
