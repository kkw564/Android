package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }

    public void addClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1_value);
        EditText num2 = (EditText) findViewById(R.id.num2_value);
        TextView result = (TextView) findViewById(R.id.resultView);

        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int ret = n1 + n2;

            String str = Integer.toString(ret);
            result.setText(str);
            Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
    }
    public void subClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1_value);
        EditText num2 = (EditText) findViewById(R.id.num2_value);
        TextView result = (TextView) findViewById(R.id.resultView);

        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int ret = n1 - n2;

            String str = Integer.toString(ret);
            result.setText(str);
            Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void mulClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1_value);
        EditText num2 = (EditText) findViewById(R.id.num2_value);
        TextView result = (TextView) findViewById(R.id.resultView);

        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int ret = n1 * n2;

            String str = Integer.toString(ret);
            result.setText(str);
            Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void divClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1_value);
        EditText num2 = (EditText) findViewById(R.id.num2_value);
        TextView result = (TextView) findViewById(R.id.resultView);

        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int ret = n1 / n2;

            String str = Integer.toString(ret);
            result.setText(str);
            Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
