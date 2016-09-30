package com.example.johntumminelli.contactsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView name;
    TextView phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.nameView);
        phone = (TextView) findViewById(R.id.phoneView);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String n = (String) bundle.get("name");
        String p = (String) bundle.get("phone");

        name.setText("Name: " + n.toString());
        phone.setText("Phone: " + p.toString());

    }
}