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
import com.beatricefarias.vilniustourguide.AttractionListOnClickListener;
import com.beatricefarias.vilniustourguide.Constants;
import com.beatricefarias.vilniustourguide.R;
import com.beatricefarias.vilniustourguide.adapters.AttractionAdapter;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {


    public RestaurantFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        ArrayList<Attraction> restaurants = new ArrayList<>();

        restaurants.add(new Attraction(getString(R.string.kgb_museum_name), R.drawable.snekutis,
                getString(R.string.snekutis_location),
                getString(R.string.snekutis_desc),
                Constants.ATTRACTION_IS_PAID));
        restaurants.add(new Attraction(getString(R.string.gastronomika_name), R.drawable.gastronomika,
                getString(R.string.gastronomika_location),
                getString(R.string.gastronomika_desc),
                Constants.ATTRACTION_IS_PAID));
        restaurants.add(new Attraction(getString(R.string.busi_trecias_name), R.drawable.busi_trecias,
                getString(R.string.busi_trecias_location),
                getString(R.string.busi_trecias_desc),
                Constants.ATTRACTION_IS_PAID));
        restaurants.add(new Attraction(getString(R.string.ertlio_name), R.drawable.ertlio,
                getString(R.string.ertlio_location),
                getString(R.string.ertlio_desc),
                Constants.ATTRACTION_IS_PAID));
        restaurants.add(new Attraction(getString(R.string.sofa_de_pancho_name), R.drawable.sofa_de_pancho,
                getString(R.string.sofa_de_pancho_location),
                getString(R.string.sofa_de_pancho_desc),
                Constants.ATTRACTION_IS_PAID));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), restaurants);
        RecyclerView attractionRecyclerView= (RecyclerView) rootView.findViewById(R.id.attraction_list);

        attractionRecyclerView.setAdapter(new AttractionAdapter(getActivity(), restaurants));
        attractionRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageView header = (ImageView) rootView.findViewById(R.id.header);
        header.setImageResource(R.drawable.food_header);

        return rootView;
    }
}
