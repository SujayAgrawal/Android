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
        places.add(new Place(getString(R.string.shop_dbcity), getString(R.string.shop_dbcity_location)));
        places.add(new Place(getString(R.string.shop_aashima), getString(R.string.shop_aashima_location)));
        places.add(new Place(getString(R.string.shop_c21), getString(R.string.shop_c21_location)));
        places.add(new Place(getString(R.string.shop_peoplesmall), getString(R.string.shop_peoplesmall_location)));
        places.add(new Place(getString(R.string.shop_metro), getString(R.string.shop_metro_location)));
        places.add(new Place(getString(R.string.shop_aura), getString(R.string.shop_aura_location)));
        places.add(new Place(getString(R.string.shop_platinum), getString(R.string.shop_platinum_location)));
        places.add(new Place(getString(R.string.shop_vishal), getString(R.string.shop_vishal_location)));

        PlacesAdapter placesAdapter = new PlacesAdapter(this, places);
        ListView listView = findViewById(R.id.place_list_id);
        listView.setAdapter(placesAdapter);
    }
}
