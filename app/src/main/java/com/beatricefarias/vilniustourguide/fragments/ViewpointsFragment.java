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

public class ViewpointsFragment extends Fragment {


    public ViewpointsFragment() { }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        ArrayList<Attraction> viewpoints = new ArrayList<>();

        viewpoints.add(new Attraction(getString(R.string.three_crosses_hill_name), R.drawable.three_crosses,
                getString(R.string.three_crosses_hill_location),
                getString(R.string.three_crosses_hill_desc),
                Constants.ATTRACTION_IS_FREE));
        viewpoints.add(new Attraction(getString(R.string.gediminas_castle_name), R.drawable.gediminas_castle,
                getString(R.string.gediminas_castle_location),
                getString(R.string.gediminas_castle_desc),
                Constants.ATTRACTION_IS_PAID));
        viewpoints.add(new Attraction(getString(R.string.st_johns_church_name), R.drawable.st_johns_church,
                getString(R.string.st_johns_church_location),
                getString(R.string.st_johns_church_desc),
                Constants.ATTRACTION_IS_PAID));
        viewpoints.add(new Attraction(getString(R.string.television_tower_name), R.drawable.television_tower,
                getString(R.string.television_tower_location),
                getString(R.string.television_tower_desc),
                Constants.ATTRACTION_IS_PAID));
        viewpoints.add(new Attraction(getString(R.string.bastion_hill_name), R.drawable.bastion_hill,
                getString(R.string.bastion_hill_location),
                getString(R.string.bastion_hill_desc),
                Constants.ATTRACTION_IS_FREE));
        viewpoints.add(new Attraction(getString(R.string.cathedral_bell_tower_name), R.drawable.cathedral_bell_tower,
                getString(R.string.cathedral_bell_tower_location),
                getString(R.string.cathedral_bell_tower_desc),
                Constants.ATTRACTION_IS_PAID));
        viewpoints.add(new Attraction(getString(R.string.subaciaus_street_view_name), R.drawable.subaciaus_viewpoint,
                getString(R.string.subaciaus_street_view_location),
                getString(R.string.subaciaus_street_view_desc),
                Constants.ATTRACTION_IS_FREE));
        viewpoints.add(new Attraction(getString(R.string.taurakalnis_name), R.drawable.tauras_hill,
                getString(R.string.taurakalnis_location),
                getString(R.string.taurakalnis_desc),
                Constants.ATTRACTION_IS_FREE));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), viewpoints);
        RecyclerView attractionRecyclerView= (RecyclerView) rootView.findViewById(R.id.attraction_list);

        attractionRecyclerView.setAdapter(new AttractionAdapter(getActivity(), viewpoints));
        attractionRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageView header = (ImageView) rootView.findViewById(R.id.header);
        header.setImageResource(R.drawable.viewpoints_header);


        return rootView;
    }
}
