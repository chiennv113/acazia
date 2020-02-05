package com.example.acazia.Feed.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.Feed.Adapter.AdapterAvatar;
import com.example.acazia.Feed.Adapter.AdapterItem;
import com.example.acazia.Feed.Model.ModelTest;
import com.example.acazia.Feed.Model.ModelTestAvatar;
import com.example.acazia.R;

import java.util.ArrayList;
import java.util.List;

public class YourCircleFragment extends Fragment {

    private List<ModelTestAvatar> modelList;
    private List<ModelTest> modelTests;

    private ImageView mImageView2;
    private RecyclerView mRvHorizontal;
    private RecyclerView mRvVertical;
    private AdapterAvatar adapterAvatar;
    private AdapterItem adapterItem;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_your_circle, container, false);
        initView(root);
        modelList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            modelList.add(new ModelTestAvatar(""));
        }
        Log.e("GGG", "onCreateView: " + modelList.size());
        adapterAvatar = new AdapterAvatar(modelList);
        mRvHorizontal.setAdapter(adapterAvatar);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(), 1, RecyclerView.HORIZONTAL, true);
        mRvHorizontal.setLayoutManager(manager);


        modelTests = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            modelTests.add(new ModelTest("", "Nguyen Van " + i));
        }

        Log.e("size", "" + modelTests.size());
        adapterItem = new AdapterItem(modelTests);
        mRvVertical.setAdapter(adapterItem);

        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(getContext());
        mRvVertical.setLayoutManager(manager1);
        return root;
    }

    private void initView(View view) {
        mImageView2 = view.findViewById(R.id.imageView2);
        mRvHorizontal = view.findViewById(R.id.rvHorizontal);
        mRvVertical = view.findViewById(R.id.rvVertical);
    }
}
