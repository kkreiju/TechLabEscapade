
package Grade5;

import Main.GradeMenu;
import javax.swing.ImageIcon;
import sfx.SoundEffects;


public class LevelOneProceed extends javax.swing.JFrame {

    SoundEffects sfx = new SoundEffects();
    public LevelOneProceed() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButotn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartButotn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbutton.png"))); // NOI18N
        StartButotn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartButotnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartButotnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StartButotnMousePressed(evt);
            }
        });
        getContentPane().add(StartButotn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade5Startbg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButotnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButotnMousePressed
        sfx.ClickFX();
        LevelOneDragDrop GFV = new LevelOneDragDrop();
        GFV.setLocationRelativeTo(null);
        GFV.setResizable(false);
        GFV.setVisible(true);
        dispose();
    }//GEN-LAST:event_StartButotnMousePressed

    private void StartButotnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButotnMouseEntered
        StartButotn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbuttonhover.png")));
    }//GEN-LAST:event_StartButotnMouseEntered

    private void StartButotnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButotnMouseExited
        StartButotn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startbutton.png")));
    }//GEN-LAST:event_StartButotnMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelOneProceed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StartButotn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
