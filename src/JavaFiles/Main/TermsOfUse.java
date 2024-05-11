package Main;

import javax.swing.ImageIcon;

public class TermsOfUse extends javax.swing.JFrame {

    public TermsOfUse() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OKButton = new javax.swing.JButton();
        TermsScrollPane = new javax.swing.JScrollPane();
        TermsOfUseLabel = new javax.swing.JLabel();
        AgreeCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Term of Use / Policies");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        OKButton.setBackground(new java.awt.Color(255, 255, 255));
        OKButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OKButton.setForeground(new java.awt.Color(0, 0, 0));
        OKButton.setText("OK");
        OKButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        OKButton.setEnabled(false);
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        TermsScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        TermsScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TermsOfUseLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TermsOfUseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TermsOfUseLabel.setText("<html><div style='text-align: center; font-size: 20;'><b>TERMS AND POLICIES</b></div><br><br>\n\n<b>Welcome to TechLab Escapade!</b><br><br>\nBy accessing or using our game, you agree to be bound by these terms and policies.<br>\nPlease read them carefully.<br><br>\n\n<b>User Conduct:</b><br>\nBe respectful to other players.<br>\nDo not cheat, hack, or exploit bugs.<br>\nDo not engage in harassment or any form of abusive behavior.<br><br>\n\n<b>Privacy Policy:</b><br>\nWe collect limited personal information for gameplay purposes only.<br>\nYour data is not shared with third parties without consent.<br><br>\n\n<b>Age Restrictions:</b><br>\nYou must be at least 9 years old to play TechLab Escapade.<br>\nMinors should obtain parental consent.<br><br>\n\n<b>Contact Information:</b><br>\nIf you have any questions or concerns, please contact us at techlabescapade@gmail.com.<br>\nBy continuing to use TechLab Escapade, you agree to these terms and policies.<br><br><div style='text-align: center; font-size: 20;'><b>Thank you for playing!</b></html>");
        TermsOfUseLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TermsScrollPane.setViewportView(TermsOfUseLabel);

        AgreeCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        AgreeCheckBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AgreeCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        AgreeCheckBox.setText("I accept the terms of use top / policies on top");
        AgreeCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AgreeCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AgreeCheckBoxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TermsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(AgreeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(TermsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgreeCheckBox)
                    .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        Menu menu  = new Menu();
        menu.show();
        menu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

    private void AgreeCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AgreeCheckBoxStateChanged
        if(AgreeCheckBox.isSelected())
            OKButton.setEnabled(true);
        else
            OKButton.setEnabled(false);
    }//GEN-LAST:event_AgreeCheckBoxStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TermsOfUse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermsOfUse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermsOfUse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermsOfUse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TermsOfUse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AgreeCheckBox;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel TermsOfUseLabel;
    private javax.swing.JScrollPane TermsScrollPane;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
