package game_snake;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Graphics;

public class GameOver extends JFrame {
    
    Graphics g;
    
    public GameOver(){
        setTitle("GAME OVER");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 170);
        setLocationRelativeTo(null);
        setVisible(true);
        g.setColor(Color.green);
        setFont(new Font("arial", Font.PLAIN, 22));
        g.drawString("GAME OVER", 300, 85);
    }
    
}
