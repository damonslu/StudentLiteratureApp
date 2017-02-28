//Ilya Golikov coded and developed GUI. 
//Md. Zubayer Alam: Wrote All the methods in this class.
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

// Removed the extra buttons to GUL/UNI on registerpage, since its already on the main page //Ibtissam 2013-12-15
// Expanded the "Terms And Conditions"-button so all the text is visible //Ibtissam 2013-12-15
// Moved the text "Registration" to left-tabbed, since it looks kind of wierd having it centered. //Ibtissam 2013-12-15
// If username is available the button now gets green. //Ibtissam 2013-12-28
// If username is not available the button now gets red. //Ibtissam 2013-12-28
// Fixed SQL-query when registering new user, to fit the new database model. //Ibtissam 2013-12-28

public class Registration extends javax.swing.JFrame {
    
    Connection connection;
    Statement statement;
    ResultSet rset;
    
    String qu;
    
    public Registration() {
        initComponents();
            
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e){  
            MainClass.searchResult.setEnabled(true);  
            dispose();
            }
        }); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        Terms = new javax.swing.JButton();
        registrationLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        repeatLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        mandatorystatementLabel = new javax.swing.JLabel();
        TermsLabel = new javax.swing.JLabel();
        agreeLabel = new javax.swing.JLabel();
        agreeCheckBox = new javax.swing.JCheckBox();
        doneButton = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        reppassField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("Check availability");

        jPasswordField2.setText("jPasswordField2");

        jPasswordField3.setText("jPasswordField3");

        setTitle("Registration_Student Literature");
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Terms.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Terms.setText("Terms & Conditions");
        Terms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermsActionPerformed(evt);
            }
        });
        getContentPane().add(Terms, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 160, -1));

        registrationLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        registrationLabel.setText("REGISTRATION");
        registrationLabel.setToolTipText("");
        getContentPane().add(registrationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 90, 150, -1));

        nameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        nameLabel.setText("Name: ");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        telephoneLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        telephoneLabel.setText("Telephone number:");
        getContentPane().add(telephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        emailLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        emailLabel.setText("E-mail:");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        passwordLabel.setText("Password: ");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, 20));

        repeatLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        repeatLabel.setText("Repeat Password:");
        getContentPane().add(repeatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        nameField.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, -1));

        telephoneField.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        getContentPane().add(telephoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 170, -1));

        emailField.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 170, -1));

        mandatorystatementLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        mandatorystatementLabel.setForeground(new java.awt.Color(255, 51, 51));
        mandatorystatementLabel.setText("* All fields are mandatory!");
        getContentPane().add(mandatorystatementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        TermsLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        TermsLabel.setForeground(new java.awt.Color(204, 0, 0));
        TermsLabel.setText("READ TERMS AND CONDITIONS");
        getContentPane().add(TermsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        agreeLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        agreeLabel.setText("By clicking ' I agree ' you agree to these Terms & Conditions");
        getContentPane().add(agreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        agreeCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        agreeCheckBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        agreeCheckBox.setText(" I Agree");
        agreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(agreeCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        doneButton.setBackground(new java.awt.Color(255, 255, 255));
        doneButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        doneButton.setText("Register");
        doneButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(3, 67, 69)));
        doneButton.setEnabled(false);
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 60, 20));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("User name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 170, 20));

        jButton2.setText("Available?"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 120, 20));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, -1));
        getContentPane().add(reppassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AEGIS APP Snippet non-log.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        if(agreeCheckBox.isSelected()){
            doneButton.setEnabled(true);
        }
        else{
            doneButton.setEnabled(false);
        }
    }//GEN-LAST:event_agreeCheckBoxActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
        
            if(checkAvailability() == true){
                if (passField.getText().matches(reppassField.getText())){
                    ArrayList <String> inputList = new ArrayList<String>();
                    inputList.add(nameField.getText());
                    inputList.add(emailField.getText());
                    inputList.add(passField.getText());
                    inputList.add(telephoneField.getText());
                    inputList.add(jTextField1.getText());
            
                    String values = "";
                    boolean check = true;
                    for(int i=0; i<inputList.size(); i++){
                        if(i!=inputList.size()-1){
                            values= values + "'" + inputList.get(i) + "'" +", ";
                        }
                        else{
                            values= values + "'" + inputList.get(i) + "'";
                        }
                        if(inputList.get(i).matches("")){
                            check = false; 
                        }
                    }
            
                    if(check==true){
                        
                        qu = "INSERT INTO sellers (name, email, password, phone_number, sellerID) VALUES (" + values + ")";
                        statement.executeUpdate(qu);
                        JOptionPane.showMessageDialog(null, "You are now registered", "Message", JOptionPane.PLAIN_MESSAGE);
                        nameField.setText("");
                        emailField.setText("");
                        passField.setText("");
                        reppassField.setText("");
                        telephoneField.setText("");
                        jTextField1.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "You must fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please select the password correctly", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        
            else{
               JOptionPane.showMessageDialog(null, "User name is not available", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_doneButtonActionPerformed
// ibti
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if(!jTextField1.getText().matches("")){
                if(checkAvailability() == true){
                    jButton2.setText("Available");
                    jButton2.setBackground(new Color(0, 204, 51));
                }
                else{
                    jButton2.setText("Not available");
                    jButton2.setBackground(new Color(204, 0, 0));
                }
            }
            else{
               JOptionPane.showMessageDialog(null, "You should type a User name", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TermsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermsActionPerformed
        Liability liability = new Liability();
        liability.setVisible(true);
        liability.setLocationRelativeTo(null);
    }//GEN-LAST:event_TermsActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
        // Fixed password-field in registerpage, so the password is not shown. Only asterix. //Ibtissam
    }//GEN-LAST:event_passFieldActionPerformed

    private boolean checkAvailability() throws SQLException{
        boolean availability = true;
        
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        
        qu = "SELECT sellerID FROM sellers";
        rset = statement.executeQuery(qu);
        
        while(rset.next()){
            if ((jTextField1.getText()).matches(rset.getString("sellerID"))){
                availability = false;
            }
        }
        return availability;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Terms;
    private javax.swing.JLabel TermsLabel;
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JLabel agreeLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mandatorystatementLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JLabel repeatLabel;
    private javax.swing.JPasswordField reppassField;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephoneLabel;
    // End of variables declaration//GEN-END:variables
}
