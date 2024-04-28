package Grade4;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class LevelTwoMechanics extends javax.swing.JFrame {

    public LevelTwoMechanics() {
        setUndecorated(true);
        LoadDatabaseComponents();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextButton = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
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
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 749, -1, -1));

        BackGroundGrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefour_twomechanic.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbuttonhover.png")));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png")));
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        LevelTwoProceed lop = new LevelTwoProceed();
        lop.setLocationRelativeTo(null);
        lop.setResizable(false);
        lop.setVisible(true);
        dispose();
    }//GEN-LAST:event_NextButtonMousePressed

    private void LoadDatabaseComponents(){
      String filename = "src\\Database\\guessnumbers.txt";
      ArrayList<String> data = new ArrayList<String>();

      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         data = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "guessnumbers.txt not found");
         e.printStackTrace();
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
            java.util.logging.Logger.getLogger(LevelTwoMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoMechanics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoMechanics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundGrade;
    private javax.swing.JLabel NextButton;
    // End of variables declaration//GEN-END:variables
}
