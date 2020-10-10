package Threads;

import game_snake.Music;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadCronometro extends Thread{
    
    int musicFundo = 0;
    
    public void run(){
        
        Music m = new Music();
        m.sound.play();
        for (int i = 10; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            musicFundo++;
            if(i == 2){ 
                m.sound.stop();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.print("Erro!!!");
            }
        }
    }
}

