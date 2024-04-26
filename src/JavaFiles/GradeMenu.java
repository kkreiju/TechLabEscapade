import Grade5.GradeFiveMenu;
import Grade4.GradeFourMenu;
import Grade6.GradeSixMenu;

public class GradeMenu extends javax.swing.JFrame {

    public GradeMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        GradeFourLabel = new javax.swing.JLabel();
        GradeFiveLabel = new javax.swing.JLabel();
        GradeSixLabel = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        setMaximumSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        GradeFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefour.png"))); // NOI18N
        GradeFourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeFourLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeFourLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeFourLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        GradeFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive.png"))); // NOI18N
        GradeFiveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        GradeSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesix.png"))); // NOI18N
        GradeSixLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeSixLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeSixLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeSixLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, -1, -1));

        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GradeFourLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMousePressed
        GradeFourMenu GFourM = new GradeFourMenu();
        GFourM.setLocationRelativeTo(null);
        GFourM.setResizable(false);
        GFourM.setVisible(true);
        dispose();
    }//GEN-LAST:event_GradeFourLabelMousePressed

    private void GradeFiveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMousePressed
        GradeFiveMenu GFiveM = new GradeFiveMenu();
        GFiveM.setLocationRelativeTo(null);
        GFiveM.setResizable(false);
        GFiveM.setVisible(true);
        dispose();
    }//GEN-LAST:event_GradeFiveLabelMousePressed

    private void GradeSixLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMousePressed
        GradeSixMenu GSM = new GradeSixMenu();
        GSM.setLocationRelativeTo(null);
        GSM.setResizable(false);
        GSM.setVisible(true);
        dispose();
    }//GEN-LAST:event_GradeSixLabelMousePressed

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void GradeFourLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMouseEntered
        GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefourhover.png")));
    }//GEN-LAST:event_GradeFourLabelMouseEntered

    private void GradeFourLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMouseExited
        GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefour.png")));
    }//GEN-LAST:event_GradeFourLabelMouseExited

    private void GradeFiveLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMouseEntered
        GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefivehover.png")));
    }//GEN-LAST:event_GradeFiveLabelMouseEntered

    private void GradeFiveLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMouseExited
        GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive.png")));
    }//GEN-LAST:event_GradeFiveLabelMouseExited

    private void GradeSixLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMouseEntered
        GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixhover.png")));
    }//GEN-LAST:event_GradeSixLabelMouseEntered

    private void GradeSixLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMouseExited
        GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesix.png")));
    }//GEN-LAST:event_GradeSixLabelMouseExited

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
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BackGroundGrade;
    private javax.swing.JLabel GradeFiveLabel;
    private javax.swing.JLabel GradeFourLabel;
    private javax.swing.JLabel GradeSixLabel;
    // End of variables declaration//GEN-END:variables
}
