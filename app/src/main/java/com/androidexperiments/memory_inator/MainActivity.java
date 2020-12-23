package com.androidexperiments.memory_inator;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    private TextView tvDisplayPairs;
    private TextView tvDisplayMoves;
    private RecyclerView rvImageSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayMoves = findViewById(R.id.tvShowMoves);
        tvDisplayPairs = findViewById(R.id.tvShowPairs);
        rvImageSpace = findViewById(R.id.rvImagesSpace);


    }
}
