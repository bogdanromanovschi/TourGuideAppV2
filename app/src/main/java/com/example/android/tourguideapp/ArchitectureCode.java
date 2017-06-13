package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class ArchitectureCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Architecture list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement(getString(R.string.secessioncupole),getString(R.string.artnouveaumuseum),getString(R.string.josephmariaolbrich),R.drawable.secession));
        tourelements.add(new TourElement(getString(R.string.karlsplatzpavilion),getString(R.string.undergroundstation),getString(R.string.ottowagner),R.drawable.karlsplatz));
        tourelements.add(new TourElement(getString(R.string.kalrmarxhof),getString(R.string.socialhousing),getString(R.string.karlehn),R.drawable.kalrmarx));
        tourelements.add(new TourElement(getString(R.string.michaelerplatz),getString(R.string.bank),getString(R.string.adolfloos),R.drawable.michaelerplatz));
        tourelements.add(new TourElement(getString(R.string.gasometer),getString(R.string.housing),getString(R.string.jeannouvel),R.drawable.gasometer));
        tourelements.add(new TourElement(getString(R.string.albertinaramp),getString(R.string.museumentry),getString(R.string.hanshollein),R.drawable.albertinaramp));
        tourelements.add(new TourElement(getString(R.string.wulearningcenter),getString(R.string.universitylibrary),getString(R.string.zahahadid),R.drawable.wuuni));
        tourelements.add(new TourElement(getString(R.string.schemerlbruecke),getString(R.string.bridge),getString(R.string.ottowagner),R.drawable.schmerlbrucke));
        tourelements.add(new TourElement(getString(R.string.stadtopera),getString(R.string.operahouse),getString(R.string.augustvonsicardsburg),R.drawable.opera));
        tourelements.add(new TourElement(getString(R.string.rathaus),getString(R.string.cityhall),getString(R.string.friedrichvonschmidt),R.drawable.rathaus));


        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_architecture);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
