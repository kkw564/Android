package com.example.test;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {
    private String[] items = {"강아지","고양이","호랑이","코끼리","원숭이"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    public void popupList(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
        builder.setTitle("리스트 내용");
        builder.setItems(items, new DialogInterface.OnClickListener() {

            // 리스트 내부의 특정한 내용을 클릭했을때 처리
            @Override
            public void onClick(DialogInterface dialog, int here) {
                Toast.makeText(getApplicationContext(), items[here], Toast.LENGTH_SHORT).show();
            }
        });
        // 다이얼로그에 해당하는 객체 할당
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void exit(View v){
        Button exitBtn = (Button) findViewById(R.id.exit_btn);
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
        builder.setMessage("정말 종료하시겠습니까?");
        builder.setTitle("종료 알림창")
                .setCancelable(false) // 종료 알림창 자체 취소 불가능으로
                // 예 눌렀을 때
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish(); // 앱 종료
                    }
                })
                // 아니오 눌렀을 때
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel(); // 다이얼로그 창이 종료되도록 만들어준다.
                    }
                });

        AlertDialog alert = builder.create();
        alert.setTitle("종료 알림창");
        alert.show();
    }
}
