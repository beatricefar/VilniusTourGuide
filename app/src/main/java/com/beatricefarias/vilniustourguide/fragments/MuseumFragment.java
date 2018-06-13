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
import com.beatricefarias.vilniustourguide.R;
import com.beatricefarias.vilniustourguide.Constants;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {


    public MuseumFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        ArrayList<Attraction> museums = new ArrayList<>();

        museums.add(new Attraction(getString(R.string.kgb_museum_name), R.drawable.kgb_museum,
                getString(R.string.kgb_museum_location),
                getString(R.string.kgb_museum_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.money_museum_name), R.drawable.money_museum,
                getString(R.string.money_museum_location),
                getString(R.string.money_museum_desc),
                Constants.ATTRACTION_IS_FREE));
        museums.add(new Attraction(getString(R.string.national_museum_name), R.drawable.national_museum,
                getString(R.string.national_museum_location),
                getString(R.string.national_museum_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.illusions_museum_name), R.drawable.illusions_museum,
                getString(R.string.illusions_museum_location),
                getString(R.string.illusions_museum_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.national_art_gallery_name), R.drawable.national_art_gallery,
                getString(R.string.national_art_gallery_location),
                getString(R.string.national_art_gallery_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.applied_arts_museum_name), R.drawable.applied_arts_museum,
                getString(R.string.applied_arts_museum_location),
                getString(R.string.applied_arts_museum_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.grand_dukes_palace_museum_name), R.drawable.palace_of_grand_dukes,
                getString(R.string.grand_dukes_palace_museum_location),
                getString(R.string.grand_dukes_palace_museum_desc),
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction(getString(R.string.telia_museum_name), R.drawable.telia_nonmuseum,
                getString(R.string.telia_museum_location),
                getString(R.string.telia_museum_desc),
                Constants.ATTRACTION_IS_PAID));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), museums);
        RecyclerView attractionRecyclerView= (RecyclerView) rootView.findViewById(R.id.attraction_list);

        attractionRecyclerView.setAdapter(new AttractionAdapter(getActivity(), museums));
        attractionRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageView header = (ImageView) rootView.findViewById(R.id.header);
        header.setImageResource(R.drawable.museums_header);


        return rootView;
    }
}
