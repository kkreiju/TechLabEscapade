package Grade6;

import javax.swing.ImageIcon;

public class GradeSixMechanics extends javax.swing.JFrame {

    public GradeSixMechanics() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NextButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png"))); // NOI18N
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextButtonMousePressed(evt);
            }
        });
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixmechanic.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbuttonhover.png")));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png")));
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        GradeSixProceed gsp = new GradeSixProceed();
        gsp.setLocationRelativeTo(null);
        gsp.setResizable(false);
        gsp.setVisible(true);
        dispose();
    }//GEN-LAST:event_NextButtonMousePressed

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
            java.util.logging.Logger.getLogger(GradeSixMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeSixMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeSixMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeSixMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeSixMechanics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NextButton;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
