/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author bardw_000
 */
public class DrugCatalog {
    private ArrayList<Drug> drugList;
    
    public DrugCatalog(){
        drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
    
    public Drug addDrug(){
        Drug drug = new Drug();
        this.drugList.add(drug);
        return drug;
    }
    
    public void deleteDrug(Drug drug){
        this.drugList.remove(drug);
    }
}
