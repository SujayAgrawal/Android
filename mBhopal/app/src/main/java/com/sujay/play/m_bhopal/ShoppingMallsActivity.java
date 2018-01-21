package com.sujay.play.m_bhopal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class ShoppingMallsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("DB City Mall", "Arera Hills, Zone-I, Mp Nagar"));
        places.add(new Place("Aashima Mall", "Hoshangabad Road"));
        places.add(new Place("C21 Mall", "Hoshangabad Road"));
        places.add(new Place("People's Mall", "Ayodhya Bypass Rd, Bhanpur"));
        places.add(new Place("Metro Plaza", "Char Imli Rd, E-5, Arera Colony"));
        places.add(new Place("Aura Mall", "Trilanga Main Road, Arera Colony, Gulmohar"));
        places.add(new Place("Platinum Plaza", "Mata Mandir Square, TT Nagar"));
        places.add(new Place("Vishal Mega Mart", "Zone-I, Mp Nagar"));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
