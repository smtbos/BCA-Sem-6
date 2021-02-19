package com.example.a015progrressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int ProgBarStatus = 0;
    private Handler PBHendler = new Handler();
    private int FileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        final ProgressDialog pd = new ProgressDialog(MainActivity.this);
        pd.setCancelable(true);
        pd.setMessage("Donloading File..");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setProgress(0);
        pd.setMax(100);
        ProgBarStatus = 0;
        FileSize = 0;
        pd.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (ProgBarStatus < 100) {
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    ProgBarStatus += 1;
                    PBHendler.post(new Runnable() {
                        @Override
                        public void run() {
                            pd.setProgress(ProgBarStatus);
                        }
                    });
                }
                pd.dismiss();
            }
        }).start();
    }
}