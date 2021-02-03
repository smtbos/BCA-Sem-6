package com.example.a007swap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swap(View view) {
        ((TextView) findViewById(R.id.c)).setText("A = " + ((EditText) findViewById(R.id.b)).getText().toString() + ", B = " + ((EditText) findViewById(R.id.a)).getText().toString());
    }
}