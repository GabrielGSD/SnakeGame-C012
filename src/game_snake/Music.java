package game_snake;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Music {
    
    public URL som = getClass().getResource("soundSnake.wav");
    public AudioClip sound = Applet.newAudioClip(som);  
    
    public void pararMusica(){
        sound.stop();
    }
}