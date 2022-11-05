/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Dell
 */

public class UserAccount {
    
    private String username;
    private String password;
    private String role;

    public UserAccount() {
        
    }
        
    public UserAccount(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.username);
        hash = 59 * hash + Objects.hashCode(this.password);
        hash = 59 * hash + Objects.hashCode(this.role);
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
        final UserAccount other = (UserAccount) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return this.role == other.role;
    }
    
    
       
}

//public class UserAccount {
//    private String username;
//    private String password;
//    private Roles.RoleType role;
//
//    public UserAccount(String username, String password, Roles.RoleType role) {
//        this.username = username;
//        this.password = password;
//        this.role = role;
//    }
//
//    UserAccount() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Roles.RoleType getRole() {
//        return role;
//    }
//
//    public void setRole(Roles.RoleType role) {
//        this.role = role;
//    }
//    
//    @Override
//
//
//    public int hashCode() {
//        int hash = 7;
//        hash = 71 * hash + Objects.hashCode(this.username);
//        hash = 71 * hash + Objects.hashCode(this.password);
//        hash = 71 * hash + Objects.hashCode(this.role);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final UserAccount other = (UserAccount) obj;
//        if (!Objects.equals(this.username, other.username)) {
//            return false;
//        }
//        if (!Objects.equals(this.password, other.password)) {
//            return false;
//        }
//        return this.role == other.role;
//    }
//    
//    
//}
