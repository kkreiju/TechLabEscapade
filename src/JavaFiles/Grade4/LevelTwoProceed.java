package Grade4;

import javax.swing.ImageIcon;
import sfx.SoundEffects;

public class LevelTwoProceed extends javax.swing.JFrame {

    SoundEffects sfx = new SoundEffects();
    public LevelTwoProceed() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbutton.png"))); // NOI18N
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StartButtonMousePressed(evt);
            }
        });
        getContentPane().add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 602, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2proceed.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 228, -1, -1));

        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseEntered
        StartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbuttonhover.png")));
    }//GEN-LAST:event_StartButtonMouseEntered

    private void StartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseExited
        StartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbutton.png")));
    }//GEN-LAST:event_StartButtonMouseExited

    private void StartButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMousePressed
        sfx.ClickFX();
        LevelTwoRoom ltr = new LevelTwoRoom();
        ltr.setLocationRelativeTo(null);
        ltr.setResizable(false);
        ltr.setVisible(true);
        dispose();
    }//GEN-LAST:event_StartButtonMousePressed

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
            java.util.logging.Logger.getLogger(LevelTwoProceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoProceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoProceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoProceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoProceed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundGrade;
    private javax.swing.JLabel StartButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
