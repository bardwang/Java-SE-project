/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author bardw_000
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private int orgId;
    private static int counter;
    
    public enum Type {
        ADMIN("Admin Organization"),
        DRUGADMIN("DrugAdmin Organization"),
        DOCTOR("Doctor Organization"),
        HR("HR Organization"),
        MANAGER("Manager Organization");
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue() {
        return value;
        }
    }
    
    public Organization(String name){
        this.name = name;
        orgId = ++counter;
        userAccountDirectory = new UserAccountDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString(){
        return name;
    }
}
