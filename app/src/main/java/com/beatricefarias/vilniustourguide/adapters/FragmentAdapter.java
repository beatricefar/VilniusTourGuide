package com.beatricefarias.vilniustourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.beatricefarias.vilniustourguide.R;
import com.beatricefarias.vilniustourguide.fragments.MuseumFragment;
import com.beatricefarias.vilniustourguide.fragments.PlacesFragment;
import com.beatricefarias.vilniustourguide.fragments.RestaurantFragment;
import com.beatricefarias.vilniustourguide.fragments.ViewpointsFragment;

public class FragmentAdapter extends FragmentPagerAdapter{

    Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new ViewpointsFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return context.getString(R.string.category_places);
            case 1:
                return context.getString(R.string.category_viewpoints);
            case 2:
                return context.getString(R.string.category_museums);
            case 3:
                return context.getString(R.string.category_restaurants);
            default:
                return null;
        }
    }
}
