package com.example.johntumminelli.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {
    ListView list;
    EditText name;
    EditText phone;
    Button addButton;

    ArrayAdapter<Contacts> contacts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        name = (EditText) findViewById(R.id.addName);
        phone = (EditText) findViewById(R.id.addPhone);
        addButton = (Button) findViewById(R.id.button);

        contacts = new ArrayAdapter<Contacts>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addButton.setOnClickListener(this);

        list.setOnItemLongClickListener(this);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String ph = phone.getText().toString();
        String txt = name.getText().toString();
        Contacts contact = new Contacts(txt, ph);
        if (!ph.isEmpty() && !txt.isEmpty()){
        contacts.add(contact);
        name.setText("");
        phone.setText("");
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contacts contact = contacts.getItem(position);
        contacts.remove(contact);
        return false;
    }
}
