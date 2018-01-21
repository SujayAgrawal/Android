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
        places.add(new Place("Bhimbetka rock shelters", "Bhojpur Raisen, 38Kms from hahbibganj railway stn via hbd Rd", R.drawable.historical_sites_bhimbetka_rock_shelter));
        places.add(new Place("Sanchi Stupa", "Sanchi, 58 Kms from hahbibganj railway stn via Bhopal - Vidisha Hwy", R.drawable.historical_sites_the_sanchi_stupa));
        places.add(new Place("Madhya Pradesh Tribal Museum", "Shymala Hills Road, Near State Museum, Shymala Hills, Bhopal", R.drawable.historical_sites_tribal_museum));
        places.add(new Place("Rashtriya Manav Sangrahalaya", "Via Depo Square, Above Tribal Museum, Shymala Hills, Bhopal", R.drawable.historical_sites_manav_sangrahalaya));
        places.add(new Place("Raisen Fort", "Raisen, 43Kms from habibganj railway stn via NH146", R.drawable.historical_sites_raisen_fort));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
