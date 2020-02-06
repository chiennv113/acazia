package com.example.acazia.feed.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.feed.model.ModelTestFollowing;
import com.example.acazia.R;

import java.util.List;

public class AdapterFollowing extends RecyclerView.Adapter<AdapterFollowing.ViewHolder> {

    private List<ModelTestFollowing> modelTestFollowings;


    public AdapterFollowing(List<ModelTestFollowing> modelTestFollowings) {
        this.modelTestFollowings = modelTestFollowings;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_following, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelTestFollowings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImgAvatar;
        private TextView mTvName;
        private TextView mTvEmail;
        private Button mBtnFollow;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgAvatar = itemView.findViewById(R.id.imgAvatar);
            mTvName = itemView.findViewById(R.id.tvName);
            mTvEmail = itemView.findViewById(R.id.tvEmail);
            mBtnFollow = itemView.findViewById(R.id.btnFollow);
        }
    }
}
