package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowName(View view) {
        String name = ((EditText) findViewById(R.id.et1)).getText().toString();
        if (name.equals("")) {
            Toast.makeText(getApplicationContext(), "Please Enter Name", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
        }
    }
}