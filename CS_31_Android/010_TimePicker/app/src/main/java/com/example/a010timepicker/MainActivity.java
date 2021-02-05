package com.example.a010timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_click(View view) {
        TimePicker tp = (TimePicker) findViewById(R.id.tp1);
        tp.setIs24HourView(!tp.is24HourView());
    }
}