package com.sujay.play.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Button nowPlaying = findViewById(R.id.random_songs_to_now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowPlayingActivity(view);
            }
        });
        Button artists = findViewById(R.id.random_songs_to_artists_button);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArtistsActivity(view);
            }
        });
        Button latestAlbums = findViewById(R.id.random_songs_to_latest_albums_button);
        latestAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestAlbums(view);
            }
        });
        Button latestSongs = findViewById(R.id.random_songs_to_latest_songs_button);
        latestSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestSongsActivity(view);
            }
        });
        Button home = findViewById(R.id.random_songs_to_home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity(view);
            }
        });
        Button payment = findViewById(R.id.random_songs_to_purchase_app_button);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentActivity(view);
            }
        });
    }

    public void openNowPlayingActivity(View view) {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }

    public void openArtistsActivity(View view) {
        Intent intent = new Intent(this, ArtistsActivity.class);
        startActivity(intent);
    }

    public void openLatestAlbums(View view) {
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
}
