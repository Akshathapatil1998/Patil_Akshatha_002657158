/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.directory;

import hospitalmodel.models.City;
import hospitalmodel.models.Community;
import hospitalmodel.models.Doctor;
import hospitalmodel.models.Hospital;
import hospitalmodel.models.House;
import hospitalmodel.roles.Roles;
import hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> directory;

    public DoctorDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Doctor> directory) {
        this.directory = directory;
    }
    
    public Doctor authenticateUser(String username, String password){
    for (Doctor doctor : directory)
        if (doctor.getUseraccount().getUsername().equals(username) && doctor.getUseraccount().getPassword().equals(password)){
            return doctor;
        }
    return null;
    }
    
    public Doctor addNewDoctor(String docName,int doctorId,String department, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount, String GenString){
    Doctor doctor = new Doctor(docName,doctorId,department, Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount, GenString);
    directory.add(doctor);
    return doctor;
    }
    
    public Doctor getDoctor(Doctor doctor) {

    Doctor patientLocal = null;

    for(Doctor pat : directory){
        if(pat.equals(doctor))
            patientLocal =  pat;
    }

     return patientLocal;
    }

    public void deleteDoctor(Doctor doctor){

    ListIterator<Doctor> var = directory.listIterator();

    while (var.hasNext()) {

        if (var.next().equals(doctor)){
          var.remove();
        }
    }

    }
}
