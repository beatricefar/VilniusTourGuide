package com.beatricefarias.vilniustourguide.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.beatricefarias.vilniustourguide.Attraction;
import com.beatricefarias.vilniustourguide.R;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        ImageView attractionImage = (ImageView) listItemView.findViewById(R.id.image);
        attractionImage.setImageResource(currentAttraction.getImageId());

        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name);
        attractionName.setText(currentAttraction.getAttractionName());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentAttraction.getLocation());

        TextView price = (TextView) listItemView.findViewById(R.id.price);
        if (currentAttraction.getPrice()){
            price.setText("Admission: Free");
        } else {
            price.setText("Admission: Paid");
        }

        return listItemView;
    }

}
