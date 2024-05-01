package Grade4;

import java.util.ArrayList;
import java.io.*;
import javax.swing.ImageIcon;

public class LevelOneDevice extends javax.swing.JFrame {
    public LevelOneDevice() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }
    
    String filename = "src\\Database\\guessnumbers.txt";
    ArrayList<String> worddata = new ArrayList<String>();
    
    public void LoadDatabaseComponents(){
      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         worddata = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
      }
    }
    
    public void LoadDevice(){
        int index = Integer.parseInt(worddata.get(0));
        if(index == 1)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicemouse.png")));
        else if(index == 2)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicekeyboard.png")));
        else if(index == 3)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicemonitor.png")));
        else if(index == 4)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicecpu.png")));
        else if(index == 5)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deviceheadset.png")));
        else if(index == 6)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicespeaker.png")));
        else if(index == 7)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deviceprinter.png")));
    }
    
    public void LoadDescription(){
        int index = Integer.parseInt(worddata.get(0));
        if(index == 1)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionmouse.png")));
        else if(index == 2)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionkeyboard.png")));
        else if(index == 3)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionmonitor.png")));
        else if(index == 4)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptioncpu.png")));
        else if(index == 5)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionheadset.png")));
        else if(index == 6)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionspeaker.png")));
        else if(index == 7)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descriptionprinter.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devicemouse.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LevelOneDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelOneDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelOneDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelOneDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelOneDevice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
