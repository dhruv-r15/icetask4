/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testicetask4;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class TestIceTask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your percentage to receive your grade: ");
        int grade = scanner.nextInt();
        char letterGrade;
        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A';
        } else if (grade >= 80 && grade <= 89) {
            letterGrade = 'B';
        } else if (grade >= 70 && grade <= 79) {
            letterGrade = 'C';
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("The student's letter grade is " + letterGrade + ".");
    }
}

//W3Schools, 2023. [If ... Else]. {https://www.w3schools.com/java/java_conditions.asp} [Accessed 18th April 2023].
//GeeksForGeeks, 2023. [If ... Else]. {https://www.geeksforgeeks.org/java-if-else-statement-with-examples/} [Accessed 18th April 2023].

