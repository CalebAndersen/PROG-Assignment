/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathgame;

import javax.swing.JOptionPane;

/**
 *
 * @author caleb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int difficulty = Integer.parseInt(JOptionPane.showInputDialog("Welcome to maths training! Please set the difficulty you would like:"
                + "\n(1) Easy" + "\n(2) Medium" + "\n(3) Hard"));
        Game game = new Game(difficulty);
        game.playGame();
    }
    
}
