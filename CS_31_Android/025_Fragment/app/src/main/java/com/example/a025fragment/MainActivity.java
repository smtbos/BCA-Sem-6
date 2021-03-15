package com.example.a025fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import  android.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swap(View view) {
        Fragment fg;
        String s;
        if(view == findViewById(R.id.b1))
        {
            fg = new F_One();
            s = "Fragment One";
        }else{
            fg = new F_Two();
            s = "Fragment Two";
        }
        Toast.makeText(getApplicationContext(), s,Toast.LENGTH_SHORT).show();
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.f, fg);
        ft.commit();
    }
}