package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = (EditText) findViewById(R.id.txt_x);
        final EditText y = (EditText) findViewById(R.id.txt_y);
        final EditText res = (EditText) findViewById(R.id.txt_res);

        Button plus = (Button) findViewById(R.id.btn_plus);
        Button minus = (Button) findViewById(R.id.btn_minus);
        Button mul = (Button) findViewById(R.id.btn_mul);
        Button div = (Button) findViewById(R.id.btn_div);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(((Integer) (Integer.parseInt(x.getText().toString()) + Integer.parseInt(y.getText().toString()))).toString());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(((Integer) (Integer.parseInt(x.getText().toString()) - Integer.parseInt(y.getText().toString()))).toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(((Integer) (Integer.parseInt(x.getText().toString()) * Integer.parseInt(y.getText().toString()))).toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(((Integer) (Integer.parseInt(x.getText().toString()) / Integer.parseInt(y.getText().toString()))).toString());
            }
        });

    }
}