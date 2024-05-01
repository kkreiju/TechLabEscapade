package Grade4;

import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LevelThreeWordPuzzle extends JPanel implements MouseListener{
    private JLabel[][] labels;
    private Point firstLabelClicked;
    private String[] imagePaths = {"image_1.png", "image_2.png", 
                                   "image_3.png", "image_4.png"};
    
    public LevelThreeWordPuzzle(int rows, int cols, int padding) {
        setLayout(new GridLayout(rows, cols));
        
        setBorder(BorderFactory.createEmptyBorder(padding, padding, padding, padding));
        
        labels = new JLabel[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ImageIcon icon = new ImageIcon(imagePaths[i * cols + j]);
                JLabel label = new JLabel(icon);
                label.addMouseListener(this);
                labels[i][j] = label;
                add(label);
            }
        }
    }
    
    
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        labelClicked(label);
    }
    
    private void labelClicked(JLabel label) {
        Point labelPosition = findLabelPosition(label);
        
        if (firstLabelClicked == null) {
            firstLabelClicked = labelPosition;
        } else {
            swapLabels(labelPosition, firstLabelClicked);
            firstLabelClicked = null;
        }
    }
    
    private Point findLabelPosition(JLabel label) {
        for (int i = 0; i < labels.length; i++) {
            for (int j = 0; j < labels[i].length; j++) {
                if (labels[i][j] == label) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }
    
    private void swapLabels(Point label1Pos, Point label2Pos) {
        Icon tempIcon = labels[label1Pos.x][label1Pos.y].getIcon();
        labels[label1Pos.x][label1Pos.y].setIcon(labels[label2Pos.x][label2Pos.y].getIcon());
        labels[label2Pos.x][label2Pos.y].setIcon(tempIcon);
    }
    
    
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swap Puzzle Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int padding = 50; // Adjust the padding as needed
        LevelThreeWordPuzzle puzzleGame = new LevelThreeWordPuzzle(2, 2, padding);
        frame.getContentPane().add(puzzleGame);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
