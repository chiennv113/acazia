package com.example.acazia.Feed.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.Feed.Adapter.AdapterItem;
import com.example.acazia.Feed.Model.ModelTest;
import com.example.acazia.R;

import java.util.ArrayList;
import java.util.List;

public class TrendingFragment extends Fragment {
    private RecyclerView mRv;
    private List<ModelTest> modelList;
    private AdapterItem myAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_trending, container, false);
        initView(root);
        modelList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            modelList.add(new ModelTest("", "Nguyen Van " + i));
        }

        Log.e("size", "" + modelList.size());
        myAdapter = new AdapterItem(modelList);
        mRv.setAdapter(myAdapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        mRv.setLayoutManager(manager);
        return root;
    }

    private void initView(View view) {
        mRv = view.findViewById(R.id.rv);
    }
}
