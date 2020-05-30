/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Lenovo
 */
public class KeyInputHandler extends KeyAdapter {

    // Viene eseguito quando un tasto e' premuto ma non ancora rilasciato
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        System.out.println("RIGHT");
        Space.rightPressed = true;
        }
        }

    // Viene eseguito quando un tasto e' stato rilasciato
    public void keyReleased(KeyEvent e) {
    }

    // Viene eseguito quando un tasto e' premuto e poi rilasciato
    public void keyTyped(KeyEvent e) {
    }

}
