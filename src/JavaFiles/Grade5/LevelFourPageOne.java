/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grade5;

import Main.Progress;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author VJ
 */
public class LevelFourPageOne extends javax.swing.JFrame {
    private Timer timer;
    private int timeleft = 4;
    
    LevelFourPageOneDesc lfpod = new LevelFourPageOneDesc();
    public LevelFourPageOne() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer(timeleft);
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SecondPicPageOne = new javax.swing.JLabel();
        FirstPicPageOne = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage2p.png"))); // NOI18N
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

        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage1p.png"))); // NOI18N
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5levelfourpg1bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstPicPageOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMouseEntered
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage1phover.png")));
    }//GEN-LAST:event_FirstPicPageOneMouseEntered

    private void FirstPicPageOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMouseExited
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage1p.png")));
    }//GEN-LAST:event_FirstPicPageOneMouseExited

    private void FirstPicPageOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstPicPageOneMousePressed
        FirstPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage1pcheck.png")));
        JOptionPane.showMessageDialog(null, "CORRECT");
        
        String database = "src\\Database\\5.4database.txt";
        Progress progress = new Progress();
        ArrayList<String> data = new ArrayList<String>();
        data = progress.ReadProgressDBComponents(database);
        int correct = Integer.parseInt(data.get(0));
        correct++;
        data.set(0, correct + "");
        progress.SaveProgressDBComponents(data, database);
        
        NextPage();
        timer.start();
    }//GEN-LAST:event_FirstPicPageOneMousePressed

    private void SecondPicPageOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMouseEntered
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage2phover.png")));
    }//GEN-LAST:event_SecondPicPageOneMouseEntered

    private void SecondPicPageOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMouseExited
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage2p.png")));
    }//GEN-LAST:event_SecondPicPageOneMouseExited

    private void SecondPicPageOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondPicPageOneMousePressed
        SecondPicPageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1stpage2pwrong.png")));
        JOptionPane.showMessageDialog(null, "INCORRECT");
        NextPage();
        timer.start();
    }//GEN-LAST:event_SecondPicPageOneMousePressed

    private void updateTimer(int timeleft){
    this.timeleft--;
        if (timeleft < 0) {
            LevelFourPageTwo lfpt = new LevelFourPageTwo();
            lfpt.setLocationRelativeTo(null);
            lfpt.setResizable(false);
            lfpt.setVisible(true);
            lfpod.dispose();
            this.timeleft = 3;
            timer.stop();
        }
    }
    
    public void NextPage(){
        lfpod.setLocationRelativeTo(null);
        lfpod.setResizable(false);
        lfpod.setVisible(true);
        dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(LevelFourPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelFourPageOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelFourPageOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstPicPageOne;
    private javax.swing.JLabel SecondPicPageOne;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
