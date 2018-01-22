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
        places.add(new Place(getString(R.string.restaurant_sagar_gaire), getString(R.string.restaurant_sagar_gaire_location)));
        places.add(new Place(getString(R.string.restaurant_manohar_dairy), getString(R.string.restaurant_manohar_dairy_location)));
        places.add(new Place(getString(R.string.restaurant_bakenshake), getString(R.string.restaurant_bakenshake_location)));
        places.add(new Place(getString(R.string.restaurant_bapukikutia), getString(R.string.restaurant_bapukikutia_location)));
        places.add(new Place(getString(R.string.restaurant_windnwaves), getString(R.string.restaurant_windnwaves_location)));
        places.add(new Place(getString(R.string.restaurant_jehannuma), getString(R.string.restaurant_jehannuma_location)));
        places.add(new Place(getString(R.string.restaurant_amerbakery), getString(R.string.restaurant_amerbakery_location)));
        places.add(new Place(getString(R.string.restaurant_pindbaluchi), getString(R.string.restaurant_pindbaluchi_location)));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
