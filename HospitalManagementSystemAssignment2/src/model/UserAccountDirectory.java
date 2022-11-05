/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.ListIterator;


/**
 *
 * @author Dell
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
//    public UserAccount createUserAccount(String username, String password,Roles.RoleType  role){
    public UserAccount createUserAccount(String username, String password,String roles){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        
        userAccount.setRole(roles);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public void deleteUserAccount(UserAccount userAccount){
        
        ListIterator<UserAccount> var = userAccountList.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(userAccount)){
              var.remove();
            }
        }

    }
    public UserAccount getUserAccount(UserAccount userAccount) {
                
        UserAccount userAccountLocal = null;
        
        for(UserAccount emp : userAccountList){
            if(emp.equals(userAccount))
                userAccountLocal =  emp;
        }
      return userAccountLocal;
    } 
}