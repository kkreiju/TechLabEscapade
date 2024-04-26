public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        PlayButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        setBackground(new java.awt.Color(204, 102, 255));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomenu.png"))); // NOI18N
        getContentPane().add(LogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebutton.png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, -1, -1));

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbutton.png"))); // NOI18N
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PlayButtonMousePressed(evt);
            }
        });
        getContentPane().add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 320, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundmenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbuttonhovered.png")));
    }//GEN-LAST:event_mouseEntered

    private void PlayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseExited
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbutton.png")));
    }//GEN-LAST:event_PlayButtonMouseExited

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebuttonhovered.png")));
    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebutton.png")));
    }//GEN-LAST:event_SaveButtonMouseExited

    private void PlayButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMousePressed
        GradeMenu gm = new GradeMenu();
        gm.setLocationRelativeTo(null);
        gm.setResizable(false);
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_PlayButtonMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel PlayButton;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
