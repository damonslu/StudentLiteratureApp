//GUI coded and developed by Malcolm Kente
// Md. Zubayer Alam: Wrote the constructor and all methods in this class.
// Removed all the buttons, since its not needed on this page. //Ibtissam 2013-12-28
// Removed the horisontal scrollbar since its not needed. //Ibtissam 2013-12-28
// Set the vertical scrollbar to only show if needed. //Ibtissam 2013-12-28
// loginButtonActionPerformed:Looks like the offers are hardcoded in the application and doesnt retrieve it from the database. Corrected it after being puzzeled for a while.//Ibtissam 2013-12-28


import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


// ibtissam adjustments remioving and adding
public class SellersOffers extends javax.swing.JFrame {

    ArrayList<String> offer;
    String sellerId;
    Connection connection;
    Statement statement;
    ResultSet rset;
    String qu;
    
    public SellersOffers(ArrayList<String> offer, String sellerId) {
        initComponents();
        this.offer = offer;
        this.sellerId = sellerId;
        myoffersScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        myoffersScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        BG = new javax.swing.JLabel();

        setTitle("My Offers_Student Literature");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("View All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 83, 80, 30));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 87, 60, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 20));

        jLabel1.setText("Search by Book Ref#");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));

        myoffersScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "My Offers", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        myoffersScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        myoffersScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        myoffersScrollPane.setHorizontalScrollBar(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        myoffersScrollPane.setViewportView(jPanel1);

        getContentPane().add(myoffersScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 450, 350));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AEGIS APP Snippet non-log.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jPanel1.removeAll();
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            jPanel1.setLayout(new GridLayout((offer.size())+1,0,0,0));
            
            qu = "SELECT * FROM books WHERE sellerID = '" + sellerId + "'";
            rset = statement.executeQuery(qu);
            while(rset.next()){
                String title = rset.getString("title");
                String author = rset.getString("author");
                String isbn = rset.getString("ISBN");
                int price = rset.getInt("price");
                String bookId = rset.getString("bookID");
           
                ResultPanel offpan = new ResultPanel(title, author, isbn, price, bookId, sellerId);
                jPanel1.add(offpan);
            }  
            
             jPanel1.updateUI();
        } 
        catch (SQLException ex) {
            Logger.getLogger(SellersOffers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            jPanel1.removeAll();
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            jPanel1.setLayout(new GridLayout(2,0,0,0));
    
            qu = "SELECT * FROM books WHERE bookID = '" + jTextField1.getText() + "' AND sellerID = '" + sellerId + "'";
            rset = statement.executeQuery(qu);
            while(rset.next()){
                String title = rset.getString("title");
                String author = rset.getString("author");
                String isbn = rset.getString("ISBN");
                int price = rset.getInt("price");
                String bookId = rset.getString("bookID");
           
                ResultPanel offpan = new ResultPanel(title, author, isbn, price, bookId, sellerId);
                jPanel1.add(offpan);
            }              
            jPanel1.updateUI();
        } 
        catch (SQLException ex) {
            Logger.getLogger(SellersOffers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane myoffersScrollPane;
    // End of variables declaration//GEN-END:variables
}
