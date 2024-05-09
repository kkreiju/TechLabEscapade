package Grade4;

import javax.swing.ImageIcon;

public class LevelTwoMouse extends javax.swing.JFrame {

    boolean isPressed = false;
    public LevelTwoMouse() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextButton = new javax.swing.JLabel();
        MouseRightUnhovered = new javax.swing.JLabel();
        MouseLeftUnhovered = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        MouseRightUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightUnhoverd.png"))); // NOI18N
        MouseRightUnhovered.setMaximumSize(new java.awt.Dimension(202, 202));
        MouseRightUnhovered.setMinimumSize(new java.awt.Dimension(202, 202));
        MouseRightUnhovered.setPreferredSize(new java.awt.Dimension(202, 202));
        MouseRightUnhovered.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseRightUnhoveredMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseRightUnhoveredMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseRightUnhoveredMousePressed(evt);
            }
        });
        getContentPane().add(MouseRightUnhovered, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, -1, -1));

        MouseLeftUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftUnhovered.png"))); // NOI18N
        MouseLeftUnhovered.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseLeftUnhoveredMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseLeftUnhoveredMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseLeftUnhoveredMousePressed(evt);
            }
        });
        getContentPane().add(MouseLeftUnhovered, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmousebackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MouseLeftUnhoveredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftUnhoveredMouseEntered
        if(!isPressed)
            MouseLeftUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftHovered.png")));
    }//GEN-LAST:event_MouseLeftUnhoveredMouseEntered

    private void MouseRightUnhoveredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightUnhoveredMouseEntered
        if(!isPressed)
            MouseRightUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightHovered.png")));
    }//GEN-LAST:event_MouseRightUnhoveredMouseEntered

    private void MouseLeftUnhoveredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftUnhoveredMouseExited
        if(!isPressed)
            MouseLeftUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftUnhovered.png")));
    }//GEN-LAST:event_MouseLeftUnhoveredMouseExited

    private void MouseRightUnhoveredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightUnhoveredMouseExited
        if(!isPressed)
            MouseRightUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightUnhoverd.png")));
    }//GEN-LAST:event_MouseRightUnhoveredMouseExited

    private void MouseLeftUnhoveredMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLeftUnhoveredMousePressed
        NextButtonMousePressed(evt);
        isPressed = true;
        MouseLeftUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftWrong.png")));
        MouseRightUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightCheck.png")));
    }//GEN-LAST:event_MouseLeftUnhoveredMousePressed

    private void MouseRightUnhoveredMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseRightUnhoveredMousePressed
        NextButtonMousePressed(evt);
        isPressed = true;
        MouseLeftUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseLeftWrong.png")));
        MouseRightUnhovered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MouseRightCheck.png")));       
    }//GEN-LAST:event_MouseRightUnhoveredMousePressed

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbuttonhover.png")));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png")));
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        if(!isPressed)
            NextButton.setLocation(1408, 749);
        else{
            LevelTwoMouseDrag LTMD = new LevelTwoMouseDrag();
            LTMD.setLocationRelativeTo(null);
            LTMD.setResizable(false);
            LTMD.setVisible(true);
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
            java.util.logging.Logger.getLogger(LevelTwoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MouseLeftUnhovered;
    private javax.swing.JLabel MouseRightUnhovered;
    private javax.swing.JLabel NextButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
