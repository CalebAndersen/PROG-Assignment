/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathgame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author caleb
 */
public class Game extends Question {
    private static int[] answers = new int[10];
    private static int difficulty;
    private static String[] incorrectAnswers = new String[10];
    
     public Game(int difficulty) {
        super(difficulty,0,0,'+');
        this.difficulty = difficulty;
    }
    //increases numbers based on difficulty
    public static void getNum()
    {
        if(difficulty == 1)
        {
            num1 = (int)(Math.random() * (10 - 1) + 1);
            num2 = (int)(Math.random() * (10 - 1) + 1);
        }
        if(difficulty == 2)
        {
            num1 = (int)(Math.random() * (30 - 1) + 1);
            num2 = (int)(Math.random() * (30 - 1) + 1);
        }
        if(difficulty == 3)
        {
            num1 = (int)(Math.random() * (50 - 1) + 1);
            num2 = (int)(Math.random() * (50 - 1) + 1);
        }
        if(operator == '/')
        {
            num1 = num1 - (num1 % num2);
        }
        
    }
    //Chooses a random operator
    public static void getOperator()
    {
        Random rand = new Random();
        char[] operators = {'+','-','*','/'};
        operator = operators[rand.nextInt(operators.length)];
    }
    //Method that runs the actual game
    public static void playGame()
    {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int incorrectCount = 0;
        getOperator();        
        getNum();
        
        for(int i = 0; i < answers.length; i++)
        {
            System.out.print((i + 1) + ". " + getQuestion()); //Creates the question
            int answer = scanner.nextInt(); //Retrieves the answer from the user
            if(checkAnswer(answer))
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Incorrect!");
                incorrectAnswers[incorrectCount] = (i + 1) + ". " + num1 + " " + operator + " " + num2 + " = " + getAnswer(); //Keeps track of the incorrect answers
                incorrectCount++;
            }
            answers[i] = answer;
            getOperator();        
            getNum();
        }
        System.out.println("You got " + score + "/10 " + "questions correct! Here are the ones you got wrong with their correct answers:");
        System.out.println(""); //Prints an empty line to prepare for the for loop that comes next
        //Prints out all the questions that were incorrect and displays the answer.
        for(int i = 0; i < incorrectCount; i++)
        {
            System.out.println(incorrectAnswers[i]);
        }
        scanner.close();
    }
    //Sets the difficulty
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    
}
