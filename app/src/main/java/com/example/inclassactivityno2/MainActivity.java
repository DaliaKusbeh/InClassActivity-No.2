package com.example.inclassactivityno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button add ;
    private EditText name , salary ;
    private ListView list ;
    private Spinner spinner;

    SharedPreferences pref ;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getReference();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = " " , s = " " , time = " ";

                n = name.getText().toString().trim();
                s = salary.getText().toString().trim();
                time = spinner.getSelectedItem().toString() ;
                Info info = new Info(n,s,time);

                String r1 = info.getName() + info.getSalary() + info.getTime();

                ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, android.R.layout.activity_list_item,r1);
                time.setAdapter(ad1);

                list.setAdapter(ad1);

            }
        });
    }


    private void getReference()
    {
        add = findViewById(R.id.B2);
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);
        list = findViewById(R.id.list);
        spinner = findViewById(R.id.spinner);

    }
}