/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.roles;

import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class Roles {
    
     public String Admin = "Admin";
     public String Doctor = "Doctor";
     public String Patient = "Patient";
     public String Community = "Community";
     public String Hospital = "Hospital";
     
    public String roleType;

    public Roles() {
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Roles{" + "roleType=" + roleType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Admin);
        hash = 29 * hash + Objects.hashCode(this.Doctor);
        hash = 29 * hash + Objects.hashCode(this.Patient);
        hash = 29 * hash + Objects.hashCode(this.Community);
        hash = 29 * hash + Objects.hashCode(this.Hospital);
        hash = 29 * hash + Objects.hashCode(this.roleType);
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
        final Roles other = (Roles) obj;
        if (!Objects.equals(this.Admin, other.Admin)) {
            return false;
        }
        if (!Objects.equals(this.Doctor, other.Doctor)) {
            return false;
        }
        if (!Objects.equals(this.Patient, other.Patient)) {
            return false;
        }
        if (!Objects.equals(this.Community, other.Community)) {
            return false;
        }
        if (!Objects.equals(this.Hospital, other.Hospital)) {
            return false;
        }
        return Objects.equals(this.roleType, other.roleType);
    }
    
    
   
}
