/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Organization.ClothingRetailerScreen;

import UI.Login;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author aesha
 */
public class ClothingRetailerMain extends javax.swing.JFrame {

    /**
     * Creates new form ClothingRetailerMain
     */
    DefaultTableModel model;
    static Logger log = Logger.getLogger(ClothingRetailerMain.class.getName());

    public ClothingRetailerMain() {
        initComponents();
        model = (DefaultTableModel) tblClothingRtl.getModel();
        model.setRowCount(0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
            String query = "Select * from FinalProj_ClothingRequests where Attrib1='A'";
            ResultSet rs = myStatement.executeQuery(query);
//            this.table = rs;
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

            String querysel = "Select MenApparel from FinalProj_ClothingItems";
            ResultSet rs1 = myStatement.executeQuery(querysel);
            String Quantity;
            int total = 0;
            while (rs1.next()) {

                Quantity = rs1.getString("MenApparel");
                total += Integer.parseInt(Quantity);
            }
            if (total <= 0) {
                btnApprove.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnViewRequest = new javax.swing.JButton();
        btnUpdAvailability = new javax.swing.JButton();
        btnCreateRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        RightPane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClothingRtl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRequestID = new javax.swing.JTextField();
        txtComments = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        btnViewRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnViewRequest.setForeground(new java.awt.Color(51, 153, 255));
        btnViewRequest.setText("VIEW REQUESTS");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnUpdAvailability.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnUpdAvailability.setForeground(new java.awt.Color(51, 153, 255));
        btnUpdAvailability.setText("AVAILABILITY");
        btnUpdAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdAvailabilityActionPerformed(evt);
            }
        });

        btnCreateRequest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCreateRequest.setForeground(new java.awt.Color(51, 153, 255));
        btnCreateRequest.setText("CREATE REQUEST");
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoutimage.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnViewRequest)
                .addGap(18, 18, 18)
                .addComponent(btnUpdAvailability)
                .addGap(18, 18, 18)
                .addComponent(btnCreateRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 550, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        RightPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(237, 243, 254));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLOTHING RETAILER");

        tblClothingRtl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblClothingRtl.setForeground(new java.awt.Color(102, 153, 255));
        tblClothingRtl.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClothingRtl.setGridColor(new java.awt.Color(102, 153, 255));
        jScrollPane1.setViewportView(tblClothingRtl);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("RequestID");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Comments:");

        txtRequestID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtComments.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnAssign.setBackground(new java.awt.Color(102, 153, 255));
        btnAssign.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("ASSIGN TO ME");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(102, 153, 255));
        btnApprove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(102, 153, 255));
        btnReject.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clothes.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ANALYTICS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnAssign)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComments, txtQuantity, txtRequestID});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApprove, btnAssign, btnReject, jButton1});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnApprove)
                    .addComponent(btnReject)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );

        RightPane.add(jPanel3, "card2");

        jSplitPane1.setRightComponent(RightPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_ClothingRequests set status='IN PROGRESS', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Assigned!!");
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
        String Quantity = txtQuantity.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_ClothingRequests set status='APPROVED',ApprovalDate ='" + Date + "', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);

            String querysel = "Select * from FinalProj_ClothingItems";
            int MenApparel1;
            int finalqty = 0;
            int flag = 0;
            String StoreName1 = null;
            ResultSet rs1 = myStatement.executeQuery(querysel);
            while (rs1.next()) {
                //cmbStore.addItem(rs.getString("StoreName"));
                StoreName1 = rs1.getString("StoreName");
                MenApparel1 = Integer.parseInt(rs1.getString("MenApparel"));

                if (MenApparel1 >= Integer.parseInt(Quantity) && flag == 0) {
                    finalqty = MenApparel1 - Integer.parseInt(Quantity);
                    //return; 
                    flag = 1;
                }

            }

            String queryupd = "Update FinalProj_ClothingItems set MenApparel ='" + finalqty + "',Lastupdated ='" + Date + "' where StoreName='" + StoreName1 + "'";
            myStatement.executeUpdate(queryupd);

            JOptionPane.showMessageDialog(this, "Request Approved!!");
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_ClothingRequests set status='REJECTED', comments ='" + comments + "' where RequestID='" + requestId + "'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Request Rejected!!");
            con.close();
        } //System.out.println("Inserted data");
        catch (Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        ClothingRetailerMain cm;
        cm = new ClothingRetailerMain();
        cm.setVisible(true);
        this.dispose();
        /* RightPane.remove(this);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.previous(RightPane);*/
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnUpdAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdAvailabilityActionPerformed
        // TODO add your handling code here:
        ClothingRetailAvailability cra = new ClothingRetailAvailability(RightPane);
        RightPane.add("ClothingRetailAvailability", cra);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.next(RightPane);
    }//GEN-LAST:event_btnUpdAvailabilityActionPerformed

    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed
        // TODO add your handling code here:
        ClothingRetailCreateRequest crc = new ClothingRetailCreateRequest(RightPane);
        RightPane.add("ClothingRetailCreateRequest", crc);
        CardLayout layout = (CardLayout) RightPane.getLayout();
        layout.next(RightPane);
    }//GEN-LAST:event_btnCreateRequestActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Business.Analytics chart = new Business.Analytics();
        int accepted = 0;
        int rejected = 0;
        int pending = 0;

        for (int row = 0; row < model.getRowCount(); row++) {

            if (model.getValueAt(row, 5) == "ACCEPTED") {
                accepted++;
            } else if (model.getValueAt(row, 5) == "REJECTED") {
                rejected++;
            } else {
                pending++;
            }

        }
        chart.drawChart(accepted, rejected, pending, model.getColumnCount());
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
            java.util.logging.Logger.getLogger(ClothingRetailerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClothingRetailerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClothingRetailerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClothingRetailerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClothingRetailerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RightPane;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCreateRequest;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnUpdAvailability;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblClothingRtl;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRequestID;
    // End of variables declaration//GEN-END:variables
}
