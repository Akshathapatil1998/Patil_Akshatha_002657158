/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package userInteface.Patient;


import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.MyStringVerifier;
import model.Patient;
import model.Person;
import model.PersonDirectory;

public class ManagePatientsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form managePatientsJJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public ManagePatientsJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory= personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        InputVerifier stringVerifier = new MyStringVerifier();
        searchBoxJTextField.setInputVerifier(stringVerifier);
    }
    
    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[4];
            row[0] = person;
            row[1]= person.getAge();
            row[3]= person.getPersoncity();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewPatientJButton = new javax.swing.JButton();
        deletePatientJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        searchPatientJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        createPatientJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Patient ID", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);
        if (viewPersonsJTable.getColumnModel().getColumnCount() > 0) {
            viewPersonsJTable.getColumnModel().getColumn(0).setResizable(false);
            viewPersonsJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1020, 170));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 482, -1));

        viewPatientJButton.setBackground(new java.awt.Color(0, 102, 102));
        viewPatientJButton.setForeground(new java.awt.Color(255, 255, 255));
        viewPatientJButton.setText("View Patient");
        viewPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientJButtonActionPerformed(evt);
            }
        });
        add(viewPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 120, 30));

        deletePatientJButton.setBackground(new java.awt.Color(0, 102, 102));
        deletePatientJButton.setForeground(new java.awt.Color(255, 255, 255));
        deletePatientJButton.setText("Delete Patient");
        deletePatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientJButtonActionPerformed(evt);
            }
        });
        add(deletePatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, 30));
        add(searchBoxJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 190, 30));

        searchPatientJButton.setBackground(new java.awt.Color(0, 102, 102));
        searchPatientJButton.setForeground(new java.awt.Color(255, 255, 255));
        searchPatientJButton.setText("Search Patient");
        searchPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientJButtonActionPerformed(evt);
            }
        });
        add(searchPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 120, 30));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 30));

        refreshJButton.setBackground(new java.awt.Color(0, 102, 102));
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 100, 30));

        createPatientJButton.setBackground(new java.awt.Color(0, 102, 102));
        createPatientJButton.setForeground(new java.awt.Color(255, 255, 255));
        createPatientJButton.setText("Create Patient");
        createPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientJButtonActionPerformed(evt);
            }
        });
        add(createPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInteface/Patient/1282794.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ViewUpdatePatientDetailsJPanel vupdJPanel=
                    new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.FALSE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                    + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_viewPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deletePatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        Patient patient=person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created. Cannot delete",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            person.setPatient(null);
            populatePatientsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_deletePatientJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void searchPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPatients;
        searchPatients=personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientJButtonActionPerformed

    private void createPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Paient already exists.","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        CreatePatientJPanel cpJPanel= new CreatePatientJPanel(userProcessContainer, person);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPatientJButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createPatientJButton;
    private javax.swing.JButton deletePatientJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPatientJButton;
    private javax.swing.JButton viewPatientJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}
