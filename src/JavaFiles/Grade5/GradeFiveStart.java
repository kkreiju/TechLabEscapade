
package Grade5;

import Main.GradeMenu;


public class GradeFiveStart extends javax.swing.JFrame {

  
    public GradeFiveStart() {
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
       
    }//GEN-LAST:event_StartButotnMousePressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeFiveStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StartButotn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
