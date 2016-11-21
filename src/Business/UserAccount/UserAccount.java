/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Role;

/**
 *
 * @author Xun Wang
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String name;
    private String age;
    private Role role;
    private Network network;
    private Enterprise enterprise;
    private DoctorAccount doctoraccount;
    private PatientAccount patientaccount;

    public UserAccount() {
    }   
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }  

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }  
    
    public DoctorAccount getDoctoraccount() {
        return doctoraccount;
    }

    public void setDoctoraccount(DoctorAccount doctoraccount) {
        this.doctoraccount = doctoraccount;
    }  

    public PatientAccount getPatientaccount() {
        return patientaccount;
    }

    public void setPatientaccount(PatientAccount patientaccount) {
        this.patientaccount = patientaccount;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}