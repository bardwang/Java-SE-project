package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.DrugAdminRole;
import Business.Role.ManagerRole;
import Business.Role.HRManagerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Xun Wang
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Smart Doctor", Enterprise.EnterpriseType.HOSPITAL);
        Organization managerorganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.MANAGER);
        managerorganization.setName("Manager Organization");
        Organization doctororganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DOCTOR);
        doctororganization.setName("Doctor Group 1");
        Organization adminorganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.ADMIN);
        adminorganization.setName("Admin Organization");
        Organization hrorganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HR);
        hrorganization.setName("HR Organization");
        Organization drugadminorganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DRUGADMIN);
        drugadminorganization.setName("DrugAdmin Organization");
        UserAccount admin = adminorganization.getUserAccountDirectory().createUserAccount("admin", "admin", new AdminRole());
        admin.setName("Kate");
        admin.setAge("30");
        UserAccount manager = managerorganization.getUserAccountDirectory().createUserAccount("manager", "manager", new ManagerRole());
        manager.setName("Jason");
        manager.setAge("40");
        UserAccount hr = hrorganization.getUserAccountDirectory().createUserAccount("hr", "hr", new HRManagerRole());
        hr.setName("Terry");
        hr.setAge("32");
        UserAccount drugadmin = drugadminorganization.getUserAccountDirectory().createUserAccount("drugadmin", "drugadmin", new DrugAdminRole());
        drugadmin.setName("Ashley");
        drugadmin.setAge("27");
        
        return system;
    }
    
}
