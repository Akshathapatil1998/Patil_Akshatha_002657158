/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.House;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class HouseDirectory {
    
    private ArrayList<House> houseDirectory;

    public HouseDirectory() {
        this.houseDirectory = new ArrayList<>();
    }

    public ArrayList<House> getCommunityDirectory() {
        return houseDirectory;
    }

    public void setCommunityDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }

    public House addHouse(String houseNameString){
        House house = new House(houseNameString);
        houseDirectory.add(house);
        return house;
    }
    
    public void deleteHouseAccount(House house){
        
        ListIterator<House> var = houseDirectory.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(house)){
              var.remove();
            }
        }
    }
    
    public House getHouseAccount(House house) {

        House houseAccountLocal = null;

        for(House ho : houseDirectory){
            if(ho.equals(house))
                houseAccountLocal =  house;
        }

         return houseAccountLocal;
    }
    
}
