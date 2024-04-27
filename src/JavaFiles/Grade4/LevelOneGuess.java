package Grade4;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteLayout;

    public class LevelOneGuess extends javax.swing.JFrame {
    
    private Timer timer;
    private int TimeLeft;
    
    public LevelOneGuess() {
        //setUndecorated(true);
        LoadDatabaseComponents();
        initComponents();
        LoadGuess();
            
        // Initialize the timer with 1-second delay
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });
        
        TimeLeft = 12; 

        
        startTimer();
        
    }
    
    String filename = "src\\Database\\guessnumbers.txt";
    ArrayList<String> worddata = new ArrayList<String>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimeLabel = new javax.swing.JLabel();
        AnswerTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        EnterButton = new javax.swing.JLabel();
        TextfieldPicture = new javax.swing.JLabel();
        Picture = new javax.swing.JLabel();
        BackGroundGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TimeLabel.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        TimeLabel.setText("Time Left: 12");
        getContentPane().add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 80));

        AnswerTextfield.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        AnswerTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AnswerTextfield.setBorder(null);
        AnswerTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AnswerTextfieldKeyPressed(evt);
            }
        });
        getContentPane().add(AnswerTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 380, 40));

        jButton1.setText("RESET TO INDEX 1 (DUMMY)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 700, -1, -1));

        EnterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enterbutton.png"))); // NOI18N
        EnterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnterButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnterButtonMousePressed(evt);
            }
        });
        getContentPane().add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 574, -1, -1));

        TextfieldPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextfieldPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textfield.png"))); // NOI18N
        getContentPane().add(TextfieldPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 429, -1, -1));

        Picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordmouse.png"))); // NOI18N
        getContentPane().add(Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 277, -1, -1));

        BackGroundGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(BackGroundGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMouseEntered
        EnterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enterbuttonhover.png")));
    }//GEN-LAST:event_EnterButtonMouseEntered

    private void EnterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMouseExited
        EnterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enterbutton.png")));
    }//GEN-LAST:event_EnterButtonMouseExited

    private void EnterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMousePressed
        VerifyAnswer();
    }//GEN-LAST:event_EnterButtonMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        worddata.set(0, 1 + "");
        SaveDatabaseComponents();
        LoadGuess();
        AnswerTextfield.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AnswerTextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnswerTextfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            VerifyAnswer();
        }
    }//GEN-LAST:event_AnswerTextfieldKeyPressed
    
    
    private void startTimer() {
        timer.start();
    }

    private void stopTimer() {
        timer.stop();
    }

    private void updateTimer() {
        TimeLeft--;
        if (TimeLeft >= 0) {
          TimeLabel.setText("Time Left:" + TimeLeft);
        } else {
            TimeLabel.setText("Time's up!");
            stopTimer();
        }
    }
    
    private void VerifyAnswer(){
        System.out.println(worddata);
        int index = Integer.parseInt(worddata.get(0));
        System.out.println("INDEX: " + index);
        String answer = AnswerTextfield.getText().toLowerCase();
        if(worddata.get(index).toLowerCase().equals(answer)){
            worddata.set(0, (index + 1) + "");
            JOptionPane.showMessageDialog(null, "ANSWER CORRECT");
            SaveDatabaseComponents();
            LoadGuess();
            AnswerTextfield.setText("");
        }  
        else
            JOptionPane.showMessageDialog(null, "ANSWER INCORRECT");
    }
    
    private void LoadDatabaseComponents(){
      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         worddata = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "guessnumbers.txt not found");
         e.printStackTrace();
      }
    }
    
    private void SaveDatabaseComponents(){
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(worddata);
            oos.close();
            fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
    }
    
    private void LoadGuess(){
        System.out.println("LOADGUESS:" + worddata);
        int index = Integer.parseInt(worddata.get(0));
        if(index == 1)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordmouse.png")));
        else if(index == 2)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordkeyboard.png")));
        else if(index == 3)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordmonitor.png")));
        else if(index == 4)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordcpu.png")));
        else if(index == 5)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordheadset.png")));
        else if(index == 6)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordspeaker.png")));
        else if(index == 7)
            Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessthewordprinter.png")));
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
            java.util.logging.Logger.getLogger(LevelOneGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelOneGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelOneGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelOneGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelOneGuess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerTextfield;
    private javax.swing.JLabel BackGroundGrade;
    private javax.swing.JLabel EnterButton;
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel TextfieldPicture;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
