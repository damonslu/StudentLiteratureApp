//Ilya Golikov & Malcolm Kente developed and coded GUI and inserted text.  
// Removed the extra buttons to GUL/UNI on registerpage, since its already on the main page //Ibtissam 2013-12-15
// Resized the windows. //Ibtissam 2013-12-16
// Added a close-button to the page. //Ibtissam 2013-12-16


public class AboutUs extends javax.swing.JFrame {

    
    public AboutUs() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutLabel = new javax.swing.JLabel();
        aboutTextArea = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();
        AboutUsExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("About Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(603, 350));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        aboutLabel.setText("ABOUT US");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        aboutTextArea.setEditable(false);
        aboutTextArea.setColumns(20);
        aboutTextArea.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setRows(5);
        aboutTextArea.setText("The Student Literature application is developed and designed for students in the Software engineering and management program. This application allows for quicker accessibility for students who are interested in buying or selling books required for the program. Students looking to sell a book/books need to register for an account and upload the book's information. Students looking to buy a book/books or maybe curious to what there is to buy, please click the search field and choose what you want to search for. The user is able to then filter searches from a wide range to more specific results. The purchase of books is done through direct contact with the seller of the book/books. The seller's information is displayed on their registered accounts.");
        aboutTextArea.setWrapStyleWord(true);
        getContentPane().add(aboutTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, -1));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AboutUsExit.setText("Close");
        AboutUsExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsExitActionPerformed(evt);
            }
        });
        getContentPane().add(AboutUsExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AEGIS APP Snippet non-log.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutUsExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsExitActionPerformed
        dispose();      
    }//GEN-LAST:event_AboutUsExitActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUsExit;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JTextArea aboutTextArea;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
