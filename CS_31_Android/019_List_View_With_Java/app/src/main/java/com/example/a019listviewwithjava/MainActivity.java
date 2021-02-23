package com.example.a019listviewwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Amreli");
        lst.add("Rajula");
        lst.add("Dhasa");
        lst.add("Lathi");

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.mytextview, lst);

        ListView lv = (ListView) findViewById(R.id.lv);

        lv.setAdapter(aa);

    }
}