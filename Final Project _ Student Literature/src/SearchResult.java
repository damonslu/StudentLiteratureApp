// GUI coded and devloped by Ilya Golikov.
// Md. Zubayer Alam: wrote action listener for login button, searchCriteria(JCombobox)

import java.awt.GridLayout;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

// Removed the horisontal scrollbar since is not needed.  //Ibtissam 2013-12-15
// Disabled the vertical scrollbar until search is applied //Ibtissam 2013-12-15
// Changed the login-interface slightly to fit the design better. //Ibtissam 2013-12-15
// Reorganized filters and the list. //Ibtissam 2013-12-15
// Clicking the Uni-button opens the default browser to Chalmers homepage. //Ibtissam 2013-12-16
// Added a menubar for closing the application and for registering a new user. //Ibtissam 2013-12-16
// Added Terms and condition under About-menu instead of the button. //Ibtissam 2013-12-16
// Added "About Us" under the About-menu, then removing the About-us button. //Ibtissam 2013-12-16. 
// Changed the mouse-cursor on the background to the default, instead of the text-cursor. //Ibtissam 2013-12-16
// Added which columns to select in the search-query. //Ibtissam 2013-12-27
// Created GetSeller-method for getting name of the seller, and then pass it to the searchresults //Ibtissam 2013-12-27
// Created NumberOfBooks-method for showing how many books are for sale //Ibtissam 2013-12-27
// Adjusted the windows-size, arranged the background logo //Ibtissam 2013-12-28
// Created GetSellerEmail-method for getting email of the seller, and then pass it to the searchresults. //Ibtissam 2013-12-28
// Created NumberOfUsers-method to get the numbers of users registered. //Ibtissam 2013-12-28
// Added line to pick up the user-id when logging in //Ibtissam 2013-12-28
// wrote the searchengine to use database-driven searchengine. //Ibtissam 2013-12-29
// Added the filters to the searchengine, so all the filters work. //Ibtissam 2013-12-29
// Added "sort-by", so you can sort the result by Title, Author or Price. //Ibtissam 2013-12-29
// Added a refresh-function to refresh the number of books and users. //Ibtissam 2013-12-29
// Created the viewdetails-button so it actually works. //Ibtissam 2013-12-30

public class SearchResult extends javax.swing.JFrame {

    Connection connection;
    Statement statement;
    ResultSet rset;
    String query;
    String criteria;
    
    //ibtissam
    public String NumberOfBooks() throws SQLException {
        String NumberOfBooks = null;
        int Books = 0;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        String query2 = "SELECT COUNT(*) AS books FROM books";
        ResultSet rset2 = statement.executeQuery(query2);
        while(rset2.next()){
        Books = rset2.getInt("books"); }
        NumberOfBooks = "Number of books: " +Books;
        return NumberOfBooks;  
    }
    // ibtissam
    public String NumberOfUsers() throws SQLException {
        int Users = 0;
        connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
        statement = connection.createStatement();
        String query2 = "SELECT COUNT(*) AS users FROM sellers";
        ResultSet rset2 = statement.executeQuery(query2);
        while(rset2.next()){
        Users = rset2.getInt("users"); }
        String NumberOfUsers = "Number of users: " +Users;
        return NumberOfUsers;  
    }
    
