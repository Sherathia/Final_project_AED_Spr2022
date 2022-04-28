/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.SendMail;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aesha
 */
public class RegistrationScreen extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationScreen
     */
    private JPanel rightPanel;
    public RegistrationScreen(JPanel rightPanel) {
        initComponents();
        this.rightPanel = rightPanel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        cmbEnterprise = new javax.swing.JComboBox<>();
        cmbOrganisation = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        pwd2 = new javax.swing.JPasswordField();
        txtcountry = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        panelRegister.setBackground(new java.awt.Color(237, 243, 254));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Password: ");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Confirm Password:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        txtName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Email Id:");

        txtEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Country:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Enterprise:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Organisation:");

        btnRegister.setBackground(new java.awt.Color(231, 239, 254));
        btnRegister.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerbtn1.jpg"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        cmbEnterprise.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbEnterprise.setForeground(new java.awt.Color(102, 153, 255));
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical", "Voluntary", "Government", "Warehouse" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });

        cmbOrganisation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbOrganisation.setForeground(new java.awt.Color(102, 153, 255));
        cmbOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganisationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Contact:");

        txtcontact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontactFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("New User Registration");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(234, 234, 177));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("WELCOME NEW USER!! ");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\aesha\\OneDrive\\Desktop\\AED\\Final_project\\Images\\user1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pwd1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd1FocusLost(evt);
            }
        });
        pwd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pwd1MouseExited(evt);
            }
        });

        pwd2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pwd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd2FocusLost(evt);
            }
        });
        pwd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pwd2MouseExited(evt);
            }
        });

        txtcountry.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newuser3.png"))); // NOI18N

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(176, 176, 176)
                                .addComponent(txtName))
                            .addGroup(panelRegisterLayout.createSequentialGroup()
                                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(151, 151, 151))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(165, 165, 165))
                                        .addGroup(panelRegisterLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(152, 152, 152))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(164, 164, 164))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(151, 151, 151))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(137, 137, 137))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(166, 166, 166)))
                                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwd1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcountry, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwd2))
                                    .addComponent(cmbEnterprise, 0, 179, Short.MAX_VALUE)
                                    .addComponent(cmbOrganisation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcontact))))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel13))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(443, 443, 443))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(86, 86, 86)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13))
                .addGap(13, 13, 13)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String Name = txtName.getText();
        String UserName = txtUsername.getText();
        
        char pass[]= pwd1.getPassword();
        String Password = String.valueOf(pass);
        
        char passconf[]= pwd2.getPassword();
        String PasswordConfirm = String.valueOf(passconf);
        
        /*if(Password != PasswordConfirm)
                {
                   JOptionPane.showMessageDialog(this, "Passwords don't match");
                   pwd2.setText(null);
                   return;
                }*/
        
        String EmailId = txtEmail.getText();
        String Contact = txtcontact.getText();
        String Country = txtcountry.getText();
        String Organization = cmbOrganisation.getItemAt(cmbOrganisation.getSelectedIndex());
        String Enterprise = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        
        if(Name.isEmpty() || UserName.isEmpty() || EmailId.isEmpty() || Contact.isEmpty() 
                || Country.isEmpty() || Organization.isEmpty() || Enterprise.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please populate values!!..");
            return;
        }
         Business.SendMail mail = new Business.SendMail();
            mail.sendMail("Registration", "Registration Completed.!!", EmailId);

        //sendMail("Registration","Registered Successfully",EmailId);
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema1?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root12345");
        Statement myStatement = con.createStatement();
        String query = "Insert into `FinalProj_Users`"+"values('"+Name+"','"+UserName+"','"+Password+"','"+EmailId+"','"+Country+"','"+Enterprise+"','"+Organization+"','"+Contact+"')";
        myStatement.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "User Created Successfully!!..");
        txtEmail.setText(null);
        txtName.setText(null);
        txtUsername.setText(null);
        txtcontact.setText(null);
        txtcountry.setText(null);
        pwd1.setText(null);
        pwd2.setText(null);
        //System.out.println("Inserted data");
           }catch(Exception E) {
            JOptionPane.showMessageDialog(this, "Error while fetching data from DB");
               }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganisationActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cmbOrganisationActionPerformed

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
        String Enterprise = cmbEnterprise.getItemAt(cmbEnterprise.getSelectedIndex());
        cmbOrganisation.removeAllItems();
                if(Enterprise.equalsIgnoreCase("Medical"))
                {
                 cmbOrganisation.addItem("Hospitals");
                 cmbOrganisation.addItem("Vaccine Manufacturer");
                 cmbOrganisation.addItem("Blood Bank");
                 cmbOrganisation.addItem("Medical Equipments");
                 //cmbOrganisation.addItem("Insurance");
                 
                }
                else if(Enterprise.equalsIgnoreCase("Voluntary"))
                {
                    cmbOrganisation.addItem("NGO");
                    cmbOrganisation.addItem("Fund Raiser");
                }
                else if(Enterprise.equalsIgnoreCase("Government"))
                {
                    cmbOrganisation.addItem("Government");
                    cmbOrganisation.addItem("NDRF");
                }
                else if(Enterprise.equalsIgnoreCase("Warehouse"))
                {
                    cmbOrganisation.addItem("FoodMarket");
                    cmbOrganisation.addItem("Clothing");
                    cmbOrganisation.addItem("Transport");
                }
    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void pwd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd1MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pwd1MouseExited

    private void pwd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd2MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pwd2MouseExited

    private void pwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd1FocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_pwd1FocusLost

    private void pwd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd2FocusLost
        // TODO add your handling code here:
         char pass1[]= pwd1.getPassword();
        String Password1 = String.valueOf(pass1);
        if(Password1.length()<= 8)
        {
            JOptionPane.showMessageDialog(this, "Passwords should be more than 8 characters");
        }
        char pass2[]= pwd2.getPassword();
        String Password2 = String.valueOf(pass2);
        if(!Password2.equalsIgnoreCase(Password1))
        {
            JOptionPane.showMessageDialog(this, "Passwords and confirm passwords are not matching!!");
            pwd2.setText(null);
        }
    }//GEN-LAST:event_pwd2FocusLost

    private void txtcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontactFocusLost
        // TODO add your handling code here:
        String ContactNo = txtcontact.getText();
        if(ContactNo.length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Please enter Valid Phone number!");
            return;
        }
    }//GEN-LAST:event_txtcontactFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JComboBox<String> cmbOrganisation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtcountry;
    // End of variables declaration//GEN-END:variables
}
