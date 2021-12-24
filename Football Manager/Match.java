/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import required classes and package
package com.football;
import java.util.Date;
/**
 *
 * @author New
 */
public class Match {
     
     // private data members
    private FootballClub teamA;
    private FootballClub teamB;
    private int teamAScore;
    private int teamBScore;
    private Date date;
    
   //getter method for Team A
    public FootballClub getTeamA() {
        return teamA;
    }
     
    //getter method for Team B
    public FootballClub getTeamB() {
        return teamB;
    }
    
    //getter method for Team A score
    public int getTeamAScore(){
        return teamAScore;
    }
    
    //getter method for Team B score 
    public int getTeamBScore(){
        return teamBScore;
    }
    
     //getter method for Date
    public Date getDate() {
        return date;
    }
    
    //setter method for Team A 
    public void setTeamA(FootballClub teamA) {
        this.teamA = teamA;
    }
    
     //setter method for Team B
    public void setTeamB(FootballClub teamB) {
        this.teamB = teamB;
    }
    
    //setter method for Team A score
    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }
    
     //setter method for Team B score 
    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }
    
     //setter method for set date
    public void setDate(Date date) {
        this.date = date;
    }  
}
