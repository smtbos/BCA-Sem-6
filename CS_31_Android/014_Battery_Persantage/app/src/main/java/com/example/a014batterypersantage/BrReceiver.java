package com.example.a014batterypersantage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BrReceiver extends BroadcastReceiver {
    TextView tx;

    public BrReceiver(TextView tx) {
        this.tx = tx;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int CurPer = intent.getIntExtra("level", 0);
        tx.setText("" + CurPer);
    }

}
