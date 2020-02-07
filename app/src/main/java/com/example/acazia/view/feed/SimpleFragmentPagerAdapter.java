package com.example.acazia.view.feed;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.acazia.view.feed.fragment.LocalFragment;
import com.example.acazia.view.feed.fragment.TrendingFragment;
import com.example.acazia.view.feed.fragment.YourCircleFragment;
import com.example.acazia.R;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mcontext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LocalFragment();
        } else if (position == 1) {
            return new YourCircleFragment();
        } else {
            return new TrendingFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mcontext.getString(R.string.LocalFragment);
            case 1:
                return mcontext.getString(R.string.YourCircleFragment);
            case 2:
                return mcontext.getString(R.string.TrendingFragment);
            default:
                return null;
        }
    }
}
