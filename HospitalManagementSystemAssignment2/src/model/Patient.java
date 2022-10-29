/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Patient {
    
    private String patientID;
    private String primaryDoctorName;
    private String city;
    private VitalSignsHistory vitalSignsHistory;
    private int age;
    private Patient patient;
    private String personhouse;
    private String personcommunity;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPersonhouse() {
        return personhouse;
    }

    public void setPersonhouse(String personhouse) {
        this.personhouse = personhouse;
    }

    public String getPersoncommunity() {
        return personcommunity;
    }

    public void setPersoncommunity(String personcommunity) {
        this.personcommunity = personcommunity;
    }
    
    
    public Patient() {
        this.vitalSignsHistory = new VitalSignsHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getcity() {
        return city;
    }
    
    public void setcity(String prefferedPharmacy) {
        this.city = city;
    }
    
    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }
    
    public void setVitalSignsHistory(VitalSignsHistory vitalSignHistory) {
        this.vitalSignsHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
