package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bardw_000
 */
public class HiredDoctorRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel upc, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DoctorWorkAreaJPanel(upc, system, account, enterprise);
    }
    
}
