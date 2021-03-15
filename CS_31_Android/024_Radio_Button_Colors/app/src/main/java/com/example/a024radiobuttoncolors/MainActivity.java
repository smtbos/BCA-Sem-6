package com.example.a024radiobuttoncolors;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String c[][] = new String[][]{
                {"Red",         "#FF0000"},
                {"Dark Red",    "#8B0000"},
                {"Pink",        "#FF69B4"},
                {"Tomato",      "#FF6347"},
                {"Orange",      "#FFA500"},
                {"Yellow",      "#FFFF00"},
                {"Violet",      "#EE82EE"},
                {"Dark Violet", "#9400D3"},
                {"Purple",      "#800080"},
                {"Green",       "#228B22"},
        };

        RadioGroup rg = (RadioGroup) findViewById(R.id.color);
        TextView tv = (TextView) findViewById(R.id.tv);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv.setBackgroundColor(Color.parseColor(c[checkedId - 1][1]));
            }
        });
        for (int i = 0; i < c.length; i++) {
            RadioButton rb = new RadioButton(this);
            rb.setId(View.generateViewId());
            rb.setText(c[i][0].toString());
            rg.addView(rb);
        }
    }
}