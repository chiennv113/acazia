package com.example.acazia.feed.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.R;
import com.example.acazia.feed.adapter.AdapterItem;
import com.example.acazia.feed.adapter.AdapterNotification;
import com.example.acazia.feed.model.ModelTestNotification;

import java.util.ArrayList;
import java.util.List;

public class FragmentNotification extends Fragment {
    private RecyclerView mRv;

    private List<ModelTestNotification> modelTestNotifications;
    private AdapterNotification adapterNotification;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);

        modelTestNotifications = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            modelTestNotifications.add(new ModelTestNotification("", "name " + i, "action " + i, "content " + i));
        }
        adapterNotification = new AdapterNotification(modelTestNotifications);
        mRv.setAdapter(adapterNotification);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        mRv.setLayoutManager(manager);
    }

    private void initView(View view) {
        mRv = view.findViewById(R.id.rv);
    }
}
