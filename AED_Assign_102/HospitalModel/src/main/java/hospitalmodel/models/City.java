/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class City {
    
    private String States;
    private String Cities;
    private Community community;
    
    public City(String States, String Cities, Community community) {
        this.States = States;
        this.Cities = Cities;
        this.community = community;
    }
    
    public String getCities() {
        return Cities;
    }

    public void setCities(String Cities) {
        this.Cities = Cities;
    }
    
    public String getStates() {
        return States;
    }

    public void setStates(String Name) {
        this.States = Name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
   
    @Override
    public String toString() {
        return "City{" + "States=" + States + ", Cities=" + Cities + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.States);
        hash = 79 * hash + Objects.hashCode(this.Cities);
        hash = 79 * hash + Objects.hashCode(this.community);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (!Objects.equals(this.States, other.States)) {
            return false;
        }
        if (!Objects.equals(this.Cities, other.Cities)) {
            return false;
        }
        return Objects.equals(this.community, other.community);
    }
    
       
}
