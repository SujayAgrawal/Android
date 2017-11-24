package com.sujay.play.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView latestSongs = findViewById(R.id.latest_songs);
        TextView latestAlbums = findViewById(R.id.latest_albums);
        TextView artists = findViewById(R.id.artists);
        TextView random = findViewById(R.id.random);
        TextView nowPlaying = findViewById(R.id.now_playing);
        TextView payment = findViewById(R.id.payment);

        latestSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestSongsActivity(view);
            }
        });
        latestAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLatestAlbumsActivity(view);
            }
        });
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArtistsActivity(view);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRandomActivity(view);
            }
        });
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowPlayingActivity(view);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentActivity(view);
            }
        });
    }

    public void openLatestSongsActivity(View view) {
        Intent intent = new Intent(this, LatestSongsActivity.class);
        startActivity(intent);
    }

    public void openLatestAlbumsActivity(View view) {
        Intent intent = new Intent(this, LatestAlbumsActivity.class);
        startActivity(intent);
    }

    public void openArtistsActivity(View view) {
        Intent intent = new Intent(this, ArtistsActivity.class);
        startActivity(intent);
    }

    public void openRandomActivity(View view) {
        Intent intent = new Intent(this, RandomActivity.class);
        startActivity(intent);
    }

    public void openNowPlayingActivity(View view) {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }

    public void openPaymentActivity(View view) {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }

}