    public SearchResult() throws SQLException {
        initComponents();
        criteria = "title";
        label_NumberOfBooks.setText(NumberOfBooks());
        label_NumberOfUsers.setText(NumberOfUsers());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SortByGroup = new javax.swing.ButtonGroup();
        registration1 = new Registration();
        jMenu1 = new javax.swing.JMenu();
        userField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        searchEngine = new javax.swing.JTextField();
        searchCriteria = new javax.swing.JComboBox();
        sortpriceLabel = new javax.swing.JLabel();
        lowpriceBox = new java.awt.Checkbox();
        mediumpriceBox = new java.awt.Checkbox();
        highpriceBox = new java.awt.Checkbox();
        conditionLabel = new javax.swing.JLabel();
        newBox = new java.awt.Checkbox();
        fairBox = new java.awt.Checkbox();
        poorBox = new java.awt.Checkbox();
        academicyearLabel = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label_NumberOfUsers = new javax.swing.JLabel();
        label_NumberOfBooks = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        radioTitle = new javax.swing.JRadioButton();
        radioAuthor = new javax.swing.JRadioButton();
        radioPrice = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        notMember1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(620, 695));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        userField.setForeground(new java.awt.Color(51, 51, 51));
        userField.setText("Username");
        userField.setToolTipText("Enter your username");
        userField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userField.setHighlighter(null);
        userField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userFieldMouseClicked(evt);
            }
        });
        userField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFieldFocusGained(evt);
            }
        });
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 80, 20));

        PasswordField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(51, 51, 51));
        PasswordField.setToolTipText("Enter your password");
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 20));

        loginButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        loginButton.setText("Log in");
        loginButton.setToolTipText("");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 80, 20));

        Register.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        Register.setText("Register");
        Register.setToolTipText("No account yet? Press register!");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 80, 20));

        searchEngine.setFont(new java.awt.Font("Berlin Sans FB", 2, 14)); // NOI18N
        searchEngine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 380, 30));

        searchCriteria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Title", "Author", "ISBN" }));
        searchCriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCriteriaActionPerformed(evt);
            }
        });
        getContentPane().add(searchCriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        sortpriceLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 12)); // NOI18N
        sortpriceLabel.setForeground(new java.awt.Color(3, 67, 69));
        sortpriceLabel.setText("Filter by price");
        getContentPane().add(sortpriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 80, -1));

        lowpriceBox.setBackground(new java.awt.Color(255, 255, 255));
        lowpriceBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lowpriceBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        lowpriceBox.setLabel("0 SEK - 250 SEK");
        getContentPane().add(lowpriceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        mediumpriceBox.setBackground(new java.awt.Color(255, 255, 255));
        mediumpriceBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        mediumpriceBox.setLabel("250 SEK - 500 SEK");
        getContentPane().add(mediumpriceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        highpriceBox.setBackground(new java.awt.Color(255, 255, 255));
        highpriceBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        highpriceBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        highpriceBox.setLabel("500 SEK +");
        getContentPane().add(highpriceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        conditionLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 12)); // NOI18N
        conditionLabel.setForeground(new java.awt.Color(3, 67, 69));
        conditionLabel.setText("Filter by Condition:");
        getContentPane().add(conditionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, -1));

        newBox.setBackground(new java.awt.Color(255, 255, 255));
        newBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        newBox.setLabel("Good");
        getContentPane().add(newBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        fairBox.setBackground(new java.awt.Color(255, 255, 255));
        fairBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        fairBox.setLabel("Fair");
        getContentPane().add(fairBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        poorBox.setBackground(new java.awt.Color(255, 255, 255));
        poorBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        poorBox.setLabel("Poor");
        getContentPane().add(poorBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        academicyearLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 12)); // NOI18N
        academicyearLabel.setForeground(new java.awt.Color(3, 67, 69));
        academicyearLabel.setText("Sort by");
        getContentPane().add(academicyearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 90, -1));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 450, 370));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fblogo.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gulogo.PNG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 50, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gul_logo.PNG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 70, -1));

        label_NumberOfUsers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(label_NumberOfUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 130, 20));

        label_NumberOfBooks.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(label_NumberOfBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 130, 20));

        jButton4.setText("new search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 110, 30));

        SortByGroup.add(radioTitle);
        radioTitle.setSelected(true);
        radioTitle.setText("Title");
        radioTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTitleActionPerformed(evt);
            }
        });
        getContentPane().add(radioTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        SortByGroup.add(radioAuthor);
        radioAuthor.setText("Author");
        getContentPane().add(radioAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        SortByGroup.add(radioPrice);
        radioPrice.setText("Price");
        getContentPane().add(radioPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AEGIS APP SnippetNew.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 640, 730));

        notMember1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        notMember1.setText("Not member?");
        getContentPane().add(notMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jMenu2.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setText("Register");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setText("Refresh");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        jMenuItem3.setText("About us");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Terms & Conditions");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try{
            
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            
            query = "SELECT sellerID FROM sellers";
            rset = statement.executeQuery(query);
            
            ArrayList<String> userList = new ArrayList<String>();
            while(rset.next()){
                userList.add(rset.getString("sellerID"));
            }
            boolean match = false;
            for(int i=0; i<userList.size(); i++){
                if(userField.getText().matches(userList.get(i))){
                    match = true;
                }
            }
   
            if(match == true){
                System.out.println("true");
                query = "SELECT password FROM sellers WHERE sellerID = " + "'" + userField.getText() +"'";
                rset = statement.executeQuery(query);
                String s = "";                 
                while(rset.next()){
                s=(rset.getString("password"));
                }
                if(PasswordField.getText().matches(s)){
                    String[]info = new String[5];
                    //String[][]offer = new String[][]{{"java","gb67896"},{"database","fdf8975"},{"software process","hkl6678"},{"project programmin","fgh977525"},{"ffff","gf"},{"hf","gh"}};//sellers offers
                    
                    query = "SELECT * FROM sellers WHERE sellerID = " + "'" + userField.getText() +"'";
                    rset = statement.executeQuery(query);
                    while(rset.next()){
                        info[0] = rset.getString("name");
                        info[1] = rset.getString("phone_number");
                        info[2] = rset.getString("email");
                        info[3] = rset.getString("sellerID");
                        info[4] = Integer.toString(rset.getInt("admin"));
                    }
                    
                    query = "SELECT bookId FROM books WHERE sellerID = " + "'" + userField.getText() +"'";
                    rset = statement.executeQuery(query);
                    ArrayList<String> offer = new ArrayList<String>();
                    while(rset.next()){
                        offer.add(rset.getString("bookId"));
                    }
                    
                    SellersProf sellProf = new SellersProf(info, offer);
                    sellProf.setVisible(true);
                    sellProf.setLocationRelativeTo(null);  
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Incorrect User name", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }//GEN-LAST:event_loginButtonActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Registration regi = new Registration();
        regi.setVisible(true);
        regi.setLocationRelativeTo(null);
        this.setEnabled(false);
    }//GEN-LAST:event_RegisterActionPerformed

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void userFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFieldMouseClicked
        userField.setText("");
    }//GEN-LAST:event_userFieldMouseClicked

    private void searchCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCriteriaActionPerformed
        
        if (evt.getSource() == searchCriteria){
            criteria = (String)searchCriteria.getSelectedItem();
            if ("Title".equals(criteria)){
                criteria = "title";
            }else
            if ("Author".equals(criteria)){
                criteria = "author";
            }else
            if ("ISBN".equals("ISBN")){
                criteria = "ISBN";
            }
        }
 
    }//GEN-LAST:event_searchCriteriaActionPerformed

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void userFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusGained
        userField.setText("");
    }//GEN-LAST:event_userFieldFocusGained

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String URL = "https://www.facebook.com/groups/157805531089699/?fref=ts";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (IOException ex) {
            Logger.getLogger(SearchResult.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String URL = "http://www.gu.se/english";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (IOException ex) {
            Logger.getLogger(SearchResult.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String URL = "http://gul.gu.se/public/courseId/38096/findPublicEvents.do";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (IOException ex) {
            Logger.getLogger(SearchResult.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 Registration regi = new Registration();
        regi.setVisible(true);
        regi.setLocationRelativeTo(null);
        this.setEnabled(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  Liability liability = new Liability();
        liability.setVisible(true);
        liability.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AboutUs aboutUs = new AboutUs();
        aboutUs.setVisible(true);
        aboutUs.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String SortBy = "";
            String ConditionFilter = "";
            String PriceFilter = "";
            connection = DriverManager.getConnection(MainClass.dbconnection, MainClass.user, MainClass.pass);
            statement = connection.createStatement();
            
            // Conditionfilter
            if(newBox.getState() && !fairBox.getState() && !poorBox.getState()) { ConditionFilter = " AND bookCondition = 'Good'"; }
            if(!newBox.getState() && fairBox.getState() && !poorBox.getState()) { ConditionFilter = " AND bookCondition = 'Fair'"; }
            if(!newBox.getState() && !fairBox.getState() && poorBox.getState()) { ConditionFilter = " AND bookCondition = 'Poor'"; }
            if(newBox.getState() && fairBox.getState() && poorBox.getState()) { ConditionFilter = " AND (bookCondition = 'Fair' OR bookCondition = 'Good' OR bookCondition = 'Poor')"; }
            if(newBox.getState() && fairBox.getState() && !poorBox.getState()) { ConditionFilter = " AND (bookCondition = 'Fair' OR bookCondition = 'Good')"; }
            if(!newBox.getState() && fairBox.getState() && poorBox.getState()) { ConditionFilter = " AND (bookCondition = 'Fair' OR bookCondition = 'Poor')"; }
            if(newBox.getState() && !fairBox.getState() && poorBox.getState()) { ConditionFilter = " AND (bookCondition = 'Good' OR bookCondition = 'Poor')"; }
            
            // Pricefilter
            if(lowpriceBox.getState() && !mediumpriceBox.getState() && !highpriceBox.getState()) { PriceFilter = " AND price BETWEEN 0 AND 249";  }
            if(!lowpriceBox.getState() && mediumpriceBox.getState() && !highpriceBox.getState()) { PriceFilter = " AND price BETWEEN 250 AND 500";  }
            if(!lowpriceBox.getState() && !mediumpriceBox.getState() && highpriceBox.getState()) { PriceFilter = " AND price > 500";  }
            if(lowpriceBox.getState() && mediumpriceBox.getState() && highpriceBox.getState()) { PriceFilter = " AND (price BETWEEN 0 AND 249 OR price BETWEEN 250 AND 500 OR price > 500)";  }
            if(lowpriceBox.getState() && mediumpriceBox.getState() && !highpriceBox.getState()) { PriceFilter = " AND (price BETWEEN 0 AND 249 OR price BETWEEN 250 AND 500)";  }
            if(lowpriceBox.getState() && !mediumpriceBox.getState() && highpriceBox.getState()) { PriceFilter = " AND (price BETWEEN 0 AND 249 OR price > 500)";  }
            if(!lowpriceBox.getState() && mediumpriceBox.getState() && highpriceBox.getState()) { PriceFilter = " AND (price BETWEEN 250 AND 500 OR price > 500)";  }
            
            // Sort by column filter
            if(radioTitle.isSelected()) { SortBy = " ORDER BY title ASC"; }
            if(radioAuthor.isSelected()) { SortBy = " ORDER BY author ASC"; }
            if(radioPrice.isSelected()) { SortBy = " ORDER BY price ASC"; }
            
            String SearchForText = searchEngine.getText();
            String SearchField = (String)searchCriteria.getSelectedItem();
            if ("Author".equals(SearchField)) {
                SearchField = "author";  }
            
            query = "SELECT title, author, bookCondition, ISBN, price, bookID, sellerID FROM books WHERE " +SearchField +" LIKE '%" +SearchForText +"%'" + ConditionFilter+ PriceFilter+ SortBy;
            rset = statement.executeQuery(query);
            
            ArrayList<String> titleList = new ArrayList<String>();
            ArrayList<String> authorList = new ArrayList<String>();
            ArrayList<String> isbnList = new ArrayList<String>();
            ArrayList<String> conditionList = new ArrayList<String>();
            ArrayList<Integer> priceList = new ArrayList<Integer>();
            ArrayList<String> bookIdList = new ArrayList<String>();
            ArrayList<String> sellerIdList = new ArrayList<String>();
            
            while(rset.next()){
                titleList.add(rset.getString("title"));
                    authorList.add(rset.getString("author"));
                    conditionList.add(rset.getString("bookCondition"));
                    isbnList.add(rset.getString("ISBN"));
                    priceList.add(rset.getInt("price"));
                    bookIdList.add(rset.getString("bookID"));
                    sellerIdList.add(rset.getString("sellerID"));
            }
            
            jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            jPanel2.removeAll();
            ResultPanel[] rpList = new ResultPanel[titleList.size()];
            
            jPanel2.setLayout(new GridLayout(titleList.size()+2,1,0,0));
           
            for(int i=0; i<titleList.size();i++){
                rpList[i] = new ResultPanel(titleList.get(i), authorList.get(i), isbnList.get(i), conditionList.get(i), priceList.get(i), bookIdList.get(i), sellerIdList.get(i));
                
                jPanel2.add(rpList[i]);
            }
            jPanel2.updateUI();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void radioTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTitleActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            label_NumberOfBooks.setText(NumberOfBooks());
            label_NumberOfUsers.setText(NumberOfUsers());
        } catch (SQLException ex) {
            Logger.getLogger(SearchResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton Register;
    private javax.swing.ButtonGroup SortByGroup;
    private javax.swing.JLabel academicyearLabel;
    private javax.swing.JLabel conditionLabel;
    private java.awt.Checkbox fairBox;
    private java.awt.Checkbox highpriceBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel label_NumberOfBooks;
    public javax.swing.JLabel label_NumberOfUsers;
    private javax.swing.JButton loginButton;
    private java.awt.Checkbox lowpriceBox;
    private java.awt.Checkbox mediumpriceBox;
    private java.awt.Checkbox newBox;
    private javax.swing.JLabel notMember1;
    private java.awt.Checkbox poorBox;
    private javax.swing.JRadioButton radioAuthor;
    private javax.swing.JRadioButton radioPrice;
    private javax.swing.JRadioButton radioTitle;
    private Registration registration1;
    private javax.swing.JComboBox searchCriteria;
    private javax.swing.JTextField searchEngine;
    private javax.swing.JLabel sortpriceLabel;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}