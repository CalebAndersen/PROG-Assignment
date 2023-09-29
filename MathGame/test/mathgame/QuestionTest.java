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
public class QuestionTest {
    
    public QuestionTest() {
    }

    @Test
    public void testGetAnswer() {
        Question q1 = new Question(1, 2, 3, '+');
        assertEquals(5, q1.getAnswer());
        
        Question q2 = new Question(2, 96, 32, '-');
        assertEquals(64, q2.getAnswer());
        
        Question q3 = new Question(3, 23, 4, '*');
        assertEquals(92, q3.getAnswer());
    }

    @Test
    public void testCheckAnswer() {
        Question question = new Question(1, 3, 7, '+');
        assertTrue(question.checkAnswer(10));
        assertFalse(question.checkAnswer(3));
    }
    
}
