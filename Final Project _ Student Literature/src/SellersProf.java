//GUI developed by Malcolm Kente.
// Md. Zubayer Alam: Wrote the constructor of this class and method to upload book without picture.
// Removed the buttons linking to GUL etc since they are not needed on this page. //Ibtissam 2013-12-28
// Changed the SQL-statement inserting a new book, so it also brings in the sellerID. //Ibtissam 2013-12-28
// Added filechooser. //Ibtissam 2013-12-28
// Added the upload image function. //Ibtissam 2013-12-29
// Grouped together the radio-buttons for selecting book-condition //Ibtissam 2013-12-29
// Added the edit-user class //Ibtissam 2013-12-29
// Added the changepassword class. //Ibtissam 2013-12-30

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SellersProf extends javax.swing.JFrame {
    
    String [] info;
    ArrayList<String> offer;
    String bookId, query;
    Connection connection;
    Statement statement;        
    ResultSet rset;
    
    
    public SellersProf(String[] info, ArrayList<String> offer) {
        initComponents();
        this.info = info;
        this.offer = offer;
        try{
            int i = Integer.parseInt(info[4]);
            if(i==0){
                jButton4.setVisible(false);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        Name.setText(info[0]);
        Telefon.setText("Phone:  " + info[1]);
        Mail.setText("Email:  " + info[2]);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup3 = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        basicinfoPanel = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Telefon = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        uploadPanel = new javax.swing.JPanel();
        bookName = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        authorName = new javax.swing.JLabel();
        authorField = new javax.swing.JTextField();
        isbnName = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        priceName = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        conditionName = new javax.swing.JLabel();
        Good = new javax.swing.JRadioButton();
        Fair = new javax.swing.JRadioButton();
        Poor = new javax.swing.JRadioButton();
        imageUpload = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        ImageChooser = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setTitle("My Page_Student Literature");
        setPreferredSize(new java.awt.Dimension(603, 568));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basicinfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Name.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        Name.setText("Name (John Doe)");
        Name.setToolTipText("");

        Telefon.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        Telefon.setText("Tel (070-xxx-xxxx)");
        Telefon.setToolTipText("");

        Mail.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        Mail.setText("E-mail (john.doe@aegis.se)");
        Mail.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jButton2.setText("Change password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jButton3.setText("Edit info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jButton1.setText("View my offers");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("ADMIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basicinfoPanelLayout = new javax.swing.GroupLayout(basicinfoPanel);
        basicinfoPanel.setLayout(basicinfoPanelLayout);
        basicinfoPanelLayout.setHorizontalGroup(
            basicinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicinfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(basicinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        basicinfoPanelLayout.setVerticalGroup(
            basicinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicinfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(basicinfoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(basicinfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 540, 150));

        uploadPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPLOAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 24), java.awt.Color.black)); // NOI18N
        uploadPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        bookName.setText("Book Name: *");
        bookName.setToolTipText("");
        uploadPanel.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 41, -1, 27));
        uploadPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 44, 130, -1));

        authorName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        authorName.setText("Author: *");
        authorName.setToolTipText("");
        uploadPanel.add(authorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 81, -1, -1));
        uploadPanel.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 78, 130, -1));

        isbnName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        isbnName.setText("ISBN: *");
        uploadPanel.add(isbnName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 112, -1, -1));
        uploadPanel.add(isbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 109, 130, -1));

        priceName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        priceName.setText("Price: *");
        uploadPanel.add(priceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 143, -1, -1));
        uploadPanel.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 140, 90, -1));

        conditionName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        conditionName.setText("Condition:");
        conditionName.setToolTipText("");
        uploadPanel.add(conditionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 172, -1, -1));

        buttonGroup3.add(Good);
        Good.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        Good.setText("Good");
        uploadPanel.add(Good, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 172, -1, 15));

        buttonGroup3.add(Fair);
        Fair.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        Fair.setText("Fair");
        uploadPanel.add(Fair, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 192, -1, 15));

        buttonGroup3.add(Poor);
        Poor.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        Poor.setText("Poor");
        uploadPanel.add(Poor, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 212, -1, 15));

        imageUpload.setBackground(new java.awt.Color(255, 255, 255));
        imageUpload.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout imageUploadLayout = new javax.swing.GroupLayout(imageUpload);
        imageUpload.setLayout(imageUploadLayout);
        imageUploadLayout.setHorizontalGroup(
            imageUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        imageUploadLayout.setVerticalGroup(
            imageUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        uploadPanel.add(imageUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 41, -1, 119));

        imageLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        imageLabel.setText("Image:");
        uploadPanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 47, -1, -1));

        ImageChooser.setText("Choose image...");
        ImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageChooserActionPerformed(evt);
            }
        });
        uploadPanel.add(ImageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        uploadButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.setToolTipText("");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        uploadPanel.add(uploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel1.setText("SEK");
        uploadPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setText("* marked fields are mandatory to fill");
        uploadPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        getContentPane().add(uploadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 540, 240));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AEGIS APP Snippet non-log.png"))); // NOI18N
        BG.setText("jLabel2");
        BG.setPreferredSize(new java.awt.Dimension(600, 569));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SellersOffers sellOffers = new SellersOffers(offer, info[3]);
        sellOffers.setVisible(true);
        sellOffers.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        try{
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
        
            String title = "'"+nameField.getText()+"'";
            String author = "'"+authorField.getText()+"'";
            String isbn = "'"+isbnField.getText()+"'";
        
            String condition = "";
       
            if(Good.isSelected()){
                condition = "Good";   
            }
            else if(Fair.isSelected()){
                condition = "Fair";
            }
            else if(Poor.isSelected()){
                condition = "Poor";
            }
            else{
                condition = "";
            }
        
            String  id = generateBookId();
       
            ArrayList <String> inputList = new ArrayList<String>();
            inputList.add(nameField.getText());
            inputList.add(authorField.getText());
            inputList.add(isbnField.getText());
            inputList.add(priceField.getText());
            inputList.add(condition);
               
            boolean check = true;
            for(int i=0; i<inputList.size(); i++){
                if(inputList.get(i).matches("")){
                    check = false; 
                }        
            }
        
            if(check==true){
                try{
                    int price = Integer.parseInt(priceField.getText());
                    
                    query_insert = "INSERT INTO books (title, author, bookCondition, ISBN, price, bookID, sellerID, image) VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement pst=connection.prepareStatement(query_insert);
                    pst.setString(1, nameField.getText());
                    pst.setString(2, authorField.getText());
                    pst.setString(3, condition);
                    pst.setString(4, isbnField.getText());
                    pst.setInt(5, price);
                    pst.setString(6, id);
                    pst.setString(7, info[3]);
                    pst.setBytes(8, book_image);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Your offer is uploaded", "Message", JOptionPane.PLAIN_MESSAGE);
                    nameField.setText("");
                    authorField.setText("");
                    isbnField.setText("");
                    priceField.setText("");
                    Good.setSelected(false);
                    Fair.setSelected(false);
                    Poor.setSelected(false);
                    book_image = null;
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Write price correctly as a whole number " +query_insert, "Error", JOptionPane.PLAIN_MESSAGE);
                    System.out.println(e);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "You must fill all the required field", "Error" +query_insert, JOptionPane.PLAIN_MESSAGE);
            }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
           
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void ImageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageChooserActionPerformed
     JFileChooser chooser = new JFileChooser();
     chooser.showOpenDialog(null);
     File f = chooser.getSelectedFile();
     filename = f.getAbsolutePath();
     
     try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        for(int readNum; (readNum = fis.read(buf)) !=-1; ){
           bos.write(buf,0,readNum); 
            
        }
        book_image = bos.toByteArray();  
        
     }
     catch(Exception e) {
         System.out.println(e);
         JOptionPane.showMessageDialog(null, e);
     }
    
    }//GEN-LAST:event_ImageChooserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      EditUser editinfo = null;
        try {
            editinfo = new EditUser(info[3]);
        } catch (SQLException ex) {
            Logger.getLogger(SellersProf.class.getName()).log(Level.SEVERE, null, ex);
        }
      editinfo.setVisible(true);
      editinfo.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ChangePassword changepass = new ChangePassword(info[3]);
        changepass.setVisible(true);
        changepass.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminFrame adminFrame = new AdminFrame();
        adminFrame.setVisible(true);
       adminFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private String generateBookId() throws SQLException{
        Connection connection2 = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        Statement statement2 = connection2.createStatement();
        String query2 = "Select bookID FROM books";
        rset = statement2.executeQuery(query2);
        
        String bookid = "";
        ArrayList<String> bookIdList = new ArrayList<String>();
        while(rset.next()){
            bookIdList.add(rset.getString("bookID"));
        }
        
        boolean match = true;
        while(match == true){
            bookid = BookId();
            for(int i=0; i<bookIdList.size(); i++){
                if(bookIdList.get(i).matches(bookid)){
                    match = true;
                }
                else{
                    match = false;
                }
            }
        }  
        return bookid;
    }
    
    private String BookId(){
         bookId = "";
        Random rand = new Random();
        for(int i=0; i<7; i++){
            if(i<3){
                int random = rand.nextInt(26) + (byte)'A';
                bookId = bookId + (char)random;
            }
            else{
                int random = rand.nextInt(10);
                bookId = bookId + Integer.toString(random);
            }
        }
        return bookId;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JRadioButton Fair;
    private javax.swing.JRadioButton Good;
    private javax.swing.JButton ImageChooser;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Name;
    private javax.swing.JRadioButton Poor;
    private javax.swing.JLabel Telefon;
    private javax.swing.JTextField authorField;
    private javax.swing.JLabel authorName;
    private javax.swing.JPanel basicinfoPanel;
    private javax.swing.JLabel bookName;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel conditionName;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imageUpload;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceName;
    private javax.swing.JButton uploadButton;
    private javax.swing.JPanel uploadPanel;
    // End of variables declaration//GEN-END:variables

String filename = null;
int s = 0;
byte[] book_image = null;
String query_insert = "";
}
