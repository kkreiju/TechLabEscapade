package Main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Progress prog = new Progress();
        ArrayList<String> data = new ArrayList<String>();
        
        //set to false
        data = prog.ReadProgressDBComponents("src\\Database\\savedprogress.txt");
        data.set(0, "false");
        prog.SaveProgressDBComponents(data, "src\\Database\\savedprogress.txt");
        
        //4.2 set all to false once detected if not completed
        if(data.get(2).substring(data.get(2).indexOf(' ') + 1, data.get(2).length()).equals("false")){
            data = prog.ReadProgressDBComponents("src\\Database\\4.2database.txt");
            for(int i = 0 ; i < data.size(); i++){
                data.set(i, "false");
            }
            prog.SaveProgressDBComponents(data, "src\\Database\\4.2database.txt");
        }
        
        TermsOfUse tou = new TermsOfUse();
        tou.show();
        tou.setLocationRelativeTo(null);
    }
    
}
