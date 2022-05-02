/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Organization.VaccineManufacturers;

//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.sql.*;
import org.apache.log4j.Logger;

/**
 *
 * @author saisr
 */
public class VaccineManufAvailability extends javax.swing.JPanel {

    /**
     * Creates new form VaccineManufRequests
     */
    static Logger log = Logger.getLogger(VaccineManufAvailability.class.getName());
    public VaccineManufAvailability(JPanel RightPane) {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tblVaccineAvailability.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String querysel = "Select * from FinalProj_VaccineManufAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                // cmbStore.addItem(rs.getString("VaccineManufacturerName"));
                String VaccineManufacturerName1 = rs.getString("VaccineManufacturerName");
                String AvailableVaccines1 = rs.getString("AvailableVaccines");
                String AvailableQuantity1 = rs.getString("AvailableQuantity");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = VaccineManufacturerName1;
                row[1] = AvailableVaccines1;
                row[2] = AvailableQuantity1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineAvailability = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAvailableQuantity = new javax.swing.JTextField();
        txtAvailableVaccines = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(237, 243, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VACCINES AVAILABILITY");

        tblVaccineAvailability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine Manufacturer Name", "Available Vaccines", "Available Quantity", "LastUpdated"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineAvailability);

        jLabel3.setText("Vaccine Manufacturer Name:");

        jLabel4.setText("Available Vaccines:");

        jLabel5.setText("Available Quantity:");

        btnUpdate.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(102, 153, 255));
        btnCreate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 153, 255));
        btnDelete.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAvailableVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAvailableVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().isBlank() || txtAvailableQuantity.getText().isBlank() || txtAvailableVaccines.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Please enter value .");
            return;
        }
        else
        {
        String AvailableVaccines = txtAvailableVaccines.getText();
        String AvailableQuantity = txtAvailableQuantity.getText();
        String VaccineManufacturerName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblVaccineAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_VaccineManufAvailability set AvailableVaccines ='" + AvailableVaccines + "',AvailableQuantity ='" + AvailableQuantity + "',Lastupdated ='" + Date + "' where VaccineManufacturerName='" + VaccineManufacturerName + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Entry Updated!!");

            String querysel = "Select * from FinalProj_VaccineManufAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                // cmbStore.addItem(rs.getString("VaccineManufacturerName"));
                String VaccineManufacturerName1 = rs.getString("VaccineManufacturerName");
                String AvailableVaccines1 = rs.getString("AvailableVaccines");
                String AvailableQuantity1 = rs.getString("AvailableQuantity");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = VaccineManufacturerName1;
                row[1] = AvailableVaccines1;
                row[2] = AvailableQuantity1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         if(txtName.getText().isBlank() || txtAvailableQuantity.getText().isBlank() || txtAvailableVaccines.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Please enter value .");
            return;
        }
        else
        {
        String AvailableVaccines = txtAvailableVaccines.getText();
        String AvailableQuantity = txtAvailableQuantity.getText();
        String VaccineManufacturerName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblVaccineAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Insert into `FinalProj_VaccineManufAvailability`" + "values('" + VaccineManufacturerName + "','" + AvailableVaccines + "','" + AvailableQuantity + "','" + Date + "')";
            myStatement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record Inserted!!");

            String querysel = "Select * from FinalProj_VaccineManufAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                //cmbStore.addItem(rs.getString("StoreName"));
                // cmbStore.addItem(rs.getString("VaccineManufacturerName"));
                String VaccineManufacturerName1 = rs.getString("VaccineManufacturerName");
                String AvailableVaccines1 = rs.getString("AvailableVaccines");
                String AvailableQuantity1 = rs.getString("AvailableQuantity");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = VaccineManufacturerName1;
                row[1] = AvailableVaccines1;
                row[2] = AvailableQuantity1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         if(txtName.getText().isBlank() || txtAvailableQuantity.getText().isBlank() || txtAvailableVaccines.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Please enter value .");
            return;
        }
        else
        {
        String AvailableVaccines = txtAvailableVaccines.getText();
        String AvailableQuantity = txtAvailableQuantity.getText();
        String VaccineManufacturerName = txtName.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) tblVaccineAvailability.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Delete from `FinalProj_VaccineManufAvailability` where `VaccineManufacturerName`='" + VaccineManufacturerName + "'";
            myStatement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record Deleted!!");

            String querysel = "Select * from FinalProj_VaccineManufAvailability";
            ResultSet rs = myStatement.executeQuery(querysel);
            //cmbStore.removeAllItems();
            model.setRowCount(0);
            while (rs.next()) {
                //cmbStore.addItem(rs.getString("VaccineManufacturerName"));
                String VaccineManufacturerName1 = rs.getString("VaccineManufacturerName");
                String AvailableVaccines1 = rs.getString("AvailableVaccines");
                String AvailableQuantity1 = rs.getString("AvailableQuantity");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[4];
                row[0] = VaccineManufacturerName1;
                row[1] = AvailableVaccines1;
                row[2] = AvailableQuantity1;
                row[3] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVaccineAvailability;
    private javax.swing.JTextField txtAvailableQuantity;
    private javax.swing.JTextField txtAvailableVaccines;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
