package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity1();
            }
        });

        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity3();
            }
        });
    }

    public void OpenActivity1()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void OpenActivity3()
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
