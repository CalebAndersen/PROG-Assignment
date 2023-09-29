/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathgame;

/**
 *
 * @author caleb
 */
public class Question {
    protected static int difficulty;
    protected static int num1;
    protected static int num2;
    protected static char operator;
    //Constructor used to create a Question object
    public Question(int difficulty, int num1, int num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
    //Creates a question with the values set in the constructor
    public static String getQuestion()
    {
        String question = num1 + " " + operator + " " + num2 + " = ";
        return question;
    }
    //Solves the answer for the question and returns it
    public static int getAnswer()
    {
        int answer = 0;
        if(operator == '+')
        {
            answer = num1 + num2;
        }
        if(operator == '-')
        {
            answer = num1 - num2;
        }
        if(operator == '*')
        {
            answer = num1 * num2;
        }
        if(operator == '/')
        {
            answer = num1 / num2;
        }
        
        return answer;
    }
    //Checks if the answer is correct or incorrect
    public static boolean checkAnswer(int answer)
    {
        boolean correct = false;
        if(answer == getAnswer())
        {
            correct = true;
        }
        return correct;
    }
}
