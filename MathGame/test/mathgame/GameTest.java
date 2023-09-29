/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mathgame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caleb
 */
public class GameTest {
    
    public GameTest() {
    } 
    private Game game;

    @Before
    public void setUp() {
        game = new Game(1);
    }

    @Test
    public void testGetNum() {
        game.getNum();
        int num1 = game.num1;
        int num2 = game.num2;
        assertTrue(num1 >= 1 && num1 <= 10);
        assertTrue(num2 >= 1 && num2 <= 10);
    }

    @Test
    public void testGetOperator() {
        game.getOperator();
        char operator = game.operator;
        assertTrue(operator == '+' || operator == '-' || operator == '/' || operator == '*');
    }
    
    @Test
    public void testCheckAnswer() {
        game.getNum();
        int correct = game.getAnswer();
        assertTrue(game.checkAnswer(correct));
        assertFalse(game.checkAnswer(correct + 1));
    }
    
}
