package com.example.acazia.view.feed.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.view.feed.model.ModelTest;
import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.Viewholder> {

    private List<ModelTest> modelTests;

    public AdapterItem(List<ModelTest> modelTests) {
        this.modelTests = modelTests;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_feed, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        ModelTest md = modelTests.get(position);
        holder.mTvTitle.setText(md.getTitle());
    }

    @Override
    public int getItemCount() {
        return modelTests.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        private FloatingActionButton mFloatingActionButton;
        private ImageView mImageView;
        private TextView mTvTitle;
        private TextView mTvDateTime;
        private TextView mTvLocation;
        private TextView mTvDate;
        private TextView mTvMonth;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            mFloatingActionButton = itemView.findViewById(R.id.floatingActionButton);
            mImageView = itemView.findViewById(R.id.imageView);
            mTvTitle = itemView.findViewById(R.id.tvTitle);
            mTvDateTime = itemView.findViewById(R.id.tvDateTime);
            mTvLocation = itemView.findViewById(R.id.tvLocation);
            mTvDate = itemView.findViewById(R.id.tvDate);
            mTvMonth = itemView.findViewById(R.id.tvMonth);
        }
    }
}
