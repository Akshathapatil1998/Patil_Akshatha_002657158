/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.City;
import hospitalmodel.models.Community;
import hospitalmodel.models.House;
import hospitalmodel.models.Patient;
import hospitalmodel.models.Person;
import hospitalmodel.roles.Roles;
import hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class PatientDirectory {
    
    ArrayList<Patient> directory;

    public PatientDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Patient> directory) {
        this.directory = directory;
    }
    
    public Patient addNewPatient(String name,int patientId, String BloodType, String BloodPressure, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount, String GenString){
    Patient patient = new Patient(name,patientId, BloodType,BloodPressure,Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount, GenString);
    directory.add(patient);
    return patient;
    }
    
    public Patient authenticateUser(String username, String password){
    for (Patient patient : directory)
        if (patient.getUseraccount().getUsername().equals(username) && patient.getUseraccount().getPassword().equals(password)){
            return patient;
        }
    return null;
    }
    
    
    public Patient getPatient(Patient patient) {

    Patient patientLocal = null;

    for(Patient pat : directory){
        if(pat.equals(patient))
            patientLocal =  pat;
    }

     return patientLocal;
    }

    public void deletePatient(Patient patient){

    ListIterator<Patient> var = directory.listIterator();

    while (var.hasNext()) {

        if (var.next().equals(patient)){
          var.remove();
        }
    }

    }
        
}
