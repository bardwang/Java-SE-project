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
import Interface.DrugAdminRole.DrugAdminSelectJPanel;
import Interface.DrugAdminRole.ManageDrugInventoryJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public class DrugAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel upc, UserAccount ua, Organization o, Enterprise e, EcoSystem system) {
        return new DrugAdminSelectJPanel(upc, system, ua);
    }
    
}
