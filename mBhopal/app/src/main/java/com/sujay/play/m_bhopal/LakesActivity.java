package com.sujay.play.m_bhopal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class LakesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.lake_upper), getString(R.string.lake_lower_upper_location)));
        places.add(new Place(getString(R.string.lake_lower), getString(R.string.lake_lower_upper_location)));
        places.add(new Place(getString(R.string.lake_shahpura), getString(R.string.lake_shahpura_location)));
        places.add(new Place(getString(R.string.lake_sharangpani), getString(R.string.lake_sharangpani_location)));
        places.add(new Place(getString(R.string.lake_tawa), getString(R.string.lake_tawa_location)));
        places.add(new Place(getString(R.string.lake_kerwa), getString(R.string.lake_kerwa_location)));
        places.add(new Place(getString(R.string.lake_bhadbhada), getString(R.string.lake_bhadbhada_location)));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
