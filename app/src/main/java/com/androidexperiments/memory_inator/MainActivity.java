package com.androidexperiments.memory_inator;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TextView tvDisplayPairs;
    private TextView tvDisplayMoves;
    private RecyclerView rvImageSpace;
    private List<Integer> temp = icons.setIcons();

    //mIcons.allIcons
    private List<Integer> chosen;
    private sizeBoard boardObject = new sizeBoard("EASY");
    private List<Integer> randomizedImages ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayMoves = findViewById(R.id.tvShowMoves);
        tvDisplayPairs = findViewById(R.id.tvShowPairs);
        rvImageSpace = findViewById(R.id.rvImagesSpace);

        Log.i("TAG", String.valueOf(temp.size()));
        //randomize all icons
        Collections.shuffle(temp);
        //take a set from that random list

        chosen = temp.subList(0, boardObject.getNumberOfPairs());
        //make a copy of random list
        randomizedImages = new ArrayList<>(chosen);
        //add copy and random list to one list
        randomizedImages.addAll(chosen);
        //randomize new version of list
        Collections.shuffle(randomizedImages);
        //pass in new list
        Log.i("TAG", String.valueOf(randomizedImages));

        //create adapter for rv
        gridIconAdapter imageAdapter = new gridIconAdapter(this, boardObject.getNumberOfCards(), randomizedImages);





        rvImageSpace.setAdapter(imageAdapter);
        //simply for optimization
        rvImageSpace.setHasFixedSize(true);

        rvImageSpace.setLayoutManager(new GridLayoutManager(this, boardObject.getWidth()));
    }
}
