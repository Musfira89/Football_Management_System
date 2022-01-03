/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import package
package com.football;


 
// Abstract class
public abstract class SportsClub {
    
    //private data members
    private String name;        
    private String location
    private String statistics;    
    
    @Override
    public boolean equals(Object o)        //String equals() method overrides the equals() method of the Object class
    {   
        return this.name.equals(((SportsClub)o).name);
    }
    
    //getter method for name 
    public String getName() {
        return name;
    }
    
    //getter method for location
    public String getLocation() {
        return location;
    }
    
    //getter method for statistics
    public String getStatistics() {
        return statistics;
    }
    
    //setter method for locatioin
    public void setLocation(String s) {
        this.location = s;
    }
    
    //setter method for name
    public void setName(String s) {
        this.name = s;
    } 
    
    //setter method for statistics
    public void setStatistics(String s) {
        this.statistics = s;
    }   
    
} 

