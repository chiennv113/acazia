package com.example.acazia.feed.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.acazia.feed.SimpleFragmentPagerAdapter;
import com.example.acazia.R;
import com.google.android.material.tabs.TabLayout;

public class FragmentFeed extends Fragment {


    private Context context;

    public FragmentFeed(Context context) {
        this.context = context;
    }

    private TabLayout mTabLayout;
    private ViewPager mViewpager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_feed, container, false);
        initView(root);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(getActivity(), getActivity().getSupportFragmentManager());
        mViewpager.setAdapter(simpleFragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewpager);
    }

    private void initView(View view) {
        mTabLayout = view.findViewById(R.id.tabLayout);
        mViewpager = view.findViewById(R.id.viewpager);
    }

}
