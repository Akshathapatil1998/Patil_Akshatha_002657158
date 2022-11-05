/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.Encounter;
import hospitalmodel.models.VitalSigns;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class EncounterDirectory {
    
    ArrayList<Encounter> directory;

    public EncounterDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Encounter> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Encounter> directory) {
        this.directory = directory;
    }
    
    public Encounter addNewEncounter(Timestamp timestamp){
    Encounter encounter = new Encounter(timestamp);
    directory.add(encounter);
    return encounter;
    }
    
    public void deleteCityAccount(Encounter encounter){
        
        ListIterator<Encounter> var = directory.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(encounter)){
              var.remove();
            }
        }
    }
    
    public Encounter getCityAccount(Encounter encounter) {

        Encounter encounterAccountLocal = null;

        for(Encounter ci : directory){
            if(ci.equals(encounter))
                encounterAccountLocal =  encounter;
        }

         return encounterAccountLocal;
    }
    
    
}
