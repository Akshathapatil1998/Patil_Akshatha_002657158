/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.City;
import hospitalmodel.models.Community;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class CityDirectory {
    
    private ArrayList<City> cityDirectory;

    public CityDirectory() {
        this.cityDirectory = new ArrayList<>();
    }

    public ArrayList<City> getCity() {
        return cityDirectory;
    }

    public void setCity(ArrayList<City> city) {
        this.cityDirectory = city;
    }
    
    public City addNewCity(String states, String cities, Community community){
        City city = new City(states,cities, community);
        cityDirectory.add(city);
        return city;
    }
    
    public void deleteCityAccount(City city){
        
        ListIterator<City> var = cityDirectory.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(city)){
              var.remove();
            }
        }
    }
    
    public City getCityAccount(City city) {

        City cityAccountLocal = null;

        for(City ci : cityDirectory){
            if(ci.equals(city))
                cityAccountLocal =  city;
        }

         return cityAccountLocal;
    }
    
}
