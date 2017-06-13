package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find view that points to the Architecture list
        LinearLayout architecture = (LinearLayout) findViewById(R.id.architecture);
        //Set click listener on this view
        architecture.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent architectureCode = new Intent(MainActivity.this, ArchitectureCode.class);
                startActivity(architectureCode);
            }
        });

        //Find view that points to the Restaurants list
        LinearLayout restaurants = (LinearLayout) findViewById(R.id.restaurants);
        //Set click listener on this view
        restaurants.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsCode = new Intent(MainActivity.this, RestaurantsCode.class);
                startActivity(restaurantsCode);
            }
        });

        //Find view that points to the Nightlife list
        LinearLayout nightlife = (LinearLayout) findViewById(R.id.nightlife);
        //Set click listener on this view
        nightlife.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightlifeCode = new Intent(MainActivity.this, NightlifeCode.class);
                startActivity(nightlifeCode);
            }
        });

        //Find view that points to the Monuments list
        LinearLayout monuments = (LinearLayout) findViewById(R.id.monuments);
        //Set click listener on this view
        monuments.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentsCode = new Intent(MainActivity.this, MonumentsCode.class);
                startActivity(monumentsCode);
            }
        });

    }
}
