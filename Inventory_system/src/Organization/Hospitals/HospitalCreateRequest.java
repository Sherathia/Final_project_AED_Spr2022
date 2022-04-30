/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Organization.Hospitals;

import javax.swing.JPanel;

/**
 *
 * @author aesha
 */
public class HospitalCreateRequest extends javax.swing.JPanel {

    /**
     * Creates new form hospitalCreateRequest
     */
    private JPanel rightPanel;

    public HospitalCreateRequest(JPanel RightPanel) {
        this.rightPanel = RightPanel;
        initComponents();
        comboBoxNetwork.removeAllItems();
        comboBoxEnterprise.removeAllItems();
        comboBoxOrg.removeAllItems();
        comboBoxNetwork.addItem("Select");
        comboBoxNetwork.addItem("India");
        comboBoxNetwork.addItem("US");
        comboBoxNetwork.addItem("Canada");
        comboBoxEnterprise.addItem("Select");
        comboBoxEnterprise.addItem("Medical enterprise");
        comboBoxEnterprise.addItem("Warehouse enterprise");
        comboBoxOrg.addItem("Select");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxNetwork = new javax.swing.JComboBox<>();
        comboBoxEnterprise = new javax.swing.JComboBox<>();
        comboBoxOrg = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblRequest1 = new javax.swing.JLabel();
        txtRequest1 = new javax.swing.JTextField();
        txtRequest2 = new javax.swing.JTextField();
        lblRequest2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Network:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise:");

        comboBoxNetwork.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBoxEnterprise.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseActionPerformed(evt);
            }
        });

        comboBoxOrg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrgActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Organization:");

        lblRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButton1.setText("Create");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblRequest1)
                                    .addComponent(lblRequest2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, lblRequest1, lblRequest2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxEnterprise, comboBoxNetwork, comboBoxOrg, txtRequest1, txtRequest2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequest1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequest2)
                    .addComponent(txtRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseActionPerformed
        // TODO add your handling code here:
        if (comboBoxEnterprise.getSelectedItem() == "Medical enterprise") {
            comboBoxOrg.removeAllItems();
            comboBoxOrg.addItem("Select");
            comboBoxOrg.addItem("Hospitals");
            comboBoxOrg.addItem("Vaccine manufacturer");
            comboBoxOrg.addItem("Blood bank");
            comboBoxOrg.addItem("Medical equipment");
            comboBoxOrg.addItem("Insurance");
        } else if (comboBoxEnterprise.getSelectedItem() == "Warehouse enterprise") {
            comboBoxOrg.removeAllItems();
            comboBoxOrg.addItem("Select");
            comboBoxOrg.addItem("Food market chains");
            comboBoxOrg.addItem("Clothing retailers");
            comboBoxOrg.addItem("Transport/Travel agencies");
        }
    }//GEN-LAST:event_comboBoxEnterpriseActionPerformed

    private void comboBoxOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrgActionPerformed
        // TODO add your handling code here:
        String selectedOrg = null;
        if (comboBoxNetwork.getSelectedIndex() != 0 && comboBoxEnterprise.getSelectedIndex() != 0 && comboBoxOrg.getSelectedIndex() != 0) {
            if (comboBoxOrg.getSelectedItem() == "Hospitals") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Vaccine manufacturer") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Blood bank") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Medical equipment") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Insurance") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Food market chains") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Clothing retailers") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            } else if (comboBoxOrg.getSelectedItem() == "Transport/Travel agencies") {
                selectedOrg = comboBoxOrg.getSelectedItem().toString();
            }
            if (selectedOrg == "Hospitals") {
                lblRequest1.setText("Enter the number of beds required: ");
                lblRequest2.setText("Enter the location: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Vaccine manufacturer") {
                lblRequest1.setText("Enter the vaccine required: ");
                lblRequest2.setText("Enter the number of vaccine required: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Blood bank") {
                lblRequest1.setText("Enter the blood group required: ");
                lblRequest2.setText("Enter the count: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Medical equipment") {
                lblRequest1.setText("Enter the medical equipment required: ");
                lblRequest2.setText("Enter the count: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Insurance") {
                lblRequest1.setText("Enter the insurance coverage required: ");
                lblRequest2.setText("Enter the number of such coverage(s) required: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Food market chains") {
                lblRequest1.setText("Enter the number of people to be served: ");
                lblRequest2.setText("Enter the location: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Clothing retailers") {
                lblRequest1.setText("Enter the number of people to be served: ");
                lblRequest2.setText("Enter the location: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }
            if (selectedOrg == "Transport/Travel agencies") {
                lblRequest1.setText("Enter the type of vehicle required: ");
                lblRequest2.setText("Enter the count: ");
                txtRequest1.setVisible(true);
                txtRequest2.setVisible(true);
            }

        }
    }//GEN-LAST:event_comboBoxOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxEnterprise;
    private javax.swing.JComboBox<String> comboBoxNetwork;
    private javax.swing.JComboBox<String> comboBoxOrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRequest1;
    private javax.swing.JLabel lblRequest2;
    private javax.swing.JTextField txtRequest1;
    private javax.swing.JTextField txtRequest2;
    // End of variables declaration//GEN-END:variables
}
