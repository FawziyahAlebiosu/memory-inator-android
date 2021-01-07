package com.androidexperiments.memory_inator;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TextView tvDisplayPairs;
    private TextView tvDisplayMoves;
    private RecyclerView rvImageSpace;
    private List<memory> mIcons;
    private Integer[] test_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayMoves = findViewById(R.id.tvShowMoves);
        tvDisplayPairs = findViewById(R.id.tvShowPairs);
        rvImageSpace = findViewById(R.id.rvImagesSpace);
        test_list= new Integer[] { R.drawable.default_image};
        //create adapter for rv
        gridIconAdapter imageAdapter = new gridIconAdapter(this, 8, test_list);





        rvImageSpace.setAdapter(imageAdapter);
        //simply for optimization
        rvImageSpace.setHasFixedSize(true);

        rvImageSpace.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
