package Grade5;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LevelThreeGuess extends javax.swing.JFrame {

    int[] answer = {2, 1, 1};
    int index = 0;
    public LevelThreeGuess() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    private void VerifyAnswer(int choice){
        if(index == 0){
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.1clicked.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.1clicked.png")));
        }
        else if(index == 1){
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.2clicked.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.2clicked.png")));
        }
        else if(index == 2){
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.3clicked.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.3clicked.png")));
        }
        
        if(choice == answer[index])
            JOptionPane.showMessageDialog(null, "CORRECT");
        else
            JOptionPane.showMessageDialog(null, "INCORRECT");
        index++;
        Refresh();
    }
    
    private void Refresh(){
        if(index == 0){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threeguess1.png")));
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.1.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.1.png")));
        }
        else if(index == 1){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threeguess2.png")));
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.2.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.2.png")));
        }
        else if(index == 2){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threeguess3.png")));
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.3.png")));
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.3.png")));
        }
        else if(index == 3){
            GradeFiveMenu gfm = new GradeFiveMenu();
            gfm.setLocationRelativeTo(null);
            gfm.setResizable(false);
            gfm.setVisible(true);
            dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        choice2 = new javax.swing.JLabel();
        choice1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.1.png"))); // NOI18N
        choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice2MouseExited(evt);
            }
        });
        getContentPane().add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 695, -1, -1));

        choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.1.png"))); // NOI18N
        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice1MouseExited(evt);
            }
        });
        getContentPane().add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 695, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threeguess1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseEntered
        if(index == 0)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.1hover.png")));
        else if(index == 1)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.2hover.png")));
        else if(index == 2)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.3hover.png")));
    }//GEN-LAST:event_choice1MouseEntered

    private void choice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseExited
        if(index == 0)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.1.png")));
        else if(index == 1)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.2.png")));
        else if(index == 2)
            choice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice1.3.png")));
    }//GEN-LAST:event_choice1MouseExited

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
        VerifyAnswer(1);
    }//GEN-LAST:event_choice1MouseClicked

    private void choice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice2MouseEntered
        if(index == 0)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.1hover.png")));
        else if(index == 1)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.2hover.png")));
        else if(index == 2)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.3hover.png")));
    }//GEN-LAST:event_choice2MouseEntered

    private void choice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice2MouseExited
        if(index == 0)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.1.png")));
        else if(index == 1)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.2.png")));
        else if(index == 2)
            choice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_choice2.3.png")));
    }//GEN-LAST:event_choice2MouseExited

    private void choice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice2MouseClicked
        VerifyAnswer(2);
    }//GEN-LAST:event_choice2MouseClicked

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        GradeFiveMenu gm = new GradeFiveMenu();
        gm.setLocationRelativeTo(null);
        gm.setResizable(false);
        gm.setVisible(true);
        data.set(0, 1 + "");
        SaveDatabaseComponents();
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

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
            java.util.logging.Logger.getLogger(LevelThreeGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelThreeGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelThreeGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelThreeGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelThreeGuess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel choice1;
    private javax.swing.JLabel choice2;
    // End of variables declaration//GEN-END:variables
}
