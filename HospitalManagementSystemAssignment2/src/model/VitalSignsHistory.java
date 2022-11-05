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
public class VitalSignsHistory {
    
    
    private ArrayList<VitalsSign> history;
    
    public VitalSignsHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalsSign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalsSign> history) {
        this.history = history;
    }
    
    public VitalsSign createAndAddVitalSign() {
        VitalsSign vitalSign = new VitalsSign();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalsSign vitalSign) {
        history.remove(vitalSign);
    }
}

    

