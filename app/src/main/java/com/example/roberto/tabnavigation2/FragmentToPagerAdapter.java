package com.example.roberto.tabnavigation2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by roberto on 07.11.2016.
 */


public class FragmentToPagerAdapter extends FragmentStatePagerAdapter {

    public FragmentToPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt(MyFragment.ARG_OBJECT, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ""+(position+1);
    }
}
