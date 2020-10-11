package game_snake;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class BarraDeProgresso extends JFrame {
    
    public JProgressBar barra = new JProgressBar();
        
    public BarraDeProgresso(){
        configurarJanela();
        barra.setBounds(40,40,500,50);
        barra.setStringPainted(true);
        barra.setValue(1);
        barra.setMaximum(100); 
        barra.setForeground(Color.GREEN);
        add(barra);
    }
    
    public void configurarJanela(){
        setTitle("Loading");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 170);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void fechar(){
        setVisible(false);
    }
}
