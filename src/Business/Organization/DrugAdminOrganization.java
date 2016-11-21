/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DrugAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bardw_000
 */
public class DrugAdminOrganization extends Organization{
    
    public DrugAdminOrganization() {
        super(Type.DRUGADMIN.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DrugAdminRole());
        return roles;
    }
}
