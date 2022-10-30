/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Roles;
import model.UserAccount;
import model.UserAccountDirectory;
import userInteface.MainJFrame;

/**
 *
 * @author User
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    
    UserAccountDirectory userAccountDirectory;
    Roles roles;
    
    public LoginFrame() {
        initComponents();
        this.userAccountDirectory = new UserAccountDirectory();
        this.roles = new Roles();
        populateTable();
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
        jLabel1 = new javax.swing.JLabel();
        Parent = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        rolesPanel = new javax.swing.JPanel();
        accounts = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHospitalAdmin = new javax.swing.JButton();
        mAccounts = new javax.swing.JPanel();
        mRoles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mUsername = new javax.swing.JTextField();
        mPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTableDetails = new javax.swing.JTable();
        mSave = new javax.swing.JButton();
        mUpdate = new javax.swing.JButton();
        mDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("        Welcome to BGS Global Hospitals");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setTopComponent(jPanel1);

        Parent.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("  Password:");
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 150, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("UserName:");
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 150, 30));

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        loginPanel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 230, 30));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        loginPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 120, 40));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        loginPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 230, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/doctor-stethoscope-hand-hospital-background-gown-94227568.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        loginPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1460, 670));

        Parent.add(loginPanel, "card2");

        rolesPanel.setBackground(new java.awt.Color(204, 204, 204));

        accounts.setBackground(new java.awt.Color(0, 102, 102));
        accounts.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        accounts.setText("SystemAdmin");
        accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHospitalAdmin.setBackground(new java.awt.Color(0, 102, 102));
        btnHospitalAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHospitalAdmin.setText("Hospital Admin");
        btnHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rolesPanelLayout = new javax.swing.GroupLayout(rolesPanel);
        rolesPanel.setLayout(rolesPanelLayout);
        rolesPanelLayout.setHorizontalGroup(
            rolesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rolesPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(rolesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHospitalAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accounts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1263, 1263, 1263)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rolesPanelLayout.setVerticalGroup(
            rolesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rolesPanelLayout.createSequentialGroup()
                .addGroup(rolesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rolesPanelLayout.createSequentialGroup()
                        .addGap(666, 666, 666)
                        .addComponent(btnBack))
                    .addGroup(rolesPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnHospitalAdmin))
                    .addGroup(rolesPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(accounts)))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        Parent.add(rolesPanel, "card3");

        mAccounts.setBackground(new java.awt.Color(204, 204, 204));

        mRoles.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Patient", "Hospital", "Community" }));
        mRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRolesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Roles:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("  Password:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("User Name:");

        mUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsernameActionPerformed(evt);
            }
        });

        mPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasswordActionPerformed(evt);
            }
        });

        mTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Role", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(mTableDetails);

        mSave.setBackground(new java.awt.Color(0, 102, 102));
        mSave.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        mSave.setText("Save");
        mSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSaveActionPerformed(evt);
            }
        });

        mUpdate.setBackground(new java.awt.Color(0, 102, 102));
        mUpdate.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        mUpdate.setText("Update");
        mUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUpdateActionPerformed(evt);
            }
        });

        mDelete.setBackground(new java.awt.Color(0, 102, 102));
        mDelete.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        mDelete.setText("Delete");
        mDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDeleteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mAccountsLayout = new javax.swing.GroupLayout(mAccounts);
        mAccounts.setLayout(mAccountsLayout);
        mAccountsLayout.setHorizontalGroup(
            mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mAccountsLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mAccountsLayout.createSequentialGroup()
                        .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mUsername)
                            .addComponent(mPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mAccountsLayout.createSequentialGroup()
                        .addComponent(mSave)
                        .addGap(41, 41, 41)
                        .addComponent(mUpdate)
                        .addGap(39, 39, 39)
                        .addComponent(mDelete)
                        .addGap(0, 1291, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mAccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1871, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mAccountsLayout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mAccountsLayout.setVerticalGroup(
            mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mAccountsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mAccountsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(mAccountsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(mAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mUpdate)
                    .addComponent(mSave)
                    .addComponent(mDelete))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        Parent.add(mAccounts, "card4");

        jSplitPane1.setRightComponent(Parent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String userStr = userName.getText();
        String passWordStr = password.getText();
        if(userStr.equalsIgnoreCase("admin") && passWordStr.equalsIgnoreCase("12345")){
            login = true;
            //JOptionPane.showMessageDialog(this, "Login in SuccessFul");
            Parent.removeAll();
            Parent.add(rolesPanel);
            Parent.repaint();
            Parent.revalidate();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void accountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsActionPerformed
        // TODO add your handling code here:
            Parent.removeAll();
            Parent.add(mAccounts);
            Parent.repaint();
            Parent.revalidate();
        
    }//GEN-LAST:event_accountsActionPerformed

    private void mSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSaveActionPerformed
        // TODO add your handling code here:
        if(mRoles.getSelectedItem().equals("Admin"))
        {
           userAccountDirectory.createUserAccount(mUsername.getText(), mPassword.getText(),roles.Admin);
        }       
        if(mRoles.getSelectedItem().equals("Doctor"))
        {
           userAccountDirectory.createUserAccount(mUsername.getText(), mPassword.getText(),roles.Doctor);
        }                
        if(mRoles.getSelectedItem().equals("Patient"))
        {
           userAccountDirectory.createUserAccount(mUsername.getText(), mPassword.getText(),roles.Patient);
        }             
        if(mRoles.getSelectedItem().equals("Community Admin"))
        {
           userAccountDirectory.createUserAccount(mUsername.getText(), mPassword.getText(),roles.Community);
        }
        if(mRoles.getSelectedItem().equals("Hospital Admin"))
        {
           userAccountDirectory.createUserAccount(mUsername.getText(), mPassword.getText(),roles.Hospital);
        }

        populateTable();
    }//GEN-LAST:event_mSaveActionPerformed

    private void mUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndexRow = mTableDetails.getSelectedRow();

        if(selectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please Select the row to Update it");
            return;
        }
        
        DefaultTableModel model  = (DefaultTableModel)mTableDetails.getModel();
        
        UserAccount userAccount = getUserData(model);
                
        UserAccount userAccountToUpdate = userAccountDirectory.getUserAccount(userAccount);
        
        setUserData(userAccountToUpdate);
               
        JOptionPane.showMessageDialog(this, "Updated a User");
              
        populateTable();
    }//GEN-LAST:event_mUpdateActionPerformed

    private void mDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDeleteActionPerformed
//         TODO add your handling code here:
        
        int selectedIndexRow = mTableDetails.getSelectedRow();

        if(selectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please Select the row to Delete it");
            return;
        }
        
        DefaultTableModel model  = (DefaultTableModel)mTableDetails.getModel();
        
        UserAccount userAccount = getUserData(model);
                
        userAccountDirectory.deleteUserAccount(userAccount);
               
        JOptionPane.showMessageDialog(this, "Deleted a User");
              
        populateTable();
    }//GEN-LAST:event_mDeleteActionPerformed

    private void mUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mUsernameActionPerformed

    private void mPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPasswordActionPerformed

    private void mRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mRolesActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Parent.removeAll();
        Parent.add(loginPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Parent.removeAll();
        Parent.add(rolesPanel);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminActionPerformed
        // TODO add your handling code here:
          MainJFrame mjf=new MainJFrame();
        mjf.setVisible(true);
        mjf.pack();
        mjf.setLocationRelativeTo(null);
        mjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnHospitalAdminActionPerformed
        Boolean login = false;
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    
    private UserAccount getUserData(DefaultTableModel model){
        
        int selectedIndexRow = mTableDetails.getSelectedRow();
        
        UserAccount userAccount =  new UserAccount(); 
        userAccount.setUsername((String)model.getValueAt(selectedIndexRow, 1));
        userAccount.setPassword((String)model.getValueAt(selectedIndexRow, 2));

        if(roles.Admin.equals((String)model.getValueAt(selectedIndexRow, 0))){ 
            userAccount.setRole(roles.Admin);
        }else if(roles.Doctor.equals((String)model.getValueAt(selectedIndexRow, 0))){
            userAccount.setRole(roles.Doctor);
        }else if(roles.Patient.equals((String)model.getValueAt(selectedIndexRow, 0))){   
            userAccount.setRole(roles.Patient);
        }else if(roles.Community.equals((String)model.getValueAt(selectedIndexRow, 0))){
            userAccount.setRole(roles.Community);
        }else if(roles.Hospital.equals((String)model.getValueAt(selectedIndexRow, 0))){  
            userAccount.setRole(roles.Hospital);
        }
        
        return userAccount;
    }
    
    private void setUserData(UserAccount userAccount){
        
        userAccount.setUsername(mUsername.getText());
        userAccount.setPassword(mPassword.getText());

        if(roles.Admin.equals((String)mRoles.getSelectedItem())){ 
            userAccount.setRole(roles.Admin);
        }else if(roles.Doctor.equals((String)mRoles.getSelectedItem())){
            userAccount.setRole(roles.Doctor);
        }else if(roles.Patient.equals((String)mRoles.getSelectedItem())){   
            userAccount.setRole(roles.Patient);
        }else if(roles.Community.equals((String)mRoles.getSelectedItem())){
            userAccount.setRole(roles.Community);
        }else if(roles.Hospital.equals((String)mRoles.getSelectedItem())){  
            userAccount.setRole(roles.Hospital);
        }
       
    }
    
    private void populateTable() {

        DefaultTableModel model  = (DefaultTableModel)mTableDetails.getModel();
        model.setRowCount(0);
        
        for(UserAccount user : userAccountDirectory.getUserAccountList()){
            
            Object[] row = new Object[4];
            row[0] = user.getRole();
            row[1] = user.getUsername();
            row[2] = user.getPassword();

            model.addRow(row);
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Parent;
    private javax.swing.JButton accounts;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHospitalAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mAccounts;
    private javax.swing.JButton mDelete;
    private javax.swing.JPasswordField mPassword;
    private javax.swing.JComboBox<String> mRoles;
    private javax.swing.JButton mSave;
    private javax.swing.JTable mTableDetails;
    private javax.swing.JButton mUpdate;
    private javax.swing.JTextField mUsername;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel rolesPanel;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
