package com.androidexperiments.memory_inator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.androidexperiments.memory_inator.MainActivity.listOfIcons;

public class icons

{


    private int nameCard;
    private static int numPairsFound;
    private static Integer positionOfCardSelectedOnce;
    public static boolean isMatchFound = false;

    public static Integer getPositionOfCardSelectedOnce() {
        return positionOfCardSelectedOnce;
    }

    public void setPositionOfCardSelectedOnce(int positionOfCardSelectedOnce) {
        this.positionOfCardSelectedOnce = positionOfCardSelectedOnce;
    }

    public int getNameCard() {
        return nameCard;
    }

    public void setNameCard(int nameCard) {
        this.nameCard = nameCard;
    }

    public boolean isFaceUp ;
    public  boolean hasBeenMatched;

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public boolean isHasBeenMatched() {
        return hasBeenMatched;
    }

    public void setHasBeenMatched(boolean hasBeenMatched) {
        this.hasBeenMatched = hasBeenMatched;
    }

    //create a list and add all the drawable icons to it
    static public List<Integer> allIcons = new ArrayList<>();

    public icons(int res_reference){
       allIcons.add(res_reference);
       this.isFaceUp = false;
       this.hasBeenMatched = false;

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
    public static boolean flipCard(int position){
        //cases:
        //0 cards previously flipped, RESTORE AND FLIP THE CARD OVER

        if(getPositionOfCardSelectedOnce()== null){
            restoreTheBoard();
            positionOfCardSelectedOnce = position;
        }
        //1 card previously flipped, FLIP OVER, THEN CHECK IF THIS AND PREVIOUS CARD WERE THE SAME
        else{
            isMatchFound = checkIfMatched(positionOfCardSelectedOnce, position);
            positionOfCardSelectedOnce = null;
            }

        icons currentCard = listOfIcons.get(position);
        currentCard.setFaceUp(!currentCard.isFaceUp);

        return isMatchFound;


    }
    public static void restoreTheBoard(){
        for(icons anyCard: listOfIcons){
            if(!anyCard.isHasBeenMatched()){
                anyCard.isFaceUp = false;
            }
        }
    }
    public static boolean checkIfMatched(Integer indexOne, int indexTwo){
        if(listOfIcons.get(indexOne).getNameCard()!= listOfIcons.get(indexTwo).getNameCard()){
            return false;
        }
        listOfIcons.get(indexOne).hasBeenMatched = true;
        listOfIcons.get(indexTwo).hasBeenMatched = true;
        numPairsFound++;
        return true;

    }








}
