/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Drug.DrugReceived;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author bardw_000
 */
public class DoctorAccount {
    
    private String phonenumber;
    private String concentration;
    private String university;
    private String degree;
    private String yearsofexperience;
    private String background;
    private Boolean hired;
    private Boolean rejected;
    private int count = 0;
    private float totalstar = 0;
    private Hashtable<UserAccount, String> statusHashtable;
    private Hashtable<UserAccount, ArrayList<String>> messageHashtable;
    private Hashtable<UserAccount, ArrayList<DrugReceived>> drugHashtable;
    private Hashtable<UserAccount, String> conclusionHashtable;
    
    public DoctorAccount(){
        this.hired = false;
        this.rejected = false;
        this.statusHashtable = new Hashtable<UserAccount, String>();
        this.messageHashtable = new Hashtable<UserAccount, ArrayList<String>>();
        this.drugHashtable = new Hashtable<UserAccount, ArrayList<DrugReceived>>();
        this.conclusionHashtable = new Hashtable<UserAccount, String>();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYearsofexperience() {
        return yearsofexperience;
    }

    public void setYearsofexperience(String yearsofexperience) {
        this.yearsofexperience = yearsofexperience;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
    
    public Boolean getHired() {
        return hired;
    }

    public void setHired(Boolean hired) {
        this.hired = hired;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }  
    
    public Hashtable<UserAccount, ArrayList<String>> getHashtable() {
        return messageHashtable;
    }

    public void setHashtable(Hashtable<UserAccount, ArrayList<String>> hashtable) {
        this.messageHashtable = hashtable;
    }

    public Hashtable<UserAccount, String> getStatusHashtable() {
        return statusHashtable;
    }

    public void setStatusHashtable(Hashtable<UserAccount, String> statusHashtable) {
        this.statusHashtable = statusHashtable;
    }
    
    public Hashtable<UserAccount, ArrayList<String>> getMessageHashtable() {
        return messageHashtable;
    }

    public void setMessageHashtable(Hashtable<UserAccount, ArrayList<String>> messageHashtable) {
        this.messageHashtable = messageHashtable;
    }

    public Hashtable<UserAccount, ArrayList<DrugReceived>> getDrugHashtable() {
        return drugHashtable;
    }

    public void setDrugHashtable(Hashtable<UserAccount, ArrayList<DrugReceived>> drugHashtable) {
        this.drugHashtable = drugHashtable;
    }

    public Hashtable<UserAccount, String> getConclusionHashtable() {
        return conclusionHashtable;
    }

    public void setConclusionHashtable(Hashtable<UserAccount, String> conclusionHashtable) {
        this.conclusionHashtable = conclusionHashtable;
    }

    public void increment() {
        count++;
    }
    
    public int getVisit() {
        return count;
    }
    
    public void addStar(int starNum){
        totalstar = totalstar + starNum;
    }
    
    public float getCurrentStar(){
        if(count == 0){
            return 0;
        }else{
        return totalstar/count;
        }
    }

}
