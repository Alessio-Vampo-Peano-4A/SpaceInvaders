/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author aless
 */
public class Intro extends Space {

    private int Sx;
    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException, IOException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();


        for (i = 100; i >= 10; i -= 1) {
            System.out.println("i: " + i);
            this.paint();
            Thread.sleep(1);
        }

    }

    public void paint() throws IOException {
        addKeyListener(new KeyInputHandler());
        requestFocus();
        BufferedImage alien = ImageIO.read(new File(""));
        BufferedImage ship = ImageIO.read(new File(""));
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        for (int k = 0; k < 400; k += 40) {
            g.drawImage(alien, 2 * 4 + k, 50, 50, 50, null);
        }
        g.drawImage(ship, Sx, 550, 50, 50, null);
        g.setBackground(Color.BLACK);
        g.fillRect(0, 0, 800, 500);
        g.setColor(Color.green);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40 + i));
        g.drawString("Space Invaders", 100 + i, 100 + i);
        g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10 + i));
        g.drawString("          by Alessio Vampo", 110 + i + i, 110 + i + i);
        g.dispose();
        strategy.show();
    }
}
