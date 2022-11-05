/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */

public class Roles {
    
     public String Admin = "Admin";
     public String Doctor = "Doctor";
     public String Patient = "Patient";
     public String Community = "Community";
     public String Hospital = "Hospital";
     
    public String roleType;

    public Roles() {
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

}

//public class Roles {
//    
//    public enum RoleType{
//        Admin("Admin"),
//        Doctor("Doctor"),
//        Patient("Patient"),
//        Community("Community"),
//        Hospital("Hospital");
//       
//        private String  value;
//        
//        
//        private RoleType(String value){
//            this.value=value;
//        
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        public void setValue(String value) {
//            this.value = value;
//        }
//     @Override
//     public String toString(){
//         return value;
//     }
//     }
//    public RoleType type;
//       @Override
//      public String toString(){
//          return(type!=null)? this.type.getValue():this.getClass().getName();
//      }
//}
