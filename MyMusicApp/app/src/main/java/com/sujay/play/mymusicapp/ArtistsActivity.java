package com.sujay.play.mymusicapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Button button = findViewById(R.id.now_playing_artists_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNowPlayingActivity(view);
            }
        });
    }

    public void openNowPlayingActivity(View view) {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }

}