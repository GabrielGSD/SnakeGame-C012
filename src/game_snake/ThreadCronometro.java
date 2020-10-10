package Threads;

import game_snake.Music;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadCronometro extends Thread{
    
    int musicFundo = 0;
    
    public void run(){
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            musicFundo++;
            
            if(musicFundo == 1 || musicFundo == 4){
                Music m = new Music();
                
                if(musicFundo == 1){
                    m.sound.play();
                    
                }else if(musicFundo == 4){
                    
                    m.sound.stop();
                    break;
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.print("Erro!!!");
            }
        }
    }
}

