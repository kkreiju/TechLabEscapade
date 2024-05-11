package sfx;
import java.io.*;
import javax.sound.sampled.*;

public class SoundEffects {
  public void ClickFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\click.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }  
  
  public void CorrectFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\correct.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
  
  public void IncorrectFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\incorrect.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
  
  public void FolderFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\folder.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
  
  public void KeyboardFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\keyboard.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
  
  public void MonitorFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\monitor.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
  
  public void CPUFX(){
      try{
         File musicfile = new File("src\\Assets\\sfx\\cpu.wav");
         AudioInputStream audiostream = AudioSystem.getAudioInputStream(musicfile);
         Clip clip = AudioSystem.getClip();
         clip.open(audiostream);
         clip.start();
      }
      catch(Exception e){
          System.out.println(e);
      } 
  }
}
