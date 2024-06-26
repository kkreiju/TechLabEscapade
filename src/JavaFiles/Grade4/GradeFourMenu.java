package Grade4;
import Main.GradeMenu;
import Main.Progress;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sfx.SoundEffects;

public class GradeFourMenu extends javax.swing.JFrame {

    SoundEffects sfx = new SoundEffects();
    Progress progress = new Progress();
    ArrayList<String> data = new ArrayList<String>();
    String database = "src\\Database\\currentprogress.txt";
    
    public GradeFourMenu() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        CheckIfDone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Level4 = new javax.swing.JLabel();
        Level3 = new javax.swing.JLabel();
        Level2 = new javax.swing.JLabel();
        Level1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Level4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4.png"))); // NOI18N
        Level4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Level4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Level4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Level4MousePressed(evt);
            }
        });
        getContentPane().add(Level4, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 553, -1, -1));

        Level3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3.png"))); // NOI18N
        Level3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Level3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Level3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Level3MousePressed(evt);
            }
        });
        getContentPane().add(Level3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 553, -1, -1));

        Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2.png"))); // NOI18N
        Level2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Level2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Level2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Level2MousePressed(evt);
            }
        });
        getContentPane().add(Level2, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 250, -1, -1));

        Level1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1.png"))); // NOI18N
        Level1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Level1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Level1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Level1MousePressed(evt);
            }
        });
        getContentPane().add(Level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 251, -1, -1));

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

        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        sfx.ClickFX();
        GradeMenu gm = new GradeMenu();
        gm.setLocationRelativeTo(null);
        gm.setResizable(false);
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void Level1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level1MouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 1)){
            Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1completehovered.png")));
        } 
        else
            Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1hover.png")));
    }//GEN-LAST:event_Level1MouseEntered

    private void Level1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level1MouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 1))
            Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1complete.png")));
        else
            Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1.png")));
    }//GEN-LAST:event_Level1MouseExited

    private void Level1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level1MousePressed
        sfx.ClickFX();
        LevelOneMechanics lom = new LevelOneMechanics();
        lom.setLocationRelativeTo(null);
        lom.setResizable(false);
        lom.setVisible(true);
        dispose();
    }//GEN-LAST:event_Level1MousePressed

    private void Level2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level2MouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 2)){
            Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2completehovered.png")));
        } 
        else
            Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2hover.png")));
    }//GEN-LAST:event_Level2MouseEntered

    private void Level2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level2MouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 2)){
            Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2complete.png")));
        } 
        else
            Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2.png")));
    }//GEN-LAST:event_Level2MouseExited

    private void Level2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level2MousePressed
        sfx.ClickFX();
        LevelTwoMechanics ltm = new LevelTwoMechanics();
        ltm.setLocationRelativeTo(null);
        ltm.setResizable(false);
        ltm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Level2MousePressed

    private void Level3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level3MouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 3)){
            Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3completehovered.png")));
        } 
        else
            Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3hover.png")));
    }//GEN-LAST:event_Level3MouseEntered

    private void Level3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level3MouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 3)){
            Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3complete.png")));
        } 
        else
            Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3.png")));
    }//GEN-LAST:event_Level3MouseExited

    private void Level3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level3MousePressed
        sfx.ClickFX();
        LevelThreeMechanics sheesh = new LevelThreeMechanics();
        sheesh.setLocationRelativeTo(null);
        sheesh.setResizable(false);
        sheesh.setVisible(true);
        dispose();
    }//GEN-LAST:event_Level3MousePressed

    private void Level4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level4MouseEntered
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 4)){
            Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4completehovered.png")));
        } 
        else
            Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4hover.png")));
    }//GEN-LAST:event_Level4MouseEntered

    private void Level4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level4MouseExited
        data = progress.ReadProgressDBComponents(database);
        
        if(isTrue(data, 4)){
            Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4complete.png")));
        } 
        else
            Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4.png")));
    }//GEN-LAST:event_Level4MouseExited

    private void Level4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level4MousePressed
        sfx.ClickFX();
        GradeFourMechanic gfm = new GradeFourMechanic();
        gfm.setLocationRelativeTo(null);
        gfm.setResizable(false);
        gfm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Level4MousePressed

    private void CheckIfDone(){
        data = progress.ReadProgressDBComponents(database);
        
        if(data.get(1).substring(data.get(1).indexOf(' ') + 1, data.get(1).length()).equals("true")){
            Level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.1complete.png")));
        }
        if(data.get(2).substring(data.get(2).indexOf(' ') + 1, data.get(2).length()).equals("true")){
            Level2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.2complete.png")));
        }
        if(data.get(3).substring(data.get(3).indexOf(' ') + 1, data.get(3).length()).equals("true")){
            Level3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.3complete.png")));
        }
        if(data.get(4).substring(data.get(4).indexOf(' ') + 1, data.get(4).length()).equals("true")){
            Level4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.4complete.png")));
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
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeFourMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel Level1;
    private javax.swing.JLabel Level2;
    private javax.swing.JLabel Level3;
    private javax.swing.JLabel Level4;
    // End of variables declaration//GEN-END:variables
}
