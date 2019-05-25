package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCalcActivity(View v){
        startActivity(new Intent(MainActivity.this, CalcActivity.class));
    }

    public void goAlertActivity(View v){
        startActivity(new Intent(MainActivity.this, AlertActivity.class));
    }

    public void goNaviActivity(View v){
        startActivity(new Intent(MainActivity.this, NaviActivity.class));
    }

}
