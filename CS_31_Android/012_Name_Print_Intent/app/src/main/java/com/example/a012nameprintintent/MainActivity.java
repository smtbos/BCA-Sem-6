package com.example.a012nameprintintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public String getStr(EditText ed) {
        return ed.getText().toString();
    }

    public void show(View view) {
        Intent i = new Intent(MainActivity.this, PrintName.class);
        i.putExtra("fn", getStr(findViewById(R.id.et1)));
        i.putExtra("mn", getStr(findViewById(R.id.et2)));
        i.putExtra("ln", getStr(findViewById(R.id.et3)));
        startActivity(i);
    }
}