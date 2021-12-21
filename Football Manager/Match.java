/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.football;
import java.util.Date;
/**
 *
 * @author New
 */
public class Match {
     private FootballClub teamA;
    private FootballClub teamB;
    private int teamAScore;
    private int teamBScore;
    private Date date;
    
    
    public FootballClub getTeamA() {
        return teamA;
    }
    
    public FootballClub getTeamB() {
        return teamB;
    }
    
    public int getTeamAScore(){
        return teamAScore;
    }
    
    public int getTeamBScore(){
        return teamBScore;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setTeamA(FootballClub teamA) {
        this.teamA = teamA;
    }
    
    public void setTeamB(FootballClub teamB) {
        this.teamB = teamB;
    }
    
    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }
    
    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }  
}
