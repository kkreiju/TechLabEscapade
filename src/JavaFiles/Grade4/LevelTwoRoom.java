package Grade4;

import Main.Progress;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LevelTwoRoom extends javax.swing.JFrame {

    private Timer mousetimer;
    private Timer keyboardandcputimer;
    private int timeleft = 3;
    private int index = 1;
    LevelTwoDisplay ltd = new LevelTwoDisplay();
    
    String database = "src\\Database\\4.2database.txt";
    Progress progress = new Progress();
    public String saved = "src\\Database\\savedprogress.txt";
    public String currentprogress = "src\\Database\\currentprogress.txt";
    public ArrayList<String> currentdata = new ArrayList<String>();
    ArrayList<String> data = new ArrayList<String>();
    
    boolean complete = false;
    
    public LevelTwoRoom() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        CheckIfCompleted();
        
        mousetimer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateMouseTimer(timeleft, index);
            }
        });
        
        keyboardandcputimer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateKeyboardandCPUTimer(timeleft);
            }
        });
    }
    
    private void updateMouseTimer(int timeleft, int index) {
        this.timeleft--;
        if(this.index >= 1 && this.index <= 3){
            if (this.timeleft < 0) {
                this.timeleft = 3;
                this.index++;
                ltd.LoadImage(this.index);
                updateMouseTimer(3, this.index);
            }
        }
        else if(this.index == 4){
            mousetimer.stop();
            ltd.dispose();
            LevelTwoMouse LTM = new LevelTwoMouse();
            LTM.setLocationRelativeTo(null);
            LTM.setResizable(false);
            LTM.setVisible(true);
            dispose();
        }
    }
    
    private void updateKeyboardandCPUTimer(int timeleft) {
        this.timeleft--;
        if (this.timeleft < 0) {
            this.timeleft = 3;
            keyboardandcputimer.stop();
            ltd.dispose();
            show();
        }
    }
    
    public void DisplayMouse(){
        this.index = 1;
        ltd.LoadImage(1);
        Display();
        mousetimer.start();
    }
    
    public void DisplayMonitor(){
        this.index = 4;
        ltd.LoadImage(4);
        Display();
        keyboardandcputimer.start();
    }
    
    public void DisplayCPU(){
        this.index = 5;
        ltd.LoadImage(5);
        Display();
        keyboardandcputimer.start();
    }
    
    public void Display(){
        dispose();
        ltd.setLocationRelativeTo(null);
        ltd.setResizable(false);
        ltd.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        KeyboardLabel = new javax.swing.JLabel();
        CPULabel = new javax.swing.JLabel();
        MonitorLabel = new javax.swing.JLabel();
        MouseLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        KeyboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KeyboardLabelMousePressed(evt);
            }
        });
        getContentPane().add(KeyboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 210, 120));

        CPULabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CPULabelMousePressed(evt);
            }
        });
        getContentPane().add(CPULabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, 100, 140));

        MonitorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MonitorLabelMousePressed(evt);
            }
        });
        getContentPane().add(MonitorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 430, 140, 130));

        MouseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseLabelMousePressed(evt);
            }
        });
        getContentPane().add(MouseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 570, 40, 30));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roombackground.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbuttonhover.png")));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png")));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        data = progress.ReadProgressDBComponents(database);
        if(!complete){
            for(int i = 0 ; i < data.size(); i++){
                data.set(i, "false");
            }
            progress.SaveProgressDBComponents(data, database);
        }  
        GradeFourMenu gfm = new GradeFourMenu();
        gfm.setLocationRelativeTo(null);
        gfm.setResizable(false);
        gfm.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void MouseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseLabelMousePressed
        DisplayMouse();
    }//GEN-LAST:event_MouseLabelMousePressed

    private void KeyboardLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyboardLabelMousePressed
        LevelTwoKeyboardOne KBO = new LevelTwoKeyboardOne();
        KBO.setLocationRelativeTo(null);
        KBO.setResizable(false);
        KBO.setVisible(true);
        dispose();
    }//GEN-LAST:event_KeyboardLabelMousePressed

    private void CPULabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPULabelMousePressed
        DisplayCPU();
        data = progress.ReadProgressDBComponents(database);
        data.set(1, "true");
        progress.SaveProgressDBComponents(data, database);
        System.out.println("LEVEL TWO ROOM: " + data);
        CheckIfCompleted();
    }//GEN-LAST:event_CPULabelMousePressed

    private void MonitorLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonitorLabelMousePressed
        DisplayMonitor();
        data = progress.ReadProgressDBComponents(database);
        data.set(2, "true");
        progress.SaveProgressDBComponents(data, database);
        System.out.println("LEVEL TWO ROOM: " + data);
        CheckIfCompleted();
    }//GEN-LAST:event_MonitorLabelMousePressed

    private void CheckIfCompleted(){
        data = progress.ReadProgressDBComponents(database);
        System.out.println("LEVEL TWO ROOM: " + data);
        for(int i = 0 ; i < data.size(); i++){
            if(data.get(i).equals("true")){
                complete = true;
            }
            else{
                complete = false;
                break;
            }
        }
        
        if(complete){
            currentdata = progress.ReadProgressDBComponents(currentprogress);
            currentdata.set(2, currentdata.get(2).substring(0, currentdata.get(2).indexOf(':')) + ": " + true);
            progress.SaveProgressDBComponents(currentdata, currentprogress);
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
            java.util.logging.Logger.getLogger(LevelTwoRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTwoRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTwoRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTwoRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTwoRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel CPULabel;
    private javax.swing.JLabel KeyboardLabel;
    private javax.swing.JLabel MonitorLabel;
    private javax.swing.JLabel MouseLabel;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
