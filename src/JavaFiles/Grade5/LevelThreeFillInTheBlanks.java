package Grade5;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JOptionPane;
import sfx.SoundEffects;

public class LevelThreeFillInTheBlanks extends javax.swing.JFrame {

    String filename = "src\\Database\\gradefour_threefillintheblanksdb.txt";
    ArrayList<String> data = new ArrayList<String>();
    boolean initialization = false;
    
    SoundEffects sfx = new SoundEffects();
    public LevelThreeFillInTheBlanks() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        LoadDatabaseComponents();
        data.set(0, 1 + "");
        SaveDatabaseComponents();
        initComponents();
    }
    
    private void TextLimiter(java.awt.event.KeyEvent evt,javax.swing.JTextField textfield){
        if (textfield.getText().length() >= 1)
            evt.consume();
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c))
            evt.setKeyChar(Character.toUpperCase(c));
    }
    
    public void TextFieldPositioner(){
        int index = Integer.parseInt(data.get(0));
        int y = 730;
        textfield1.setText(null);
        textfield2.setText(null);
        textfield3.setText(null);
        if(index == 1){
            textfield1.setLocation(550, y);
            textfield2.setLocation(660, y);
            textfield3.setLocation(888, y);
        }
        else if(index == 2){
            textfield1.setLocation(-60, y);
            textfield2.setLocation(-60, y);
            textfield3.setLocation(-60, y);
            textfield1.setEnabled(false);
            textfield2.setEnabled(false);
            textfield3.setEnabled(false);
        }
        textfield1.requestFocus();
    }
    
    private void BackgroundChanger(){
        int index = Integer.parseInt(data.get(0));
        if(index == 1)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threefillintheblanks1.png")));
        else{
            LevelThreeGuess gm = new LevelThreeGuess();
            gm.setLocationRelativeTo(null);
            gm.setResizable(false);
            gm.setVisible(true);
            data.set(0, 1 + "");
            SaveDatabaseComponents();
            dispose();
        }
    }
    
    private void AnswerVerifier(int index){
        if(index == 1){
            if(textfield1.getText().equals("P") && textfield2.getText().equals("E") && textfield3.getText().equals("H")){
                sfx.CorrectFX();
                data.set(0, (index + 1) + "");
                SaveDatabaseComponents();
                JOptionPane.showMessageDialog(null, "CORRECT");
            }
            else{
                sfx.IncorrectFX();
                JOptionPane.showMessageDialog(null, "INCORRECT");
            }
        }
    }
    
    private void LoadDatabaseComponents(){
      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         data = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "db.txt not found");
         e.printStackTrace();
      }
    }
    
    private void SaveDatabaseComponents(){
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextButton = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        textfield3 = new javax.swing.JTextField();
        textfield2 = new javax.swing.JTextField();
        textfield1 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        textfield3.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 48)); // NOI18N
        textfield3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfield3.setBorder(null);
        textfield3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield3KeyTyped(evt);
            }
        });
        getContentPane().add(textfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 720, 50, 50));

        textfield2.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 48)); // NOI18N
        textfield2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfield2.setBorder(null);
        textfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield2KeyTyped(evt);
            }
        });
        getContentPane().add(textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, 50, 50));

        textfield1.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 0, 48)); // NOI18N
        textfield1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfield1.setBorder(null);
        textfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield1FocusGained(evt);
            }
        });
        textfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfield1KeyTyped(evt);
            }
        });
        getContentPane().add(textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 720, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradefive_threefillintheblanks1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield1KeyTyped
        TextLimiter(evt, textfield1);
    }//GEN-LAST:event_textfield1KeyTyped

    private void textfield2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield2KeyTyped
        TextLimiter(evt, textfield2);
    }//GEN-LAST:event_textfield2KeyTyped

    private void textfield3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield3KeyTyped
        TextLimiter(evt, textfield3);
    }//GEN-LAST:event_textfield3KeyTyped

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbuttonhover.png")));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextbutton.png")));
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        int index = Integer.parseInt(data.get(0));
        AnswerVerifier(index);
        LoadDatabaseComponents();
        if(initialization){
            BackgroundChanger();
            TextFieldPositioner();
        } 
    }//GEN-LAST:event_NextButtonMousePressed

    private void textfield1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield1FocusGained
        if(!initialization){
            BackgroundChanger();
            TextFieldPositioner();
            initialization = true;
        } 
    }//GEN-LAST:event_textfield1FocusGained

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        sfx.ClickFX();
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
            java.util.logging.Logger.getLogger(LevelThreeFillInTheBlanks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelThreeFillInTheBlanks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelThreeFillInTheBlanks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelThreeFillInTheBlanks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelThreeFillInTheBlanks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel NextButton;
    private javax.swing.JLabel background;
    private javax.swing.JTextField textfield1;
    private javax.swing.JTextField textfield2;
    private javax.swing.JTextField textfield3;
    // End of variables declaration//GEN-END:variables
}
