package com.beatricefarias.vilniustourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.beatricefarias.vilniustourguide.Attraction;
import com.beatricefarias.vilniustourguide.adapters.AttractionAdapter;
import com.beatricefarias.vilniustourguide.AttractionListOnClickListener;
import com.beatricefarias.vilniustourguide.Constants;
import com.beatricefarias.vilniustourguide.R;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {


    public PlacesFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        ArrayList<Attraction> places = new ArrayList<>();

        places.add(new Attraction(getString(R.string.pilies_street_name), R.drawable.pilies_street,
                getString(R.string.pilies_street_location),
                getString(R.string.pilies_street_desc),
                Constants.ATTRACTION_IS_FREE));
        places.add(new Attraction(getString(R.string.gediminas_avenue_name), R.drawable.gediminas_avenue,
                getString(R.string.gediminas_avenue_location),
                getString(R.string.gediminas_avenue_desc),
                Constants.ATTRACTION_IS_FREE));
        places.add(new Attraction(getString(R.string.st_anne_church_name), R.drawable.st_annes_church,
                getString(R.string.st_anne_church_location),
                getString(R.string.st_anne_church_desc),
                Constants.ATTRACTION_IS_FREE));
        places.add(new Attraction(getString(R.string.presidential_palace_name), R.drawable.presidential_palace,
                getString(R.string.presidential_palace_location),
                getString(R.string.presidential_palace_desc),
                Constants.ATTRACTION_IS_FREE));
        places.add(new Attraction(getString(R.string.uzupis_name), R.drawable.uzupis,
                getString(R.string.uzupis_location),
                getString(R.string.uzupis_desc),
                Constants.ATTRACTION_IS_FREE));
        places.add(new Attraction(getString(R.string.vilnius_university_name), R.drawable.vilnius_university,
                getString(R.string.vilnius_university_location),
                getString(R.string.vilnius_university_desc),
                Constants.ATTRACTION_IS_PAID));
        places.add(new Attraction(getString(R.string.bastion_city_wall_name), R.drawable.bastion_city_wall,
                getString(R.string.bastion_city_wall_location),
                getString(R.string.bastion_city_wall_desc),
                Constants.ATTRACTION_IS_PAID));
        places.add(new Attraction(getString(R.string.town_hall_name), R.drawable.townhall,
                getString(R.string.town_hall_location),
                getString(R.string.town_hall_desc),
                Constants.ATTRACTION_IS_FREE));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), places);
        RecyclerView attractionRecyclerView= (RecyclerView) rootView.findViewById(R.id.attraction_list);

        attractionRecyclerView.setAdapter(new AttractionAdapter(getActivity(), places));
        attractionRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageView header = (ImageView) rootView.findViewById(R.id.header);
        header.setImageResource(R.drawable.places_header);


        return rootView;
    }
}
