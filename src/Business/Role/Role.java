/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public abstract class Role {
    
    public enum RoleType{
        ADMIN("Admin"),
        DRUGADMIN("DrugAdmin"),
        PATIENT("Patient"),
        DOCTOR("Doctor"),
        HR("HR Manager"),
        MANAGER("Manager");
        
        private String value;
        private RoleType(String value) {
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel upc, UserAccount ua, Organization o, Enterprise e, EcoSystem system);
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
