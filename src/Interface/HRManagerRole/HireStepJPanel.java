/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HRManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public class HireStepJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount useraccount;
    
    /**
     * Creates new form HireStepJPanel
     */
    public HireStepJPanel(JPanel upc, EcoSystem system, Enterprise enterprise, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = upc;
        this.system = system;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        
        // to hide the back button
        this.backBtn.setVisible(false);        
        populateOrganizationComboBox();
    }

    private void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof DoctorOrganization){
            organizationComboBox.addItem(organization);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Which organization do you want to place this doctor?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Questions");

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(backBtn)
                        .addGap(233, 233, 233)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(submitBtn))
                .addContainerGap(327, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTable() {
        int index = userProcessContainer.getComponentCount() - 1;
        HRManagerWorkAreaJPanel panel = (HRManagerWorkAreaJPanel) userProcessContainer.getComponent(index);
        panel.populateTable(system);
    }
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) this.organizationComboBox.getSelectedItem();
        if(organization == null){
        JOptionPane.showMessageDialog(null, "There is no organization!");
        return;
        }
        organization.getUserAccountDirectory().getUserAccountList().add(useraccount);
        JOptionPane.showMessageDialog(null, "You have hired a doctor!");
        backBtnActionPerformed(evt);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);

        refreshTable();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
