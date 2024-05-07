/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grade4;

import javax.swing.JOptionPane;

/**
 *
 * @author VJ
 */
public class LevelFourPageTwo extends javax.swing.JFrame {

    /**
     * Creates new form LevelFourPageTwo
     */
    public LevelFourPageTwo() {
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SecondPic = new javax.swing.JLabel();
        FirstPic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecondPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo2p.png"))); // NOI18N
        SecondPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SecondPicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecondPicMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SecondPicMousePressed(evt);
            }
        });
        getContentPane().add(SecondPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));

        FirstPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo1p.png"))); // NOI18N
        FirstPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstPicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FirstPicMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FirstPicMousePressed(evt);
            }
        });
        getContentPane().add(FirstPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwobg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicMouseEntered
        FirstPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo1phover.png")));
    }//GEN-LAST:event_FirstPicMouseEntered

    private void FirstPicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicMouseExited
         FirstPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo1p.png")));
    }//GEN-LAST:event_FirstPicMouseExited

    private void FirstPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicMousePressed
         FirstPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo1pwrong.png")));
         JOptionPane.showMessageDialog(null, "Incorrect!");
         LevelFourPageThree lfpt = new LevelFourPageThree();
        lfpt.setLocationRelativeTo(null);
        lfpt.setResizable(false);
        lfpt.setVisible(true);
        dispose();
    }//GEN-LAST:event_FirstPicMousePressed

    private void SecondPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicMouseEntered
        SecondPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo2phover.png")));
    }//GEN-LAST:event_SecondPicMouseEntered

    private void SecondPicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicMouseExited
        SecondPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo2p.png")));
    }//GEN-LAST:event_SecondPicMouseExited

    private void SecondPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicMousePressed
        SecondPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44pagetwo2pcheck.png")));
        JOptionPane.showMessageDialog(null, "Correct!");
        LevelFourPageThree lfpt = new LevelFourPageThree();
        lfpt.setLocationRelativeTo(null);
        lfpt.setResizable(false);
        lfpt.setVisible(true);
        dispose();
    }//GEN-LAST:event_SecondPicMousePressed

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
            java.util.logging.Logger.getLogger(LevelFourPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelFourPageTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstPic;
    private javax.swing.JLabel SecondPic;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
