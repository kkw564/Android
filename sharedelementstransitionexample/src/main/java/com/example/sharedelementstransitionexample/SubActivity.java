package com.example.sharedelementstransitionexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        System.out.println("?!?21#?!@#?!@#?");
    }
}
