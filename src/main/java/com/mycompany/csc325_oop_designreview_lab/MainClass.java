/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {


		// ToDo 6: Fix the constructor of the Student class(done)

                // Todo 7: Create two classes for Freshman and Senior (done)

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class (done)
		// ToDo 10: Add a toString method for the Freshman class (done)


                // ToDo 11: Add a toString method for the Senior class(done)

	  // Create some new objects to demonstrate the output
	 Student std1 = new Freshman("James", (short)20, 12);

	 Student std2 = new Senior("John", (short)30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user input and then print the output.
				//OUTPUT - first set the GPA via User input
	 			setGpa(std1);
				setGpa(std2);

				//Make sure to use the to string method to format the desired output format
				System.out.println(std1.toString());
                System.out.println(std2.toString());

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}
	private static void setGpa(Student student) {
	 	//Create Scanner Object
		Scanner scanner = new Scanner(System.in);

		//Prompt for user input
		System.out.print("Enter GPA for " + student.getName() + ": ");
		double gpa = scanner.nextDouble();

		// Set the GPA using the setter method in the Student class
		student.setGpa(gpa);
	}
}

