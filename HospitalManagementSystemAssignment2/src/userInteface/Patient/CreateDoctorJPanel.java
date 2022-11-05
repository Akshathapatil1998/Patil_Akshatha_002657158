/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInteface.Patient;

import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Doctor;
import model.MyStringVerifier;
import model.Person;

/**
 *
 * @author Dell
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
     private Person person;
    private JPanel userProcessContainer1;
    public CreateDoctorJPanel(Person person,JPanel Upc) {
       initComponents();
//        this.userProcessContainer1 = new JPanel();
        this.userProcessContainer1 = Upc;
        this.person=person;
        addVerifiers();
    }
     private void addVerifiers() {
        InputVerifier stringVerifier = new MyStringVerifier();
        patientIDJTextField.setInputVerifier(stringVerifier);
        primaryDocNameJTextField.setInputVerifier(stringVerifier);
        
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
        primaryDocNameJTextField = new javax.swing.JTextField();
        addPatientJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientIDJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primaryDocNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryDocNameJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(primaryDocNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 150, -1));

        addPatientJButton.setBackground(new java.awt.Color(0, 102, 102));
        addPatientJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addPatientJButton.setForeground(new java.awt.Color(255, 255, 255));
        addPatientJButton.setText("Add Doctor");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 130, 39));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 450, -1));

        patientIDJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientIDJLabel.setForeground(new java.awt.Color(242, 242, 242));
        patientIDJLabel.setText("Doctor ID:");
        jPanel1.add(patientIDJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        primaryDocNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        primaryDocNameJLabel.setForeground(new java.awt.Color(242, 242, 242));
        primaryDocNameJLabel.setText("Patient Assigned:");
        jPanel1.add(primaryDocNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));
        jPanel1.add(patientIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 150, -1));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInteface/Patient/pexels-vidal-balielo-jr-3376790.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1, 1390, 1090));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void primaryDocNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryDocNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primaryDocNameJTextFieldActionPerformed

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput())
        {
            Doctor doctor = new Doctor();
            doctor.setDoctorID(patientIDJTextField.getText());
            doctor.setPrimaryDoctorName(primaryDocNameJTextField.getText());

            //Adding Patient to Person
            doctor.setDoctor(doctor);
            JOptionPane.showMessageDialog(this, "Doctor added!!", "Update",
                JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        private void clearFields(){
    
        patientIDJTextField.setText("");
        primaryDocNameJTextField.setText("");
        
    }
    private Boolean checkBlankInput()
    {
        if(patientIDJTextField.getText().length()==0
                ||primaryDocNameJTextField.getText().length()==0
                )
        {
            return false;
        }
        else{
            return true;
        }
    }//GEN-LAST:event_addPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer1.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer1.getLayout();
        layout.previous(userProcessContainer1);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField primaryDocNameJTextField;
    // End of variables declaration//GEN-END:variables
}