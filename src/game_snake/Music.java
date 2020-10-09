package game_snake;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Music {
    
    public void play(){
        URL som = getClass().getResource("soundSnake.wav");
        AudioClip soundSnake = Applet.newAudioClip(som);  
        soundSnake.loop();
    }
    
}
