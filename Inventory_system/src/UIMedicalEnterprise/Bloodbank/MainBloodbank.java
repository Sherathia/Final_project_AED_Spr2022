/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIMedicalEnterprise.Bloodbank;

//import com.sun.jdi.connect.spi.Connection;
import UI.Login;
import java.awt.CardLayout;
//import java.beans.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saisr
 */
public class MainBloodbank extends javax.swing.JFrame {

    /**
     * Creates new form MainBloodbank
     */
    public MainBloodbank() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tblBloodBank.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
            String query = "Select * from finalproj_bloodbankrequests where Attrib1='A'";
            ResultSet rs = myStatement.executeQuery(query);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("status");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[8];
                row[0] = RequestID;
                row[1] = Description;
                row[2] = quantity;
                row[3] = Requester;
                row[4] = RequestedDate;
                row[5] = status;
                row[6] = ApprovalDate;
                row[7] = Comments;
                model.addRow(row);
            }

            con.close();

        } catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnViewRequest = new javax.swing.JButton();
        btnUpdAvailability = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RightPane = new javax.swing.JPanel();
        btnAssign = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodBank = new javax.swing.JTable();
        txtRequestID = new javax.swing.JTextField();
        txtComments = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        btnViewRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnViewRequest.setText("View Requests");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnUpdAvailability.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnUpdAvailability.setText("Update Availability");
        btnUpdAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdAvailabilityActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("Create Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoutimage.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdAvailability)
                            .addComponent(jButton1)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUpdAvailability, jButton1});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnViewRequest)
                .addGap(18, 18, 18)
                .addComponent(btnUpdAvailability)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        RightPane.setBackground(new java.awt.Color(255, 255, 255));

        btnAssign.setBackground(new java.awt.Color(188, 210, 254));
        btnAssign.setText("ASSIGN TO ME");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(188, 210, 254));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(188, 210, 254));
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BLOOD BANKS ");

        tblBloodBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestID", "Description", "Quantity", "Requester", "Requested Date", "Status", "Approval Date", "Comments"
            }
        ));
        jScrollPane1.setViewportView(tblBloodBank);

        txtRequestID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtComments.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Comments:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("RequestID");

        javax.swing.GroupLayout RightPaneLayout = new javax.swing.GroupLayout(RightPane);
        RightPane.setLayout(RightPaneLayout);
        RightPaneLayout.setHorizontalGroup(
            RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPaneLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPaneLayout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addGap(18, 18, 18)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightPaneLayout.createSequentialGroup()
                        .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        RightPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComments, txtRequestID});

        RightPaneLayout.setVerticalGroup(
            RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPaneLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addGroup(RightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RightPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(RightPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setRightComponent(jPanel3);

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

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:

        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory management?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Saisrujan@123");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_BloodBankRequests set status='IN PROGRESS', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Assigned!!");
            DefaultTableModel model = (DefaultTableModel) tblBloodBank.getModel();
            model.setRowCount(0);
            String query1 = "Select * from finalproj_bloodbankrequests where Attrib1='A'";
            ResultSet rs = myStatement.executeQuery(query1);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("status");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[8];
                row[0] = RequestID;
                row[1] = Description;
                row[2] = quantity;
                row[3] = Requester;
                row[4] = RequestedDate;
                row[5] = status;
                row[6] = ApprovalDate;
                row[7] = Comments;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String requestId = txtRequestID.getText();
        String comments = txtComments.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory management?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Saisrujan@123");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_BloodBankRequests set status='APPROVED',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Approved!!");
            DefaultTableModel model = (DefaultTableModel) tblBloodBank.getModel();
            model.setRowCount(0);
            String query1 = "Select * from finalproj_bloodbankrequests where Attrib1='A'";
            ResultSet rs = myStatement.executeQuery(query1);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("status");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[8];
                row[0] = RequestID;
                row[1] = Description;
                row[2] = quantity;
                row[3] = Requester;
                row[4] = RequestedDate;
                row[5] = status;
                row[6] = ApprovalDate;
                row[7] = Comments;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory management?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Saisrujan@123");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_BloodBankRequests set status='REJECTED', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Rejected!!");
            DefaultTableModel model = (DefaultTableModel) tblBloodBank.getModel();
            model.setRowCount(0);
            String query1 = "Select * from finalproj_bloodbankrequests where Attrib1='A'";
            ResultSet rs = myStatement.executeQuery(query1);
            while (rs.next()) {
                String RequestID = rs.getString("RequestID");
                String Description = rs.getString("Description");
                String quantity = rs.getString("quantity");
                String Requester = rs.getString("Requester");
                String RequestedDate = rs.getString("RequestedDate");
                String ApprovalDate = rs.getString("ApprovalDate");
                String status = rs.getString("status");
                String Comments = rs.getString("Comments");

                Object row[] = new Object[8];
                row[0] = RequestID;
                row[1] = Description;
                row[2] = quantity;
                row[3] = Requester;
                row[4] = RequestedDate;
                row[5] = status;
                row[6] = ApprovalDate;
                row[7] = Comments;
                model.addRow(row);
            }
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        RightPane.remove(this);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.previous(RightPane);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnUpdAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdAvailabilityActionPerformed
        // TODO add your handling code here:
        BloodbankAvailability ba = new BloodbankAvailability(RightPane);
        RightPane.add("BloodbankAvailability", ba);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.next(RightPane);
    }//GEN-LAST:event_btnUpdAvailabilityActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BloodBankCreateRequest ba = new BloodBankCreateRequest(RightPane);
        RightPane.add("BloodbankCreateRequest", ba);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.next(RightPane);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainBloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainBloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainBloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainBloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainBloodbank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPane;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnUpdAvailability;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblBloodBank;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtRequestID;
    // End of variables declaration//GEN-END:variables
}
