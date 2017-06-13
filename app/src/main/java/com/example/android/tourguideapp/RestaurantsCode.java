package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class RestaurantsCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Restaurants list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement(getString(R.string.demel),getString(R.string.kohlmarkt),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.docohotelvienna),getString(R.string.stephansplatz),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.grandhotelwien),getString(R.string.kaerntner),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.hiltonvienna),getString(R.string.amstadt),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.hotelimpalaisschwarzenberg),getString(R.string.schwarzenbergplatz),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.hotelimperial),getString(R.string.karntner),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.hotelsacher),getString(R.string.philharmonikerstasse),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.intercontinentalvienna),getString(R.string.johannesgasse),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.novellibacaroconcucina),getString(R.string.braunerstrasse),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.palaiscoburg),getString(R.string.coburgbastei),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.parkhyattvienna),getString(R.string.amhof),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.prilisauer),getString(R.string.linzer),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.radissonblupalaishotel),getString(R.string.parkring),getString(R.string.european)));
        tourelements.add(new TourElement(getString(R.string.restaurantmagnard),getString(R.string.cours),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.rotisserieprinzeugen),getString(R.string.amstadt),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.steirereck),getString(R.string.amheumarkt),getString(R.string.austrian)));
        tourelements.add(new TourElement(getString(R.string.viennaairportairrestcatering),getString(R.string.airport),getString(R.string.european)));




        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
