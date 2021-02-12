package com.example.a010timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = (TimePicker) findViewById(R.id.tp1);
    }

    public void btn1_click(View view) {
        tp.setIs24HourView(!tp.is24HourView());
    }

    public void btn2_click(View view) {
        Toast.makeText(getApplicationContext(), "" + tp.getCurrentHour() + " : " + tp.getCurrentMinute(), Toast.LENGTH_SHORT).show();
    }
}