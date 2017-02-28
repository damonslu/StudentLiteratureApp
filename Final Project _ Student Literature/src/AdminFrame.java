//Md. Zubayer Alam: Created this class, GUI, all methods.
import java.sql.*;
import javax.swing.JOptionPane;


public class AdminFrame extends javax.swing.JFrame {

    Connection connection;
    Statement statement;
    ResultSet rset;
    String qu;
    
    public AdminFrame() {
        initComponents();
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton6.setVisible(false);
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
        jLabel15.setText("");
        jLabel16.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 350));
        setResizable(false);

        jLabel1.setText("Search by book ID");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jButton2.setText("Delete this offer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jButton2)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Offer", jPanel1);

        jLabel6.setText("Search by seller ID");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("jLabel2");
        jLabel7.setToolTipText("");

        jLabel8.setText("jLabel3");

        jLabel9.setText("jLabel4");

        jLabel10.setText("jLabel5");

        jButton4.setText("Delete this seller");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addComponent(jButton4)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Seller", null, jPanel2, "");

        jLabel11.setText("Search by seller ID");

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setText("jLabel2");
        jLabel12.setToolTipText("");

        jLabel13.setText("jLabel3");

        jLabel14.setText("jLabel4");

        jLabel15.setText("jLabel5");

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel16.setText("jLabel17");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(50, 50, 50))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jButton6))
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(30, 30, 30)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Add/ Remove Admin", null, jPanel3, "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            
            qu = "SELECT bookID FROM books";
            rset = statement.executeQuery(qu);
            boolean b = false;
            while(rset.next()){
                if(rset.getString("bookID").equals(jTextField1.getText())){
                    b = true;
                }
            }
            if(b == true){
                qu = "SELECT title, author, sellerID FROM books WHERE bookID = " + "'" + jTextField1.getText() + "'";
                rset = statement.executeQuery(qu);
                jButton2.setVisible(true);
                while(rset.next()){
                    jLabel2.setText("Book ID:  " + jTextField1.getText());
                    jLabel3.setText("Title:  " + rset.getString("title"));
                    jLabel4.setText("Author:  " + rset.getString("author"));
                    jLabel5.setText("Uploaded by:  " + rset.getString("SellerID"));
                }   
            }
            else{
                jButton2.setVisible(false);
                jLabel2.setText("No match found");
                jLabel3.setText("");
                jLabel4.setText("");
                jLabel5.setText("");
            }
        }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete book " + jTextField1.getText() + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
                statement = connection.createStatement();
                qu = "DELETE FROM books WHERE bookID = " + "'" + jTextField1.getText() + "'";
                statement.executeUpdate(qu);
                jButton2.setVisible(false);
                jLabel2.setText("Entry is deleted");
                jLabel3.setText("");
                jLabel4.setText("");
                jLabel5.setText("");
            }       
        }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            qu = "SELECT sellerID FROM sellers";
            rset = statement.executeQuery(qu);
            boolean b = false;
            while(rset.next()){
                if(rset.getString("sellerID").equals(jTextField2.getText())){
                    b = true;
                }
            }
            if(b == true){
                qu = "SELECT name, email, phone_number FROM sellers WHERE sellerID = " + "'"+jTextField2.getText()+"'";
                rset = statement.executeQuery(qu);
                jButton4.setVisible(true);
                while(rset.next()){
                    jLabel7.setText("Seller ID:  " + jTextField2.getText());
                    jLabel8.setText("Name:  " + rset.getString("name"));
                    jLabel9.setText("Email:  " + rset.getString("email"));
                    jLabel10.setText("Phone:  " + rset.getString("phone_number"));
                } 
            }
            else{
                jButton4.setVisible(false);
                jLabel7.setText("No match found");
                jLabel8.setText("");
                jLabel9.setText("");
                jLabel10.setText("");
            }
        
        }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete seller " + jTextField2.getText() + "? It will also delete all offers of this seller", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
                statement = connection.createStatement();
                qu = "DELETE FROM sellers WHERE sellerID = " + "'" + jTextField2.getText() + "'";
                statement.executeUpdate(qu);
                qu = "DELETE FROM books WHERE sellerID = " + "'" + jTextField2.getText() + "'";
                statement.executeUpdate(qu);
                jButton4.setVisible(false);
                jLabel7.setText("This seller and all of his/her offers are deleted");
                jLabel8.setText("");
                jLabel9.setText("");
                jLabel10.setText("");
            }
        }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            qu = "SELECT sellerID FROM sellers";
            rset = statement.executeQuery(qu);
            boolean b = false;
            while(rset.next()){
                if(rset.getString("sellerID").equals(jTextField3.getText())){
                    b = true;
                }
            }
            if(b == true){
                qu = "SELECT name, email, phone_number, admin FROM sellers WHERE sellerID = " + "'"+jTextField3.getText()+"'";
                rset = statement.executeQuery(qu);
                
                while(rset.next()){
                    jLabel12.setText("Seller ID:  " + jTextField3.getText());
                    jLabel13.setText("Name:  " + rset.getString("name"));
                    jLabel14.setText("Email:  " + rset.getString("email"));
                    jLabel15.setText("Phone:  " + rset.getString("phone_number"));
                    if(rset.getInt("admin")==1){
                        jLabel16.setText("This user is an admin");
                        jButton6.setVisible(true);
                        jButton6.setText("Remove Admin");
                    }
                    else{
                        jLabel16.setText("This user is not an admin");
                        jButton6.setVisible(true);
                        jButton6.setText("Make Admin");
                    }
                } 
            }
            else{
                jButton6.setVisible(false);
                jLabel12.setText("No match found");
                jLabel13.setText("");
                jLabel14.setText("");
                jLabel15.setText("");
                jLabel16.setText("");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            qu = "SELECT admin FROM sellers WHERE sellerID = " + "'" + jTextField3.getText() + "'";
            rset = statement.executeQuery(qu);
            while(rset.next()){
                if(rset.getInt("admin")==1){
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you want to remove " + jTextField2.getText() + " from admin?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirm == JOptionPane.YES_OPTION){
                        qu = "UPDATE sellers SET admin = 0 WHERE sellerID = " + "'" + jTextField3.getText() + "'";
                        statement.executeUpdate(qu);
                        jButton6.setVisible(false);
                        jLabel12.setText("This user is now removed from admin");
                        jLabel13.setText("");
                        jLabel14.setText("");
                        jLabel15.setText("");
                        jLabel16.setText("");
                    }
                }
                else{
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you want to make " + jTextField2.getText() + " admin?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirm == JOptionPane.YES_OPTION){
                        qu = "UPDATE sellers SET admin = 1 WHERE sellerID = " + "'" + jTextField3.getText() + "'";
                        statement.executeUpdate(qu);
                        jButton6.setVisible(false);
                        jLabel12.setText("This user is now added as admin");
                        jLabel13.setText("");
                        jLabel14.setText("");
                        jLabel15.setText("");
                        jLabel16.setText("");
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}