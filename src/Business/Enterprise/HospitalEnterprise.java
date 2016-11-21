/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugCatalog;
import Business.Drug.DrugInventory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Xun Wang
 */
public class HospitalEnterprise extends Enterprise{
    
    private DrugCatalog drugcatalog;
    private DrugInventory druginventory;

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HOSPITAL);
        this.drugcatalog = new DrugCatalog();
        this.druginventory = new DrugInventory();
    }

    public DrugCatalog getDrugcatalog() {
        return drugcatalog;
    }

    public void setDrugcatalog(DrugCatalog drugcatalog) {
        this.drugcatalog = drugcatalog;
    }

    public DrugInventory getDruginventory() {
        return druginventory;
    }

    public void setDruginventory(DrugInventory druginventory) {
        this.druginventory = druginventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
