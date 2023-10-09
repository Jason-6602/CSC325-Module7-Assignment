/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human (done)

	// ToDo 2: Fix the resulting errors (done)
    // ToDo 3: Add a field for GPA and create a setter and a getter (done)


    //Default Constructor
    // Use the two parameters from the constructor defined in human and add credits
    public Student(String name, short age, int credits){
        super(name, age);


    }


    //Field for GPA
    private double gpa;

    //Getter Method
    public double getGpa() {
        return gpa;
    }
    //Setter Method
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void setAddress(String address) {
        setName(address);
    }
    @Override
    public String getAddress() {

        return "Farmingdale State College";
    }
	
	// ToDo 4: Add comments to your code
}
