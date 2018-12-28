package com.example.snehal.citygroomsample;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Main19Activity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.menu,new settings_fragment());
        fragmentTransaction.commit();

        navigationView = findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.settings:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu,new settings_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("SETTINGS");
                        menuItem.setChecked(true);
                        break;

                    case R.id.notifications:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu,new notifications_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("NOTIFICATIONS");
                        menuItem.setChecked(true);
                        break;

                    case R.id.help:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.menu,new help_fragment());
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
