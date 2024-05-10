package Main;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Progress {
    public String saved = "src\\Database\\savedprogress.txt";
    public ArrayList<String> saveddata = new ArrayList<String>();
    
    public ArrayList<String> ReadProgressDBComponents(String fileinput){
        try {
            FileInputStream fis = new FileInputStream(fileinput);
            ObjectInputStream ois = new ObjectInputStream(fis);
            saveddata = (ArrayList<String>) ois.readObject();
            //System.out.println("Read: " + fileinput + ": "+ saveddata);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return saveddata;
    }
    
    
    public void SaveProgressDBComponents(ArrayList<String> currentprogressdata, String savingfile){
        try {
            FileOutputStream fos = new FileOutputStream(savingfile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //System.out.println("Save: " + savingfile + ": " + currentprogressdata);
            oos.writeObject(currentprogressdata);
            oos.close();
            fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
    }
}
