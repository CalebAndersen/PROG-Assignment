/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abccollege;

import java.util.ArrayList;
import java.util.Scanner;
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
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        
        int launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                + "\n**********************************"
                + "\nEnter (1) to launch menu or any other key to exit"));
        //Exits the application if the input is "1"
        if(launch != 1)
        {
            Student.ExitStudentApplication();
        }
        int option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                + "\n(1) Capture a new student."
                + "\n(2) Search for a student."
                + "\n(3) Delete a student"
                + "\n(4) Print student report."
                + "\n(5) Exit Application."));
        //Using a while loop to make sure the program only exits when prompted to and not by itself
        while(option != 5)
        {
            //Switch statement that runs different methods based on the option
            switch(option)
            {
                case 1:
                    Student.SaveStudent(students, scanner);
                    launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                    + "\n**********************************"
                    + "\nEnter (1) to launch menu or any other key to exit"));
                if(launch != 1)
                {
                    Student.ExitStudentApplication();
                }
                option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                + "\n(1) Capture a new student."
                + "\n(2) Search for a student."
                + "\n(3) Delete a student"
                + "\n(4) Print student report."
                + "\n(5) Exit Application."));
                    break;
                    
                case 2:
                    System.out.println(Student.SearchStudent(students, scanner));
                    launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                    + "\n**********************************"
                    + "\nEnter (1) to launch menu or any other key to exit"));
                if(launch != 1)
                {
                    Student.ExitStudentApplication();
                }
                option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                + "\n(1) Capture a new student."
                + "\n(2) Search for a student."
                + "\n(3) Delete a student"
                + "\n(4) Print student report."
                + "\n(5) Exit Application."));
                    break;
                    
                case 3:
                    Student.DeleteStudent(students, scanner);
                    launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                    + "\n**********************************"
                    + "\nEnter (1) to launch menu or any other key to exit"));
                    if(launch != 1)
                    {
                        Student.ExitStudentApplication();
                    }
                    option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                    + "\n(1) Capture a new student."
                    + "\n(2) Search for a student."
                    + "\n(3) Delete a student"
                    + "\n(4) Print student report."
                    + "\n(5) Exit Application."));
                    break;
                    
                case 4:
                    Student.StudentReport(students);
                    launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                    + "\n**********************************"
                    + "\nEnter (1) to launch menu or any other key to exit"));
                    if(launch != 1)
                    {
                        Student.ExitStudentApplication();
                    }
                    option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                    + "\n(1) Capture a new student."
                    + "\n(2) Search for a student."
                    + "\n(3) Delete a student"
                    + "\n(4) Print student report."
                    + "\n(5) Exit Application."));
                    break;
                    
                case 5:
                    Student.ExitStudentApplication();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Please enter a valid option");
                    launch = Integer.parseInt(JOptionPane.showInputDialog("STUDENT MANAGEMENT APPLICATION"
                    + "\n**********************************"
                    + "\nEnter (1) to launch menu or any other key to exit"));
                    if(launch != 1)
                    {
                        Student.ExitStudentApplication();
                    }
                    option = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following menu items:"
                    + "\n(1) Capture a new student."
                    + "\n(2) Search for a student."
                    + "\n(3) Delete a student"
                    + "\n(4) Print student report."
                    + "\n(5) Exit Application."));
            }
        }
        //Scanner is closed only at the end of the program
        scanner.close();
    }
}
