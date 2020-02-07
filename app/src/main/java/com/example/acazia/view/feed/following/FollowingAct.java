package com.example.acazia.view.feed.following;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.R;

import java.util.ArrayList;
import java.util.List;

public class FollowingAct extends AppCompatActivity {

    private RecyclerView mRv;
    private List<ModelTestFollowing> modelTestFollowings;
    private AdapterFollowing adapterFollowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);
        initView();

        modelTestFollowings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            modelTestFollowings.add(new ModelTestFollowing("", "", ""));
        }
        adapterFollowing = new AdapterFollowing(modelTestFollowings);
        mRv.setAdapter(adapterFollowing);

        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(this);
        mRv.setLayoutManager(manager1);
    }

    private void initView() {
        mRv = findViewById(R.id.rv);
    }
}
