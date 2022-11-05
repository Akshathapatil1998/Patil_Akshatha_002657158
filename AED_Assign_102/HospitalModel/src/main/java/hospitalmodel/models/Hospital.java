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
public class Hospital {
    
    private String Name;
    private int hospitalId;

    public Hospital() {
    }
    
    

    public Hospital(String Name, int hospitalId) {
        this.Name = Name;
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Name);
        hash = 97 * hash + this.hospitalId;
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
        final Hospital other = (Hospital) obj;
        if (this.hospitalId != other.hospitalId) {
            return false;
        }
        return Objects.equals(this.Name, other.Name);
    }

    @Override
    public String toString() {
        return "Hospital{" + "Name=" + Name + ", hospitalId=" + hospitalId + '}';
    }
    
    
                    
}
