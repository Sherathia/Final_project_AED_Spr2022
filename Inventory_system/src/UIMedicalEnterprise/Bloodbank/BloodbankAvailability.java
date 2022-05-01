/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIMedicalEnterprise.Bloodbank;

//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author saisr
 */
public class BloodbankAvailability extends javax.swing.JPanel {

    /**
     * Creates new form AllRequests
     */
    public BloodbankAvailability(JPanel RightPane) {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodGroupAvailability = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAvailableUnits = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        cmbBlood = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLOOD GROUP AVAILABILITY");

        tblBloodGroupAvailability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Blood Bank Name", "Available Blood Groups", "Available Units", "LastUpdated"
            }
        ));
        jScrollPane1.setViewportView(tblBloodGroupAvailability);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Blood Bank Name:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Available Blood Groups:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Available Units:");

        txtAvailableUnits.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cmbBlood.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+ve", "O-ve", "A+ve", "A-ve", "AB+ve", "B +ve", "B-ve" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAvailableUnits, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(cmbBlood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAvailableUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate)
                        .addComponent(btnDelete))
                    .addComponent(btnUpdate))
                .addContainerGap(175, Short.MAX_VALUE))
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String AvailableBloodGroups = cmbBlood.getItemAt(cmbBlood.getSelectedIndex());
        String AvailableUnits = txtAvailableUnits.getText();
        String BloodBankName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblBloodGroupAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_BloodGroupAvailability set AvailableBloodGroups ='" + AvailableBloodGroups + "',AvailableUnits ='" + AvailableUnits + "',Lastupdated ='" + Date + "' where BloodBankName='" + BloodBankName + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Entry Updated!!");

            String querysel = "Select * from FinalProj_BloodGroupAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                // cmbStore.addItem(rs.getString("BloodBankName"));
                String BloodBankName1 = rs.getString("BloodBankName");
                String AvailableBloodGroups1 = rs.getString("AvailableBloodGroups");
                String AvailableUnits1 = rs.getString("AvailableUnits");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = BloodBankName1;
                row[1] = AvailableBloodGroups1;
                row[2] = AvailableUnits1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String AvailableBloodGroups = cmbBlood.getItemAt(cmbBlood.getSelectedIndex());
        String AvailableUnits = txtAvailableUnits.getText();
        String BloodBankName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblBloodGroupAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Insert into `FinalProj_BloodGroupAvailability`" + "values('" + BloodBankName + "','" + AvailableBloodGroups + "','" + AvailableUnits + "','" + Date + "')";
            myStatement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record Inserted!!");

            String querysel = "Select * from FinalProj_BloodGroupAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                //cmbStore.addItem(rs.getString("StoreName"));
                //cmbStore.addItem(rs.getString("BloodBankName"));
                String BloodBankName1 = rs.getString("BloodBankName");
                String AvailableBloodGroups1 = rs.getString("AvailableBloodGroups");
                String AvailableUnits1 = rs.getString("AvailableUnits");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = BloodBankName1;
                row[1] = AvailableBloodGroups1;
                row[2] = AvailableUnits1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String AvailableBloodGroups = cmbBlood.getItemAt(cmbBlood.getSelectedIndex());
        String AvailableUnits = txtAvailableUnits.getText();
        String BloodBankName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblBloodGroupAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Delete from `FinalProj_BloodGroupAvailability` where `BloodBankName`='" + BloodBankName + "'";
            myStatement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record Deleted!!");

            String querysel = "Select * from FinalProj_BloodGroupAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            // cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                // cmbStore.addItem(rs.getString("BloodBankName"));
                String BloodBankName1 = rs.getString("BloodBankName");
                String AvailableBloodGroups1 = rs.getString("AvailableBloodGroups");
                String AvailableUnits1 = rs.getString("AvailableUnits");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = BloodBankName1;
                row[1] = AvailableBloodGroups1;
                row[2] = AvailableUnits1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBlood;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBloodGroupAvailability;
    private javax.swing.JTextField txtAvailableUnits;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
