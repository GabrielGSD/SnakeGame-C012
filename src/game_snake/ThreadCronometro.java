package Threads;

public class ThreadCronometro extends Thread{
          
     public void run(){
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Tempo: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            System.out.print("Erro!!!");
            }
        }
    }
}

