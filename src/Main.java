
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStream;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        JFrame frame = new JFrame("MusicPlayer");
        frame.setContentPane(new MusicPlayer().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setSize(840, 690);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
