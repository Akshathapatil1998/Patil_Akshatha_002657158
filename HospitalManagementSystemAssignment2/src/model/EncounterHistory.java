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
public class EncounterHistory {
    private ArrayList<Encounter> EncounterList;
    public EncounterHistory(){
        this.EncounterList= new ArrayList<Encounter>();
   }  

    public ArrayList<Encounter> getEncounter() {
        return EncounterList;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.EncounterList = encounter;
    }
    
public void addNewencounter( String patientname, long timestamp,Date date){
   Encounter encounter=new Encounter(  patientname, timestamp, date);
     EncounterList.add(encounter);
     }
}
