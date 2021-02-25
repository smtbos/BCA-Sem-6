package com.example.a022imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proceed(View view) {
        switch (view.getId()) {
            case (R.id.amazon):
                OpenUrl("http://amazon.in/");
                break;
            case (R.id.flipcart):
                OpenUrl("http://flipkart.com");
                break;
            case (R.id.youtube):
                OpenUrl("https://youtube.com/");
                break;
        }
    }

    public void OpenUrl(String url) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
}