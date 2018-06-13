package com.beatricefarias.vilniustourguide;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.beatricefarias.vilniustourguide.activities.AttractionActivity;

import java.util.ArrayList;

public class AttractionListOnClickListener implements AdapterView.OnItemClickListener{

    private Context context;
    private ArrayList<Attraction> attractionList;

    public AttractionListOnClickListener(Context context, ArrayList<Attraction> attractionList) {
        this.attractionList = attractionList;
        this.context = context;
    }

    /**
     * Method which overrides onItemClick method
     * @param adapterView
     * @param view
     * @param position
     * @param l
     */

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        position -= 1;
        Attraction currentAttraction = attractionList.get(position);
        Intent intent = new Intent(context, AttractionActivity.class);
        intent.putExtra(Constants.ATTRACTION_PARCEABLE, currentAttraction);
        context.startActivity(intent);
    }
}
