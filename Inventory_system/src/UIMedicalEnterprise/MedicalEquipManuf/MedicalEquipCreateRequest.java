/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIMedicalEnterprise.MedicalEquipManuf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author anvithalakshmisha
 */
public class MedicalEquipCreateRequest extends javax.swing.JPanel {

    /**
     * Creates new form MedicalEquipCreateRequest
     */
    JPanel RightPanel;
    String selectedOrg;
    static Logger log = Logger.getLogger(MedicalEquipCreateRequest.class.getName());

    public MedicalEquipCreateRequest(JPanel RightPanel) {
        initComponents();
        this.RightPanel = RightPanel;
        txtRequest1.setVisible(false);
        txtRequest2.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxNetwork = new javax.swing.JComboBox<>();
        comboBoxEnterprise = new javax.swing.JComboBox<>();
        comboBoxOrg = new javax.swing.JComboBox<>();
        lblRequest1 = new javax.swing.JLabel();
        txtRequest1 = new javax.swing.JTextField();
        lblRequest2 = new javax.swing.JLabel();
        txtRequest2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblApprovedorRejected = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Network:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Organization:");

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

        lblRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblApprovedorRejected.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lblApprovedorRejected.setForeground(new java.awt.Color(102, 153, 255));
        lblApprovedorRejected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApprovedorRejected.setText("CREATE REQUEST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblRequest1)
                            .addComponent(lblRequest2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 554, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblApprovedorRejected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxEnterprise, comboBoxNetwork, comboBoxOrg, jButton1, txtRequest1, txtRequest2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, lblRequest1, lblRequest2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblApprovedorRejected, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequest1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequest2)
                    .addComponent(txtRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
//        String selectedOrg = null;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StringBuilder Error = new StringBuilder();
        if (!txtRequest1.getText().isEmpty() && !txtRequest1.getText().isEmpty()) {
        } else {
            Error.append("All fields are mandatory \n");
        }
        if (!Error.isEmpty()) {
            JOptionPane.showMessageDialog(this, Error);
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = null;
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
            Random rand = new Random();
            if (selectedOrg == "Hospitals") {
                query = "Insert into `FinalProj_HospitalRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Vaccine manufacturer") {
                query = "Insert into `FinalProj_VaccineManufacturerRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Blood bank") {
                query = "Insert into `FinalProj_BloodbankRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Medical equipment") {
                query = "Insert into `FinalProj_MedicalEquipmentRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Insurance") {
                query = "Insert into `FinalProj_InsuranceRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Food market chains") {
                query = "Insert into `FinalProj_FoodmarketRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Clothing retailers") {
                query = "Insert into `FinalProj_ClothingRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Transport/Travel agencies") {
                query = "Insert into `FinalProj_TransportRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Medical equipment" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
//            String query = "Insert into `FinalProj_Users`" + "values('" + Name + "','" + UserName + "','" + Password + "','" + EmailId + "','" + Country + "','" + Enterprise + "','" + Organization + "','" + Contact + "')";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request created");
            log.info("Request created");
            txtRequest1.setText("");
            txtRequest2.setText("");
            Business.SendMail mail = new Business.SendMail();
//           TODO - change the email ID
            mail.sendMail("Request created", "Your request has been created, you will get an update on the request when its status changes", "anvithabl@gmail.com");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
            log.error("Error while fetching data from DB");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxEnterprise;
    private javax.swing.JComboBox<String> comboBoxNetwork;
    private javax.swing.JComboBox<String> comboBoxOrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApprovedorRejected;
    private javax.swing.JLabel lblRequest1;
    private javax.swing.JLabel lblRequest2;
    private javax.swing.JTextField txtRequest1;
    private javax.swing.JTextField txtRequest2;
    // End of variables declaration//GEN-END:variables
}
