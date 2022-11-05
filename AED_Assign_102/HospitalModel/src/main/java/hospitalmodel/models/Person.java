 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmodel.models;

import hospitalmodel.roles.Roles;
import hospitalmodel.userAccount.UserAccount;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author abhilashgp
 */
public class Person {
    
    private String Name;
    private int PersonId;
    private String UserRoles;
    private Roles roles;
    private City city;
    private Community community;
    private House house;
    private Date doa;
    private UserAccount useraccount;
    private String Gender;

    public Person() {
    }

    public Person(String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount useraccount, String Gender) {
        this.Name = Name;
        this.PersonId = PersonId;
        this.UserRoles = UserRoles;
        this.roles = roles;
        this.city = city;
        this.community = community;
        this.house = house;
        this.doa = doa;
        this.useraccount = useraccount;
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int PersonId) {
        this.PersonId = PersonId;
    }

    public String getUserRoles() {
        return UserRoles;
    }

    public void setUserRoles(String UserRoles) {
        this.UserRoles = UserRoles;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getDoa() {
        return doa;
    }

    public void setDoa(Date doa) {
        this.doa = doa;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.Name);
        hash = 71 * hash + this.PersonId;
        hash = 71 * hash + Objects.hashCode(this.UserRoles);
        hash = 71 * hash + Objects.hashCode(this.roles);
        hash = 71 * hash + Objects.hashCode(this.city);
        hash = 71 * hash + Objects.hashCode(this.community);
        hash = 71 * hash + Objects.hashCode(this.house);
        hash = 71 * hash + Objects.hashCode(this.doa);
        hash = 71 * hash + Objects.hashCode(this.useraccount);
        hash = 71 * hash + Objects.hashCode(this.Gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.PersonId != other.PersonId) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.UserRoles, other.UserRoles)) {
            return false;
        }
        if (!Objects.equals(this.Gender, other.Gender)) {
            return false;
        }
        if (!Objects.equals(this.roles, other.roles)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.community, other.community)) {
            return false;
        }
        if (!Objects.equals(this.house, other.house)) {
            return false;
        }
        if (!Objects.equals(this.doa, other.doa)) {
            return false;
        }
        return Objects.equals(this.useraccount, other.useraccount);
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", PersonId=" + PersonId + ", UserRoles=" + UserRoles + ", roles=" + roles + ", city=" + city + ", community=" + community + ", house=" + house + ", doa=" + doa + ", useraccount=" + useraccount + '}';
    }
    
}
