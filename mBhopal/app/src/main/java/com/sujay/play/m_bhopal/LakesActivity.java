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
        places.add(new Place("Upper Lake", "near cm house"));
        places.add(new Place("Lower Lake", "near cm house"));
        places.add(new Place("Shahpura Lake", "Shahpura"));
        places.add(new Place("Sharangpani Lake", "Piplani"));
        places.add(new Place("Tawa Reservoir", "Hoshangabad"));
        places.add(new Place("Kerwa Dam", "Kotra Sultanabad"));
        places.add(new Place("Bhadbhada Dam", "Near Kerwa Dam"));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
