/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Organization.ClothingRetailerScreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author aesha
 */
public class ClothingRetailCreateRequest extends javax.swing.JPanel {

    /**
     * Creates new form ClothingretailCreateRequest
     */
    static Logger log = Logger.getLogger(ClothingRetailCreateRequest.class.getName());
    private JPanel RightPanel;
    String selectedOrg;

    public ClothingRetailCreateRequest(JPanel RightPanel) {
        initComponents();
        this.RightPanel = RightPanel;
        txtRequest1.setVisible(false);
        txtRequest2.setVisible(false);
        comboBoxNetwork.removeAllItems();
        comboBoxEnterprise.removeAllItems();
        comboBoxOrganization.removeAllItems();
        comboBoxNetwork.addItem("Select");
        comboBoxNetwork.addItem("India");
        comboBoxNetwork.addItem("US");
        comboBoxNetwork.addItem("Canada");
        comboBoxEnterprise.addItem("Select");
        comboBoxEnterprise.addItem("Medical enterprise");
        comboBoxEnterprise.addItem("Warehouse enterprise");
        comboBoxOrganization.addItem("Select");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxNetwork = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBoxEnterprise = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboBoxOrganization = new javax.swing.JComboBox<>();
        lblRequest1 = new javax.swing.JLabel();
        txtRequest1 = new javax.swing.JTextField();
        txtRequest2 = new javax.swing.JTextField();
        lblRequest2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(237, 243, 254));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE REQUEST");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Network:");

        comboBoxNetwork.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise:");

        comboBoxEnterprise.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Organization:");

        comboBoxOrganization.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxOrganization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrganizationActionPerformed(evt);
            }
        });

        lblRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblRequest2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(188, 210, 254));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("CREATE");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 153, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crerrequest.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblRequest1)
                            .addComponent(lblRequest2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtRequest2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(46, 46, 46))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, lblRequest1, lblRequest2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, txtRequest2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxOrganization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequest1)
                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequest2)
                    .addComponent(txtRequest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNetworkActionPerformed

    private void comboBoxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrganizationActionPerformed
        // TODO add your handling code here:
//        String selectedOrg = null;
        if (comboBoxNetwork.getSelectedIndex() != 0 && comboBoxEnterprise.getSelectedIndex() != 0 && comboBoxOrganization.getSelectedIndex() != 0) {
            if (comboBoxOrganization.getSelectedItem() == "Hospitals") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Vaccine manufacturer") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Blood bank") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Medical equipment") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Insurance") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Food market chains") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Clothing retailers") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
            } else if (comboBoxOrganization.getSelectedItem() == "Transport/Travel agencies") {
                selectedOrg = comboBoxOrganization.getSelectedItem().toString();
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
    }//GEN-LAST:event_comboBoxOrganizationActionPerformed

    private void comboBoxEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseActionPerformed
        // TODO add your handling code here:
        if (comboBoxEnterprise.getSelectedItem() == "Medical enterprise") {
            comboBoxOrganization.removeAllItems();
            comboBoxOrganization.addItem("Select");
            comboBoxOrganization.addItem("Hospitals");
            comboBoxOrganization.addItem("Vaccine manufacturer");
            comboBoxOrganization.addItem("Blood bank");
            comboBoxOrganization.addItem("Medical equipment");
            comboBoxOrganization.addItem("Insurance");
        } else if (comboBoxEnterprise.getSelectedItem() == "Warehouse enterprise") {
            comboBoxOrganization.removeAllItems();
            comboBoxOrganization.addItem("Select");
            comboBoxOrganization.addItem("Food market chains");
            comboBoxOrganization.addItem("Clothing retailers");
            comboBoxOrganization.addItem("Transport/Travel agencies");
        }
    }//GEN-LAST:event_comboBoxEnterpriseActionPerformed

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
                query = "Insert into `FinalProj_HospitalRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Vaccine manufacturer") {
                query = "Insert into `FinalProj_VaccineManufacturerRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Blood bank") {
                query = "Insert into `FinalProj_BloodbankRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Medical equipment") {
                query = "Insert into `FinalProj_MedicalEquipmentRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Insurance") {
                query = "Insert into `FinalProj_InsuranceRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Food market chains") {
                query = "Insert into `FinalProj_FoodmarketRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Clothing retailers") {
                query = "Insert into `FinalProj_ClothingRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest1.getText() + "','" + txtRequest2.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            if (selectedOrg == "Transport/Travel agencies") {
                query = "Insert into `FinalProj_TransportRequests`" + "values('" + rand.nextInt(1000) + "','" + txtRequest2.getText() + "','" + txtRequest1.getText() + "','" + "Clothing retail" + "','" + Date + "','" + null + "','" + null + "','" + null + "','" + null + "','" + null + "')";
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
//            String query = "Insert into `FinalProj_Users`" + "values('" + Name + "','" + UserName + "','" + Password + "','" + EmailId + "','" + Country + "','" + Enterprise + "','" + Organization + "','" + Contact + "')";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request created");
            txtRequest1.setText("");
            txtRequest2.setText("");
            Business.SendMail mail = new Business.SendMail();
//           TODO - change the email ID
            mail.sendMail("Request created", "Your request has been created, you will get an update on the request when its status changes", "anvithabl@gmail.com");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxEnterprise;
    private javax.swing.JComboBox<String> comboBoxNetwork;
    private javax.swing.JComboBox<String> comboBoxOrganization;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRequest1;
    private javax.swing.JLabel lblRequest2;
    private javax.swing.JTextField txtRequest1;
    private javax.swing.JTextField txtRequest2;
    // End of variables declaration//GEN-END:variables
}
