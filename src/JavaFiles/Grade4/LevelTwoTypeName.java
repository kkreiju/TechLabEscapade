
package Grade4;

import Main.Progress;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sfx.SoundEffects;

public class LevelTwoTypeName extends javax.swing.JFrame {

    SoundEffects sfx = new SoundEffects();
    public LevelTwoTypeName() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnswerTextfield = new javax.swing.JTextField();
        EnterButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnswerTextfield.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        AnswerTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AnswerTextfield.setBorder(null);
        AnswerTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnswerTextfieldKeyPressed(evt);
            }
        });
        getContentPane().add(AnswerTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 380, 80));

        EnterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enterbuttontwo.png"))); // NOI18N
        EnterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnterButtonMousePressed(evt);
            }
        });
        getContentPane().add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page42bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerTextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnswerTextfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !AnswerTextfield.getText().isEmpty()) {
            sfx.ClickFX();
            String database = "src\\Database\\4.2database.txt";
            Progress progress = new Progress();
            ArrayList<String> data = new ArrayList<String>();
            data = progress.ReadProgressDBComponents(database);
            data.set(0, "true");
            progress.SaveProgressDBComponents(data, database);
            
            LevelTwoRoom LTR = new LevelTwoRoom();
            LTR.setLocationRelativeTo(null);
            LTR.setResizable(false);
            LTR.setVisible(true);
            dispose();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER && AnswerTextfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR NAME");
        }
    }//GEN-LAST:event_AnswerTextfieldKeyPressed

    private void EnterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMousePressed
       if (!AnswerTextfield.getText().isEmpty()) {
           sfx.ClickFX(); 
           String database = "src\\Database\\4.2database.txt";
            Progress progress = new Progress();
            ArrayList<String> data = new ArrayList<String>();
            data = progress.ReadProgressDBComponents(database);
            data.set(0, "true");
            progress.SaveProgressDBComponents(data, database);
            
            LevelTwoRoom LTR = new LevelTwoRoom();
            LTR.setLocationRelativeTo(null);
            LTR.setResizable(false);
            LTR.setVisible(true);
            dispose();
        }
        else if(AnswerTextfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR NAME");
        }
    }//GEN-LAST:event_EnterButtonMousePressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoTypeName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerTextfield;
    private javax.swing.JLabel EnterButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
