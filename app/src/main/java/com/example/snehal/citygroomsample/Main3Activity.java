package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    private Button button;
    private ImageButton imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imagebutton = (ImageButton)findViewById(R.id.imageButton3);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        imagebutton = (ImageButton)findViewById(R.id.imageButton5);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }
        });

        button = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2();
            }
        });
    }


    public void OpenActivity2()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    public void openActivity4()
    {
        Intent intent1 = new Intent(this, Main4Activity.class);
        startActivity(intent1);
    }

    public void openActivity17()
    {
        Intent intent1 = new Intent(this, Main17Activity.class);
        startActivity(intent1);
    }
}
