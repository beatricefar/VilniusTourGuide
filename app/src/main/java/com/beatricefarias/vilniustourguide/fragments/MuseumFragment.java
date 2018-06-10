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
import com.beatricefarias.vilniustourguide.Constants;

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

        museums.add(new Attraction("KGB Museum", R.drawable.vilnius_lt_logo,
                "Aukų g. 2A",
                "" + R.string.kgb_museum_desc,
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("Money museum", R.drawable.vilnius_lt_logo,
                "Totorių g. 2 / 8",
                "" + R.string.money_museum_desc,
                Constants.ATTRACTION_IS_FREE));
        museums.add(new Attraction("National Museum of Lithuania", R.drawable.vilnius_lt_logo,
                "Arsenalo g. 1",
                "" + R.string.national_museum_desc,
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("Museum of Illusions", R.drawable.vilnius_lt_logo,
                "Vokiečių g. 6",
                "" + R.string.illusions_museum_desc,
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("National Gallery of Art", R.drawable.vilnius_lt_logo,
                "Konstitucijos pr. 22",
                "" + R.string.national_art_gallery_desc,
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("Museum of Applied Arts and Design", R.drawable.vilnius_lt_logo,
                "Arsenalo g. 3A",
                "" + R.string.applied_arts_museum_desc,
                Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("Palace of The Grand Dukes of Lithuania", R.drawable.vilnius_lt_logo,
                "Katedros a. 4",
                "" + R.string.grand_dukes_palace_museum_desc, Constants.ATTRACTION_IS_PAID));
        museums.add(new Attraction("Telia Nonmuseum", R.drawable.vilnius_lt_logo,
                "Vokiečių g. 4",
                "" + R.string.telia_museum_desc, Constants.ATTRACTION_IS_PAID));

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
