package game_snake;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class ThreadCronometro extends Thread{
    
    public ThreadCronometro() {

        JFrame frame = new JFrame();
        Screen screen = new Screen();

        frame.add(screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);     

    }
    
    
    public void run(){
               
        Music m = new Music();
        m.sound.loop();
        //new ThreadCronometro(); //////////////////// Chamar o frame
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            
            if(i-1 == 5){ 
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

