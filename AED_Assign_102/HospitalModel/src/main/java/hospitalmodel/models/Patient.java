/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import hospitalmodel.roles.Roles;
import hospitalmodel.userAccount.UserAccount;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class Patient extends Person{
    
    private String patientName;
    private int patientId;
    private String BloodType;
    private String BloodPressure;
    private Encounter encounter;

    public Patient() {
    }
    
    

    public Patient(String patientName, int patientId, String BloodType, String BloodPressure, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount useraccount, String Gender) {
        super(Name, PersonId, UserRoles, roles, city, community, house, doa, useraccount, Gender);
        this.patientName = patientName;
        this.patientId = patientId;
        this.BloodType = BloodType;
        this.BloodPressure = BloodPressure;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.patientName);
        hash = 97 * hash + this.patientId;
        hash = 97 * hash + Objects.hashCode(this.BloodType);
        hash = 97 * hash + Objects.hashCode(this.BloodPressure);
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
        final Patient other = (Patient) obj;
        if (this.patientId != other.patientId) {
            return false;
        }
        if (!Objects.equals(this.patientName, other.patientName)) {
            return false;
        }
        if (!Objects.equals(this.BloodType, other.BloodType)) {
            return false;
        }
        return Objects.equals(this.BloodPressure, other.BloodPressure);
    }

    @Override
    public String toString() {
        return "Patient{" + "patientName=" + patientName + ", patientId=" + patientId + ", BloodType=" + BloodType + ", BloodPressure=" + BloodPressure + ", encounter=" + encounter + '}';
    }


}
