package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class MonumentsCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Monuments list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement(getString(R.string.johannstraussjunior),getString(R.string.composers),getString(R.string.stadtpark),R.drawable.schubert));
        tourelements.add(new TourElement(getString(R.string.wamozart),getString(R.string.composers),getString(R.string.burggarten),R.drawable.mozart));
        tourelements.add(new TourElement(getString(R.string.eugenioofsavoy),getString(R.string.historicalfigures),getString(R.string.heldenplatz),R.drawable.savoy));
        tourelements.add(new TourElement(getString(R.string.archangelmichael),getString(R.string.mythology),getString(R.string.saintmichaelchurch),R.drawable.michael));
        tourelements.add(new TourElement(getString(R.string.pallasathene),getString(R.string.mythology),getString(R.string.parlament),R.drawable.athene));
        tourelements.add(new TourElement(getString(R.string.emperorjosephii),getString(R.string.historicalfigures),getString(R.string.belvedere),R.drawable.joseph));
        tourelements.add(new TourElement(getString(R.string.plaguecolumn),getString(R.string.history),getString(R.string.graben),R.drawable.plague));
        tourelements.add(new TourElement(getString(R.string.iranianluminaries),getString(R.string.historicalfigures),getString(R.string.unocity),R.drawable.iranian));
        tourelements.add(new TourElement(getString(R.string.ludwigvanbeethoven),getString(R.string.composers),getString(R.string.beethovenplatz),R.drawable.beethoven));
        tourelements.add(new TourElement(getString(R.string.empressmariatheresa),getString(R.string.historicalfigures),getString(R.string.mariatheresienplatz),R.drawable.theresa));

        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_monuments);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}