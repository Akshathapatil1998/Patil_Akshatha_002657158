/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.Community;
import hospitalmodel.models.House;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class CommunityDirectory {
    
    private ArrayList<Community> communityDirectory;

    public CommunityDirectory() {
        this.communityDirectory = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public Community addCommunityCity(int zipCode, String address, House house){
        Community community = new Community(zipCode, address, house);
        communityDirectory.add(community);
        return community;
    }
    
    public void deleteCommunityAccount(Community community){
        
        ListIterator<Community> var = communityDirectory.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(community)){
              var.remove();
            }
        }
    }
    
    public Community getCommunityAccount(Community community) {

        Community cityAccountLocal = null;

        for(Community ci : communityDirectory){
            if(ci.equals(community))
                cityAccountLocal =  community;
        }

         return cityAccountLocal;
    }
    
}
