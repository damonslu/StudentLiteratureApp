//Malcolm Kente & Ilya Golikov coded and developed GUI and inserted text.
// Changed the design of the page to suit the designtheme. //Ibtissam 2013-12-16
// Added a close-button to the page. //Ibtissam 2013-12-16

public class Liability extends javax.swing.JFrame {

   
    public Liability() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setTitle("Terms & Condition_Student Literature");
        setMinimumSize(new java.awt.Dimension(580, 610));
        setPreferredSize(new java.awt.Dimension(600, 569));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\t          \nWelcome to our application (Student Literature). This App is published by Group Aegis. A group created in the Software Engineering and Managment program belonging to Gothenburgs\nUniversity(Göteborgs Universitet) located in Sweden (Sverige). By downloading or otherwise accessing the App you agree to be bound by the following terms and conditions. If you do not agree with these Terms, you should stop using the App immediately. The App is made available for your own, personal use. The App must not be used for any illegal or unauthorised purpose. When you use the App you must comply with all applicable Swedish laws and with any applicable international laws, including the local laws in your country of residence. You agree that when using the App you will comply with all Applicable Laws and these Terms. \nIn particular, but without limitation, you agree not to:\n \n1. Use the App in any unlawful manner or in a manner which promotes or encourages illegal activity including (without limitation) copyright infringement.\n\n2. Attempt to gain unauthorised access to the App or any networks, servers or computer systems connected to the App;\n \n3. Modify, adapt, translate or reverse engineer any part of the App or re-format or frame any portion of the pages comprising the App, save to the extent expressly permitted by these Terms or by law.\n\nPlease Note: The creators have no legal obligation to the content of this application and any wrong doing should be taken up with the seller.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TERMS & CONDITIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 14))); // NOI18N
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 560, 500));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
