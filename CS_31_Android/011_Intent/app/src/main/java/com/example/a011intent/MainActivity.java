package com.example.a011intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aa_Click(View view) {
        Intent i = new Intent(MainActivity.this, AnotherActivity.class);
        startActivity(i);
    }

    public void email_Click(View view) {
        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, "smtbos@gmail.com");
        email.putExtra(Intent.EXTRA_SUBJECT, "Test Subjct");
        email.putExtra(Intent.EXTRA_TEXT, "This is Test Mail");
        startActivity(Intent.createChooser(email, "Select Mail Service to Mail.."));
    }

    public void contact_Click(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(i);
    }

    public void browse_Click(View view) {
        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
        i.putExtra(SearchManager.QUERY, "Smit Bosamiya");
        startActivity(i);
    }

    public void call_Click(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8128389464"));
        startActivity(i);
    }
}