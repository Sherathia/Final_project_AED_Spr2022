/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aesha
 */
public class AdminRequestScreen extends javax.swing.JFrame {

    /**
     * Creates new form AdminRequestScreen
     */
    public AdminRequestScreen() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnUserCreation = new javax.swing.JButton();
        btnTaskRequest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnHold = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        txtComments = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnviewpendingreq = new javax.swing.JButton();
        btnviewrequests = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRequestID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnUserCreation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnUserCreation.setText("User Creation Request");
        btnUserCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCreationActionPerformed(evt);
            }
        });

        btnTaskRequest.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnTaskRequest.setText("Task Requests");
        btnTaskRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUserCreation)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaskRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnUserCreation)
                .addGap(53, 53, 53)
                .addComponent(btnTaskRequest)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.CardLayout());

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblRequests.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Name", "Network", "Enterprise", "Organization", "Requester", "Requested_date", "Approval_Date", "Status", "Comments"
            }
        ));
        jScrollPane1.setViewportView(tblRequests);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("USER CREATION REQUESTS");

        btnApprove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnHold.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnHold.setText("Hold");
        btnHold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoldActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        txtComments.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Comments:");

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

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Request ID:");

        txtRequestID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addGap(0, 108, Short.MAX_VALUE)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightPanelLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RightPanelLayout.createSequentialGroup()
                                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RightPanelLayout.createSequentialGroup()
                                        .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(RightPanelLayout.createSequentialGroup()
                                        .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnHold, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightPanelLayout.createSequentialGroup()
                                .addComponent(btnviewpendingreq)
                                .addGap(33, 33, 33)
                                .addComponent(btnviewrequests))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewpendingreq)
                    .addComponent(btnviewrequests))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove))
                .addGap(31, 31, 31)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHold))
                .addGap(33, 33, 33)
                .addComponent(btnReject)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jPanel2.add(RightPanel, "card2");

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaskRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskRequestActionPerformed
        // TODO add your handling code here:
         TasksRequest tasksRequest = new TasksRequest(jPanel2);
        jPanel2.add("TasksRequest",tasksRequest);
        CardLayout layout = (CardLayout)jPanel2.getLayout();
        layout.next(jPanel2);
    }//GEN-LAST:event_btnTaskRequestActionPerformed

    private void btnviewrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewrequestsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblRequests.getModel();
         model.setRowCount(0);
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        String query = "Select * from FinalProj_AdminRequests where Attrib1 is NULL";
        ResultSet rs = myStatement.executeQuery(query);
        while(rs.next())
        {
            String RequestID = rs.getString("RequestID");
            String Name = rs.getString("Name");
            String Network = rs.getString("Network");
            String Enterprise = rs.getString("Enterprise");
            String Organization = rs.getString("Organization");
            String Requester = rs.getString("Requester");
            String RequestedDate = rs.getString("RequestedDate");
            String ApprovalDate = rs.getString("ApprovalDate");
            String status = rs.getString("status");
            String Comments = rs.getString("Comments");
            
            Object row[] = new Object[10];
            row[0] = RequestID;
            row[1] = Name;
            row[2] = Network;
            row[3] = Enterprise;
            row[4] = Organization;
            row[5] = Requester;
            row[6] = RequestedDate;
            row[7] = ApprovalDate;
            row[8] = status;
            row[9] = Comments;
            model.addRow(row);
        }
        con.close();
         }
        //System.out.println("Inserted data");
           catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
               }
        
    }//GEN-LAST:event_btnviewrequestsActionPerformed

    private void btnviewpendingreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpendingreqActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)tblRequests.getModel();
         model.setRowCount(0);
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        String query = "Select * from FinalProj_AdminRequests where status ='CREATED' and  Attrib1 is NULL";
        ResultSet rs = myStatement.executeQuery(query);
        while(rs.next())
        {
            String RequestID = rs.getString("RequestID");
            String Name = rs.getString("Name");
            String Network = rs.getString("Network");
            String Enterprise = rs.getString("Enterprise");
            String Organization = rs.getString("Organization");
            String Requester = rs.getString("Requester");
            String RequestedDate = rs.getString("RequestedDate");
            String ApprovalDate = rs.getString("ApprovalDate");
            String status = rs.getString("status");
            String Comments = rs.getString("Comments");
            
            Object row[] = new Object[10];
            row[0] = RequestID;
            row[1] = Name;
            row[2] = Network;
            row[3] = Enterprise;
            row[4] = Organization;
            row[5] = Requester;
            row[6] = RequestedDate;
            row[7] = ApprovalDate;
            row[8] = status;
            row[9] = Comments;
            model.addRow(row);
        }
        con.close();
         }
        //System.out.println("Inserted data");
           catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
               }
    }//GEN-LAST:event_btnviewpendingreqActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime()); 
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        
        String query = "Update FinalProj_AdminRequests set status='APPROVED',ApprovalDate ='"+Date+"', comments ='"+comments+"' where RequestID='"+requestId+"'";
        myStatement.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Request Approved!!");
        con.close();
         }
        //System.out.println("Inserted data");
           catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
               }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnHoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoldActionPerformed
        // TODO add your handling code here:
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime()); 
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        
        String query = "Update FinalProj_AdminRequests set status='ON HOLD',ApprovalDate ='"+Date+"', comments ='"+comments+"' where RequestID='"+requestId+"'";
        myStatement.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Request On Hold!!");
        con.close();
         }
        //System.out.println("Inserted data");
           catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
               }
    }//GEN-LAST:event_btnHoldActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime()); 
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        
        String query = "Update FinalProj_AdminRequests set status='REJECTED',ApprovalDate ='"+Date+"', comments ='"+comments+"' where RequestID='"+requestId+"'";
        myStatement.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Request Rejected!!");
        con.close();
         }
        //System.out.println("Inserted data");
           catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
               }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnUserCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCreationActionPerformed
        // TODO add your handling code here:
        jPanel2.remove(this);
        CardLayout layout = (CardLayout) jPanel2.getLayout();
        layout.previous(jPanel2);
    }//GEN-LAST:event_btnUserCreationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRequestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRequestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRequestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRequestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRequestScreen().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnHold;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnTaskRequest;
    private javax.swing.JButton btnUserCreation;
    private javax.swing.JButton btnviewpendingreq;
    private javax.swing.JButton btnviewrequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblRequests;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtRequestID;
    // End of variables declaration//GEN-END:variables
}