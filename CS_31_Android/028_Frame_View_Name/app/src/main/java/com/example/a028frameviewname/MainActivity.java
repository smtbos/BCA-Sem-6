package com.example.a028frameviewname;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView i = findViewById(R.id.im);
        AnimationDrawable ad = (AnimationDrawable) i.getBackground();
        ad.start();
    }
}