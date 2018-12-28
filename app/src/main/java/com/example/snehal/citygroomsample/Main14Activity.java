package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class Main14Activity extends AppCompatActivity {
    private CheckBox checkWater;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        button = (Button)findViewById(R.id.button23);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity15();
            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main14Activity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.category));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        checkWater = findViewById(R.id.checkWater);
    }

    public void OpenActivity15()
    {
        Intent intent1 = new Intent(this, Main15Activity.class);
        startActivity(intent1);
    }
}
