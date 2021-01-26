package com.androidexperiments.memory_inator;

public class sizeBoard {
    //helps to decide how the board size will be
    final static int EASY = 8;
    final static int MEDIUM = 18;
    final static int HARD = 24;
    public String gameMode;
    private int width;
    private int numberOfCards;
//unique number of icons is numcards/2
    public sizeBoard(String gameMode){
        this.gameMode = gameMode;
        if(gameMode.equals("EASY")){
            numberOfCards = EASY;

        }
        else if(gameMode.equals("MEDIUM")){
            numberOfCards = MEDIUM;
        }
        else if(gameMode.equals("HARD")){
            numberOfCards = HARD;
        }
        setWidth();
    }
    public int getNumberOfCards(){
        return numberOfCards;
    }

    public void  setWidth(){
        if(gameMode.equals("EASY")){
            width =  2;
        }
        else if(gameMode.equals("MEDIUM")){
            width = 3;
        }
        else if(gameMode.equals("HARD")){
            width = 4;
        }
        //default will be easy because why not!
        width =  2;
    }
    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return numberOfCards/getWidth();
    }
    public int getNumberOfPairs(){
        return numberOfCards/2;
    }



}
