/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Role.DismissedRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bardw_000
 */
public class ReviewDoctorsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    
    /**
     * Creates new form SelectDoctorJPanel
     */
    public ReviewDoctorsJPanel(JPanel upc, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.system = system;
        this.enterprise = enterprise;
        
        populateOrganizationComboBox();
        
    }
    
    private void populateOrganizationComboBox(){
        this.OrganizationComboBox.removeAllItems();
        
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof DoctorOrganization){
                this.OrganizationComboBox.addItem(organization);
            }
        }
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        model.setRowCount(0);
        
        Organization organization = (Organization) this.OrganizationComboBox.getSelectedItem();
        
        if(organization != null){
        for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()){
            System.out.print(useraccount.getRole());
            if(useraccount.getRole().toString().equals("Business.Role.DismissedRole")){
                continue;
            }
            Object[] row = new Object[4];
            row[0] = useraccount;
            row[1] = useraccount.getDoctoraccount().getConcentration();
            row[2] = useraccount.getDoctoraccount().getVisit();
            if(useraccount.getDoctoraccount().getCurrentStar() == 0){
                row[3] = "Not Available";
            }else{
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(1);
                row[3] = df.format(useraccount.getDoctoraccount().getCurrentStar());
            }
            model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        OrganizationComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        dismissBtn = new javax.swing.JButton();
        detailBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select A Doctor");

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Concentration", "Total Visits", "Star"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        OrganizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OrganizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Which group do you prefer?");

        dismissBtn.setText("Dismiss");
        dismissBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissBtnActionPerformed(evt);
            }
        });

        detailBtn.setText("View Detail");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(OrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(detailBtn)
                                .addGap(18, 18, 18)
                                .addComponent(dismissBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dismissBtn)
                    .addComponent(detailBtn))
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrganizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
        this.organization = (Organization) this.OrganizationComboBox.getSelectedItem();
    }//GEN-LAST:event_OrganizationComboBoxActionPerformed

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = this.JTable.getSelectedRow();
        if(selectRow >= 0){
            UserAccount useraccount = (UserAccount) this.JTable.getValueAt(selectRow, 0);
            ViewDoctorDetailJPanel viewDoctorDetailJPanel = new ViewDoctorDetailJPanel(userProcessContainer, system, useraccount);      
            userProcessContainer.add("ViewDoctorDetailJPanel", viewDoctorDetailJPanel);      
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_detailBtnActionPerformed

    private void dismissBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = this.JTable.getSelectedRow();
        if(selectRow >= 0){
            int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;                 
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to dismiss this doctor?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            UserAccount useraccount = (UserAccount) this.JTable.getValueAt(selectRow, 0); 
            useraccount.setRole(new DismissedRole());
            populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_dismissBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JComboBox OrganizationComboBox;
    private javax.swing.JButton detailBtn;
    private javax.swing.JButton dismissBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
