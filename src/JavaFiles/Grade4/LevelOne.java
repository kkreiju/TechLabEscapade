
package Grade4;

public class LevelOne extends javax.swing.JFrame {
    public LevelOne() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MouseTextField = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechLab Escapade");
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MouseTextField.setBackground(new java.awt.Color(0, 0, 0));
        MouseTextField.setForeground(new java.awt.Color(255, 255, 255));
        MouseTextField.setText("jTextField1");
        getContentPane().add(MouseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 210, 120));

        EnterButton.setText("ENTER");
        EnterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnterButtonMousePressed(evt);
            }
        });
        getContentPane().add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 710, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 1610, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMousePressed
        String input = MouseTextField.getText();
        if(input.equals("mouse")){
            System.out.print("Good job!");
        }
        else{
            System.out.print("Try Again!");
        }
    }//GEN-LAST:event_EnterButtonMousePressed

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
            java.util.logging.Logger.getLogger(LevelOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnterButton;
    private javax.swing.JTextField MouseTextField;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
