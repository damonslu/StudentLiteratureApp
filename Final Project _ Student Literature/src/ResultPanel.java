// Md. Zubayer Alam: Created this class, designed GUI, wrote all the methods and the constructor.
import java.io.IOException;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// Added Sellername in the design and code. //Ibtissam 2013-12-27
// Added Email in the design and code. //Ibtissam 2013-12-28 
// Fixed the view details //Ibtissam 2013-12-30

public class ResultPanel extends javax.swing.JPanel {

    String title, author, isbn, condition, bookId, sellerId, email;
    int price;
    Connection connection;
    Statement statement;
    ResultSet rset;
    String qu;
  
    public ResultPanel(String title, String author, String isbn, String condition, int price, String bookId, String sellerId) throws SQLException {
        initComponents();
        deleteButton.setVisible(false);
        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.condition = condition;
        this.price = price;
        this.bookId = bookId;
        this.sellerId = sellerId;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        qu = "SELECT email FROM sellers WHERE sellerID = '" + sellerId + "'";
        rset = statement.executeQuery(qu);
            while (rset.next()){
                this.email = rset.getString("email");
            }
 
      
        titleLabel.setText(this.title);
        authorLabel.setText(this.author);
        isbnLabel.setText(this.isbn);
        priceLabel.setText(Integer.toString(this.price)); 
        bookidLabel.setText(this.bookId);
        selleridLebel.setText(this.sellerId);
        emailLabel.setText(this.email);
    }
     public ResultPanel(String title, String author, String isbn, int price, String bookId, String sellerId) throws SQLException {
        initComponents();
        viewButton.setVisible(false);
        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.bookId = bookId;
        this.sellerId = sellerId;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        qu = "SELECT email FROM sellers WHERE sellerID = '" + sellerId + "'";
        rset = statement.executeQuery(qu);
            while (rset.next()){
                this.email = rset.getString("email");
            }
      
        titleLabel.setText(this.title);
        authorLabel.setText(this.author);
        isbnLabel.setText(this.isbn);
        priceLabel.setText(Integer.toString(this.price)); 
        bookidLabel.setText(this.bookId);
        selleridLebel.setText(this.sellerId);
        emailLabel.setText(email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        selleridLebel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bookidLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(450, 150));
        setMinimumSize(new java.awt.Dimension(450, 135));
        setPreferredSize(new java.awt.Dimension(450, 150));

        titleLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 153));
        titleLabel.setText(" ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("BY:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ISBN:");

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(204, 0, 0));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText(" ");

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewButton.setText("View Detail");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("SEK");

        authorLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        authorLabel.setText(" ");

        isbnLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        isbnLabel.setText(" ");

        selleridLebel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selleridLebel.setText(" ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Seller:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Book Ref:");

        bookidLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bookidLabel.setForeground(new java.awt.Color(204, 0, 51));
        bookidLabel.setText(" ");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("E-mail:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selleridLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5))
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(authorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(isbnLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(priceLabel))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(selleridLebel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(bookidLabel))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        try { 
            ViewDetails viewdetails = new ViewDetails(bookId, sellerId);
            viewdetails.setVisible(true);
            viewdetails.setLocationRelativeTo(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete offer having book ref# " + bookId, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
                statement = connection.createStatement();
                qu = "DELETE FROM books WHERE bookId = '" + bookId +"'";
                statement.executeUpdate(qu);
                JOptionPane.showMessageDialog(null, "Your offer is deleted", "Message", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel bookidLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel selleridLebel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
