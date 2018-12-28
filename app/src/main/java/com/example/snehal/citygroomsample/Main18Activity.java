package com.example.snehal.citygroomsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        Spinner mySpinner = (Spinner) findViewById(R.id.country);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main18Activity.this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.country));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner1 = (Spinner) findViewById(R.id.state);
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Main18Activity.this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.state));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.region);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(Main18Activity.this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.region));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);
    }


}
