package com.sujay.play.m_bhopal;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class PlacesAdapter extends ArrayAdapter<Place> {
    public PlacesAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView placeNameTextView = listItemView.findViewById(R.id.place_text_view);
        placeNameTextView.setText(currentPlace.getName());

        TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentPlace.getLocation());

        ImageView imageView = listItemView.findViewById(R.id.list_item_icon);
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
