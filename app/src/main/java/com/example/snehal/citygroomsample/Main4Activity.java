package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button1 = (Button)findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity5();
            }
        });


        button = (Button)findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity3();
            }
        });
    }

    public void OpenActivity3()
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void OpenActivity5()
    {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

}
