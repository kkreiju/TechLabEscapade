package Grade6;

import java.util.ArrayList;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GradeSixAnswer extends javax.swing.JFrame {

    String filename = "src\\Database\\gradesixguess.txt";
    ArrayList<String> data = new ArrayList<String>();
    
    public GradeSixAnswer() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        LoadGuessComponents();
        initComponents();
    }
    
    private void LoadGuessComponents(){
      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         data = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "gradesixguess.txt not found");
         e.printStackTrace();
      }
    }
    
    public void LoadAnswer(){
        LoadGuessComponents();
        int index = Integer.parseInt(data.get(0));
        index--; //haha di ka mo fix?
        if(index == 1)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixanswer1.png")));
        else if(index == 2)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixanswer2.png")));
        else if(index == 3)
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixanswer3.png")));
        else{
            data.set(0, 1 + "");
            SaveDatabaseComponents();
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

        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradesixanswer1.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(GradeSixAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeSixAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeSixAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeSixAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeSixAnswer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
