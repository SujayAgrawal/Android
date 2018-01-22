package com.sujay.play.m_bhopal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class HistoricalSitesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.historical_bhimbetka), getString(R.string.historical_bhimbetka_location), R.drawable.historical_sites_bhimbetka_rock_shelter));
        places.add(new Place(getString(R.string.historical_sanchi_stupa), getString(R.string.historical_sanchi_stupa_location), R.drawable.historical_sites_the_sanchi_stupa));
        places.add(new Place(getString(R.string.historical_tribal_museum), getString(R.string.historical_tribal_museum_location), R.drawable.historical_sites_tribal_museum));
        places.add(new Place(getString(R.string.historical_rashtriya_manav_sangrahalaya), getString(R.string.historical_rashtriya_manav_sangrahalaya_location), R.drawable.historical_sites_manav_sangrahalaya));
        places.add(new Place(getString(R.string.historical_raisen_fort), getString(R.string.historical_raisen_fort_location), R.drawable.historical_sites_raisen_fort));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
