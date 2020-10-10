package Threads;

import game_snake.Music;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadCronometro extends Thread{
    
    int musicFundo = 0;
    
    public static int min = 2;
    public static int seg = 0;
    
    public void run(){
        
        Music m = new Music();
        //m.sound.loop();
        for (int i = 180; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            musicFundo++;
            if(i == 2){ 
                m.sound.stop();
                break;
            }
            if(seg == 0 && min > 0) {
                seg = 59;
                min--;
            }else if(min == 0){
                System.out.println("ACABOU");
            }
            seg--;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.print("Erro!!!");
            }
        }
    }
}

