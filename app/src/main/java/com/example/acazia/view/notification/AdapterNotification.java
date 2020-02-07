package com.example.acazia.view.notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acazia.R;

import java.util.List;

public class AdapterNotification extends RecyclerView.Adapter<AdapterNotification.Viewholder> {

    private List<ModelTestNotification> modelTestNotificationsl;


    public AdapterNotification(List<ModelTestNotification> modelTestNotificationsl) {
        this.modelTestNotificationsl = modelTestNotificationsl;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_notification, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        ModelTestNotification md = modelTestNotificationsl.get(position);
        holder.mTvName.setText(md.getName());
        holder.mTvContent.setText(md.getContent());
        holder.mTvAction.setText(md.getAction());
    }

    @Override
    public int getItemCount() {
        return modelTestNotificationsl.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView mImgAvatar;
        private TextView mTvName;
        private TextView mTvAction;
        private TextView mTvContent;
        private ImageView mImgArrowRight;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            mImgAvatar = itemView.findViewById(R.id.imgAvatar);
            mTvName = itemView.findViewById(R.id.tvName);
            mTvAction = itemView.findViewById(R.id.tvAction);
            mTvContent = itemView.findViewById(R.id.tvContent);
            mImgArrowRight = itemView.findViewById(R.id.imgArrowRight);
        }
    }
}
