// Added the view details, with the image preview. //Ibtissam 2012-12-30

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.sql.Blob;


public class ViewDetails extends javax.swing.JFrame {
    Connection connection;
    Statement statement;
    ResultSet rset;
    String query;
    private String name;
    private String email;
    private String phone_number;
    String bookId, sellerId;

    
  static public BufferedImage linearResizeBi(BufferedImage origin, int width, int height) {
        
        BufferedImage resizedImage = null;
        resizedImage = new BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        float xScale = (float)width / origin.getWidth();
        float yScale = (float)height / origin.getHeight();
        AffineTransform at = AffineTransform.getScaleInstance(xScale,yScale);
        g.drawRenderedImage(origin,at);
        g.dispose(); 
        return resizedImage; 
    }
    
    public ViewDetails(String bookId, String sellerId) throws SQLException, IOException, NullPointerException {
        initComponents();
        this.bookId = bookId;
        this.sellerId = sellerId;
        Boolean ImageExist = false;
        String title = null, author = null, condition = null, ISBN = null;
        int price = 0;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        String query = "SELECT title, author, bookCondition, ISBN, price, bookID, image FROM books WHERE bookID = " + "'" + bookId + "'";
        ResultSet rset = statement.executeQuery(query);
        while(rset.next()){
            title = rset.getString("title");
            author = rset.getString("author");
            condition = rset.getString("bookCondition");
            ISBN = rset.getString("ISBN");
            price = rset.getInt("price");
            Blob ablob;
            ablob = rset.getBlob("image");
            if(ablob != null) { 
                BufferedImage im = ImageIO.read(rset.getBinaryStream(7));
                im =linearResizeBi(im,250,350);
                image1 = new ImageIcon(im);
                labelImage.setIcon(image1);
            }
            else{ 
                labelImage.setText("Image not available"); 
            }    
        }
        
        String query2 = "SELECT name, email, phone_number FROM sellers WHERE sellerId = " + "'" + sellerId + "'";
        Statement statement2 = connection.createStatement();
        rset = statement2.executeQuery(query2);
        while(rset.next()){
            name = rset.getString("name");
            email = rset.getString("email");
            phone_number = rset.getString("phone_number");
          }
        
        detailsTitle.setText(title);
        detailAuthor.setText(author);
        detailISBN.setText(ISBN);
        detailcond.setText(condition);
        detailPrice.setText(String.valueOf(price));
        detailSellerid.setText(sellerId);
        detailBookid.setText(bookId);
        detailSellername.setText(name);
        detailSelleremail.setText(email);
        detailSellerphone.setText(phone_number);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsTitle = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        labelisbn = new javax.swing.JLabel();
        detailAuthor = new javax.swing.JLabel();
        detailISBN = new javax.swing.JLabel();
        labelISBN = new javax.swing.JLabel();
        detailcond = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        detailPrice = new javax.swing.JLabel();
        labelUpload = new javax.swing.JLabel();
        detailSellerid = new javax.swing.JLabel();
        labelSellername = new javax.swing.JLabel();
        detailSellername = new javax.swing.JLabel();
        labelSelleremail = new javax.swing.JLabel();
        detailSelleremail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        detailisbn = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        detailSellerphone = new javax.swing.JLabel();
        labelbookid = new javax.swing.JLabel();
        detailBookid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Offer Detail");
        setMaximumSize(new java.awt.Dimension(650, 350));
        setPreferredSize(new java.awt.Dimension(650, 400));
        setResizable(false);

        detailsTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        detailsTitle.setForeground(new java.awt.Color(0, 0, 204));
        detailsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailsTitle.setText("TITLE");
        detailsTitle.setToolTipText("");
        detailsTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelAuthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAuthor.setText("Author:");

        labelisbn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelisbn.setText("ISBN:");

        detailAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailAuthor.setText("Test");

        detailISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailISBN.setText("Test");

        labelISBN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelISBN.setText("Condition:");

        detailcond.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailcond.setText("Test");

        labelPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(204, 0, 51));
        labelPrice.setText("Price:");

        detailPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        detailPrice.setForeground(new java.awt.Color(204, 0, 51));
        detailPrice.setText("Test");

        labelUpload.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUpload.setForeground(new java.awt.Color(204, 0, 51));
        labelUpload.setText("Uploaded by:");

        detailSellerid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailSellerid.setForeground(new java.awt.Color(204, 0, 51));
        detailSellerid.setText("Test");

        labelSellername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSellername.setText("Sellers name:");

        detailSellername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailSellername.setText("Test");

        labelSelleremail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSelleremail.setText("Sellers email:");

        detailSelleremail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailSelleremail.setText("Test");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("SEK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contact Detail");

        labelImage.setText("jLabel3");
        labelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sellers phone:");

        detailSellerphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailSellerphone.setText("Test");

        labelbookid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelbookid.setForeground(new java.awt.Color(204, 0, 51));
        labelbookid.setText("Book Ref:");

        detailBookid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailBookid.setForeground(new java.awt.Color(204, 0, 51));
        detailBookid.setText("Test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(detailcond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(detailISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detailSellerid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(labelbookid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(detailBookid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(detailSellerphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailisbn)
                            .addComponent(jSeparator2))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSellername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelSelleremail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(detailSelleremail, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(detailSellername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(detailPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1))
                                .addComponent(labelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(detailsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(detailsTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAuthor)
                    .addComponent(detailAuthor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelisbn)
                            .addComponent(detailISBN))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelISBN)
                            .addComponent(detailcond))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrice)
                            .addComponent(jLabel1)
                            .addComponent(detailPrice))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUpload)
                            .addComponent(detailSellerid)
                            .addComponent(labelbookid)
                            .addComponent(detailBookid))
                        .addGap(15, 15, 15)
                        .addComponent(detailisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSellername)
                            .addComponent(detailSellername))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSelleremail)
                            .addComponent(detailSelleremail))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(detailSellerphone))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailAuthor;
    private javax.swing.JLabel detailBookid;
    private javax.swing.JLabel detailISBN;
    private javax.swing.JLabel detailPrice;
    private javax.swing.JLabel detailSelleremail;
    private javax.swing.JLabel detailSellerid;
    private javax.swing.JLabel detailSellername;
    private javax.swing.JLabel detailSellerphone;
    private javax.swing.JLabel detailcond;
    private javax.swing.JSeparator detailisbn;
    private javax.swing.JLabel detailsTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelSelleremail;
    private javax.swing.JLabel labelSellername;
    private javax.swing.JLabel labelUpload;
    private javax.swing.JLabel labelbookid;
    private javax.swing.JLabel labelisbn;
    // End of variables declaration//GEN-END:variables

private ImageIcon image1 = null;
byte[] imgdb = null;
BufferedImage im = null;

}
