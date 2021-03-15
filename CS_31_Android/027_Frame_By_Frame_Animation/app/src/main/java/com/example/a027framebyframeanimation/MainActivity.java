package com.example.a027framebyframeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView i = (ImageView) findViewById(R.id.im1);
        AnimationDrawable ad = (AnimationDrawable) i.getBackground();
        ad.start();

        final ImageView imsel = findViewById(R.id.imsel);
        imsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imsel.setActivated(!imsel.isActivated());
            }
        });
    }
}