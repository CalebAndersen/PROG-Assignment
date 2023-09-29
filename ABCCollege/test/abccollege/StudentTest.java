/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package abccollege;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author caleb
 */
public class StudentTest {
    
    private Scanner scanner;
    private Student student;
    private ArrayList<Student> students;
    int age;

    @Before
    public void setUp() 
    {
        scanner = new Scanner(System.in);
        students = new ArrayList<>();
        student = new Student(1,"Caleb",20,"caleb@gmail.com","Computer Science");
        age = student.getStudentAge();
    }
    
    @Test
    public void testSaveStudent()
    {
        String input = "1\nCaleb\n20\ncaleb@gmail.com\nComputer Science\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        student.SaveStudent(students, scanner);
        assertEquals(1, students.size());
        assertEquals("Caleb", students.get(0).getStudentName());
        assertEquals(20, students.get(0).getStudentAge());
        assertEquals("caleb@gmail.com", students.get(0).getStudentEmail());
        assertEquals("Computer Science", students.get(0).getStudentCourse());
    }
    
    @Test
    public void testSearchStudent() 
    {
        students.add(student);
        int id = 1;
        String input = id + "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        String output = student.SearchStudent(students, scanner);

        assertTrue(output.contains("STUDENT ID: 1"));
        assertTrue(output.contains("STUDENT NAME: Caleb"));
        assertTrue(output.contains("STUDENT AGE: 20"));
        assertTrue(output.contains("STUDENT EMAIL: caleb@gmail.com"));
        assertTrue(output.contains("STUDENT COURSE: Computer Science"));
    }
    
    @Test
    public void TestSearchStudent_StudentNotFound() 
    {
        int id = 9999999;
        String input = id + "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        String search = student.SearchStudent(students, scanner);
        assertEquals("Student with Student Id: 9999999 was not found!", search);
    }
    
     @Test
    public void TestDeleteStudent() 
    {
        students.add(student);
        int id = 1;
        String input = id + "\ny\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        student.DeleteStudent(students, scanner);
        assertEquals(0, students.size());
    }
    
    @Test
    public void TestDeleteStudent_StudentNotFound() 
    {
        int id = 9999;
        String input = id + "\ny\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        student.DeleteStudent(students, scanner);
        assertEquals(0, students.size());
    }
    
    @Test
    public void TestStudentAge_StudentAgeValid() 
    {
        int actual = student.getStudentAge();
        assertEquals(20, age);
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalid() 
    {
        String age = "10";
        int intAge = Integer.parseInt(age);
        Student student = new Student(1, "Caleb", intAge, "caleb@gmail.com", "Computer Science");
        assertTrue(student.getStudentAge() < 16);
    }
    
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter()
    {
        String age = "a";
        int intAge;
        try 
        {
            intAge = Integer.parseInt(age);
        } 
        catch (NumberFormatException e) 
        {
            intAge = -1;
        }
        Student student = new Student(1, "Caleb", intAge, "caleb@gmail.com", "Computer Science");
        assertTrue(student.getStudentAge() < 0);
    }
}
