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
public class DoctorDirectory {
    ArrayList<Doctor>DoctorList;
    
    public DoctorDirectory(){
      DoctorList=new ArrayList<>();  
    
}

    public ArrayList<Doctor> getDoctorList() {
        return DoctorList;
    }

    public void setDoctorList(ArrayList<Doctor> DoctorList) {
        this.DoctorList = DoctorList;
    }
    



}
    
