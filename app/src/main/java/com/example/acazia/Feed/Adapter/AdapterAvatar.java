package com.example.acazia.Feed.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.Feed.Model.ModelTestAvatar;
import com.example.acazia.R;

import java.util.List;

public class AdapterAvatar extends RecyclerView.Adapter<AdapterAvatar.ViewHolder> {
    private List<ModelTestAvatar> modelTestAvatars;

    public AdapterAvatar(List<ModelTestAvatar> modelTestAvatars) {
        this.modelTestAvatars = modelTestAvatars;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_account_avatar, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelTestAvatars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
