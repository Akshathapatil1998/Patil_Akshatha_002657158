/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.Hospital;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> directory;

    public HospitalDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospital() {
        return directory;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.directory = hospital;
    }
    
    public Hospital addNewHospital(String name,int hospitalId){
        Hospital hospital = new Hospital(name,hospitalId);
        directory.add(hospital);
        return hospital;
    }
    
    public Hospital getHospitalF(Hospital hospital) {

    Hospital HospitalLocal = null;

    for(Hospital pat : directory){
        if(pat.equals(hospital))
            HospitalLocal =  pat;
    }

     return HospitalLocal;
    }

    public void deleteHospitalF(Hospital hospital){

    ListIterator<Hospital> var = directory.listIterator();

    while (var.hasNext()) {

        if (var.next().equals(hospital)){
          var.remove();
        }
    }

    }
    
}
