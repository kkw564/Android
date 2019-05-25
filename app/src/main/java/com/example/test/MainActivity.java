package com.example.test;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

    public void makeAlertToMove(View v){
        // AlertDialog를 만들 수 있는 builder를 하나 만든다.
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Navigation 액티비티를 보시겠습니까?");

        builder.setTitle("알림창")
                .setCancelable(false)
                .setPositiveButton("한번 가보자", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(MainActivity.this, NaviActivity.class));
                    }
                })
                .setNegativeButton("아니 괜찮아", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = builder.create();
        alert.setTitle("알림창");
        alert.show();
    }
}
