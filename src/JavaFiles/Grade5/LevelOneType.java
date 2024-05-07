/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grade5;

import Grade4.LevelTwoRoom;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author VJ
 */
public class LevelOneType extends javax.swing.JFrame {

    /**
     * Creates new form LevelOneType
     */
    public LevelOneType() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExcelText = new javax.swing.JTextField();
        PdfText = new javax.swing.JTextField();
        MsWordText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExcelText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ExcelText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ExcelText.setBorder(null);
        ExcelText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ExcelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExcelTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ExcelTextKeyTyped(evt);
            }
        });
        getContentPane().add(ExcelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 240, 50));

        PdfText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PdfText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PdfText.setBorder(null);
        PdfText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PdfTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PdfTextKeyTyped(evt);
            }
        });
        getContentPane().add(PdfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 240, 50));

        MsWordText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        MsWordText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MsWordText.setBorder(null);
        MsWordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MsWordTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MsWordTextKeyTyped(evt);
            }
        });
        getContentPane().add(MsWordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5levelonebgtest.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MsWordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MsWordTextKeyPressed
        
        String answerMS = MsWordText.getText().trim().toUpperCase();
        String answerXL = ExcelText.getText().trim().toUpperCase();
        String answerPDF = PdfText.getText().trim().toUpperCase();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(answerMS.equals("WORD") && answerXL.equals("EXCEL") && answerPDF.equals("PDF")){
            JOptionPane.showMessageDialog(this, "Correct");
            GradeFiveMenu GFV = new GradeFiveMenu();
            GFV.setLocationRelativeTo(null);
            GFV.setResizable(false);
            GFV.setVisible(true);
            dispose();
            }
            else if(answerMS.isEmpty() || answerXL.isEmpty() || answerPDF.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill in the Blanks");
            }
            else if(!answerMS.equals("WORD") || !answerXL.equals("EXCEL") || !answerPDF.equals("PDF")){
            JOptionPane.showMessageDialog(this, "Incorrect");
        }
        }
        
        
    }//GEN-LAST:event_MsWordTextKeyPressed

    private void ExcelTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExcelTextKeyPressed
        
        String answerMS = MsWordText.getText().trim().toUpperCase();
        String answerXL = ExcelText.getText().trim().toUpperCase();
        String answerPDF = PdfText.getText().trim().toUpperCase();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(answerMS.equals("WORD") && answerXL.equals("EXCEL") && answerPDF.equals("PDF")){
            JOptionPane.showMessageDialog(this, "Correct");
            GradeFiveMenu GFV = new GradeFiveMenu();
            GFV.setLocationRelativeTo(null);
            GFV.setResizable(false);
            GFV.setVisible(true);
            dispose();
            }
            else if(answerMS.isEmpty() || answerXL.isEmpty() || answerPDF.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill in the Blanks");
            }
            else if(!answerMS.equals("WORD") || !answerXL.equals("EXCEL") || !answerPDF.equals("PDF")){
            JOptionPane.showMessageDialog(this, "Incorrect");
        }
            
        }
        
        
    }//GEN-LAST:event_ExcelTextKeyPressed

    private void PdfTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PdfTextKeyPressed
        String answerMS = MsWordText.getText().trim().toUpperCase();
        String answerXL = ExcelText.getText().trim().toUpperCase();
        String answerPDF = PdfText.getText().trim().toUpperCase();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           
        if(answerMS.equals("WORD") && answerXL.equals("EXCEL") && answerPDF.equals("PDF")){
        JOptionPane.showMessageDialog(this, "Correct");
        GradeFiveMenu GFV = new GradeFiveMenu();
        GFV.setLocationRelativeTo(null);
        GFV.setResizable(false);
        GFV.setVisible(true);
        dispose();
        }
        else if(answerMS.isEmpty() || answerXL.isEmpty() || answerPDF.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill in the Blanks");
            }
        else if(!answerMS.equals("WORD") || !answerXL.equals("EXCEL") || !answerPDF.equals("PDF")){
            JOptionPane.showMessageDialog(this, "Incorrect");
        }
            
        }
    }//GEN-LAST:event_PdfTextKeyPressed

    private void MsWordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MsWordTextKeyTyped
        TextLimiter(evt, MsWordText, 4);
    }//GEN-LAST:event_MsWordTextKeyTyped

    private void ExcelTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExcelTextKeyTyped
        TextLimiter(evt, ExcelText, 5);
    }//GEN-LAST:event_ExcelTextKeyTyped

    private void PdfTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PdfTextKeyTyped
        TextLimiter(evt, PdfText, 3);
    }//GEN-LAST:event_PdfTextKeyTyped

    private void TextLimiter(java.awt.event.KeyEvent evt,javax.swing.JTextField textfield, int limit){
        if (textfield.getText().length() >= limit)
            evt.consume();
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c))
            evt.setKeyChar(Character.toUpperCase(c));
    }
    
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
            java.util.logging.Logger.getLogger(LevelOneType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelOneType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelOneType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelOneType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelOneType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExcelText;
    private javax.swing.JTextField MsWordText;
    private javax.swing.JTextField PdfText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
