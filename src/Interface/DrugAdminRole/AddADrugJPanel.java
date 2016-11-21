/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DrugAdminRole;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bardw_000
 */
public class AddADrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManageDrugCatalogJPanel
     */
    public AddADrugJPanel(JPanel upc, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.system = system;
        this.enterprise = enterprise;
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
        drugNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pharmaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        capletsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        originTextField = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextField = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add a Drug to the Drug Catalog");

        jLabel2.setText("Drug Name");

        jLabel3.setText("Pharma");

        jLabel4.setText("Price");

        jLabel5.setText("Caplets");

        jLabel6.setText("Weight(ounce)");

        jLabel7.setText("Origin");

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Description");

        descriptionTextField.setColumns(20);
        descriptionTextField.setRows(5);
        jScrollPane1.setViewportView(descriptionTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(originTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(capletsTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(priceTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pharmaTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(drugNameTextField, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(AddBtn)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drugNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pharmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(capletsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(originTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddBtn)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if(drugNameTextField.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Missing drugNameTextField!");
        return;
        }
        if(pharmaTextField.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Missing pharmaTextField!");
        return;
        }
        if(!priceTextField.getText().matches("^\\d+$")){
        JOptionPane.showMessageDialog(null, "Please type a integer for priceTextField!");
        return;
        }
        if(!capletsTextField.getText().matches("^\\d+$")){
        JOptionPane.showMessageDialog(null, "Please type a integer for capletsTextField!");
        return;
        }
        if(originTextField.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Missing originTextField!");
        return;
        }
        if(!weightTextField.getText().matches("^\\d+$")){
        JOptionPane.showMessageDialog(null, "Please type a integer for weightTextField!");
        return;
        }
        if(descriptionTextField.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Missing descriptionTxt!");
        return;
        }
        
        HospitalEnterprise he = (HospitalEnterprise) this.enterprise;
        Drug drug = he.getDrugcatalog().addDrug();
        drug.setName(this.drugNameTextField.getText());
        drug.setPharma(this.pharmaTextField.getText());
        drug.setPrice(Integer.parseInt(priceTextField.getText()));
        drug.setCaplets(Integer.parseInt(capletsTextField.getText()));
        drug.setOrigin(this.originTextField.getText());
        drug.setWeight(Integer.parseInt(weightTextField.getText()));
        drug.setDescription(this.descriptionTextField.getText());
        
        JOptionPane.showMessageDialog(null, "You have created the drug successfully!");
        resetFields();
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void resetFields(){
        this.drugNameTextField.setText("");
        this.pharmaTextField.setText("");
        this.priceTextField.setText("");
        this.capletsTextField.setText("");
        this.originTextField.setText("");
        this.weightTextField.setText("");
        this.descriptionTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField capletsTextField;
    private javax.swing.JTextArea descriptionTextField;
    private javax.swing.JTextField drugNameTextField;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField originTextField;
    private javax.swing.JTextField pharmaTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}