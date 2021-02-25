package com.example.a023radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup gender, cast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cast = (RadioGroup) findViewById(R.id.cast);
        gender = (RadioGroup) findViewById(R.id.gender);

        RadioGroup.OnCheckedChangeListener lis = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rbt = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(), "Slected Item is : " + rbt.getText(), Toast.LENGTH_SHORT).show();
            }
        };

        cast.setOnCheckedChangeListener(lis);
        gender.setOnCheckedChangeListener(lis);
    }

    public void Show(View v) {
        Toast.makeText(getApplicationContext(), getRBTtext(gender.getCheckedRadioButtonId()) + " " + getRBTtext(cast.getCheckedRadioButtonId()), Toast.LENGTH_SHORT).show();
    }

    public String getRBTtext(int id) {
        if (id > 0) {
            return ((RadioButton) findViewById(id)).getText().toString();
        } else {
            return "";
        }
    }
}