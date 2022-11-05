/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import hospitalmodel.roles.Roles;
import hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class Doctor extends Person{
    
    private String doctorName;
    private int docId;
    private String Department;
    private Hospital hospital;
    private ArrayList<Patient> patientDir= new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String doctorName, int docId, String Department, Hospital hospital) {
        this.doctorName = doctorName;
        this.docId = docId;
        this.Department = Department;
        this.hospital = hospital;
    }

    public Doctor(String doctorName, int docId, String Department, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount useraccount, String Gender) {
        super(Name, PersonId, UserRoles, roles, city, community, house, doa, useraccount, Gender);
        this.doctorName = doctorName;
        this.docId = docId;
        this.Department = Department;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public void addPatient(Patient patient){
        patientDir.add(patient);
    }
    
    public Patient getPatient(Patient patient) {

    Patient patientLocal = null;

    for(Patient pat : patientDir){
        if(pat.equals(patient))
            patientLocal =  pat;
    }

     return patientLocal;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.doctorName);
        hash = 67 * hash + this.docId;
        hash = 67 * hash + Objects.hashCode(this.Department);
        hash = 67 * hash + Objects.hashCode(this.hospital);
        hash = 67 * hash + Objects.hashCode(this.patientDir);
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
        final Doctor other = (Doctor) obj;
        if (this.docId != other.docId) {
            return false;
        }
        if (!Objects.equals(this.doctorName, other.doctorName)) {
            return false;
        }
        if (!Objects.equals(this.Department, other.Department)) {
            return false;
        }
        if (!Objects.equals(this.hospital, other.hospital)) {
            return false;
        }
        return Objects.equals(this.patientDir, other.patientDir);
    }
    
    

    @Override
    public String toString() {
        return "Doctor{" + "doctorName=" + doctorName + ", docId=" + docId + ", Department=" + Department + '}';
    }
        
}
