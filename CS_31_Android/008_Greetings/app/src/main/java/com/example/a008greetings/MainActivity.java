package com.example.a008greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button[] bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = new Button[4];

        bt[0] = (Button) findViewById(R.id.b1);
        bt[1] = (Button) findViewById(R.id.b2);
        bt[2] = (Button) findViewById(R.id.b3);
        bt[3] = (Button) findViewById(R.id.b4);
    }


    public void make(View view) {
        String s = bt[0].getText().toString();
        bt[0].setText(bt[3].getText().toString());
        bt[3].setText(bt[2].getText().toString());
        bt[2].setText(bt[1].getText().toString());
        bt[1].setText(s);
    }
}