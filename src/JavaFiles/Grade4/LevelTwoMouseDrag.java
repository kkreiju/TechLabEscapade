package Grade4;

import Main.Progress;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import sfx.SoundEffects;

public class LevelTwoMouseDrag extends javax.swing.JFrame {

    boolean isPressed = false;
    SoundEffects sfx = new SoundEffects();
    int i = 0;
    public LevelTwoMouseDrag() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MouseRight = new javax.swing.JLabel();
        MouseLeft = new javax.swing.JLabel();
        NextButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MouseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightUnhoverd.png"))); // NOI18N
        MouseRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseRightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseRightMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseRightMousePressed(evt);
            }
        });
        getContentPane().add(MouseRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, -1, -1));

        MouseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftUnhovered.png"))); // NOI18N
        MouseLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseLeftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseLeftMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseLeftMousePressed(evt);
            }
        });
        getContentPane().add(MouseLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

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
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalexcelbg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MouseLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftMousePressed
       i = 0;
        NextButtonMousePressed(evt);
        if(!isPressed)
           sfx.CorrectFX();
       isPressed = true;
       MouseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftCheck.png")));
       MouseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightWrong.png")));
    }//GEN-LAST:event_MouseLeftMousePressed

    private void MouseLeftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftMouseEntered
        if(!isPressed)
            MouseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftHovered.png")));
    }//GEN-LAST:event_MouseLeftMouseEntered

    private void MouseLeftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftMouseExited
        if(!isPressed)
            MouseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftUnhovered.png")));
    }//GEN-LAST:event_MouseLeftMouseExited

    private void MouseRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightMousePressed
        i = 0;
        NextButtonMousePressed(evt);
        if(!isPressed)
           sfx.IncorrectFX();
        isPressed = true;
        MouseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftCheck.png")));
        MouseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightWrong.png")));
    }//GEN-LAST:event_MouseRightMousePressed

    private void MouseRightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightMouseEntered
        if(!isPressed)
            MouseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightHovered.png")));
    }//GEN-LAST:event_MouseRightMouseEntered

    private void MouseRightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightMouseExited
        if(!isPressed)
            MouseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightUnHoverd.png")));
    }//GEN-LAST:event_MouseRightMouseExited

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        i = 1;
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbuttonhover.png")));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        i = 1;
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png")));
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        if(!isPressed)
            NextButton.setLocation(1408, 749);
        else if(i == 1){
            sfx.ClickFX();
            String database = "src\\Database\\4.2database.txt";
            Progress progress = new Progress();
            ArrayList<String> data = new ArrayList<String>();
            data = progress.ReadProgressDBComponents(database);
            data.set(3, "true");
            progress.SaveProgressDBComponents(data, database);
            
            LevelTwoRoom LTR = new LevelTwoRoom();
            LTR.setLocationRelativeTo(null);
            LTR.setResizable(false);
            LTR.setVisible(true);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(LevelTwoMouseDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouseDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouseDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouseDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoMouseDrag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MouseLeft;
    private javax.swing.JLabel MouseRight;
    private javax.swing.JLabel NextButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
