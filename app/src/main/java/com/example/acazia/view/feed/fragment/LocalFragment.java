package com.example.acazia.view.feed.fragment;

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

import com.example.acazia.view.feed.adapter.AdapterItem;
import com.example.acazia.view.feed.model.ModelTest;
import com.example.acazia.R;

import java.util.ArrayList;
import java.util.List;

public class LocalFragment extends Fragment {
    private RecyclerView mRv;
    private List<ModelTest> modelList;
    private AdapterItem myAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_feed_local, container, false);
        initView(root);
        modelList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            modelList.add(new ModelTest("", "Nguyen Van " + i));
        }

        Log.e("size", "" + modelList.size());
        myAdapter = new AdapterItem(modelList);
        mRv.setAdapter(myAdapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        mRv.setLayoutManager(manager);
        return root;
    }

    private void initView(View view) {
        mRv = view.findViewById(R.id.rv);
    }
}
