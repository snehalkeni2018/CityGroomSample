package com.example.snehal.citygroomsample;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button b = (Button) findViewById(R.id.button18);
         b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main9Activity.this,pop.class));
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav4);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment fragment = null;
                if (menuItem.getItemId() == R.id.home1)
                {
                    fragment = new home_section_fragment();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frame5,fragment);
                    fragmentTransaction1.commit();
                }

                else if (menuItem.getItemId() == R.id.complaints)
                {
                    fragment = new complaint_section_fragment();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frame5,fragment);
                    fragmentTransaction1.commit();

                }

                else if (menuItem.getItemId() == R.id.streetride)
                {
                    fragment = new streetride_section_fragment();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frame5,fragment);
                    fragmentTransaction1.commit();

                }

                else if (menuItem.getItemId() == R.id.incentives)
                {
                    fragment = new incentives_section_fragment();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frame5,fragment);
                    fragmentTransaction1.commit();

                }

                else if (menuItem.getItemId() == R.id.incentives_bought)
                {
                    fragment = new incentives_bought_section_fragment();
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frame5,fragment);
                    fragmentTransaction1.commit();

                }
                return true;
            }
        });



        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.menu4,new settings_fragment());
        fragmentTransaction.commit();

        navigationView = findViewById(R.id.menu4);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.settings:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu4,new settings_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("SETTINGS");
                        menuItem.setChecked(true);
                        break;

                    case R.id.notifications:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu4,new notifications_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("NOTIFICATIONS");
                        menuItem.setChecked(true);
                        break;

                    case R.id.help:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu4,new help_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("HELP");
                        menuItem.setChecked(true);
                        break;
                }
                return true;
            }
        });
    }
}
