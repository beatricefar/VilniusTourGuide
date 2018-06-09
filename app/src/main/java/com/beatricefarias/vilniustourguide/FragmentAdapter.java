package com.beatricefarias.vilniustourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.beatricefarias.vilniustourguide.fragments.MuseumFragment;

public class FragmentAdapter extends FragmentPagerAdapter{

    Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumFragment();
        } else if (position == 1) {
            return new MuseumFragment();
        } else {
            return new MuseumFragment();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
