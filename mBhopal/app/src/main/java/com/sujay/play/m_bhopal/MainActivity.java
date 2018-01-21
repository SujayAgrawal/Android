package com.sujay.play.m_bhopal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lakesTextView = findViewById(R.id.lakes_text_view);
        TextView restaurantTextView = findViewById(R.id.restaurants_text_view);
        TextView historicalSitesTextView = findViewById(R.id.historical_sites_text_view);
        TextView shoppingMallsTextView = findViewById(R.id.shopping_malls_text_view);
        lakesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLakesActivity(view);
            }
        });
        restaurantTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestaurantsActivity(view);
            }
        });
        historicalSitesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistoricalSitesActivity(view);
            }
        });
        shoppingMallsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShoppingMallsActivity(view);
            }
        });
    }

    public void openLakesActivity(View view) {
        //instruction to opens LakesActivity
        Intent intent = new Intent(this, LakesActivity.class);
        startActivity(intent);
    }

    public void openRestaurantsActivity(View view) {
        //instruction to open Restaurants activity
        Intent intent = new Intent(this, RestaurantsActivity.class);
        startActivity(intent);
    }

    public void openHistoricalSitesActivity(View view) {
        //instruction to open historical sites activity
        Intent intent = new Intent(this, HistoricalSitesActivity.class);
        startActivity(intent);
    }

    public void openShoppingMallsActivity(View view) {
        //instruction to open shopping malls activity
        Intent intent = new Intent(this, ShoppingMallsActivity.class);
        startActivity(intent);
    }
}
