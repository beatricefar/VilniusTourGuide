package com.beatricefarias.vilniustourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.beatricefarias.vilniustourguide.Attraction;
import com.beatricefarias.vilniustourguide.AttractionAdapter;
import com.beatricefarias.vilniustourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        ArrayList<Attraction> museums = new ArrayList<>();

        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 0));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 10));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 0));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 10));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 0));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 10));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 0));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo, "Old town",
                "This is a description about money museum. Wooo", 10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), museums);
        ListView attractionList= rootView.findViewById(R.id.attraction_list);

        //Add a header to list view

        LayoutInflater layoutinflater = getLayoutInflater();
        ViewGroup header = (ViewGroup)layoutinflater.inflate(R.layout.list_view_header, attractionList,false);
        attractionList.addHeaderView(header);

        attractionList.setAdapter(adapter);

        return rootView;
    }




}
