package com.beatricefarias.vilniustourguide.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.beatricefarias.vilniustourguide.Attraction;
import com.beatricefarias.vilniustourguide.AttractionListOnClickListener;
import com.beatricefarias.vilniustourguide.Constants;
import com.beatricefarias.vilniustourguide.R;
import com.beatricefarias.vilniustourguide.activities.AttractionActivity;

import java.util.ArrayList;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Attraction> attractions;

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        this.context = context;
        this.attractions = attractions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(context)
                .inflate(R.layout.list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Attraction currentAttraction = attractions.get(position);

        holder.attractionImage.setImageResource(currentAttraction.getImageId());
        holder.attractionName.setText(currentAttraction.getAttractionName());
        holder.location.setText(currentAttraction.getLocation());
        if (currentAttraction.getPrice()){
            holder.price.setText(R.string.admission_free);
        } else {
            holder.price.setText(R.string.admission_paid);
        }
        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AttractionActivity.class);
                intent.putExtra(Constants.ATTRACTION_PARCEABLE, currentAttraction);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return attractions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView attractionImage;
        private TextView attractionName;
        private TextView location;
        private TextView price;
        private View parentView;

        public ViewHolder (@NonNull View view) {
            super(view);
            this.parentView = view;
            this.attractionImage = (ImageView) view
                    .findViewById(R.id.image);
            this.attractionName = (TextView) view
                    .findViewById(R.id.attraction_name);
            this.location = (TextView) view
                    .findViewById(R.id.location);
            this.price = (TextView) view
                    .findViewById(R.id.price);
        }
    }

}
