/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Screens;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aesha
 */
public class TasksRequest extends javax.swing.JPanel {

    /**
     * Creates new form TasksRequest
     */
    private JPanel RightPanel;

    public TasksRequest(JPanel RightPanel) {
        initComponents();
        this.RightPanel = RightPanel;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRequest = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRequestID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        btnviewpendingreq = new javax.swing.JButton();
        btnviewrequests = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        cmbEnterprise = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbOrganisation = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("MANAGE REQUEST");

        tblManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request No.", "Network", "Enterprise", "Organization", "Requester", "Request Desc", "Quantity", "Status", "Created Date", "Comments"
            }
        ));
        tblManageRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblManageRequest.setShowGrid(false);
        jScrollPane1.setViewportView(tblManageRequest);

        btnApprove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Request ID:");

        txtRequestID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Comments:");

        txtComments.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnviewpendingreq.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnviewpendingreq.setText("View Pending Requests");
        btnviewpendingreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewpendingreqActionPerformed(evt);
            }
        });

        btnviewrequests.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnviewrequests.setText("View All Requests");
        btnviewrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewrequestsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Network:");

        cmbNetwork.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US", "INDIA", "CANADA" }));

        cmbEnterprise.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical", "Voluntary", "Government", "Warehouse" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Enterprise:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Organization:");

        cmbOrganisation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnviewpendingreq)
                            .addGap(33, 33, 33)
                            .addComponent(btnviewrequests))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbNetwork, 0, 250, Short.MAX_VALUE)
                            .addComponent(cmbEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbOrganisation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewpendingreq)
                    .addComponent(btnviewrequests))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReject)))
                    .addComponent(btnApprove))
                .addGap(156, 156, 156))
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

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String org = cmbOrganisation.getItemAt(cmbOrganisation.getSelectedIndex());
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());

        if(org.equalsIgnoreCase("Hospitals"))
                {
                    
                    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_HospitalRequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
                    
                }
        else if(org.equalsIgnoreCase("Blood Bank"))
        {
             
                    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_bloodbankRequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
        }
        else if(org.equalsIgnoreCase("Vaccine Manufacturer"))
        {
            
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update finalproj_vaccinemanufrequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
             
        }
        else if(org.equalsIgnoreCase("Medical Equipments"))
        {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update finalproj_medicalequipmanufrequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
            
        }
        else if(org.equalsIgnoreCase("FoodMarket"))
        {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update finalproj_foodmarketrequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
        }
        else if(org.equalsIgnoreCase("Clothing"))
        {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_ClothingRequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
        }
        else if(org.equalsIgnoreCase("Transport"))
        {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update finalproj_transportrequests set attrib1='A',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
         }
        }
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_AdminRequests set status='REJECTED',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Rejected!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnviewpendingreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpendingreqActionPerformed
        // TODO add your handling code here:
        String Ntw = cmbNetwork.getItemAt(cmbNetwork.getSelectedIndex());
        String Org = cmbOrganisation.getItemAt(cmbOrganisation.getSelectedIndex());
        String Enter = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        DefaultTableModel model = (DefaultTableModel) tblManageRequest.getModel();
        model.setRowCount(0);
        String TableName="finalproj_hospitalrequests";
        if(Org.equalsIgnoreCase("Transport"))
                {
                    TableName = "finalproj_transportrequests";
                }
        else if(Org.equalsIgnoreCase("Hospitals"))
                {
                    TableName = "finalproj_hospitalrequests";
                }
        else if(Org.equalsIgnoreCase("Clothing"))
                {
                    TableName = "FinalProj_ClothingRequests";
                }
        else if(Org.equalsIgnoreCase("Medical Equipments"))
                {
                    TableName = "finalproj_medicalequipmanufrequests";
                }
        else if(Org.equalsIgnoreCase("Vaccine Manufacturer"))
                {
                    TableName = "finalproj_vaccinemanufrequests";
                }
        else if(Org.equalsIgnoreCase("Blood Bank"))
                {
                    TableName = "finalproj_bloodbankrequests";
                }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
            String query = "select * from "+ TableName +" where Attrib1 <> 'A'";
            //union select * from finalproj_hospitalrequests where Attrib1 is null union select * from finalproj_bloodbankrequests where Attrib1 is null union select * from finalproj_vaccinemanufrequests where Attrib1 is null union select * from finalproj_medicalequipmanufrequests where Attrib1 is null union select * from finalproj_foodmarketrequests where Attrib1 is null";
            ResultSet rs = myStatement.executeQuery(query);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Network = Ntw;
                String Enterprise = Enter;
                String Organization = Org;
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("Attrib1");
                //String Location = rs.getString("Location");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[10];
                row[0] = RequestID;
                row[1] = Network;
                row[2] = Enterprise;
                row[3] = Organization;
                row[4] = Requester;
                row[5] = Description;
                row[6] = quantity;
                row[7] = status;
                row[8] = RequestedDate;
                row[9] = Comments;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
        }
                
        
        
    }//GEN-LAST:event_btnviewpendingreqActionPerformed

    private void btnviewrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewrequestsActionPerformed
        // TODO add your handling code here:
        String Ntw = cmbNetwork.getItemAt(cmbNetwork.getSelectedIndex());
        String Org = cmbOrganisation.getItemAt(cmbOrganisation.getSelectedIndex());
        String Enter = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        DefaultTableModel model = (DefaultTableModel) tblManageRequest.getModel();
        model.setRowCount(0);
         String TableName="finalproj_hospitalrequests";
        if(Org.equalsIgnoreCase("Transport"))
                {
                    TableName = "finalproj_transportrequests";
                }
        else if(Org.equalsIgnoreCase("Hospitals"))
                {
                    TableName = "finalproj_hospitalrequests";
                }
        else if(Org.equalsIgnoreCase("Clothing"))
                {
                    TableName = "FinalProj_ClothingRequests";
                }
        else if(Org.equalsIgnoreCase("Medical Equipments"))
                {
                    TableName = "finalproj_medicalequipmanufrequests";
                }
        else if(Org.equalsIgnoreCase("Vaccine Manufacturer"))
                {
                    TableName = "finalproj_vaccinemanufrequests";
                }
        else if(Org.equalsIgnoreCase("Blood Bank"))
                {
                    TableName = "finalproj_bloodbankrequests";
                }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
            String query = "select * from "+ TableName ;
            //union select * from finalproj_hospitalrequests where Attrib1 is null union select * from finalproj_bloodbankrequests where Attrib1 is null union select * from finalproj_vaccinemanufrequests where Attrib1 is null union select * from finalproj_medicalequipmanufrequests where Attrib1 is null union select * from finalproj_foodmarketrequests where Attrib1 is null";
            ResultSet rs = myStatement.executeQuery(query);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Network = Ntw;
                String Enterprise = Enter;
                String Organization = Org;
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("Attrib1");
                //String Location = rs.getString("Location");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[10];
                row[0] = RequestID;
                row[1] = Network;
                row[2] = Enterprise;
                row[3] = Organization;
                row[4] = Requester;
                row[5] = Description;
                row[6] = quantity;
                row[7] = status;
                row[8] = RequestedDate;
                row[9] = Comments;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
        }

    }//GEN-LAST:event_btnviewrequestsActionPerformed

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
        String Enterprise = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        cmbOrganisation.removeAllItems();
        if (Enterprise.equalsIgnoreCase("Medical")) {
            cmbOrganisation.addItem("Hospitals");
            cmbOrganisation.addItem("Vaccine Manufacturer");
            cmbOrganisation.addItem("Blood Bank");
            cmbOrganisation.addItem("Medical Equipments");
            //cmbOrganisation.addItem("Insurance");

        } else if (Enterprise.equalsIgnoreCase("Voluntary")) {
            cmbOrganisation.addItem("NGO");
            cmbOrganisation.addItem("Fund Raiser");
        } else if (Enterprise.equalsIgnoreCase("Government")) {
            cmbOrganisation.addItem("Government");
            cmbOrganisation.addItem("NDRF");
        } else if (Enterprise.equalsIgnoreCase("Warehouse")) {
            cmbOrganisation.addItem("FoodMarket");
            cmbOrganisation.addItem("Clothing");
            cmbOrganisation.addItem("Transport");
        }
    }//GEN-LAST:event_cmbEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnviewpendingreq;
    private javax.swing.JButton btnviewrequests;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JComboBox<String> cmbOrganisation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageRequest;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtRequestID;
    // End of variables declaration//GEN-END:variables
}
