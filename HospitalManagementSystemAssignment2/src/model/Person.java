  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */

public class Person {
    private String personName;
    private int age;
    private Patient patient;
    private String personhouse;
    private String personcommunity;
    private String personcity;

    public String getPersonhouse() {
        return personhouse;
    }

    public void setPersonhouse(String personhouse) {
        this.personhouse = personhouse;
    }

    public String getPersoncommunity() {
        return personcommunity;
    }

    public void setPersoncommunity(String personcommunity) {
        this.personcommunity = personcommunity;
    }

    public String getPersoncity() {
        return personcity;
    }

    public void setPersoncity(String personcity) {
        this.personcity = personcity;
    }
    
    public String getPersonName() {
        return personName;
    }
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
}

//public class Person {
//    private String firstname;
//     private String lastname;
//    private int age;
//    private String address;
//    public Person() {
//   
//   }
//
//    public Person(String firstname, String lastname, int age, String address) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.age = age;
//        this.address = address;
//    }
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    
//    
//}

  
