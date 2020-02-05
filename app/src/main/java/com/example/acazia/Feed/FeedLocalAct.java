package com.example.acazia.Feed;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.acazia.R;
import com.google.android.material.tabs.TabLayout;

public class FeedLocalAct extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_local);
        initView();
        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());
        mViewPager2.setAdapter(simpleFragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager2);

    }

    private void initView() {
        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager2 = findViewById(R.id.viewPager2);
    }
}
