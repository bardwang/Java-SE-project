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
import Interface.DoctorRole.RejectDoctorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public class RejectedDoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel upc, UserAccount ua, Organization o, Enterprise e, EcoSystem system) {
        return new RejectDoctorJPanel();
    }
    
}
