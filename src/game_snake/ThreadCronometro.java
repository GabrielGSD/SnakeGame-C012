package game_snake;

import javax.swing.JFrame;

public class ThreadCronometro extends Thread{
    
    
    public static int min = 2;
    public static int seg = 0;
    
    JFrame frame = new JFrame();
    Screen screen = new Screen();
    
    public ThreadCronometro() {

        

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
        for (int i = 180; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            screen.Time(min, seg);
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

