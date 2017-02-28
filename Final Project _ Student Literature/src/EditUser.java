// created EditUser windows, that will update the userinformation stored in the database. //Ibtissam 2013-12-29

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 public class EditUser extends javax.swing.JFrame {
    Connection connection;
    Statement statement;
    ResultSet rset;
    String query;
    String sellerId;
    /**
     * Creates new form EditUser
     */
    public EditUser(String sellerId) throws SQLException {
        initComponents();
        this.sellerId = sellerId;
        String Name = null; String Phone = null; String Username = null; String Email = null;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        String query = "SELECT name,email, phone_number FROM sellers WHERE sellerID = "+ "'" + sellerId + "'";
        ResultSet rset = statement.executeQuery(query);
        while(rset.next()){
            Username = sellerId;
            Name = rset.getString("name");
            Phone = rset.getString("phone_number");
            Email = rset.getString("email");
         }
        editName.setText(Name);
        changePhone.setText(Phone);
        changeUsername.setText(Username);
        changeEmail.setText(Email);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        editName = new javax.swing.JTextField();
        changePhone = new javax.swing.JTextField();
        changeUsername = new javax.swing.JTextField();
        changeNOT = new javax.swing.JLabel();
        changeEmail = new javax.swing.JTextField();
        changeCancel = new javax.swing.JButton();
        changeSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        registrationLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        registrationLabel.setText("EDIT USERPROFILE");
        registrationLabel.setToolTipText("");

        telephoneLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        telephoneLabel.setText("Telephone number:");

        emailLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        emailLabel.setText("E-mail:");

        nameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        nameLabel.setText("Name: ");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("User name");

        changeUsername.setEditable(false);

        changeNOT.setText("Cant be changed");

        changeCancel.setText("Cancel");
        changeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCancelActionPerformed(evt);
            }
        });

        changeSave.setText("Save");
        changeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(telephoneLabel)
                                    .addComponent(jLabel1))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(changePhone)
                                    .addComponent(changeUsername))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeNOT)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changeCancel)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(registrationLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel)
                                    .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telephoneLabel))
                            .addComponent(changePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeNOT)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeCancel)
                    .addComponent(changeSave))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCancelActionPerformed
        dispose(); 
    }//GEN-LAST:event_changeCancelActionPerformed

    private void changeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSaveActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
			String query_update = "UPDATE sellers SET name=?, phone_number=?, email=? WHERE sellerID = " + "'" + sellerId + "'";
			java.sql.PreparedStatement pst=connection.prepareStatement(query_update);
			pst.setString(1, editName.getText());
			pst.setString(2, changePhone.getText());
			pst.setString(3, changeEmail.getText());
			pst.execute(); }

			catch(Exception e){
                         System.out.println(e);
                }
	
dispose(); 
    }//GEN-LAST:event_changeSaveActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeCancel;
    private javax.swing.JTextField changeEmail;
    private javax.swing.JLabel changeNOT;
    private javax.swing.JTextField changePhone;
    private javax.swing.JButton changeSave;
    private javax.swing.JTextField changeUsername;
    private javax.swing.JTextField editName;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JLabel telephoneLabel;
    // End of variables declaration//GEN-END:variables
}