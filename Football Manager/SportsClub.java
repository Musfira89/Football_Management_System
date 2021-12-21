/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.football;

/**
 *
 * @author New
 */
public abstract class SportsClub {
    private String name;
    private String location;
    private String statistics;
    
    @Override
    public boolean equals(Object o) {
        return this.name.equals(((SportsClub)o).name);
    }
    
    
    public String getName() {
        return name;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getStatistics() {
        return statistics;
    }
    
    public void setLocation(String s) {
        this.location = s;
    }
    
    public void setName(String s) {
        this.name = s;
    } 
    
    public void setStatistics(String s) {
        this.statistics = s;
    }   
    
} 

