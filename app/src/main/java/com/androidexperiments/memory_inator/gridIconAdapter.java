package com.androidexperiments.memory_inator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class gridIconAdapter extends RecyclerView.Adapter<gridIconAdapter.ViewHolder>{
    private  List<memory> mIcons;

    public gridIconAdapter(List<memory> mIcons){
        this.mIcons = mIcons;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        //get reference for all the views it will hold in here
        public ImageView ivIcons;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcons = itemView.findViewById(R.id.ivGridIcons);


        }
    }

    @NonNull
    @Override
    public gridIconAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //inflate it
        View iconView = layoutInflater.inflate(R.layout.grid_layout_for_icons, parent, false);
        //return a new object of vewiholder right after
        ViewHolder viewHolder = new ViewHolder(iconView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull gridIconAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
