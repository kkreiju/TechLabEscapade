package Main;

import javax.swing.ImageIcon;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import sfx.SoundEffects;

public class Menu extends javax.swing.JFrame {

    SoundEffects sfx = new SoundEffects();
    Progress progress = new Progress();
    public String saved = "src\\Database\\savedprogress.txt";
    public ArrayList<String> saveddata = new ArrayList<String>();
    public String currentprogress = "src\\Database\\currentprogress.txt";
    public ArrayList<String> currentdata = new ArrayList<String>();
    
    public Menu() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        LoadSavedProgressToCurrent();
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ExitButton = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        PlayButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        setBackground(new java.awt.Color(204, 102, 255));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("progress arraylist");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 640, -1, -1));

        jButton2.setText("saved arraylist");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 600, -1, -1));

        jButton3.setText("reset all to false");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 690, -1, -1));

        jButton4.setText("set 4 5 to true");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 740, -1, -1));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitbutton.png"))); // NOI18N
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonMousePressed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1439, 152, -1, -1));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomenu.png"))); // NOI18N
        getContentPane().add(LogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebutton.png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SaveButtonMousePressed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 612, -1, -1));

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbutton.png"))); // NOI18N
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PlayButtonMousePressed(evt);
            }
        });
        getContentPane().add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 439, 320, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbuttonhovered.png")));
    }//GEN-LAST:event_mouseEntered

    private void PlayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseExited
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbutton.png")));
    }//GEN-LAST:event_PlayButtonMouseExited

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebuttonhovered.png")));
    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/savebutton.png")));
    }//GEN-LAST:event_SaveButtonMouseExited

    private void PlayButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMousePressed
        sfx.ClickFX();
        GradeMenu gm = new GradeMenu();
        gm.setLocationRelativeTo(null);
        gm.setResizable(false);
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_PlayButtonMousePressed

    private void ExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMousePressed
        sfx.ClickFX();
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMousePressed

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitbuttonhover.png")));
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitbutton.png")));
    }//GEN-LAST:event_ExitButtonMouseExited

    private void SaveButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMousePressed
        sfx.ClickFX();
        try{
            SaveCurrentProgress();
            JOptionPane.showMessageDialog(null, "Saved.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unable to save.");
        }
        
    }//GEN-LAST:event_SaveButtonMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Progress prog = new Progress();
        ArrayList<String> test = new ArrayList<String>();
        test = prog.ReadProgressDBComponents(currentprogress);
        System.out.println("Read: " + currentprogress + ": "+ test);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Progress prog = new Progress();
        ArrayList<String> test = new ArrayList<String>();
        test = prog.ReadProgressDBComponents(saved);
        System.out.println("Read: " + saved + ": "+ test);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Progress prog = new Progress();
        ArrayList<String> test = new ArrayList<String>();
        test = prog.ReadProgressDBComponents(saved);
        String settofalse = ": false";
        
        for(int i = 1 ; i < test.size(); i++){
            test.set(i, test.get(i).substring(0, test.get(i).indexOf(':')) + settofalse);
        }
        
        System.out.println(test);
        prog.SaveProgressDBComponents(test, saved);
        
        System.out.println("Please Restart.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Progress prog = new Progress();
        ArrayList<String> test = new ArrayList<String>();
        test = prog.ReadProgressDBComponents(saved);
        String settotrue = ": true";
        
        for(int i = 1 ; i < test.size() - 1; i++){
            test.set(i, test.get(i).substring(0, test.get(i).indexOf(':')) + settotrue);
        }
        
        System.out.println(test);
        prog.SaveProgressDBComponents(test, saved);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LoadSavedProgressToCurrent(){
        saveddata = progress.ReadProgressDBComponents(saved);
        if(saveddata.get(0).equals("false")){
            saveddata.set(0, "true");
            progress.SaveProgressDBComponents(saveddata, currentprogress);
            progress.SaveProgressDBComponents(saveddata, saved);
            System.out.println("Application initialized.");
        }
        else{
            System.out.println("Application already initialized.");
        }
    }
    
    private void SaveCurrentProgress(){
        try {
            FileInputStream fis = new FileInputStream(currentprogress);
            ObjectInputStream ois = new ObjectInputStream(fis);
            currentdata = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
        }
        progress.SaveProgressDBComponents(currentdata, saved);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel PlayButton;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
