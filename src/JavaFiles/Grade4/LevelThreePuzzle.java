package Grade4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sfx.SoundEffects;

public class LevelThreePuzzle extends javax.swing.JFrame {

    String[] images = {"wordpuzzle2.png", "wordpuzzle4.png", "wordpuzzle1.png", "wordpuzzle3.png"};
    boolean clicked = false;
    String clickedimage;
    int clickedgrid;
    private Timer timer;
    private int timeleft = 3;
    LevelThreeDisplayWord ltdw = new LevelThreeDisplayWord();
    SoundEffects sfx = new SoundEffects();
    
    public LevelThreePuzzle() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
        grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + images[0])));
        grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + images[1])));
        grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + images[2])));
        grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + images[3])));
        
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer(timeleft);
            }
        });
    }
    
    private void updateTimer(int timeleft) {
        this.timeleft--;
        if (timeleft < 0) {
            LevelThreeFillInTheBlanks ltfitb = new LevelThreeFillInTheBlanks();
            ltfitb.setLocationRelativeTo(null);
            ltfitb.setResizable(false);
            ltfitb.setVisible(true);
            ltdw.dispose();
            this.timeleft = 3;
            timer.stop();
        }
    }
    
    private void WordPuzzlePictures(int clickedgrid, int imagesindex, int selectedindex){
        sfx.ClickFX();
        if(!clicked){
            clicked = true;
            if(imagesindex == 0)
                grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png")));
            else if(imagesindex == 1)
                grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png")));
            else if(imagesindex == 2)
                grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png")));
            else
                grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordpuzzletransparent.png")));
            this.clickedimage = images[imagesindex]; //change
            this.clickedgrid = clickedgrid; //change
            selectedGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
        }
        else{
            clicked = false;
            clickedimage = images[this.clickedgrid - 1];
            if(selectedindex == 0)
                grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
            else if(selectedindex == 1)
                grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
            else if(selectedindex == 2)
                grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));
            else
                grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + clickedimage)));

            selectedGrid.setIcon(null);
            
            images[this.clickedgrid - 1] = images[imagesindex]; //change value
            images[imagesindex] = clickedimage; //change assignment, value
            ReplacedImage(images[this.clickedgrid - 1], this.clickedgrid);
        }
        PuzzleVerifier();
    }
    
    private void PuzzleVerifier(){
        boolean correct = false;
        if(images[0] == "wordpuzzle1.png" && images[1] == "wordpuzzle2.png" && images[2] == "wordpuzzle3.png" && images[3] == "wordpuzzle4.png")
            correct = true;
        else
            correct = false;
        if(correct){
            sfx.CorrectFX();
            JOptionPane.showMessageDialog(null, "PUZZLE DONE!");
            ltdw.setLocationRelativeTo(null);
            ltdw.setResizable(false);
            ltdw.setVisible(true);
            dispose();
            timer.start();
        }    
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
                    .addComponent(grid1))
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
        WordPuzzlePictures(2, 1, 1);
    }//GEN-LAST:event_grid2MousePressed

    private void grid1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid1MousePressed
        WordPuzzlePictures(1, 0, 0);
    }//GEN-LAST:event_grid1MousePressed

    private void grid3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid3MousePressed
        WordPuzzlePictures(3, 2, 2);
    }//GEN-LAST:event_grid3MousePressed

    private void grid4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid4MousePressed
        WordPuzzlePictures(4, 3, 3);
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
            java.util.logging.Logger.getLogger(LevelThreePuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelThreePuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelThreePuzzle().setVisible(true);
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
