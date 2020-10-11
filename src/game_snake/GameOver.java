package game_snake;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameOver extends JFrame {
    
    ImageIcon imagem = new ImageIcon(getClass().getResource("game_over.png"));
    JLabel label = new JLabel(imagem);
    
    public GameOver(){
        
        add(label);
        
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}