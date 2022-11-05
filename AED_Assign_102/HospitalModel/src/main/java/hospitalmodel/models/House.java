/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class House {
    
    private String houseName;

    public House(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public String toString() {
        return houseName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.houseName);
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
        final House other = (House) obj;
        return Objects.equals(this.houseName, other.houseName);
    }
    
    
    
    
    
}
