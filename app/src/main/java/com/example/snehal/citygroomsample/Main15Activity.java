package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main15Activity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        button = (Button)findViewById(R.id.button28);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });
    }

    public void openActivity16()
    {
        Intent intent1 = new Intent(this, Main16Activity.class);
        startActivity(intent1);
    }
}
