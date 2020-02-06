package com.example.acazia.feed;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.acazia.feed.fragment.FragmentAdd;
import com.example.acazia.feed.fragment.FragmentEvent;
import com.example.acazia.feed.fragment.FragmentFeed;
import com.example.acazia.feed.fragment.FragmentNotification;
import com.example.acazia.feed.fragment.FragmentProfile;
import com.example.acazia.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FeedLocalAct extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private BottomNavigationView mBottomNavigationView;
    private FrameLayout mFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        initView();
        loadFragment(new FragmentFeed(this));
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private void initView() {
        mBottomNavigationView = findViewById(R.id.bottomNavigationView);
        mFragmentContainer = findViewById(R.id.fragment_container);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.navigation_feed:
                fragment = new FragmentFeed(this);
                break;
            case R.id.navigation_new:
                fragment = new FragmentNotification();
                break;
            case R.id.navigation_add:
                startActivity(new Intent(FeedLocalAct.this, CreateSessionActivity.class));
                break;
            case R.id.navigation_event:
                fragment = new FragmentEvent();
                break;
            case R.id.navigation_profile:
                fragment = new FragmentProfile();
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
