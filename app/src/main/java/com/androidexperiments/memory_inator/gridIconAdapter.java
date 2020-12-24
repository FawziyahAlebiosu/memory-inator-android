package com.androidexperiments.memory_inator;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//get list of items you want to display in rv
//populate it into the rv using adapters

public class gridIconAdapter  extends RecyclerView.Adapter<gridIconAdapter.ViewHolder>{
    public  List<memory> mIcons;
    public Integer[] test_list;
    public Integer num_items;
    //get reference for all the views it will hold in here

    //mIcons.add(R.drawable.default_image);


    public gridIconAdapter(Context context,Integer num_items, Integer[] test_list){
        this.test_list = test_list;
        this.num_items = num_items;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
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
            //memory current_item = mIcons.get(position);

            ImageView current_image = holder.ivIcons;
            current_image.setImageResource(test_list[0]);
            Log.i("haha", "worked");

    }

    @Override
    public int getItemCount() {
        return num_items;
    }
}
