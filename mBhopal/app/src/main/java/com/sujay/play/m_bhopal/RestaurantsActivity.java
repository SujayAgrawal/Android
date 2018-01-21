package com.sujay.play.m_bhopal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Sagar Gaire", "10, Number Market, Arera Colony"));
        places.add(new Place("Manohar Dairy", "Zone-I, Mp Nagar"));
        places.add(new Place("Bake N Shake", "Zone-I, Mp Nagar"));
        places.add(new Place("Bapu Ki Kutia", "Zone-I, Mp Nagar"));
        places.add(new Place("Wind And Waves", "Van Vihar Road, Shyamla Hills, TT Nagar"));
        places.add(new Place("Hotel Jehan Numa Palace", "157, Shymala Hills, TT Nagar"));
        places.add(new Place("Amer Bakery Hut", "New Market, Link Road, TT Nagar"));
        places.add(new Place("Pind Balluchi", "Third FLoor, DB City Mall, Maharana Pratap Nagar"));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
