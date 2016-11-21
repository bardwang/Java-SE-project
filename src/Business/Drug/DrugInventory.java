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
public class DrugInventory {
    private ArrayList<DrugReceived> receviedDrugList;
    
    public DrugInventory() {
        this.receviedDrugList = new ArrayList<DrugReceived>();
    }

    public ArrayList<DrugReceived> getReceviedDrugList() {
        return receviedDrugList;
    }

    public void setReceviedDrugList(ArrayList<DrugReceived> receviedDrugList) {
        this.receviedDrugList = receviedDrugList;
    }
    
    public DrugReceived addDrug(){
        DrugReceived drug = new DrugReceived();
        this.receviedDrugList.add(drug);
        return drug;
    }
    
    public void removeDrug(DrugReceived drug){
        this.receviedDrugList.remove(drug);
    }
}
