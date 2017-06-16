package com.example.panhavoan.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultView;
    double number1, number2, result;
    Button add, minus, multi, divice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num_1);
        num2 = (EditText) findViewById(R.id.num_2);
        resultView = (TextView) findViewById(R.id.result_view);
        add = (Button) findViewById(R.id.btnAdd);
        minus = (Button) findViewById(R.id.btnMinus);
        multi = (Button) findViewById(R.id.btnMulti);
        divice = (Button) findViewById(R.id.btnDivice);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble((num2.getText().toString()));
                result= number1 + number2;
                if(Math.abs(result) == result){
                    result = Math.abs(result);
                    resultView.setText(String.format("%.0f",result));
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble((num2.getText().toString()));
                result= number1 - number2;
                if(Math.abs(result) == result){
                    result = Math.abs(result);
                    resultView.setText(String.format("%.0f",result));
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble((num2.getText().toString()));
                result= number1 * number2;
                if(Math.abs(result) == result){
                    result = Math.abs(result);
                    resultView.setText(String.format("%.0f",result));
                }
            }
        });
        divice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble((num2.getText().toString()));
                result= number1 / number2;
                String test = String.format("%.0f",result);
                Double test1 = Double.parseDouble(test);
                if(test1 == result){
                    result = Math.abs(result);
                    resultView.setText(String.format("%.0f",result));
                }else{
                    resultView.setText(String.format("%.1f",result));
                }
            }
        });
    }
}
