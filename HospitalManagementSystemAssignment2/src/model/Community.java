/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Community {
    private int zip;

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public ArrayList<House> getCommunity() {
        return community;
    }

    public void setCommunity(ArrayList<House> community) {
        this.community = community;
    }
    
    
    private ArrayList<House> community;
    public Community(){
        this.community= new ArrayList<House>();
    }
}
