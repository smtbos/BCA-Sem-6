package com.example.a009datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        DatePicker spd = (DatePicker) findViewById(R.id.spd);
        String d = "Day : " + spd.getDayOfMonth();
        String m = "Month : " + (spd.getMonth() + 1);
        String y = "Year : " + spd.getYear();
        Toast.makeText(getApplicationContext(), d + "\n " + m + "\n " + y, Toast.LENGTH_SHORT).show();
    }
}