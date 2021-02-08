package com.example.a012nameprintintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class PrintName extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_name);
        Bundle b = getIntent().getExtras();

        Toast.makeText(getApplicationContext(), b.getString("fn") + " " + b.getString("mn") + " " + b.getString("ln"), Toast.LENGTH_SHORT).show();
        ;
    }
}