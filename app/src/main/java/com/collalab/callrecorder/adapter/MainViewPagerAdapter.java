package com.collalab.callrecorder.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.collalab.callrecorder.fragment.FavoriteRecordFragment;
import com.collalab.callrecorder.fragment.FragmentSetting;
import com.collalab.callrecorder.fragment.RecordMainListFragment;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 3;

    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return FragmentSetting.newInstance("", "");
            case 1:
                return RecordMainListFragment.newInstance("", "");
            case 2:
                return FavoriteRecordFragment.newInstance("", "");
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Settings";

            case 1:
                return "Contact";

            case 2:
                return "Favorites";
        }
        return super.getPageTitle(position);
    }
}
