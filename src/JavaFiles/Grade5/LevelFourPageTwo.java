/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grade5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author VJ
 */
public class LevelFourPageTwo extends javax.swing.JFrame {
    private Timer timer;
    private int timeleft = 10;
    private Timer timerdelay;
    private int timedelay = 0;
    
    LevelFourPageTwoDesc lfptd = new LevelFourPageTwoDesc();
    public LevelFourPageTwo() {
        setUndecorated(true);
        initComponents();
        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer(timeleft);
            }
        });
        
        timerdelay = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                delayTimer(timedelay);
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

        SecondPicPageOne = new javax.swing.JLabel();
        FirstPicPageOne = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage2p.png"))); // NOI18N
        SecondPicPageOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SecondPicPageOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecondPicPageOneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SecondPicPageOneMousePressed(evt);
            }
        });
        getContentPane().add(SecondPicPageOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));

        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage1p.png"))); // NOI18N
        FirstPicPageOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstPicPageOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FirstPicPageOneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FirstPicPageOneMousePressed(evt);
            }
        });
        getContentPane().add(FirstPicPageOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpagebg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SecondPicPageOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMouseEntered
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage2phover.png")));
    }//GEN-LAST:event_SecondPicPageOneMouseEntered

    private void SecondPicPageOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMouseExited
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage2p.png")));
    }//GEN-LAST:event_SecondPicPageOneMouseExited

    private void SecondPicPageOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMousePressed
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage2pwrong.png")));
        timerdelay.start();
        timer.start();
    }//GEN-LAST:event_SecondPicPageOneMousePressed

    private void FirstPicPageOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMouseEntered
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage1phover.png")));
    }//GEN-LAST:event_FirstPicPageOneMouseEntered

    private void FirstPicPageOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMouseExited
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage1p.png")));
    }//GEN-LAST:event_FirstPicPageOneMouseExited

    private void FirstPicPageOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMousePressed
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2ndpage1pcheck.png")));
        timerdelay.start();
        timer.start();
    }//GEN-LAST:event_FirstPicPageOneMousePressed
    
    
    private void updateTimer(int timeleft){
    this.timeleft--;
        if (timeleft < 0) {
            LevelFourPageThree lfpt = new LevelFourPageThree();
            lfpt.setLocationRelativeTo(null);
            lfpt.setResizable(false);
            lfpt.setVisible(true);
            lfptd.dispose();
            this.timeleft = 3;
            timer.stop();
        }
    
    }
    
    private void delayTimer(int timeleft){
    this.timedelay++;
        if(timeleft >= 3){
            LevelFourPageTwoDesc lfptd = new LevelFourPageTwoDesc();
            lfptd.setLocationRelativeTo(null);
            lfptd.setResizable(false);
            lfptd.setVisible(true);
            dispose();
            this.timedelay = 0;
            timerdelay.stop();
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
    private javax.swing.JLabel FirstPicPageOne;
    private javax.swing.JLabel SecondPicPageOne;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}