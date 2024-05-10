package Main;

import Grade4.GradeFourMenu;
import Grade5.GradeFiveMenu;
import Grade6.GradeSixMechanics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GradeMenu extends javax.swing.JFrame {

    Progress progress = new Progress();
    ArrayList<String> data = new ArrayList<String>();
    String database = "src\\Database\\currentprogress.txt";
    
    boolean gradefour = false, gradefive = false, gradesix = false;
    
    public GradeMenu() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        CheckIfDone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        GradeFourLabel = new javax.swing.JLabel();
        GradeFiveLabel = new javax.swing.JLabel();
        GradeSixLabel = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        setMaximumSize(new java.awt.Dimension(1600, 900));
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

        GradeFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefour.png"))); // NOI18N
        GradeFourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeFourLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeFourLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeFourLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        GradeFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive.png"))); // NOI18N
        GradeFiveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeFiveLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        GradeSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesix.png"))); // NOI18N
        GradeSixLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradeSixLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradeSixLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GradeSixLabelMousePressed(evt);
            }
        });
        getContentPane().add(GradeSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, -1, -1));

        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GradeFourLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMousePressed
        GradeFourMenu GFourM = new GradeFourMenu();
        GFourM.setLocationRelativeTo(null);
        GFourM.setResizable(false);
        GFourM.setVisible(true);
        dispose();
    }//GEN-LAST:event_GradeFourLabelMousePressed

    private void GradeFiveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMousePressed
        GradeFiveMenu GFiveM = new GradeFiveMenu();
        GFiveM.setLocationRelativeTo(null);
        GFiveM.setResizable(false);
        GFiveM.setVisible(true);
        dispose();
    }//GEN-LAST:event_GradeFiveLabelMousePressed

    private void GradeSixLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMousePressed
        String database = "src\\Database\\currentprogress.txt";
        ArrayList<String> data = new ArrayList<String>();
        Progress progress = new Progress();
        data = progress.ReadProgressDBComponents(database);
        boolean verified = false;
        for(int i = 1; i <= 8 ; i++){
            if(data.get(i).substring(data.get(i).indexOf(" ") + 1, data.get(i).length()).equals("true")){
                verified = true;
            }
            else{
                verified = false;
                break;
            }
        }
        
        if(!verified){
            JOptionPane.showMessageDialog(null, "LEVEL 4 AND LEVEL 5 MUST BE COMPLETED FIRST.");
        }
        else{
            GradeSixMechanics GSM = new GradeSixMechanics();
            GSM.setLocationRelativeTo(null);
            GSM.setResizable(false);
            GSM.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_GradeSixLabelMousePressed

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void GradeFourLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMouseEntered
        if(gradefour)
            GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefourcompletehover.png")));
        else
            GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefourhover.png")));
    }//GEN-LAST:event_GradeFourLabelMouseEntered

    private void GradeFourLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFourLabelMouseExited
        if(gradefour)
            GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefourcomplete.png")));
        else
            GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefour.png")));
    }//GEN-LAST:event_GradeFourLabelMouseExited

    private void GradeFiveLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMouseEntered
        if(gradefive)
            GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefivecompletehover.png")));
        else
            GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefivehover.png")));
    }//GEN-LAST:event_GradeFiveLabelMouseEntered

    private void GradeFiveLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeFiveLabelMouseExited
        if(gradefive)
            GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefivecomplete.png")));
        else
            GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive.png")));
    }//GEN-LAST:event_GradeFiveLabelMouseExited

    private void GradeSixLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMouseEntered
        if(gradesix)
            GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixcompletehover.png")));
        else
            GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixhover.png")));
    }//GEN-LAST:event_GradeSixLabelMouseEntered

    private void GradeSixLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeSixLabelMouseExited
        if(gradesix)
            GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixcomplete.png")));
        else
            GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesix.png")));
    }//GEN-LAST:event_GradeSixLabelMouseExited

    private void CheckIfDone(){
        data = progress.ReadProgressDBComponents(database);
        
        if(data.get(1).substring(data.get(1).indexOf(' ') + 1, data.get(1).length()).equals("true") &&
           data.get(2).substring(data.get(2).indexOf(' ') + 1, data.get(2).length()).equals("true") &&
           data.get(3).substring(data.get(3).indexOf(' ') + 1, data.get(3).length()).equals("true") &&
           data.get(4).substring(data.get(4).indexOf(' ') + 1, data.get(4).length()).equals("true")){
            gradefour = true;
            GradeFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefourcomplete.png")));
        }
        if(data.get(5).substring(data.get(5).indexOf(' ') + 1, data.get(5).length()).equals("true") &&
           data.get(6).substring(data.get(6).indexOf(' ') + 1, data.get(6).length()).equals("true") &&
           data.get(7).substring(data.get(7).indexOf(' ') + 1, data.get(7).length()).equals("true") &&
           data.get(8).substring(data.get(8).indexOf(' ') + 1, data.get(8).length()).equals("true")){
            gradefive = true;
            GradeFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefivecomplete.png")));
        }
        if(data.get(9).substring(data.get(9).indexOf(' ') + 1, data.get(9).length()).equals("true")){
            gradesix = true;
            GradeSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixcomplete.png")));
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
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeFourMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BackGroundGrade;
    private javax.swing.JLabel GradeFiveLabel;
    private javax.swing.JLabel GradeFourLabel;
    private javax.swing.JLabel GradeSixLabel;
    // End of variables declaration//GEN-END:variables
}
