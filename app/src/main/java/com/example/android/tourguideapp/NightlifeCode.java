package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class NightlifeCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element);

        //array elements for the Nightlife list
        final ArrayList<TourElement> tourelements = new ArrayList<TourElement>();
        tourelements.add(new TourElement(getString(R.string.sassmusicclub),getString(R.string.karlsplatz),getString(R.string.phone_01)));
        tourelements.add(new TourElement(getString(R.string.lutz_derclub),getString(R.string.mariahilfer),getString(R.string.phone_02)));
        tourelements.add(new TourElement(getString(R.string.rhiz),getString(R.string.ubahnbogen),getString(R.string.phone_03)));
        tourelements.add(new TourElement(getString(R.string.babylonnightclub),getString(R.string.seilerstätte),getString(R.string.phone_04)));
        tourelements.add(new TourElement(getString(R.string.cabaretfledermaus),getString(R.string.spiegelgasse),getString(R.string.phone_05)));
        tourelements.add(new TourElement(getString(R.string.radio_thelabelbar),getString(R.string.neustiftgasse),getString(R.string.phone_06)));
        tourelements.add(new TourElement(getString(R.string.tanzcafejenseits),getString(R.string.nelkengasse),getString(R.string.phone_07)));
        tourelements.add(new TourElement(getString(R.string.flex),getString(R.string.augartenbrucke),getString(R.string.phone_08)));
        tourelements.add(new TourElement(getString(R.string.primi),getString(R.string.neuer),getString(R.string.phone_09)));
        tourelements.add(new TourElement(getString(R.string.whynotclubdisco),getString(R.string.tiefer),getString(R.string.phone_10)));
        tourelements.add(new TourElement(getString(R.string.celestecafe),getString(R.string.hamburgerstr),getString(R.string.phone_11)));



        TourElementAdapter adapter = new TourElementAdapter(this, tourelements, R.color.category_nightlife);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
