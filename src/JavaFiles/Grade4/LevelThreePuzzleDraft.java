package Grade4;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class LevelThreePuzzleDraft extends javax.swing.JFrame {

    String[] images = {"wordpuzzle1.png", "wordpuzzle2.png", "wordpuzzle3.png", "wordpuzzle4.png"};
    boolean clicked = false;
    String clickedimage;
    int clickedgrid;
    public LevelThreePuzzleDraft() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }
    
    private void WordPuzzlePictures(String wordpuzzlenumber){
        
    }
    
    private void ReplacedImage(String selectedimage, int assignedgrid){
        if(assignedgrid == 1)
            grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + selectedimage)));
        else if(assignedgrid == 2)
            grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + selectedimage)));
        else if(assignedgrid == 3)
            grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + selectedimage)));
        else
            grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + selectedimage)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedGrid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        grid1 = new javax.swing.JLabel();
        grid2 = new javax.swing.JLabel();
        grid3 = new javax.swing.JLabel();
        grid4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectedGrid.setMaximumSize(new java.awt.Dimension(201, 276));
        selectedGrid.setMinimumSize(new java.awt.Dimension(201, 276));
        selectedGrid.setPreferredSize(new java.awt.Dimension(201, 276));
        getContentPane().add(selectedGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 150, -1, -1));

        jPanel1.setOpaque(false);

        grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzle1.png"))); // NOI18N
        grid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grid1MousePressed(evt);
            }
        });

        grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzle2.png"))); // NOI18N
        grid2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grid2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grid2MousePressed(evt);
            }
        });

        grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzle3.png"))); // NOI18N
        grid3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grid3MousePressed(evt);
            }
        });

        grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzle4.png"))); // NOI18N
        grid4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grid4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grid1)
                        .addGap(0, 0, 0)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid2)
                    .addComponent(grid4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid1)
                    .addComponent(grid2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid3)
                    .addComponent(grid4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 400, 552));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grid2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid2MousePressed
        if(!clicked){
            clicked = true;
            grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png"))); //change
            clickedimage = images[1]; //change
            clickedgrid = 2; //change
            selectedGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
        }
        else{
            clicked = false;
            clickedimage = images[clickedgrid - 1];
            
            grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage))); //change
            selectedGrid.setIcon(null);
            
            images[clickedgrid - 1] = images[1]; //change value
            images[1] = clickedimage; //change assignment, value
            ReplacedImage(images[clickedgrid - 1], clickedgrid);
        }
    }//GEN-LAST:event_grid2MousePressed

    private void grid1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid1MousePressed
        if(!clicked){
            clicked = true;
            grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png"))); //change
            clickedimage = images[0]; //change
            clickedgrid = 1; //change
            selectedGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
        }
        else{
            clicked = false;
            clickedimage = images[clickedgrid - 1];
            
            grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage))); //change
            selectedGrid.setIcon(null);
            
            images[clickedgrid - 1] = images[0]; //change value
            images[0] = clickedimage; //change assignment, value
            ReplacedImage(images[clickedgrid - 1], clickedgrid);
        }
    }//GEN-LAST:event_grid1MousePressed

    private void grid3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid3MousePressed
        if(!clicked){
            clicked = true;
            grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png"))); //change
            clickedimage = images[2]; //change
            clickedgrid = 3; //change
            selectedGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
        }
        else{
            clicked = false;
            clickedimage = images[clickedgrid - 1];
            
            grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage))); //change
            selectedGrid.setIcon(null);
            
            images[clickedgrid - 1] = images[2]; //change value
            images[2] = clickedimage; //change assignment, value
            ReplacedImage(images[clickedgrid - 1], clickedgrid);
        }
    }//GEN-LAST:event_grid3MousePressed

    private void grid4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid4MousePressed
        if(!clicked){
            clicked = true;
            grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png"))); //change
            clickedimage = images[3]; //change
            clickedgrid = 4; //change
            selectedGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
        }
        else{
            clicked = false;
            clickedimage = images[clickedgrid - 1];
            
            grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage))); //change
            selectedGrid.setIcon(null);
            
            images[clickedgrid - 1] = images[3]; //change value
            images[3] = clickedimage; //change assignment, value
            ReplacedImage(images[clickedgrid - 1], clickedgrid);
        }
    }//GEN-LAST:event_grid4MousePressed

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
            java.util.logging.Logger.getLogger(LevelThreePuzzleDraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzleDraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzleDraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzleDraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelThreePuzzleDraft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel grid1;
    private javax.swing.JLabel grid2;
    private javax.swing.JLabel grid3;
    private javax.swing.JLabel grid4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selectedGrid;
    // End of variables declaration//GEN-END:variables
}
