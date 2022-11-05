/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dell
 */

public class VitalsSign {
    
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private Date timestamp;
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    
    public int getHeartRate() {
        return heartRate;
    }
    
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    public int getBloodPressure() {
        return bloodPressure;
    }
    
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
}

//public class Vitalsigns {
//    private double temperature;
//    private double bloodpressure;
//    private int pulse;
//
//    public double getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(double temperature) {
//        this.temperature = temperature;
//    }
//
//    public double getBloodpressure() {
//        return bloodpressure;
//    }
//
//    public void setBloodpressure(double bloodpressure) {
//        this.bloodpressure = bloodpressure;
//    }
//
//    public int getPulse() {
//        return pulse;
//    }
//
//    public void setPulse(int pulse) {
//        this.pulse = pulse;
//    }
//    
//    
//    
//    
//}
