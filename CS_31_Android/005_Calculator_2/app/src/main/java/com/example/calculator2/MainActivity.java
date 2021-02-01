package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = (EditText) findViewById(R.id.txt_x);
        final EditText sign = (EditText) findViewById(R.id.txt_sign);
        final EditText y = (EditText) findViewById(R.id.txt_y);
        final EditText res = (EditText) findViewById(R.id.txt_res);

        y.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                String s = sign.getText().toString();
                int a;
                int b;
                try {
                    a = Integer.parseInt(x.getText().toString());
                    b = Integer.parseInt(y.getText().toString());
                } catch (Exception e) {
                    a = 0;
                    b = 0;
                }
                if (s.equals("+")) {
                    res.setText(((Integer) (a + b)).toString());
                } else if (s.equals("-")) {
                    res.setText(((Integer) (a - b)).toString());
                } else if (s.equals("*")) {
                    res.setText(((Integer) (a * b)).toString());
                } else if (s.equals("/") && b != 0) {
                    res.setText(((Integer) (a / b)).toString());
                } else {
                    res.setText("Invalid Sign");
                }
                return false;
            }
        });
    }
}