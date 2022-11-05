/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Encounter {
    private String patientname; 
    private long timestamp;
    private Date date;

    public Encounter(String patientname, long timestamp, Date date) {
        this.patientname = patientname;
        this.timestamp = timestamp;
        this.date = date;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    private ArrayList<VitalsSign> history;
    public Encounter(){
        this.history= new ArrayList<VitalsSign>();
    }

    public ArrayList<VitalsSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalsSign> history) {
        this.history = history;
    }
    public VitalsSign addNewvitals(){
      VitalsSign Newvitals = new VitalsSign();
      history.add(Newvitals);
      return Newvitals;
     }
     
    
}
