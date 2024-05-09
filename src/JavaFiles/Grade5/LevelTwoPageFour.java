/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grade5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author VJ
 */
public class LevelTwoPageFour extends javax.swing.JFrame {
    private Timer timer;
    private int timeleft = 3;
    
    LevelTwoAnswerPageFour ltapf = new LevelTwoAnswerPageFour();
    
    public LevelTwoPageFour() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer(timeleft);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThumbsUp = new javax.swing.JLabel();
        ThumbsDown = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ThumbsUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsup.png"))); // NOI18N
        ThumbsUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ThumbsUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ThumbsUpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThumbsUpMousePressed(evt);
            }
        });
        getContentPane().add(ThumbsUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 560, -1, -1));

        ThumbsDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsdown.png"))); // NOI18N
        ThumbsDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ThumbsDownMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ThumbsDownMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThumbsDownMousePressed(evt);
            }
        });
        getContentPane().add(ThumbsDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5leveltwopagefour.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThumbsDownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsDownMouseEntered
        ThumbsDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsdownhover.png")));
    }//GEN-LAST:event_ThumbsDownMouseEntered

    private void ThumbsDownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsDownMouseExited
        ThumbsDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsdown.png")));
    }//GEN-LAST:event_ThumbsDownMouseExited

    private void ThumbsUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsUpMouseEntered
        ThumbsUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsuphover.png")));
    }//GEN-LAST:event_ThumbsUpMouseEntered

    private void ThumbsUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsUpMouseExited
        ThumbsUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumbsup.png")));
    }//GEN-LAST:event_ThumbsUpMouseExited

    private void ThumbsDownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsDownMousePressed
        ltapf.setLocationRelativeTo(null);
        ltapf.setResizable(false);
        ltapf.setVisible(true);
        dispose();
        timer.start();
    }//GEN-LAST:event_ThumbsDownMousePressed

    private void ThumbsUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThumbsUpMousePressed
        ltapf.setLocationRelativeTo(null);
        ltapf.setResizable(false);
        ltapf.setVisible(true);
        dispose();
        timer.start();
    }//GEN-LAST:event_ThumbsUpMousePressed
    
    private void updateTimer(int timeleft){
    this.timeleft--;
        if (timeleft < 0) {
            GradeFiveMenu gfm = new GradeFiveMenu();
            gfm.setLocationRelativeTo(null);
            gfm.setResizable(false);
            gfm.setVisible(true);
            ltapf.dispose();
            this.timeleft = 3;
            timer.stop();
        }
    
    }
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
            java.util.logging.Logger.getLogger(LevelTwoPageFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoPageFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoPageFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoPageFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoPageFour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ThumbsDown;
    private javax.swing.JLabel ThumbsUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
