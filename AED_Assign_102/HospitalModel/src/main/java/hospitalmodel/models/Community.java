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
public class Community {
    
    private String CommunityName;
    private int zipCode;
    private String Address;
    private House house;

    public Community(int zipCode, String Address, House house) {
        this.zipCode = zipCode;
        this.Address = Address;
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }
      
    public House addNewHouse(String houseName){
        House house = new House(houseName);
        return house;
    }

    @Override
    public String toString() {
        return "Community{" + "zipCode=" + zipCode + ", Address=" + Address + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.CommunityName);
        hash = 41 * hash + this.zipCode;
        hash = 41 * hash + Objects.hashCode(this.Address);
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
        final Community other = (Community) obj;
        if (this.zipCode != other.zipCode) {
            return false;
        }
        if (!Objects.equals(this.CommunityName, other.CommunityName)) {
            return false;
        }
        return Objects.equals(this.Address, other.Address);
    }


    
    
       
   
}
