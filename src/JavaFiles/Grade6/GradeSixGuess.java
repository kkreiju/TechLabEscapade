package Grade6;

import Main.GradeMenu;
import Main.Progress;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class GradeSixGuess extends javax.swing.JFrame {

    String filename = "src\\Database\\gradesixguess.txt";
    ArrayList<String> data = new ArrayList<String>();
    private Timer timer;
    private int timeleft = 5;
    private boolean visible = false;
    GradeSixAnswer gsa = new GradeSixAnswer();
    int correct = 0;
    
    public GradeSixGuess() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        LoadGuessComponents();
        data.set(0, 1 + "");
        SaveDatabaseComponents();
        initComponents();
        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer(timeleft);
            }
        });
    }
    
    private void LoadGuessComponents(){
      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         data = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "db not found");
         e.printStackTrace();
      }
    }
    
    private void updateTimer(int timeleft) {
        this.timeleft--;
        if (timeleft > 0) {
            if(!visible){
                visible = true;
            }
        } else {
            gsa.dispose();
            this.timeleft = 5;
            timer.stop();
            visible = false;
            LoadQuestions();
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
    
    private void LoadQuestions(){
        int index = Integer.parseInt(data.get(0));
        if(index == 1){
            questionlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixquestion1.png")));
            answerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessenger.png")));
            answerB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessages.png")));
            answerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmeetc.png")));
            show();
        }
        else if(index == 2){
            questionlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixquestion2.png")));
            answerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessenger.png")));
            answerB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessages.png")));
            answerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessfacebook.png")));
            show();
        }
        else if(index == 3){
            questionlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixquestion3.png")));
            answerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessenger.png")));
            answerB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessinstagram.png")));
            answerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessfacebook.png")));
            show();
        }   
        else{
            data.set(0, 1 + "");
            SaveDatabaseComponents();
            
            String database = "src\\Database\\currentprogress.txt";
            Progress progress = new Progress();
            ArrayList<String> data = new ArrayList<String>();
            data = progress.ReadProgressDBComponents(database);
            if(correct == 3){
                data.set(9, data.get(9).substring(0, data.get(9).indexOf(':')) + ": true");
                progress.SaveProgressDBComponents(data, database);
            }
            
            GradeMenu gm = new GradeMenu();
            gm.setLocationRelativeTo(null);
            gm.setResizable(false);
            gm.setVisible(true);
            dispose();
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerC = new javax.swing.JLabel();
        answerB = new javax.swing.JLabel();
        answerA = new javax.swing.JLabel();
        questionlabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmeet.png"))); // NOI18N
        answerC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                answerCMousePressed(evt);
            }
        });
        getContentPane().add(answerC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 505, -1, -1));

        answerB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessages.png"))); // NOI18N
        answerB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                answerBMousePressed(evt);
            }
        });
        getContentPane().add(answerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 505, -1, -1));

        answerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessmessenger.png"))); // NOI18N
        answerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                answerAMousePressed(evt);
            }
        });
        getContentPane().add(answerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 505, -1, -1));

        questionlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixquestion1.png"))); // NOI18N
        getContentPane().add(questionlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 170, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerAMousePressed
        answer("a");
    }//GEN-LAST:event_answerAMousePressed

    private void answerBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerBMousePressed
        answer("b");
    }//GEN-LAST:event_answerBMousePressed

    private void answerCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerCMousePressed
        answer("c");
    }//GEN-LAST:event_answerCMousePressed

    private void answer(String answer){
        int index = Integer.parseInt(data.get(0));
        if(answer.equals(data.get(index))){
            JOptionPane.showMessageDialog(null, "CORRECT");
            correct++;
        }
        else{
            JOptionPane.showMessageDialog(null, "INCORRECT");
        }
        data.set(0, (index + 1) + "");
        SaveDatabaseComponents();
        gsa.LoadAnswer();
        gsa.setLocationRelativeTo(null);
        gsa.setResizable(false);
        gsa.setVisible(true);
        dispose();
        timer.start();
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
            java.util.logging.Logger.getLogger(GradeSixGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeSixGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeSixGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeSixGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeSixGuess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerA;
    private javax.swing.JLabel answerB;
    private javax.swing.JLabel answerC;
    private javax.swing.JLabel background;
    private javax.swing.JLabel questionlabel;
    // End of variables declaration//GEN-END:variables
}
