package com.androidexperiments.memory_inator;

import java.util.ArrayList;
import java.util.List;

public class icons
{
    //create a list and add all the drawable icons to it
    static public List<Integer> allIcons = new ArrayList<>();

    public icons(){
       setIcons();

    }

    public static List<Integer> setIcons() {
        allIcons.add(R.drawable.ic_football);
        allIcons.add(R.drawable.ic_cloud);
        allIcons.add(R.drawable.ic_hands);
        allIcons.add(R.drawable.ic_watch);
        allIcons.add(R.drawable.ic_whistle);
        allIcons.add(R.drawable.ic_fan);
        allIcons.add(R.drawable.ic_dot);
        allIcons.add(R.drawable.ic_star);
        return allIcons;

       // allIcons.add(R.drawable.ic_football);
       // allIcons.add(R.drawable.ic_football);
      //  allIcons.add(R.drawable.ic_football);
       // allIcons.add(R.drawable.ic_football);


    }


}
