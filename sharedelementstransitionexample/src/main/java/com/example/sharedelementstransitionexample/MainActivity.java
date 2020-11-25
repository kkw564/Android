package com.example.sharedelementstransitionexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_image_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                View imageView = findViewById(R.id.main_image_view);
                View textView = findViewById(R.id.main_title);
                System.out.println("imageView.getTransitionName() :: " + imageView.getTransitionName() + " textView.getTransitionName() :: " + textView.getTransitionName() );
                Pair<View, String> imageViewPair = Pair.create(imageView, imageView.getTransitionName());
                Pair<View, String> textViewPair = Pair.create(textView, textView.getTransitionName());

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, imageViewPair, textViewPair);
                startActivity(intent, options.toBundle());
            }
        });
    }
}
