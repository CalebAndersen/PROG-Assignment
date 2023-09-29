/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccollege;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caleb
 */
public class Student {
    int studentId;
    String studentName;
    int studentAge;
    String studentEmail;
    String studentCourse;
    //Constructor used to create a Student object
    public Student(int studentId, String studentName, int studentAge, String studentEmail, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
    //Adds and stores the student into a Student array
    public static void SaveStudent(ArrayList<Student> students, Scanner scanner)
    {
        System.out.println("CAPTURE A NEW STUDENT"
                + "\n*************************************");
        System.out.print("Enter the student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        int age;
        System.out.print("Enter the student age: ");
        do {
            while (!scanner.hasNextInt())
            {
                scanner.next();
                System.out.println("You have entered an incorrect student age!!!");
                System.out.print("Please re-enter the student age >> ");
            }
            age = scanner.nextInt();
            if(age < 16)
            {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.print("Please re-enter the student age >> ");
            }
        } while (age < 16);
        scanner.nextLine();
        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();
        System.out.println("Student details have been successfully saved.");
        Student s = new Student(id,name,age,email,course);
        students.add(s);
    }
    //Retrieves the Student ID
    public int getStudentId() {
        return studentId;
    }
    //Retrieves the Student Name
    public String getStudentName() {
        return studentName;
    }
    //Retrieves the Student Age
    public int getStudentAge() {
        return studentAge;
    }
    //Retrieves the Student Email
    public String getStudentEmail() {
        return studentEmail;
    }
    //Retrieves the Student Course
    public String getStudentCourse() {
        return studentCourse;
    }
    //Searches the array to find a student with an inputted ID
    public static String SearchStudent(ArrayList<Student> students, Scanner scanner)
    {
        System.out.print("Enter the student id to search: ");
        int id = scanner.nextInt();
        String temp = "Student with Student Id: " + id + " was not found!";
        for (int i = 0; i < students.size(); i++) 
        {
            if (students.get(i).getStudentId() == id) 
            {
                temp = "----------------------------------"
                        + "\nSTUDENT ID: " + students.get(i).getStudentId()
                        + "\nSTUDENT NAME: " + students.get(i).getStudentName()
                        + "\nSTUDENT AGE: " + students.get(i).getStudentAge()
                        + "\nSTUDENT EMAIL: " + students.get(i).getStudentEmail()
                        + "\nSTUDENT COURSE: " + students.get(i).getStudentCourse()
                        + "\n----------------------------------";
                break;
            }
        }
        return temp;
    }
    //Retrieves and removes a student from an array with an inputted ID
    public static void DeleteStudent(ArrayList<Student> students, Scanner scanner)
    {
        System.out.print("Enter the student id to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Are you sure you want to "
                + "delete student " + id
                + " from the system? Yes (y) to delete");
        char confirm = scanner.next().charAt(0);
        
        if(confirm == 'y')
        {
            for (int i = 0; i < students.size(); i++) 
            {
                if (students.get(i).getStudentId() == id) 
                {
                    students.remove(i);
                    System.out.println("----------------------------------");
                    System.out.println("Student with Student Id: " + id + " WAS deleted!");
                    System.out.println("----------------------------------");
                    return;
                }
            }
            System.out.println("Student with Student Id " + id + " not found");
        }
    }
    //Prints out every student in an array
    public static void StudentReport(ArrayList<Student> students)
    {
        //Loop to go through every element in the ArrayList and display all of them
        for(int i = 0; i < students.size(); i++)
        {
            System.out.println("STUDENT " + (i + 1));
            System.out.println("----------------------------------------");
            System.out.println("STUDENT ID: " + students.get(i).getStudentId()
                        + "\nSTUDENT NAME: " + students.get(i).getStudentName()
                        + "\nSTUDENT AGE: " + students.get(i).getStudentAge()
                        + "\nSTUDENT EMAIL: " + students.get(i).getStudentEmail()
                        + "\nSTUDENT COURSE: " + students.get(i).getStudentCourse()
                        + "\n----------------------------------");
            
        }
    }
    //Exits the application
    public static void ExitStudentApplication()
    {
        System.exit(0);
    }
}