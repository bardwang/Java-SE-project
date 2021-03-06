/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DrugAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public class DrugAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount useraccount;
    
    /**
     * Creates new form DrugAdminWorkAreaJPanel
     */
    public DrugAdminWorkAreaJPanel(JPanel upc, EcoSystem system, Enterprise enterprise, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = upc;
        this.system = system;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
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
        addDrugBtn = new javax.swing.JButton();
        drugInventoryBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Drug Admin Work Area");

        addDrugBtn.setText("Add A Drug");
        addDrugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugBtnActionPerformed(evt);
            }
        });

        drugInventoryBtn.setText("Manage Drug Inventory");
        drugInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugInventoryBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drugInventoryBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(addDrugBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(addDrugBtn)
                .addGap(65, 65, 65)
                .addComponent(drugInventoryBtn)
                .addGap(80, 80, 80)
                .addComponent(jButton1)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDrugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugBtnActionPerformed
        // TODO add your handling code here:
        AddADrugJPanel addADrugJPanel = new AddADrugJPanel(userProcessContainer, system, enterprise);      
        userProcessContainer.add("AddADrugJPanel", addADrugJPanel);      
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_addDrugBtnActionPerformed

    private void drugInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugInventoryBtnActionPerformed
        // TODO add your handling code here:
        HospitalEnterprise hospitalenterprise = (HospitalEnterprise) this.enterprise;
        ManageDrugInventoryJPanel manageDrugInventoryJPanel= new ManageDrugInventoryJPanel(userProcessContainer, hospitalenterprise.getDrugcatalog(), hospitalenterprise.getDruginventory());      
        userProcessContainer.add("ManageDrugInventoryJPanel", manageDrugInventoryJPanel);      
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_drugInventoryBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugBtn;
    private javax.swing.JButton drugInventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
