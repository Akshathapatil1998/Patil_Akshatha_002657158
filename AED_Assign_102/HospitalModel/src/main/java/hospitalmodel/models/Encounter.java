/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import java.sql.Timestamp;

/**
 *
 * @author abhilashgp
 */
public class Encounter extends VitalSigns{
    
    Timestamp instant;

    public Encounter(Timestamp instant) {
        this.instant = instant;
    }

    public Timestamp getInstant() {
        return instant;
    }

    public void setInstant(Timestamp instant) {
        this.instant = instant;
    }

    @Override
    public String toString() {
        return "Encounter{" + "instant=" + instant + '}';
    }    
}
