package game_snake;

public class ThreadLoading extends Thread{
    
    BarraDeProgresso bp = new BarraDeProgresso();
    
    @Override
    public void run(){
        while(bp.barra.getValue()<100){
            try {
                Thread.sleep(10);////////////////////////////////Aumentar depois
                bp.barra.setValue(bp.barra.getValue()+1);
            } catch (InterruptedException ex) {
                System.out.print("Erro!!!");
            }
        }
                  
        ThreadCronometro tc = new ThreadCronometro();
        tc.start();
        }  
    }
