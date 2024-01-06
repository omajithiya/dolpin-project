package com.example.newdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class RegistrationActivity extends AppCompatActivity {

//    private FirebaseAuth auth;
    private TextInputEditText reg_username,reg_pass,reg_name,reg_gender,reg_conformpass;
    private Button registration;
    String[] item={"Male","Female"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        reg_name=(TextInputEditText) findViewById(R.id.reg_name);
        reg_username=(TextInputEditText) findViewById(R.id.reg_username);
        reg_pass=(TextInputEditText) findViewById(R.id.reg_password);
        reg_conformpass=(TextInputEditText) findViewById(R.id.regconfirm_password);
        registration=findViewById(R.id.RegistrationBtn);

        autoCompleteTextView=findViewById(R.id.auto_Complete_text);
        adapterItem = new ArrayAdapter<String>(this,R.layout.list_item, item);

        autoCompleteTextView.setAdapter(adapterItem);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item= adapterView.getItemAtPosition(i).toString();
            }
        });
    }
}