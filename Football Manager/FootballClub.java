/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// import package
package com.football;

/**
 *
 * @author New
 */
//Footballclub class inherit abstract class Sportsclub
public class FootballClub extends SportsClub {
    
    //private data members
    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int scoredGoalsCount;
    private int receivedGoalsCount;
    private int points;
    private int matchesPlayed;
    
    //getter method for wincount
    public int getWinCount(){
        return winCount;
    }
    
    //getter method for draw count
    public int getDrawCount() {
        return drawCount;
    }
    
    //getter method for defeatcount
    public int getDefeatCount(){
        return defeatCount;
    }
    
    //getter method for score goal count
    public int getScoredGoalsCount() {
        return scoredGoalsCount;
    }
    
    //getter method for received Goal is count
    public int getReceivedGoalsCount() {
        return receivedGoalsCount;
    }
    //getter method for point
    public int getPoints() {
        return points;
    }
    //getter method for Matches Played
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    //setter method for Win Count
    public void setWinCount(int i) {
        winCount=i;
    }
    //setter method for Draw count
    public void setDrawCount(int i){
        drawCount = i;
    }
    //setter method for Defeat count
    public void setDefeatCount(int i) {
        defeatCount=i;
    }
    //setter method for Score Goals Count
    public void setScoredGoalsCount(int i){
        scoredGoalsCount = i;
    }
    //setter method for Received Goals Count
     public void setRecievedGoalsCount(int i){
        receivedGoalsCount = i;
    }
     //setter method for Points
     public void setPoints(int i){
        points = i;
    }
    //setter method for Matches Played
     public void setMatchesPlayed(int i){
        matchesPlayed = i;
    }
    
}
    

