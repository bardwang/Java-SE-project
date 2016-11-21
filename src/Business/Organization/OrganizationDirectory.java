/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author bardw_000
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.ADMIN.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DOCTOR.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HR.getValue())){
            organization = new HROrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DRUGADMIN.getValue())){
            organization = new DrugAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.MANAGER.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
}
