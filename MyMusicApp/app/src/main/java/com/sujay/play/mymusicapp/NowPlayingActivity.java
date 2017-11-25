package com.sujay.play.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Button artists = findViewById(R.id.now_playing_to_artists_button);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArtistsActivity(view);
            }
        });
        Button latestAlbums = findViewById(R.id.now_playing_to_latest_albums_button);
        latestAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestAlbumsActivity(view);
            }
        });
        Button latestSongs = findViewById(R.id.now_playing_to_latest_songs_button);
        latestSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestSongsActivity(view);
            }
        });
        Button home = findViewById(R.id.now_playing_to_home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity(view);
            }
        });
        Button payment = findViewById(R.id.now_playing_to_purchase_app_button);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentActivity(view);
            }
        });
        Button random = findViewById(R.id.now_playing_to_random_button);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRandomActivity(view);
            }
        });
    }

    public void openArtistsActivity(View view) {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }

    public void openLatestAlbumsActivity(View view) {
        Intent intent = new Intent(this, LatestAlbumsActivity.class);
        startActivity(intent);
    }

    public void openLatestSongsActivity(View view) {
        Intent intent = new Intent(this, LatestSongsActivity.class);
        startActivity(intent);
    }

    public void openMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPaymentActivity(View view) {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }

    public void openRandomActivity(View view) {
        Intent intent = new Intent(this, RandomActivity.class);
        startActivity(intent);
    }
}
