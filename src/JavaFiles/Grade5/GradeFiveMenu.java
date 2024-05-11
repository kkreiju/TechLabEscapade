package Grade5;

import Grade4.LevelTwoMouseDrag;
import Main.GradeMenu;
import Main.Progress;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import sfx.SoundEffects;

public class GradeFiveMenu extends javax.swing.JFrame {

    Progress progress = new Progress();
    ArrayList<String> data = new ArrayList<String>();
    String database = "src\\Database\\currentprogress.txt";
    
    SoundEffects sfx = new SoundEffects();
    public GradeFiveMenu() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        setTitle("TechLab Escapade");
        initComponents();
        CheckIfDone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        Grade5LevelOne = new javax.swing.JLabel();
        Grade5LevelTwo = new javax.swing.JLabel();
        Grade5LevelThree = new javax.swing.JLabel();
        Grade5LevelFour = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelOne.png"))); // NOI18N
        Grade5LevelOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Grade5LevelOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Grade5LevelOneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade5LevelOneMousePressed(evt);
            }
        });
        getContentPane().add(Grade5LevelOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelTwo.png"))); // NOI18N
        Grade5LevelTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Grade5LevelTwoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Grade5LevelTwoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade5LevelTwoMousePressed(evt);
            }
        });
        getContentPane().add(Grade5LevelTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelThree.png"))); // NOI18N
        Grade5LevelThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Grade5LevelThreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Grade5LevelThreeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade5LevelThreeMousePressed(evt);
            }
        });
        getContentPane().add(Grade5LevelThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelFour.png"))); // NOI18N
        Grade5LevelFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Grade5LevelFourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Grade5LevelFourMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade5LevelFourMousePressed(evt);
            }
        });
        getContentPane().add(Grade5LevelFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        sfx.ClickFX();
        GradeMenu GM = new GradeMenu();
        GM.setLocationRelativeTo(null);
        GM.setResizable(false);
        GM.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void Grade5LevelOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelOneMousePressed
       sfx.ClickFX();
        LevelOneMech LOM = new LevelOneMech();
        LOM.setLocationRelativeTo(null);
        LOM.setResizable(false);
        LOM.setVisible(true);
        dispose();
    }//GEN-LAST:event_Grade5LevelOneMousePressed

    private void Grade5LevelOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelOneMouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 5)){
            Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.1completehovered.png")));
        } 
        else
            Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelOneHover.png")));
    }//GEN-LAST:event_Grade5LevelOneMouseEntered

    private void Grade5LevelOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelOneMouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 5)){
            Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.1complete.png")));
        } 
        else
            Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelOne.png")));
    }//GEN-LAST:event_Grade5LevelOneMouseExited

    private void Grade5LevelTwoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelTwoMouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 6)){
            Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.2completehovered.png")));
        } 
        else
            Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelTwoHover.png")));
    }//GEN-LAST:event_Grade5LevelTwoMouseEntered

    private void Grade5LevelTwoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelTwoMouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 6)){
            Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.2complete.png")));
        } 
        else
            Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelTwo.png")));
    }//GEN-LAST:event_Grade5LevelTwoMouseExited

    private void Grade5LevelThreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelThreeMouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 7)){
            Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.3completehovered.png")));
        } 
        else
            Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelThreeHover.png")));
    }//GEN-LAST:event_Grade5LevelThreeMouseEntered

    private void Grade5LevelThreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelThreeMouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 7)){
            Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.3complete.png")));
        } 
        else
            Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelThree.png")));
    }//GEN-LAST:event_Grade5LevelThreeMouseExited

    private void Grade5LevelFourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelFourMouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 8)){
            Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.4completehovered.png")));
        } 
        else
            Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelFourHover.png")));
    }//GEN-LAST:event_Grade5LevelFourMouseEntered

    private void Grade5LevelFourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelFourMouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 8)){
            Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.4complete.png")));
        } 
        else
            Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5LevelFour.png")));
    }//GEN-LAST:event_Grade5LevelFourMouseExited

    private void Grade5LevelThreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelThreeMousePressed
        sfx.ClickFX();
        LevelThreeMechanics ltm = new LevelThreeMechanics();
        ltm.setLocationRelativeTo(null);
        ltm.setResizable(false);
        ltm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Grade5LevelThreeMousePressed

    private void Grade5LevelTwoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelTwoMousePressed
        sfx.ClickFX();
        LevelTwoMechanics ltm = new LevelTwoMechanics();
        ltm.setLocationRelativeTo(null);
        ltm.setResizable(false);
        ltm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Grade5LevelTwoMousePressed

    private void Grade5LevelFourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade5LevelFourMousePressed
        sfx.ClickFX();
        LevelFourMechanics lfm = new LevelFourMechanics();
        lfm.setLocationRelativeTo(null);
        lfm.setResizable(false);
        lfm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Grade5LevelFourMousePressed

    private void CheckIfDone(){
        data = progress.ReadProgressDBComponents(database);
        
        if(data.get(5).substring(data.get(5).indexOf(' ') + 1, data.get(5).length()).equals("true")){
            Grade5LevelOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.1complete.png")));
        }
        if(data.get(6).substring(data.get(6).indexOf(' ') + 1, data.get(6).length()).equals("true")){
            Grade5LevelTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.2complete.png")));
        }
        if(data.get(7).substring(data.get(7).indexOf(' ') + 1, data.get(7).length()).equals("true")){
            Grade5LevelThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.3complete.png")));
        }
        if(data.get(8).substring(data.get(8).indexOf(' ') + 1, data.get(8).length()).equals("true")){
            Grade5LevelFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.4complete.png")));
        }
    }
    
    private boolean isTrue(ArrayList<String> booleandata, int index){
        boolean istrue = false;
        if(booleandata.get(index).substring(booleandata.get(index).indexOf(' ') + 1, booleandata.get(index).length()).equals("true"))
            istrue = true;
        return istrue;
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
            java.util.logging.Logger.getLogger(GradeFiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeFiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeFiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeFiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeFiveMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel Grade5LevelFour;
    private javax.swing.JLabel Grade5LevelOne;
    private javax.swing.JLabel Grade5LevelThree;
    private javax.swing.JLabel Grade5LevelTwo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
