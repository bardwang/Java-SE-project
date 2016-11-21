/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.AdministrativeRole.SelectRoleJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Xun Wang
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new SelectRoleJPanel(userProcessContainer, ecosystem);
    }
  
}
