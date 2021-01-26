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

import static com.androidexperiments.memory_inator.MainActivity.updateGameByFlip;
//get list of items you want to display in rv
//populate it into the rv using adapters

public class gridIconAdapter  extends RecyclerView.Adapter<gridIconAdapter.ViewHolder>{
    public List<icons> cards;

    private static final int margin = 10;
    public sizeBoard boardObject = new sizeBoard("EASY");
    public int numOfItems;



    public gridIconAdapter(Context context,Integer num_items, List<icons> images){
        this.cards = images;
        this.numOfItems = num_items;
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
        int widthCard = parent.getWidth()/boardObject.getWidth() - (2* margin);
        int heightCard = parent.getHeight()/boardObject.getHeight() -(2* margin);
        int cardLength = Math.min(widthCard, heightCard);



        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //inflate it
        View iconView = layoutInflater.inflate(R.layout.grid_layout_for_icons, parent, false);
        ViewGroup.MarginLayoutParams paramsObject = (ViewGroup.MarginLayoutParams) iconView.findViewById(R.id.ivGridIcons).getLayoutParams();
        paramsObject.width = cardLength;
        paramsObject.height = cardLength;
        paramsObject.setMargins(margin, margin, margin, margin);

        //return a new object of vewiholder right after
        ViewHolder viewHolder = new ViewHolder(iconView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull gridIconAdapter.ViewHolder holder, final int position) {
            //memory current_item = mIcons.get(position);

            ImageView current_image = holder.ivIcons;
          //  iconObj.setNameCard(cards.get(position));
         //   if(iconObj.isFace)
            Log.i("tag", String.valueOf(cards.get(position).isFaceUp()));
            icons currentlyDisplayed = cards.get(position);
            if(currentlyDisplayed.isFaceUp()){
                current_image.setImageResource(icons.allIcons.get(position));
            }
            else{
                current_image.setImageResource(R.drawable.ic_launcher_background);
            }

            if(cards.get(position).hasBeenMatched){
               Log.i("TAG", "WORKKK");

            }
            else{
                Log.i("TAG", "WORKKK");

                //current_image.setImageAlpha((int) 1.0f);
            }

           // if(iconObj.)


            //Log.i("haha", "worked");
            current_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    updateGameByFlip(position);

                    Log.i("TAG", "/d card clicked");

                }
            });

        }



    @Override
    public int getItemCount() {
        return numOfItems;
    }
}
