/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Organization.ClothingRetailerScreen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aesha
 */
public class ClothingRetailAvailability extends javax.swing.JPanel {

    /**
     * Creates new form ClothingRetailAvailability
     */
    private JPanel RightPanel;
    public ClothingRetailAvailability(JPanel RightPanel) {
        initComponents();
        this.RightPanel = RightPanel;
         DefaultTableModel model = (DefaultTableModel)tblClothingItems.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();
            String query = "Select * from FinalProj_ClothingItems";
            ResultSet rs = myStatement.executeQuery(query);
             cmbStore.removeAllItems();
             
            while(rs.next())
            {   
                cmbStore.addItem(rs.getString("StoreName"));
                String StoreName = rs.getString("StoreName");
                String MenApparel = rs.getString("MenApparel");
                String WomenApparel = rs.getString("WomenApparel");
                String KidsApparel = rs.getString("KidsApparel");
                String Lastupdated = rs.getString("Lastupdated");
                

                Object row[] = new Object[5];
                row[0] = StoreName;
                row[1] = MenApparel;
                row[2] = WomenApparel;
                row[3] = KidsApparel;
                row[4] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        }
        //System.out.println("Inserted data");
        catch(Exception E) {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClothingItems = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cmbStore = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWomen = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtKids = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("ITEM AVAILABILITY");

        tblClothingItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "StoreName", "Men Apparel", "Women Apparel", "Kids Apparel", "LastUpdated"
            }
        ));
        jScrollPane1.setViewportView(tblClothingItems);

        jLabel3.setText("StoreName:");

        cmbStore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Men Apparel:");

        jLabel4.setText("Women Apparel:");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Kids Apparel:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWomen)
                            .addComponent(txtMen)
                            .addComponent(cmbStore, 0, 92, Short.MAX_VALUE)
                            .addComponent(txtKids))
                        .addGap(57, 57, 57)
                        .addComponent(btnUpdate)))
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtKids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String MenApparel = txtMen.getText();
        String WomenApparel = txtWomen.getText();
        String KidsApparel = txtKids.getText();
        String StoreName = cmbStore.getItemAt(cmbStore.getSelectedIndex());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String Date = dateFormat.format(java.util.Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel)tblClothingItems.getModel();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
            Statement myStatement = con.createStatement();

            String query = "Update FinalProj_ClothingItems set MenApparel ='"+MenApparel+"',KidsApparel ='"+KidsApparel+"',Lastupdated ='"+Date+"', WomenApparel ='"+WomenApparel+"' where StoreName='"+StoreName+"'";
            myStatement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Entry Updated!!");

            String querysel = "Select * from FinalProj_ClothingItems";
            ResultSet rs = myStatement.executeQuery(querysel);
            cmbStore.removeAllItems();
            model.setRowCount(0);
            while(rs.next())
            {
                cmbStore.addItem(rs.getString("StoreName"));
                String StoreName1 = rs.getString("StoreName");
                String MenApparel1 = rs.getString("MenApparel");
                String KidsApparel1 = rs.getString("KidsApparel");
                 String WomenAppare11 = rs.getString("WomenApparel");
                String Lastupdated = rs.getString("Lastupdated");

                Object row[] = new Object[5];
                row[0] = StoreName1;
                row[1] = MenApparel1;
                row[2] = WomenAppare11;
                row[3] = KidsApparel1;
                row[4] = Lastupdated;
                model.addRow(row);
            }
            con.close();
        }
        //System.out.println("Inserted data");
        catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error in DB connection");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbStore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClothingItems;
    private javax.swing.JTextField txtKids;
    private javax.swing.JTextField txtMen;
    private javax.swing.JTextField txtWomen;
    // End of variables declaration//GEN-END:variables
}